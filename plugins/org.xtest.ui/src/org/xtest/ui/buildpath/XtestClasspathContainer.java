package org.xtest.ui.buildpath;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IAccessRule;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.framework.Bundle;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

/**
 * Xtest classpath container
 * 
 * @author Michael Barry
 */
public class XtestClasspathContainer implements IClasspathContainer {
    /**
     * List of libraries required by Xtest
     */
    public static final List<String> LIBS = ImmutableList.of("com.google.guava",
            "org.eclipse.xtext.xbase.lib", "org.xtest.lib");

    private final IPath containerPath;

    /**
     * Construct a new Xtest classpath container for the project at the path provided
     * 
     * @param containerPath
     *            The project path
     */
    public XtestClasspathContainer(IPath containerPath) {
        this.containerPath = containerPath;
    }

    @Override
    public IClasspathEntry[] getClasspathEntries() {
        List<IClasspathEntry> entries = Lists.newArrayList();
        for (String bundleId : LIBS) {
            addEntry(entries, bundleId);
        }
        return entries.toArray(new IClasspathEntry[] {});
    }

    @Override
    public String getDescription() {
        return "Xtest Libraries";
    }

    @Override
    public int getKind() {
        return IClasspathContainer.K_APPLICATION;
    }

    @Override
    public IPath getPath() {
        return containerPath;
    }

    private void addEntry(final List<IClasspathEntry> cpEntries, final String bundleId) {
        IPath bundlePath = findBundle(bundleId);
        if (bundlePath != null) {
            IPath sourceBundlePath = findBundle(bundleId + ".source");
            cpEntries.add(JavaCore.newLibraryEntry(bundlePath, sourceBundlePath, null,
                    new IAccessRule[] {}, null, false));
        }
    }

    private IPath findBundle(String bundleId) {
        // Borrowed from
        // org.eclipse.xtend.ide.buildpath.XtendContainerInitializer$XtendClasspathContainer
        Bundle bundle = Platform.getBundle(bundleId);
        if (bundle != null) {
            File bundleFile = null;
            try {
                bundleFile = FileLocator.getBundleFile(bundle);
                URL binFolderURL = FileLocator.find(bundle, new Path("bin"), null);
                IPath path;
                if (binFolderURL != null) {
                    path = new Path(FileLocator.toFileURL(binFolderURL).getPath());
                } else {
                    path = new Path(bundleFile.getAbsolutePath());
                }
                if (!path.isAbsolute()) {
                    path = path.makeAbsolute();
                }
                return path;
            } catch (IOException e) {
            }
        }
        return null;

    }

}
