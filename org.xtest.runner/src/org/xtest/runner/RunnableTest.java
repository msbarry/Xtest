package org.xtest.runner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.QualifiedName;
import org.eclipse.core.runtime.SubMonitor;
import org.xtest.runner.util.SerializationUtils;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.cache.LoadingCache;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import com.google.common.primitives.Longs;

/**
 * The lifetime of this class is from workspace change to test run, and it is discarded after the
 * test is run.
 * 
 * @author Michael Barry
 */
public class RunnableTest implements Comparable<RunnableTest> {

    private static final QualifiedName affectedByKey = new QualifiedName("org.xtest", "xaffectedBy");
    private static final QualifiedName durationKey = new QualifiedName("org.xtest", "xduration");
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
    private final Optional<TestResult> result;

    public RunnableTest(IFile file, ITestType testType) {
        fFile = file;
        fTestType = testType;
        dependencies = SerializationUtils.fromString(get(affectedByKey));
        duration = getLong(durationKey);
        numDependencies = getLong(numAffectedByKey);
        Optional<String> optional = get(resultKey);
        result = SerializationUtils.fromString(optional);
        pending = get(pendingKey);
    }

    @Override
    public int compareTo(RunnableTest o) {
        return Longs.compare(duration.or(0L), o.duration.or(0L));
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

    public String getName() {
        String name = fFile.getName();
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(fFile);
    }

    public boolean hasRun() {
        return result.isPresent();
    }

    public void invoke(SubMonitor convert, LoadingCache<ITestType, ITestRunner> runnerCache) {
        long start = System.nanoTime();
        Acceptor acceptor = new Acceptor(dependencies, numDependencies);
        ITestRunner testRunner = runnerCache.getUnchecked(fTestType);
        TestResult result = testRunner.run(fFile, convert, acceptor);
        long end = System.nanoTime();
        storeResultsPersistently(result, acceptor, end - start);
    }

    public boolean isAffectedBy(IFile delta) {
        boolean result = false;
        if (delta.equals(fFile)) {
            // Changes to a test affect that test
            result = true;
        } else if (dependencies.isPresent()) {
            String string = delta.getLocationURI().toString();
            BloomFilter<String> bloomFilter = dependencies.get();
            result = bloomFilter.mightContain(string);
        }
        return result;
    }

    public boolean isPending() {
        return pending.isPresent();
    }

    public void setPending() {
        put(pendingKey, Optional.of(""));
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
        System.err.println("Num affected: " + dependencies.dependencies);
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
        public void accept(String dependency) {
            dependencies++;
            if (dependency != null) {
                filter.put(dependency);
            }
        }
    }
}
