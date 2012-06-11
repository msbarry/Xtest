package org.xtest.test;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;
import org.xtest.XTestRunner;
import org.xtest.results.XTestResult;
import org.xtest.results.XTestState;

/**
 * Container for unit tests of the non-EMF xtest result model (org.xtest.results.*)
 * 
 * @author Michael Barry
 */
public class StackTraces {

    @Test
    public void runXTest() throws IOException {
        // TODO Get rid of this, eventually wean off of Junit tests
        BufferedReader in = new BufferedReader(new FileReader(
                "src/org/xtest/test/StackTraces.xtest"));
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
