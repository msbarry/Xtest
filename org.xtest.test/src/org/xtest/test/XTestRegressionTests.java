package org.xtest.test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

import java.util.List;

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

    // @Test TODO
    public void testGetClass() throws Exception {
        assertEvaluatesTo(System.class, "System::class");
    }

    // @Test TODO
    public void testGetClassType() throws Exception {
        Body parse = XTestRunner.parse("System::class", injector);
        List<Issue> validate = injector.getInstance(IResourceValidator.class).validate(
                parse.eResource(), XTestRunner.CHECK_BUT_DONT_RUN, CancelIndicator.NullImpl);
        assertEquals("[]", validate.toString());
        JvmTypeReference typeForName = typeRefs.getTypeForName(Class.class, parse,
                typeRefs.getTypeForName(System.class, parse));
        JvmTypeReference commonReturnType = typeProvider.getCommonReturnType(parse, true);
        System.err.println(commonReturnType);
        System.err.println(typeForName);
        assertTrue(typeComputer.isConformant(typeForName, commonReturnType, false));
    }

    protected void assertEvaluatesTo(Object object, String string) throws Exception {
        assertEquals(object, invokeXbaseExpression(string));
    }

    protected Object invokeXbaseExpression(String expression) throws Exception {
        Body parse = XTestRunner.parse(expression, injector);

        List<Issue> validate = injector.getInstance(IResourceValidator.class).validate(
                parse.eResource(), XTestRunner.CHECK_BUT_DONT_RUN, CancelIndicator.NullImpl);
        assertEquals("[]", validate.toString());
        return interpreter.evaluate(parse).getResult();
    }

}
