package org.xtest.runner;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xtest.runner.external.ITestType;
import org.xtest.runner.external.TestResult;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

/**
 * Provider for tests to run based on client contributions to the testType extension point
 * 
 * @author Michael Barry
 */
public class TestsProvider {
    @Inject
    private Extensions extensions;
    private final Logger logger = LoggerFactory.getLogger(TestsProvider.class);

    /**
     * Return tests that depend on the deltas provided
     * 
     * @param deltas
     *            The list of changed files
     * @return the set of tests that depend on {@code deltas}
     */
    public Set<RunnableTest> getTestsFromDeltas(Set<IFile> deltas) {
        Set<RunnableTest> result = Sets.newHashSet();
        for (RunnableTest test : getAllTests()) {
            if (!test.hasRun()) {
                // Always re-run failing or unexecuted tests
                result.add(test);
                logger.debug("Scheduling {} because it has not run before", test.getName());
            } else if (test.isPending()) {
                result.add(test);
                logger.debug("Scheduling {} because it was pending", test.getName());
            } else if (TestResult.FAIL == test.getState()) {
                result.add(test);
                logger.debug("Scheduling {} because it is failing", test.getName());
            } else {
                for (IFile delta : deltas) {
                    if (test.isAffectedBy(delta)) {
                        logger.debug("Scheduling {} because dependency changed: {}",
                                test.getName(), delta.getName());
                        result.add(test);
                        break;
                    }
                }
            }
        }
        return result;
    }

    private Set<RunnableTest> getAllTests() {
        final Set<RunnableTest> tests = Sets.newHashSet();
        try {
            ResourcesPlugin.getWorkspace().getRoot().accept(new IResourceVisitor() {
                @Override
                public boolean visit(IResource resource) throws CoreException {
                    if (resource instanceof IFile) {
                        IFile file = (IFile) resource;
                        for (ITestType testType : extensions.getTestTypesFor(file)) {
                            tests.add(new RunnableTest(file, testType));
                        }
                    }
                    return true;
                }
            });
        } catch (CoreException e) {
        }
        return tests;
    }
}
