package org.xtest.results;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.xtest.XTestEvaluationException;
import org.xtest.validation.XTestJavaValidator;
import org.xtest.xTest.Body;
import org.xtest.xTest.XTestExpression;

import com.google.common.base.Objects;
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
    private final Collection<XTestEvaluationException> expressions = Lists.newArrayList();
    private final String name;
    private final XTestResult parent;
    private boolean pending = false;
    private Object resultObject;

    private XTestState state = XTestState.NOT_RUN;

    private final List<XTestResult> subTests = Lists.newArrayList();
    private final List<String> syntaxErrors = Lists.newArrayList();
    private boolean uniqueFailure = false;

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
        this.name = name != null ? name.replaceAll("[\n\r]", "") : null;
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
        expressions.add(exception);
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
     * Counts the number of failures
     * 
     * @return The number of failures including this and sub tests
     */
    public int countFailures() {
        int result = uniqueFailure ? 1 : 0;
        for (XTestResult sub : subTests) {
            result += sub.countFailures();
        }
        return result;
    }

    /**
     * Counts the number of pending tests
     * 
     * @return The number of pending tests including this and sub tests
     */
    public int countPendings() {
        int result = pending ? 1 : 0;
        for (XTestResult sub : subTests) {
            result += sub.countPendings();
        }
        return result;
    }

    /**
     * Counts the total number of tests
     * 
     * @return The total number of tests including this and sub tests
     */
    public int countTests() {
        int result = 1;
        for (XTestResult sub : subTests) {
            result += sub.countTests();
        }
        return result;
    }

    /**
     * Fails the test and all of its parents
     */
    public void fail() {
        uniqueFailure = true;
        internalFail();
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
    public Collection<XTestEvaluationException> getEvaluationException() {
        return expressions;
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
                builder.insert(0, cursor.getName());
            }
        }
        return builder.toString();
    }

    /**
     * Gets the return value of the test
     * 
     * @return The return value of the test
     */
    public Object getResultObject() {
        return resultObject;
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
     * Returns true if this test is pending, false if not
     * 
     * @return True if this test is pending, false if not
     */
    public boolean isPending() {
        return pending;
    }

    /**
     * Passes this result. Only passes its parent if the parent has not been run yet.
     */
    public void pass() {
        if (state == XTestState.NOT_RUN) {
            state = XTestState.PASS;
            if (parent != null && parent.getState() == XTestState.NOT_RUN) {
                parent.pass();
            }
        }
    }

    /**
     * Sets this test as pending
     */
    public void setPending() {
        this.pending = true;
    }

    /**
     * Sets the return value of the test
     * 
     * @param resultObject
     *            The return vale of the test
     */
    public void setResultObject(Object resultObject) {
        this.resultObject = resultObject;
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

    @Override
    public String toString() {
        return Objects.toStringHelper(XTestResult.class).add("name", name).add("state", state)
                .toString();
    }

    private void internalFail() {
        state = XTestState.FAIL;
        if (parent != null) {
            parent.internalFail();
        }
    }

}
