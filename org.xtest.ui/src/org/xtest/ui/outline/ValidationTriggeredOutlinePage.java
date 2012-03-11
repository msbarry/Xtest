package org.xtest.ui.outline;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.jobs.IJobChangeEvent;
import org.eclipse.core.runtime.jobs.IJobChangeListener;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextInputListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.ui.editor.IXtextEditorAware;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;

/**
 * Custom outline page that listens on validation job start/finish events to trigger refreshing the
 * outline, rather than document modification events
 * 
 * @author Michael Barry
 */
public class ValidationTriggeredOutlinePage extends OutlinePage implements IXtextEditorAware,
        IJobChangeListener {
    private ITextInputListener textInputListener;

    @Override
    public void aboutToRun(IJobChangeEvent arg0) {
    }

    @Override
    public void awake(IJobChangeEvent arg0) {
    }

    @Override
    public void createControl(Composite parent) {
        super.createControl(parent);
        showValidationStarted();
    }

    @Override
    public void dispose() {
        super.dispose();
        getSourceViewer().removeTextInputListener(textInputListener);
        stopListeningOnValidation(getXtextDocument());
    }

    @Override
    public void done(IJobChangeEvent arg0) {
        if (arg0.getResult().getSeverity() != IStatus.CANCEL) {
            showValidationFinished();
        }
    }

    @Override
    public void running(IJobChangeEvent arg0) {
    }

    @Override
    public void scheduled(IJobChangeEvent arg0) {
        showValidationStarted();
    }

    @Override
    @Deprecated
    public void scheduleRefresh() {
        // Disable super's scheduleRefresh
    }

    @Override
    public void setEditor(XtextEditor editor) {
        startListeningOnValidation(editor.getDocument());
        XtestOutlineRefreshJob refreshJob = (XtestOutlineRefreshJob) getRefreshJob();
        refreshJob.setOutlinePage(this);
        refreshJob.schedule();
    }

    @Override
    public void sleeping(IJobChangeEvent arg0) {
    }

    @Override
    protected void configureTextInputListener() {
        super.configureTextInputListener();
        textInputListener = new InputChangedListener(this);
        getSourceViewer().addTextInputListener(textInputListener);
    };

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

    private void startListeningOnValidation(IXtextDocument document) {
        if (document instanceof XtextDocument) {
            XtextDocument xtestDoc = (XtextDocument) document;
            Job validationJob = xtestDoc.getValidationJob();
            if (validationJob != null) {
                validationJob.addJobChangeListener(this);
            }
        }
    }

    private void stopListeningOnValidation(IXtextDocument document) {
        if (document instanceof XtextDocument) {
            XtextDocument xtestDoc = (XtextDocument) document;
            Job validationJob = xtestDoc.getValidationJob();
            if (validationJob != null) {
                validationJob.removeJobChangeListener(this);
            }
        }
    }

    /**
     * Listener that unregisters/registers this page as a validation job listener when the input to
     * the page changes (ie. the document is moved)
     * 
     * @author Michael Barry
     */
    private static class InputChangedListener implements ITextInputListener {
        private final ValidationTriggeredOutlinePage page;

        public InputChangedListener(ValidationTriggeredOutlinePage page) {
            this.page = page;
        }

        @Override
        public void inputDocumentAboutToBeChanged(IDocument oldInput, IDocument newInput) {
        }

        @Override
        public void inputDocumentChanged(IDocument oldInput, IDocument newInput) {
            try {
                XtextDocument oldXtextDocument = (XtextDocument) page.getXtextDocument();
                page.stopListeningOnValidation(oldXtextDocument);

                XtextDocument newXtextDocument = (XtextDocument) XtextDocumentUtil.get(newInput);
                page.startListeningOnValidation(newXtextDocument);
            } catch (Throwable t) {
            }
        }
    }

}
