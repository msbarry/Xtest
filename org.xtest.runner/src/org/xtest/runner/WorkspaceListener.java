package org.xtest.runner;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.slf4j.LoggerFactory;
import org.xtest.runner.external.ContinuousTestRunner;

import com.google.inject.Inject;

/**
 * Listener on workspace build events
 * 
 * @author Michael Barry
 */
public class WorkspaceListener implements IResourceChangeListener {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(WorkspaceListener.class);
    @Inject
    private TestsProvider testProvider;

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        WorkspaceEvent wrapped = WorkspaceEvent.wrap(event);
        if (wrapped.isBuild()) {
            Set<IFile> deltas = wrapped.getDeltas();
            logger.debug("Processing resource change event.  {} files changed", deltas.size());
            Set<RunnableTest> toRun = testProvider.getTestsFromDeltas(deltas);
            if (toRun != null && !toRun.isEmpty()) {
                ContinuousTestRunner.scheduleAll(toRun);
            }
        }
    }

    /**
     * Registers this listener on worksapce build events
     */
    public void startup() {
        IWorkspace workspace = ResourcesPlugin.getWorkspace();
        workspace.addResourceChangeListener(this, IResourceChangeEvent.POST_BUILD
                | IResourceChangeEvent.POST_CHANGE);
    }

}
