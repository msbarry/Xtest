package org.xtest.interpreter;

import java.util.Set;

import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.xtest.results.XTestResult;

/**
 * Custom evaluation result that also contains the set of executed expressions and the test result
 * structure
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestEvaluationResult implements IEvaluationResult {
    private final Set<XExpression> expressions;
    private final IEvaluationResult other;
    private final XTestResult xtestResult;

    /**
     * Constructs an evaluation result
     * 
     * @param other
     *            The other result to wrap
     * @param expressions
     *            The set of executed expressions
     * @param xtestResult
     *            The test result
     */
    public XtestEvaluationResult(IEvaluationResult other, Set<XExpression> expressions,
            XTestResult xtestResult) {
        this.other = other;
        this.expressions = expressions;
        this.xtestResult = xtestResult;
    }

    @Override
    public Throwable getException() {
        return other.getException();
    }

    /**
     * Returns the set of executed expressions
     * 
     * @return The set of executed expressions
     */
    public Set<XExpression> getExpressions() {
        return expressions;
    }

    @Override
    public Object getResult() {
        return other.getResult();
    }

    /**
     * Returns the test result structure
     * 
     * @return The test result structure
     */
    public XTestResult getXtestResult() {
        return xtestResult;
    }

}
