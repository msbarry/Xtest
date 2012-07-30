package org.xtest.runner.events;

import java.util.Set;

import org.eclipse.core.resources.IFile;

/**
 * Event indicating that a test run has started.
 * 
 * @author Michael Barry
 */
public class TestDeleted {

    private final Set<IFile> tests;

    /**
     * Package-protected constructor so this can only be instantiated by {@link Events}
     * 
     * @param num
     *            The tests that have been deleted
     */
    TestDeleted(Set<IFile> tests) {
        this.tests = tests;
    }

    /**
     * Returns the tests that have been deleted
     * 
     * @return The tests that have been deleted
     */
    public Set<IFile> getTests() {
        return tests;
    }

}
