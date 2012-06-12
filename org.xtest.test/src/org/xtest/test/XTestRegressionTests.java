package org.xtest.test;

import org.junit.runner.RunWith;
import org.xtest.junit.RunsXtest;
import org.xtest.junit.XtestJunitRunner;

/**
 * Container for testing bugs found running xtest to prevent regression
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
@RunWith(XtestJunitRunner.class)
@RunsXtest("src/org/xtest/test/RegressionTests.xtest")
public class XTestRegressionTests {
}
