package org.xtest.runner;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

public class TestsProvider {
    @Inject
    private Extensions extensions;

    public Set<RunnableTest> getTestsFromDeltas(Set<IFile> deltas) {
        Set<RunnableTest> result = Sets.newHashSet();
        for (RunnableTest test : getAllTests()) {
            if (!test.hasRun() || test.isPending()) {
                // Always re-run failing or unexecuted tests
                result.add(test);
            } else {
                for (IFile delta : deltas) {
                    if (test.isAffectedBy(delta)) {
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
