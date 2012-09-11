package org.xtest.formatting;

import java.util.List;

import org.eclipse.xtend.core.formatting.OrganizeImports.ReferenceAcceptor;
import org.eclipse.xtext.xbase.conversion.XbaseQualifiedNameValueConverter;

import com.google.common.collect.Lists;
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
    public List<String> getListofImportedTypeNames() {
        return normalize(super.getListofImportedTypeNames());
    }

    @Override
    public List<String> getListofStaticExtensionImports() {
        return normalize(super.getListofStaticExtensionImports());
    }

    @Override
    public List<String> getListofStaticImports() {
        return normalize(super.getListofStaticImports());
    }

    private List<String> normalize(List<String> result) {
        List<String> result2 = Lists.newArrayList();
        for (String entry : result) {
            result2.add(converter.toString(entry));
        }
        return result2;
    }
}
