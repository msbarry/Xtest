package org.xtest.runner.events;

import java.util.Collection;

import org.xtest.runner.RunnableTest;

/**
 * Event indicating that a test run has started.
 * 
 * @author Michael Barry
 */
public class TestsStarted {

    private final Collection<RunnableTest> tests;

    /**
     * Package-protected constructor so this can only be instantiated by {@link Events}
     * 
     * @param num
     *            The number of tests that are to be run in this batch
     */
    TestsStarted(Collection<RunnableTest> tests) {
        this.tests = tests;
    }

    /**
     * Returns the tests that are to run in this batch
     * 
     * @return The tests that are to run in this batch
     */
    public Collection<RunnableTest> getTests() {
        return tests;
    }

}
