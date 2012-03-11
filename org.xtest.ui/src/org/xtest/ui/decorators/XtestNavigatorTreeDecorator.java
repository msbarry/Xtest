package org.xtest.ui.decorators;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILightweightLabelDecorator;
import org.eclipse.jface.viewers.LabelProvider;
import org.xtest.ui.internal.XtestPluginImages;

/**
 * 
 * @author Michael Barry
 */
public class XtestNavigatorTreeDecorator extends LabelProvider implements ILightweightLabelDecorator {

    @Override
    public void decorate(Object input, IDecoration decorator) {
        if (input instanceof IFile && ((IFile) input).getFileExtension().equals("xtest")) {
            IResource file = (IResource) input;
            try {
                int severity = file.findMaxProblemSeverity(null, true, IResource.DEPTH_INFINITE);
                ImageDescriptor overlay;
                switch (severity) {
                case IMarker.SEVERITY_ERROR:
                    overlay = XtestPluginImages.ERROR_OVERLAY;
                    break;
                case IMarker.SEVERITY_WARNING:
                    overlay = XtestPluginImages.WARN_OVERLAY;
                    break;
                default:
                    overlay = XtestPluginImages.OK_OVERLAY;
                    break;
                }
                decorator.addOverlay(overlay, IDecoration.BOTTOM_LEFT);

                IMarker[] findMarkers = file.findMarkers(null, true, IResource.DEPTH_INFINITE);

                int numErr = 0;
                for (IMarker marker : findMarkers) {
                    Object attribute = marker.getAttribute(IMarker.SEVERITY);
                    if ((Integer) attribute == IMarker.SEVERITY_ERROR) {
                        numErr++;
                    }
                }
                if (severity == IMarker.SEVERITY_ERROR) {
                    decorator.addSuffix(" [" + numErr + "]");
                }
            } catch (CoreException e) {
            }
        }
    }

}
