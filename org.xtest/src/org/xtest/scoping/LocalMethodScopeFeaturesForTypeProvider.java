package org.xtest.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.scoping.featurecalls.IFeaturesForTypeProvider;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * Custom feature scope for type provider that adds methods contained in local variable scope to
 * context
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class LocalMethodScopeFeaturesForTypeProvider implements IFeaturesForTypeProvider {

    private final Iterable<IEObjectDescription> descriptions;

    /**
     * Construct a new scope provider
     * 
     * @param localVariableScope
     *            Local variable scope to retrieve locally-scoped methods from
     */
    public LocalMethodScopeFeaturesForTypeProvider(IScope localVariableScope) {
        this.descriptions = Lists.newArrayList(localVariableScope.getAllElements());
    }

    @Override
    public Iterable<JvmFeature> getAllFeatures(JvmTypeReference typeReference,
            Iterable<JvmTypeReference> hierarchy) {
        return Iterables.filter(getEObjectsInScope(), JvmFeature.class);
    }

    @Override
    public Iterable<JvmFeature> getFeaturesByName(final String name,
            final JvmTypeReference declarator, Iterable<JvmTypeReference> hierarchy) {
        return Iterables.filter(getAllFeatures(declarator, hierarchy), new Predicate<JvmFeature>() {
            @Override
            public boolean apply(JvmFeature input) {
                String simpleName = input.getSimpleName();
                return Strings.equal(name, simpleName);
            }
        });
    }

    @Override
    public boolean isExtensionProvider() {
        return true;
    }

    private Iterable<EObject> getEObjectsInScope() {
        return Iterables.transform(descriptions, new Function<IEObjectDescription, EObject>() {
            @Override
            public EObject apply(IEObjectDescription input) {
                return input.getEObjectOrProxy();
            }
        });
    }
}
