package org.xtest.preferences;

/**
 * Provider for the default value of a {@link RuntimePref}
 * 
 * @author Michael Barry
 */
public class DefaultPreferenceProvider {

    /**
     * Return the default value of {@code pref}
     * 
     * @param pref
     *            The {@link RuntimePref}
     * @return The default value of {@code pref}
     */
    public Boolean getDefault(RuntimePref pref) {
        return pref.getDefaultValue();
    }

}
