package org.xtest.runner;

import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.xtest.runner.external.ITestType;

import com.google.common.collect.Lists;
import com.google.inject.Singleton;

/**
 * Wrapper for retrieval of clients contributing the the testType extension point
 * 
 * @author Michael Barry
 */
@Singleton
public class Extensions {
    private static final String ATTRIBUTE = "class";
    private static final String EXTENSION_POINT = "testType";
    private Collection<ITestType> types;

    /**
     * Returns the {@link ITestType} contributions to the testType extension point that support the
     * file provided
     * 
     * @param file
     *            The file to check
     * @return A collection of {@link ITestType} contributions to the testType extension point that
     *         support {@code file}. Can be empty, but won't be null
     */
    public Collection<ITestType> getTestTypesFor(IFile file) {
        Collection<ITestType> allTestTypes = getAllTestTypes();
        Collection<ITestType> result = Lists.newArrayList();
        for (ITestType testType : allTestTypes) {
            if (testType.supports(file)) {
                result.add(testType);
            }
        }
        return result;
    }

    private synchronized Collection<ITestType> getAllTestTypes() {
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
