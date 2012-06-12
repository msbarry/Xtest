package org.xtest.test;

import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.formatting.OrganizeImports;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtest.XTestRunner;
import org.xtest.interpreter.XTestInterpreter;
import org.xtest.results.XTestResult;
import org.xtest.results.XTestState;
import org.xtest.types.XTestTypeProvider;
import org.xtest.xTest.Body;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Injector;

public class TestUtils {
    public static OrganizeImports organizeImports = XtestInjector.injector
            .getInstance(OrganizeImports.class);

    public static TypeReferences typeRefs = XtestInjector.injector
            .getInstance(TypeReferences.class);

    private static Injector injector = XtestInjector.injector;

    private static XTestInterpreter interpreter = XtestInjector.injector
            .getInstance(XTestInterpreter.class);

    private static TypeConformanceComputer typeComputer = XtestInjector.injector
            .getInstance(TypeConformanceComputer.class);

    private static XTestTypeProvider typeProvider = XtestInjector.injector
            .getInstance(XTestTypeProvider.class);

    public static void assertEqualsNormalizeLinebreak(String expected, String actual) {
        String expectedNormalized = expected.replace("\r\n", "\n");
        String actualNormalized = actual.replace("\r\n", "\n");
        assertEquals(expectedNormalized, actualNormalized);
    }

    public static void assertEvaluatesTo(Object object, Body body) throws Exception {
        assertEquals(object, invokeXbaseExpression(body));
    }

    public static void assertProxyStackTrace(StackTraceElement element) {
        assertEquals("method name", "apply", element.getMethodName());
        assertTrue("proxy class", element.getClassName().startsWith("$Proxy"));
    }

    public static void assertReturnType(JvmTypeReference typeForName, Body parse) throws Exception {
        JvmTypeReference commonReturnType = typeProvider.getCommonReturnType(parse, true);
        assertTrue(typeComputer.isConformant(typeForName, commonReturnType, false));
    }

    public static void assertSetEquals(Set<?> actual, Object... expectedElements) {
        Set<?> expected = Sets.newHashSet(expectedElements);
        Set<?> doesntContain = Sets.difference(expected, actual);
        Set<?> shouldntContain = Sets.difference(actual, expected);
        if (!doesntContain.isEmpty() && !shouldntContain.isEmpty()) {
            fail("Got " + actual + ". " + "Should not have contained " + shouldntContain
                    + " and should have contained " + doesntContain);
        } else if (!doesntContain.isEmpty()) {
            fail("Got " + actual + ". Missing " + doesntContain);
        } else if (!shouldntContain.isEmpty()) {
            fail("Got " + actual + ". Should not have had " + shouldntContain);
        } else {
            // OK
        }
    }

    public static void assertStackTraceEquals(StackTraceElement element, String className,
            String methodName, String fileName, int lineNumber) {
        assertEquals("class name", className, element.getClassName());
        assertEquals("method name", methodName, element.getMethodName());
        assertEquals("file name", fileName, element.getFileName());
        assertEquals("line number", lineNumber, element.getLineNumber());
    }

    public static void assertValidationPassed(Body parse) throws Exception {
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

    public static void assertXtestPasses(String test) {
        XTestResult result = XTestRunner.run(test, injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(result.getEvaluationException().isEmpty());
        assertEquals(XTestState.PASS, result.getState());
    }

    public static void assertXtestPreEvalFailure(String test) {
        XTestResult result = XTestRunner.run(test, injector);
        assertTrue(!"[]".equals(result.getErrorMessages().toString()));
        assertEquals(XTestState.FAIL, result.getState());
    }

    public static void assertXtestStackTrace(StackTraceElement element, String methodName,
            int lineNumber) {
        assertStackTraceEquals(element, "__synthetic0.uri", methodName, "__synthetic0.uri",
                lineNumber);
    }

    public static XTestResult getResult(String input) {
        return XTestRunner.run(input, injector);
    }

    public static List<Issue> getWarningsRunTests(Body parse) throws Exception {
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

    public static Object invokeXbaseExpression(Body expression) throws Exception {
        return interpreter.evaluate(expression).getResult();
    }

    public static Body parse(String string) throws Exception {
        return XTestRunner.parse(string, injector);
    }

    public static void runValidation(Body parse) throws Exception {
        IResourceValidator instance = injector.getInstance(IResourceValidator.class);
        Resource eResource = parse.eResource();
        instance.validate(eResource, XTestRunner.CHECK_BUT_DONT_RUN, CancelIndicator.NullImpl);
    }

    public static String textOf(EObject eObject) {
        return NodeModelUtils.getNode(eObject).getText().trim();
    }

}
