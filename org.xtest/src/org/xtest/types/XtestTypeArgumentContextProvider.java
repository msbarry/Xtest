package org.xtest.types;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeParameterDeclarator;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.LazyTypeArgumentContext;
import org.eclipse.xtext.common.types.util.TypeArgumentContextProvider;
import org.xtest.jvmmodel.XtestJvmModelAssociator;
import org.xtest.xTest.XMethodDef;

import com.google.inject.Inject;

/**
 * Custom {@link LazyTypeArgumentContext} that resolves type arguments declared in containing method
 * defs
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestTypeArgumentContextProvider extends LazyTypeArgumentContext {
    @Inject
    private XtestJvmModelAssociator associations;

    private TypeArgumentContextProvider.Request request;

    @Override
    public void initialize(TypeArgumentContextProvider.Request request,
            TypeArgumentContextProvider contextProvider) {
        super.initialize(request, contextProvider);
        this.request = request;
    }

    @Override
    protected boolean isResolved(JvmTypeReference reference, boolean rawType,
            boolean firstWildcardUnresolved) {
        if (reference == null) {
            return true;
        }
        Boolean result = new XtestIsResolvedVisitor(rawType).visit(reference,
                firstWildcardUnresolved);
        return result;
    }

    private class XtestIsResolvedVisitor extends IsResolvedVisitor {

        private final boolean rawType;

        public XtestIsResolvedVisitor(boolean rawType) {
            super(rawType);
            this.rawType = rawType;
        }

        @Override
        public Boolean doVisitParameterizedTypeReference(JvmParameterizedTypeReference reference,
                Boolean wildcardIsUnresolved) {

            // Same as
            // org.eclipse.xtext.common.types.util.LazyTypeArgumentContext$IsResolvedVisitor.doVisitParemeterizedTypeReference...

            JvmType type = reference.getType();
            if (type instanceof JvmTypeParameter) {
                JvmTypeParameterDeclarator declarator = ((JvmTypeParameter) type).getDeclarator();

                JvmTypeParameterDeclarator nearestDeclarator = request.getNearestDeclarator();
                boolean found = false;
                if (nearestDeclarator == null) {
                    return Boolean.FALSE;
                }

                // ... Except it searches all containing method defs for type parameter declarations

                EObject source = associations.getPrimarySourceElement(nearestDeclarator);
                if (source != null) {
                    for (EObject obj = source; obj != null; obj = obj.eContainer()) {
                        if (obj instanceof XMethodDef) {
                            XMethodDef def = (XMethodDef) obj;
                            JvmOperation jvmOperation = associations.getJvmOperation(def);
                            if (jvmOperation != null) {
                                if (EcoreUtil.isAncestor(jvmOperation, declarator)) {
                                    found = true;
                                }
                            }
                            if (((XMethodDef) obj).isStatic()) {
                                break;
                            }
                        }
                    }
                    if (!found) {
                        return Boolean.FALSE;
                    }
                }

                // ... End diff
            }
            if (!rawType) {
                if (type instanceof JvmTypeParameterDeclarator) {
                    List<JvmTypeParameter> typeParameters = ((JvmTypeParameterDeclarator) type)
                            .getTypeParameters();
                    List<JvmTypeReference> typeArguments = reference.getArguments();
                    if (typeParameters.size() != typeArguments.size()) {
                        return Boolean.FALSE;
                    }
                }
                for (JvmTypeReference typeArgument : reference.getArguments()) {
                    if (!visit(typeArgument, Boolean.FALSE)) {
                        return Boolean.FALSE;
                    }
                }
            }
            return Boolean.TRUE;
        }

    }
}
