package org.xtest.scoping;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider;
import org.xtest.xTest.Body;
import org.xtest.xTest.Import;

import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * Add statically imported methods to the list of implicit static methods.
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestStaticMethodsFeatureForTypeProvider extends
        StaticImplicitMethodsFeatureForTypeProvider {

    @Inject
    private IQualifiedNameConverter qualifiedNameConverter;

    @Inject
    private TypeReferences typeReferences;

    /**
     * Return a raw list of static imports.
     * 
     * @return A list of static imports
     */
    private Collection<JvmType> getStaticImports() {
        EList<EObject> contents = context.getContents();
        Collection<JvmType> other = Lists.newArrayList();
        for (EObject object : contents) {
            if (object instanceof Body) {
                Body body = (Body) object;
                EList<Import> imports = body.getImports();
                for (Import imported : imports) {
                    if (imported.isStatic() && imported.getStaticImport() != null) {
                        other.add(imported.getStaticImport());
                    }
                }
            }
        }
        return other;
    }

    @Override
    protected Map<JvmTypeReference, Collection<JvmTypeReference>> getVisibleJvmTypesContainingStaticMethods(
            Iterable<JvmTypeReference> hierarchy) {
        Map<JvmTypeReference, Collection<JvmTypeReference>> result = super
                .getVisibleJvmTypesContainingStaticMethods(hierarchy);
        if (hierarchy == null) {
            for (JvmType type : getStaticImports()) {
                JvmParameterizedTypeReference typeReference = typeReferences.createTypeRef(type);
                result.get(null).add(typeReference);
            }
        }
        return result;
    }
}
