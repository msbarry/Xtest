package org.xtest.ui.outline;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;

/**
 * Custom Outline view node that stores failure state.
 * 
 * @author Michael Barry
 */
public class XTestEObjectNode extends EObjectNode {
    private boolean failed = false;

    /**
     * Constructs a new custom {@link EObjectNode} with an extra "failed" boolean state
     * 
     * @param eObject
     *            The EOBject this node corresponds to
     * @param parent
     *            The parent node
     * @param image
     *            The image to use
     * @param text
     *            The text to use
     * @param isLeaf
     *            True if leaf, false if has children
     */
    public XTestEObjectNode(EObject eObject, IOutlineNode parent, Image image, Object text,
            boolean isLeaf) {
        super(eObject, parent, image, text, isLeaf);
    }

    /**
     * Returns true if this node failed, false if not
     * 
     * @return True if this node failed, false if not
     */
    public boolean getFailed() {
        return failed;
    }

    /**
     * Set failure state of this node to true.
     */
    public void setFailed() {
        failed = true;
    }

}
