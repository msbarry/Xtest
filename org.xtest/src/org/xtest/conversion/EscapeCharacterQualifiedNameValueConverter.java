package org.xtest.conversion;

import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.QualifiedNameValueConverter;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;

/**
 * Custom {@link QualifiedNameValueConverter} that fixes a bug in the toValue method where it had
 * been calling the value converter service toString method, but now calls its toValue method
 * 
 * @author Michael Barry
 */
public class EscapeCharacterQualifiedNameValueConverter extends QualifiedNameValueConverter {
    @Override
    public String toValue(String string, INode node) throws ValueConverterException {
        // Same as org.eclipse.xtext.conversion.impl.QualifiedNameConverter...
        StringBuilder buffer = new StringBuilder();
        boolean isFirst = true;
        if (node != null) {
            for (ILeafNode leafNode : node.getLeafNodes()) {
                EObject grammarElement = leafNode.getGrammarElement();
                if (isDelegateRuleCall(grammarElement) || isWildcardLiteral(grammarElement)) {
                    if (!isFirst) {
                        buffer.append(getValueNamespaceDelimiter());
                    }
                    isFirst = false;
                    if (isDelegateRuleCall(grammarElement)) {
                        buffer.append(delegateToValue(leafNode));
                    } else {
                        buffer.append(getWildcardLiteral());
                    }
                }
            }
        } else {
            for (String segment : string.split(Pattern.quote(getStringNamespaceDelimiter()))) {
                if (!isFirst) {
                    buffer.append(getValueNamespaceDelimiter());
                }
                isFirst = false;
                if (getWildcardLiteral().equals(segment)) {
                    buffer.append(getWildcardLiteral());
                } else {
                    // Except call toValue instead of toString in this case to properly convert
                    // escaped segments
                    Object value = valueConverterService.toValue(segment, getDelegateRuleName(),
                            node);
                    buffer.append(value);
                }
            }
        }
        return buffer.toString();
    }
}
