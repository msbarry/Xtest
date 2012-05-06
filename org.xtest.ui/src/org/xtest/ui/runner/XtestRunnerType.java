package org.xtest.ui.runner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;
import org.xtest.runner.DependencyAcceptor;
import org.xtest.runner.ITestType;
import org.xtest.runner.TestResult;

import com.google.inject.Inject;

public class XtestRunnerType implements ITestType {
    @Inject
    private IStorage2UriMapper mapper;
    @Inject
    private IResourceSetProvider resourceSetProvider;
    @Inject
    private TestRunner validator;

    @Override
    public TestResult run(IFile file, SubMonitor convert, DependencyAcceptor acceptor) {
        URI uri = mapper.getUri(file);
        TestResult runTests = TestResult.FAIL;
        // TODO don't instantiate new resource set each time during batch run...
        if (uri != null) {
            ResourceSet resourceSet = resourceSetProvider.get(file.getProject());
            Resource resource = resourceSet.getResource(uri, true);
            runTests = validator.runTests(file, resource, acceptor, convert.newChild(1));
        }
        return runTests;
    }

    @Override
    public boolean supports(IFile file) {
        String fileExtension = file.getFileExtension();
        return !file.isDerived() && fileExtension != null
                && fileExtension.equalsIgnoreCase("xtest");
    }
}
