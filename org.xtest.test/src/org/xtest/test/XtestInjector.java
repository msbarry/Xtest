package org.xtest.test;

import org.xtest.XTestInjectorProvider;

import com.google.inject.Injector;

public class XtestInjector {
    public static Injector injector = new XTestInjectorProvider().getInjector();
}
