package org.xtest.runner.external;

import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.xtest.runner.Activator;
import org.xtest.runner.RunAllJob;
import org.xtest.runner.RunnableTest;
import org.xtest.runner.TestsProvider;

import com.google.common.collect.Sets;
import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Utility methods for scheduling tests to be run
 * 
 * @author Michael Barry
 */
public class ContinuousTestRunner {
    private static Injectables injected;

    static {
        Injector injector = Activator.getDefault().getInjector();
        injected = injector.getInstance(Injectables.class);
    }

    /**
     * Schedule a test file to be run
     * 
     * @param fileToRun
     *            The test file to be run
     */
    public static void schedule(IFile fileToRun) {
        Collection<RunnableTest> toRun = injected.testProvider.getTestsFromDeltas(Sets
                .newHashSet(fileToRun));
        if (toRun != null && !toRun.isEmpty()) {
            scheduleAll(toRun);
        }
    }

    /**
     * Schedule a list of tests to be run
     * 
     * @param toRun
     *            The list of tests to be run
     */
    public static void scheduleAll(Collection<RunnableTest> toRun) {
        if (injected.job.submit(toRun)) {
            injected.job.cancel();
            injected.job.schedule();
        } else {
            injected.job.scheduleIfNecessary();
        }
    }

    private static class Injectables {
        @Inject
        public RunAllJob job;
        @Inject
        public TestsProvider testProvider;
    }
}
