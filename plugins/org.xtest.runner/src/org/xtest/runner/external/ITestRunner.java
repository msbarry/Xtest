package org.xtest.runner.external;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Test runner for a single file
 * 
 * @author Michael Barry
 */
public interface ITestRunner {

    /**
     * Runts a test file and returns the result
     * 
     * @param fFile
     *            The file to run
     * @param monitor
     *            The progress monitor
     * @param acceptor
     *            The dependency acceptor
     * @return The result of running the tests
     */
    TestResult run(IFile fFile, IProgressMonitor monitor, DependencyAcceptor acceptor);
}
