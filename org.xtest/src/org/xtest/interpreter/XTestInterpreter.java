package org.xtest.interpreter;

import java.util.Stack;

import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.EvaluationException;
import org.eclipse.xtext.xbase.interpreter.impl.InterpreterCanceledException;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.xtest.XTestAssertException;
import org.xtest.XTestEvaluationException;
import org.xtest.results.XTestCaseResult;
import org.xtest.results.XTestSuiteResult;
import org.xtest.xTest.Body;
import org.xtest.xTest.UniqueName;
import org.xtest.xTest.XAssertExpression;
import org.xtest.xTest.XTestCase;
import org.xtest.xTest.XTestSuite;

import com.google.inject.Inject;

/**
 * Xtest interpreter, inherits behavior from Xbase, but adds handling for test cases and suites and
 * keeps track of the test suite being run, returning the final root test suite result
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XTestInterpreter extends XbaseInterpreter {
    private XTestSuiteResult result;
    private final Stack<XTestSuiteResult> stack = new Stack<XTestSuiteResult>();
    @Inject
    private TypeConformanceComputer typeConformanceComputer;
    @Inject
    private TypeReferences typeReferences;

    /**
     * Returns the test suite result after the tests have run
     * 
     * @return The test suite result
     */
    public XTestSuiteResult getTestResult() {
        return result;
    }

    /**
     * Evaluates an assert expression. Throws an {@link XTestAssertException} if the assert does not
     * succeed
     * 
     * @param assertExpression
     *            The expression to evaluate
     * @param context
     *            The evaluation context
     * @param indicator
     *            The cancel indicator
     * @return null
     */
    protected Object _evaluateAssertExpression(XAssertExpression assertExpression,
            IEvaluationContext context, CancelIndicator indicator) {
        XExpression resultExp = assertExpression.getActual();
        JvmTypeReference expected = assertExpression.getThrows();
        if (expected == null) {
            // normal assert
            Object result = internalEvaluate(resultExp, context, indicator);
            if (!(result instanceof Boolean) || !(Boolean) result) {
                throw new XTestAssertException(assertExpression);
            }
        } else {
            // assert exception
            try {
                internalEvaluate(resultExp, context, indicator);
                throw new XTestAssertException(assertExpression);
            } catch (Throwable throwable) {
                while (throwable instanceof XTestEvaluationException) {
                    // This is a wrapped exception, unwrap it
                    throwable = ((XTestEvaluationException) throwable).getCause();
                }
                JvmTypeReference actual = typeReferences.getTypeForName(throwable.getClass(),
                        assertExpression);
                if (!typeConformanceComputer.isConformant(expected, actual)) {
                    throw new XTestAssertException(assertExpression);
                }
            }
        }

        return null;
    }

    /**
     * Evaluates the xtest script body. Catches any exceptions thrown.
     * 
     * @param main
     *            The main body to evaluate
     * @param context
     *            The evaluation context
     * @param indicator
     *            The cancel indicator
     * @return null
     */
    protected Object _evaluateBody(Body main, IEvaluationContext context, CancelIndicator indicator) {
        result = new XTestSuiteResult(main);
        stack.push(result);
        try {
            super._evaluateBlockExpression(main, context, indicator);
        } catch (XTestEvaluationException e) {
            result.addEvaluationException(e);
        }
        return null;
    }

    /**
     * Evaluates the xtest test case. Catches any evaluation exceptions or assertion exceptions
     * thrown and adds them to the test suite. If the end is reached, the test passes
     * 
     * @param testCase
     *            The test case to evaluate
     * @param context
     *            The evaluation context
     * @param indicator
     *            The cancel indicator
     * @return null
     */
    protected Object _evaluateTestCase(XTestCase testCase, IEvaluationContext context,
            CancelIndicator indicator) {
        UniqueName name = testCase.getName();
        String nameStr = getName(name, context, indicator);
        XExpression expression = testCase.getExpression();
        XTestSuiteResult peek = stack.peek();
        XTestCaseResult subCase = peek.subCase(nameStr, testCase);
        try {
            internalEvaluate(expression, context, indicator);
            // If no exceptions thrown, the test passed
            subCase.pass();
        } catch (XTestAssertException e) {
            subCase.addFailedAssertion(e);
        } catch (XTestEvaluationException e) {
            subCase.addEvaluationException(e);
        }

        return null;
    }

    /**
     * Evaluates the xtest test suite. Catches any evaluation exceptions thrown and adds them to the
     * test suite.
     * 
     * @param suite
     *            The test suite to evaluate
     * @param context
     *            The evaluation context
     * @param indicator
     *            The cancel indicator
     * @return null
     */
    protected Object _evaluateTestSuite(XTestSuite suite, IEvaluationContext context,
            CancelIndicator indicator) {
        UniqueName name = suite.getName();
        String nameStr = getName(name, context, indicator);
        XExpression expression = suite.getExpression();
        XTestSuiteResult peek = stack.peek();
        XTestSuiteResult subSuite = peek.subSuite(nameStr, suite);
        stack.push(subSuite);
        try {
            internalEvaluate(expression, context, indicator);
        } catch (XTestEvaluationException e) {
            subSuite.addEvaluationException(e);
        }
        stack.pop();
        return null;
    }

    /*
     * Override default expression evaluator to wrap thrown exceptions with an xtest evaluation
     * exception wrapper that contains the expression that threw the exception
     */
    @Override
    protected Object internalEvaluate(XExpression expression, IEvaluationContext context,
            CancelIndicator indicator) throws EvaluationException {
        Object internalEvaluate;
        try {
            internalEvaluate = super.internalEvaluate(expression, context, indicator);
        } catch (InterpreterCanceledException e) {
            throw e;
        } catch (RuntimeException e) {
            if (e instanceof XTestAssertException || e instanceof XTestEvaluationException) {
                throw e;
            } else {
                Throwable cause = e;
                while (cause instanceof RuntimeException && cause.getCause() != null) {
                    cause = cause.getCause();
                }
                throw new XTestEvaluationException(cause, expression);
            }
        }
        return internalEvaluate;
    }

    /**
     * Evaluates a {@link UniqueName} and returns the result
     * 
     * @param uniqueName
     *            The {@link UniqueName} object of the case or suite
     * @param context
     *            The evaluation context
     * @param indicator
     *            The cancel indicator
     * @return The name derived from uniqueName
     */
    private String getName(UniqueName uniqueName, IEvaluationContext context,
            CancelIndicator indicator) {
        String name = uniqueName.getName();
        XExpression uidExp = uniqueName.getIdentifier();
        if (uidExp != null) {
            Object nameObj = internalEvaluate(uidExp, context, indicator);
            if (nameObj != null) {
                name += " (" + nameObj.toString() + ")";
            }
        }
        return name;
    }
}
