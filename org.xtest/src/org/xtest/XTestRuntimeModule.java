package org.xtest;

import org.eclipse.xtend.core.scoping.StaticallyImportedFeaturesProvider;
import org.eclipse.xtext.common.types.util.VisibilityService;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.linking.FeatureCallChecker;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.xtest.interpreter.XTestInterpreter;
import org.xtest.linking.XtestFeatureCallChecker;
import org.xtest.scoping.XTestScopeProvider;
import org.xtest.scoping.XtestImportedNamespaceScopeProvider;
import org.xtest.scoping.XtestStaticMethodsFeatureForTypeProvider;
import org.xtest.scoping.XtestVisibilityService;
import org.xtest.types.XTestTypeProvider;

/**
 * Set up Guice bindings
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XTestRuntimeModule extends org.xtest.AbstractXTestRuntimeModule {
    /**
     * Bind {@link FeatureCallChecker} to custom implementation that allows assignment to final
     * fields.
     * 
     * @return {@link XtestFeatureCallChecker}
     */
    public Class<? extends FeatureCallChecker> bindFeatureCallChecker() {
        return XtestFeatureCallChecker.class;
    }

    @Override
    public Class<? extends org.eclipse.xtext.resource.IResourceDescription.Manager> bindIResourceDescription$Manager() {
        return XtestResourceDescriptionManager.class;
    }

    /**
     * Bind {@link StaticImplicitMethodsFeatureForTypeProvider} to custom implementation that
     * contributes static imports as implicit static methods
     * 
     * @return {@link XtestStaticMethodsFeatureForTypeProvider}
     */
    public Class<? extends StaticallyImportedFeaturesProvider> bindStaticallyImportedFeaturesProvider() {
        return XtestStaticMethodsFeatureForTypeProvider.class;
    }

    /**
     * Bind {@link VisibilityService} to a custom implementation that makes all members visible,
     * public and private.
     * 
     * @return {@link XtestVisibilityService}
     */
    public Class<? extends VisibilityService> bindVisibilityService() {
        return XtestVisibilityService.class;
    }

    /**
     * Bind {@link XbaseImportedNamespaceScopeProvider} to custom implementation that ignores static
     * imports
     * 
     * @return {@link XtestImportedNamespaceScopeProvider}
     */
    public Class<? extends XbaseImportedNamespaceScopeProvider> bindXbaseImportedNamespaceScopeProvider() {
        return XtestImportedNamespaceScopeProvider.class;
    }

    /**
     * Bind {@link XbaseInterpreter} to custom implementation for Xtest
     * 
     * @return {@link XTestInterpreter}
     */
    public Class<? extends XbaseInterpreter> bindXbaseInterpreter() {
        return XTestInterpreter.class;
    }

    /**
     * Bind {@link XbaseScopeProvider} to custom implementation that ignores static imports
     * 
     * @return {@link XTestScopeProvider}
     */
    public Class<? extends XbaseScopeProvider> bindXbaseScopeProvider() {
        return XTestScopeProvider.class;
    }

    /**
     * Bind {@link XbaseTypeProvider} to custom implementation that ignores static imports
     * 
     * @return {@link XTestTypeProvider}
     */
    public Class<? extends XbaseTypeProvider> bindXbaseTypeProvider() {
        return XTestTypeProvider.class;
    }
}
