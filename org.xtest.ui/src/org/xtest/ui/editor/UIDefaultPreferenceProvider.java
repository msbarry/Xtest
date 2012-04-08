package org.xtest.ui.editor;

import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;
import org.xtest.preferences.DefaultPreferenceProvider;
import org.xtest.preferences.RuntimePref;

import com.google.inject.Inject;

/**
 * Override {@link DefaultPreferenceProvider} for UI such that the default preference values for
 * each file come from the preference store.
 * 
 * @author Michael Barry
 */
public class UIDefaultPreferenceProvider extends DefaultPreferenceProvider {

    @Inject
    private IPreferenceStoreAccess preferenceStoreAccess;

    @Override
    public Boolean getDefault(RuntimePref pref) {
        return preferenceStoreAccess.getPreferenceStore().getBoolean(pref.getId());
    }

    /**
     * Initializer for xtest preferences
     * 
     * @author Michael Barry
     */
    public static class Initializer implements IPreferenceStoreInitializer {
        @Override
        public void initialize(IPreferenceStoreAccess access) {
            for (RuntimePref pref : RuntimePref.values()) {
                access.getWritablePreferenceStore()
                        .setDefault(pref.getId(), pref.getDefaultValue());
            }
        }
    }
}
