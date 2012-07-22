package org.xtest.ui.editor;

import java.util.Iterator;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.ui.texteditor.MarkerAnnotation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.MarkerTypes;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.xtest.preferences.PerFilePreferenceProvider;
import org.xtest.preferences.RuntimePref;
import org.xtest.xTest.Body;

import com.google.common.collect.Iterators;

/**
 * Custom {@link AnnotationIssueProcessor} for Xtest to hook into to hook in expensive test
 * annotation clearing
 * 
 * @author Michael Barry
 */
public class XtestAnnotationProcessor extends AnnotationIssueProcessor {

    private final IAnnotationModel fAnnotaionModel;
    private final PerFilePreferenceProvider fPreferences;
    private boolean fromValidate;

    private final IXtextDocument fXtextDocument;

    public XtestAnnotationProcessor(IXtextDocument xtextDocument, IAnnotationModel annotationModel,
            IssueResolutionProvider issueResolutionProvider, PerFilePreferenceProvider preferences) {
        super(xtextDocument, annotationModel, issueResolutionProvider);
        fAnnotaionModel = annotationModel;
        fXtextDocument = xtextDocument;
        fPreferences = preferences;
        fromValidate = false;
    }

    /**
     * Notification that this is inside a reconcile event
     * 
     * @param value
     *            True if inside a reconcile event, false otherwise
     */
    public void fromValidate(boolean value) {
        fromValidate = value;
    }

    @Override
    protected void updateMarkerAnnotations(IProgressMonitor monitor) {
        if (monitor.isCanceled()) {
            return;
        }

        Iterator<MarkerAnnotation> annotationIterator = Iterators.filter(
                fAnnotaionModel.getAnnotationIterator(), MarkerAnnotation.class);

        // every markerAnnotation produced by fast validation can be marked as deleted.
        // If its predicate still holds, the validation annotation will be covered anyway.
        while (annotationIterator.hasNext() && !monitor.isCanceled()) {
            final MarkerAnnotation annotation = annotationIterator.next();
            if (!annotation.isMarkedDeleted()) {
                try {
                    if (isRelevantAnnotationType(annotation.getType())) {
                        IMarker marker = annotation.getMarker();
                        boolean markAsDeleted = applies(marker);
                        if (markAsDeleted) {
                            annotation.markDeleted(true);
                            queueOrFireAnnotationChangedEvent(annotation);
                        }
                    }
                } catch (CoreException e) {
                    // marker type cannot be resolved - keep state of annotation
                }
            }
        }
        fireQueuedEvents();
    }

    private boolean applies(IMarker marker) throws CoreException {
        // Only remove expensive annotations if this is from a reconcile event and run while editing
        // is enabled
        Boolean removeExpensive = fromValidate
                && fXtextDocument.readOnly(new IUnitOfWork<Boolean, XtextResource>() {
                    @Override
                    public Boolean exec(XtextResource resource) throws Exception {
                        Boolean result = false;
                        if (resource != null && resource.getContents().size() > 0
                                && resource.getContents().get(0) instanceof Body) {
                            Body body = (Body) resource.getContents().get(0);
                            result = fPreferences.get(body, RuntimePref.RUN_WHILE_EDITING);
                        }
                        return result;
                    }
                });
        return removeExpensive && marker.isSubtypeOf(MarkerTypes.EXPENSIVE_VALIDATION)
                || marker.isSubtypeOf(MarkerTypes.FAST_VALIDATION);
    }
}
