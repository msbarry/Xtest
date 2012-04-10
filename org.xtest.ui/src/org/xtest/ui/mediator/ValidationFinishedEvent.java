package org.xtest.ui.mediator;

import org.eclipse.emf.common.util.URI;
import org.xtest.results.XTestResult;

/**
 * Xtest file validation finished event.
 * 
 * @author Michael Barry
 */
public class ValidationFinishedEvent {
    private final XTestResult result;
    private final URI uri;

    /**
     * Construct a new Xtest file validation finished event for the file at the given URI and result
     * 
     * @param uri
     *            URI of the Xtest file
     * @param result
     *            The validation result, or null if the test was not run
     */
    public ValidationFinishedEvent(URI uri, XTestResult result) {
        this.uri = uri;
        this.result = result;
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
