/*
* generated by Xtext
*/
package org.xtest;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class XTestUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.xtest.ui.internal.XTestActivator.getInstance().getInjector("org.xtest.XTest");
	}
	
}
