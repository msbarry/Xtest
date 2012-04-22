package org.xtest.test;

import static junit.framework.Assert.assertEquals;

public class AssertHelpers {
    public static void assertEqualsNormalizeLinebreak(String expected, String actual) {
        String expectedNormalized = expected.replace("\r\n", "\n");
        String actualNormalized = actual.replace("\r\n", "\n");
        assertEquals(expectedNormalized, actualNormalized);
    }
}
