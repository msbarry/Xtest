package org.xtest.ui;

import static com.google.common.collect.Sets.newHashSet;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Set;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtest.XTestRunner;
import org.xtest.interpreter.XTestInterpreter;

import com.google.inject.Inject;
import com.google.inject.Provider;

/**
 * Custom implementation of XTestRunner for use in the UI that overrides the
 * classloader of the xtest interpreter with one that recognizes classes in the
 * runtime java project
 * 
 * @author Michael Barry
 */
public class UiXTestRunner extends XTestRunner {
    @Inject
    private Provider<XTestInterpreter> interpreterProvider;

    @SuppressWarnings("restriction")
    @Override
    protected XTestInterpreter getInterpreter(Resource resource) {
        // BORROWED FROM
        // org.eclipse.xtext.purexbase.ui.autoedit.ReplAutoEdit.java
        // in order to use the classloader of the java project in the running
        // instance of eclipse rather than the classloader of this class itself
        XTestInterpreter interpreter = interpreterProvider.get();
        if (resource instanceof XtextResource) {
            ResourceSet set = resource.getResourceSet();
            ClassLoader cl = getClass().getClassLoader();
            if (set instanceof XtextResourceSet) {
                Object context = ((XtextResourceSet) set)
                        .getClasspathURIContext();
                if (context instanceof IJavaProject) {
                    try {
                        final IJavaProject jp = (IJavaProject) context;
                        IClasspathEntry[] classpath = jp
                                .getResolvedClasspath(true);
                        final IWorkspaceRoot root = jp.getProject()
                                .getWorkspace().getRoot();
                        Set<URL> urls = newHashSet();
                        for (int i = 0; i < classpath.length; i++) {
                            final IClasspathEntry entry = classpath[i];
                            if (entry.getEntryKind() == IClasspathEntry.CPE_SOURCE) {
                                IPath outputLocation = entry
                                        .getOutputLocation();
                                if (outputLocation == null) {
                                    outputLocation = jp.getOutputLocation();
                                }
                                IFolder folder = root.getFolder(outputLocation);
                                if (folder.exists()) {
                                    urls.add(new URL(folder.getRawLocationURI()
                                            .toASCIIString() + "/"));
                                }
                            } else if (entry.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
                                IPath outputLocation = entry
                                        .getOutputLocation();
                                if (outputLocation == null) {
                                    IProject project = (IProject) jp
                                            .getProject()
                                            .getWorkspace()
                                            .getRoot()
                                            .getContainerForLocation(
                                                    entry.getPath());
                                    IJavaProject javaProject = JavaCore
                                            .create(project);
                                    outputLocation = javaProject
                                            .getOutputLocation();
                                }
                                IFolder folder = root.getFolder(outputLocation);
                                if (folder.exists()) {
                                    urls.add(new URL(folder.getRawLocationURI()
                                            .toASCIIString() + "/"));
                                }
                            } else {
                                urls.add(entry.getPath().toFile().toURL());
                            }
                        }
                        cl = new URLClassLoader(urls.toArray(new URL[urls
                                .size()]));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            interpreter.setClassLoader(cl);
        }
        return interpreter;
    }
}
