package org.xtest;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.junit.util.ParseHelper;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.impl.InterpreterCanceledException;
import org.xtest.interpreter.XTestInterpreter;
import org.xtest.results.XTestState;
import org.xtest.results.XTestSuiteResult;
import org.xtest.xTest.Body;

import com.google.inject.Inject;
import com.google.inject.Injector;
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
    private static final CheckMode CHECK_BUT_DONT_RUN = new DontRunCheck();

    /**
     * Links a string into an xtest object model
     * 
     * @param string
     *            String containing the xtest script to run
     * @param injector
     *            The Guice injector to use
     * @return The linked xtest object model
     * @throws Exception
     *             if an error occurs parsing the string
     */
    public static Body parse(String string, Injector injector) throws Exception {
        Body parse = (Body) injector.getInstance(ParseHelper.class).parse(string);
        return parse;
    }

    /**
     * Runs a xtest script contained inside a string
     * 
     * @param string
     *            string containing the xtest script to run
     * @param injector
     *            The Guice injector to use
     * @return The xtest suite results
     */
    public static XTestSuiteResult run(String string, Injector injector) {
        XTestSuiteResult result;
        try {
            Body parse = parse(string, injector);
            result = new XTestSuiteResult(parse);
            List<Issue> validate = injector.getInstance(IResourceValidator.class).validate(
                    parse.eResource(), CHECK_BUT_DONT_RUN, CancelIndicator.NullImpl);
            for (Issue issue : validate) {
                if (issue.getSeverity() == Severity.ERROR) {
                    result.addSyntaxError(issue.getLineNumber() + ": " + issue.getMessage());
                }
            }
            if (result.getState() != XTestState.FAIL) {
                result = injector.getInstance(XTestRunner.class).run(parse,
                        CancelIndicator.NullImpl);
            }
        } catch (Exception e) {
            result = new XTestSuiteResult(null);
            result.fail();
        }

        return result;
    }

    @Inject
    private Provider<IEvaluationContext> contextProvider;

    @Inject
    private Provider<XTestInterpreter> interpreterProvider;

    /**
     * Interprets an already linked xtest object model
     * 
     * @param main
     *            The linked xtest object model
     * @param monitor
     *            The progress monitor to tell if canceled
     * @return The xtest suite result
     */
    public XTestSuiteResult run(Body main, CancelIndicator monitor) {
        XTestSuiteResult result;
        result = new XTestSuiteResult(main);
        XTestInterpreter interpreter = getInterpreter(main.eResource());
        boolean failed = false;
        try {
            interpreter.evaluate(main, contextProvider.get(), monitor);
        } catch (InterpreterCanceledException e) {
        } catch (Throwable e) {
            failed = true;
        }
        result = interpreter.getTestResult();
        if (failed) {
            result.fail();
        }
        return result;
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
     * CheckMode for validating the xtest script only without running the test cases
     */
    public static class DontRunCheck extends CheckMode {
        CheckMode mode = CheckMode.FAST_ONLY;

        @Override
        public boolean shouldCheck(CheckType type) {
            return mode.shouldCheck(type);
        }

    }
}
