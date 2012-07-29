package org.xtest.scoping;

import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.impl.FeatureCallToJavaMapping;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;

import com.google.inject.Inject;

/**
 * Custom feature call to java mapping implementation that understands local method scoping
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestFeatureCallMapping extends FeatureCallToJavaMapping {
    @Inject
    private IJvmModelAssociations associations;

    @Override
    public List<XExpression> getActualArguments(XAbstractFeatureCall featureCall,
            JvmIdentifiableElement feature, XExpression implicitReceiver,
            XExpression implicitFirstArgument) {
        EObject primarySourceElement = associations.getPrimarySourceElement(feature);
        final List<XExpression> explicitArguments = featureCall.getExplicitArguments();
        if (primarySourceElement != null) {
            return newArrayList(explicitArguments);
        }

        return super.getActualArguments(featureCall, feature, implicitReceiver,
                implicitFirstArgument);
    }
}
