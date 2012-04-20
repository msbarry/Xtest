package org.xtest.scoping;

import static java.util.Collections.singletonList;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtend.core.scoping.XtendImportedNamespaceScopeProvider;
import org.eclipse.xtend.core.xtend.XtendImport;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ScopeBasedSelectable;
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
public class XtestImportedNamespaceScopeProvider extends XtendImportedNamespaceScopeProvider {

    @Override
    protected IScope getLocalElementsScope(IScope parent, final EObject context,
            final EReference reference) {
        IScope result = parent;
        ISelectable allDescriptions = getAllDescriptions(context.eResource());
        ScopeBasedSelectable parentSelectable = new ScopeBasedSelectable(parent);
        QualifiedName name = getQualifiedNameOfLocalElement(context);
        boolean ignoreCase = isIgnoreCase(reference);
        if (context instanceof Body) {
            // explicitly add java.lang imports with correct import-selectable
            List<ImportNormalizer> javaLangImport = getJavaLangImport();
            result = createImportScope(result, javaLangImport, parentSelectable,
                    reference.getEReferenceType(), isIgnoreCase(reference));
        }
        final List<ImportNormalizer> namespaceResolvers = getImportedNamespaceResolvers(context,
                ignoreCase);
        if (!namespaceResolvers.isEmpty()) {
            if (isRelativeImport() && name != null) {
                ImportNormalizer localNormalizer = doCreateImportNormalizer(name, true, ignoreCase);
                result = createImportScope(result, singletonList(localNormalizer), allDescriptions,
                        reference.getEReferenceType(), isIgnoreCase(reference));
            }
            result = createImportScope(result, namespaceResolvers, parentSelectable,
                    reference.getEReferenceType(), isIgnoreCase(reference));
        }
        if (name != null) {
            ImportNormalizer localNormalizer = doCreateImportNormalizer(name, true, ignoreCase);
            result = createImportScope(result, singletonList(localNormalizer), allDescriptions,
                    reference.getEReferenceType(), isIgnoreCase(reference));
        }
        return result;
    }

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
