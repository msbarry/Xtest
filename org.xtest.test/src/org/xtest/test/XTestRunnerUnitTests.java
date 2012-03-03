package org.xtest.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.xtest.XTestInjectorProvider;
import org.xtest.XTestRunner;
import org.xtest.results.XTestCaseResult;
import org.xtest.results.XTestState;
import org.xtest.results.XTestSuiteResult;

import com.google.inject.Injector;

/**
 * Container for unit tests of xtest string to result model runner
 * 
 * @author Michael Barry
 */
public class XTestRunnerUnitTests {
    private static Injector injector = new XTestInjectorProvider().getInjector();

    protected void assertXtestPasses(String test) {
        XTestSuiteResult result = XTestRunner.run(test, injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
    }

    protected void assertXtestPreEvalFailure(String test) {
        XTestSuiteResult result = XTestRunner.run(test, injector);
        assertTrue(!"[]".equals(result.getErrorMessages().toString()));
        assertEquals(XTestState.FAIL, result.getState());
    }

    @Test
    public void testCustomValidation() {
        XTestSuiteResult result = XTestRunner.run("xsuite suite1 {\nassert 1==1\n}", injector);
        assertTrue(null == result.getEvaluationException());
        assertEquals(1, result.getErrorMessages().size());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(0, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
    }

    @Test
    public void testEmptyTestCase() {
        XTestSuiteResult result = XTestRunner.run("", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.NOT_RUN, result.getState());
        assertEquals(0, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
        assertEquals("", result.getQualifiedName());
    }

    @Test
    public void testExceptionInCaseInSuiteInSuite() {
        XTestSuiteResult result = XTestRunner.run("xsuite suite {xtest tcase {print(1/0)}}",
                injector);
        assertTrue(null == result.getEvaluationException());
        assertEquals("[]", result.getErrorMessages().toString());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(1, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
        assertEquals("", result.getQualifiedName());

        XTestSuiteResult xTestSuiteResult = result.getSubSuites().get(0);
        assertEquals(XTestState.FAIL, xTestSuiteResult.getState());
        assertTrue(null == xTestSuiteResult.getEvaluationException());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getCases().size());
        assertEquals(0, xTestSuiteResult.getSubSuites().size());

        XTestCaseResult xTestCaseResult = xTestSuiteResult.getCases().get(0);
        assertTrue(null != xTestCaseResult.getEvaluationException());
        assertEquals(XTestState.FAIL, xTestCaseResult.getState());
        assertEquals("suite.tcase", xTestCaseResult.getQualifiedName());
    }

    @Test
    public void testFalseAssertInCaseInSuiteInSuite() {
        XTestSuiteResult result = XTestRunner.run("xsuite suite {xtest tcase {assert 0==1}}",
                injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(1, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
        assertEquals("", result.getQualifiedName());

        XTestSuiteResult xTestSuiteResult = result.getSubSuites().get(0);
        assertEquals(XTestState.FAIL, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getCases().size());
        assertEquals(0, xTestSuiteResult.getSubSuites().size());

        XTestCaseResult xTestCaseResult = xTestSuiteResult.getCases().get(0);
        assertEquals(XTestState.FAIL, xTestCaseResult.getState());
        assertEquals("suite.tcase", xTestCaseResult.getQualifiedName());
    }

    @Test
    public void testImport_innerStaticClass_shouldPass() {
        assertXtestPasses("import helpers.SUT$InnerClass\nxsuite suite {xtest tcase {assert SUT$InnerClass::innerField==1}}");
    }

    @Test
    public void testImportNonStatic() {
        assertXtestPasses("import helpers.*\nxsuite suite {xtest tcase {assert SUT::getStatic==2}}");
    }

    @Test
    public void testImportStatic_field_shouldPass() {
        assertXtestPasses("import static helpers.SUT.getStatic\nxsuite suite {xtest tcase {assert getStatic==2}}");
    }

    @Test
    public void testImportStatic_innerClassMembers_shouldFail() {
        assertXtestPreEvalFailure("import static helpers.SUT$InnerClass.nonStaticField\nxsuite suite {xtest tcase {assert nonStaticField==1}}");
        assertXtestPreEvalFailure("import static helpers.SUT$InnerClass.getNonStatic\nxsuite suite {xtest tcase {assert getNonStatic==1}}");
        assertXtestPreEvalFailure("import static helpers.SUT$InnerClass.*\nxsuite suite {xtest tcase {assert getNonStatic==1}}");
        assertXtestPreEvalFailure("import static helpers.SUT$InnerClass.*\nxsuite suite {xtest tcase {assert nonStaticField==1}}");
    }

    @Test
    public void testImportStatic_innerStaticClass_shouldFail() {
        assertXtestPreEvalFailure("import static helpers.SUT$InnerClass\nxsuite suite {xtest tcase {assert innerField==1}}");
    }

    @Test
    public void testImportStatic_innerStaticClassMembers() {
        assertXtestPasses("import static helpers.SUT$InnerClass.innerField\nxsuite suite {xtest tcase {assert innerField==1}}");
        assertXtestPasses("import static helpers.SUT$InnerClass.getStatic\nxsuite suite {xtest tcase {assert getStatic==1}}");
        // Import/used mismatch
        assertXtestPreEvalFailure("import static helpers.SUT$InnerClass.getStatic\nxsuite suite {xtest tcase {assert innerField==1}}");
        assertXtestPreEvalFailure("import static helpers$SUT.InnerClass.innerField\nxsuite suite {xtest tcase {assert getStatic==1}}");
    }

    @Test
    public void testImportStatic_innerStaticClassWildcard() {
        assertXtestPasses("import static helpers.SUT$InnerClass.*\nxsuite suite {xtest tcase {assert innerField==1}}");
        assertXtestPasses("import static helpers.SUT$InnerClass.*\nxsuite suite {xtest tcase {assert getStatic==1}}");
        // Try to use nonstatic
        assertXtestPreEvalFailure("import static helpers.SUT$InnerClass.*\nxsuite suite {xtest tcase {assert getNonStatic==1}}");
        assertXtestPreEvalFailure("import static helpers.SUT$InnerClass.*\nxsuite suite {xtest tcase {assert nonStaticField==1}}");
    }

    @Test
    public void testImportStatic_namedFunc_shouldPass() {
        XTestSuiteResult result = XTestRunner
                .run("import static helpers.SUT.getStatic\nxsuite suite {xtest tcase {assert getStatic==2}}",
                        injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
    }

    @Test
    public void testImportStatic_type_shouldfail() {
        XTestSuiteResult result = XTestRunner.run(
                "import static helpers.SUT\nxsuite suite {xtest tcase {assert getStatic==2}}",
                injector);
        assertTrue(!"[]".equals(result.getErrorMessages().toString()));
        assertEquals(XTestState.FAIL, result.getState());
    }

    @Test
    public void testImportStatic_wildcard_shouldPass() {
        XTestSuiteResult result = XTestRunner.run(
                "import static helpers.SUT.*\nxsuite suite {xtest tcase {assert getStatic==2}}",
                injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
    }

    @Test
    public void testInnerClassesRecognized() {
        assertXtestPasses("import helpers.*\nxsuite suite {xtest tcase {assert SUT$InnerClass::innerField==1}}");
    }

    @Test
    public void testMalformed() {
        XTestSuiteResult result = XTestRunner.run("testSui", injector);
        assertEquals(1, result.getErrorMessages().size());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(0, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
    }

    @Test
    public void testThrowDivByZeroException() {
        XTestSuiteResult result = XTestRunner.run(
                "xsuite suite {xtest tcase {assert 1/0 throws Exception}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
        assertEquals(1, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
        assertEquals("", result.getQualifiedName());

        XTestSuiteResult xTestSuiteResult = result.getSubSuites().get(0);
        assertEquals(XTestState.PASS, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getCases().size());
        assertEquals(0, xTestSuiteResult.getSubSuites().size());

        XTestCaseResult xTestCaseResult = xTestSuiteResult.getCases().get(0);
        assertEquals(XTestState.PASS, xTestCaseResult.getState());
        assertEquals("suite.tcase", xTestCaseResult.getQualifiedName());
        assertTrue(null == xTestCaseResult.getEvaluationException());
    }

    @Test
    public void testThrowException() {
        XTestSuiteResult result = XTestRunner
                .run("xsuite suite {xtest tcase {assert throw new InterruptedException() throws InterruptedException}}",
                        injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
        assertEquals(1, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
        assertEquals("", result.getQualifiedName());

        XTestSuiteResult xTestSuiteResult = result.getSubSuites().get(0);
        assertEquals(XTestState.PASS, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getCases().size());
        assertEquals(0, xTestSuiteResult.getSubSuites().size());

        XTestCaseResult xTestCaseResult = xTestSuiteResult.getCases().get(0);
        assertEquals(XTestState.PASS, xTestCaseResult.getState());
        assertEquals("suite.tcase", xTestCaseResult.getQualifiedName());
    }

    @Test
    public void testThrowsWrongException() {
        XTestSuiteResult result = XTestRunner
                .run("xsuite suite {xtest tcase {assert throw new InterruptedException() throws IllegalArgumentException}}",
                        injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(1, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
        assertEquals("", result.getQualifiedName());

        XTestSuiteResult xTestSuiteResult = result.getSubSuites().get(0);
        assertEquals(XTestState.FAIL, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getCases().size());
        assertEquals(0, xTestSuiteResult.getSubSuites().size());

        XTestCaseResult xTestCaseResult = xTestSuiteResult.getCases().get(0);
        assertEquals(XTestState.FAIL, xTestCaseResult.getState());
        assertEquals("suite.tcase", xTestCaseResult.getQualifiedName());
    }

    @Test
    public void testTrueAssertInCaseInSuiteInSuite() {
        XTestSuiteResult result = XTestRunner.run("xsuite suite {xtest tcase {assert 1==1}}",
                injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
        assertEquals(1, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
        assertEquals("", result.getQualifiedName());

        XTestSuiteResult xTestSuiteResult = result.getSubSuites().get(0);
        assertTrue(null == xTestSuiteResult.getEvaluationException());
        assertEquals(XTestState.PASS, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getCases().size());
        assertEquals(0, xTestSuiteResult.getSubSuites().size());

        XTestCaseResult xTestCaseResult = xTestSuiteResult.getCases().get(0);
        assertTrue(null == xTestCaseResult.getEvaluationException());
        assertTrue(null == xTestCaseResult.getAssertException());
        assertEquals(XTestState.PASS, xTestCaseResult.getState());
        assertEquals("suite.tcase", xTestCaseResult.getQualifiedName());
    }

    @Test
    public void throwExceptionBeforeTestSuite() {
        XTestSuiteResult result = XTestRunner.run(
                "println(1/0); xsuite suite {xtest tcase {assert 1/0 throws Exception}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null != result.getEvaluationException());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(0, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
        assertEquals("", result.getQualifiedName());
    }

    @Test
    public void throwExceptionInsideTestSuite() {
        XTestSuiteResult result = XTestRunner.run(
                "xsuite suite {println(1/0); xtest tcase {assert 1/0 throws Exception}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());

        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(1, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
        assertEquals("", result.getQualifiedName());

        XTestSuiteResult xTestSuiteResult = result.getSubSuites().get(0);
        assertTrue(null != xTestSuiteResult.getEvaluationException());
        assertEquals("[]", xTestSuiteResult.getErrorMessages().toString());
        assertTrue(null != xTestSuiteResult.getEvaluationException());

        assertEquals(XTestState.FAIL, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(0, xTestSuiteResult.getCases().size());
        assertEquals(0, xTestSuiteResult.getSubSuites().size());
    }

    @Test
    public void useSUT() {
        XTestSuiteResult result = XTestRunner.run(
                "xsuite suite {xtest tcase {assert new helpers.SUT().get2 == 2}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());

        assertEquals(XTestState.PASS, result.getState());
        assertEquals(1, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
        assertEquals("", result.getQualifiedName());

        XTestSuiteResult xTestSuiteResult = result.getSubSuites().get(0);
        assertTrue(null == xTestSuiteResult.getEvaluationException());
        assertEquals("[]", xTestSuiteResult.getErrorMessages().toString());

        assertEquals(XTestState.PASS, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getCases().size());
        assertEquals(0, xTestSuiteResult.getSubSuites().size());

        XTestCaseResult caseResult = xTestSuiteResult.getCases().get(0);
        assertTrue(null == caseResult.getAssertException());
        assertTrue(null == caseResult.getEvaluationException());
        assertEquals("suite.tcase", caseResult.getQualifiedName());
        assertEquals(XTestState.PASS, caseResult.getState());
    }

    @Test
    public void useSUTFail() {
        XTestSuiteResult result = XTestRunner.run(
                "xsuite suite {xtest tcase {assert new helpers.SUT().get2 == 3}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());

        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(1, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
        assertEquals("", result.getQualifiedName());

        XTestSuiteResult xTestSuiteResult = result.getSubSuites().get(0);
        assertTrue(null == xTestSuiteResult.getEvaluationException());
        assertEquals("[]", xTestSuiteResult.getErrorMessages().toString());

        assertEquals(XTestState.FAIL, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getCases().size());
        assertEquals(0, xTestSuiteResult.getSubSuites().size());

        XTestCaseResult caseResult = xTestSuiteResult.getCases().get(0);
        assertTrue(null != caseResult.getAssertException());
        assertTrue(null == caseResult.getEvaluationException());
        assertEquals("suite.tcase", caseResult.getQualifiedName());
        assertEquals(XTestState.FAIL, caseResult.getState());
    }

    @Test
    public void xsuiteInSuite() {
        XTestSuiteResult result = XTestRunner.run("xsuite suite {1}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.NOT_RUN, result.getState());
        assertEquals(1, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
        assertEquals("", result.getQualifiedName());

        XTestSuiteResult xTestSuiteResult = result.getSubSuites().get(0);
        assertEquals(0, xTestSuiteResult.getCases().size());
        assertEquals(0, xTestSuiteResult.getSubSuites().size());
    }

    @Test
    public void xtestInSuiteInSuite() {
        XTestSuiteResult result = XTestRunner.run("xsuite suite {xtest tcase {1}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
        assertEquals(1, result.getSubSuites().size());
        assertEquals(0, result.getCases().size());
        assertEquals("", result.getQualifiedName());

        XTestSuiteResult xTestSuiteResult = result.getSubSuites().get(0);
        assertEquals(XTestState.PASS, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getCases().size());
        assertEquals(0, xTestSuiteResult.getSubSuites().size());

        XTestCaseResult xTestCaseResult = xTestSuiteResult.getCases().get(0);
        assertEquals(XTestState.PASS, xTestCaseResult.getState());
        assertEquals("suite.tcase", xTestCaseResult.getQualifiedName());
    }
}
