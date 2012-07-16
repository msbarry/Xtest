package org.xtest.runner;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IElementChangedListener;
import org.eclipse.jdt.core.JavaCore;
import org.slf4j.LoggerFactory;
import org.xtest.runner.events.Events;
import org.xtest.runner.external.ContinuousTestRunner;

import com.google.inject.Inject;

/**
 * Listener on workspace build events
 * 
 * @author Michael Barry
 */
public class WorkspaceListener implements IResourceChangeListener, IElementChangedListener {
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(WorkspaceListener.class);
    @Inject
    private Events events;
    @Inject
    private Extensions extensions;
    @Inject
    private TestsProvider testProvider;

    @Override
    public void elementChanged(ElementChangedEvent event) {
        JavaModelEvent wrapped = JavaModelEvent.wrap(event);
        classpath(wrapped);
    }

    @Override
    public void resourceChanged(IResourceChangeEvent event) {
        WorkspaceEvent wrapped = WorkspaceEvent.wrap(event);
        Set<IFile> deleted = wrapped.getDeletedTests(extensions);
        if (!deleted.isEmpty()) {
            events.testDeleted(deleted);
        }
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
        JavaCore.addElementChangedListener(this, ElementChangedEvent.POST_CHANGE);
    }

    private void build(WorkspaceEvent wrapped) {
        long start = System.nanoTime();
        Set<IFile> deltas = wrapped.getDeltas(extensions);
        handleDeltas(start, deltas);
    }

    private void classpath(JavaModelEvent wrapped) {
        long start = System.nanoTime();
        Set<IFile> classpathChanges = wrapped.getClasspathChanges();
        handleDeltas(start, classpathChanges);
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

    private void handleDeltas(long start, Set<IFile> deltas) {
        if (!deltas.isEmpty()) {
            logger.debug("---> Changes: {}", deltas);
            Collection<RunnableTest> toRun = testProvider.getTestsFromDeltas(deltas);
            if (toRun != null && !toRun.isEmpty()) {
                ContinuousTestRunner.scheduleAll(toRun);
            } else {
                logger.debug("Nothing to run");
            }
            long end = System.nanoTime();
            // TODO if test selection starts taking a long time, push it into the worker thread
            logger.debug("---> Test selection took {} ms",
                    TimeUnit.MILLISECONDS.convert(end - start, TimeUnit.NANOSECONDS));
        }
    }

}
