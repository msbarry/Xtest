package org.xtest.test;

import org.xtest.XTestInjectorProvider;
import org.xtest.XTestRuntimeModule;
import org.xtest.XTestStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class XtestInjectorProviderCustom extends XTestInjectorProvider {
    @Override
    protected Injector internalCreateInjector() {
        System.out.println("Binding Classloader to custom instance");
        return new XTestStandaloneSetup() {
            @Override
            public Injector createInjector() {
                return Guice.createInjector(new XTestRuntimeModule() {
                    @Override
                    public ClassLoader bindClassLoaderToInstance() {
                        return XtestInjectorProviderCustom.class.getClassLoader();
                    };
                });
            }
        }.createInjectorAndDoEMFRegistration();
    }
}
