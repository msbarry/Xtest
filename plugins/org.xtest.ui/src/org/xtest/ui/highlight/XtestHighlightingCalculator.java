package org.xtest.ui.highlight;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration;
import org.xtest.xTest.FileParam;
import org.xtest.xTest.XTestPackage;

/**
 * Custom highlighting calculator for Xtest files
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestHighlightingCalculator extends XbaseHighlightingCalculator {

    @Override
    protected void searchAndHighlightElements(XtextResource resource,
            IHighlightedPositionAcceptor acceptor) {
        super.searchAndHighlightElements(resource, acceptor);
        TreeIterator<EObject> iterator = resource.getAllContents();
        while (iterator.hasNext()) {
            EObject object = iterator.next();
            if (object instanceof FileParam) {
                highlightFileParam((FileParam) object, acceptor);
            }
        }
    }

    private void highlightFileParam(FileParam object, IHighlightedPositionAcceptor acceptor) {
        highlightObjectAtFeature(acceptor, object, XTestPackage.Literals.FILE_PARAM__FEATURE,
                XbaseHighlightingConfiguration.FIELD);
    }
}
