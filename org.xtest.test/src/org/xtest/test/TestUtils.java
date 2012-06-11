package org.xtest.test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com.google.common.collect.Sets;

public class TestUtils {
    public static void assertProxyStackTrace(StackTraceElement element) {
        assertEquals("method name", "apply", element.getMethodName());
        assertTrue("proxy class", element.getClassName().startsWith("$Proxy"));
    }

    public static void assertSetEquals(Set<?> actual, Object... expectedElements) {
        Set<?> expected = Sets.newHashSet(expectedElements);
        Set<?> doesntContain = Sets.difference(expected, actual);
        Set<?> shouldntContain = Sets.difference(actual, expected);
        if (!doesntContain.isEmpty() && !shouldntContain.isEmpty()) {
            fail("Got " + actual + ". " + "Should not have contained " + shouldntContain
                    + " and should have contained " + doesntContain);
        } else if (!doesntContain.isEmpty()) {
            fail("Got " + actual + ". Missing " + doesntContain);
        } else if (!shouldntContain.isEmpty()) {
            fail("Got " + actual + ". Should not have had " + shouldntContain);
        } else {
            // OK
        }
    }

    public static void assertStackTraceEquals(StackTraceElement element, String className,
            String methodName, String fileName, int lineNumber) {
        assertEquals("class name", className, element.getClassName());
        assertEquals("method name", methodName, element.getMethodName());
        assertEquals("file name", fileName, element.getFileName());
        assertEquals("line number", lineNumber, element.getLineNumber());
    }

    public static void assertXtestStackTrace(StackTraceElement element, String methodName,
            int lineNumber) {
        assertStackTraceEquals(element, "__synthetic0.uri", methodName, "__synthetic0.uri",
                lineNumber);
    }

    public static String textOf(EObject eObject) {
        return NodeModelUtils.getNode(eObject).getText().trim();
    }
}
