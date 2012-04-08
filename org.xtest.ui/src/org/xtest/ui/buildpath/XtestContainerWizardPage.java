package org.xtest.ui.buildpath;

import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.wizards.IClasspathContainerPage;
import org.eclipse.jdt.ui.wizards.NewElementWizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

/**
 * "Add Libraries..." wizard page for adding Xtest libraries to the build path.
 * 
 * @author Michael Barry
 */
public class XtestContainerWizardPage extends NewElementWizardPage implements
        IClasspathContainerPage {

    /**
     * Construct a new wizard page
     */
    public XtestContainerWizardPage() {
        super("XtestClassPathContainer");
        setTitle("Xtest Libraries");
        setDescription("Add required Xtest libraries to the build path");
    }

    @Override
    public void createControl(Composite parent) {
        Label label = new Label(parent, SWT.NONE);
        StringBuilder builder = new StringBuilder(
                "The following libraries will be added to the build path:");
        builder.append("\n\n");
        for (String lib : XtestClasspathContainer.LIBS) {
            builder.append(lib);
            builder.append("\n");
        }
        label.setText(builder.toString());
        setControl(parent);
    }

    @Override
    public boolean finish() {
        return true;
    }

    @Override
    public IClasspathEntry getSelection() {
        return JavaCore.newContainerEntry(new Path("org.xtest.XTEST_CONTAINER"));
    }

    @Override
    public void setSelection(IClasspathEntry containerEntry) {
    }

}
