package org.xtest.types;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend.core.xtend.XtendPackage;
import org.eclipse.xtext.common.types.JvmAnyTypeReference;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.impl.XFeatureCallImplCustom;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.xtest.jvmmodel.XtestJvmModelAssociator;
import org.xtest.xTest.XAssertExpression;
import org.xtest.xTest.XMethodDef;
import org.xtest.xTest.XMethodDefExpression;
import org.xtest.xTest.XSafeExpression;
import org.xtest.xTest.XTestExpression;

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
    private XtestJvmModelAssociator associations;
    @Inject
    private TypeReferences typeRefs;

    @Override
    protected JvmTypeReference expectedType(EObject container, EReference reference, int index,
            boolean rawType) {
        if (container instanceof XMethodDef
                && reference == XtendPackage.Literals.XTEND_FUNCTION__NAME) {
            return _expectedType((XMethodDef) container);
        } else {
            return super.expectedType(container, reference, index, rawType);
        }
    }

    @Override
    protected JvmTypeParameterDeclarator getNearestTypeParameterDeclarator(EObject obj) {
        JvmTypeParameterDeclarator result = null;
        if (obj instanceof XMethodDef) {
            result = associations.getJvmOperation((XMethodDef) obj);
        } else if (obj != null && obj.eContainer() != null) {
            result = getNearestTypeParameterDeclarator(obj.eContainer());
        }
        return result;
    }

    @Override
    protected JvmTypeReference type(XExpression expression, JvmTypeReference rawExpectation,
            boolean rawType) {
        JvmTypeReference result;
        if (expression instanceof XTestExpression) {
            result = getPrimitiveVoid(expression);
        } else if (expression instanceof XAssertExpression) {
            result = typeRefs.getTypeForName(Boolean.class, expression);
        } else if (expression instanceof XSafeExpression) {
            XExpression actual = ((XSafeExpression) expression).getActual();
            result = actual == null ? getPrimitiveVoid(expression) : type(actual, rawExpectation,
                    rawType);
        } else if (expression instanceof XFeatureCallImplCustom
                && ((XFeatureCallImplCustom) expression).basicGetFeature() == null) {
            XFeatureCall call = (XFeatureCall) expression;
            JvmDeclaredType declaringType = call.getDeclaringType();
            if (declaringType != null) {
                JvmParameterizedTypeReference typeArgRef = typeRefs.createTypeRef(declaringType);
                result = typeRefs.getTypeForName(Class.class, expression, typeArgRef);
            } else {
                result = typeRefs.getTypeForName(Class.class, expression);
            }
        } else if (expression instanceof XMethodDef) {
            result = getPrimitiveVoid(expression);
        } else if (expression instanceof XMethodDefExpression) {
            result = getPrimitiveVoid(expression);
        } else {
            result = super.type(expression, rawExpectation, rawType);
        }
        return result;
    }

    @Override
    protected JvmTypeReference typeForIdentifiable(JvmIdentifiableElement identifiable,
            boolean rawType) {
        JvmTypeReference result;
        if (!(identifiable instanceof XExpression)) {
            result = super.typeForIdentifiable(identifiable, rawType);
        } else if (identifiable instanceof XTestExpression
                || identifiable instanceof XAssertExpression) {
            result = getPrimitiveVoid((XExpression) identifiable);
        } else {
            result = super.typeForIdentifiable(identifiable, rawType);
        }
        return result;
    }

    private JvmTypeReference _expectedType(XMethodDef function) {
        JvmTypeReference declaredOrInferredReturnType = function.getReturnType();
        if (declaredOrInferredReturnType == null) {
            declaredOrInferredReturnType = getCommonReturnType(function.getExpression(), true);
        }
        if (declaredOrInferredReturnType == null
                || getTypeReferences().is(declaredOrInferredReturnType, Void.TYPE)) {
            return null;
        }
        if (declaredOrInferredReturnType instanceof JvmAnyTypeReference) {
            declaredOrInferredReturnType = getTypeReferences().getTypeForName(Object.class,
                    function);
        }
        return declaredOrInferredReturnType;
    }
}
