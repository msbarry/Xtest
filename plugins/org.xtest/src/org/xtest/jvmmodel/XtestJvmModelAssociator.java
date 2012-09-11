package org.xtest.jvmmodel;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.jvmmodel.IXtendJvmAssociations.Impl;
import org.eclipse.xtext.common.types.JvmExecutable;
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
     * Returns the first JVM operation associated with a method def
     * 
     * @param def
     *            The method def
     * @return The first JVM operation associated with that method
     */
    public JvmOperation getJvmOperation(XMethodDef def) {
        return Iterables.getFirst(getJvmOperations(def), null);
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

    /**
     * Gets the method associated with a {@link JvmExecutable}
     * 
     * @param exec
     *            The executable
     * @return The method for that executable
     */
    public XMethodDef getMethodDef(JvmExecutable exec) {
        EObject primarySourceElement = getPrimarySourceElement(exec);
        return primarySourceElement instanceof XMethodDef ? (XMethodDef) primarySourceElement
                : null;
    }

    @Override
    public JvmIdentifiableElement getNearestLogicalContainer(EObject context) {
        return null;
    }

    /**
     * Returns true if {@code context} is either a JVM identifiable element with source EObject
     * assocation or it is a source EObject with JVM identifiable element association.
     * 
     * @param context
     *            The object to check for associations
     * @return True if it has associations, false if not
     */
    public boolean hasAssociation(EObject context) {
        boolean result = false;
        if (context instanceof JvmIdentifiableElement) {
            result = !getSourceElements(context).isEmpty();
        } else if (context != null) {
            result = !getJvmElements(context).isEmpty();
        }
        return result;
    }
}
