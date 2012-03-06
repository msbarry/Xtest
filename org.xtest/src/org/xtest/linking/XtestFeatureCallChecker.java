package org.xtest.linking;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.linking.FeatureCallChecker;
import org.eclipse.xtext.xbase.scoping.featurecalls.JvmFeatureDescription;

/**
 * Feature call checker allowing assignments to final instance variables
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestFeatureCallChecker extends FeatureCallChecker {

    @Override
    protected String _case(JvmField input, XAssignment context, EReference ref,
            JvmFeatureDescription jvmFeatureDescription) {
        String result;
        if (input.isFinal()) {
            result = null;
        } else {
            result = super._case(input, context, ref, jvmFeatureDescription);
        }
        return result;
    }
}
