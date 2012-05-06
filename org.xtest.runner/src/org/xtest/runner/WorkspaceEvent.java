package org.xtest.runner;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;

import com.google.common.collect.Sets;

public class WorkspaceEvent {

    public static WorkspaceEvent wrap(IResourceChangeEvent event) {
        return new WorkspaceEvent(event);
    }

    private final IResourceChangeEvent event;

    private WorkspaceEvent(IResourceChangeEvent event) {
        this.event = event;
    }

    public Set<IFile> getDeltas() {
        final Set<IFile> deltas = Sets.newHashSet();
        try {
            event.getDelta().accept(new IResourceDeltaVisitor() {

                @Override
                public boolean visit(IResourceDelta delta) throws CoreException {
                    IResource resource = delta.getResource();
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

    public boolean isBuild() {
        return (event.getType() & (IResourceChangeEvent.POST_BUILD | IResourceChangeEvent.POST_CHANGE)) > 0;
    }

}
