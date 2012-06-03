package org.xtest.runner.statusbar;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.menus.WorkbenchWindowControlContribution;
import org.xtest.runner.TestsProvider;
import org.xtest.runner.events.TestFinished;
import org.xtest.runner.events.TestsCanceled;
import org.xtest.runner.events.TestsFinished;
import org.xtest.runner.events.TestsStarted;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.inject.Inject;

/**
 * Status bar providing feedback to the user on the status of running Xtest tests.
 * 
 * @author Michael Barry
 */
public class StatusBar extends WorkbenchWindowControlContribution {
    private final EventBus bus;
    private Composite composite;
    private final RGB green = new RGB(0x51, 0xa3, 0x51);
    private boolean passing;
    private Image progressBackground;
    private final RGB red = new RGB(0xbd, 0x36, 0x2f);
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

        // create components and apply layout
        composite = parent;
        composite.setBackgroundMode(SWT.INHERIT_DEFAULT);
        // GridLayoutFactory.fillDefaults().margins(0, 0).extendedMargins(0, 4, 0, 0)
        // .applyTo(composite);
        composite.addListener(SWT.Resize, new Listener() {
            @Override
            public void handleEvent(Event e) {
                paint();
            }
        });

        initializeProgressBar();
        Composite composite = new Composite(parent, SWT.NONE);
        GridLayoutFactory.fillDefaults().numColumns(1).margins(3, 3).applyTo(composite);
        Label label = new Label(composite, SWT.BOLD);
        label.setText("Xtest");
        GridDataFactory.fillDefaults().applyTo(label);
        return composite;
    }

    private void initializeProgressBar() {
        passing = testProvider.areAllTestsPassing();
        updateColor();
    }

    private void paint() {
        Image oldImage = progressBackground;
        Display display = composite.getDisplay();
        Rectangle rect = composite.getClientArea();
        boolean horizontal = rect.width > rect.height;
        int boundWidth = rect.width;
        int boundHeight = rect.height;
        if (horizontal) {
            boundWidth -= 1;
        }
        progressBackground = new Image(display, rect.width, rect.height);
        GC gc = new GC(progressBackground);
        try {
            RGB rgb = passing ? green : red;
            Color color = new Color(Display.getDefault(), rgb);
            try {
                double completionRatio = total == 0 ? 0.0 : worked * 1.0 / total;

                Rectangle progress;
                Rectangle unknown;
                if (horizontal) {
                    int horizontalDivide = (int) (completionRatio * boundWidth);
                    int remainder = boundWidth - horizontalDivide;
                    progress = new Rectangle(0, 0, horizontalDivide, boundHeight);
                    unknown = new Rectangle(horizontalDivide, 0, remainder, boundHeight);
                } else {
                    int verticalDivide = (int) (completionRatio * boundHeight);
                    int remainder = boundHeight - verticalDivide;
                    progress = new Rectangle(0, remainder, boundWidth, verticalDivide);
                    unknown = new Rectangle(0, 0, boundWidth, remainder);
                }

                gc.setBackground(color);
                gc.fillRectangle(progress);

                gc.setBackground(Display.getDefault().getSystemColor(SWT.COLOR_GRAY));
                gc.fillRectangle(unknown);

                if (horizontal) {
                    gc.setBackground(Display.getDefault().getSystemColor(
                            SWT.COLOR_WIDGET_BACKGROUND));
                    gc.fillRectangle(boundWidth, 0, 4, boundHeight);
                }
            } finally {
                color.dispose();
            }
        } finally {
            gc.dispose();
        }
        composite.setBackgroundImage(progressBackground);

        // If there was an old image, get rid of it now
        if (oldImage != null) {
            oldImage.dispose();
        }
    }

    private void setProgress() {
        Display.getDefault().asyncExec(new Runnable() {
            @Override
            public void run() {
                paint();
            }

        });
    }

    private void updateColor() {
        setProgress();
    }
}
