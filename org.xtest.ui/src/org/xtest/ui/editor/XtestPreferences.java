package org.xtest.ui.editor;

import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;

import com.google.inject.Inject;

/**
 * Xtest preferences container
 * 
 * @author Michael Barry
 */
public class XtestPreferences {

    /**
     * Property corresponding to a boolean to mark unexecuted expressions as warnings.
     */
    public static final String MARK_UNEXECUTED = "markUnexecuted";

    @Inject
    private IPreferenceStoreAccess preferenceStoreAccess;

    /**
     * Returns true if unexecuted lines in xtest files should be marked as warnings
     * 
     * @return true if unexecuted lines in xtest files should be marked as warnings, false otherwise
     */
    public boolean isMarkUnexecuted() {
        return preferenceStoreAccess.getPreferenceStore().getBoolean(MARK_UNEXECUTED);
        // TODO re-run tests in project?
    }

    /**
     * Sets the property to mark unexecuted lines in xtest files as warnings
     * 
     * @param markUnexecuted
     *            True to mark unexecuted lines in xtest files as warnings, false otherwise
     */
    public void setMarkUnexecuted(boolean markUnexecuted) {
        preferenceStoreAccess.getWritablePreferenceStore()
                .setValue(MARK_UNEXECUTED, markUnexecuted);
        // TODO re-run tests in project?
    }

    /**
     * Initializer for xtest preferences
     * 
     * @author Michael Barry
     */
    public static class Initializer implements IPreferenceStoreInitializer {
        @Override
        public void initialize(IPreferenceStoreAccess access) {
            access.getWritablePreferenceStore().setDefault(MARK_UNEXECUTED, true);
        }
    }
}
