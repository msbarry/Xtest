package org.xtest.ui.outline;

import java.util.Set;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.EObjectNode;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.xtest.results.XTestResult;
import org.xtest.results.XTestState;
import org.xtest.ui.internal.XtestPluginImages;
import org.xtest.ui.mediator.XtestResultsCache;
import org.xtest.xTest.impl.BodyImplCustom;

import com.google.common.collect.HashMultimap;
import com.google.inject.Inject;

/**
 * Customize the tree outline to display the the results of running the tests graphically
 * 
 * @author Michael Barry
 */
public class XTestOutlineTreeProvider extends DefaultOutlineTreeProvider {
    @Inject
    private XtestPluginImages images;

    @Inject
    private XtestResultsCache mediator;

    @Inject
    private IResourceValidator validator;

    @Override
    public void createChildren(IOutlineNode parentNode, EObject body) {
        if (body instanceof BodyImplCustom) {
            String fileName = ((BodyImplCustom) body).getFileName();
            URI uri = body.eResource().getURI();
            XTestResult last = mediator.getLast(uri);
            if (last != null) {
                HashMultimap<Severity, EObject> issues = last.getIssues();
                Object text = parentNode.getText();
                if (!fileName.equals(text)) {
                    createNode(parentNode, last, fileName, issues);
                }
            } else {
                scheduleValidation(body);
            }
        }
    }

    @Override
    protected EObjectNode createEObjectNode(IOutlineNode parentNode, EObject modelElement,
            Image image, Object text, boolean isLeaf) {
        EObjectNode eObjectNode = new XTestEObjectNode(modelElement, parentNode, image, text,
                isLeaf);
        ITextRegion region = getRegion(parentNode, modelElement);
        if (region != null) {
            eObjectNode.setShortTextRegion(region);
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
     * Creates a new node for the test result, setting the name and icon appropriately given the
     * pass/fail/not run state of the test
     * 
     * @param parentNode
     *            The parent node
     * @param result
     *            The test result
     * @param suggestedName
     *            The suggested name to use
     * @param issues
     * @return The new tree node
     */
    private EObjectNode createEObjectNode(IOutlineNode parentNode, XTestResult result,
            String suggestedName, HashMultimap<Severity, EObject> issues) {
        EObject eObject = result.getEObject();
        String name = result.getName();
        if (name == null) {
            name = suggestedName;
        }
        Image image;
        Severity severity = getSeverity(result, issues);
        boolean isLeaf = result.getSubTests().isEmpty();
        if (isLeaf && parentNode.getParent() != null) {
            image = severity == null ? images.getTestImage() : images.getTestImage(severity);
        } else {
            image = severity == null ? images.getSuiteImage() : images.getSuiteImage(severity);
        }

        EObjectNode createEObjectNode = createEObjectNode(parentNode, eObject, image, name, isLeaf);

        if (severity == Severity.ERROR) {
            ((XTestEObjectNode) createEObjectNode).setFailed();
        }
        return createEObjectNode;
    }

    /**
     * Creates a node for the test and sub-tests
     * 
     * @param parentNode
     *            The parent tree node
     * @param test
     *            The sub test
     * @param suggestedName
     *            Name to use for the node
     * @param issues
     */
    private void createNode(IOutlineNode parentNode, XTestResult test, String suggestedName,
            HashMultimap<Severity, EObject> issues) {
        EObjectNode thisNode = createEObjectNode(parentNode, test, suggestedName, issues);
        for (XTestResult subTest : test.getSubTests()) {
            createNode(thisNode, subTest, null, issues);
        }
    }

    private ITextRegion getRegion(IOutlineNode parentNode, EObject modelElement) {
        ITextRegion region = null;
        ICompositeNode parserNode = NodeModelUtils.getNode(modelElement);
        if (parserNode != null) {
            region = new TextRegion(parserNode.getOffset(), parserNode.getLength());
        }
        if (isLocalElement(parentNode, modelElement)) {
            region = locationInFileProvider.getSignificantTextRegion(modelElement);
        }
        return region;
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
    private Severity getSeverity(XTestResult result, HashMultimap<Severity, EObject> issues) {
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

    private void scheduleValidation(EObject body) {
        Job validateJob = new RefreshValidationJob(body, validator);
        validateJob.schedule();
    }

    /**
     * Job to kick off validation when outline tree requested and no results are available
     * 
     * @author Michael Barry
     */
    public static class RefreshValidationJob extends Job {

        private final EObject body;
        private final IResourceValidator validator;

        /**
         * Constructs a new {@link RefreshValidationJob}
         * 
         * @param body
         *            The object to validate
         * @param validator
         *            The validator to invoke
         */
        public RefreshValidationJob(EObject body, IResourceValidator validator) {
            super("Refresh validation");
            this.body = body;
            this.validator = validator;
        }

        @Override
        protected IStatus run(final IProgressMonitor monitor) {
            CancelIndicator cancelMonitor = new CancelIndicator() {
                @Override
                public boolean isCanceled() {
                    return monitor.isCanceled();
                }
            };
            validator.validate(body.eResource(), CheckMode.NORMAL_AND_FAST, cancelMonitor);
            return Status.OK_STATUS;
        }

    }
}
