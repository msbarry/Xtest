package org.xtest.runner.events;

import org.eclipse.core.resources.IFile;
import org.xtest.runner.external.TestResult;
import org.xtest.runner.external.TestState;

/**
 * Event indicating that a test file has completed
 * 
 * @author Michael Barry
 */
public class TestFinished {

    private final IFile file;
    private final TestResult state;

    /**
     * Package-protected constructor so this can only be instantiated by {@link Events}
     * 
     * @param state
     *            The state of the test
     */
    TestFinished(TestResult state, IFile file) {
        this.state = state;
        this.file = file;
    }

    /**
     * Returns the file that finished running
     * 
     * @return The file that finished running
     */
    public IFile getFile() {
        return file;
    }

    /**
     * Returns the result of this test
     * 
     * @return The result of this test
     */
    public TestResult getResult() {
        return state;
    }

    /**
     * Returns true if this test was canceled or did not fail, false it failed
     * 
     * @return True if this test was canceled or did not fail, false it failed
     */
    public boolean passed() {
        // Consider a canceled event passing for now
        return state.getState() != TestState.FAIL;
    }

}
