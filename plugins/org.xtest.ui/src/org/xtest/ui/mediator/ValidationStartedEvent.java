package org.xtest.ui.mediator;

import org.eclipse.emf.common.util.URI;

/**
 * Xtest file validation started event
 * 
 * @author Michael Barry
 */
public class ValidationStartedEvent {
    private final URI uri;

    /**
     * Construct a new Xtest file validation started event
     * 
     * @param uri
     *            URI of the Xtest file that was validated
     */
    public ValidationStartedEvent(URI uri) {
        this.uri = uri;
    }

    /**
     * Returns the URI of the Xtest file that was validated
     * 
     * @return The URI of the Xtest file that was validated
     */
    public URI getUri() {
        return uri;
    }
}
