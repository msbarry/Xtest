package org.xtest.ui.validation;

import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.xtest.ui.editor.XtestPreferences;
import org.xtest.validation.XTestJavaValidator;
import org.xtest.xTest.Body;

import com.google.inject.Inject;

/**
 * Custom Java Validator that decides whether or not to run tests on an edit or save based on the
 * preferences.
 * 
 * @author Michael Barry
 */
public class UIXTestJavaValidator extends XTestJavaValidator {
    @Inject
    private XtestPreferences preferences;

    @Override
    @Check(CheckType.FAST)
    public void doMagic(Body main) {
        if (preferences.isRunWhileEditing()) {
            super.doMagic(main);
        }
    }

    /**
     * Run tests from editor only on save if run while editing preference is false
     * 
     * @param main
     *            The body of the xtest file
     */
    @Check(CheckType.NORMAL)
    public void doMagic2(Body main) {
        if (!preferences.isRunWhileEditing()) {
            super.doMagic(main);
        }
    }
}
