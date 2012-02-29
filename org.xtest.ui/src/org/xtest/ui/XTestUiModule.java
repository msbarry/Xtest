package org.xtest.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineRefreshJob;
import org.xtest.XTestRunner;
import org.xtest.ui.outline.XtestOutlineRefreshJob;

/**
 * Set up Guice bindings for running xtest plugin in eclipse
 * 
 * @author Michael Barry
 */
public class XTestUiModule extends org.xtest.ui.AbstractXTestUiModule {

    /**
     * Construct the Guice Binding UI module for the pluin provided
     * 
     * @param plugin
     */
    public XTestUiModule(AbstractUIPlugin plugin) {
        super(plugin);
    }

    /**
     * Binds {@link OutlineRefreshJob} implementation to custom
     * {@link XtestOutlineRefreshJob}
     * 
     * @return {@link OutlineRefreshJob} class
     */
    public Class<? extends OutlineRefreshJob> bindOutlineRefreshJob() {
        return XtestOutlineRefreshJob.class;
    }

    /**
     * Binds {@link XTestRunner} implementation to custom {@link UiXTestRunner}
     * 
     * @return {@link UiXTestRunner} class
     */
    public Class<? extends XTestRunner> bindXTestRunner() {
        return UiXTestRunner.class;
    }
}
