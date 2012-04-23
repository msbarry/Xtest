package org.xtest.ui.runner;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;

import com.google.inject.Singleton;

@Singleton
public class BuildFinishedListener implements IResourceChangeListener {
    public BuildFinishedListener() {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        workspace.addResourceChangeListener(this, IResourceChangeEvent.POST_BUILD);
    }

    @Override
    public void resourceChanged(IResourceChangeEvent event) {

        try {
            event.getDelta().accept(new IResourceDeltaVisitor() {

                @Override
                public boolean visit(IResourceDelta delta) throws CoreException {
                    if (delta.getResource() instanceof IFile) {
                        System.err.println(delta.getFullPath());
                    }
                    return true;
                }
            });
        } catch (CoreException e) {
        }
    }
}
