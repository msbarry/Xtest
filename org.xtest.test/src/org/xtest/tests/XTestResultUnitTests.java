package org.xtest.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.common.collect.Lists;

import org.xtest.results.AbstractXTestResult;
import org.xtest.results.XTestCaseResult;
import org.xtest.results.XTestState;
import org.xtest.results.XTestSuiteResult;

/**
 * Container for unit tests of the non-EMF xtest result model
 * (org.xtest.results.*)
 */
public class XTestResultUnitTests {

    @Test
    public void test2CasesInSuiteFailPass() {
        XTestSuiteResult suite = new XTestSuiteResult(null);
        XTestCaseResult testCase = suite.subCase("test", null);
        XTestCaseResult testCase2 = suite.subCase("test2", null);
        testCase.fail();
        testCase2.pass();
        assertEquals(XTestState.FAIL, testCase.getState());
        assertEquals(XTestState.PASS, testCase2.getState());
        assertEquals(XTestState.FAIL, suite.getState());
    }

    @Test
    public void test2CasesInSuitePassFail() {
        XTestSuiteResult suite = new XTestSuiteResult(null);
        XTestCaseResult testCase = suite.subCase("test", null);
        XTestCaseResult testCase2 = suite.subCase("test2", null);
        testCase.pass();
        testCase2.fail();
        assertEquals(XTestState.PASS, testCase.getState());
        assertEquals(XTestState.FAIL, testCase2.getState());
        assertEquals(XTestState.FAIL, suite.getState());
    }

    @Test
    public void testCaseInSuite() {
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
    public void testCaseInSuiteFail() {
        XTestSuiteResult suite = new XTestSuiteResult(null);
        XTestCaseResult testCase = suite.subCase("test", null);
        testCase.fail();
        assertEquals(XTestState.FAIL, testCase.getState());
        assertEquals(XTestState.FAIL, suite.getState());
    }

    @Test
    public void testCaseInSuiteInSuite() {
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
    public void testCaseInSuiteInSuiteFail() {
        XTestSuiteResult parent = new XTestSuiteResult(null);
        XTestSuiteResult child = parent.subSuite("test", null);
        XTestCaseResult grandChild = child.subCase("test2", null);
        grandChild.fail();
        assertEquals(XTestState.FAIL, child.getState());
        assertEquals(XTestState.FAIL, parent.getState());
        assertEquals(XTestState.FAIL, grandChild.getState());
    }

    @Test
    public void testCaseInSuiteInSuitePass() {
        XTestSuiteResult parent = new XTestSuiteResult(null);
        XTestSuiteResult child = parent.subSuite("test", null);
        XTestCaseResult grandChild = child.subCase("test2", null);
        grandChild.pass();
        assertEquals(XTestState.PASS, child.getState());
        assertEquals(XTestState.PASS, parent.getState());
        assertEquals(XTestState.PASS, grandChild.getState());
    }

    @Test
    public void testCaseInSuitePass() {
        XTestSuiteResult suite = new XTestSuiteResult(null);
        XTestCaseResult testCase = suite.subCase("test", null);
        testCase.pass();
        assertEquals(XTestState.PASS, testCase.getState());
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
    public void testSuiteInSuite() {
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
