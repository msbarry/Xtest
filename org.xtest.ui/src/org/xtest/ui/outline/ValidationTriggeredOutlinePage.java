package org.xtest.ui.outline;

import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextInputListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.ui.editor.IXtextEditorAware;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.xtest.results.XTestResult;
import org.xtest.ui.mediator.IXtestListener;
import org.xtest.ui.mediator.XtestResultsMediator;

import com.google.inject.Inject;

/**
 * Custom outline page that listens on validation job start/finish events to trigger refreshing the
 * outline, rather than document modification events
 * 
 * @author Michael Barry
 */
public class ValidationTriggeredOutlinePage extends OutlinePage implements IXtextEditorAware,
        IXtestListener {
    @Inject
    private XtestResultsMediator mediator;
    private ITextInputListener textInputListener;

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
    public void validationFinished(XTestResult result) {
        showValidationFinished();
    };

    @Override
    public void validationStarted() {
        showValidationStarted();
    }

    @Override
    protected void configureTextInputListener() {
        super.configureTextInputListener();
        textInputListener = new InputChangedListener(this);
        getSourceViewer().addTextInputListener(textInputListener);
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

    private void startListeningOnValidation(IXtextDocument document) {
        if (document instanceof XtextDocument) {
            XtextDocument xtestDoc = (XtextDocument) document;
            mediator.addXtestListener(xtestDoc.getResourceURI(), this);
        }
    }

    private void stopListeningOnValidation(IXtextDocument document) {
        if (document instanceof XtextDocument) {
            XtextDocument xtestDoc = (XtextDocument) document;
            mediator.removeXtestListener(xtestDoc.getResourceURI(), this);
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
