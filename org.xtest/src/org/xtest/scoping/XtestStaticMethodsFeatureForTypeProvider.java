package org.xtest.scoping;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVoid;
import org.eclipse.xtext.xbase.scoping.featurecalls.StaticMethodsFeatureForTypeProvider;
import org.xtest.xTest.Body;
import org.xtest.xTest.Import;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

/**
 * Add statically imported methods to the list of implicit static methods.
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestStaticMethodsFeatureForTypeProvider extends StaticMethodsFeatureForTypeProvider {

    @Override
    protected Iterable<String> getVisibleTypesContainingStaticMethods(JvmTypeReference reference) {
        Iterable<String> result = super.getVisibleTypesContainingStaticMethods(reference);
        if (reference == null || reference.getType() == null) {
            result = Iterables.concat(getStaticImports(), result);
        }
        return result;
    }

    /**
     * Return a raw list of static imports.
     * 
     * @return A list of static imports
     */
    private Collection<String> getStaticImports() {
        EList<EObject> contents = getContext().getContents();
        Collection<String> other = Lists.newArrayList();
        for (EObject object : contents) {
            if (object instanceof Body) {
                Body body = (Body) object;
                EList<Import> imports = body.getImports();
                for (Import imported : imports) {
                    JvmType staticImport = imported.getStaticImport();
                    if (imported.isStatic() && staticImport != null
                            && !(staticImport instanceof JvmVoid)) {
                        String qualifiedName = staticImport.getQualifiedName();
                        other.add(qualifiedName);
                    }
                }
            }
        }
        return other;
    }
}