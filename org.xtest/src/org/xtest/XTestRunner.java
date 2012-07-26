package org.xtest;

import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.InterpreterCanceledException;
import org.xtest.interpreter.XTestInterpreter;
import org.xtest.interpreter.XtestEvaluationResult;
import org.xtest.results.XTestResult;
import org.xtest.xTest.Body;

import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;

/**
 * Entry point for running an xtest script
 * 
 * @author Michael Barry
 */
@Singleton
@SuppressWarnings("restriction")
public class XTestRunner {
    /**
     * {@link CheckMode} that validates the file without running tests
     */
    public static final CheckMode CHECK_BUT_DONT_RUN = new DontRunCheck();

    @Inject
    private Provider<IEvaluationContext> contextProvider;

    private Set<XExpression> executed = Sets.newHashSet();

    @Inject
    private Provider<XTestInterpreter> interpreterProvider;

    /**
     * Returns the list of executed expressions
     * 
     * @param main
     *            The main body of the xtest file
     * @return The list of executed expressions
     */
    public Set<XExpression> getUnexecutedExpressions(Body main) {
        Set<XExpression> unexecuted = Sets.newHashSet();
        // Only mark unexecuted from list of expressions, otherwise will mark file properties as
        // unexecuted
        EList<XExpression> expressions = main.getExpressions();
        for (XExpression expression : expressions) {
            TreeIterator<EObject> eAllContents = expression.eAllContents();
            while (eAllContents.hasNext()) {
                EObject next = eAllContents.next();
                if (next instanceof XExpression && !executed.contains(next)) {
                    unexecuted.add((XExpression) next);
                }
            }
        }
        // remove contained EObjects, only mark warning on outer container
        Set<EObject> toRemove = Sets.newHashSet();
        for (XExpression expression : unexecuted) {
            toRemove.addAll(expression.eContents());
        }
        unexecuted.removeAll(toRemove);
        return unexecuted;
    }

    /**
     * Interprets an already linked xtest object model
     * 
     * @param main
     *            The linked xtest object model
     * @param monitor
     *            The progress monitor to tell if canceled
     * @return The test result
     */
    public XTestResult run(Body main, RunType weight, CancelIndicator monitor) {
        XTestInterpreter interpreter = getInterpreter(main.eResource());
        try {
            IEvaluationResult resultObject = null;
            boolean failed = false;
            try {
                resultObject = interpreter.evaluate(main, contextProvider.get(), monitor);
            } catch (InterpreterCanceledException e) {
            } catch (Throwable e) {
                failed = true;
            }
            XTestResult result = new XTestResult(main);
            if (resultObject instanceof XtestEvaluationResult) {
                XtestEvaluationResult evalResult = (XtestEvaluationResult) resultObject;
                result = evalResult.getXtestResult();
                executed = evalResult.getExpressions();
            }
            if (failed) {
                result.fail();
            }
            result.setResultObject(resultObject.getResult());
            return result;
        } finally {
            cleanupInterpreter(interpreter);
        }
    }

    /**
     * Perform cleanup on interpreter after a test run has finished
     * 
     * @param interpreter
     *            The interpreter to clean up
     */
    protected void cleanupInterpreter(XTestInterpreter interpreter) {

    }

    /**
     * Gets the xtest interpreter to use so that subclasses can change this behavior
     * 
     * @param resource
     *            The resource
     * @return the xtest interpreter to use
     */
    protected XTestInterpreter getInterpreter(Resource resource) {
        XTestInterpreter interpreter = interpreterProvider.get();
        return interpreter;
    }

    /**
     * CheckMode for validating the xtest script only without running the tests
     */
    public static class DontRunCheck extends CheckMode {
        CheckMode mode = CheckMode.FAST_ONLY;

        @Override
        public boolean shouldCheck(CheckType type) {
            return mode.shouldCheck(type);
        }

    }
}
