package org.xtest.runner;

import static org.eclipse.jdt.core.IJavaElementDelta.F_ADDED_TO_CLASSPATH;
import static org.eclipse.jdt.core.IJavaElementDelta.F_ARCHIVE_CONTENT_CHANGED;
import static org.eclipse.jdt.core.IJavaElementDelta.F_CLASSPATH_CHANGED;
import static org.eclipse.jdt.core.IJavaElementDelta.F_REMOVED_FROM_CLASSPATH;
import static org.eclipse.jdt.core.IJavaElementDelta.F_REORDER;
import static org.eclipse.jdt.core.IJavaElementDelta.F_RESOLVED_CLASSPATH_CHANGED;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.xtest.runner.util.ClasspathUtils;

import com.google.common.collect.Sets;

/**
 * Wrapper for an {@link ElementChangedEvent} in the workspace
 * 
 * @author Michael Barry
 */
public class JavaModelEvent {

    /**
     * Wraps the event provided
     * 
     * @param event
     *            The event to wrap
     * @return A wrapper for {@code event}
     */
    public static JavaModelEvent wrap(ElementChangedEvent event) {
        return new JavaModelEvent(event);
    }

    private final ElementChangedEvent event;

    private JavaModelEvent(ElementChangedEvent event) {
        this.event = event;
    }

    /**
     * Returns the jar files that have been changed on the classpath
     * 
     * @return Set of jar files that have been changed on the classpath
     */
    public Set<IFile> getClasspathChanges() {
        IJavaElementDelta delta = event.getDelta();
        return process(delta);
    }

    private Set<IFile> process(IJavaElementDelta delta) {
        Set<IFile> paths = Sets.newHashSet();
        int flags = delta.getFlags();
        if ((flags & (F_CLASSPATH_CHANGED | F_RESOLVED_CLASSPATH_CHANGED)) > 0) {
            // TODO Is it necessary to pick up on changes to imported projects?
        } else if ((flags & (F_ADDED_TO_CLASSPATH | F_ARCHIVE_CONTENT_CHANGED
                | F_REMOVED_FROM_CLASSPATH | F_REORDER)) > 0) {
            IJavaElement element = delta.getElement();
            IPath path = element.getPath();
            IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
            IPath normalizePath = ClasspathUtils.normalizePath(root, path);
            IFile file;
            file = root.getFileForLocation(normalizePath);
            if (file == null) {
                file = root.getFile(normalizePath);
            }
            if (file != null) {
                paths.add(file);
            }
        }
        for (IJavaElementDelta delta2 : delta.getAffectedChildren()) {
            paths.addAll(process(delta2));
        }
        return paths;
    }
}
