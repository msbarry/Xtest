package org.xtest.test;

import org.xtest.junit.InjectorProvider;

import com.google.inject.Injector;

public class XtestInjector extends InjectorProvider {
    public static Injector injector = new XtestInjectorProviderCustom().getInjector();

    @Override
    public Injector getInjector() {
        return injector;
    }
}
