package org.xtest.runner.events;

/**
 * Event indicating that a test run has started.
 * 
 * @author Michael Barry
 */
public class TestsStarted {

    private final int num;

    /**
     * Package-protected constructor so this can only be instantiated by {@link Events}
     * 
     * @param num
     *            The number of tests that are to be run in this batch
     */
    TestsStarted(int num) {
        this.num = num;
    }

    /**
     * Returns the number of tests that are to run in this batch
     * 
     * @return The number of tests that are to run in this batch
     */
    public int getNum() {
        return num;
    }

}
