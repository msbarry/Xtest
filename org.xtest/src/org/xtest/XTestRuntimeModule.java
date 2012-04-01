package org.xtest;

import org.eclipse.xtext.common.types.util.VisibilityService;
import org.eclipse.xtext.conversion.impl.QualifiedNameValueConverter;
import org.eclipse.xtext.xbase.conversion.StaticQualifierValueConverter;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.linking.FeatureCallChecker;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticMethodsFeatureForTypeProvider;
import org.eclipse.xtext.xbase.typing.XbaseTypeProvider;
import org.xtest.conversion.EscapeCharacterQualifiedNameValueConverter;
import org.xtest.conversion.StaticEscapeCharacterConverter;
import org.xtest.interpreter.XTestInterpreter;
import org.xtest.linking.XtestFeatureCallChecker;
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
     * Bind the resource description manager to a custom implementation that says that all Xtest
     * files are affected by all other non-xtest files.
     * 
     * @return {@link XtestResourceDescriptionManager}
     */
    public Class<? extends org.eclipse.xtext.resource.IResourceDescription.Manager> bindIResourceDescription$Manager() {
        return XtestResourceDescriptionManager.class;
    }

    /**
     * Bind {@link QualifiedNameValueConverter} to custom implementation that fixes bug with escaped
     * name conversion
     * 
     * TODO Xtext 2.3 fixes the bug that this custom implementation is required for. After updating
     * to xtext 2.3, remove this file
     * 
     * @return {@link EscapeCharacterQualifiedNameValueConverter}
     */
    public Class<? extends QualifiedNameValueConverter> bindQualifiedNameValueConverter() {
        return EscapeCharacterQualifiedNameValueConverter.class;
    }

    /**
     * Bind {@link StaticMethodsFeatureForTypeProvider} to custom implementation that contributes
     * static imports as implicit static methods
     * 
     * @return {@link XtestStaticMethodsFeatureForTypeProvider}
     */
    public Class<? extends StaticMethodsFeatureForTypeProvider> bindStaticImplicitMethodsFeatureForTypeProvider() {
        return XtestStaticMethodsFeatureForTypeProvider.class;
    }

    /**
     * Bind {@link StaticQualifierValueConverter} to a custom implementation that fixes bug with
     * escaped name conversion
     * 
     * TODO Xtext 2.3 fixes the bug that this custom implementation is required for. After updating
     * to xtext 2.3, remove this file
     * 
     * @return StaticEscapeCharacterConverter
     * 
     */
    public Class<? extends StaticQualifierValueConverter> bindStaticQualifierValueConverter() {
        return StaticEscapeCharacterConverter.class;
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
     * Bind {@link XbaseTypeProvider} to custom implementation that ignores static imports
     * 
     * @return {@link XTestTypeProvider}
     */
    public Class<? extends XbaseTypeProvider> bindXbaseTypeProvider() {
        return XTestTypeProvider.class;
    }
}
