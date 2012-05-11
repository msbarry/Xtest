package org.xtest.runner;

import static org.eclipse.core.resources.IResourceDelta.ADDED;
import static org.eclipse.core.resources.IResourceDelta.CONTENT;
import static org.eclipse.core.resources.IResourceDelta.LOCAL_CHANGED;
import static org.eclipse.core.resources.IResourceDelta.REMOVED;
import static org.eclipse.core.resources.IResourceDelta.REPLACED;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;

import com.google.common.collect.Sets;

/**
 * Wrapper for an {@link IResourceChangeEvent} in the workspace
 * 
 * @author Michael Barry
 */
public class WorkspaceEvent {

    /**
     * Wraps the event provided
     * 
     * @param event
     *            The event to wrap
     * @return A wrapper for {@code event}
     */
    public static WorkspaceEvent wrap(IResourceChangeEvent event) {
        return new WorkspaceEvent(event);
    }

    private final IResourceChangeEvent event;

    private WorkspaceEvent(IResourceChangeEvent event) {
        this.event = event;
    }

    /**
     * Returns the files that are affected by this delta
     * 
     * @param extensions
     *            Extensions that tell us if test types care about each delta
     * 
     * @return The files that are affected by this delta
     */
    public Set<IFile> getDeltas(final Extensions extensions) {
        final Set<IFile> deltas = Sets.newHashSet();
        try {
            event.getDelta().accept(new IResourceDeltaVisitor() {

                @Override
                public boolean visit(IResourceDelta delta) throws CoreException {
                    IResource resource = delta.getResource();
                    // Only care about specific events
                    if (resource instanceof IFile
                            && extensions.careAboutDelta((IFile) resource)
                            && ((delta.getKind() & (ADDED | REMOVED)) > 0 || (delta.getFlags() & (CONTENT
                                    | REPLACED | LOCAL_CHANGED)) > 0)) {
                        deltas.add((IFile) resource);
                    }
                    return true;
                }
            });
        } catch (CoreException e) {
        }
        return deltas;
    }

    /**
     * Returns the projects affected by this event
     * 
     * @return The projects affected by this event
     */
    public Set<IProject> getProjects() {
        IResourceDelta delta = event.getDelta();
        final Set<IProject> projects = Sets.newHashSet();
        try {
            delta.accept(new IResourceDeltaVisitor() {

                @Override
                public boolean visit(IResourceDelta delta) throws CoreException {
                    IResource resource = delta.getResource();
                    boolean deeper = true;
                    if (resource instanceof IProject) {
                        projects.add((IProject) resource);
                        deeper = false;
                    }
                    return deeper;
                }
            });
        } catch (CoreException e) {
        }
        return projects;
    }

    /**
     * Returns true if this event has been triggered due to a build finishing
     * 
     * @return True if this event has been triggered due to a build finishing
     */
    public boolean isBuild() {
        return event.getBuildKind() != IncrementalProjectBuilder.CLEAN_BUILD
                && (event.getType() & IResourceChangeEvent.POST_CHANGE) > 0;
    }

    /**
     * Returns true if this event has been triggered due to a clean event
     * 
     * @return True if this event has been triggered due to a clean event
     */
    public boolean isClean() {
        return event.getBuildKind() == IncrementalProjectBuilder.CLEAN_BUILD
                && (event.getType() & IResourceChangeEvent.POST_BUILD) > 0;
    }
}
