package org.xtest.runner;

import java.util.Collection;
import java.util.Set;

import org.eclipse.core.resources.IFile;

import com.google.common.collect.Sets;
import com.google.inject.Inject;

public class ContinuousTestRunner {
    @Inject
    private Extensions extensions;
    @Inject
    private RunAllJob job;

    public void schedule(IFile toRun) {
        Collection<ITestType> types = extensions.getTestTypesFor(toRun);
        Set<RunnableTest> tests = Sets.newHashSet();
        for (ITestType type : types) {
            tests.add(new RunnableTest(toRun, type));
        }
        scheduleAll(tests);
    }

    public void scheduleAll(Set<RunnableTest> toRun) {
        if (job.submit(toRun)) {
            job.cancel();
            job.schedule();
        }
    }
}
