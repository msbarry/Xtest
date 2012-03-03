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
            result = injector.getInstance(XTestRunner.class).validateAndRun(parse);
        } catch (Exception e) {
            result = new XTestSuiteResult(null);
            result.fail();
        }

        return result;
    }

    @Inject
    private Provider<XTestInterpreter> interpreterProvider;

    @Inject
    private IResourceValidator validator;

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
     * Interprets an already linked xtest object model
     * 
     * @param main
     *            The linked xtest object model
     * @return The xtest suite result
     */
    public XTestSuiteResult run(Body main) {
        XTestSuiteResult result;
        result = new XTestSuiteResult(main);
        XTestInterpreter interpreter = getInterpreter(main.eResource());
        interpreter.evaluate(main);
        result = interpreter.getTestResult();
        return result;
    }

    /**
     * Validate an xtest test first and then run it, for when not running from the validator itself.
     * 
     * @param body
     *            The body of the test
     * @return The result of the tests.
     */
    public XTestSuiteResult validateAndRun(Body body) {
        XTestSuiteResult result = new XTestSuiteResult(body);
        List<Issue> validate = validator.validate(body.eResource(), CHECK_BUT_DONT_RUN,
                CancelIndicator.NullImpl);
        for (Issue issue : validate) {
            if (issue.getSeverity() == Severity.ERROR) {
                result.addSyntaxError(issue.getLineNumber() + ": " + issue.getMessage());
            }
        }
        if (result.getState() != XTestState.FAIL) {
            result = run(body);
        }
        return result;
    }
}
