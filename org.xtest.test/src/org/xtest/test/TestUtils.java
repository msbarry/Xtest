package org.xtest.test;

import static junit.framework.Assert.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.formatting.OrganizeImports;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.XExpression;
import org.xtest.XTestEvaluationException;
import org.xtest.XTestRunner;
import org.xtest.interpreter.XTestInterpreter;
import org.xtest.results.XTestResult;
import org.xtest.results.XTestState;
import org.xtest.types.XTestTypeProvider;
import org.xtest.xTest.Body;

import com.google.common.collect.Iterables;
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

    private static TypesFactory typesFactory = XtestInjector.injector
            .getInstance(TypesFactory.class);

    public static void assertEqualsNormalizeLinebreak(String expected, String actual) {
        String expectedNormalized = expected.replace("\r\n", "\n");
        String actualNormalized = actual.replace("\r\n", "\n");
        assertEquals(expectedNormalized, actualNormalized);
    }

    public static void assertEvaluatesTo(Object object, Body val) {
        XTestResult run = XTestRunner.run(val, injector);
        Collection<XTestEvaluationException> exceptions = run.getEvaluationException();
        assertTrue(exceptions.toString(), exceptions.isEmpty());
        assertEquals("evaluation result", object, run.getResultObject());
    }

    public static void assertInvalidSyntax(String script) throws Exception {
        Body val = parse(script);
        assertValidationFailed(val);
    }

    public static void assertIsValidAndEvaluatesTo(Object object, String script) throws Exception {
        Body val = parse(script);
        assertValidationPassed(val);
        assertEvaluatesTo(object, val);
    }

    @SuppressWarnings("restriction")
    public static void assertIsValidAndTypeConformsTo(String script, Class<?> type)
            throws Exception {
        Body val = parse(script);
        assertValidationPassed(val);
        JvmType findDeclaredType = typeRefs.findDeclaredType(type, val);
        assertNotNull("type for " + type.getSimpleName(), findDeclaredType);
        JvmParameterizedTypeReference createTypeRef = typeRefs.createTypeRef(findDeclaredType);
        assertIsValidAndTypeConformsTo(val, createTypeRef);
    }

    public static void assertIsValidAndTypeConformsToArray(String script, Class<?> type)
            throws Exception {
        Body val = parse(script);
        assertValidationPassed(val);
        JvmType findDeclaredType = typeRefs.findDeclaredType(type, val);
        assertNotNull("type for " + type.getSimpleName(), findDeclaredType);
        JvmParameterizedTypeReference createTypeRef = typeRefs.createTypeRef(findDeclaredType);
        JvmGenericArrayTypeReference arraytype = typeRefs.createArrayType(createTypeRef);
        assertIsValidAndTypeConformsTo(val, arraytype);
    }

    public static void assertIsValidAndVoidType(String script) throws Exception {
        Body val = parse(script);
        assertValidationPassed(val);
        JvmTypeReference commonReturnType = typeProvider.getCommonReturnType(val, true);
        assertNotNull("computed common return type", commonReturnType);
        JvmParameterizedTypeReference createTypeRef = typeRefs.createTypeRef(typesFactory
                .createJvmVoid());
        boolean conformant = typeComputer.isConformant(createTypeRef, commonReturnType);
        assertTrue("'" + commonReturnType + "' does not conform to '" + createTypeRef + "'",
                conformant);
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

    public static void assertTestPasses(String val) throws Exception {
        assertValidSyntax(val);
        XTestResult run = XTestRunner.run(val, injector);
        Collection<XTestEvaluationException> exceptions = run.getEvaluationException();
        assertTrue(exceptions.toString(), exceptions.isEmpty());
        assertTrue("test passes", run.getState() == XTestState.PASS);
    }

    public static void assertThrowsExceptionForExpression(String script, String exceptionMessage) {
        XTestResult run = XTestRunner.run(script, injector);
        assertEquals("number of exceptions thrown", 1, run.getEvaluationException().size());
        XExpression expression = Iterables.getFirst(run.getEvaluationException(), null)
                .getExpression();
        assertEquals("thrown exception message", exceptionMessage, textOf(expression));
    }

    public static void assertThrowsExceptionInSubtest(String script, String exceptionMessage) {
        XTestResult run = XTestRunner.run(script, injector);
        assertEquals("number of top-level exceptions thrown", 0, run.getEvaluationException()
                .size());
        assertEquals("number of sub-tests", 1, run.getSubTests().size());
        assertEquals("number of exceptions thrown in sub-test", 1, run.getSubTests().get(0)
                .getEvaluationException().size());
        assertEquals("exception thrown in sub-test", exceptionMessage,
                textOf(Iterables.getFirst(run.getSubTests().get(0).getEvaluationException(), null)
                        .getExpression()));
    }

    public static void assertValidationFailed(Body parse) throws Exception {
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
        assertTrue("expected to find errors but did not", !errors.isEmpty());
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
        if (!errors.isEmpty()) {
            fail(errors.toString());
        }
    }

    public static void assertValidSyntax(String script) throws Exception {
        Body val = parse(script);
        assertValidationPassed(val);
    }

    public static void assertXtestPasses(String test) {
        XTestResult result = XTestRunner.run(test, injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(result.getEvaluationException().isEmpty());
        assertEquals(XTestState.PASS, result.getState());
    }

    public static void assertXtestPreEvalFailure(String test) throws Exception {
        assertInvalidSyntax(test);
    }

    public static void assertXtestStackTrace(StackTraceElement element, String methodName,
            int lineNumber) {
        assertStackTraceEquals(element, "Synthetic0Uri", "\"" + methodName + "\"", "Synthetic0Uri",
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

    protected static Collection<XTestEvaluationException> assertEvaluatesToIgnoreExceptions(
            Object object, Body val) {
        XTestResult run = XTestRunner.run(val, injector);
        assertEquals("evaluation result", object, run.getResultObject());
        return run.getEvaluationException();
    }

    @SuppressWarnings("restriction")
    protected static void assertIsValidAndTypeConformsTo(Body val, JvmTypeReference createTypeRef) {
        JvmTypeReference commonReturnType = typeProvider.getCommonReturnType(val, true);
        assertNotNull("computed common return type", commonReturnType);
        boolean conformant = typeComputer.isConformant(createTypeRef, commonReturnType);
        assertTrue(commonReturnType + " does not conform to " + createTypeRef, conformant);
    }

}
