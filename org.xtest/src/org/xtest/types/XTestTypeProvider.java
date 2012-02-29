package org.xtest.types;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.xtest.xTest.XAssertExpression;
import org.xtest.xTest.XTestCase;
import org.xtest.xTest.XTestSuite;

import com.google.inject.Singleton;

/**
 * Provide the type of each Xtest expression. Each xtest expression returns null
 * so has a void return type.
 * 
 * @author Michael Barry
 */
@Singleton
@SuppressWarnings("restriction")
public class XTestTypeProvider extends XbaseTypeProvider {
    @Override
    protected JvmTypeReference type(XExpression expression,
            JvmTypeReference rawExpectation, boolean rawType) {
        JvmTypeReference result;
        if (expression instanceof XTestSuite || expression instanceof XTestCase
                || expression instanceof XAssertExpression) {
            result = getPrimitiveVoid(expression);
        } else {
            result = super.type(expression, rawExpectation, rawType);
        }
        return result;
    }

    @Override
    protected JvmTypeReference typeForIdentifiable(
            JvmIdentifiableElement identifiable, boolean rawType) {
        JvmTypeReference result;
        if (!(identifiable instanceof XExpression)) {
            result = super.typeForIdentifiable(identifiable, rawType);
        } else if (identifiable instanceof XTestSuite
                || identifiable instanceof XTestCase
                || identifiable instanceof XAssertExpression) {
            result = getPrimitiveVoid((XExpression) identifiable);
        } else {
            result = super.typeForIdentifiable(identifiable, rawType);
        }
        return result;
    }
}
