package org.xtest.results;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.xtest.XTestAssertException;
import org.xtest.xTest.Body;
import org.xtest.xTest.XTestExpression;

import com.google.common.collect.Lists;

/**
 * Xtest suite result
 * 
 * @author Michael Barry
 */
public class XTestResult extends AbstractXTestResult {
    private XTestAssertException exception;
    private final List<XTestResult> subTests = Lists.newArrayList();
    private final List<String> syntaxErrors = Lists.newArrayList();

    /**
     * Construct a top-level xtest suite result
     * 
     * @param main
     *            The xtest expression model
     */
    public XTestResult(Body main) {
        super(null, null, main);
    }

    // Private constructor so that users are forced to call subSuite to
    // instantiate a non-top-level suite
    private XTestResult(AbstractXTestResult parent, String name, EObject eObject) {
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
     * Fails this test and all of its parents and adds a syntax error for this test suite.
     * 
     * @param string
     *            The syntax error.
     */
    public void addSyntaxError(String string) {
        fail();
        syntaxErrors.add(string);
    }

    /**
     * Returns the failed assertion or null if empty
     * 
     * @return The failed assertion or null if empty
     */
    public XTestAssertException getAssertException() {
        return exception;
    }

    /**
     * Returns the syntax errors in this test case
     * 
     * @return The syntax errors in this test case
     */
    public List<String> getErrorMessages() {
        return syntaxErrors;
    }

    /**
     * Returns the test suite results in this test suite
     * 
     * @return The test suite results in this test suite
     */
    public List<XTestResult> getSubSuites() {
        return subTests;
    }

    /**
     * Constructs a new test suite result that is contained in this suite.
     * 
     * @param name
     *            The name of the suite
     * @param eObject
     *            The test suite expression that the result corresponds to
     * @return The new test suite result
     */
    public XTestResult subTest(String name, XTestExpression eObject) {
        XTestResult xTestSuiteResult = new XTestResult(this, name, eObject);
        subTests.add(xTestSuiteResult);
        return xTestSuiteResult;
    }

}
