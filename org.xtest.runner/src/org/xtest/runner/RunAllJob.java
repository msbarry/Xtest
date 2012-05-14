package org.xtest.runner;

import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xtest.runner.external.ITestRunner;
import org.xtest.runner.external.ITestType;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.inject.Singleton;

/**
 * Re-usable job that runs all scheduled tests
 * 
 * @author Michael Barry
 */
@Singleton
public class RunAllJob extends Job {
    private static final Logger logger = LoggerFactory.getLogger(RunAllJob.class);
    private final PriorityBlockingQueue<RunnableTest> files;

    /**
     * Constructs a new {@link RunAllJob}, should only be called by Guice.
     */
    public RunAllJob() {
        super("Xtest");
        files = new PriorityBlockingQueue<RunnableTest>();
    }

    /**
     * Schedules the job if it has pending transactions and is not running
     */
    public void scheduleIfNecessary() {
        if (!files.isEmpty() && getState() != Job.RUNNING) {
            schedule();
        }
    }

    /**
     * Submits a set of {@link RunnableTest}s to the queue
     * 
     * @param toRun
     *            The list of tests to schedule
     * @return True if any of the tests were not already scheduled, false if no change was made to
     *         scheduled test queue
     */
    public boolean submit(Set<RunnableTest> toRun) {
        boolean scheduled = false;
        for (RunnableTest file : toRun) {
            if (file != null && !files.contains(file)) {
                file.setPending();
                files.offer(file);
                scheduled = true;
            }
        }
        return scheduled;
    }

    @Override
    protected void canceling() {
        super.canceling();
        getThread().interrupt();
    }

    @Override
    protected IStatus run(IProgressMonitor monitor) {
        try {
            getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD,
                    new SubProgressMonitor(monitor, 1));
            getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD,
                    new SubProgressMonitor(monitor, 1));
        } catch (OperationCanceledException e) {
        } catch (InterruptedException e) {
        }
        long start = System.nanoTime();
        int size = files.size();
        SubMonitor convert = SubMonitor.convert(monitor, "Running Tests", size);
        logger.info("==========> Starting {} tests", size);
        Cache<ITestType, ITestRunner> runnerCache = CacheBuilder.newBuilder().build(
                new CacheLoader<ITestType, ITestRunner>() {
                    @Override
                    public ITestRunner load(ITestType arg0) throws Exception {
                        return arg0.provideNewRunner();
                    }
                });
        while (!monitor.isCanceled() && !files.isEmpty()) {
            RunnableTest peek = files.peek();
            invokeAndRecord(peek, runnerCache, convert.newChild(1));
            files.remove(peek);
        }
        if (monitor.isCanceled()) {
            logger.info("!!!!!!!!!!! Canceled with {} tests left took {} ms", files.size(),
                    TimeUnit.MILLISECONDS.convert(System.nanoTime() - start, TimeUnit.NANOSECONDS));
        } else {
            logger.info("==========> Finished {} tests took {} ms", size,
                    TimeUnit.MILLISECONDS.convert(System.nanoTime() - start, TimeUnit.NANOSECONDS));
        }
        monitor.done();
        return Status.OK_STATUS;
    }

    private void invokeAndRecord(RunnableTest peek, Cache<ITestType, ITestRunner> runnerCache,
            SubMonitor convert) {
        String name = peek.getName();
        convert.subTask(name);
        peek.invoke(convert, runnerCache);
    }
}
