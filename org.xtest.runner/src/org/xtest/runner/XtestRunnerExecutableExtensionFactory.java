package org.xtest.runner;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IExecutableExtensionFactory;

import com.google.common.base.Optional;

/**
 * Eclipse to Guice connector that allows plugin extensions to instantiate classes through Guice.
 * 
 * @author Michael Barry
 */
public class XtestRunnerExecutableExtensionFactory implements IExecutableExtension,
        IExecutableExtensionFactory {
    private Optional<Class<?>> clazz = Optional.absent();

    @Override
    public Object create() throws CoreException {
        return clazz.isPresent() ? Activator.getDefault().getInjector().getInstance(clazz.get())
                : null;
    }

    @Override
    public void setInitializationData(IConfigurationElement config, String key, Object value)
            throws CoreException {
        String clazzName = null;
        if (value instanceof String) {
            clazzName = (String) value;
        }

        if (clazzName != null) {
            try {
                clazz = Optional.<Class<?>> of(Class.forName(clazzName));
            } catch (ClassNotFoundException e) {
            }
        }

        if (!clazz.isPresent()) {
            throw new IllegalArgumentException("Couldn't instantiate class from: " + value);
        }
    }

}
