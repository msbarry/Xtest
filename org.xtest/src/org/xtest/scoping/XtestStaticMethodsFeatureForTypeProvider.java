package org.xtest.scoping;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend.core.scoping.StaticallyImportedFeaturesProvider;
import org.eclipse.xtend.core.xtend.XtendImport;
import org.xtest.xTest.Body;

/**
 * Add statically imported methods to the list of implicit static methods.
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestStaticMethodsFeatureForTypeProvider extends StaticallyImportedFeaturesProvider {

    @Override
    protected List<XtendImport> getImports() {
        Resource resource = getContext();
        if (resource.getContents().isEmpty() || !(resource.getContents().get(0) instanceof Body)) {
            return Collections.emptyList();
        }
        Body file = (Body) resource.getContents().get(0);
        return file.getImports();
    }
}
