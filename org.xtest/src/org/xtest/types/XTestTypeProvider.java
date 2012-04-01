package org.xtest.types;

import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.impl.XFeatureCallImplCustom;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.xtest.xTest.XAssertExpression;
import org.xtest.xTest.XTestCase;
import org.xtest.xTest.XTestSuite;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Provide the type of each Xtest expression. Each xtest expression returns null so has a void
 * return type.
 * 
 * @author Michael Barry
 */
@Singleton
@SuppressWarnings("restriction")
public class XTestTypeProvider extends XbaseTypeProvider {
    @Inject
    private TypeReferences typeRefs;

    @Override
    protected JvmTypeReference _type(XAbstractFeatureCall expression, boolean rawType) {
        JvmTypeReference result;
        if (expression instanceof XFeatureCallImplCustom
                && ((XFeatureCallImplCustom) expression).basicGetFeature() == null) {
            XFeatureCall call = (XFeatureCall) expression;
            JvmParameterizedTypeReference typeArgRef = typeRefs.createTypeRef(call
                    .getDeclaringType());
            result = typeRefs.getTypeForName(Class.class, expression, typeArgRef);
        } else {
            result = super._type(expression, rawType);
        }
        return result;
    }

    protected JvmTypeReference _type(XAssertExpression expression, boolean rawType) {
        return getPrimitiveVoid(expression);
    }

    protected JvmTypeReference _type(XTestCase expression, boolean rawType) {
        return getPrimitiveVoid(expression);
    }

    protected JvmTypeReference _type(XTestSuite expression, boolean rawType) {
        return getPrimitiveVoid(expression);
    }

}