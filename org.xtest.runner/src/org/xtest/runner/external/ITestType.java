package org.xtest.runner.external;

import org.eclipse.core.resources.IFile;

/**
 * A type of test runner contributed to the Xtest runner framework through the testType extension
 * point
 * 
 * @author Michael Barry
 */
public interface ITestType {
    /**
     * Tests if the client cares about the changed file
     * 
     * @param resource
     *            The changed file
     * @return True if this test type cares about the file, false otherwise
     */
    boolean caresAboutDelta(IFile resource);

    /**
     * Returns a new test runner for a batch run-all job
     * 
     * @return The test runner
     */
    ITestRunner provideNewRunner();

    /**
     * Test if the client test runner recognizes tests in the file
     * 
     * @param file
     *            The test file
     * @return True if the file has tests, false if not
     */
    boolean supports(IFile file);

}
