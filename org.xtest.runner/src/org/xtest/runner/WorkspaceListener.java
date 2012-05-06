package org.xtest.runner;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;

import com.google.inject.Inject;

public class WorkspaceListener implements IResourceChangeListener {
    @Inject
    private ContinuousTestRunner runner;
    @Inject
    private TestsProvider testProvider;

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        WorkspaceEvent wrapped = WorkspaceEvent.wrap(event);
        if (wrapped.isBuild()) {
            Set<IFile> deltas = wrapped.getDeltas();
            Set<RunnableTest> toRun = testProvider.getTestsFromDeltas(deltas);
            if (toRun != null && !toRun.isEmpty()) {
                runner.scheduleAll(toRun);
            }
        }
    }

    public void startup() {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        workspace.addResourceChangeListener(this, IResourceChangeEvent.POST_BUILD
                | IResourceChangeEvent.POST_CHANGE);
    }

}
