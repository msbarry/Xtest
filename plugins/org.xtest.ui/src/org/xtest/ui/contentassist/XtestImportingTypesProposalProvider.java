package org.xtest.ui.contentassist;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentRewriteSession;
import org.eclipse.jface.text.DocumentRewriteSessionType;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentExtension4;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.ITextViewerExtension;
import org.eclipse.jface.text.TextUtilities;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.xtend.core.xtend.XtendImport;
import org.eclipse.xtend.ide.contentassist.ImportingTypesProposalProvider;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal.IReplacementTextApplier;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.conversion.XbaseQualifiedNameValueConverter;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtest.xTest.Body;

import com.google.inject.Inject;

/**
 * Type proposal provider that automatically adds proposed types to list of imports
 * 
 * Parts borrowed from Xtend 2.3's {@link ImportingTypesProposalProvider}. Hopefully in the future
 * Xtend's implementation could be changed to make it more easily extensible
 */
@SuppressWarnings("restriction")
public class XtestImportingTypesProposalProvider extends ImportingTypesProposalProvider {

    @Inject
    private XbaseQualifiedNameValueConverter qualifiedNameValueConverter;

    @Override
    protected IReplacementTextApplier createTextApplier(ContentAssistContext context,
            IScope typeScope, IQualifiedNameConverter qualifiedNameConverter,
            IValueConverter<String> valueConverter) {
        if (context.getCurrentModel() instanceof XtendImport) {
            return super.createTextApplier(context, typeScope, qualifiedNameConverter,
                    valueConverter);
        }
        return new FQNImporter(context.getResource(), context.getViewer(), typeScope,
                qualifiedNameConverter, valueConverter, qualifiedNameValueConverter);
    }

    /**
     * Mostly borrowed from Xtend 2.3's
     * {@link org.eclipse.xtend.ide.contentassist.ImportingTypesProposalProvider.FQNImporter}
     */
    public static class FQNImporter extends FQNShortener {

        private final XbaseQualifiedNameValueConverter importConverter;
        private final ITextViewer viewer;

        public FQNImporter(Resource context, ITextViewer viewer, IScope scope,
                IQualifiedNameConverter qualifiedNameConverter,
                IValueConverter<String> valueConverter,
                XbaseQualifiedNameValueConverter importConverter) {
            super(context, scope, qualifiedNameConverter, valueConverter);
            this.viewer = viewer;
            this.importConverter = importConverter;
        }

        @Override
        public void apply(IDocument document, ConfigurableCompletionProposal proposal)
                throws BadLocationException {
            String proposalReplacementString = proposal.getReplacementString();
            String typeName = proposalReplacementString;
            if (valueConverter != null) {
                typeName = valueConverter.toValue(proposalReplacementString, null);
            }
            String replacementString = getActualReplacementString(proposal);
            // there is an import statement - apply computed replacementString
            if (!proposalReplacementString.equals(replacementString)) {
                String shortTypeName = replacementString;
                if (valueConverter != null) {
                    shortTypeName = valueConverter.toValue(replacementString, null);
                }
                QualifiedName shortQualifiedName = qualifiedNameConverter
                        .toQualifiedName(shortTypeName);
                if (shortQualifiedName.getSegmentCount() == 1) {
                    proposal.setCursorPosition(replacementString.length());
                    document.replace(proposal.getReplacementOffset(),
                            proposal.getReplacementLength(), replacementString);
                    return;
                }
            }
            // we could create an import statement if there is no conflict
            Body file = (Body) context.getContents().get(0);
            EList<XExpression> clazz = file.getExpressions();

            QualifiedName qualifiedName = qualifiedNameConverter.toQualifiedName(typeName);
            if (qualifiedName.getSegmentCount() == 1) {
                // type resides in default package - no need to hassle with imports
                proposal.setCursorPosition(proposalReplacementString.length());
                document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(),
                        proposalReplacementString);
                return;
            }

            IEObjectDescription description = scope.getSingleElement(qualifiedName
                    .skipFirst(qualifiedName.getSegmentCount() - 1));
            if (description != null) {
                // there exists a conflict - insert fully qualified name
                proposal.setCursorPosition(proposalReplacementString.length());
                document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(),
                        proposalReplacementString);
                return;
            }

            // Import does not introduce ambiguities - add import and insert short name
            String shortName = qualifiedName.getLastSegment();
            int topPixel = -1;
            // store the pixel coordinates to prevent the ui from flickering
            StyledText widget = viewer.getTextWidget();
            if (widget != null) {
                topPixel = widget.getTopPixel();
            }
            ITextViewerExtension viewerExtension = null;
            if (viewer instanceof ITextViewerExtension) {
                viewerExtension = (ITextViewerExtension) viewer;
                viewerExtension.setRedraw(false);
            }
            DocumentRewriteSession rewriteSession = null;
            String lineSeparator = TextUtilities.getDefaultLineDelimiter(document);
            try {
                if (document instanceof IDocumentExtension4) {
                    rewriteSession = ((IDocumentExtension4) document)
                            .startRewriteSession(DocumentRewriteSessionType.UNRESTRICTED_SMALL);
                }
                // compute import statement's offset
                int offset = 0;
                boolean startWithLineBreak = true;
                boolean endWithLineBreak = false;
                if (file.getImports().isEmpty() && file.getFileparam().isEmpty()) {
                    startWithLineBreak = false;
                    if (IterableExtensions.isNullOrEmpty(clazz)) {
                        offset = document.getLength();
                    } else {
                        ICompositeNode node = NodeModelUtils.getNode(clazz.get(0));
                        if (node == null) {
                            throw new IllegalStateException("node may not be null");
                        }
                        offset = node.getTotalOffset();
                        endWithLineBreak = true;
                    }
                } else {
                    ICompositeNode node = NodeModelUtils.getNode(file.getImports().get(
                            file.getImports().size() - 1));
                    if (node == null) {
                        throw new IllegalStateException("node may not be null");
                    }
                    offset = node.getOffset() + node.getLength();
                }
                offset = Math.min(proposal.getReplacementOffset(), offset);

                // apply short proposal
                String escapedShortname = shortName;
                if (valueConverter != null) {
                    escapedShortname = valueConverter.toString(shortName);
                }
                proposal.setCursorPosition(escapedShortname.length());
                document.replace(proposal.getReplacementOffset(), proposal.getReplacementLength(),
                        escapedShortname);

                // add import statement
                String string = importConverter.toString(typeName);
                String importStatement = (startWithLineBreak ? lineSeparator + "import "
                        : "import ") + string;
                if (endWithLineBreak) {
                    importStatement += lineSeparator;
                    importStatement += lineSeparator;
                }
                document.replace(offset, 0, importStatement.toString());
                proposal.setCursorPosition(proposal.getCursorPosition() + importStatement.length());

                // set the pixel coordinates
                if (widget != null) {
                    int additionalTopPixel = 0;
                    if (startWithLineBreak) {
                        additionalTopPixel += widget.getLineHeight();
                    }
                    if (endWithLineBreak) {
                        additionalTopPixel += 2 * widget.getLineHeight();
                    }
                    widget.setTopPixel(topPixel + additionalTopPixel);
                }
            } finally {
                if (rewriteSession != null) {
                    ((IDocumentExtension4) document).stopRewriteSession(rewriteSession);
                }
                if (viewerExtension != null) {
                    viewerExtension.setRedraw(true);
                }
            }
        }

    }

}
