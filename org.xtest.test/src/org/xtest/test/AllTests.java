package org.xtest.test;

import java.text.DecimalFormat;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.xtest.junit.XtestJunitRunner;

@RunWith(Suite.class)
@SuiteClasses({ AllXtestFiles.class, XTestXBaseRegressionTests.class })
public class AllTests {
    private static long start;

    @BeforeClass
    public static void before() {
        start = System.nanoTime();
    }

    @AfterClass
    public static void reportTime() {
        long end = System.nanoTime();
        double d = (end - start) / (double) TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS);
        d += XtestJunitRunner.getCumulative();
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println("\n\nAll Tests\n------------\n" + decimalFormat.format(d) + "s");
    }

}
