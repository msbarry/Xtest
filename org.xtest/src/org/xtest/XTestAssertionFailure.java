package org.xtest;

/**
 * Special exception that stores the expression that caused the assertion failure
 * 
 * @author Michael Barry
 */
public class XTestAssertionFailure extends RuntimeException {
    private static final long serialVersionUID = -2412965647239842905L;

    /**
     * Constructs a new assertion exception wrapping the assertion expression provided
     * 
     * @param failure
     *            The failed assertion message to wrap
     */
    public XTestAssertionFailure(String failure) {
        super(failure);
    }
}
