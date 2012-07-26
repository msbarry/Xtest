package org.xtest.runner.external;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Result of running a test
 * 
 * @author Michael Barry
 */
public class TestResult implements Serializable {

    /**
     * Generated serial version UID
     */
    private static final long serialVersionUID = 8898971430290710197L;

    /**
     * Creates a new test result with the given number of failures, pending, and total tests
     * 
     * @param numFail
     *            Number of test failures that occurred
     * @param numPend
     *            Number of pending tests
     * @param numTotal
     *            Number of total tests
     * @return The new test result
     */
    public static TestResult create(int numFail, int numPend, int numTotal) {
        TestState state = numFail != 0 ? TestState.FAIL : numTotal == 0 ? TestState.NOT_RUN
                : TestState.PASS;
        return new TestResult(state, numFail, numPend, numTotal);
    }

    /**
     * Creates a new test result in a NOT RUN state
     * 
     * @return The new test result
     */
    public static TestResult notRun() {
        return create(0, 0, 0);
    }

    /**
     * Creates a new test result in a failed-due-to-syntax-error state
     * 
     * @return The new test result
     */
    public static TestResult syntaxFailure() {
        return new TestResult(TestState.FAIL, 0, 0, 0);
    }

    private int numFail;

    private int numPend;
    private int numTotal;

    private TestState state;

    private TestResult(TestState state, int numFail, int numPend, int numTotal) {
        this.state = state;
        this.numFail = numFail;
        this.numPend = numPend;
        this.numTotal = numTotal;
    }

    /**
     * Returns the number of test failures
     * 
     * @return The number of test failures
     */
    public int getNumFail() {
        return numFail;
    }

    /**
     * Returns the number of pending tests
     * 
     * @return The number of pending tests
     */
    public int getNumPend() {
        return numPend;
    }

    /**
     * Returns the number of total tests
     * 
     * @return The number of total tests
     */
    public int getNumTotal() {
        return numTotal;
    }

    /**
     * Returns the order of this result, {@link TestState#FAIL} is first
     * 
     * @return The order of this result
     */
    public int getOrder() {
        return state.getOrder();
    }

    /**
     * Returns the state of this result
     * 
     * @return The state of this result
     */
    public Object getState() {
        return state;
    }

    @Override
    public String toString() {
        return state + " [failures: " + numFail + ", pending: " + numPend + ", total: " + numTotal
                + "]";
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
        state = (TestState) stream.readObject();
        numFail = stream.readInt();
        numPend = stream.readInt();
        numTotal = stream.readInt();
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
        stream.writeObject(state);
        stream.writeInt(numFail);
        stream.writeInt(numPend);
        stream.writeInt(numTotal);
    }
}
