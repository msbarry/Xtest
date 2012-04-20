package org.xtest.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.xtest.XTestRunner;
import org.xtest.results.XTestResult;
import org.xtest.results.XTestState;

import com.google.inject.Injector;

/**
 * Container for unit tests of xtest string to result model runner
 * 
 * @author Michael Barry
 */
public class XTestRunnerUnitTests {
    private static Injector injector = XtestInjector.injector;

    @Test
    public void testCaseInAssert() {
        XTestResult result = XTestRunner.run(
                "assert {if (0 == 1) true else {xtest b {assert false}\n true}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(1, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());

        XTestResult xTestSuiteResult = result.getSubTests().get(0);
        assertTrue(null == xTestSuiteResult.getEvaluationException());
        assertEquals(XTestState.FAIL, xTestSuiteResult.getState());
        assertEquals("b", xTestSuiteResult.getQualifiedName());
        assertEquals(0, xTestSuiteResult.getSubTests().size());
    }

    @Test
    public void testEmptyTestCase() {
        XTestResult result = XTestRunner.run("", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
        assertEquals(0, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());
    }

    @Test
    public void testExceptionInCaseInSuiteInSuite() {
        XTestResult result = XTestRunner.run("xsuite suite {xtest tcase {print(1/0)}}", injector);
        assertTrue(null == result.getEvaluationException());
        assertEquals("[]", result.getErrorMessages().toString());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(1, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());

        XTestResult xTestSuiteResult = result.getSubTests().get(0);
        assertEquals(XTestState.FAIL, xTestSuiteResult.getState());
        assertTrue(null == xTestSuiteResult.getEvaluationException());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getSubTests().size());

        XTestResult xTestCaseResult = xTestSuiteResult.getSubTests().get(0);
        assertTrue(null != xTestCaseResult.getEvaluationException());
        assertEquals(XTestState.FAIL, xTestCaseResult.getState());
        assertEquals("suite.tcase", xTestCaseResult.getQualifiedName());
    }

    @Test
    public void testExtensionImport() {
        assertXtestPasses("import static extension helpers.ExtensionMethods.*\nassert 1.incr == 2");
    }

    @Test
    public void testExtensionImportBad() {
        assertXtestPreEvalFailure("import static helpers.ExtensionMethods.*\nassert 1.incr == 2");
    }

    @Test
    public void testFalseAssertInCaseInSuiteInSuite() {
        XTestResult result = XTestRunner.run("xsuite suite {xtest tcase {assert 0==1}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(1, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());

        XTestResult xTestSuiteResult = result.getSubTests().get(0);
        assertEquals(XTestState.FAIL, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getSubTests().size());

        XTestResult xTestCaseResult = xTestSuiteResult.getSubTests().get(0);
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
    public void testImportStatic_innerStaticClassWildcard() {
        assertXtestPasses("import static helpers.SUT$InnerClass.*\nxsuite suite {xtest tcase {assert innerField==1}}");
        assertXtestPasses("import static helpers.SUT$InnerClass.*\nxsuite suite {xtest tcase {assert getStatic==1}}");
        // Try to use nonstatic
        assertXtestPreEvalFailure("import static helpers.SUT$InnerClass.*\nxsuite suite {xtest tcase {assert getNonStatic==1}}");
        assertXtestPreEvalFailure("import static helpers.SUT$InnerClass.*\nxsuite suite {xtest tcase {assert nonStaticField==1}}");
    }

    @Test
    public void testImportStatic_type_shouldfail() {
        XTestResult result = XTestRunner.run(
                "import static helpers.SUT\nxsuite suite {xtest tcase {assert getStatic==2}}",
                injector);
        assertTrue(!"[]".equals(result.getErrorMessages().toString()));
        assertEquals(XTestState.FAIL, result.getState());
    }

    @Test
    public void testImportStatic_wildcard_shouldPass() {
        XTestResult result = XTestRunner.run(
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
        XTestResult result = XTestRunner.run("testSui", injector);
        assertEquals(1, result.getErrorMessages().size());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(0, result.getSubTests().size());
        assertEquals(0, result.getSubTests().size());
    }

    @Test
    public void testPrivateFieldAccessible() {
        assertXtestPasses("import helpers.*\nxsuite suite {val a = new PrivateMembers()\n"
                + "xtest tcase {a.i = 2\nassert a.i == 2}}");
    }

    @Test
    public void testPrivateInnerClassAccessible() {
        assertXtestPasses("import helpers.*\nxsuite suite {val a = new PrivateMembers$Inner()\n"
                + "xtest tcase {assert a.c == 9}}");
    }

    @Test
    public void testPrivateMethodSugared() {
        assertXtestPasses("import helpers.*\nxsuite suite {val a = new PrivateMembers()\n"
                + "xtest tcase {a.c = 2\nassert a.c == 1}}");
    }

    @Test
    public void testReturnDoesntFail() {
        XTestResult result = XTestRunner.run("xtest test {\nreturn 1\n}", injector);
        assertTrue(null == result.getEvaluationException());
        assertEquals("[]", result.getErrorMessages().toString());
        assertEquals(XTestState.PASS, result.getState());
    }

    @Test
    public void testReturnStopsLaterTests() {
        XTestResult result = XTestRunner.run("xtest test {\nif (1==1)return 1\nassert 1==0\n}",
                injector);
        assertTrue(null == result.getEvaluationException());
        assertEquals("[]", result.getErrorMessages().toString());
        assertEquals(XTestState.PASS, result.getState());
    }

    @Test
    public void testStaticMemberImportedWrite() {
        assertXtestPasses("import helpers.*\nxsuite suite {StaticMembers::pub := 10\n"
                + "xtest tcase {assert StaticMembers::pub == 10}}");
    }

    @Test
    public void testStaticMemberTypeImportedWrite() {
        assertXtestPasses("import static helpers.StaticMembers.*\nxsuite suite {pub := 11\n"
                + "xtest tcase {assert pub == 11}}");
    }

    @Test
    public void testStaticMemberWrite() {
        assertXtestPasses("xsuite suite {helpers::StaticMembers::pub := 12\n"
                + "xtest tcase {assert helpers::StaticMembers::pub == 12}}");
    }

    @Test
    public void testTestInTestPasses() {
        XTestResult result = XTestRunner.run("xtest toplevel {xtest inside {assert 1 == 1}}",
                injector);
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
    }

    @Test
    public void testThrowDivByZeroException() {
        XTestResult result = XTestRunner.run(
                "xsuite suite {xtest tcase {assert 1/0 throws Exception}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
        assertEquals(1, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());

        XTestResult xTestSuiteResult = result.getSubTests().get(0);
        assertEquals(XTestState.PASS, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getSubTests().size());

        XTestResult xTestCaseResult = xTestSuiteResult.getSubTests().get(0);
        assertEquals(XTestState.PASS, xTestCaseResult.getState());
        assertEquals("suite.tcase", xTestCaseResult.getQualifiedName());
        assertTrue(null == xTestCaseResult.getEvaluationException());
    }

    @Test
    public void testThrowException() {
        XTestResult result = XTestRunner
                .run("xsuite suite {xtest tcase {assert throw new InterruptedException() throws InterruptedException}}",
                        injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
        assertEquals(1, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());

        XTestResult xTestSuiteResult = result.getSubTests().get(0);
        assertEquals(XTestState.PASS, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getSubTests().size());

        XTestResult xTestCaseResult = xTestSuiteResult.getSubTests().get(0);
        assertEquals(XTestState.PASS, xTestCaseResult.getState());
        assertEquals("suite.tcase", xTestCaseResult.getQualifiedName());
    }

    @Test
    public void testThrowsWrongException() {
        XTestResult result = XTestRunner
                .run("xsuite suite {xtest tcase {assert throw new InterruptedException() throws IllegalArgumentException}}",
                        injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(1, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());

        XTestResult xTestSuiteResult = result.getSubTests().get(0);
        assertEquals(XTestState.FAIL, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getSubTests().size());

        XTestResult xTestCaseResult = xTestSuiteResult.getSubTests().get(0);
        assertEquals(XTestState.FAIL, xTestCaseResult.getState());
        assertEquals("suite.tcase", xTestCaseResult.getQualifiedName());
    }

    @Test
    public void testTopLevelAssert() {
        XTestResult result = XTestRunner.run("assert false", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertTrue(null != result.getAssertException());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(0, result.getSubTests().size());
    }

    @Test
    public void testTopLevelTestCaseFails() {
        XTestResult result = XTestRunner.run("xtest toplevel {\nassert 1!=1\n}", injector);
        assertTrue(null == result.getEvaluationException());
        assertEquals("[]", result.getErrorMessages().toString());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(1, result.getSubTests().size());
    }

    @Test
    public void testTopLevelTestCasePasses() {
        XTestResult result = XTestRunner.run("xtest toplevel {\nassert 1==1\n}", injector);
        assertTrue(null == result.getEvaluationException());
        assertEquals("[]", result.getErrorMessages().toString());
        assertEquals(XTestState.PASS, result.getState());
        assertEquals(1, result.getSubTests().size());
    }

    @Test
    public void testTrueAssertInCaseInSuiteInSuite() {
        XTestResult result = XTestRunner.run("xsuite suite {xtest tcase {assert 1==1}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
        assertEquals(1, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());

        XTestResult xTestSuiteResult = result.getSubTests().get(0);
        assertTrue(null == xTestSuiteResult.getEvaluationException());
        assertEquals(XTestState.PASS, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getSubTests().size());

        XTestResult xTestCaseResult = xTestSuiteResult.getSubTests().get(0);
        assertTrue(null == xTestCaseResult.getEvaluationException());
        assertTrue(null == xTestCaseResult.getAssertException());
        assertEquals(XTestState.PASS, xTestCaseResult.getState());
        assertEquals("suite.tcase", xTestCaseResult.getQualifiedName());
    }

    @Test
    public void testWarningIsOk() {
        XTestResult result = XTestRunner.run("val a = 1", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertEquals(XTestState.PASS, result.getState());
    }

    @Test
    public void throwExceptionBeforeTestSuite() {
        XTestResult result = XTestRunner.run(
                "println(1/0); xsuite suite {xtest tcase {assert 1/0 throws Exception}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null != result.getEvaluationException());
        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(0, result.getSubTests().size());
        assertEquals(0, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());
    }

    @Test
    public void throwExceptionInsideTestSuite() {
        XTestResult result = XTestRunner.run(
                "xsuite suite {println(1/0); xtest tcase {assert 1/0 throws Exception}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());

        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(1, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());

        XTestResult xTestSuiteResult = result.getSubTests().get(0);
        assertTrue(null != xTestSuiteResult.getEvaluationException());
        assertEquals("[]", xTestSuiteResult.getErrorMessages().toString());
        assertTrue(null != xTestSuiteResult.getEvaluationException());

        assertEquals(XTestState.FAIL, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(0, xTestSuiteResult.getSubTests().size());
    }

    @Test
    public void useSUT() {
        XTestResult result = XTestRunner.run(
                "xsuite suite {xtest tcase {assert new helpers.SUT().get2 == 2}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());

        assertEquals(XTestState.PASS, result.getState());
        assertEquals(1, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());

        XTestResult xTestSuiteResult = result.getSubTests().get(0);
        assertTrue(null == xTestSuiteResult.getEvaluationException());
        assertEquals("[]", xTestSuiteResult.getErrorMessages().toString());

        assertEquals(XTestState.PASS, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getSubTests().size());

        XTestResult caseResult = xTestSuiteResult.getSubTests().get(0);
        assertTrue(null == caseResult.getAssertException());
        assertTrue(null == caseResult.getEvaluationException());
        assertEquals("suite.tcase", caseResult.getQualifiedName());
        assertEquals(XTestState.PASS, caseResult.getState());
    }

    @Test
    public void useSUTFail() {
        XTestResult result = XTestRunner.run(
                "xsuite suite {xtest tcase {assert new helpers.SUT().get2 == 3}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());

        assertEquals(XTestState.FAIL, result.getState());
        assertEquals(1, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());

        XTestResult xTestSuiteResult = result.getSubTests().get(0);
        assertTrue(null == xTestSuiteResult.getEvaluationException());
        assertEquals("[]", xTestSuiteResult.getErrorMessages().toString());

        assertEquals(XTestState.FAIL, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getSubTests().size());

        XTestResult caseResult = xTestSuiteResult.getSubTests().get(0);
        assertTrue(null != caseResult.getAssertException());
        assertTrue(null == caseResult.getEvaluationException());
        assertEquals("suite.tcase", caseResult.getQualifiedName());
        assertEquals(XTestState.FAIL, caseResult.getState());
    }

    @Test
    public void xsuiteInSuite() {
        XTestResult result = XTestRunner.run("xsuite suite {1}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
        assertEquals(1, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());

        XTestResult xTestSuiteResult = result.getSubTests().get(0);
        assertEquals(0, xTestSuiteResult.getSubTests().size());
    }

    @Test
    public void xtestInSuiteInSuite() {
        XTestResult result = XTestRunner.run("xsuite suite {xtest tcase {1}}", injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
        assertEquals(1, result.getSubTests().size());
        assertEquals("", result.getQualifiedName());

        XTestResult xTestSuiteResult = result.getSubTests().get(0);
        assertEquals(XTestState.PASS, xTestSuiteResult.getState());
        assertEquals("suite", xTestSuiteResult.getQualifiedName());
        assertEquals(1, xTestSuiteResult.getSubTests().size());

        XTestResult xTestCaseResult = xTestSuiteResult.getSubTests().get(0);
        assertEquals(XTestState.PASS, xTestCaseResult.getState());
        assertEquals("suite.tcase", xTestCaseResult.getQualifiedName());
    }

    protected void assertXtestPasses(String test) {
        XTestResult result = XTestRunner.run(test, injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(null == result.getEvaluationException());
        assertEquals(XTestState.PASS, result.getState());
    }

    protected void assertXtestPreEvalFailure(String test) {
        XTestResult result = XTestRunner.run(test, injector);
        assertTrue(!"[]".equals(result.getErrorMessages().toString()));
        assertEquals(XTestState.FAIL, result.getState());
    }
}
