package org.xtest.ui.editor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.validation.ValidationJob;
import org.eclipse.xtext.validation.CheckMode;
import org.xtest.preferences.PerFilePreferenceProvider;

import com.google.inject.Inject;

/**
 * Custom Xtest document provider for Xtest to hook into for customizing the {@link ValidationJob}
 * 
 * @author Michael Barry
 */
public class XtestDocumentProvider extends XtextDocumentProvider {
    @Inject
    private IssueResolutionProvider issueResolutionProvider;
    @Inject
    private PerFilePreferenceProvider prefProvider;
    @Inject
    private SpecialResourceValidator resourceValidator;

    @Override
    protected ElementInfo createElementInfo(Object element) throws CoreException {
        final ElementInfo info = super.createElementInfo(element);
        XtextDocument doc = (XtextDocument) info.fDocument;
        if (info.fModel != null) {
            final XtestAnnotationProcessor annotationIssueProcessor = new XtestAnnotationProcessor(
                    doc, info.fModel, issueResolutionProvider, prefProvider);

            // Custom validation job to notify the annotation issue processor when an annotation
            // change comes from a reconcile
            ValidationJob job = new ValidationJob(resourceValidator, doc, annotationIssueProcessor,
                    CheckMode.FAST_ONLY) {
                @Override
                protected IStatus run(IProgressMonitor monitor) {
                    annotationIssueProcessor.fromValidate(true);
                    try {
                        IStatus run = super.run(monitor);
                        return run;
                    } finally {
                        annotationIssueProcessor.fromValidate(false);
                    }
                }
            };
            doc.setValidationJob(job);
        }
        return info;
    }
}
