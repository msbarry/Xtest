package org.xtest.results;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.xtest.XTestEvaluationException;
import org.xtest.validation.XTestJavaValidator;
import org.xtest.xTest.Body;
import org.xtest.xTest.XAssertExpression;
import org.xtest.xTest.XTestExpression;

import com.google.common.collect.Lists;

/**
 * Xtest result
 * 
 * @author Michael Barry
 */
public class XTestResult {
    /**
     * Key to use as index to store {@link XTestResult}s in {@link XTestJavaValidator} context map
     */
    public static final String KEY = "XtestResult";
    private final EObject eObject;
    private final Collection<XAssertExpression> exceptions = Lists.newArrayList();
    private XTestEvaluationException expression;
    private final String name;
    private final XTestResult parent;
    private XTestState state = XTestState.NOT_RUN;
    private final List<XTestResult> subTests = Lists.newArrayList();
    private final List<String> syntaxErrors = Lists.newArrayList();

    /**
     * Construct a top-level xtest result
     * 
     * @param main
     *            The xtest expression model
     */
    public XTestResult(Body main) {
        this(null, null, main);
    }

    // Private constructor so that users are forced to call subTest to
    // instantiate a non-top-level test
    private XTestResult(XTestResult parent, String name, EObject eObject) {
        this.parent = parent;
        this.name = name;
        this.eObject = eObject;
    }

    /**
     * Fails the test and all of its parents and stores the evaluation exception
     * 
     * @param exception
     *            The evaluation exception
     */
    public void addEvaluationException(XTestEvaluationException exception) {
        fail();
        this.expression = exception;
    }

    /**
     * Fails the test and all of its parents, adding the failed assertion.
     * 
     * @param exception
     *            The failed assertion
     */
    public void addFailedAssertion(XAssertExpression exception) {
        fail();
        this.exceptions.add(exception);
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
     * Fails the test and all of its parents
     */
    public void fail() {
        state = XTestState.FAIL;
        if (parent != null) {
            parent.fail();
        }
    }

    /**
     * Returns the failed assertions
     * 
     * @return The failed assertions
     */
    public Collection<XAssertExpression> getAssertExceptions() {
        return exceptions;
    }

    /**
     * Returns the {@link EObject} associated with this result
     * 
     * @return The {@link EObject} assocated with this result
     */
    public EObject getEObject() {
        return eObject;
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
     * Returns the evaluation exception for this result, or null if there was none
     * 
     * @return the evaluation exception for this result, or null if there was none
     */
    public XTestEvaluationException getEvaluationException() {
        return expression;
    }

    /**
     * Returns the name of this test
     * 
     * @return The name of this test (can be null)
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the name of this test, prepended with all of the tests it is contained within.
     * 
     * @return The name of this test, prepended with all of the tests it is contained within (can't
     *         be null, can be empty)
     */
    public String getQualifiedName() {
        StringBuilder builder = new StringBuilder(name == null ? "" : name);
        for (XTestResult cursor = parent; cursor != null; cursor = cursor.parent) {
            if (cursor.getName() != null) {
                builder.insert(0, '.');
                builder.insert(0, cursor.getQualifiedName());
            }
        }
        return builder.toString();
    }

    /**
     * Returns the state of this test result
     * 
     * @return The state of this test result
     */
    public XTestState getState() {
        return state;
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
     * Passes this result. Only passes its parent if the parent has not been run yet.
     */
    public void pass() {
        state = XTestState.PASS;
        if (parent != null && parent.getState() == XTestState.NOT_RUN) {
            parent.pass();
        }
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
