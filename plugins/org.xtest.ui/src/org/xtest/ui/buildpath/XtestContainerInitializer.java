package org.xtest.ui.buildpath;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.ClasspathContainerInitializer;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

/**
 * Initializer for Xtest classpath container
 * 
 * @author Michael Barry
 */
public class XtestContainerInitializer extends ClasspathContainerInitializer {

    @Override
    public boolean canUpdateClasspathContainer(IPath containerPath, IJavaProject project) {
        return true;
    }

    @Override
    public void initialize(IPath containerPath, IJavaProject project) throws CoreException {
        IClasspathContainer container = new XtestClasspathContainer(containerPath);
        JavaCore.setClasspathContainer(containerPath, new IJavaProject[] { project },
                new IClasspathContainer[] { container }, null);
    }
}
