package org.xtest.runner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.eclipse.ui.IStartup;

/**
 * Class that gets called by Eclipse on startup to intialize the Xtest runner
 * 
 * @author Michael Barry
 */
public class Startup implements IStartup {
    private static final Logger logger = Logger.getLogger(Startup.class);

    @Override
    public void earlyStartup() {
        try {
            PropertyConfigurator.configure(Activator.getDefault().getBundle()
                    .getEntry("log4j.properties"));
        } catch (NoClassDefFoundError e) {
            logger.error("Unable to configure logging");
        }

        logger.info("Initializing Xtest runner service.");
        Activator.getDefault().boot();
    }

}
