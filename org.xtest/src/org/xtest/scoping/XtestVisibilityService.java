package org.xtest.scoping;

import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.util.VisibilityService;

/**
 * Custom {@link VisibilityService} implementation for xtest that makes everything visible.
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestVisibilityService extends VisibilityService {
    @Override
    public boolean isVisible(JvmMember jvmMember, JvmDeclaredType contextType) {
        return true;
    }
}
