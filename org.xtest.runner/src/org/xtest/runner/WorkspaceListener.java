package org.xtest.runner;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
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
            build(wrapped);
        } else if (wrapped.isClean()) {
            clean(wrapped);
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

    private void build(WorkspaceEvent wrapped) {
        long start = System.nanoTime();
        Set<IFile> deltas = wrapped.getDeltas();
        if (!deltas.isEmpty()) {
            logger.debug("---> Changes: {}", deltas);
            Set<RunnableTest> toRun = testProvider.getTestsFromDeltas(deltas);
            if (toRun != null && !toRun.isEmpty()) {
                ContinuousTestRunner.scheduleAll(toRun);
            }
            long end = System.nanoTime();
            // TODO if test selection starts taking a long time, push it into the worker thread
            logger.debug("---> Test selection took {} ms",
                    TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS));
        }
    }

    private void clean(WorkspaceEvent wrapped) {
        Set<IProject> projects = wrapped.getProjects();
        long start = System.nanoTime();
        for (IProject project : projects) {
            Set<RunnableTest> tests = testProvider.getTestsIn(project);
            logger.info("Cleaning test in {}: {}", project.getName(), tests);
            for (RunnableTest test : tests) {
                test.clean();
            }
        }
        long end = System.nanoTime();
        logger.debug("Clean took {} ms",
                TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS));
    }

}
