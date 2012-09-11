package org.xtest.runner.events;

import java.util.Collection;

import org.xtest.runner.RunnableTest;

/**
 * Event indicating that currently running tests have been canceled
 * 
 * @author Michael Barry
 */
public class TestsCanceled {

    private final Collection<RunnableTest> tests;

    /**
     * Package-protected constructor so this can only be instantiated by {@link Events}
     * 
     * @param i
     *            The tests that are still pending
     */
    TestsCanceled(Collection<RunnableTest> tests) {
        this.tests = tests;
    }

    /**
     * Returns the tests that are still pending
     * 
     * @return The tests that are still pending
     */
    public Collection<RunnableTest> getTests() {
        return tests;
    }
}
