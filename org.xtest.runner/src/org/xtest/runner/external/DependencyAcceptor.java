package org.xtest.runner.external;

import java.net.URI;

/**
 * Pass to client test runner to accepts test dependencies
 * 
 * @author Michael Barry
 */
public interface DependencyAcceptor {
    /**
     * Accept {@link URI} of a file that the test being run depends on
     * 
     * @param dependency
     *            The {@link URI} of the dependency
     */
    void accept(URI dependency);
}
