package org.xtest.runner.events;

/**
 * Event indicating that currently running tests have been canceled
 * 
 * @author Michael Barry
 */
public class TestsCanceled {

    private final int num;

    /**
     * Package-protected constructor so this can only be instantiated by {@link Events}
     * 
     * @param i
     *            The number of tests that are still pending
     */
    TestsCanceled(int i) {
        this.num = i;
    }

    /**
     * Returns the number of tests that are still pending
     * 
     * @return The number of tests that are still pending
     */
    public int getNum() {
        return num;
    }
}
