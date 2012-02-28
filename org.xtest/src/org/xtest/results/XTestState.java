package org.xtest.results;

/**
 * XTest suite or case state
 */
public enum XTestState {
    /** Test failed or at least one subtest failed */
    FAIL,
    /** Test hasn't run yet */
    NOT_RUN,
    /** Test and all subtests failed */
    PASS
}
