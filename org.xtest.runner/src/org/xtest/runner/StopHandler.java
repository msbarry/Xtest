package org.xtest.runner;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.HandlerEvent;
import org.xtest.runner.events.TestsCanceled;
import org.xtest.runner.events.TestsFinished;
import org.xtest.runner.events.TestsStarted;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

/**
 * Handler for stop-test events
 * 
 * @author Michael Barry
 */
public class StopHandler extends AbstractHandler {
    private final EventBus bus;
    private boolean enabled = false;
    private final RunAllJob job;

    @Inject
    public StopHandler(RunAllJob job, EventBus bus) {
        this.bus = bus;
        bus.register(this);
        this.job = job;
    }

    @Subscribe
    public void disable(TestsCanceled canceled) {
        enabled = false;
        fireHandlerChanged(new HandlerEvent(this, true, false));
    }

    @Subscribe
    public void disable(TestsFinished finished) {
        enabled = false;
        fireHandlerChanged(new HandlerEvent(this, true, false));
    }

    @Override
    public void dispose() {
        super.dispose();
        bus.unregister(this);
    }

    @Subscribe
    public void enable(TestsStarted started) {
        enabled = true;
        fireHandlerChanged(new HandlerEvent(this, true, false));
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        job.cancel();
        return null;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
