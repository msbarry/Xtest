package org.xtest.runner.statusbar;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.xtest.runner.TestsProvider;
import org.xtest.runner.external.ContinuousTestRunner;

import com.google.inject.Inject;

/**
 * Handler for run-all command
 * 
 * @author Michael Barry
 */
public class RunAllHandler extends AbstractHandler {
    @Inject
    private TestsProvider provider;

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ContinuousTestRunner.scheduleAll(provider.getAllTests());
        return null;
    }

}
