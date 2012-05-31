package org.xtest.runner.events;

import org.xtest.runner.external.TestResult;

/**
 * Event indicating that a test file has completed
 * 
 * @author Michael Barry
 */
public class TestFinished {

    private final TestResult state;

    /**
     * Package-protected constructor so this can only be instantiated by {@link Events}
     * 
     * @param state
     *            The state of the test
     */
    TestFinished(TestResult state) {
        this.state = state;
    }

    /**
     * Returns true if this test was canceled or did not fail, false it failed
     * 
     * @return True if this test was canceled or did not fail, false it failed
     */
    public boolean passed() {
        // Consider a canceled event passing for now
        return state != TestResult.FAIL;
    }

}
