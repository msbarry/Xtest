package org.xtest.runner.statusbar;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.HandlerEvent;
import org.xtest.runner.RunAllJob;
import org.xtest.runner.events.TestsCanceled;
import org.xtest.runner.events.TestsFinished;
import org.xtest.runner.events.TestsStarted;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

/**
 * Handler for stop-test button events and events that influence whether that button is enabled or
 * not.
 * 
 * @author Michael Barry
 */
public class StopHandler extends AbstractHandler {
    private final EventBus bus;
    private boolean enabled = false;
    private final RunAllJob job;

    /**
     * SHOULD ONLY BE CALLED BY GUICE
     * 
     * @param job
     *            {@link RunAllJob} instance provided by Guice
     * @param bus
     *            {@link EventBus} instance provided by Guice
     */
    @Inject
    public StopHandler(RunAllJob job, EventBus bus) {
        this.bus = bus;
        bus.register(this);
        this.job = job;
    }

    /**
     * SHOULD ONLY BE CALLED BY {@link EventBus}
     * 
     * @param canceled
     *            Tests canceled event
     */
    @Subscribe
    public void disable(TestsCanceled canceled) {
        enabled = false;
        fireHandlerChanged(new HandlerEvent(this, true, false));
    }

    /**
     * SHOULD ONLY BE CALLED BY {@link EventBus}
     * 
     * @param finished
     *            Tests finished event
     */
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

    /**
     * SHOULD ONLY BE CALLED BY {@link EventBus}
     * 
     * @param started
     *            Tests started event
     */
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
