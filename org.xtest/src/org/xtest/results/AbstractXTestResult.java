package org.xtest.results;

import org.eclipse.emf.ecore.EObject;
import org.xtest.XTestEvaluationException;

/**
 * Abstract superclass for xtest results
 * 
 * @author Michael Barry
 */
public class AbstractXTestResult {
    private final EObject eObject;
    private XTestEvaluationException expression;
    private final String name;
    private final AbstractXTestResult parent;
    private XTestState state = XTestState.NOT_RUN;

    AbstractXTestResult(AbstractXTestResult parent, String name, EObject eObject) {
        this.name = name;
        this.parent = parent;
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
     * Fails the test and all of its parents
     */
    public void fail() {
        state = XTestState.FAIL;
        if (parent != null) {
            parent.fail();
        }
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
        for (AbstractXTestResult cursor = parent; cursor != null; cursor = cursor.parent) {
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
     * Passes this result. Only passes its parent if the parent has not been run yet.
     */
    public void pass() {
        state = XTestState.PASS;
        if (parent != null && parent.getState() == XTestState.NOT_RUN) {
            parent.pass();
        }
    }
}
