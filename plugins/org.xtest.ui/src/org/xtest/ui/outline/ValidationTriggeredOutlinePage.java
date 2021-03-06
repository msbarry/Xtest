package org.xtest.ui.outline;

import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.text.source.IAnnotationModel;
import org.eclipse.jface.text.source.IAnnotationModelListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.ui.editor.IXtextEditorAware;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.xtest.ui.mediator.ValidationFinishedEvent;
import org.xtest.ui.mediator.ValidationStartedEvent;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

/**
 * Custom outline page that listens on validation job start/finish events to trigger refreshing the
 * outline, rather than document modification events
 * 
 * @author Michael Barry
 */
public class ValidationTriggeredOutlinePage extends OutlinePage implements IXtextEditorAware,
        IAnnotationModelListener {
    private IAnnotationModel annotationModel;
    @Inject
    private EventBus eventBus;

    @Override
    public void createControl(Composite parent) {
        eventBus.register(this);
        super.createControl(parent);
        showValidationStarted();
    }

    @Override
    public void dispose() {
        super.dispose();
        eventBus.unregister(this);
        if (annotationModel != null) {
            annotationModel.removeAnnotationModelListener(this);
        }
    }

    @Override
    public void modelChanged(IAnnotationModel model) {
        showValidationFinished();
    }

    @Override
    @Deprecated
    public void scheduleRefresh() {
        // Disable super's scheduleRefresh
    }

    @Override
    public void setEditor(XtextEditor editor) {
        XtestOutlineRefreshJob refreshJob = (XtestOutlineRefreshJob) getRefreshJob();
        refreshJob.setOutlinePage(this);
        refreshJob.schedule();
        IAnnotationModel model = editor.getInternalSourceViewer().getAnnotationModel();
        if (editor.getInternalSourceViewer() != null
                && editor.getInternalSourceViewer().getAnnotationModel() != null) {
            model.addAnnotationModelListener(this);
            annotationModel = model;
            ((XTestOutlineTreeProvider) getTreeProvider()).setAnnotationModel(annotationModel);
        }
    }

    /**
     * Invoked by event bus when validation finished event is published
     * 
     * @param event
     *            The validation finished event
     */
    @Subscribe
    public void validationFinished(ValidationFinishedEvent event) {
        if (event.getUri().equals(getUri())) {
            showValidationFinished();
        }
    }

    /**
     * Invoked by event bus when validation started event is published
     * 
     * @param event
     *            The validation started event
     */
    @Subscribe
    public void validationStarted(ValidationStartedEvent event) {
        if (event.getUri().equals(getUri())) {
            showValidationStarted();
        }
    }

    /**
     * Refresh the outline page with results from tests that have run
     */
    protected void showValidationFinished() {
        getRefreshJob().cancel();
        getRefreshJob().schedule();
    }

    /**
     * Disable the outline page to show that tests are running
     */
    protected void showValidationStarted() {
        ((XtestOutlineRefreshJob) getRefreshJob()).setControlEnabled(false);
    }

    private URI getUri() {
        return ((XtextDocument) getXtextDocument()).getResourceURI();
    }
}
