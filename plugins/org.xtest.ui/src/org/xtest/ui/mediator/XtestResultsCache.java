package org.xtest.ui.mediator;

import java.util.concurrent.ConcurrentMap;

import org.eclipse.emf.common.util.URI;
import org.xtest.results.XTestResult;

import com.google.common.collect.Maps;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Xtest file validation result cache. Listens on the Xtest event bus and caches results for Xtest
 * URIs as they come along.
 * 
 * @author Michael Barry
 */
@Singleton
public class XtestResultsCache {
    private final ConcurrentMap<URI, XTestResult> resultCache = Maps.newConcurrentMap();

    /**
     * Constructs the cache and registers it for updates on the event bus.
     * 
     * SHOULD ONLY BE INVOKED BY GUICE
     * 
     * @param bus
     *            The Xtest {@link EventBus}
     */
    @Inject
    public XtestResultsCache(EventBus bus) {
        bus.register(this);
        // TODO register for resource deleted events to trigger removal from the cache
    }

    /**
     * Called when Xtest file validation is finished
     * 
     * @param event
     *            The validation finished event containing URI and result of the xtest file
     *            validation
     */
    @Subscribe
    public void finish(ValidationFinishedEvent event) {
        URI uri = event.getUri();
        XTestResult result = event.getResult();
        if (result != null) {
            resultCache.put(uri, result);
        }
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
}
