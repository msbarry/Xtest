package org.xtest.ui.outline;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.OutlinePage;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineRefreshJob;
import org.eclipse.xtext.ui.editor.outline.impl.OutlineTreeState;

/**
 * Custom outline refresh job to grey-out the outline view while tests are
 * running and automatically expand failed tests.
 */
public class XtestOutlineRefreshJob extends OutlineRefreshJob {
    private OutlinePage outlinePage;

    @Override
    public void setOutlinePage(OutlinePage outlinePage) {
        this.outlinePage = outlinePage;
        super.setOutlinePage(outlinePage);
    }

    @Override
    protected IOutlineNode refreshOutlineModel(IProgressMonitor monitor,
        OutlineTreeState formerState, OutlineTreeState newState) {
        setControlEnabled(false);
        IOutlineNode refreshOutlineModel =
            super.refreshOutlineModel(monitor, formerState, newState);
        setControlEnabled(true);
        return refreshOutlineModel;
    }

    @Override
    protected void restoreChildrenSelectionAndExpansion(IOutlineNode parent,
        Resource resource, OutlineTreeState formerState,
        OutlineTreeState newState) {
        for (IOutlineNode child : parent.getChildren()) {
            if (child instanceof XTestEObjectNode
                && ((XTestEObjectNode) child).getFailed()) {
                newState.getExpandedNodes().add(child);
            }
        }
        super.restoreChildrenSelectionAndExpansion(parent, resource,
            formerState, newState);
    }

    /**
     * Executes a task in the UI thread to enable or disable the outline view
     * 
     * @param b
     *            True to enable, false to disable
     */
    private void setControlEnabled(final boolean b) {
        Display.getDefault().syncExec(new Runnable() {
            @Override
            public void run() {
                outlinePage.getTreeViewer().getControl().setEnabled(b);
            }
        });
    }
}
