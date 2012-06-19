package org.xtest.jvmmodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;

/**
 * Custom JVM Model Associator that turns off logical container linking
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestJvmModelAssociator extends JvmModelAssociator {
    @Override
    public XExpression getAssociatedExpression(JvmIdentifiableElement element) {
        return super.getAssociatedExpression(element);
    }

    @Override
    public JvmIdentifiableElement getLogicalContainer(EObject object) {
        return null;
    }

    @Override
    public JvmIdentifiableElement getNearestLogicalContainer(EObject context) {
        return null;
    }
}
