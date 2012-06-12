package org.xtest.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ XTestResultUnitTests.class, XTestXBaseRegressionTests.class, AllXtestFiles.class })
public class AllTests {
}
