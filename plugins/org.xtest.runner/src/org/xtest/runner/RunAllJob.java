package org.xtest.runner;

import java.util.Collection;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.xtest.runner.events.Events;
import org.xtest.runner.external.ITestRunner;
import org.xtest.runner.external.ITestType;
import org.xtest.runner.external.TestResult;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Re-usable job that runs all scheduled tests
 * 
 * @author Michael Barry
 */
@Singleton
public class RunAllJob extends Job {
    private static final Logger logger = Logger.getLogger(RunAllJob.class);
    @Inject
    private Events events;
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
    public boolean submit(Collection<RunnableTest> toRun) {
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
        events.startTests(Lists.newArrayList(files));
        logger.info("==========> Starting " + size + " tests");
        Cache<ITestType, ITestRunner> runnerCache = CacheBuilder.newBuilder().build(
                new CacheLoader<ITestType, ITestRunner>() {
                    @Override
                    public ITestRunner load(ITestType arg0) throws Exception {
                        return arg0.provideNewRunner();
                    }
                });

        // Run each test
        while (!monitor.isCanceled() && !files.isEmpty()) {
            RunnableTest peek = files.peek();
            TestResult result = invokeAndRecord(peek, runnerCache, convert.newChild(1));
            files.remove(peek);
            if (!monitor.isCanceled()) {
                events.finishTest(result, peek.getFile());
            }
        }

        if (monitor.isCanceled()) {
            logger.info("!!!!!!!!!!! Canceled with "
                    + files.size()
                    + " tests left took "
                    + TimeUnit.MILLISECONDS.convert(System.nanoTime() - start, TimeUnit.NANOSECONDS)
                    + " ms");

            // Post a "canceled" event where the number of events scheduled is the size of the queue
            events.cancelAndSchedule(Lists.newArrayList(files));
        } else {
            logger.info("==========> Finished "
                    + size
                    + " tests took "
                    + TimeUnit.MILLISECONDS.convert(System.nanoTime() - start, TimeUnit.NANOSECONDS)
                    + " ms");

            // Only post finished event if not canceled
            events.finishTests();
        }
        monitor.done();
        return Status.OK_STATUS;
    }

    private TestResult invokeAndRecord(RunnableTest peek,
            Cache<ITestType, ITestRunner> runnerCache, SubMonitor convert) {
        String name = peek.getName();
        convert.subTask(name);
        return peek.invoke(convert, runnerCache);
    }
}
