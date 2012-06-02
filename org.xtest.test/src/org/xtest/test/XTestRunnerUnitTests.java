package org.xtest.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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

    protected static void assertXtestPasses(String test) {
        XTestResult result = XTestRunner.run(test, injector);
        assertEquals("[]", result.getErrorMessages().toString());
        assertTrue(result.getEvaluationException().isEmpty());
        assertEquals(XTestState.PASS, result.getState());
    }

    protected static void assertXtestPreEvalFailure(String test) {
        XTestResult result = XTestRunner.run(test, injector);
        assertTrue(!"[]".equals(result.getErrorMessages().toString()));
        assertEquals(XTestState.FAIL, result.getState());
    }

    @Test
    public void runXTest() throws IOException {
        // TODO Get rid of this, eventually wean off of Junit tests
        BufferedReader in = new BufferedReader(new FileReader(
                "src/org/xtest/test/RunnerTests.xtest"));
        String line;
        StringBuilder builder = new StringBuilder();
        while ((line = in.readLine()) != null) {
            if (builder.length() > 0) {
                builder.append('\n');
            }
            builder.append(line);
        }
        in.close();
        XTestResult run = XTestRunner.run(builder.toString(), XtestInjector.injector);
        assertEquals(XTestState.PASS, run.getState());
    }
}
