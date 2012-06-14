package org.xtest.jvmmodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;

/**
 * Infers a JVM Model (classes, methods, etc.) from the xtest model.
 * 
 * Currently unused, but may be used in future
 */
@SuppressWarnings("all")
public class XTestJvmModelInferrer extends AbstractModelInferrer {
    @Override
    public void infer(EObject e, IJvmDeclaredTypeAcceptor acceptor, boolean preIndexingPhase) {
        // TODO Auto-generated method stub
        super.infer(e, acceptor, preIndexingPhase);
    }
}
