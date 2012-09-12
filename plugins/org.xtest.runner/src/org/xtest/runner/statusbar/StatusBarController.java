package org.xtest.runner.statusbar;

import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import org.xtest.runner.RunnableTest;
import org.xtest.runner.TestsProvider;
import org.xtest.runner.events.TestDeleted;
import org.xtest.runner.events.TestFinished;
import org.xtest.runner.events.TestsCanceled;
import org.xtest.runner.events.TestsStarted;
import org.xtest.runner.external.TestResult;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Controller for the status bar
 * 
 * @author Michael Barry
 */
@Singleton
public class StatusBarController {
    private int failures = 0;
    private int files = 0;
    private final AtomicBoolean initialized = new AtomicBoolean(false);
    private final List<IStatusBarRepaintListener> listeners;
    private final EventBus notifiers;
    private int pending = 0;
    private final Map<URI, TestResult> resultsForUris = Maps.newHashMap();
    @Inject
    private final TestsProvider testProvider;
    private int total = 0;

    private int worked = 0;

    /**
     * FOR GUICE ONLY
     * 
     * @param bus
     *            The event bus instance provided by Guice
     */
    @Inject
    private StatusBarController(EventBus bus, TestsProvider provider) {
        List<IStatusBarRepaintListener> unsynchronizedList = Lists.newArrayList();
        listeners = Collections.synchronizedList(unsynchronizedList);
        this.notifiers = bus;
        notifiers.register(this);
        this.testProvider = provider;
        // Don't initialize now since it Guice calls this method and it could cause deadlock,
        // instead lazy-initialize later before the first time the UI requests data
    }

    /**
     * Adds a listener that will be notified of when to repaint
     * 
     * @param statusBar
     *            Listener that wants to be notified when to repaint
     */
    public void addListener(IStatusBarRepaintListener statusBar) {
        listeners.add(statusBar);
    }

    /**
     * FOR EVENT BUS ONLY
     * 
     * @param event
     *            Test canceled event
     */
    @Subscribe
    public void cancel(TestsCanceled event) {
        testsMustRun(event.getTests());
        notifyListeners();
    }

    /**
     * FOR EVENT BUS ONLY
     * 
     * @param event
     *            Test deleted event
     */
    @Subscribe
    public void deleted(TestDeleted event) {
        if (!event.getTests().isEmpty()) {
            initValues();
            notifyListeners();
        }
    }

    /**
     * Get the completion ration to display in the status bar
     * 
     * @return The number of tests completed divided by the number of total tests
     */
    public double getCompletionRatio() {
        lazyInit();
        return files == 0 ? 1.0 : 1.0 * worked / files;
    }

    /**
     * Get the text to display in the status bar
     * 
     * @return The text to display in the status bar
     */
    public String getText() {
        lazyInit();
        return Integer.toString(failures) + "F/" + Integer.toString(total);
    }

    /**
     * Returns true if there are no failures
     * 
     * @return True if there are no failures, false if there are some
     */
    public boolean isPassing() {
        lazyInit();
        return failures == 0;
    }

    /**
     * Removes a listener that no longer wants to be notified of when to repaint
     * 
     * @param statusBar
     *            Listener that no longer wants to be notified when to repaint
     */
    public void removeListener(IStatusBarRepaintListener statusBar) {
        listeners.remove(statusBar);
    }

    /**
     * FOR EVENT BUS ONLY
     * 
     * @param event
     *            Test started event
     */
    @Subscribe
    public void start(TestsStarted event) {
        Collection<RunnableTest> tests = event.getTests();
        testsMustRun(tests);
        notifyListeners();
    }

    /**
     * FOR EVENT BUS ONLY
     * 
     * @param event
     *            Test finish event
     */
    @Subscribe
    public void testRan(TestFinished event) {
        worked++;
        updateFor(event.getResult(), event.getFile().getLocationURI());

        notifyListeners();
    }

    /**
     * Add statistics from the list of tests to the total statistics for all tests
     * 
     * @param allTests
     *            The list of tests
     */
    protected void addToTotals(Collection<RunnableTest> allTests) {
        for (RunnableTest test : allTests) {
            TestResult state = test.getState();
            updateFor(state, test.getFile().getLocationURI());
        }
    }

    /**
     * Re-initializes the list of tests from the workspace, marking the tests provided as to-be-run
     * 
     * @param tests
     *            The tests that are scheduled
     */
    protected void testsMustRun(Collection<RunnableTest> tests) {
        initValues();
        worked -= tests.size();
    }

    /**
     * Updates cumulative totals with the test result provided
     * 
     * @param state
     *            The test result
     * @param uri
     *            The URI that the test result is for
     */
    protected void updateFor(TestResult state, URI uri) {
        removeFromTestCounts(uri);
        failures += state.getNumFail();
        pending += state.getNumPend();
        total += state.getNumTotal();
        resultsForUris.put(uri, state);
    }

    private void initValues() {
        initialized.set(true);
        total = 0;
        failures = 0;
        pending = 0;
        Collection<RunnableTest> allTests = testProvider.getAllTests();
        resultsForUris.clear();
        worked = files = allTests.size();
        addToTotals(allTests);
    }

    private void lazyInit() {
        if (!initialized.get()) {
            initValues();
        }
    }

    private void notifyListeners() {
        for (IStatusBarRepaintListener listener : listeners) {
            listener.schedulePaint();
        }
    }

    private boolean removeFromTestCounts(URI uri) {
        boolean changed = false;
        TestResult old = resultsForUris.get(uri);
        if (old != null) {
            failures -= old.getNumFail();
            pending -= old.getNumPend();
            total -= old.getNumTotal();
            changed = true;
        }
        return changed;
    }
}