package org.xtest.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.resource.XtendResource;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.impl.JvmTypeParameterImplCustom;
import org.xtest.jvmmodel.XtestJvmModelAssociator;
import org.xtest.types.XTestTypeProvider;
import org.xtest.xTest.XMethodDef;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * Custom Xtest resource that resolves method return types declared in xtest files
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestResource extends XtendResource {

    @Inject
    private XtestJvmModelAssociator associations;

    @Inject
    private XTestTypeProvider typeProvider;

    @Override
    protected JvmTypeReference computeReturnType(XtendFunction function) {

        // Copied from XtendResource.computeReturnType...

        JvmTypeReference declaredOrInferredReturnType = getDeclaredOrOverriddenReturnType(function);
        if (declaredOrInferredReturnType != null) {
            return declaredOrInferredReturnType;
        }
        JvmTypeReference returnType = typeProvider.getCommonReturnType(function.getExpression(),
                true);
        if (returnType != null && returnType.getType() != null) {
            JvmOperation operation = associations.getDirectlyInferredOperation(function);
            if (operation == null) {
                return null;
            }
            for (JvmTypeReference reference : Iterables.filter(EcoreUtil2.eAllContents(returnType),
                    JvmTypeReference.class)) {
                if (reference.getType() instanceof JvmTypeParameter) {
                    JvmTypeParameterImplCustom parameter = (JvmTypeParameterImplCustom) reference
                            .getType();

                    // ... except return returnType when the type parameter declarator is a
                    // containing XMethodDef

                    for (EObject obj = function; obj != null; obj = obj.eContainer()) {
                        if (obj instanceof XMethodDef) {
                            XMethodDef def = (XMethodDef) obj;
                            JvmOperation jvmOperation = associations.getJvmOperation(def);
                            if (jvmOperation == parameter.getDeclarator()) {
                                return returnType;
                            }
                            if (def.isStatic()) {
                                break;
                            }
                        }
                    }
                }
            }
        }

        // otherwise, call superclass implementation

        return super.computeReturnType(function);
    }
}
