package org.xtest.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ XTestResultUnitTests.class, XTestXBaseRegressionTests.class,
        XTestRunnerUnitTests.class, XTestRegressionTests.class })
public class AllTests {

}
