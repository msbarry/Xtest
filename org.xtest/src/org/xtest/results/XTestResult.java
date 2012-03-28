package org.xtest.results;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.xtest.XTestAssertException;
import org.xtest.xTest.Body;
import org.xtest.xTest.XTestExpression;

import com.google.common.collect.Lists;

/**
 * Xtest result
 * 
 * @author Michael Barry
 */
public class XTestResult extends AbstractXTestResult {
    private XTestAssertException exception;
    private final List<XTestResult> subTests = Lists.newArrayList();
    private final List<String> syntaxErrors = Lists.newArrayList();

    /**
     * Construct a top-level xtest result
     * 
     * @param main
     *            The xtest expression model
     */
    public XTestResult(Body main) {
        super(null, null, main);
    }

    // Private constructor so that users are forced to call subTest to
    // instantiate a non-top-level test
    private XTestResult(AbstractXTestResult parent, String name, EObject eObject) {
        super(parent, name, eObject);
    }

    /**
     * Fails the test and all of its parents, adding the failed assertion.
     * 
     * @param exception
     *            The failed assertion
     */
    public void addFailedAssertion(XTestAssertException exception) {
        fail();
        this.exception = exception;
    }

    /**
     * Fails this test and all of its parents and adds a syntax error for this test.
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
     * Returns the syntax errors in this test
     * 
     * @return The syntax errors in this test
     */
    public List<String> getErrorMessages() {
        return syntaxErrors;
    }

    /**
     * Returns the tests contained within this test
     * 
     * @return The tests contained within this test
     */
    public List<XTestResult> getSubTests() {
        return subTests;
    }

    /**
     * Constructs a new test result that is contained in this test.
     * 
     * @param name
     *            The name of the test
     * @param eObject
     *            The test test expression that the result corresponds to
     * @return The new test result
     */
    public XTestResult subTest(String name, XTestExpression eObject) {
        XTestResult result = new XTestResult(this, name, eObject);
        subTests.add(result);
        return result;
    }

}
