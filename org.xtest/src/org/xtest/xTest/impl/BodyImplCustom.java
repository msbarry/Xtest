package org.xtest.xTest.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.xtest.xTest.Body;

/**
 * Custom implementation of {@link Body}
 * 
 * @author Michael Barry
 */
public class BodyImplCustom extends BodyImpl {

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
}
