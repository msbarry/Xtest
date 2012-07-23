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
import org.eclipse.xtext.ui.editor.validation.XtextAnnotation;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.Issue;
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

    private final IAnnotationModel fAnnotationModel;
    private final PerFilePreferenceProvider fPreferences;
    private boolean fromValidate;

    private final IXtextDocument fXtextDocument;

    public XtestAnnotationProcessor(IXtextDocument xtextDocument, IAnnotationModel annotationModel,
            IssueResolutionProvider issueResolutionProvider, PerFilePreferenceProvider preferences) {
        super(xtextDocument, annotationModel, issueResolutionProvider);
        fAnnotationModel = annotationModel;
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

        removeExpensiveXtextAnnotations(monitor);
        removeExpensiveAndFastMarkerAnnotations(monitor);
        fireQueuedEvents();
    }

    private boolean fastOrRemovableExpensive(IMarker marker) throws CoreException {
        boolean expensive = marker.isSubtypeOf(MarkerTypes.EXPENSIVE_VALIDATION);
        boolean fast = marker.isSubtypeOf(MarkerTypes.FAST_VALIDATION);
        // Only remove expensive annotations if this is from a reconcile event and run while editing
        // is enabled
        return fast || expensive && fromValidate && shouldRemoveExpensive();
    }

    private void removeExpensiveAndFastMarkerAnnotations(IProgressMonitor monitor) {
        // every markerAnnotation produced by fast validation can be marked as deleted.
        // If its predicate still holds, the validation annotation will be covered anyway.
        Iterator<MarkerAnnotation> annotationIterator = Iterators.filter(
                fAnnotationModel.getAnnotationIterator(), MarkerAnnotation.class);
        while (annotationIterator.hasNext() && !monitor.isCanceled()) {
            final MarkerAnnotation annotation = annotationIterator.next();
            if (!annotation.isMarkedDeleted()) {
                try {
                    IMarker marker = annotation.getMarker();
                    if (isRelevantAnnotationType(annotation.getType())
                            && fastOrRemovableExpensive(marker)) {
                        annotation.markDeleted(true);
                        queueOrFireAnnotationChangedEvent(annotation);
                    }
                } catch (CoreException e) {
                    // marker type cannot be resolved - keep state of annotation
                }
            }
        }
    }

    private void removeExpensiveXtextAnnotations(IProgressMonitor monitor) {
        Iterator<XtextAnnotation> xtext = Iterators.filter(
                fAnnotationModel.getAnnotationIterator(), XtextAnnotation.class);
        while (xtext.hasNext() && !monitor.isCanceled()) {
            final XtextAnnotation annotation = xtext.next();
            Issue issue = annotation.getIssue();
            if (!annotation.isMarkedDeleted() && isRelevantAnnotationType(annotation.getType())
                    && issue.getType() == CheckType.EXPENSIVE && shouldRemoveExpensive()) {
                fAnnotationModel.removeAnnotation(annotation);
            }
        }
    }

    private Boolean shouldRemoveExpensive() {
        Boolean removeExpensive = fXtextDocument
                .readOnly(new IUnitOfWork<Boolean, XtextResource>() {
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
        return removeExpensive;
    }
}
