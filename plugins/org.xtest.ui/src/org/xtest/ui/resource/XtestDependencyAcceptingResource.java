package org.xtest.ui.resource;

import org.eclipse.xtend.core.resource.XtendResource;
import org.xtest.results.XTestResult;
import org.xtest.runner.external.DependencyAcceptor;

import com.google.common.base.Optional;

/**
 * Custom Xtest file resource that optionally contains a {@link DependencyAcceptor}
 * 
 * @author Michael Barry
 */
public class XtestDependencyAcceptingResource extends XtendResource {
    private DependencyAcceptor acceptor;
    private XTestResult result;

    /**
     * Returns the optional {@link DependencyAcceptor}
     * 
     * @return The optional {@link DependencyAcceptor}
     */
    public Optional<DependencyAcceptor> getAcceptor() {
        return Optional.fromNullable(acceptor);
    }

    /**
     * Returns the test result captured during the validation
     * 
     * @return The test result captured during the validation
     */
    public XTestResult getResult() {
        return result;
    }

    /**
     * Sets the {@link DependencyAcceptor}
     * 
     * @param acceptor
     */
    public void setAcceptor(DependencyAcceptor acceptor) {
        this.acceptor = acceptor;
    }

    /**
     * Sets the test result captured during the validation
     * 
     * @param result
     *            The test result captured during the validation
     */
    public void setResult(XTestResult result) {
        this.result = result;
    }

}
