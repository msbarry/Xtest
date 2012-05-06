package org.xtest.ui.runner;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ui.validation.DefaultResourceUIValidatorExtension;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.Issue;
import org.xtest.runner.DependencyAcceptor;
import org.xtest.runner.TestResult;
import org.xtest.ui.editor.SpecialResourceValidator;
import org.xtest.ui.resource.XtestResource;

import com.google.inject.Inject;

public class TestRunner extends DefaultResourceUIValidatorExtension {
    @Inject
    private SpecialResourceValidator resourceValidator;

    public TestResult runTests(IFile file, Resource resource, DependencyAcceptor acceptor,
            IProgressMonitor monitor) {
        TestResult result = TestResult.FAIL;
        SubMonitor subMonitor = SubMonitor.convert(monitor, 1);
        try {
            if (resource instanceof XtestResource) {
                ((XtestResource) resource).setAcceptor(acceptor);
            }
            List<Issue> list = resourceValidator.validate(resource, CheckMode.EXPENSIVE_ONLY,
                    getCancelIndicator(subMonitor));
            if (subMonitor.isCanceled()) {
                throw new OperationCanceledException();
            }
            subMonitor.worked(1);
            deleteMarkers(file, CheckMode.EXPENSIVE_ONLY, subMonitor);
            createMarkers(file, list, subMonitor);
            // Any errors? test failed!
            result = file.findMaxProblemSeverity(null, true, 0) == IMarker.SEVERITY_ERROR ? TestResult.FAIL
                    : TestResult.PASS;
        } catch (CoreException e) {
        }

        return result;
    }

}
