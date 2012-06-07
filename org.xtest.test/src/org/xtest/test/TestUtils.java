package org.xtest.test;

import static junit.framework.Assert.fail;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

import com.google.common.collect.Sets;

public class TestUtils {
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

    public static String textOf(EObject eObject) {
        return NodeModelUtils.getNode(eObject).getText().trim();
    }
}
