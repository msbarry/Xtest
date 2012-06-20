package org.xtest.scoping;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.scoping.StaticallyImportedFeaturesProvider;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.MapBasedScope;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.jvmmodel.ILogicalContainerProvider;
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.IJvmFeatureDescriptionProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.IValidatedEObjectDescription;
import org.eclipse.xtext.xbase.scoping.featurecalls.JvmFeatureScope;
import org.eclipse.xtext.xbase.scoping.featurecalls.LocalVarDescription;
import org.xtest.preferences.RuntimePref;
import org.xtest.xTest.XMethodDef;
import org.xtest.xTest.XTestPackage;

import com.google.common.collect.Iterables;
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
    private IJvmModelAssociations associations;

    @Inject
    private ILogicalContainerProvider logicalContainerProvider;

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
    protected IScope createImplicitFeatureCallScope(EObject call, Resource resource, IScope parent,
            IScope localVariableScope) {
        parent = super.createImplicitFeatureCallScope(call, resource, parent, localVariableScope);
        // JvmFeatureScopeAcceptor featureScopeDescriptions = new JvmFeatureScopeAcceptor();
        // JvmDeclaredType contextType = getContextType(call);
        //
        // IAcceptor<IJvmFeatureDescriptionProvider> acceptorWithContext = featureScopeDescriptions
        // .curry(typeRefs.createTypeRef(contextType), call);
        // addFeatureDescriptionProviders(contextType, null, null, null,
        // getImplicitStaticFeaturePriority(), true, acceptorWithContext);
        //
        // IScope result = featureScopeDescriptions.createScope(parent);
        return parent;
    }

    @Override
    protected LocalVariableScopeContext createLocalVariableScopeContext(final EObject context,
            EReference reference, boolean includeCurrentBlock, int idx) {
        return new LocalVariableScopeContextAllowsMethods(context, reference, includeCurrentBlock,
                idx, false, logicalContainerProvider);
    }

    @Override
    protected IScope createLocalVarScope(IScope parentScope, LocalVariableScopeContext scopeContext) {
        if (scopeContext == null || scopeContext.getContext() == null) {
            return parentScope;
        }
        EObject context = scopeContext.getContext();
        parentScope = super.createLocalVarScope(parentScope, scopeContext);

        if (context instanceof XMethodDef) {
            XMethodDef methDef = (XMethodDef) context;
            parentScope = createLocalVarScopeForMethodDef(methDef, parentScope);
            if (scopeContext.isIncludeCurrentBlock() && !methDef.isStatic()) {
                if (context instanceof XBlockExpression) {
                    XBlockExpression block = (XBlockExpression) context;
                    if (!block.getExpressions().isEmpty()) {
                        parentScope = createLocalVarScopeForBlock(block, scopeContext.getIndex(),
                                scopeContext.isReferredFromClosure(), parentScope);
                    }
                }
            }
        }
        return parentScope;
    }

    @Override
    protected IScope createLocalVarScopeForBlock(XBlockExpression block,
            int indexOfContextExpressionInBlock, boolean referredFromClosure, IScope parentScope) {
        parentScope = super.createLocalVarScopeForBlock(block, indexOfContextExpressionInBlock,
                referredFromClosure, parentScope);
        List<IValidatedEObjectDescription> descriptions = Lists.newArrayList();
        // TODO add back in for scope of non-static method defs
        for (int i = 0; i < indexOfContextExpressionInBlock; i++) {
            XExpression expression = block.getExpressions().get(i);
            if (expression instanceof XMethodDef) {
                XMethodDef methDef = (XMethodDef) expression;
                Set<EObject> jvmElements2 = associations.getJvmElements(methDef);
                Iterable<JvmOperation> jvmElements = Iterables.filter(jvmElements2,
                        JvmOperation.class);
                if (methDef.getName() != null) {
                    for (JvmOperation op : jvmElements) {
                        if (!op.isStatic()) {
                            descriptions.add(new LocalVarDescription(QualifiedName.create(op
                                    .getSimpleName()), op));
                        }
                    }
                }
            }
        }
        if (descriptions.isEmpty()) {
            return parentScope;
        }
        return new JvmFeatureScope(parentScope, "XMETHDEF", descriptions);
    }

    /**
     * Adds function parameters to the scope of a function's body
     * 
     * @param def
     *            The method def
     * @param parentScope
     *            The parent scope
     * @return Scope for the function's body containing the method's parameters
     */
    protected IScope createLocalVarScopeForMethodDef(XMethodDef def, IScope parentScope) {
        List<IValidatedEObjectDescription> descriptions = Lists.newArrayList();
        if (def.isStatic()) {
            parentScope = IScope.NULLSCOPE;
        }
        for (JvmFormalParameter p : def.getParameters()) {
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

    @Override
    protected IScope createTypeScope(EObject context, EReference reference) {
        return super.createTypeScope(context, reference);
    }

    private static class LocalVariableScopeContextAllowsMethods extends LocalVariableScopeContext {

        private final ILogicalContainerProvider expressionContext;

        protected LocalVariableScopeContextAllowsMethods(EObject context, EReference reference,
                boolean includeCurrentBlock, int idx, boolean referredFromClosure,
                ILogicalContainerProvider expressionContext) {
            super(context, reference, includeCurrentBlock, idx, referredFromClosure,
                    expressionContext);
            this.expressionContext = expressionContext;
        }

        @Override
        public LocalVariableScopeContext spawnForContainer() {
            if (getContext() instanceof XMethodDef) {
                return new LocalVariableScopeContextAllowsMethods(getLogicalOrRealContainer(),
                        getReference(), false, -1, true, expressionContext);
            }
            return super.spawnForContainer();
        }

    }

}
