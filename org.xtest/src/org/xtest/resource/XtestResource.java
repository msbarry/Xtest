package org.xtest.resource;

import static com.google.common.collect.Iterables.filter;
import static com.google.common.collect.Lists.newArrayList;

import java.util.List;

import org.eclipse.xtend.core.resource.XtendResource;
import org.eclipse.xtext.common.types.JvmAnyTypeReference;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.xtest.xTest.XMethodDef;

import com.google.inject.Inject;

@SuppressWarnings("restriction")
public class XtestResource extends XtendResource {

    @Inject
    private IJvmModelAssociations associations;

    @Inject
    private TypeConformanceComputer typeConformanceComputer;

    @Inject
    private ITypeProvider typeProvider;

    @Inject
    private TypeReferences typeReferences;

    protected JvmTypeReference computeReturnType(XMethodDef function) {
        if (function.getReturnType() != null) {
            return function.getReturnType();
        }

        return typeProvider.getCommonReturnType(function.getExpression(), true);
    }

    @Override
    protected JvmTypeReference inferReturnType(JvmOperation jvmOperation) {
        List<JvmTypeReference> associatedReturnTypes = newArrayList();
        final Iterable<XMethodDef> associatedElements = filter(
                associations.getSourceElements(jvmOperation), XMethodDef.class);
        for (XMethodDef func : associatedElements) {
            JvmTypeReference type = computeReturnType(func);
            if (type != null && !(type instanceof JvmAnyTypeReference)) {
                associatedReturnTypes.add(type);
            }
        }
        if (!associatedReturnTypes.isEmpty()) {
            JvmTypeReference commonSuperType = typeConformanceComputer
                    .getCommonSuperType(associatedReturnTypes);
            return commonSuperType;
        }
        return null;
    }
}
