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
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.util.Tuples;
import org.xtest.xTest.Body;
import org.xtest.xTest.impl.BodyImplCustom;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Provider;

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
        // TODO this works now but try to merge better into xtend's import handling
        boolean extension = isExtensionProvider();
        if (hierarchy == null || Iterables.isEmpty(hierarchy)) {
            extension = false;
        }

        // Prepend the inferred Xtest class to the list of static imports
        Map<JvmTypeReference, Collection<JvmTypeReference>> result = super
                .getVisibleJvmTypesContainingStaticMethods(hierarchy);

        Resource resource = getContext();

        if (!resource.getContents().isEmpty()
                && resource.getContents().get(0) instanceof BodyImplCustom) {
            Collection<JvmTypeReference> typeName = Lists.newArrayList();
            for (final EObject eObject : resource.getContents()) {
                if (eObject instanceof JvmDeclaredType) {
                    JvmTypeReference createTypeRef = cache.get(
                            Tuples.create(this, ((JvmDeclaredType) eObject).getQualifiedName()),
                            context, new Provider<JvmTypeReference>() {
                                @Override
                                public JvmTypeReference get() {
                                    return getTypeReferences().createTypeRef(
                                            (JvmDeclaredType) eObject);
                                }
                            });

                    typeName.add(createTypeRef);
                }
            }

            // defensive copy
            Map<JvmTypeReference, Collection<JvmTypeReference>> oldResult = result;
            result = Maps.newLinkedHashMap();
            if (!extension || hierarchy == null) {
                Collection<JvmTypeReference> oldRef = oldResult.get(null);
                List<JvmTypeReference> ref;
                if (oldRef == null) {
                    ref = Lists.newArrayList();
                } else {
                    ref = Lists.newArrayList(oldRef);
                }
                result.put(null, ref);
                for (JvmTypeReference type : typeName) {
                    ref.add(0, type);
                }
            } else {
                for (JvmTypeReference reference : hierarchy) {
                    Collection<JvmTypeReference> oldRef = oldResult.get(reference);
                    List<JvmTypeReference> ref;
                    if (oldRef == null) {
                        ref = Lists.newArrayList();
                    } else {
                        ref = Lists.newArrayList(oldRef);
                    }
                    result.put(reference, ref);
                    for (JvmTypeReference type : typeName) {
                        ref.add(0, type);
                    }
                }
            }
        }

        return result;
    }
}
