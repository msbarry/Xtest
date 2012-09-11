package org.xtest.test;

import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.junit.util.ParseHelper;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.junit.evaluation.AbstractXbaseEvaluationTest;
import org.junit.Test;
import org.xtest.XTestRunner;
import org.xtest.interpreter.XTestInterpreter;
import org.xtest.xTest.Body;

import com.google.common.collect.Lists;

/**
 * Container for regression tests provided with xbase to verify I haven't broken any xbase
 * functionality
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XbaseRegressionTests extends AbstractXbaseEvaluationTest {
    private static XbaseInterpreter interpreter = XtestInjector.injector
            .getInstance(XTestInterpreter.class);
    @SuppressWarnings("unchecked")
    private static ParseHelper<Body> parseHelper = XtestInjector.injector
            .getInstance(ParseHelper.class);

    @Override
    @Test
    public void testAssignment_04() throws Exception {
        // Had to override because private members are now visible. If that feature is limited in
        // the future, remove this override to run original xbase test
        assertEvaluatesTo("Integer: 1", "{" + "  var x = new testdata.Properties1()"
                + "  x.setProp2(1)" + "  x.getProp2()" + "}");
    }

    @Override
    @Test
    public void testAssignment_06() throws Exception {
        // Had to override because private members are now visible. If that feature is limited in
        // the future, remove this override to run original xbase test
        assertEvaluatesTo("Integer: 1", "{" + "  var x = new testdata.Properties1()"
                + "  x.setProp2(1)" + "  x.getProp2()" + "}");
    }

    @Override
    @Test
    public void testAssignment_08() throws Exception {
        // Had to override because private members are now visible. If that feature is limited in
        // the future, remove this override to run original xbase test
        assertEvaluatesTo(null, "{" + "  var x = new testdata.Properties1()" + "  x.setProp2(1)"
                + "  null" + "}");
    }

    @Override
    @Test
    public void testAssignment_18() throws Exception {
        // had to change becuase private members are accessible
        assertEvaluatesTo("1", "{" + "  var it = new testdata.Properties1()" + "  prop2 = '1'"
                + "  prop2" + "}");
    }

    @Override
    @Test
    public void testAssignment_20() throws Exception {
        // had to change becuase private members are accessible
        assertEvaluatesTo("1", "{" + "  var it = new testdata.Properties1()" + "  prop2 = '1'"
                + "  prop2" + "}");
    }

    @Override
    @Test
    public void testAssignment_22() throws Exception {
        // had to change becuase private members are accessible
        assertEvaluatesTo(null, "{" + "  var it = new testdata.Properties1()" + "  prop2 = '1'"
                + "  null" + "}");
    }

    @Override
    @Test
    public void testMapConstruction_01() throws Exception {
        // Had to override because private members are now visible. If that feature is limited in
        // the future, remove this override to run original xbase test
        assertEvaluatesTo("vier",
                "newHashMap(3->'drei',4->'vier').entrySet().findFirst(e|e.getKey()==4).getValue()");
    }

    @Override
    protected Object invokeXbaseExpression(String expression) throws Exception {
        Body parse = parseHelper.parse(expression);
        IResourceValidator instance = XtestInjector.injector.getInstance(IResourceValidator.class);
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
        return interpreter.evaluate(parse).getResult();
    }

}
