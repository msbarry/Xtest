package org.xtest.test;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class TestUtils {
    public static String textOf(EObject eObject) {
        return NodeModelUtils.getNode(eObject).getText();
    }
}
