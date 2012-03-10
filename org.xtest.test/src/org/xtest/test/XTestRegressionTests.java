package org.xtest.test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import helpers.SUT;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.junit.Test;
import org.xtest.XTestRunner;
import org.xtest.interpreter.XTestInterpreter;
import org.xtest.types.XTestTypeProvider;
import org.xtest.xTest.Body;

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
        assertEquals("[]", validate.toString());
    }

    protected static Object invokeXbaseExpression(Body expression) throws Exception {
        return interpreter.evaluate(expression).getResult();
    }

    protected static Body parse(String string) throws Exception {
        return XTestRunner.parse(string, injector);
    }

    @Test
    public void testBug1() throws Exception {
        Body result = XTestRunner.parse("xsuite \"test\": {\n" + "    xtest \"case\": {\n"
                + "        assert 1 == 1\n" + "      assert 2 ==\n" + "        assert 3 == 3\n"
                + "    }}  ", injector);
        typeProvider.getCommonReturnType(result, true);
    }

    @Test
    public void testBug2() throws Exception {
        Body result = XTestRunner.parse(
                "val a = new java.util.TreeMap\n\nxtest test {\nassert a.descendingMap == a\n}",
                injector);
        typeProvider.getCommonReturnType(result, true);
    }

    @Test
    public void testGetClass() throws Exception {
        Body parse = parse("System::class");
        assertValidationPassed(parse);
        assertEvaluatesTo(System.class, parse);
        JvmTypeReference typeForName = typeRefs.getTypeForName(Class.class, parse,
                typeRefs.getTypeForName(System.class, parse));
        assertReturnType(typeForName, parse);
    }

    @Test
    public void testGetClassImported() throws Exception {
        Body parse = parse("import helpers.SUT\nSUT::class");
        assertValidationPassed(parse);
        assertEvaluatesTo(SUT.class, parse);
        JvmTypeReference typeForName = typeRefs.getTypeForName(Class.class, parse,
                typeRefs.getTypeForName(SUT.class, parse));
        assertReturnType(typeForName, parse);
    }

    @Test
    public void testGetClassNotImported() throws Exception {
        Body parse = parse("helpers::SUT::class");
        assertValidationPassed(parse);
        assertEvaluatesTo(SUT.class, parse);
        JvmTypeReference typeForName = typeRefs.getTypeForName(Class.class, parse,
                typeRefs.getTypeForName(SUT.class, parse));
        assertReturnType(typeForName, parse);
    }

}
