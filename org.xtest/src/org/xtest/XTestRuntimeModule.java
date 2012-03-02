package org.xtest;

import org.eclipse.xtext.xbase.interpreter.IExpressionInterpreter;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.xtest.interpreter.XTestInterpreter;
import org.xtest.types.XTestTypeProvider;

/**
 * Set up Guice bindings
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XTestRuntimeModule extends org.xtest.AbstractXTestRuntimeModule {
    @Override
    public Class<? extends IExpressionInterpreter> bindIExpressionInterpreter() {
        return XTestInterpreter.class;
    }

    @Override
    public Class<? extends org.eclipse.xtext.resource.IResourceDescription.Manager> bindIResourceDescription$Manager() {
        return XtestResourceDescriptionManager.class;
    }

    @Override
    public Class<? extends ITypeProvider> bindITypeProvider() {
        return XTestTypeProvider.class;
    }
}
