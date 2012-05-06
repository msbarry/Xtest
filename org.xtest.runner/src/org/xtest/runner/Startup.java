package org.xtest.runner;

import org.eclipse.ui.IStartup;

public class Startup implements IStartup {

    @Override
    public void earlyStartup() {
        Activator.getDefault().boot();
    }

}
