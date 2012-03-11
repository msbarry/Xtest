package org.xtest.ui.editor;

import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.XtextEditorErrorTickUpdater;
import org.xtest.ui.internal.XtestPluginImages;

import com.google.inject.Inject;

/**
 * Custom editor error tick updater for xtest file editors
 * 
 * @author Michael Barry
 */
public class XtestEditorErrorTickUpdater extends XtextEditorErrorTickUpdater {
    @Inject
    private XtestPluginImages images;

    @Override
    protected void updateEditorImage(XtextEditor xtextEditor) {
        Severity severity = getSeverity(xtextEditor);
        Image suiteImage = images.getSuiteImage(severity);
        scheduleUpdateEditorJob(suiteImage);
    }

}
