package org.xtest.ui.mediator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.validation.CheckMode;
import org.xtest.results.XTestResult;

/**
 * Xtest file validation finished event.
 * 
 * @author Michael Barry
 */
public class ValidationFinishedEvent {
    private final CheckMode checkMode;
    private final XTestResult result;
    private final URI uri;

    /**
     * Construct a new Xtest file validation finished event for the file at the given URI and result
     * 
     * @param uri
     *            URI of the Xtest file
     * @param result
     *            The validation result, or null if the test was not run
     * @param checkMode
     *            The type of validation that was performed
     */
    public ValidationFinishedEvent(URI uri, XTestResult result, CheckMode checkMode) {
        this.uri = uri;
        this.result = result;
        this.checkMode = checkMode;
    }

    /**
     * Returns the check mode of this validation
     * 
     * @return The check mode of this validation
     */
    public CheckMode getCheckMode() {
        return checkMode;
    }

    /**
     * Returns the Xtest result for this event, or null if the test was not run
     * 
     * @return The Xtest result for this event, or null if the test was not run
     */
    public XTestResult getResult() {
        return result;
    }

    /**
     * Returns the URI of the validated Xtest file
     * 
     * @return The URI of the validated Xtest file
     */
    public URI getUri() {
        return uri;
    }
}
