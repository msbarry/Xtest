package org.xtest.runner;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;
import org.xtest.runner.events.TestFinished;
import org.xtest.runner.events.TestsCanceled;
import org.xtest.runner.events.TestsFinished;
import org.xtest.runner.events.TestsStarted;
import org.xtest.runner.external.TestResult;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

/**
 * Status bar providing feedback to the user on the status of running Xtest tests.
 * 
 * @author Michael Barry
 */
public class StatusBar extends WorkbenchWindowControlContribution {
    private static final int WIDTH = 50;
    private final EventBus bus;
    private Canvas canvas;
    private Color green;
    private int lastWidth = 0;
    private boolean passing;

    private Color red;

    @Inject
    private TestsProvider testProvider;
    private int total;

    private int worked;

    /**
     * FOR GUICE ONLY
     * 
     * @param bus
     *            The event bus instance provided by Guice
     */
    @Inject
    private StatusBar(EventBus bus) {
        this.bus = bus;
        bus.register(this);

        // Start with 100% complete so that colored bar can reflect state of the tests
        total = 1;
        worked = 1;
    }

    /**
     * FOR EVENT BUS ONLY
     * 
     * @param event
     *            Test canceled event
     */
    @Subscribe
    public void cancel(TestsCanceled event) {
        worked = total - event.getNum();
        updateColor();
    }

    @Override
    public void dispose() {
        bus.unregister(this);
        super.dispose();
        canvas.dispose();
        red.dispose();
        green.dispose();
    }

    /**
     * FOR EVENT BUS ONLY
     * 
     * @param event
     *            Test finished event
     */
    @Subscribe
    public void finish(TestsFinished event) {
        // TODO - show icon
    }

    /**
     * FOR EVENT BUS ONLY
     * 
     * @param event
     *            Test started event
     */
    @Subscribe
    public void start(TestsStarted event) {
        passing = true;
        total = testProvider.getNumTotalTests();
        worked = total - event.getNum();
        updateColor();
    }

    /**
     * FOR EVENT BUS ONLY
     * 
     * @param event
     *            Test finish event
     */
    @Subscribe
    public void testRan(TestFinished event) {
        passing &= event.passed();
        worked++;
        updateColor();
    }

    @Override
    protected Control createControl(Composite parent) {
        // initialize colors
        green = new Color(Display.getDefault(), new RGB(0x51, 0xa3, 0x51));
        red = new Color(Display.getDefault(), new RGB(0xbd, 0x36, 0x2f));

        // Create components
        // final Composite composite = new Composite(parent, SWT.NONE);
        //
        // // Apply layout
        // GridLayout layout = new GridLayout(1, false);
        // layout.horizontalSpacing = 0;
        // layout.verticalSpacing = 0;
        // layout.marginTop = 0;
        // layout.marginBottom = 0;
        // layout.marginLeft = 0;
        // layout.marginRight = 0;
        // composite.setLayout(layout);

        canvas = new Canvas(parent, SWT.NONE);
        GridDataFactory.fillDefaults().indent(5, 5).minSize(WIDTH, 0).hint(WIDTH, 0)
                .align(SWT.CENTER, SWT.CENTER).applyTo(canvas);
        canvas.addPaintListener(new PaintListener() {

            @Override
            public void paintControl(PaintEvent e) {
                paint(e.gc);
            }
        });

        initializeProgressBar();
        return canvas;
    }

    private void initializeProgressBar() {
        passing = !Iterables.any(testProvider.getAllTests(), new Predicate<RunnableTest>() {
            @Override
            public boolean apply(RunnableTest input) {
                return input.getState() == TestResult.FAIL;
            }
        });
        updateColor();
    }

    private void paint(GC gc) {
        double completionRatio = total == 0 ? 0.0 : worked * 1.0 / total;
        Color color = passing ? green : red;
        Rectangle bounds = canvas.getBounds();
        int pixelWidth = (int) (completionRatio * bounds.width);
        int remainder = bounds.width - pixelWidth;
        boolean growing = pixelWidth > lastWidth;
        lastWidth = pixelWidth;
        if (growing) {
            // left first ...
            gc.setBackground(color);
            gc.fillRectangle(0, 0, pixelWidth, bounds.height);
            // .. then right
            gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_GRAY));
            gc.fillRectangle(pixelWidth, 0, remainder, bounds.height);
        } else {
            // right first ...
            gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_GRAY));
            gc.fillRectangle(pixelWidth, 0, remainder, bounds.height);
            // ... then left
            gc.setBackground(color);
            gc.fillRectangle(0, 0, pixelWidth, bounds.height);
        }
        gc.drawText("Xtest", bounds.width / 2 - 15, bounds.height / 2 - 8, true);
    }

    private void setProgress() {
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {

                GC gc = new GC(canvas);
                try {
                    paint(gc);
                } finally {
                    gc.dispose();
                }
            }

        });
    }

    private void updateColor() {
        setProgress();
    }
}
