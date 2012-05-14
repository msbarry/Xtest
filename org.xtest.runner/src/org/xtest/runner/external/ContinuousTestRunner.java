package org.xtest.runner.external;

import java.util.Collection;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.xtest.runner.Activator;
import org.xtest.runner.Extensions;
import org.xtest.runner.RunAllJob;
import org.xtest.runner.RunnableTest;

import com.google.common.collect.Sets;
import com.google.inject.Injector;

/**
 * Utility methods for scheduling tests to be run
 * 
 * @author Michael Barry
 */
public class ContinuousTestRunner {
    private static final Extensions extensions;
    private static final RunAllJob job;
    static {
        Injector injector = Activator.getDefault().getInjector();
        extensions = injector.getInstance(Extensions.class);
        job = injector.getInstance(RunAllJob.class);
    }

    /**
     * Schedule a test file to be run
     * 
     * @param toRun
     *            The test file to be run
     */
    public static void schedule(IFile toRun) {
        Collection<ITestType> types = extensions.getTestTypesFor(toRun);
        Set<RunnableTest> tests = Sets.newHashSet();
        for (ITestType type : types) {
            tests.add(new RunnableTest(toRun, type));
        }
        scheduleAll(tests);
    }

    /**
     * Schedule a list of tests to be run
     * 
     * @param toRun
     *            The list of tests to be run
     */
    public static void scheduleAll(Set<RunnableTest> toRun) {
        if (job.submit(toRun)) {
            job.cancel();
            job.schedule();
        } else {
            job.scheduleIfNecessary();
        }
    }
}
