package org.xtest.ui.wizards;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.ui.dialogs.StatusInfo;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.xtext.xtend2.ui.wizards.Messages;
import org.eclipse.xtext.xtend2.ui.wizards.NewXtend2ClassWizardPage;

/**
 * Custom wizard page for creating a new Xtest file. Extends {@link NewXtend2ClassWizardPage}, but
 * removes the parts that are unneccessary for Xtest files.
 * 
 * @author Michael Barry
 */
public class NewXtestFileWizardPage extends NewXtend2ClassWizardPage {

    /**
     * Default contents of a brand-new Xtest file.
     */
    protected static final String DEFAULT_XTEST_FILE = "xtest test {\n    assert true\n}";

    private IResource resource;

    /**
     * Constructs a new Xtest file wizard page.
     */
    public NewXtestFileWizardPage() {
        super();
        this.setTitle("New Xtest File");
        this.setDescription("Create a new Xtest File");
    }

    @Override
    public void createControl(Composite parent) {
        // Same as Xtend, except only need a file name
        initializeDialogUnits(parent);
        Composite composite = new Composite(parent, SWT.NONE);
        composite.setFont(parent.getFont());
        int cols = 4;
        GridLayout layout = new GridLayout();
        layout.numColumns = cols;
        composite.setLayout(layout);
        createContainerControls(composite, cols);
        createPackageControls(composite, cols);
        createSeparator(composite, cols);
        createTypeNameControls(composite, cols);
        setControl(composite);
    }

    @Override
    public int createType() {
        final AtomicInteger size = new AtomicInteger(0);
        IRunnableWithProgress op = new CreateXtestFile(size, this);
        try {
            getContainer().run(true, false, op);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            Throwable realException = e.getTargetException();
            MessageDialog.openError(getShell(), Messages.ERROR_CREATING_CLASS,
                    realException.getMessage());
        }
        return size.get();
    }

    @Override
    public IResource getResource() {
        return resource;
    }

    @Override
    protected IStatus typeNameChanged() {
        IStatus status = Status.OK_STATUS;
        IPackageFragment packageFragment = getPackageFragment();
        if (packageFragment != null) {
            IResource resource = packageFragment.getResource();
            if (resource instanceof IFolder) {
                IFolder folder = (IFolder) resource;
                if (folder.getFile(getTypeName() + ".xtest").exists()) {
                    String packageName = "";
                    if (!packageFragment.isDefaultPackage()) {
                        packageName = packageFragment.getElementName() + ".";
                    }
                    status = new StatusInfo(IStatus.ERROR, packageName + getTypeName()
                            + " already exists.");
                }
            }
        }
        return status;
    }

    private void createXtestFile(IProgressMonitor monitor, AtomicInteger size)
            throws InvocationTargetException {
        // similar to NewXtend2ClassWizardPage.createXtendClass, although changed to work
        // specifically for xtest files
        try {
            if (monitor == null) {
                monitor = new NullProgressMonitor();
            }
            IPackageFragment packageFragment = getPackageFragment();
            if (!packageFragment.exists()) {
                try {
                    IPackageFragmentRoot packageFragmentRoot = getPackageFragmentRoot();
                    String elementName = packageFragment.getElementName();
                    packageFragmentRoot.createPackageFragment(elementName, true, monitor);
                } catch (JavaModelException e) {
                    displayError("Error creating package", e.getMessage());
                }
            }
            IResource res = packageFragment.getResource();
            IFile xtestFile = null;
            IFolder iFolder = (IFolder) res;
            String typeName = getTypeName();
            String string = typeName + ".xtest";
            xtestFile = iFolder.getFile(string);
            try {
                String contents = DEFAULT_XTEST_FILE;
                byte[] bytes = contents.getBytes();
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                xtestFile.create(byteArrayInputStream, true, monitor);
                int length = contents.length();
                size.set(length);
                resource = xtestFile;
            } catch (CoreException e) {
                displayError("Error creating Xtest file", e.getMessage());
            }
        } catch (Exception e) {
            throw new InvocationTargetException(e);
        } finally {
            monitor.done();
        }
    }

    private void displayError(final String title, final String message) {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                MessageDialog.openError(getShell(), title, message);
            }
        });
    }

    private static class CreateXtestFile extends WorkspaceModifyOperation {
        private final NewXtestFileWizardPage page;
        private final AtomicInteger size;

        private CreateXtestFile(AtomicInteger size, NewXtestFileWizardPage page) {
            this.size = size;
            this.page = page;
        }

        @Override
        protected void execute(IProgressMonitor monitor) throws CoreException,
                InvocationTargetException, InterruptedException {
            page.createXtestFile(monitor, size);
        }
    }
}
