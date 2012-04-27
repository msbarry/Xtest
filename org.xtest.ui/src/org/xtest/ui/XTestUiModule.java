package org.xtest.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.common.types.xtext.ui.ITypesProposalProvider;
import org.eclipse.xtext.service.SingletonBinding;
import org.eclipse.xtext.ui.editor.IXtextEditorCallback;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineRefreshJob;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreInitializer;
import org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage;
import org.eclipse.xtext.validation.CancelableDiagnostician;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator;
import org.xtest.XTestRunner;
import org.xtest.ui.contentassist.XtestImportingTypesProposalProvider;
import org.xtest.ui.editor.UIDefaultPreferenceProvider;
import org.xtest.ui.editor.UIDefaultPreferenceProvider.Initializer;
import org.xtest.ui.editor.XtestDocumentProvider;
import org.xtest.ui.editor.XtestEditorErrorTickUpdater;
import org.xtest.ui.editor.XtestPreferencePage;
import org.xtest.ui.highlight.XtestHighlightingCalculator;
import org.xtest.ui.outline.ValidationTriggeredOutlinePage;
import org.xtest.ui.outline.XtestOutlineRefreshJob;
import org.xtest.ui.runner.BuildFinishedListener;
import org.xtest.ui.runner.UiXTestRunner;
import org.xtest.ui.templates.XtestTemplateProposalProvider;
import org.xtest.ui.validation.XtestDiagnostician;

import com.google.common.eventbus.EventBus;
import com.google.inject.name.Names;

/**
 * Set up Guice bindings for running xtest plugin in eclipse
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
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
     * Binds {@link CancelableDiagnostician} implementation to custom {@link XtestDiagnostician}
     * 
     * @return {@link XtestDiagnostician} class
     */
    @SingletonBinding
    public Class<? extends CancelableDiagnostician> bindCancelableDiagnostician() {
        return XtestDiagnostician.class;
    }

    /**
     * Binds {@link EventBus} to a singleton instance for publishing Xtest events to listeners
     * 
     * @return The singleton Xtest event bus
     */
    public EventBus bindEventBusToInstance() {
        return new EventBus("Xtest Event Bus");
    }

    @Override
    public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
        return XtestTemplateProposalProvider.class;
    }

    @Override
    public Class<? extends ITypesProposalProvider> bindITypesProposalProvider() {
        return XtestImportingTypesProposalProvider.class;
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

    public Class<? extends XtextDocumentProvider> bindXtextDocumentProvider() {
        return XtestDocumentProvider.class;
    }

    /**
     * Configure {@link BuildFinishedListener} to be initialized at startup so it can start
     * listening immediately on build finished events.
     * 
     * @param binder
     *            The Guice Binder
     */
    public void configureBuildFinishedListener(com.google.inject.Binder binder) {
        binder.bind(BuildFinishedListener.class).asEagerSingleton();
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
