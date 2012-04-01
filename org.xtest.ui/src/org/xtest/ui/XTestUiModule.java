package org.xtest.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.DirtyStateEditorSupport;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineRefreshJob;
import org.xtest.XTestRunner;
import org.xtest.ui.editor.XtestDirtyStateEditorSupport;
import org.xtest.ui.editor.XtestEditorErrorTickUpdater;
import org.xtest.ui.outline.ValidationTriggeredOutlinePage;
import org.xtest.ui.outline.XtestOutlineRefreshJob;
import org.xtest.ui.runner.UiXTestRunner;
import org.xtest.ui.templates.XtestTemplateProposalProvider;

import com.google.inject.name.Names;

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

    public Class<? extends DirtyStateEditorSupport> bindDirtyStateEditorSupport() {
        return XtestDirtyStateEditorSupport.class;
    }

    @Override
    public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
        return XtestTemplateProposalProvider.class;
    }

    /**
     * Binds {@link OutlinePage} implementation to custom {@link ValidationTriggeredOutlinePage}
     * 
     * @return {@link ValidationTriggeredOutlinePage} class
     */
    public Class<? extends OutlinePage> bindOutlinePage() {
        return ValidationTriggeredOutlinePage.class;
    }

    /**
     * Binds {@link OutlineRefreshJob} implementation to custom {@link XtestOutlineRefreshJob}
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

    @Override
    public void configureXtextEditorErrorTickUpdater(com.google.inject.Binder binder) {
        binder.bind(IXtextEditorCallback.class)
                .annotatedWith(Names.named("IXtextEditorCallBack")).to( //$NON-NLS-1$
                        XtestEditorErrorTickUpdater.class);
    }
}
