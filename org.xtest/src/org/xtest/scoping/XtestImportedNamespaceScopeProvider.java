package org.xtest.scoping;

import static java.util.Collections.singletonList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtend.core.scoping.XtendImportedNamespaceScopeProvider;
import org.eclipse.xtend.core.xtend.XtendImport;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.ISelectable;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.MultimapBasedSelectable;
import org.eclipse.xtext.scoping.impl.ScopeBasedSelectable;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.scoping.XbaseImportedNamespaceScopeProvider;
import org.xtest.xTest.Body;
import org.xtest.xTest.XMethodDef;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * Change {@link XbaseImportedNamespaceScopeProvider} so that it does not process static imports.
 * Static imports are processed in {@link XtestStaticMethodsFeatureForTypeProvider}.
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestImportedNamespaceScopeProvider extends XtendImportedNamespaceScopeProvider {

    @Inject
    private IJvmModelAssociations associations;

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
            List<ImportNormalizer> javaLangImport = getDefaultImports();
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
    protected ISelectable internalGetAllDescriptions(final Resource resource) {
        // Filter out meythod type parameter declarations from global scope
        Iterable<EObject> allContents = Iterables.filter(new Iterable<EObject>() {
            @Override
            public Iterator<EObject> iterator() {
                return EcoreUtil.getAllContents(resource, false);
            }
        }, new Predicate<EObject>() {
            @Override
            public boolean apply(EObject input) {
                return input.eContainer() == null || !(input.eContainer() instanceof XMethodDef)
                        && associations.getPrimarySourceElement(input) == null;
            }
        });
        Iterable<IEObjectDescription> allDescriptions = Scopes.scopedElementsFor(allContents,
                getQualifiedNameProvider());
        return new MultimapBasedSelectable(allDescriptions);
    }

    @Override
    protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context,
            boolean ignoreCase) {
        if (!(context instanceof Body)) {
            return Collections.emptyList();
        }
        Body file = (Body) context;
        List<ImportNormalizer> importedNamespaceResolvers = Lists.newArrayList();
        for (XtendImport imp : file.getImports()) {
            if (!imp.isStatic()) {
                String value = imp.getImportedNamespace();
                if (value == null) {
                    value = imp.getImportedTypeName();
                }
                ImportNormalizer resolver = createImportedNamespaceResolver(value, ignoreCase);
                if (resolver != null) {
                    importedNamespaceResolvers.add(resolver);
                }
            }
        }
        return importedNamespaceResolvers;
    }
}
