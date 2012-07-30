package org.xtest.ui.internal;

import java.net.URL;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.ui.IImageHelper;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Registry of Xtest images
 * 
 * @author Michael Barry
 */
@Singleton
public class XtestPluginImages {
    /** Error overlay image descriptor */
    public static final ImageDescriptor ERROR_OVERLAY = create("err_ovr.gif");
    /** OK overlay image descriptor */
    public static final ImageDescriptor OK_OVERLAY = create("ok_ovr.gif");
    /** Test case image descriptor */
    public static final ImageDescriptor TEST_CASE = create("test.gif");
    /** Test suite image descriptor */
    public static final ImageDescriptor TEST_SUITE = create("tsuite.gif");
    /** Warn overlay image descriptor */
    public static final ImageDescriptor WARN_OVERLAY = create("warn_ovr.gif");

    private static ImageDescriptor create(String name) {
        return ImageDescriptor.createFromURL(makeImageURL(name));
    }

    private static URL makeImageURL(String name) {
        String path = "icons/" + name;
        return FileLocator.find(XTestActivator.getInstance().getBundle(), new Path(path), null);
    }

    @Inject
    private IImageHelper imageHelper;

    /**
     * Get the test suite image with no overlay
     * 
     * @return The test suite image with no overlay
     */
    public Image getSuiteImage() {
        return imageHelper.getImage(TEST_SUITE);
    }

    /**
     * Get the test suite image with an overlay for the specified severity
     * 
     * @param severity
     *            The severity
     * @return The test suite image with an overlay for the specified severity
     */
    public Image getSuiteImage(Severity severity) {
        return getOverlayedImage(TEST_SUITE, severity);
    }

    /**
     * Get the test case image with no overlay
     * 
     * @return The test case image with no overlay
     */
    public Image getTestImage() {
        return imageHelper.getImage(TEST_CASE);
    }

    /**
     * Get the test case image with an overlay for the specified severity
     * 
     * @param severity
     *            The severity
     * @return The test case image with an overlay for the specified severity
     */
    public Image getTestImage(Severity severity) {
        return getOverlayedImage(TEST_CASE, severity);
    }

    private Image getOverlayedImage(ImageDescriptor main, Severity severity) {
        ImageDescriptor descriptor;
        Image decoratedImage = imageHelper.getImage(main);
        if (Severity.ERROR == severity) {
            descriptor = ERROR_OVERLAY;
        } else if (Severity.WARNING == severity) {
            descriptor = WARN_OVERLAY;
        } else {
            descriptor = OK_OVERLAY;
        }
        DecorationOverlayIcon decorationOverlayIcon = new DecorationOverlayIcon(decoratedImage,
                descriptor, IDecoration.BOTTOM_LEFT);
        decoratedImage = imageHelper.getImage(decorationOverlayIcon);
        return decoratedImage;
    }
}
