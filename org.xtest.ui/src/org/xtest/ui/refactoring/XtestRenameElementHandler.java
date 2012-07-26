package org.xtest.ui.refactoring;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.refactoring.ui.IRenameElementContext;
import org.eclipse.xtext.xbase.ui.jvmmodel.refactoring.JvmModelRenameElementHandler;
import org.xtest.xTest.XMethodDef;

/**
 * Custom rename element handler that allows renaming a reference to an Xtest method to also
 * refactor the declaration of the method.
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestRenameElementHandler extends JvmModelRenameElementHandler {
    @Override
    public IRenameElementContext createRenameElementContext(EObject targetElement,
            XtextEditor editor, ITextSelection selection, XtextResource resource) {
        if (!isJvmMember(targetElement) || !isTypeResource(targetElement)) {
            EObject declarationTarget = getDeclarationTarget(targetElement);
            if (declarationTarget instanceof XMethodDef) {
                targetElement = declarationTarget;
            }
        }
        return super.createRenameElementContext(targetElement, editor, selection, resource);
    }
}
