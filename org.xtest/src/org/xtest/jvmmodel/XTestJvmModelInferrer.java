package org.xtest.jvmmodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;

import com.google.inject.Inject;

/**
 * Infers a JVM Model (classes, methods, etc.) from the xtest model.
 * 
 * Currently unused, but may be used in future
 */
@SuppressWarnings("all")
public class XTestJvmModelInferrer extends AbstractModelInferrer {
    @Inject
    protected TypesFactory typesFactory;
    @Inject
    private IJvmModelAssociations associations;
    @Inject
    private IJvmModelAssociator associator;
    @Inject
    private JvmTypesBuilder builder;

    @Override
    public void _infer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
    }
}
