package org.xtest;

import org.eclipse.xtext.xbase.XExpression;

/**
 * Special exception that stores the expression that caused the evaluation
 * exception
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XTestEvaluationException extends RuntimeException {
    private static final long serialVersionUID = -3396029672833078793L;
    private final XExpression expression;

    /**
     * Constructs a new evaluation exception wrapping the expression provided
     * 
     * @param cause
     *            The original exception
     * @param expression
     *            The assertion expression to wrap
     */
    public XTestEvaluationException(Throwable cause, XExpression expression) {
        super(cause);
        this.expression = expression;
    }

    /**
     * Returns the assertion expression this exception wraps
     * 
     * @return The assertion expression this exception wraps
     */
    public XExpression getExpression() {
        return expression;
    }

}
