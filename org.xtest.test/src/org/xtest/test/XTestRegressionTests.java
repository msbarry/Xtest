package org.xtest.test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.junit.Test;
import org.xtest.XTestRunner;
import org.xtest.interpreter.XTestInterpreter;
import org.xtest.results.XTestResult;
import org.xtest.results.XTestState;
import org.xtest.types.XTestTypeProvider;
import org.xtest.xTest.Body;

import com.google.common.collect.Lists;
import com.google.inject.Injector;

/**
 * Container for testing bugs found running xtest to prevent regression
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XTestRegressionTests {
    private static Injector injector = XtestInjector.injector;
    private static XTestInterpreter interpreter = XtestInjector.injector
            .getInstance(XTestInterpreter.class);
    private static TypeConformanceComputer typeComputer = XtestInjector.injector
            .getInstance(TypeConformanceComputer.class);
    private static XTestTypeProvider typeProvider = XtestInjector.injector
            .getInstance(XTestTypeProvider.class);
    private static TypeReferences typeRefs = XtestInjector.injector
            .getInstance(TypeReferences.class);

    protected static void assertEvaluatesTo(Object object, Body body) throws Exception {
        assertEquals(object, invokeXbaseExpression(body));
    }

    protected static void assertReturnType(JvmTypeReference typeForName, Body parse)
            throws Exception {
        JvmTypeReference commonReturnType = typeProvider.getCommonReturnType(parse, true);
        assertTrue(typeComputer.isConformant(typeForName, commonReturnType, false));
    }

    protected static void assertValidationPassed(Body parse) throws Exception {
        IResourceValidator instance = injector.getInstance(IResourceValidator.class);
        Resource eResource = parse.eResource();
        List<Issue> validate = instance.validate(eResource, XTestRunner.CHECK_BUT_DONT_RUN,
                CancelIndicator.NullImpl);
        List<Issue> errors = Lists.newArrayList();
        for (Issue issue : validate) {
            if (issue.getSeverity() == Severity.ERROR) {
                errors.add(issue);
            }
        }
        assertEquals("[]", errors.toString());
    }

    protected static List<Issue> getWarningsRunTests(Body parse) throws Exception {
        IResourceValidator instance = injector.getInstance(IResourceValidator.class);
        Resource eResource = parse.eResource();
        List<Issue> validate = instance
                .validate(eResource, CheckMode.ALL, CancelIndicator.NullImpl);
        List<Issue> result = Lists.newArrayList();
        for (Issue issue : validate) {
            if (issue.getSeverity() == Severity.WARNING) {
                result.add(issue);
            }
        }
        return result;
    }

    protected static Object invokeXbaseExpression(Body expression) throws Exception {
        return interpreter.evaluate(expression).getResult();
    }

    protected static Body parse(String string) throws Exception {
        return XTestRunner.parse(string, injector);
    }

    protected static void runValidation(Body parse) throws Exception {
        IResourceValidator instance = injector.getInstance(IResourceValidator.class);
        Resource eResource = parse.eResource();
        instance.validate(eResource, XTestRunner.CHECK_BUT_DONT_RUN, CancelIndicator.NullImpl);
    }

    @Test
    public void runXTest() throws IOException {
        // TODO Get rid of this, eventually wean off of Junit tests
        BufferedReader in = new BufferedReader(new FileReader(
                "src/org/xtest/test/RegressionTests.xtest"));
        String line;
        StringBuilder builder = new StringBuilder();
        while ((line = in.readLine()) != null) {
            if (builder.length() > 0) {
                builder.append('\n');
            }
            builder.append(line);
        }
        in.close();
        XTestResult run = XTestRunner.run(builder.toString(), XtestInjector.injector);
        assertEquals(XTestState.PASS, run.getState());
    }
}
