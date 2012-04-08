package org.xtest.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.common.types.xtext.ui.JdtValidationJobScheduler;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineRefreshJob;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;
import org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator;
import org.xtest.XTestRunner;
import org.xtest.ui.editor.UIDefaultPreferenceProvider;
import org.xtest.ui.editor.UIDefaultPreferenceProvider.Initializer;
import org.xtest.ui.editor.XtestEditorErrorTickUpdater;
import org.xtest.ui.editor.XtestPreferencePage;
import org.xtest.ui.highlight.XtestHighlightingCalculator;
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

    @Override
    public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
        return XtestTemplateProposalProvider.class;
    }

    /**
     * Binds {@link JdtValidationJobScheduler} implementation to custom
     * {@link XtestValidationJobScheduler}
     * 
     * @return {@link XtestValidationJobScheduler} class
     */
    public Class<? extends JdtValidationJobScheduler> bindJdtValidationJobScheduler() {
        return XtestValidationJobScheduler.class;
    }

    /**
     * Binds {@link LanguageRootPreferencePage} implementation to custom {@link XtestPreferencePage}
     * 
     * @return {@link XtestPreferencePage} class
     */
    public Class<? extends LanguageRootPreferencePage> bindLanguageRootPreferencePage() {
        return XtestPreferencePage.class;
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
     * Binds {@link XbaseHighlightingCalculator} implementation to custom
     * {@link XtestHighlightingCalculator}
     * 
     * @return {@link XtestHighlightingCalculator} class
     */
    @SuppressWarnings("restriction")
    public Class<? extends XbaseHighlightingCalculator> bindXbaseHighlightingCalculator() {
        return XtestHighlightingCalculator.class;
    }

    /**
     * Binds {@link XTestRunner} implementation to custom {@link UiXTestRunner}
     * 
     * @return {@link UiXTestRunner} class
     */
    public Class<? extends XTestRunner> bindXTestRunner() {
        return UiXTestRunner.class;
    }

    /**
     * Binds {@link IPreferenceStoreInitializer} implementation for
     * {@link UIDefaultPreferenceProvider} to custom
     * {@link org.xtest.ui.editor.UIDefaultPreferenceProvider.Initializer} implementation.
     * 
     * @param binder
     *            The Guice Binder
     */
    public void configureXtestPreferenceStoreInitializer(com.google.inject.Binder binder) {
        binder.bind(org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer.class)
                .annotatedWith(com.google.inject.name.Names.named("UIDefaultPreferenceProvider"))
                .to(Initializer.class);
    }

    @Override
    public void configureXtextEditorErrorTickUpdater(com.google.inject.Binder binder) {
        binder.bind(IXtextEditorCallback.class)
                .annotatedWith(Names.named("IXtextEditorCallBack")).to( //$NON-NLS-1$
                        XtestEditorErrorTickUpdater.class);
    }
}
