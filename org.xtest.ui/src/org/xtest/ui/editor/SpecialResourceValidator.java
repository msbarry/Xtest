package org.xtest.ui.editor;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.ResourceValidatorImpl;
import org.xtest.preferences.PerFilePreferenceProvider;
import org.xtest.preferences.RuntimePref;
import org.xtest.xTest.Body;

import com.google.inject.Inject;

public class SpecialResourceValidator extends ResourceValidatorImpl {
    @Inject
    private PerFilePreferenceProvider preferenceProvider;

    @Override
    public List<Issue> validate(Resource resource, final CheckMode mode, CancelIndicator mon) {
        EObject object = resource.getContents().get(0);
        CheckMode mode2 = mode;
        if (object instanceof Body) {
            if (preferenceProvider.get((Body) object, RuntimePref.RUN_WHILE_EDITING)) {
                mode2 = new CheckMode() {
                    @Override
                    public boolean shouldCheck(CheckType type) {
                        return type == CheckType.EXPENSIVE || mode.shouldCheck(type);
                    }
                };
            }
        }
        return super.validate(resource, mode2, mon);
    }
}
