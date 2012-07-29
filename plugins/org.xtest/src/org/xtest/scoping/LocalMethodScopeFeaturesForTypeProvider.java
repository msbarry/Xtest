package org.xtest.scoping;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.scoping.StaticallyImportedFeaturesProvider;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.util.Strings;

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
public class LocalMethodScopeFeaturesForTypeProvider extends StaticallyImportedFeaturesProvider {

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

    @Override
    protected void collectFeatures(String name, Iterable<JvmTypeReference> hierarchy,
            Collection<JvmFeature> result) {
        if (hierarchy != null) {
            Iterable<JvmOperation> features = Iterables.filter(getEObjectsInScope(),
                    JvmOperation.class);
            for (JvmTypeReference e : hierarchy) {
                for (JvmOperation feature : features) {
                    if (isMatchingExtension(e, feature)) {
                        result.add(feature);
                    }
                }
            }
        } else {
            result.addAll(Lists.newArrayList(Iterables.filter(getEObjectsInScope(),
                    JvmOperation.class)));
        }
    }

    @Override
    protected boolean isMatchingExtension(JvmTypeReference expectedParameterTypeReference,
            JvmOperation operation) {
        boolean result = false;
        if (expectedParameterTypeReference == null) {
            result = true;
        } else if (operation.getParameters().size() > 0) {
            JvmFormalParameter firstParam = Iterables.getFirst(operation.getParameters(), null);
            result = super.isSameTypeOrAssignableToUpperBound(expectedParameterTypeReference,
                    firstParam.getParameterType());
        }
        return result;
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
