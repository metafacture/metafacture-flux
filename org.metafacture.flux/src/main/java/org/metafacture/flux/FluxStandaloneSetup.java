/*
 * generated by Xtext 2.23.0
 */

package org.metafacture.flux;

/**
 * Initialization support for running Xtext languages without Equinox extension
 * registry.
 */
public class FluxStandaloneSetup extends FluxStandaloneSetupGenerated {

    public FluxStandaloneSetup() {
    }

    public static void doSetup() {
        new FluxStandaloneSetup().createInjectorAndDoEMFRegistration();
    }
}
