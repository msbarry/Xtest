package org.xtest.runner;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
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
     * @return The files that are affected by this delta
     */
    public Set<IFile> getDeltas() {
        final Set<IFile> deltas = Sets.newHashSet();
        try {
            event.getDelta().accept(new IResourceDeltaVisitor() {

                @Override
                public boolean visit(IResourceDelta delta) throws CoreException {
                    IResource resource = delta.getResource();
                    // Only care about specific events
                    if (resource instanceof IFile
                            && (delta.getFlags() & (IResourceDelta.CONTENT
                                    | IResourceDelta.MOVED_FROM | IResourceDelta.MOVED_TO
                                    | IResourceDelta.ADDED | IResourceDelta.REMOVED | IResourceDelta.LOCAL_CHANGED)) > 0) {
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
     * Returns true if this event has been triggered due to a build finishing
     * 
     * @return True if this event has been triggered due to a build finishing
     */
    public boolean isBuild() {
        return (event.getType() & (IResourceChangeEvent.POST_BUILD | IResourceChangeEvent.POST_CHANGE)) > 0;
    }

}
