package org.xtest.ui.editor;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage;

/**
 * Custom Xtest Preference page
 * 
 * @author Michael Barry
 */
public class XtestPreferencePage extends LanguageRootPreferencePage {

    @Override
    protected void createFieldEditors() {
        super.createFieldEditors();
        Composite parent = getFieldEditorParent();
        Group xtestGroup = new Group(parent, SWT.SHADOW_IN);
        xtestGroup.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false));

        xtestGroup.setText("Xtest Preferences");
        GridLayout layout = new GridLayout(1, false);
        xtestGroup.setLayout(layout);
        Composite composite = new Composite(xtestGroup, SWT.NONE);
        addField(new BooleanFieldEditor(XtestPreferences.MARK_UNEXECUTED,
                "Enable marking unexecuted code in xtest files as warnings", composite));
        addField(new BooleanFieldEditor(XtestPreferences.RUN_WHILE_EDITING,
                "Enable running tests while you edit them", composite));
        xtestGroup.pack();
    }
}
