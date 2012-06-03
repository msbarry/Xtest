package org.xtest.runner;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {
    /**
     * Error file icon ID
     */
    public static final String ERROR_FILE_ICON = "org.xtest.runner.icons.errorfile";
    /**
     * The plug-in ID
     */
    public static final String PLUGIN_ID = "org.xtest.runner"; //$NON-NLS-1$

    /**
     * The shared instance
     */
    private static Activator plugin;

    /**
     * Returns the shared instance
     * 
     * @return the shared instance
     */
    public static Activator getDefault() {
        return plugin;
    }

    private Injector injector;

    /**
     * The constructor
     */
    public Activator() {
    }

    /**
     * Start up the plugin
     */
    public void boot() {
        WorkspaceListener listener = injector.getInstance(WorkspaceListener.class);
        listener.startup();
    }

    /**
     * Returns an {@link ImageDescriptor} for the error file icon
     * 
     * @return An {@link ImageDescriptor} for the error file icon
     */
    public ImageDescriptor getErrorFileImage() {
        return getImageRegistry().getDescriptor(ERROR_FILE_ICON);
    }

    /**
     * Returns the {@link Injector}
     * 
     * @return The injector for this plugin
     */
    public Injector getInjector() {
        return injector;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
     */
    @Override
    public void start(BundleContext context) throws Exception {
        super.start(context);
        XtestRunnerModule xtestRunnerMudule = new XtestRunnerModule();
        injector = Guice.createInjector(xtestRunnerMudule);
        plugin = this;
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        plugin = null;
        super.stop(context);
    }

    @Override
    protected void initializeImageRegistry(ImageRegistry registry) {
        super.initializeImageRegistry(registry);
        Bundle bundle = Platform.getBundle(PLUGIN_ID);

        ImageDescriptor myImage = ImageDescriptor.createFromURL(FileLocator.find(bundle, new Path(
                "icons/error.gif"), null));
        registry.put(ERROR_FILE_ICON, myImage);
    }

}
