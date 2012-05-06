package org.xtest.ui.runner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.xtest.runner.DependencyAcceptor;
import org.xtest.runner.ITestRunner;
import org.xtest.runner.ITestType;
import org.xtest.runner.TestResult;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.inject.Inject;
import com.google.inject.Provider;

public class XtestRunnerType implements ITestType {
    @Inject
    private Provider<Runner> runnerProvider;

    @Override
    public org.xtest.runner.ITestRunner provideNewRunner() {
        return runnerProvider.get();
    }

    @Override
    public boolean supports(IFile file) {
        String fileExtension = file.getFileExtension();
        return !file.isDerived() && fileExtension != null
                && fileExtension.equalsIgnoreCase("xtest");
    }

    public static class Runner implements ITestRunner {
        @Inject
        private IStorage2UriMapper mapper;
        @Inject
        private IResourceSetProvider provider;
        private final Cache<IProject, ResourceSet> resourceSetProvider = CacheBuilder.newBuilder()
                .build(new CacheLoader<IProject, ResourceSet>() {
                    @Override
                    public ResourceSet load(IProject key) throws Exception {
                        return provider.get(key);
                    }
                });
        @Inject
        private TestRunner validator;

        @Override
        public TestResult run(IFile file, SubMonitor convert, DependencyAcceptor acceptor) {
            URI uri = mapper.getUri(file);
            TestResult runTests = TestResult.FAIL;
            if (uri != null) {
                ResourceSet resourceSet = resourceSetProvider.getUnchecked(file.getProject());
                Resource resource = resourceSet.getResource(uri, true);
                runTests = validator.runTests(file, resource, acceptor, convert.newChild(1));
            }
            return runTests;
        }

    }
}
