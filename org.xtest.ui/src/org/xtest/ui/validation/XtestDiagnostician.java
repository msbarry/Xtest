package org.xtest.ui.validation;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.CancelableDiagnostician;
import org.eclipse.xtext.validation.CheckMode;
import org.xtest.results.XTestResult;
import org.xtest.ui.mediator.ValidationFinishedEvent;
import org.xtest.ui.mediator.XtestResultsCache;
import org.xtest.ui.resource.XtestDependencyAcceptingResource;
import org.xtest.xTest.Body;

import com.google.common.eventbus.EventBus;
import com.google.inject.Inject;

/**
 * Custom Xtest diagnostician that alerts the {@link XtestResultsCache} before validation of an
 * Xtest file starts, and after it finishes
 * 
 * @author Michael Barry
 */
public class XtestDiagnostician extends CancelableDiagnostician {
    @Inject
    private EventBus eventBus;

    /**
     * Construct a new {@link XtestDiagnostician}
     * 
     * SHOULD ONLY BE INVOKED BY GUICE
     * 
     * @param registry
     *            The registry to pass to the super class's constructor
     */
    @Inject
    public XtestDiagnostician(EValidator.Registry registry) {
        super(registry);
    }

    @Override
    public boolean validate(EClass eClass, EObject eObject, DiagnosticChain diagnostics,
            Map<Object, Object> context) {
        boolean validate = false;
        Resource eResource = eObject.eResource();
        URI uri = eResource.getURI();
        if (eObject instanceof Body) {
            XTestResult xtestResult = null;
            try {
                validate = super.validate(eClass, eObject, diagnostics, context);
                xtestResult = (XTestResult) context.get(XTestResult.KEY);
                if (eResource instanceof XtestDependencyAcceptingResource) {
                    XtestDependencyAcceptingResource resource = (XtestDependencyAcceptingResource) eResource;
                    resource.setResult(xtestResult);
                }
            } finally {
                eventBus.post(new ValidationFinishedEvent(uri, xtestResult, CheckMode
                        .getCheckMode(context)));
            }
        } else {
            validate = super.validate(eClass, eObject, diagnostics, context);
        }
        return validate;
    }
}
