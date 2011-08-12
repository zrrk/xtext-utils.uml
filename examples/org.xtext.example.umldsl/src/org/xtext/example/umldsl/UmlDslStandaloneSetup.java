
package org.xtext.example.umldsl;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class UmlDslStandaloneSetup extends UmlDslStandaloneSetupGenerated{

	public static void doSetup() {
		new UmlDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

