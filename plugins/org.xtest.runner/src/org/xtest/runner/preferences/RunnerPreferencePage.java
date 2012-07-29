package org.xtest.runner.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;
import org.xtest.runner.Activator;

/**
 * Preference page that allows a user to turn the visual Xtest runner indicator on and off
 * 
 * @author Michael Barry
 */
public class RunnerPreferencePage extends FieldEditorPreferencePage implements
        IWorkbenchPreferencePage {

    @Override
    public void createFieldEditors() {
        addField(new BooleanFieldEditor(Activator.SHOW_XTEST_RUNNER,
                "Install visual Xtest runner at startup (requires restart to take effect)",
                getFieldEditorParent()));
    }

    @Override
    public void init(IWorkbench workbench) {
        setPreferenceStore(Activator.getDefault().getPreferenceStore());
        setDescription("Xtest runner");
    }

}
