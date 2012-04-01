package org.xtest.jvmmodel;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;

import com.google.common.collect.Lists;

/**
 * Infers a JVM Model (classes, methods, etc.) from the xtest model.
 * 
 * Currently unused, but may be used in future
 */
@SuppressWarnings("all")
public class XTestJvmModelInferrer implements IJvmModelInferrer {

    @Override
    public List<? extends JvmDeclaredType> inferJvmModel(EObject sourceObject) {
        return Lists.newArrayList();
    }
}
