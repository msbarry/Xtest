package org.xtest.ui.resource;

import org.eclipse.xtext.xbase.resource.XbaseResource;
import org.xtest.runner.DependencyAcceptor;

public class XtestResource extends XbaseResource {
    private DependencyAcceptor acceptor;

    public DependencyAcceptor getAcceptor() {
        return acceptor;
    }

    public void setAcceptor(DependencyAcceptor acceptor) {
        this.acceptor = acceptor;
    }

}
