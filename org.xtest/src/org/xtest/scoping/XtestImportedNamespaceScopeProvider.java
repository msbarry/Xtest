package org.xtest.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendImport;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;
import org.xtest.xTest.Body;

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
            for (XtendImport imported : ((Body) context).getImports()) {
                if (!imported.isStatic()) {
                    String value = imported.getImportedNamespace();
                    JvmType typeImport = imported.getImportedType();
                    if (value == null && typeImport != null) {
                        value = typeImport.getQualifiedName();
                    }
                    if (value != null) {
                        ImportNormalizer resolver = createImportedNamespaceResolver(value,
                                ignoreCase);
                        if (resolver != null) {
                            importedNamespaceResolvers.add(resolver);
                        }
                    }
                }
            }
        }
        return importedNamespaceResolvers;
    }
}
