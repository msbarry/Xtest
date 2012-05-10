package org.xtest.runner.external;

import java.net.URI;

/**
 * Pass to client test runner to accepts test dependencies
 * 
 * @author Michael Barry
 */
public interface DependencyAcceptor {
    /**
     * Accept {@link URI#toString()} of a file that the test being run depends on
     * 
     * @param dependency
     *            The {@link URI#toString()} of the dependency
     */
    void accept(String dependency);
}
