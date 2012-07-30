package org.xtest.ui.quickfix;

import org.eclipse.xtend.core.validation.IssueCodes;
import org.eclipse.xtend.ide.edit.OrganizeImportsHandler;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Inject;

/**
 * Quickfix provider for Xtest issues
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XTestQuickfixProvider extends DefaultQuickfixProvider {

    @Inject
    private OrganizeImportsHandler organizeImportsHandler;

    /**
     * Invoke organize quickfix
     * 
     * @param issue
     *            The issue
     * @param acceptor
     *            The resolution acceptor
     */
    @Fix(IssueCodes.IMPORT_DUPLICATE)
    public void fixDuplicateImport(final Issue issue, IssueResolutionAcceptor acceptor) {
        organizeImports(issue, acceptor);
    }

    /**
     * Invoke organize quickfix
     * 
     * @param issue
     *            The issue
     * @param acceptor
     *            The resolution acceptor
     */
    @Fix(IssueCodes.IMPORT_WILDCARD_DEPRECATED)
    public void fixDuplicateWildcardUse(final Issue issue, IssueResolutionAcceptor acceptor) {
        organizeImports(issue, acceptor);
    }

    /**
     * Invoke organize quickfix
     * 
     * @param issue
     *            The issue
     * @param acceptor
     *            The resolution acceptor
     */
    @Fix(IssueCodes.IMPORT_UNUSED)
    public void fixUnusedImport(final Issue issue, IssueResolutionAcceptor acceptor) {
        organizeImports(issue, acceptor);
    }

    /**
     * Invoke organize quickfix
     * 
     * @param issue
     *            The issue
     * @param acceptor
     *            The resolution acceptor
     */
    protected void organizeImports(final Issue issue, IssueResolutionAcceptor acceptor) {
        acceptor.accept(
                issue,
                "Organize Imports.",
                "Organizes the whole import section. Removes wildcard imports as well as duplicates and unused ones.",
                "correction_change.gif", new IModification() {
                    @Override
                    public void apply(IModificationContext context) throws Exception {
                        organizeImportsHandler.doOrganizeImports(context.getXtextDocument());
                    }
                });
    }

}
