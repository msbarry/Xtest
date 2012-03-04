package org.xtest;

import java.util.Collection;

import org.eclipse.xtext.resource.DerivedStateAwareResourceDescriptionManager;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescriptions;

/**
 * Custom resource description manager that tells the builder to re-validate xtest files any time
 * any file changes.
 * 
 * @author Michael Barry
 * 
 */
public class XtestResourceDescriptionManager extends DerivedStateAwareResourceDescriptionManager {
    @Override
    public boolean isAffected(Collection<Delta> deltas, IResourceDescription candidate,
            IResourceDescriptions context) {
        // TODO this causes xtest files to rerun any time any change is made.
        // Investigate a smarter way to decide whether to rerun xtest files. In
        // the presence of reflection, however, there may not be any way to
        // definitively say that a change to one resource does not affect an
        // xtest file. This is another reason to keep xtest tests SIMPLE and
        // FAST
        boolean result;
        if (candidate != null && deltas != null
                && candidate.getURI().fileExtension().equals("xtest") && !deltas.isEmpty()) {
            result = true;
        } else {
            result = super.isAffected(deltas, candidate, context);
        }
        return result;
    }
}
