package org.xtest.runner.external;

/**
 * Result of running a test
 * 
 * @author Michael Barry
 */
public enum TestResult {
    /** Test Failed */
    FAIL(0),
    /** Test not run */
    NOT_RUN(1),
    /** Test passed */
    PASS(2);
    private final int fOrder;

    private TestResult(int order) {
        fOrder = order;
    }

    /**
     * Returns the order of this result, {@link #FAIL} is first
     * 
     * @return The order of this result
     */
    public int getOrder() {
        return fOrder;
    }
}
