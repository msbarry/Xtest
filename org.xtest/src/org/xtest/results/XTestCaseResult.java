package org.xtest.results;

import org.eclipse.emf.ecore.EObject;
import org.xtest.XTestAssertException;

/**
 * Xtest case result
 * 
 * @author Michael Barry
 */
public class XTestCaseResult extends AbstractXTestResult {
    private XTestAssertException exception;

    // Package-protected constructor so that users must invoke subCase method of
    // XtestSuiteResult to create a test case result
    XTestCaseResult(AbstractXTestResult parent, String name, EObject eObject) {
        super(parent, name, eObject);
    }

    /**
     * Fails the test case and all of its parents, adding the failed assertion.
     * 
     * @param exception
     *            The failed assertion
     */
    public void addFailedAssertion(XTestAssertException exception) {
        fail();
        this.exception = exception;
    }

    /**
     * Returns the failed assertion or null if empty
     * 
     * @return The failed assertion or null if empty
     */
    public XTestAssertException getAssertException() {
        return exception;
    }
}
