package org.xtest.xTest.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.diagnostics.Severity;
import org.xtest.results.XTestResult;
import org.xtest.xTest.Body;

import com.google.common.collect.HashMultimap;

/**
 * Custom implementation of {@link Body}
 * 
 * @author Michael Barry
 */
public class BodyImplCustom extends BodyImpl {

    private HashMultimap<Severity, EObject> issues = HashMultimap.create();
    private XTestResult result;

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
     * Returns the list of validation issues
     * 
     * @return The list of validation issues
     */
    public HashMultimap<Severity, EObject> getIssues() {
        return issues;
    }

    /**
     * Returns the validation result
     * 
     * @return The validation result
     */
    public XTestResult getResult() {
        return result;
    }

    /**
     * Sets the list of validation issues
     * 
     * @param hashMultimap
     *            The list of validation issues
     */
    public void setIssues(HashMultimap<Severity, EObject> hashMultimap) {
        this.issues = hashMultimap;
    }

    /**
     * Sets the valiation result
     * 
     * @param result
     *            The validation result
     */
    public void setResult(XTestResult result) {
        this.result = result;
    }
}
