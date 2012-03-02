package org.xtest.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.xtest.results.AbstractXTestResult;
import org.xtest.results.XTestCaseResult;
import org.xtest.results.XTestState;
import org.xtest.results.XTestSuiteResult;

import com.google.common.collect.Lists;

/**
 * Container for unit tests of the non-EMF xtest result model
 * (org.xtest.results.*)
 * 
 * @author Michael Barry
 */
public class XTestResultUnitTests {

    @Test
    public void test2CasesInSuiteFailPass() {
        XTestSuiteResult suite = new XTestSuiteResult(null);
        XTestCaseResult xtest = suite.subCase("test", null);
        XTestCaseResult xtest2 = suite.subCase("test2", null);
        xtest.fail();
        xtest2.pass();
        assertEquals(XTestState.FAIL, xtest.getState());
        assertEquals(XTestState.PASS, xtest2.getState());
        assertEquals(XTestState.FAIL, suite.getState());
    }

    @Test
    public void test2CasesInSuitePassFail() {
        XTestSuiteResult suite = new XTestSuiteResult(null);
        XTestCaseResult xtest = suite.subCase("test", null);
        XTestCaseResult xtest2 = suite.subCase("test2", null);
        xtest.pass();
        xtest2.fail();
        assertEquals(XTestState.PASS, xtest.getState());
        assertEquals(XTestState.FAIL, xtest2.getState());
        assertEquals(XTestState.FAIL, suite.getState());
    }

    @Test
    public void xtestInSuite() {
        XTestSuiteResult parent = new XTestSuiteResult(null);
        XTestCaseResult child = parent.subCase("test", null);
        assertEquals("test", child.getName());
        assertEquals("test", child.getQualifiedName());
        assertEquals(XTestState.NOT_RUN, child.getState());
        assertEquals(XTestState.NOT_RUN, parent.getState());
        assertEquals(0, parent.getSubSuites().size());
        assertEquals(1, parent.getCases().size());
    }

    @Test
    public void xtestInSuiteFail() {
        XTestSuiteResult suite = new XTestSuiteResult(null);
        XTestCaseResult xtest = suite.subCase("test", null);
        xtest.fail();
        assertEquals(XTestState.FAIL, xtest.getState());
        assertEquals(XTestState.FAIL, suite.getState());
    }

    @Test
    public void xtestInSuiteInSuite() {
        XTestSuiteResult parent = new XTestSuiteResult(null);
        XTestSuiteResult child = parent.subSuite("test", null);
        XTestCaseResult grandChild = child.subCase("test2", null);
        assertEquals("test", child.getQualifiedName());
        assertEquals("test.test2", grandChild.getQualifiedName());
        assertEquals(XTestState.NOT_RUN, child.getState());
        assertEquals(XTestState.NOT_RUN, parent.getState());
        assertEquals(XTestState.NOT_RUN, grandChild.getState());
        assertEquals(1, parent.getSubSuites().size());
        assertEquals(0, parent.getCases().size());
        assertEquals(0, child.getSubSuites().size());
        assertEquals(1, child.getCases().size());
    }

    @Test
    public void xtestInSuiteInSuiteFail() {
        XTestSuiteResult parent = new XTestSuiteResult(null);
        XTestSuiteResult child = parent.subSuite("test", null);
        XTestCaseResult grandChild = child.subCase("test2", null);
        grandChild.fail();
        assertEquals(XTestState.FAIL, child.getState());
        assertEquals(XTestState.FAIL, parent.getState());
        assertEquals(XTestState.FAIL, grandChild.getState());
    }

    @Test
    public void xtestInSuiteInSuitePass() {
        XTestSuiteResult parent = new XTestSuiteResult(null);
        XTestSuiteResult child = parent.subSuite("test", null);
        XTestCaseResult grandChild = child.subCase("test2", null);
        grandChild.pass();
        assertEquals(XTestState.PASS, child.getState());
        assertEquals(XTestState.PASS, parent.getState());
        assertEquals(XTestState.PASS, grandChild.getState());
    }

    @Test
    public void xtestInSuitePass() {
        XTestSuiteResult suite = new XTestSuiteResult(null);
        XTestCaseResult xtest = suite.subCase("test", null);
        xtest.pass();
        assertEquals(XTestState.PASS, xtest.getState());
        assertEquals(XTestState.PASS, suite.getState());
    }

    @Test
    public void testEmptySuiteFail() {
        AbstractXTestResult suite = new XTestSuiteResult(null);
        suite.fail();
        assertEquals(XTestState.FAIL, suite.getState());
    }

    @Test
    public void testEmptySuitePass() {
        AbstractXTestResult suite = new XTestSuiteResult(null);
        suite.pass();
        assertEquals(XTestState.PASS, suite.getState());
    }

    @Test
    public void testEmptySuiteResult() {
        XTestSuiteResult suite = new XTestSuiteResult(null);
        assertEquals(XTestState.NOT_RUN, suite.getState());
        assertEquals(null, suite.getName());
        assertEquals("", suite.getQualifiedName());
        assertEquals(0, suite.getSubSuites().size());
        assertEquals(0, suite.getCases().size());
    }

    @Test
    public void xsuiteInSuite() {
        XTestSuiteResult parent = new XTestSuiteResult(null);
        XTestSuiteResult child = parent.subSuite("test", null);
        assertEquals("test", child.getName());
        assertEquals("test", child.getQualifiedName());
        assertEquals(XTestState.NOT_RUN, child.getState());
        assertEquals(0, child.getSubSuites().size());
        assertEquals(0, child.getCases().size());
        assertEquals(XTestState.NOT_RUN, parent.getState());
        assertEquals(1, parent.getSubSuites().size());
        assertEquals(0, parent.getCases().size());
    }

    @Test
    public void testSyntaxError() {
        XTestSuiteResult suite = new XTestSuiteResult(null);
        suite.addSyntaxError("Syntax Error");
        assertEquals(XTestState.FAIL, suite.getState());
        assertEquals(Lists.newArrayList("Syntax Error"),
                suite.getErrorMessages());
    }
}
