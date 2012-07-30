package org.xtest.junit;

import org.xtest.XTestStandaloneSetup;

import com.google.inject.Injector;

/**
 * Injector provider.
 * 
 * @author Michael Barry
 */
public class InjectorProvider {
    /**
     * Default implementation, just use {@link XTestStandaloneSetup}
     * 
     * @return A new {@link Injector}
     */
    public Injector getInjector() {
        return new XTestStandaloneSetup().createInjectorAndDoEMFRegistration();
    }
}
