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
import org.xtest.preferences.PerFilePreferenceProvider;
import org.xtest.preferences.RuntimePref;
import org.xtest.runner.external.DependencyAcceptor;
import org.xtest.runner.external.TestResult;
import org.xtest.ui.editor.SpecialResourceValidator;
import org.xtest.ui.resource.XtestDependencyAcceptingResource;
import org.xtest.xTest.Body;

import com.google.inject.Inject;

/**
 * Runs Xtest files and adds error markers to the file for failed tests
 * 
 * @author Michael Barry
 */
public class TestRunner extends DefaultResourceUIValidatorExtension {
    @Inject
    private PerFilePreferenceProvider prefProvider;

    @Inject
    private SpecialResourceValidator resourceValidator;

    /**
     * Run an xtest file
     * 
     * @param file
     *            The xtest file to run
     * @param resource
     *            The EMF resource associated with that file
     * @param acceptor
     *            The dependency acceptor
     * @param monitor
     *            The progress monitor
     * @return The test result, either pass or fail
     */
    public TestResult runTests(IFile file, Resource resource, DependencyAcceptor acceptor,
            IProgressMonitor monitor) {
        TestResult result = TestResult.NOT_RUN;
        SubMonitor subMonitor = SubMonitor.convert(monitor, 1);
        try {
            Body body = null;
            if (resource instanceof XtestDependencyAcceptingResource) {
                XtestDependencyAcceptingResource resource2 = (XtestDependencyAcceptingResource) resource;
                resource2.setAcceptor(acceptor);
                body = (Body) resource2.getContents().get(0);
            }
            if (body == null || prefProvider.get(body, RuntimePref.RUN_ON_SAVE)) {
                List<Issue> list = resourceValidator.validate(resource, CheckMode.EXPENSIVE_ONLY,
                        getCancelIndicator(subMonitor));
                if (subMonitor.isCanceled()) {
                    throw new OperationCanceledException();
                }
                subMonitor.worked(1);
                deleteMarkers(file, CheckMode.EXPENSIVE_ONLY, subMonitor);
                if (file.findMaxProblemSeverity(null, true, 0) == IMarker.SEVERITY_ERROR) {
                    // don't bother running tests because there is already an error
                    // lets us report failure to user quicker
                } else {
                    createMarkers(file, list, subMonitor);
                }
                // Any errors? test failed!
                result = file.findMaxProblemSeverity(null, true, 0) == IMarker.SEVERITY_ERROR ? TestResult.FAIL
                        : TestResult.PASS;
            }
        } catch (CoreException e) {
        }

        return result;
    }
}
