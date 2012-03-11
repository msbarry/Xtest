package org.xtest.ui.outline;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.util.TextRegion;
import org.xtest.results.AbstractXTestResult;
import org.xtest.results.XTestCaseResult;
import org.xtest.results.XTestState;
import org.xtest.results.XTestSuiteResult;
import org.xtest.ui.internal.XtestPluginImages;
import org.xtest.xTest.XTestCase;
import org.xtest.xTest.impl.BodyImplCustom;

import com.google.common.collect.HashMultimap;
import com.google.inject.Inject;

/**
 * Customize the tree outline to display the the results of running the tests graphically
 * 
 * @author Michael Barry
 */
public class XTestOutlineTreeProvider extends DefaultOutlineTreeProvider {
    private static final String UNKNOWN_NODE_NAME = "...";
    @Inject
    private XtestPluginImages images;

    @Override
    public void createChildren(IOutlineNode parentNode, EObject body) {
        if (body instanceof BodyImplCustom) {
            String fileName = ((BodyImplCustom) body).getFileName();
            XTestSuiteResult result = ((BodyImplCustom) body).getResult();
            HashMultimap<Severity, EObject> issues = ((BodyImplCustom) body).getIssues();
            Object text = parentNode.getText();
            if (result != null && !fileName.equals(text)) {
                createNode(parentNode, result, fileName, issues);
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

    private boolean containsChild(EObject eObject, Set<EObject> errors) {
        boolean result = false;
        for (EObject error : errors) {
            for (EObject cursor = error; cursor != null; cursor = cursor.eContainer()) {
                if (eObject.equals(cursor)) {
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        return result;
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
     * @param issues
     * @return The new tree node
     */
    private EObjectNode createEObjectNode(IOutlineNode parentNode, AbstractXTestResult result,
            String suggestedName, HashMultimap<Severity, EObject> issues) {
        EObject eObject = result.getEObject();
        EObjectNode createEObjectNode = createEObjectNode(parentNode, eObject);
        String name = result.getName();
        if (name == null) {
            name = suggestedName;
        }
        if (name != null) {
            createEObjectNode.setText(name);
        }
        Image image;
        Severity severity = getSeverity(result, issues);
        if (result instanceof XTestCaseResult) {
            image = severity == null ? images.getTestImage() : images.getTestImage(severity);
        } else {
            image = severity == null ? images.getSuiteImage() : images.getSuiteImage(severity);
        }
        if (severity == Severity.ERROR) {
            ((XTestEObjectNode) createEObjectNode).setFailed();
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
     * @param issues
     */
    private void createNode(IOutlineNode parentNode, XTestSuiteResult suite, String suggestedName,
            HashMultimap<Severity, EObject> issues) {
        EObjectNode thisNode = createEObjectNode(parentNode, suite, suggestedName, issues);
        for (XTestCaseResult testCase : suite.getCases()) {
            createEObjectNode(thisNode, testCase, UNKNOWN_NODE_NAME, issues);
        }
        for (XTestSuiteResult subSuite : suite.getSubSuites()) {
            createNode(thisNode, subSuite, null, issues);
        }
    }

    /**
     * Returns the severity for the EObject derived from its test result status and any issues on
     * contained {@link EObject}s
     * 
     * @param result
     *            The test result
     * @param issues
     *            The list of issues
     * @return The {@link Severity} of the node, or null if no issues and no tests have run
     */
    private Severity getSeverity(AbstractXTestResult result, HashMultimap<Severity, EObject> issues) {
        Severity severity = null;
        XTestState state = result.getState();
        if (state == XTestState.FAIL) {
            severity = Severity.ERROR;
        } else {
            EObject eObject = result.getEObject();
            Set<EObject> errors = issues.get(Severity.ERROR);
            Set<EObject> warnings = issues.get(Severity.WARNING);

            if (containsChild(eObject, errors)) {
                severity = Severity.ERROR;
            } else if (containsChild(eObject, warnings)) {
                severity = Severity.WARNING;
            } else if (state == XTestState.PASS) {
                severity = Severity.INFO;
            }
        }

        return severity;
    }
}
