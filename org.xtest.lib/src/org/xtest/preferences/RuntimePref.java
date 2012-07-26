package org.xtest.preferences;

/**
 * Xtest file preferences with hardcoded root-default values. Preference page in the UI allows the
 * user to customize these globally. In each file, the user can set them manually before the
 * "import" statements.
 * 
 * @author Michael Barry
 */
public enum RuntimePref {
    /** Enable marking unexecuted code in xtest files as warnings */
    MARK_UNEXECUTED("markUnexecuted", "Enable marking unexecuted code in xtest files as warnings",
            true),
    /** Enable running tests after every save */
    RUN_ON_SAVE("runOnSave", "Enable running tests after every save", true),
    /** Enable running tests while you edit them */
    RUN_WHILE_EDITING("runWhileEditing", "Enable running tests while you edit them", true);

    private final boolean fDefaultValue;
    private final String fDisplay;
    private final String fId;

    private RuntimePref(String id, String display, boolean defaultValue) {
        fId = id;
        fDisplay = display;
        fDefaultValue = defaultValue;
    }

    /**
     * Returns the default value for this preference
     * 
     * @return The default value for this preference
     */
    public boolean getDefaultValue() {
        return fDefaultValue;
    }

    /**
     * Returns the user-friendly display string for this preference
     * 
     * @return The user-friendly display string for this preference
     */
    public String getDisplay() {
        return fDisplay;
    }

    /**
     * Returns the id used in Xtest files to customize this preference
     * 
     * @return the id used in Xtest files to customize this preference
     */
    public String getId() {
        return fId;
    }

}
