package org.xtest.ui.outline;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.util.TextRegion;
import org.xtest.results.AbstractXTestResult;
import org.xtest.results.XTestCaseResult;
import org.xtest.results.XTestSuiteResult;
import org.xtest.xTest.XTestCase;
import org.xtest.xTest.impl.BodyImplCustom;

import com.google.inject.Inject;

/**
 * Customize the tree outline to display the the results of running the tests graphically
 * 
 * @author Michael Barry
 */
public class XTestOutlineTreeProvider extends DefaultOutlineTreeProvider {
    private static Image SUITE_FAILED;
    private static Image SUITE_NOT_RUN;
    private static Image SUITE_PASSED;
    private static Image TEST_FAILED;
    private static Image TEST_NOT_RUN;
    private static Image TEST_PASSED;
    private static final String UNKNOWN_NODE_NAME = "...";
    @Inject
    private PluginImageHelper imageHelper;

    @Override
    public void createChildren(IOutlineNode parentNode, EObject body) {
        if (body instanceof BodyImplCustom) {
            String fileName = ((BodyImplCustom) body).getFileName();
            XTestSuiteResult result = ((BodyImplCustom) body).getResult();
            Object text = parentNode.getText();
            if (result != null && !fileName.equals(text)) {
                createNode(parentNode, result, fileName);
            }
        }
    }

    @Override
    protected boolean _isLeaf(EObject feature) {
        return feature instanceof XTestCase;
    }

    @Override
    protected EObjectNode createEObjectNode(IOutlineNode parentNode, EObject modelElement,
            Image image, Object text, boolean isLeaf) {
        EObjectNode eObjectNode = new XTestEObjectNode(modelElement, parentNode, image, text,
                isLeaf);
        ICompositeNode parserNode = NodeModelUtils.getNode(modelElement);
        if (parserNode != null) {
            eObjectNode
                    .setTextRegion(new TextRegion(parserNode.getOffset(), parserNode.getLength()));
        }
        if (isLocalElement(parentNode, modelElement)) {
            eObjectNode.setShortTextRegion(locationInFileProvider
                    .getSignificantTextRegion(modelElement));
        }
        return eObjectNode;
    }

    /**
     * Creates a new node for the suite or case result, setting the name and icon appropriately
     * given the pass/fail/not run state of the test
     * 
     * @param parentNode
     *            The parent node
     * @param result
     *            The test or suite result
     * @param suggestedName
     *            The suggested name to use
     * @return The new tree node
     */
    private EObjectNode createEObjectNode(IOutlineNode parentNode, AbstractXTestResult result,
            String suggestedName) {
        EObjectNode createEObjectNode = createEObjectNode(parentNode, result.getEObject());
        String name = result.getName();
        if (name == null) {
            name = suggestedName;
        }
        if (name != null) {
            createEObjectNode.setText(name);
        }
        Image image;
        // Get the appropriate icon for the state and type of test
        initImages();
        if (result instanceof XTestCaseResult) {
            switch (result.getState()) {
            case FAIL:
                ((XTestEObjectNode) createEObjectNode).setFailed();
                image = TEST_FAILED;
                break;
            case PASS:
                image = TEST_PASSED;
                break;
            default:
                image = TEST_NOT_RUN;
                break;
            }
        } else {
            switch (result.getState()) {
            case FAIL:
                ((XTestEObjectNode) createEObjectNode).setFailed();
                image = SUITE_FAILED;
                break;
            case PASS:
                image = SUITE_PASSED;
                break;
            default:
                image = SUITE_NOT_RUN;
                break;
            }
        }
        createEObjectNode.setImage(image);
        return createEObjectNode;
    }

    /**
     * Creates a node for the test suite and sub suites/cases
     * 
     * @param parentNode
     *            The parent tree node
     * @param suite
     *            The sub suite
     * @param suggestedName
     *            Name to use for the node
     */
    private void createNode(IOutlineNode parentNode, XTestSuiteResult suite, String suggestedName) {
        EObjectNode thisNode = createEObjectNode(parentNode, suite, suggestedName);
        for (XTestCaseResult testCase : suite.getCases()) {
            createEObjectNode(thisNode, testCase, UNKNOWN_NODE_NAME);
        }
        for (XTestSuiteResult subSuite : suite.getSubSuites()) {
            createNode(thisNode, subSuite, null);
        }
    }

    private void initImages() {
        if (SUITE_FAILED == null) {
            TEST_FAILED = imageHelper.getImage("testerr.gif");
            TEST_PASSED = imageHelper.getImage("testok.gif");
            TEST_NOT_RUN = imageHelper.getImage("test.gif");
            SUITE_FAILED = imageHelper.getImage("tsuiteerror.gif");
            SUITE_PASSED = imageHelper.getImage("tsuiteok.gif");
            SUITE_NOT_RUN = imageHelper.getImage("tsuite.gif");
        }
    }
}
