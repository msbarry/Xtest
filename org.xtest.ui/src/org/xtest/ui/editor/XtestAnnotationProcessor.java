package org.xtest.ui.editor;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.text.Position;
import org.eclipse.jface.text.source.Annotation;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.ui.texteditor.MarkerAnnotation;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.MarkerTypes;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionProvider;
import org.eclipse.xtext.ui.editor.validation.AnnotationIssueProcessor;
import org.eclipse.xtext.ui.editor.validation.XtextAnnotation;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.Issue;
import org.xtest.preferences.PerFilePreferenceProvider;
import org.xtest.preferences.RuntimePref;
import org.xtest.ui.mediator.ValidationFinishedEvent;
import org.xtest.xTest.Body;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.eventbus.Subscribe;

/**
 * Custom {@link AnnotationIssueProcessor} for Xtest to hook into to hook in expensive test
 * annotation clearing
 * 
 * @author Michael Barry
 */
public class XtestAnnotationProcessor extends AnnotationIssueProcessor {

    private final AtomicBoolean clearLiveEdits;
    private final AtomicBoolean clearOnSaveEdits;
    private final IAnnotationModel fAnnotationModel;
    private final PerFilePreferenceProvider fPreferences;

    private final XtextDocument fXtextDocument;

    public XtestAnnotationProcessor(IXtextDocument xtextDocument, IAnnotationModel annotationModel,
            IssueResolutionProvider issueResolutionProvider, PerFilePreferenceProvider preferences) {
        super(xtextDocument, annotationModel, issueResolutionProvider);
        fAnnotationModel = annotationModel;
        fXtextDocument = (XtextDocument) xtextDocument;
        fPreferences = preferences;
        clearLiveEdits = new AtomicBoolean(false);
        clearOnSaveEdits = new AtomicBoolean(false);
    }

    /**
     * Notify this annotation processor that validation has finished in order to clear old markers
     * on next update
     * 
     * @param e
     *            Validation finished event
     */
    @Subscribe
    public void finish(ValidationFinishedEvent e) {
        CheckMode checkMode = e.getCheckMode();
        if (e.getUri().equals(fXtextDocument.getResourceURI()) && checkMode != null
                && checkMode.shouldCheck(CheckType.EXPENSIVE)) {
            // should check fast means this was a reconcile
            clearLiveEdits.getAndSet(checkMode.shouldCheck(CheckType.FAST));
            // should not check fast means this was an on-save validation
            clearOnSaveEdits.getAndSet(!checkMode.shouldCheck(CheckType.FAST));
        }
    }

    @Override
    protected void updateMarkerAnnotations(IProgressMonitor monitor) {
        if (monitor.isCanceled()) {
            return;
        }

        if (clearOnSaveEdits.getAndSet(false)) {
            // XtextAnnotations are already cleared during a reconcile validation, so we just need
            // to clear expensive (test result) XtextAnnotations after an on-save validation as well
            removeExpensiveXtextAnnotations(monitor);
        }
        if (runWhileEdit() && clearLiveEdits.getAndSet(false)) {
            // Reconcile validations already clear FAST marker annotations because that is all Xtext
            // normally does for reconciles. Xtest needs to add clearing expensive (test result)
            // markers on a reconcile, only if run-while-edit is enabled
            removeExpensiveAndFastMarkerAnnotations(monitor);
        }

        super.updateMarkerAnnotations(monitor);
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
                            && marker.isSubtypeOf(MarkerTypes.EXPENSIVE_VALIDATION)) {
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
        List<Annotation> issues = Lists.newArrayList();
        Iterator<XtextAnnotation> xtext = Iterators.filter(
                fAnnotationModel.getAnnotationIterator(), XtextAnnotation.class);
        while (xtext.hasNext() && !monitor.isCanceled()) {
            final XtextAnnotation annotation = xtext.next();
            Issue issue = annotation.getIssue();
            if (!annotation.isMarkedDeleted() && isRelevantAnnotationType(annotation.getType())
                    && issue.getType() == CheckType.EXPENSIVE) {
                issues.add(annotation);
            }
        }
        updateAnnotations(monitor, issues, Maps.<Annotation, Position> newHashMap());
    }

    private Boolean runWhileEdit() {
        return fXtextDocument.readOnly(new IUnitOfWork<Boolean, XtextResource>() {
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
    }
}
