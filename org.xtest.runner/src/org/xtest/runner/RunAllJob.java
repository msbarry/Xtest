package org.xtest.runner;

import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;

import com.google.inject.Singleton;

@Singleton
public class RunAllJob extends Job {
    private final PriorityBlockingQueue<RunnableTest> files;

    public RunAllJob() {
        super("Xtest");
        files = new PriorityBlockingQueue<RunnableTest>();
    }

    public void submit(Set<RunnableTest> toRun) {
        setPriority(Job.INTERACTIVE);
        for (RunnableTest file : toRun) {
            if (file != null && !files.contains(file)) {
                files.offer(file);
            }
        }
    }

    @Override
    protected void canceling() {
        super.canceling();
        getThread().interrupt();
    }

    @Override
    protected IStatus run(IProgressMonitor monitor) {
        // Wait for builds to finish
        try {
            getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD,
                    new SubProgressMonitor(monitor, 1));
            getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD,
                    new SubProgressMonitor(monitor, 1));
        } catch (OperationCanceledException e) {
        } catch (InterruptedException e) {
        }
        long start = System.currentTimeMillis();
        SubMonitor convert = SubMonitor.convert(monitor, "Running Tests", files.size());
        System.err.println("running " + files.size());
        while (!monitor.isCanceled() && !files.isEmpty()) {
            RunnableTest peek = files.peek();
            invokeAndRecord(peek, convert);
            files.remove(peek);
        }
        monitor.done();
        System.err.println(System.currentTimeMillis() - start + " millis");
        return Status.OK_STATUS;
    }

    private void invokeAndRecord(RunnableTest peek, SubMonitor convert) {
        String name = peek.getName();
        convert.subTask(name);
        peek.invoke(convert);
    }
}
