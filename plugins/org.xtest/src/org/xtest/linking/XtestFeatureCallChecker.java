package org.xtest.linking;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.linking.FeatureCallChecker;
import org.eclipse.xtext.xbase.scoping.featurecalls.JvmFeatureDescription;

import com.google.inject.Inject;

/**
 * Feature call checker allowing assignments to final instance variables
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestFeatureCallChecker extends FeatureCallChecker {
    @Inject
    private IJvmModelAssociations associations;

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

    @Override
    protected String _case(JvmOperation input, XFeatureCall context, EReference reference,
            JvmFeatureDescription jvmFeatureDescription) {
        if (associations.getPrimarySourceElement(input) != null) {
            return checkJvmOperation(input, context,
                    context.isExplicitOperationCallOrBuilderSyntax(), jvmFeatureDescription);
        }
        return super._case(input, context, reference, jvmFeatureDescription);
    }
}
