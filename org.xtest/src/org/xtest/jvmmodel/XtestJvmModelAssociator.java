package org.xtest.jvmmodel;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations.Impl;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.xbase.XExpression;
import org.xtest.xTest.Body;
import org.xtest.xTest.XMethodDef;

import com.google.common.collect.Iterables;

/**
 * Custom JVM Model Associator that turns off logical container linking and exposes convenience
 * utilities for xtest model inference retrieval.
 * 
 * Extends Xtend's implementation so that xtend classes that are pulled in use this class as well.
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestJvmModelAssociator extends Impl {
    @Override
    public XExpression getAssociatedExpression(JvmIdentifiableElement element) {
        return super.getAssociatedExpression(element);
    }

    /**
     * Returns the inferred type from a file
     * 
     * @param body
     *            The file's body
     * @return The inferred type of that file
     */
    public JvmGenericType getInferredType(Body body) {
        Set<EObject> jvmElements = getJvmElements(body);
        return Iterables.getFirst(Iterables.filter(jvmElements, JvmGenericType.class), null);
    }

    /**
     * Returns the JVM operations associated with a method def
     * 
     * @param def
     *            The method def
     * @return The JVM operations associated with that method
     */
    public Iterable<JvmOperation> getJvmOperations(XMethodDef def) {
        Set<EObject> jvmElements = getJvmElements(def);
        return Iterables.filter(jvmElements, JvmOperation.class);
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
