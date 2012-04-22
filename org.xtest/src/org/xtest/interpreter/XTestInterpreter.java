package org.xtest.interpreter;

import java.util.Set;
import java.util.Stack;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVoid;
import org.eclipse.xtext.common.types.access.impl.ClassFinder;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.DefaultEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.EvaluationException;
import org.eclipse.xtext.xbase.interpreter.impl.InterpreterCanceledException;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.xtest.XTestAssertException;
import org.xtest.XTestEvaluationException;
import org.xtest.results.XTestResult;
import org.xtest.results.XTestState;
import org.xtest.xTest.Body;
import org.xtest.xTest.UniqueName;
import org.xtest.xTest.XAssertExpression;
import org.xtest.xTest.XTestExpression;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

/**
 * Xtest interpreter, inherits behavior from Xbase, but adds handling for running tests and keeps
 * track of the tests being run, returning the final root test
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XTestInterpreter extends XbaseInterpreter {
    private final Set<XExpression> executedExpressions = Sets.newHashSet();
    private XTestResult result;
    private final Stack<XTestResult> stack = new Stack<XTestResult>();
    @Inject
    private TypeConformanceComputer typeConformanceComputer;
    @Inject
    private TypeReferences typeReferences;

    @Override
    public IEvaluationResult evaluate(XExpression expression, IEvaluationContext context,
            CancelIndicator indicator) {
        try {
            return super.evaluate(expression, context, indicator);
        } catch (ReturnValue e) {
            return new DefaultEvaluationResult(e.returnValue, null);
        }
    }

    /**
     * Returns the list of executed expressions
     * 
     * @return The list of executed expressions
     */
    public Set<XExpression> getExecutedExpressions() {
        return executedExpressions;
    }

    /**
     * Returns the test suite result after the tests have run
     * 
     * @return The test result
     */
    public XTestResult getTestResult() {
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
        boolean returnVal = true;
        if (expected == null) {
            // normal assert
            Object result = internalEvaluate(resultExp, context, indicator);
            if (!(result instanceof Boolean) || !(Boolean) result) {
                handleAssertionFailure(assertExpression);
                returnVal = false;
            }
        } else {
            // assert exception
            try {
                internalEvaluate(resultExp, context, indicator);
                handleAssertionFailure(assertExpression);
                returnVal = false;
            } catch (XTestEvaluationException exception) {
                Throwable throwable = exception.getCause();
                JvmTypeReference actual = typeReferences.getTypeForName(throwable.getClass(),
                        assertExpression);
                if (!typeConformanceComputer.isConformant(expected, actual)) {
                    throw new XTestAssertException(assertExpression);
                }
            }
        }

        return returnVal;
    }

    @Override
    protected Object _evaluateAssignment(XAssignment assignment, IEvaluationContext context,
            CancelIndicator indicator) {
        if (assignment.getAssignable() instanceof XFeatureCall && assignment.getFeature() == null) {
            assignment.setFeature(((XFeatureCall) assignment.getAssignable()).getFeature());
        }
        return super._evaluateAssignment(assignment, context, indicator);
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
        if (result == null) {
            // In case this is called outside of the context of XtestDiagnostician
            result = new XTestResult(main);
        }
        stack.push(result);
        Object toReturn = null;
        try {
            toReturn = super._evaluateBlockExpression(main, context, indicator);
            if (result.getState() != XTestState.FAIL) {
                result.pass();
            }
        } catch (ReturnValue e) {
            toReturn = e.returnValue;
            result.pass();
        } catch (XTestAssertException e) {
            result.addFailedAssertion(e.getExpression());
        } catch (XTestEvaluationException e) {
            result.addEvaluationException(e);
        }
        return toReturn;
    }

    @Override
    protected Object _evaluateReturnExpression(XReturnExpression returnExpr,
            IEvaluationContext context, CancelIndicator indicator) {
        // Need to reimplement xbase's return expression since I need to catch all exceptions and
        // handle return exception but I don't have access to package-protected ReturnValue
        Object returnValue = internalEvaluate(returnExpr.getExpression(), context, indicator);
        throw new ReturnValue(returnValue);
    }

    /**
     * Evaluates the test. Catches any evaluation exceptions thrown and adds them to the test.
     * 
     * @param test
     *            The test to evaluate
     * @param context
     *            The evaluation context
     * @param indicator
     *            The cancel indicator
     * @return null
     */
    protected Object _evaluateTestExpression(XTestExpression test, IEvaluationContext context,
            CancelIndicator indicator) {
        UniqueName name = test.getName();
        String nameStr = getName(name, context, indicator);
        XExpression expression = test.getExpression();
        XTestResult peek = stack.peek();
        XTestResult subTest = peek.subTest(nameStr, test);
        stack.push(subTest);
        try {
            internalEvaluate(expression, context, indicator);
            if (subTest.getState() != XTestState.FAIL) {
                subTest.pass();
            }
        } catch (ReturnValue e) {
            subTest.pass();
        } catch (XTestAssertException e) {
            subTest.addFailedAssertion(e.getExpression());
        } catch (XTestEvaluationException e) {
            subTest.addEvaluationException(e);
        }
        stack.pop();
        return null;
    }

    /**
     * Handles a feature call to retrieve the class of a class
     * 
     * @param jvmVoid
     *            Void because feature is null in this case
     * @param featureCall
     *            The feature call expression
     * @param receiver
     *            The receiver, null in this case
     * @param context
     *            The context
     * @param indicator
     *            The cancellation indicator
     * @return The class of the declared type from {@code featureCall}
     */
    protected Object _featureCallVoid(JvmVoid jvmVoid, XFeatureCall featureCall, Object receiver,
            IEvaluationContext context, CancelIndicator indicator) {
        JvmDeclaredType declaringType = featureCall.getDeclaringType();
        ClassFinder classFinder = getClassFinder();
        Class<?> clazz = null;
        try {
            clazz = classFinder.forName(declaringType.getQualifiedName());
        } catch (ClassNotFoundException e) {
        }
        return clazz;
    }

    /*
     * Override default expression evaluator to wrap thrown exceptions with an xtest evaluation
     * exception wrapper that contains the expression that threw the exception
     */
    @Override
    protected Object internalEvaluate(XExpression expression, IEvaluationContext context,
            CancelIndicator indicator) throws EvaluationException {
        Object internalEvaluate;
        executedExpressions.add(expression);
        try {
            internalEvaluate = super.internalEvaluate(expression, context, indicator);
        } catch (ReturnValue value) {
            throw value;
        } catch (InterpreterCanceledException e) {
            throw e;
        } catch (Throwable e) {
            if (e instanceof XTestAssertException || e instanceof XTestEvaluationException) {
                throw (RuntimeException) e;
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
     *            The {@link UniqueName} object of the test
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

    private void handleAssertionFailure(XAssertExpression assertExpression) {
        if (assertExpression.isKeepGoing()) {
            XTestResult peek = stack.peek();
            peek.addFailedAssertion(assertExpression);
        } else {
            throw new XTestAssertException(assertExpression);
        }
    }

    private static class ReturnValue extends RuntimeException {
        private static final long serialVersionUID = 7864448463694945628L;
        public Object returnValue;

        public ReturnValue(Object value) {
            super();
            this.returnValue = value;
        }
    }
}
