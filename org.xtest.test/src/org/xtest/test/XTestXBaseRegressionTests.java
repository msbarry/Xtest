package org.xtest.test;

import org.eclipse.xtext.junit.util.ParseHelper;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.junit.evaluation.AbstractXbaseEvaluationTest;
import org.eclipse.xtext.xbase.validation.XbaseJavaValidator;
import org.xtest.XTestInjectorProvider;
import org.xtest.xTest.Body;

/**
 * Container for regression tests provided with xbase to verify I haven't broken
 * any xbase functionality
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XTestXBaseRegressionTests extends AbstractXbaseEvaluationTest {
    private static XbaseInterpreter interpreter = new XTestInjectorProvider()
            .getInjector().getInstance(XbaseInterpreter.class);
    private static ParseHelper<Body> parseHelper = new XTestInjectorProvider()
            .getInjector().getInstance(ParseHelper.class);
    private static XbaseJavaValidator validator = new XTestInjectorProvider()
            .getInjector().getInstance(XbaseJavaValidator.class);

    @Override
    protected Object invokeXbaseExpression(String expression) throws Exception {
        return interpreter.evaluate(parseHelper.parse(expression)).getResult();
    }

}
