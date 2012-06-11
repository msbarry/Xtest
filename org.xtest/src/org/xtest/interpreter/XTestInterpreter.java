package org.xtest.interpreter;

import java.util.Set;
import java.util.Stack;
import java.util.concurrent.Callable;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVoid;
import org.eclipse.xtext.common.types.access.impl.ClassFinder;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XReturnExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.DefaultEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.EvaluationException;
import org.eclipse.xtext.xbase.interpreter.impl.InterpreterCanceledException;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.xtest.XtestUtil;
import org.xtest.XTestAssertionFailure;
import org.xtest.XTestEvaluationException;
import org.xtest.results.XTestResult;
import org.xtest.results.XTestState;
import org.xtest.xTest.Body;
import org.xtest.xTest.UniqueName;
import org.xtest.xTest.XAssertExpression;
import org.xtest.xTest.XSafeExpression;
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
    private final Stack<XExpression> callStack = new Stack<XExpression>();
    // TODO move some of this stuff into custom context
    private final Set<XExpression> executedExpressions = Sets.newHashSet();
    private int inSafeBlock = 0;
    private XTestResult result;
    private StackTraceElement[] startTrace = null;
    private final Stack<XTestResult> testStack = new Stack<XTestResult>();
    @Inject
    private TypeConformanceComputer typeConformanceComputer;
    @Inject
    private TypeReferences typeReferences;

    @Override
    public IEvaluationResult evaluate(XExpression expression, IEvaluationContext context,
            CancelIndicator indicator) {
        try {
            IEvaluationResult evaluate;
            if (expression.eContainer() instanceof XClosure) {
                evaluate = evaluateInsideOfClosure(expression, context, indicator);
            } else {
                startTrace = Thread.currentThread().getStackTrace();
                evaluate = super.evaluate(expression, context, indicator);
            }
            return evaluate;
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
     * Evaluates an assert expression. Throws an {@link XTestAssertionFailure} if the assert does
     * not succeed
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
                    throw new XTestAssertionFailure("Assertion failed");
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
        testStack.push(result);
        Object toReturn = null;
        try {
            toReturn = super._evaluateBlockExpression(main, context, indicator);
            if (result.getState() != XTestState.FAIL) {
                result.pass();
            }
        } catch (ReturnValue e) {
            toReturn = e.returnValue;
            result.pass();
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
     * Evaluates an expression inside an exception-safe block that marks exceptions in containing
     * tests but continues execution if an exception occurs
     * 
     * @param expression
     *            The expression to evaluate
     * @param context
     *            The context of evaluation
     * @param indicator
     *            The cancel indicator
     * @return The result of evaluation the expression, or null if exception was thrown
     */
    protected Object _evaluateSafeExpression(XSafeExpression expression,
            IEvaluationContext context, CancelIndicator indicator) {
        XExpression actual = expression.getActual();
        inSafeBlock++;
        Object result = null;
        try {
            result = actual == null ? null : internalEvaluate(actual, context, indicator);
        } finally {
            inSafeBlock--;
        }
        return result;
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
        String nameStr = getName(name, test, context, indicator);
        XExpression expression = test.getExpression();
        XTestResult peek = testStack.peek();
        XTestResult subTest = peek.subTest(nameStr, test);
        testStack.push(subTest);
        try {
            internalEvaluate(expression, context, indicator);
            if (subTest.getState() != XTestState.FAIL) {
                subTest.pass();
            }
        } catch (ReturnValue e) {
            subTest.pass();
        } catch (XTestEvaluationException e) {
            subTest.addEvaluationException(e);
        }
        testStack.pop();
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
        XExpression previous = null;
        if (!callStack.empty()) {
            previous = callStack.pop();
        }
        callStack.push(expression);
        try {
            // replace top of stack with current expression
            internalEvaluate = super.internalEvaluate(expression, context, indicator);
        } catch (ReturnValue value) {
            throw value;
        } catch (InterpreterCanceledException e) {
            throw e;
        } catch (Throwable e) {
            if (e instanceof XTestEvaluationException) {
                throw (RuntimeException) e;
            } else {
                Throwable cause = e;
                while (cause instanceof RuntimeException
                        && !(cause instanceof XTestEvaluationException) && cause.getCause() != null) {
                    cause = cause.getCause();
                }
                if (cause instanceof XTestEvaluationException) {
                    throw (RuntimeException) cause;
                }
                internalEvaluate = null;
                handleEvaluationException(cause, expression);
            }
        } finally {
            callStack.pop();
            callStack.push(previous != null ? previous : expression);
        }
        return internalEvaluate;
    }

    private IEvaluationResult evaluateInsideOfClosure(final XExpression expression,
            final IEvaluationContext context, final CancelIndicator indicator) {
        // Same as super.internalEvaluate ...
        // push this layer onto the call stack
        callStack.push(expression);
        try {
            Object result = XtestUtil.runOnNewLevelOfXtestStack(new Callable<Object>() {
                @Override
                public Object call() throws Exception {
                    return internalEvaluate(expression, context, indicator != null ? indicator
                            : CancelIndicator.NullImpl);
                }
            });
            return new DefaultEvaluationResult(result, null);
        } catch (ReturnValue e) {
            return new DefaultEvaluationResult(e.returnValue, null);
        } catch (XTestEvaluationException e) {
            // ... except throw Xtest evaluation exceptions to be handled by outer expression
            throw e;
        } catch (EvaluationException e) {
            return new DefaultEvaluationResult(null, e.getCause());
        } catch (InterpreterCanceledException e) {
            return null;
        } catch (Exception e) {
            return new DefaultEvaluationResult(null, e);
        } finally {
            callStack.pop();
        }
    }

    /**
     * Evaluates a {@link UniqueName} and returns the result
     * 
     * @param uniqueName
     *            The {@link UniqueName} object of the test
     * @param test
     *            The test expression for if no name is given
     * @param context
     *            The evaluation context
     * @param indicator
     *            The cancel indicator
     * @return The name derived from uniqueName
     */
    private String getName(UniqueName uniqueName, XTestExpression test, IEvaluationContext context,
            CancelIndicator indicator) {
        String name = uniqueName.getName();
        XExpression uidExp = uniqueName.getIdentifier();
        if (uidExp != null) {
            Object nameObj = internalEvaluate(uidExp, context, indicator);
            if (nameObj != null) {
                if (name == null) {
                    // no ID specified
                    name = nameObj.toString();
                } else {
                    name += " (" + nameObj.toString() + ")";
                }
            }
        }
        if (name == null) {
            XExpression expression = test.getExpression();
            name = XtestUtil.getText(expression);
        }
        return name;
    }

    private void handleAssertionFailure(XAssertExpression assertExpression) {
        throw new XTestAssertionFailure("Assertion Failed");
    }

    private void handleEvaluationException(Throwable toWrap, XExpression expression) {
        // Start from the root of the stack and work down until a call has been made that jumps
        // locations in the file, want to drill down to the most specific expression contained
        // within the top-level expression that caused the exception
        XExpression cause = callStack.firstElement();
        for (XExpression element : callStack) {
            if (!org.eclipse.xtext.EcoreUtil2.isAncestor(cause, element)) {
                break;
            }
            cause = element;
        }
        toWrap = XtestUtil.getRootCause(toWrap);
        XTestEvaluationException toThrow = new XTestEvaluationException(toWrap, cause);
        StackTraceElement[] generatedStack = XtestUtil.generateXtestStackTrace(startTrace,
                toWrap.getStackTrace(), callStack);
        toWrap.setStackTrace(generatedStack);
        if (inSafeBlock > 0) {
            XTestResult peek = testStack.peek();
            peek.addEvaluationException(toThrow);
        } else {
            throw toThrow;
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
