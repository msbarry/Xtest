package org.xtest.interpreter;

import java.lang.reflect.Method;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.util.PolymorphicDispatcher;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XCasePart;
import org.eclipse.xtext.xbase.XClosure;
import org.eclipse.xtext.xbase.XDoWhileExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XForLoopExpression;
import org.eclipse.xtext.xbase.XNullLiteral;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.XStringLiteral;
import org.eclipse.xtext.xbase.XTypeLiteral;
import org.eclipse.xtext.xbase.XWhileExpression;
import org.xtest.XtestUtil;
import org.xtest.xTest.XMethodDefExpression;

import com.google.common.collect.Iterables;

/**
 * Helper class that builds awesome assertion failed messages that contain the result of each
 * expression inside a failed assertion expression.
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class AssertionMessageBuilder {
    private final PolymorphicDispatcher<Void> traverseDispatcher = PolymorphicDispatcher
            .createForSingleTarget(new PrefixMethodFilter("_traverse", 3, 3), this);

    /**
     * Builds a failed assertion message for the given expression by doing a depth-first traversal
     * of all of the contained expressions and appending the expression text and the interpreted
     * result to the output string.
     * 
     * @param actual
     *            The expression
     * @param executedExpressions
     *            Map from expression to interpreted result
     * @return An awesome assertion failure message
     */
    public String buildMessage(XExpression actual, Map<XExpression, Object> executedExpressions) {
        StringBuilder builder = new StringBuilder("Assertion failed\n");
        if (executedExpressions != null) {
            traverse(actual, executedExpressions, builder);
        }
        return builder.toString();
    }

    protected void _traverseBlock(XBlockExpression block, Map<XExpression, Object> results,
            StringBuilder builder) {
        // only traverse return expression
        XExpression last = Iterables.getLast(block.getExpressions(), null);
        if (last != null) {
            traverse(last, results, builder);
        }
    }

    protected void _traverseDefault(XExpression actual, Map<XExpression, Object> results,
            StringBuilder builder) {
        boolean skipped = appendToString(actual, results, builder);
        if (!skipped) {
            traverseChildren(actual, results, builder);
        }
    }

    protected void _traverseDoWhile(XDoWhileExpression expr, Map<XExpression, Object> results,
            StringBuilder builder) {
        appendToString(expr, results, builder);
    }

    protected void _traverseEObject(EObject obj, Map<XExpression, Object> results,
            StringBuilder builder) {
        traverseChildren(obj, results, builder);
    }

    protected void _traverseForLoop(XForLoopExpression expr, Map<XExpression, Object> results,
            StringBuilder builder) {
        appendToString(expr, results, builder);
    }

    protected void _traverseLiteral(XBooleanLiteral expr, Map<XExpression, Object> results,
            StringBuilder builder) {
        // skip
    }

    protected void _traverseLiteral(XClosure expr, Map<XExpression, Object> results,
            StringBuilder builder) {
        // skip
    }

    protected void _traverseLiteral(XNullLiteral expr, Map<XExpression, Object> results,
            StringBuilder builder) {
        // skip
    }

    protected void _traverseLiteral(XNumberLiteral expr, Map<XExpression, Object> results,
            StringBuilder builder) {
        // skip
    }

    protected void _traverseLiteral(XStringLiteral expr, Map<XExpression, Object> results,
            StringBuilder builder) {
        // skip
    }

    protected void _traverseLiteral(XTypeLiteral expr, Map<XExpression, Object> results,
            StringBuilder builder) {
        // skip
    }

    protected void _traverseMethodDef(XMethodDefExpression expr, Map<XExpression, Object> results,
            StringBuilder builder) {
        appendToString(expr, results, builder);
    }

    protected void _traverseSwitchCase(XCasePart expr, Map<XExpression, Object> results,
            StringBuilder builder) {
        // Only dive into switch expressions that were executed
        if (results.containsKey(expr.getThen())) {
            traverse(expr.getThen(), results, builder);
        }
    }

    protected void _traverseWhile(XWhileExpression expr, Map<XExpression, Object> results,
            StringBuilder builder) {
        appendToString(expr, results, builder);
    }

    private boolean appendToString(XExpression actual, Map<XExpression, Object> results,
            StringBuilder builder) {
        boolean skipped = !results.containsKey(actual);
        Object object = results.get(actual);
        String text = getTrimmedText(actual);
        builder.append("   \"");
        builder.append(text);
        builder.append("\" was ");
        if (!skipped) {
            if (object != null) {
                builder.append(object.getClass().getSimpleName());
                builder.append(" <");
                builder.append(XtestUtil.trimIfNecessary(object.toString(), 40));
                builder.append('>');
            } else {
                builder.append("<null>");
            }
            builder.append('\n');
        } else {
            builder.append("skipped\n");
        }
        return skipped;
    }

    private String getTrimmedText(XExpression actual) {
        return XtestUtil.getText(actual, 60);
    }

    /**
     * Dispatch to the appropriate _traverse* method
     * 
     * @param expr
     *            The expression
     * @param results
     *            Map from expression to result
     * @param builder
     *            result builder
     */
    private void traverse(EObject expr, Map<XExpression, Object> results, StringBuilder builder) {
        traverseDispatcher.invoke(expr, results, builder);
    }

    private void traverseChildren(EObject actual, Map<XExpression, Object> results,
            StringBuilder builder) {
        Iterable<EObject> filter = actual.eContents();
        for (EObject expression : filter) {
            traverse(expression, results, builder);
        }
    }

    private static class PrefixMethodFilter extends PolymorphicDispatcher.MethodNameFilter {

        public PrefixMethodFilter(String prefix, int minParams, int maxParams) {
            super(prefix, minParams, maxParams);
        }

        @Override
        public boolean apply(Method param) {
            return param.getName().startsWith(methodName)
                    && param.getParameterTypes().length >= minParams
                    && param.getParameterTypes().length <= maxParams;
        }
    }

}
