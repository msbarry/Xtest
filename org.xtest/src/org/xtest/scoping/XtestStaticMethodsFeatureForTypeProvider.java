package org.xtest.scoping;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmFeature;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticImplicitMethodsFeatureForTypeProvider;
import org.xtest.xTest.Body;
import org.xtest.xTest.Import;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.inject.Inject;

/**
 * Add statically imported methods to the list of implicit static methods.
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestStaticMethodsFeatureForTypeProvider extends
        StaticImplicitMethodsFeatureForTypeProvider {

    @Inject
    private IQualifiedNameConverter qualifiedNameConverter;

    @Override
    protected void collectFeatures(String name, Iterable<JvmTypeReference> hierarchy,
            Collection<JvmFeature> result) {
        // Filter out features that are not matched by an on-demand or wildcard import.
        // For example "import A.B" and A.C should not be returned by this function
        super.collectFeatures(name, hierarchy, result);
        List<JvmFeature> toRemove = Lists.newArrayList();
        Set<String> imports = Sets.newHashSet(getStaticImports());
        for (String string : super.getLiteralClassNames()) {
            imports.add(string + ".*");
        }
        for (JvmFeature feature : result) {
            String packageName = feature.getQualifiedName();
            QualifiedName qualified = qualifiedNameConverter.toQualifiedName(packageName);
            QualifiedName type = qualified.skipLast(1);
            if (hierarchy == null && !imports.contains(type.toString() + ".*")
                    && !imports.contains(qualified.toString())) {
                toRemove.add(feature);
            }
        }
        result.removeAll(toRemove);
    }

    @Override
    protected Collection<String> getLiteralClassNames() {
        // Append statically imported types to list
        Collection<String> literalClassNames = Lists.newArrayList(super.getLiteralClassNames());
        Collection<String> other = getStaticImports();
        for (String importedNamespace : other) {
            QualifiedName qualified = qualifiedNameConverter.toQualifiedName(importedNamespace);
            if (qualified != null && qualified.getSegmentCount() >= 1) {
                literalClassNames.add(qualified.skipLast(1).toString());
            }
        }
        return literalClassNames;
    }

    /**
     * Return a raw list of static imports.
     * 
     * @return A list of static imports
     */
    private Collection<String> getStaticImports() {
        EList<EObject> contents = context.getContents();
        Collection<String> other = Lists.newArrayList();
        for (EObject object : contents) {
            if (object instanceof Body) {
                Body body = (Body) object;
                EList<Import> imports = body.getImports();
                for (Import imported : imports) {
                    if (imported.isStatic()) {
                        other.add(imported.getImportedNamespace());
                    }
                }
            }
        }
        return other;
    }
}
