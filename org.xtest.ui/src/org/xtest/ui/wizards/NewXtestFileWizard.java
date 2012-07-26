package org.xtest.ui.wizards;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.wizards.NewElementWizard;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.texteditor.ITextEditor;

/**
 * Wizard for creating new Xtest files
 * 
 * @author Michael Barry
 */
public class NewXtestFileWizard extends NewElementWizard {

    private final NewXtestFileWizardPage fPage;

    /**
     * Construct a new Xtest file wizard page.
     */
    public NewXtestFileWizard() {
        this.fPage = new NewXtestFileWizardPage();
        setDialogSettings(JavaPlugin.getDefault().getDialogSettings());
        setWindowTitle("New Xtest File");

    }

    @Override
    public void addPages() {
        super.addPages();
        fPage.init(getSelection());
        super.addPage(fPage);
    }

    @Override
    public IJavaElement getCreatedElement() {
        return null;
    }

    @Override
    public boolean performFinish() {
        final int size = this.fPage.createType();
        final IResource resource = fPage.getResource();
        if (resource != null) {
            selectAndReveal(resource);
            final Display display = getShell().getDisplay();
            display.asyncExec(new Runnable() {
                @Override
                public void run() {
                    IEditorPart editor;
                    try {
                        editor = IDE.openEditor(JavaPlugin.getActivePage(), (IFile) resource);
                        if (editor instanceof ITextEditor) {
                            final ITextEditor textEditor = (ITextEditor) editor;
                            ISelectionProvider selectionProvider = textEditor
                                    .getSelectionProvider();
                            ISelection selection = new TextSelection(size - 2, 0);
                            selectionProvider.setSelection(selection);
                        }
                    } catch (PartInitException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setDefaultPageImageDescriptor(ImageDescriptor imageDescriptor) {
        // Override this to avoid setting a page icon
    }

    @Override
    protected void finishPage(IProgressMonitor monitor) throws InterruptedException, CoreException {
    }

}
