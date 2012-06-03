package org.xtest.runner.events;

import org.eclipse.core.resources.IFile;
import org.xtest.runner.external.TestResult;

import com.google.common.eventbus.EventBus;
import com.google.inject.Inject;

/**
 * Wrapper for the Guava {@link EventBus} to construct event objects of particular types and post
 * them to the bus.
 * 
 * @author Michael Barry
 */
public class Events {
    @Inject
    private EventBus bus;

    /**
     * Post an event that currently running tests have been canceled, and there are still
     * {@code numScheduled} pending tests.
     * 
     * @param numScheduled
     *            The number of remaining tests
     */
    public void cancelAndSchedule(int numScheduled) {
        bus.post(new TestsCanceled(numScheduled));
    }

    /**
     * Post an event that a test file has finished running and is either passing, failing, or was
     * interrupted while running.
     * 
     * @param state
     *            The state of the test
     * @param file
     *            The test file
     */
    public void finishTest(TestResult state, IFile file) {
        bus.post(new TestFinished(state, file));
    }

    /**
     * Post an event that all tests have completed.
     */
    public void finishTests() {
        bus.post(new TestsFinished());
    }

    /**
     * Post an event that a test run has started with {@code numToRun} pending tests.
     * 
     * @param numToRun
     *            the number of tests that will run in this batch
     */
    public void startTests(int numToRun) {
        bus.post(new TestsStarted(numToRun));
    }

}
