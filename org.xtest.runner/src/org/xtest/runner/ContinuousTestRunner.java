package org.xtest.runner;

import java.util.Collection;
import java.util.Set;

import org.eclipse.core.resources.IFile;

import com.google.common.collect.Sets;
import com.google.inject.Injector;

public class ContinuousTestRunner {
    private static final Extensions extensions;
    private static final RunAllJob job;
    static {
        Injector injector = Activator.getDefault().getInjector();
        extensions = injector.getInstance(Extensions.class);
        job = injector.getInstance(RunAllJob.class);
    }

    public static void schedule(IFile toRun) {
        Collection<ITestType> types = extensions.getTestTypesFor(toRun);
        Set<RunnableTest> tests = Sets.newHashSet();
        for (ITestType type : types) {
            tests.add(new RunnableTest(toRun, type));
        }
        scheduleAll(tests);
    }

    public static void scheduleAll(Set<RunnableTest> toRun) {
        if (job.submit(toRun)) {
            job.cancel();
            job.schedule();
        }
    }
}
