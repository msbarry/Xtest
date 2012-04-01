package org.xtest.ui.wizards;

import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.ui.dialogs.StatusInfo;
import org.eclipse.jdt.ui.wizards.NewTypeWizardPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;

/**
 * Custom wizard page for creating a new Xtest file. Similar to NewXtend2ClassWizardPage, but
 * removes the parts that are unneccessary for Xtest files.
 * 
 * @author Michael Barry
 */
public class NewXtestFileWizardPage extends NewTypeWizardPage {

    /**
     * Default contents of a brand-new Xtest file.
     */
    protected static final String DEFAULT_XTEST_FILE = "xtest test {\n    assert true\n}";

    private IResource resource;

    /**
     * Constructs a new Xtest file wizard page.
     */
    public NewXtestFileWizardPage() {
        super(0, "New Xtest File");
        this.setDescription("Create a new Xtest File");
    }

    @Override
    public void createControl(Composite parent) {
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

    /**
     * Runs a new "Create Xtest file" Job
     * 
     * @return The number of bytes created in the new file.
     */
    public int createType() {
        final AtomicInteger size = new AtomicInteger(0);
        IRunnableWithProgress op = new CreateXtestFile(size, this);
        try {
            getContainer().run(true, false, op);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            Throwable realException = e.getTargetException();
            MessageDialog.openError(getShell(), "Error creating Xtest File",
                    realException.getMessage());
        }
        return size.get();
    }

    @Override
    public void createType(IProgressMonitor monitor) throws CoreException, InterruptedException {
        throw new UnsupportedOperationException();
    }

    /**
     * Returns the newly created resource
     * 
     * @return The newly created resource
     */
    public IResource getResource() {
        return resource;
    }

    /**
     * Returns the selected resource from which this wizard was opened
     * 
     * @param selection
     *            The selection input
     * @return The selected resource from which this wizard was opened
     */
    public IJavaElement getSelectedResource(IStructuredSelection selection) {
        IJavaElement elem = null;
        if (selection != null && !selection.isEmpty()) {
            Object o = selection.getFirstElement();
            if (o == null) {
            } else if (o instanceof IAdaptable) {
                IAdaptable adaptable = (IAdaptable) o;
                elem = (IJavaElement) adaptable.getAdapter(IJavaElement.class);
                if (elem == null) {
                    elem = getPackage(adaptable);
                }
            }
        }
        if (elem == null) {
            IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow()
                    .getActivePage();
            IWorkbenchPart part = activePage.getActivePart();
            if (part instanceof ContentOutline) {
                part = activePage.getActiveEditor();
            }
            if (part instanceof XtextEditor) {
                IXtextDocument doc = ((XtextEditor) part).getDocument();
                IFile file = doc.getAdapter(IFile.class);
                elem = getPackage(file);
            }
        }
        if (elem == null || elem.getElementType() == IJavaElement.JAVA_MODEL) {
            try {
                IJavaProject[] projects = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot())
                        .getJavaProjects();
                if (projects.length == 1) {
                    elem = projects[0];
                }
            } catch (JavaModelException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
        return elem;
    }

    @Override
    public String getTypeName() {
        String typeName2 = super.getTypeName();
        return typeName2.endsWith(".xtest") ? typeName2 : typeName2 + ".xtest";
    }

    @Override
    public void setVisible(boolean visible) {
        super.setVisible(visible);
        if (visible) {
            setFocus();
        }
    }

    /*
     * @see NewContainerWizardPage#handleFieldChanged
     */
    @Override
    protected void handleFieldChanged(String fieldName) {
        super.handleFieldChanged(fieldName);
        doStatusUpdate();
    }

    /**
     * Initialize this wizard page from the selection provided.
     * 
     * @param selection
     *            The initially selected item
     */
    protected void init(IStructuredSelection selection) {
        IJavaElement elem = getSelectedResource(selection);
        initContainerPage(elem);
        initTypePage(elem);
    }

    @Override
    protected IStatus typeNameChanged() {
        IStatus status = Status.OK_STATUS;
        IPackageFragment packageFragment = getPackageFragment();
        if (packageFragment != null) {
            IResource resource = packageFragment.getResource();
            if (resource instanceof IFolder) {
                IFolder folder = (IFolder) resource;
                if (folder.getFile(getTypeName()).exists()) {
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
            xtestFile = iFolder.getFile(typeName);
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

    private void doStatusUpdate() {
        IStatus[] status = new IStatus[] { fContainerStatus, fPackageStatus, fTypeNameStatus,
                fSuperClassStatus, fSuperInterfacesStatus };
        updateStatus(status);
    }

    private IJavaElement getPackage(IAdaptable adaptable) {
        IJavaElement elem = null;
        IResource resource = (IResource) adaptable.getAdapter(IResource.class);
        if (resource != null && resource.getType() != IResource.ROOT) {
            while (elem == null && resource.getType() != IResource.PROJECT) {
                resource = resource.getParent();
                elem = (IJavaElement) resource.getAdapter(IJavaElement.class);
            }
        }
        if (elem == null) {
            elem = JavaCore.create(resource);
        }
        return elem;
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
