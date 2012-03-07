package org.xtest.xTest.impl;

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
