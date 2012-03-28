package org.xtest.ui.templates;

import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateAcceptor;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;
import org.xtest.ui.internal.XtestPluginImages;

import com.google.inject.Inject;

/**
 * Hardcoded template proposals for xtest
 * 
 * @author Michael Barry
 */
public class XtestTemplateProposalProvider extends DefaultTemplateProposalProvider {
    @Inject
    private XtestPluginImages images;

    /**
     * Create a new hardcoded
     * 
     * @param templateStore
     * @param registry
     * @param helper
     */
    @Inject
    public XtestTemplateProposalProvider(TemplateStore templateStore, ContextTypeRegistry registry,
            ContextTypeIdHelper helper) {
        super(templateStore, registry, helper);
    }

    @Override
    protected void createTemplates(TemplateContext templateContext, ContentAssistContext context,
            ITemplateAcceptor acceptor) {
        super.createTemplates(templateContext, context, acceptor);
        addProposal("xtest", "New Test", "Add a new test", images.getTestImage(Severity.INFO),
                templateContext, context, acceptor);
        addProposal("xsuite", "New Test Suite", "Add a new test suite",
                images.getSuiteImage(Severity.INFO), templateContext, context, acceptor);

    }

    private void addProposal(String name, String title, String description, Image image,
            TemplateContext templateContext, ContentAssistContext context,
            ITemplateAcceptor acceptor) {
        if (name.startsWith(context.getPrefix()) && !context.getPrefix().trim().isEmpty()) {
            Template template = new Template(title, description, "", name
                    + " ${name}  {\n\t${cursor}\n}", true);

            if (!acceptor.canAcceptMoreTemplates()) {
                return;
            }
            TemplateProposal doCreateProposal = doCreateProposal(template, templateContext,
                    context, image, getRelevance(template));
            acceptor.accept(doCreateProposal);

        }
    }
}
