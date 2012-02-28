package org.xtest;

/**
 * Initialization support for running Xtext languages without equinox extension
 * registry
 */
public class XTestStandaloneSetup extends XTestStandaloneSetupGenerated {

    /**
     * Sets up Guice bindings and EMF registry.
     */
    public static void doSetup() {
        new XTestStandaloneSetup().createInjectorAndDoEMFRegistration();
    }
}
