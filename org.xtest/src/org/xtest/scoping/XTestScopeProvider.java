package org.xtest.scoping;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.scoping.StaticallyImportedFeaturesProvider;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.MapBasedScope;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.IJvmFeatureDescriptionProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.IValidatedEObjectDescription;
import org.eclipse.xtext.xbase.scoping.featurecalls.JvmFeatureScope;
import org.eclipse.xtext.xbase.scoping.featurecalls.LocalVarDescription;
import org.xtest.preferences.RuntimePref;
import org.xtest.xTest.XMethodDef;
import org.xtest.xTest.XTestPackage;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Custom scope provider for Xtest
 * 
 * Portions borrowed from XtendScopeProvider
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XTestScopeProvider extends XbaseScopeProvider {
    private static final int IMPORTED_STATIC_FEATURE_PRIORITY = 50;
    private static final int STATIC_EXTENSION_PRIORITY_OFFSET = 220;

    @Inject
    private Provider<StaticallyImportedFeaturesProvider> staticallyImportedFeaturesProvider;

    @Inject
    private TypeReferences typeRefs;

    @Override
    public IScope getScope(EObject context, EReference reference) {
        IScope scope;
        if (reference == XTestPackage.Literals.FILE_PARAM__FEATURE) {
            List<IEObjectDescription> descriptions = Lists.newArrayList();
            Map<String, RuntimePref> map = Maps.newTreeMap();
            for (RuntimePref pref : RuntimePref.values()) {
                map.put(pref.toString(), pref);
            }
            JvmTypeReference typeForName = typeRefs.getTypeForName(RuntimePref.class, context);
            if (typeForName != null && typeForName.getType() instanceof JvmEnumerationType) {
                EList<JvmEnumerationLiteral> literals = ((JvmEnumerationType) typeForName.getType())
                        .getLiterals();
                for (JvmEnumerationLiteral literal : literals) {
                    String simpleName = literal.getSimpleName();
                    RuntimePref runtimePref = map.get(simpleName);
                    if (runtimePref != null) {
                        String id = runtimePref.getId();
                        IEObjectDescription create = EObjectDescription.create(id, literal);
                        descriptions.add(create);
                    }
                }
            }

            scope = MapBasedScope.createScope(MapBasedScope.NULLSCOPE, descriptions);
        } else {
            scope = super.getScope(context, reference);
        }
        return scope;
    }

    @Override
    protected void addFeatureDescriptionProviders(Resource resource, JvmDeclaredType contextType,
            XExpression implicitReceiver, XExpression implicitArgument, int priority,
            IAcceptor<IJvmFeatureDescriptionProvider> acceptor) {
        super.addFeatureDescriptionProviders(resource, contextType, implicitReceiver,
                implicitArgument, priority, acceptor);

        if (implicitReceiver == null || implicitArgument != null) {
            final StaticallyImportedFeaturesProvider staticProvider = staticallyImportedFeaturesProvider
                    .get();
            staticProvider.setResourceContext(resource);
            staticProvider.setExtensionProvider(true);
            if (implicitArgument != null) {
                // use the implicit argument as implicit receiver
                SimpleAcceptor casted = (SimpleAcceptor) acceptor;
                JvmTypeReference implicitArgumentType = getTypeProvider().getType(implicitArgument,
                        true);
                IAcceptor<IJvmFeatureDescriptionProvider> myAcceptor = casted.getParent().curry(
                        implicitArgumentType, casted.getExpression());
                addFeatureDescriptionProviders(contextType, staticProvider, implicitArgument, null,
                        priority + STATIC_EXTENSION_PRIORITY_OFFSET, true, myAcceptor);
            } else {
                addFeatureDescriptionProviders(contextType, staticProvider, implicitReceiver,
                        implicitArgument, priority + STATIC_EXTENSION_PRIORITY_OFFSET, true,
                        acceptor);
            }
        }
    }

    @Override
    protected void addFeatureDescriptionProvidersForAssignment(Resource resource,
            JvmDeclaredType contextType, XExpression implicitReceiver,
            XExpression implicitArgument, int priority,
            IAcceptor<IJvmFeatureDescriptionProvider> acceptor) {
        super.addFeatureDescriptionProvidersForAssignment(resource, contextType, implicitReceiver,
                implicitArgument, priority, acceptor);

        if (implicitReceiver == null || implicitArgument != null) {
            final StaticallyImportedFeaturesProvider staticProvider = staticallyImportedFeaturesProvider
                    .get();
            staticProvider.setResourceContext(resource);
            staticProvider.setExtensionProvider(true);
            if (implicitArgument != null) {
                // use the implicit argument as implicit receiver
                SimpleAcceptor casted = (SimpleAcceptor) acceptor;
                JvmTypeReference implicitArgumentType = getTypeProvider().getType(implicitArgument,
                        true);
                IAcceptor<IJvmFeatureDescriptionProvider> myAcceptor = casted.getParent().curry(
                        implicitArgumentType, casted.getExpression());
                addFeatureDescriptionProvidersForAssignment(contextType, staticProvider,
                        implicitArgument, null, priority + STATIC_EXTENSION_PRIORITY_OFFSET, true,
                        myAcceptor);
            } else {
                addFeatureDescriptionProvidersForAssignment(contextType, staticProvider,
                        implicitReceiver, implicitArgument, priority
                                + STATIC_EXTENSION_PRIORITY_OFFSET, true, acceptor);
            }
        }

    }

    @Override
    protected void addStaticFeatureDescriptionProviders(Resource resource,
            JvmDeclaredType contextType, IAcceptor<IJvmFeatureDescriptionProvider> acceptor) {
        super.addStaticFeatureDescriptionProviders(resource, contextType, acceptor);

        StaticallyImportedFeaturesProvider staticProvider = staticallyImportedFeaturesProvider
                .get();
        staticProvider.setResourceContext(resource);
        staticProvider.setExtensionProvider(false);

        addFeatureDescriptionProviders(contextType, staticProvider, null, null,
                IMPORTED_STATIC_FEATURE_PRIORITY, true, acceptor);
    }

    @Override
    protected IScope createFeatureScopeForTypeRef(JvmTypeReference declaringType,
            EObject expression, XExpression implicitReceiver, IScope parent) {
        // TODO Auto-generated method stub
        return super.createFeatureScopeForTypeRef(declaringType, expression, implicitReceiver,
                parent);
    }

    @Override
    protected IScope createLocalVarScope(IScope parentScope, LocalVariableScopeContext scopeContext) {
        if (scopeContext == null || scopeContext.getContext() == null) {
            return parentScope;
        }
        EObject context = scopeContext.getContext();
        if (context instanceof XMethodDef) {
            return createLocalVarScopeForMethodDef((XMethodDef) context, parentScope);
        } else {
            return super.createLocalVarScope(parentScope, scopeContext);
        }
    }

    protected IScope createLocalVarScopeForMethodDef(XMethodDef def, IScope parentScope) {
        List<IValidatedEObjectDescription> descriptions = Lists.newArrayList();
        EList<JvmFormalParameter> params = def.getParameters();
        for (JvmFormalParameter p : params) {
            String name = p.getName();
            if (name != null) {
                QualifiedName create = QualifiedName.create(name);
                IValidatedEObjectDescription desc;
                desc = new LocalVarDescription(create, p);
                descriptions.add(desc);
            }
        }
        return new JvmFeatureScope(parentScope, "XMethodDef", descriptions);
    }

}
