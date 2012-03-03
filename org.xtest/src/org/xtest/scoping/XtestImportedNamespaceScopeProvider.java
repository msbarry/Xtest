package org.xtest.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;
import org.xtest.xTest.Body;
import org.xtest.xTest.Import;

import com.google.common.collect.Lists;

/**
 * Change {@link XbaseImportedNamespaceScopeProvider} so that it does not process static imports.
 * Static imports are processed in {@link XtestStaticMethodsFeatureForTypeProvider}.
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestImportedNamespaceScopeProvider extends XbaseImportedNamespaceScopeProvider {

    @Override
    protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context,
            boolean ignoreCase) {
        List<ImportNormalizer> importedNamespaceResolvers = Lists.newArrayList();
        if (context instanceof Body) {
            for (Import imported : ((Body) context).getImports()) {
                if (!imported.isStatic()) {
                    String value = imported.getImportedNamespace();
                    ImportNormalizer resolver = createImportedNamespaceResolver(value, ignoreCase);
                    if (resolver != null) {
                        importedNamespaceResolvers.add(resolver);
                    }
                }
            }
        }
        return importedNamespaceResolvers;
    }
}
