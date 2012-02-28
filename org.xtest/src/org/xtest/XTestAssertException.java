package org.xtest;

import org.xtest.xTest.XAssertExpression;

/**
 * Special exception that stores the expression that caused the assertion
 * failure
 */
public class XTestAssertException extends RuntimeException {
    private static final long serialVersionUID = -2412965647239842905L;

    private final XAssertExpression assertExpression;

    /**
     * Constructs a new assertion exception wrapping the assertion expression
     * provided
     * 
     * @param assertExpression
     *            The assertion expression to wrap
     */
    public XTestAssertException(XAssertExpression assertExpression) {
        this.assertExpression = assertExpression;
    }

    /**
     * Returns the assertion expression this exception wraps
     * 
     * @return The assertion expression this exception wraps
     */
    public XAssertExpression getExpression() {
        return assertExpression;
    }
}
