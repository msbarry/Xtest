package org.xtest.ui.mediator;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.xtest.results.XTestResult;

import com.google.common.collect.Maps;
import com.google.common.eventbus.EventBus;
import com.google.inject.Singleton;

/**
 * Xtest file validation result mediator that notifies listeners when validation starts and finishes
 * and caches validation results
 * 
 * @author Michael Barry
 */
@Singleton
public class XtestResultsMediator {
    private final EventBus eventBus = new EventBus("Xtest Result Event Bus");
    private final Map<URI, XTestResult> resultCache = Maps.newHashMap();

    /**
     * Called when Xtest file validation is finished
     * 
     * @param uri
     *            URI of the Xtest file that was validated
     * @param xtestResult
     *            Validation result
     */
    public void finish(URI uri, XTestResult xtestResult) {
        if (xtestResult != null) {
            resultCache.put(uri, xtestResult);
        }
        eventBus.post(new ValidationFinishedEvent(uri, xtestResult));
    }

    /**
     * Return the last validation result for the Xtest file at the given URI
     * 
     * @param uri
     *            The last validation result for the Xtest file at the given URI
     * @return URI of the Xtest file
     */
    public XTestResult getLast(URI uri) {
        return resultCache.get(uri);
    }

    /**
     * Register a validation start/finish event listener on the event bus
     * 
     * @param object
     *            The listener to register
     */
    public void register(Object object) {
        eventBus.register(object);
    }

    /**
     * Called when Xtest file validation is started
     * 
     * @param uri
     *            URI of the Xtest file which has started validation
     */
    public void start(URI uri) {
        eventBus.post(new ValidationStartedEvent(uri));
    }

    /**
     * Unregister a validation start/finish event listener from the event bus
     * 
     * @param object
     *            The listener to unregister
     */
    public void unregister(Object object) {
        eventBus.unregister(object);
    }
}
