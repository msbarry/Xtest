package org.xtest.runner;

import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

import com.google.common.collect.Lists;
import com.google.inject.Singleton;

@Singleton
public class Extensions {
    private static final String ATTRIBUTE = "class";
    private static final String EXTENSION_POINT = "testType";
    private Collection<ITestType> types;

    public synchronized Collection<ITestType> getAllTestTypes() {
        if (types == null) {
            types = Lists.newArrayList();
            IExtensionRegistry registry = Platform.getExtensionRegistry();
            IExtensionPoint extension = registry.getExtensionPoint(Activator.PLUGIN_ID,
                    EXTENSION_POINT);
            IConfigurationElement[] configElements = extension.getConfigurationElements();
            for (int i = 0; i < configElements.length; ++i) {
                IConfigurationElement element = configElements[i];
                if (element != null) {
                    try {
                        Object testType = element.createExecutableExtension(ATTRIBUTE);
                        if (testType instanceof ITestType) {
                            types.add((ITestType) testType);
                        }
                    } catch (CoreException e) {
                    }
                }
            }
        }
        return types;
    }

}
