package org.xtest.formatting;

import java.util.Map;

import org.eclipse.xtend.core.formatting.OrganizeImports.ReferenceAcceptor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.xbase.conversion.XbaseQualifiedNameValueConverter;

import com.google.inject.Inject;

/**
 * Custom {@link ReferenceAcceptor} implementation that fixes bug with escaped sequences in type
 * names
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class XtestReferenceAcceptor extends ReferenceAcceptor {
    @Inject
    private XbaseQualifiedNameValueConverter converter;

    @Override
    protected void addType(Map<String, String> names, JvmDeclaredType type) {
        String packageName = type.getPackageName();
        String qualifiedName = converter.toString(type.getQualifiedName());
        final String simpleName = packageName != null ? qualifiedName.substring(packageName
                .length() + 1) : qualifiedName;
        if (simpleName == null) {
            return;
        }
        if (!names.containsKey(simpleName)) {
            final String identifier = type.getIdentifier();
            if (identifier == null) {
                return;
            }
            names.put(simpleName, converter.toString(identifier));
        }
    }
}
