package org.xtest.ui.editor;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;
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
            AnnotationIssueProcessor annotationIssueProcessor = new XtestAnnotationProcessor(doc,
                    info.fModel, issueResolutionProvider, prefProvider);
            ValidationJob job = new ValidationJob(resourceValidator, doc, annotationIssueProcessor,
                    CheckMode.FAST_ONLY);
            doc.setValidationJob(job);
        }
        return info;
    }
}
