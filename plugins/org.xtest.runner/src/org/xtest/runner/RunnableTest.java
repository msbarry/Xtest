package org.xtest.runner;

import java.net.URI;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.SubMonitor;
import org.xtest.runner.external.DependencyAcceptor;
import org.xtest.runner.external.ITestRunner;
import org.xtest.runner.external.ITestType;
import org.xtest.runner.external.TestResult;
import org.xtest.runner.external.TestState;
import org.xtest.runner.util.SerializationUtils;
import org.xtest.runner.util.URIUtil;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.cache.Cache;
import com.google.common.collect.ComparisonChain;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * Wrapper for a test file supported by a client contribution to the testType extension point
 * 
 * The lifetime of this class is from workspace change to test run, and it is discarded after the
 * test is run.
 * 
 * @author Michael Barry
 */
public class RunnableTest implements Comparable<RunnableTest> {
    private static final QualifiedName affectedByKey = new QualifiedName("org.xtest", "xaffectedBy");
    private static final QualifiedName durationKey = new QualifiedName("org.xtest", "xduration");
    private static final Logger logger = Logger.getLogger(RunnableTest.class);
    private static final QualifiedName numAffectedByKey = new QualifiedName("org.xtest",
            "xnumAffectedBy");
    private static final QualifiedName pendingKey = new QualifiedName("org.xtest", "pending");
    private static final QualifiedName resultKey = new QualifiedName("org.xtest", "xresult");
    private final Optional<BloomFilter<String>> dependencies;
    private final Optional<Long> duration;
    private final IFile fFile;
    private final ITestType fTestType;
    private final Optional<Long> numDependencies;
    private final Optional<String> pending;
    private final TestResult result;

    /**
     * Construct a new runnable test for the test file and test type provided
     * 
     * @param file
     *            The file with tests to run
     * @param testType
     *            The contribution to the testType extension point that can handle running tests in
     *            this file
     */
    public RunnableTest(IFile file, ITestType testType) {
        fFile = file;
        fTestType = testType;
        dependencies = SerializationUtils.fromString(get(affectedByKey));
        duration = getLong(durationKey);
        numDependencies = getLong(numAffectedByKey);
        Optional<String> optional = get(resultKey);
        result = SerializationUtils.<TestResult> fromString(optional).or(TestResult.notRun());
        pending = get(pendingKey);
    }

    /**
     * Clear test results for this test
     */
    public void clean() {
        clear(resultKey);
    }

    @Override
    public int compareTo(RunnableTest o) {
        // Run failures, then not run, then passes
        // Then sort by fastest first
        return ComparisonChain.start().compare(result.getOrder(), o.result.getOrder())
                .compare(duration.or(0L), o.duration.or(0L)).result();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        RunnableTest other = (RunnableTest) obj;
        return Objects.equal(fFile, other.fFile);
    }

    /**
     * Returns the {@link IFile} that this wraps
     * 
     * @return The {@link IFile} that this wraps
     */
    public IFile getFile() {
        return fFile;
    }

    /**
     * Returns the name of this test file
     * 
     * @return The name of this test file
     */
    public String getName() {
        String name = fFile.getName();
        return name;
    }

    /**
     * Returns the state of this test
     * 
     * @return pass, fail, or not run;
     */
    public TestResult getState() {
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fFile);
    }

    /**
     * Returns true if this test has run before, false if not
     * 
     * @return true if this test has run before, false if not
     */
    public boolean hasRun() {
        return result.getState() != TestState.NOT_RUN;
    }

    /**
     * Runs the test
     * 
     * @param convert
     *            Progress monitor
     * @param runnerCache
     *            {@link Cache} of runners for each test type
     * @return The result of the test
     */
    public TestResult invoke(SubMonitor convert, Cache<ITestType, ITestRunner> runnerCache) {
        TestResult result = TestResult.notRun();
        if (fFile.exists()) {
            logger.debug("Start  " + getName());
            long start = System.nanoTime();
            Acceptor acceptor = new Acceptor(dependencies, numDependencies);
            ITestRunner testRunner = runnerCache.getUnchecked(fTestType);
            result = testRunner.run(fFile, convert, acceptor);
            long end = System.nanoTime();
            if (logger.isDebugEnabled()) {
                logger.debug("Finish " + getName() + " " + acceptor.dependencies + " dependencies "
                        + TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS) + " ms");
            }
            storeResultsPersistently(result, acceptor, end - start);
        } else {
            logger.info("Tried to run " + getName() + " but it didn't exist");
        }
        return result;
    }

    /**
     * Returns true if this test file is affected by the file provided
     * 
     * @param delta
     *            The file that has changed
     * @return True if {@code delta} is a dependency of this test
     */
    public boolean isAffectedBy(IFile delta) {
        boolean result = false;
        if (delta.equals(fFile)) {
            // Changes to a test affect that test
            result = true;
        } else if (dependencies.isPresent()) {
            URI uri = URIUtil.getURIForFile(delta);
            String name = URIUtil.getStringFromURI(uri);
            if (name != null) {
                BloomFilter<String> bloomFilter = dependencies.get();
                result = bloomFilter.mightContain(name);
            }
        }
        return result;
    }

    /**
     * Returns true if this test has been placed on a test-run queue but not run yet
     * 
     * @return true if this test has been placed on a test-run queue but not run yet, false if not
     */
    public boolean isPending() {
        return pending.isPresent();
    }

    /**
     * Persistently mark that this test file has been scheduled
     */
    public void setPending() {
        put(pendingKey, Optional.of(""));
    }

    @Override
    public String toString() {
        return getName();
    }

    private void clear(QualifiedName pendingkey2) {
        put(pendingkey2, Optional.<String> absent());
    }

    private Optional<String> get(QualifiedName key) {
        Optional<String> result = Optional.absent();
        try {
            String persistentProperty = fFile.getPersistentProperty(key);
            result = Optional.fromNullable(persistentProperty);
        } catch (CoreException e) {
        }
        return result;
    }

    private Optional<Long> getLong(QualifiedName key) {
        Optional<String> durationString = get(key);
        Optional<Long> result;
        result = SerializationUtils.fromString(durationString);
        return result;
    }

    private void put(QualifiedName key, Optional<String> string) {
        try {
            // null clears property
            fFile.setPersistentProperty(key, string.orNull());
        } catch (CoreException e) {
        }
    }

    private void setDependencies(BloomFilter<? super String> filter) {
        Optional<String> string = SerializationUtils.toString(filter);
        put(affectedByKey, string);
    }

    private void storeResultsPersistently(TestResult result, Acceptor dependencies, long duration) {
        setDependencies(dependencies.filter);
        put(durationKey, SerializationUtils.toString(duration));
        put(numAffectedByKey, SerializationUtils.toString(dependencies.dependencies));
        put(resultKey, SerializationUtils.toString(result));
        clear(pendingKey);
    }

    private static class Acceptor implements DependencyAcceptor {
        private long dependencies = 0L;
        private final BloomFilter<? super String> filter;

        public Acceptor(Optional<BloomFilter<String>> other, Optional<Long> numExpected) {
            dependencies = 0L;
            int expectedInsertions = (int) (numExpected.isPresent() ? numExpected.get() : 100);
            filter = BloomFilter.create(Funnels.stringFunnel(), Math.max(100, expectedInsertions));
        }

        @Override
        public void accept(URI dependency) {
            String value = URIUtil.getStringFromURI(dependency);
            if (dependency != null && !filter.mightContain(value)) {
                dependencies++;
                filter.put(value);
            }
        }
    }
}
