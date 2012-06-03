package org.xtest.runner;

import com.google.common.eventbus.EventBus;
import com.google.inject.Binder;
import com.google.inject.Module;

/**
 * Guice bindings for this plugin
 * 
 * @author Michael Barry
 */
public class XtestRunnerModule implements Module {

    @Override
    public void configure(Binder binder) {
        binder.bind(EventBus.class).toInstance(new EventBus("Xtest Runner Event Bus"));
    }
}
