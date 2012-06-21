package org.xtest;

import org.eclipse.xtend.core.formatting.OrganizeImports;
import org.eclipse.xtend.core.formatting.OrganizeImports.ReferenceAcceptor;
import org.eclipse.xtend.core.scoping.StaticallyImportedFeaturesProvider;
import org.eclipse.xtext.common.types.util.VisibilityService;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.impl.FeatureCallToJavaMapping;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;
import org.eclipse.xtext.xbase.linking.FeatureCallChecker;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.xtest.compiler.XtestJvmModelGenerator;
import org.xtest.formatting.XtestOrganizeImports;
import org.xtest.formatting.XtestReferenceAcceptor;
import org.xtest.interpreter.XTestInterpreter;
import org.xtest.jvmmodel.XTestJvmModelInferrer;
import org.xtest.jvmmodel.XtestJvmModelAssociator;
import org.xtest.linking.XtestFeatureCallChecker;
import org.xtest.scoping.XTestScopeProvider;
import org.xtest.scoping.XtestFeatureCallMapping;
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

    /**
     * Bind {@link FeatureCallToJavaMapping} to custom implementation that understands local method
     * scoping
     * 
     * @return {@link XtestFeatureCallMapping}
     */
    public Class<? extends FeatureCallToJavaMapping> bindFeatureCallToJavaMapping() {
        return XtestFeatureCallMapping.class;
    }

    @Override
    public Class<? extends IGenerator> bindIGenerator() {
        return XtestJvmModelGenerator.class;
    }

    /**
     * Bind the JVM Model inverrer to an implementation that infers the JVM model of Xtest files
     * 
     * @return {@link XTestJvmModelInferrer}
     */
    public Class<? extends IJvmModelInferrer> bindIJvmModelInferrer() {
        return XTestJvmModelInferrer.class;
    }

    @Override
    public Class<? extends org.eclipse.xtext.resource.IResourceDescription.Manager> bindIResourceDescription$Manager() {
        return XtestResourceDescriptionManager.class;
    }

    /**
     * Bind the JVM Model Associator to an implementation that turns off logical container
     * connections
     * 
     * @return {@link XtestJvmModelAssociator}
     */
    public Class<? extends JvmModelAssociator> bindJvmModelAssociator() {
        return XtestJvmModelAssociator.class;
    }

    /**
     * Bind {@link OrganizeImports} to custom implementation that organizes imports for Xtest files
     * rather than Xtend files
     * 
     * @return {@link XtestOrganizeImports}
     */
    public Class<? extends OrganizeImports> bindOrganizeImports() {
        return XtestOrganizeImports.class;
    }

    /**
     * Bind {@link ReferenceAcceptor} to custom implementation that fixes a bug with escaped
     * sequence names in imported type qualified names
     * 
     * @return {@link XtestReferenceAcceptor}
     */
    public Class<? extends ReferenceAcceptor> bindOrganizeImports$ReferenceAcceptor() {
        return XtestReferenceAcceptor.class;
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
