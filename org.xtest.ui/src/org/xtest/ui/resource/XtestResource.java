package org.xtest.ui.resource;

import org.eclipse.xtext.xbase.resource.XbaseResource;
import org.xtest.runner.external.DependencyAcceptor;

import com.google.common.base.Optional;

/**
 * Custom Xtest file resource that optionally contains a {@link DependencyAcceptor}
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestResource extends XbaseResource {
    private DependencyAcceptor acceptor;

    /**
     * Returns the optional {@link DependencyAcceptor}
     * 
     * @return The optional {@link DependencyAcceptor}
     */
    public Optional<DependencyAcceptor> getAcceptor() {
        return Optional.fromNullable(acceptor);
    }

    /**
     * Sets the {@link DependencyAcceptor}
     * 
     * @param acceptor
     */
    public void setAcceptor(DependencyAcceptor acceptor) {
        this.acceptor = acceptor;
    }

}
