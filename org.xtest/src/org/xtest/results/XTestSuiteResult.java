package org.xtest.results;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.xtest.xTest.Body;
import org.xtest.xTest.XTestCase;
import org.xtest.xTest.XTestSuite;

import com.google.common.collect.Lists;

/**
 * Xtest suite result
 * 
 * @author Michael Barry
 */
public class XTestSuiteResult extends AbstractXTestResult {
    private final List<XTestCaseResult> cases = Lists.newArrayList();
    private final List<XTestSuiteResult> suites = Lists.newArrayList();
    private final List<String> syntaxErrors = Lists.newArrayList();

    // Private constructor so that users are forced to call subSuite to
    // instantiate a non-top-level suite
    private XTestSuiteResult(AbstractXTestResult parent, String name,
            EObject eObject) {
        super(parent, name, eObject);
    }

    /**
     * Construct a top-level xtest suite result
     * 
     * @param main
     *            The xtest expression model
     */
    public XTestSuiteResult(Body main) {
        super(null, null, main);
    }

    /**
     * Fails this test and all of its parents and adds a syntax error for this
     * test suite.
     * 
     * @param string
     *            The syntax error.
     */
    public void addSyntaxError(String string) {
        fail();
        syntaxErrors.add(string);
    }

    /**
     * Returns the test case results in this test suite
     * 
     * @return The test case results in this test suite
     */
    public List<XTestCaseResult> getCases() {
        return cases;
    }

    /**
     * Returns the syntax errors in this test case
     * 
     * @return The syntax errors in this test case
     */
    public List<String> getErrorMessages() {
        return syntaxErrors;
    }

    /**
     * Returns the test suite results in this test suite
     * 
     * @return The test suite results in this test suite
     */
    public List<XTestSuiteResult> getSubSuites() {
        return suites;
    }

    /**
     * Constructs a new test case result that is contained in this suite.
     * 
     * @param name
     *            The name of the case
     * @param eObject
     *            The test case expression that the result corresponds to
     * @return The new test case result
     */
    public XTestCaseResult subCase(String name, XTestCase eObject) {
        XTestCaseResult xTestCaseResult = new XTestCaseResult(this, name,
                eObject);
        cases.add(xTestCaseResult);
        return xTestCaseResult;
    }

    /**
     * Constructs a new test suite result that is contained in this suite.
     * 
     * @param name
     *            The name of the suite
     * @param eObject
     *            The test suite expression that the result corresponds to
     * @return The new test suite result
     */
    public XTestSuiteResult subSuite(String name, XTestSuite eObject) {
        XTestSuiteResult xTestSuiteResult = new XTestSuiteResult(this, name,
                eObject);
        suites.add(xTestSuiteResult);
        return xTestSuiteResult;
    }

}
