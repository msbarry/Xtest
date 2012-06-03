package org.xtest.runner.statusbar;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.HandlerEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.xtest.runner.Activator;
import org.xtest.runner.RunAllJob;
import org.xtest.runner.TestsProvider;
import org.xtest.runner.events.TestFinished;
import org.xtest.runner.events.TestsStarted;
import org.xtest.runner.external.TestResult;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.common.collect.Ordering;
import com.google.common.collect.TreeMultimap;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

/**
 * Handler for stop-test events
 * 
 * @author Michael Barry
 */
public class FailedTestsHandler extends AbstractHandler {

    private final EventBus bus;

    private final Collection<IFile> failures;

    /**
     * SHOULD ONLY BE CALLED BY GUICE
     * 
     * @param job
     *            The test runner job provided by Guice
     * @param bus
     *            The event bus provided by Guice
     * @param tests
     *            The test provider instance provided by Guice
     */
    @Inject
    public FailedTestsHandler(RunAllJob job, EventBus bus, TestsProvider tests) {
        this.bus = bus;
        bus.register(this);
        Collection<IFile> failingTests = tests.getTestFilesWithState(TestResult.FAIL);
        List<IFile> unsynchronizedList = Lists.newArrayList(failingTests);
        failures = Collections.synchronizedCollection(unsynchronizedList);
    }

    /**
     * SHOULD ONLY BE CALLED BY {@link EventBus}
     * 
     * @param finished
     *            Test finished event
     */
    @Subscribe
    public void disabledIfFailed(TestFinished finished) {
        if (!finished.passed()) {
            failures.add(finished.getFile());
        }
        fireHandlerChanged(new HandlerEvent(this, true, false));
    }

    @Override
    public void dispose() {
        super.dispose();
        bus.unregister(this);
    }

    /**
     * SHOULD ONLY BE CALLED BY {@link EventBus}
     * 
     * @param started
     *            Tests started event
     */
    @Subscribe
    public void enable(TestsStarted started) {
        failures.clear();
        fireHandlerChanged(new HandlerEvent(this, true, false));
    }

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        if (!failures.isEmpty()) {
            MenuManager menuManager = new MenuManager("Failed Test Menu",
                    "org.xtest.statusbar.menu.failures");

            // construct menu
            for (final IFile failure : failures) {
                NavigateToFailureAction create = NavigateToFailureAction.create(failure);
                menuManager.add(create);
            }

            // Display menu
            Event trigger = (Event) event.getTrigger();
            ToolItem widget = (ToolItem) trigger.widget;
            ToolBar parent = widget.getParent();
            Menu menu = menuManager.createContextMenu(parent);
            parent.setMenu(menu);
            menu.setVisible(true);
        }

        return null;
    }

    @Override
    public boolean isEnabled() {
        return !failures.isEmpty();
    }

    /**
     * Menu action to navigate to a test failure
     * 
     * @author Michael Barry
     */
    private static class NavigateToFailureAction extends Action {
        /**
         * Static factory to construct from an {@link IFile}
         * 
         * @param failure
         *            The failed test file
         * @return The new {@link NavigateToFailureAction}
         */
        public static NavigateToFailureAction create(IFile failure) {
            Collection<IMarker> errors = getErrors(failure);

            String name = failure.getName();
            IMarker first = Iterables.getFirst(errors, null);
            if (!errors.isEmpty()) {
                int size = errors.size();
                name += " - " + size + " error" + (size == 1 ? "" : "s");
            }
            return new NavigateToFailureAction(name, failure, first);
        }

        /**
         * Returns a collection of error markers for a file
         * 
         * @param failure
         *            The test file
         * @return A collection of error markers for that file
         */
        private static Collection<IMarker> getErrors(IFile failure) {
            Multimap<Integer, IMarker> startLineToMarker = TreeMultimap.create(Ordering.natural(),
                    Ordering.arbitrary());
            try {
                IMarker[] findMarkers = failure.findMarkers(null, true, 0);
                for (IMarker thisMarker : findMarkers) {
                    Object attribute = thisMarker.getAttribute(IMarker.SEVERITY);
                    if (attribute instanceof Integer
                            && (Integer) attribute == IMarker.SEVERITY_ERROR) {
                        Object attribute2 = thisMarker.getAttribute(IMarker.LINE_NUMBER);
                        Integer lineNum = attribute2 instanceof Integer ? (Integer) attribute2 : 0;
                        startLineToMarker.put(lineNum, thisMarker);
                    }
                }
            } catch (CoreException e1) {
            }
            return startLineToMarker.values();
        }

        private final IFile failure;

        private final IMarker first;

        private NavigateToFailureAction(String name, IFile failure, IMarker first) {
            super(name, Activator.getDefault().getErrorFileImage());
            this.failure = failure;
            this.first = first;
        }

        @Override
        public void run() {
            // Open editor page at the first failure marker found, or just open the file if the
            // marker is not found
            IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
            IWorkbenchPage activePage = window.getActivePage();
            try {
                if (first != null) {
                    IDE.openEditor(activePage, first);
                } else {
                    IDE.openEditor(activePage, failure);
                }
            } catch (PartInitException e) {
            }
        }
    }
}
