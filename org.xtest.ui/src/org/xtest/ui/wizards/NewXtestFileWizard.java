package org.xtest.ui.wizards;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.IImageHelper;
import org.eclipse.xtext.xtend2.ui.wizards.NewXtend2ClassWizard;

import com.google.inject.Inject;

/**
 * Wizard for creating new Xtest files
 * 
 * @author Michael Barry
 */
public class NewXtestFileWizard extends NewXtend2ClassWizard {

    /**
     * Constructs a new Xtest file wizard
     * 
     * @param imgHelper
     *            The image helper (will be overridden with one that returns Xtest icon
     * @param page
     *            The wizard page
     */
    @Inject
    public NewXtestFileWizard(final IImageHelper imgHelper, NewXtestFileWizardPage page) {
        super(new DummyImageHelper(imgHelper), page);
        setWindowTitle("New Xtest File");
    }

    @Override
    public void setDefaultPageImageDescriptor(ImageDescriptor imageDescriptor) {
        // Override this to avoid setting a page icon
    }

    private static class DummyImageHelper implements IImageHelper {
        private final IImageHelper imgHelper;

        private DummyImageHelper(IImageHelper imgHelper) {
            this.imgHelper = imgHelper;
        }

        @Override
        public Image getImage(ImageDescriptor imageDescriptor) {
            return imgHelper.getImage(imageDescriptor);
        }

        @Override
        public Image getImage(String name) {
            return imgHelper.getImage("testok.gif");
        }
    }
}
