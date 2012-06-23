package org.xtest.validation;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend.core.validation.XtendJavaValidator;
import org.eclipse.xtext.common.types.JvmExecutable;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import com.google.common.collect.Multimap;

/**
 * Xtend validator wrapper that allows other validators to pick and choose which Xtend validations
 * to run.
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtendValidations extends XtendJavaValidator {
    private ValidationMessageAcceptor messageAcceptor;

    @Override
    public void doCheckDuplicateExecutables(JvmGenericType inferredType,
            Multimap<Object, ? extends JvmExecutable> executablesPerErasure) {
        super.doCheckDuplicateExecutables(inferredType, executablesPerErasure);
    }

    @Override
    public ValidationMessageAcceptor getMessageAcceptor() {
        return messageAcceptor;
    }

    @Override
    public String getReadableSignature(JvmExecutable executable) {
        return super.getReadableSignature(executable);
    }

    @Override
    public EStructuralFeature nameFeature(EObject member) {
        return super.nameFeature(member);
    }

    /**
     * Set this validator to delegate its message acceptor to the message acceptor of the another
     * validator
     * 
     * @param delegate
     *            The other validator to delegate to.
     */
    public void setDelagate(XTestJavaValidator delegate) {
        this.messageAcceptor = delegate.getMessageAcceptor();
    }
}
