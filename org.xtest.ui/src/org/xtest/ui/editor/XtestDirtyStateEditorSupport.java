package org.xtest.ui.editor;

import org.eclipse.xtext.ui.editor.DirtyStateEditorSupport;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocument;

/**
 * Custom dirty state editor support that schedules initial validation when the document opens
 * 
 * @author Michael Barry
 */
public class XtestDirtyStateEditorSupport extends DirtyStateEditorSupport {

    @Override
    public void initializeDirtyStateSupport(IDirtyStateEditorSupportClient client) {
        super.initializeDirtyStateSupport(client);
        IXtextDocument document = client.getDocument();
        if (document instanceof XtextDocument) {
            XtextDocument typedDocument = (XtextDocument) document;
            typedDocument.getValidationJob().schedule();
        }
    }
}
