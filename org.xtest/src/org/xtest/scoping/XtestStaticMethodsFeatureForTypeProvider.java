package org.xtest.scoping;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.scoping.StaticallyImportedFeaturesProvider;
import org.eclipse.xtend.core.xtend.XtendImport;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.xtest.xTest.Body;
import org.xtest.xTest.impl.BodyImplCustom;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * Add statically imported methods to the list of implicit static methods.
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestStaticMethodsFeatureForTypeProvider extends StaticallyImportedFeaturesProvider {

    @Override
    protected List<XtendImport> getImports() {
        Resource resource = getContext();
        if (resource.getContents().isEmpty() || !(resource.getContents().get(0) instanceof Body)) {
            return Collections.emptyList();
        }
        Body file = (Body) resource.getContents().get(0);
        return file.getImports();
    }

    @Override
    protected Map<JvmTypeReference, Collection<JvmTypeReference>> getVisibleJvmTypesContainingStaticMethods(
            Iterable<JvmTypeReference> hierarchy) {
        // Prepend the inferred Xtest class to the list of static imports
        Map<JvmTypeReference, Collection<JvmTypeReference>> result = super
                .getVisibleJvmTypesContainingStaticMethods(hierarchy);
        Resource resource = getContext();
        if (!resource.getContents().isEmpty()
                && resource.getContents().get(0) instanceof BodyImplCustom) {
            Collection<JvmTypeReference> typeName = Lists.newArrayList();
            for (EObject eObject : resource.getContents()) {
                if (eObject instanceof JvmDeclaredType) {
                    JvmParameterizedTypeReference createTypeRef = getTypeReferences()
                            .createTypeRef((JvmDeclaredType) eObject);
                    typeName.add(createTypeRef);
                }
            }
            // defensive copy
            Collection<JvmTypeReference> collection = result.get(null);
            result = Maps.newLinkedHashMap(result);
            if (collection == null) {
                result.put(null, typeName);
            } else {
                result.put(
                        null,
                        Lists.newArrayList(Iterables.concat(typeName,
                                Lists.newArrayList(collection))));
            }
        }

        return result;
    }
}
