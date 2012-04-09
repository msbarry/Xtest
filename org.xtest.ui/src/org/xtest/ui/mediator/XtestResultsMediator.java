package org.xtest.ui.mediator;

import java.util.Collection;
import java.util.concurrent.ConcurrentMap;

import org.eclipse.emf.common.util.URI;
import org.xtest.results.XTestResult;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.inject.Singleton;

// TODO replace this with EventBus/result cache?
@Singleton
public class XtestResultsMediator {
    private final Multimap<URI, IXtestListener> listeners;
    private final ConcurrentMap<URI, XTestResult> xtestFiles = Maps.newConcurrentMap();

    public XtestResultsMediator() {
        HashMultimap<URI, IXtestListener> unsynchronized = HashMultimap.create();
        listeners = Multimaps.synchronizedSetMultimap(unsynchronized);
    }

    public void addXtestListener(URI uri, IXtestListener listener) {
        listeners.put(uri, listener);
    }

    public void finish(URI uri, XTestResult result) {
        if (result != null) {
            xtestFiles.put(uri, result);
        }
        Collection<IXtestListener> collection = listeners.get(uri);
        for (IXtestListener listener : collection) {
            listener.validationFinished(result);
        }
    }

    public XTestResult last(URI uri) {
        return xtestFiles.get(uri);
    }

    public void removeXtestListener(URI uri, IXtestListener listener) {
        listeners.remove(uri, listener);
    }

    public void start(URI uri) {
        Collection<IXtestListener> collection = listeners.get(uri);
        for (IXtestListener listener : collection) {
            listener.validationStarted();
        }
    }
}
