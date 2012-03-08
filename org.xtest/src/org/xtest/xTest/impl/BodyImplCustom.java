package org.xtest.xTest.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.xtest.results.XTestSuiteResult;
import org.xtest.xTest.Body;

/**
 * Custom implementation of {@link Body}
 * 
 * @author Michael Barry
 */
public class BodyImplCustom extends BodyImpl {

    private XTestSuiteResult result;

    /**
     * Returns the file name of this test
     * 
     * @return The file name of this test
     */
    public String getFileName() {
        Resource eResource = eResource();
        String result = "File name unknown";
        if (eResource != null) {
            URI uri = eResource.getURI();
            try {
                result = URLDecoder.decode(uri.lastSegment(), "UTF-8");
            } catch (UnsupportedEncodingException e) {
            }
        }
        return result;
    }

    /**
     * Returns the validation result
     * 
     * @return The validation result
     */
    public XTestSuiteResult getResult() {
        return result;
    }

    /**
     * Sets the valiation result
     * 
     * @param result
     *            The validation result
     */
    public void setResult(XTestSuiteResult result) {
        this.result = result;
    }
}
