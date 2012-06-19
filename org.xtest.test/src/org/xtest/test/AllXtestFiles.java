package org.xtest.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ XTestRunnerUnitTests.class, XTestRegressionTests.class,
        XtestOrganizeImportsTest.class, Closures.class, StackTraces.class, Methods.class,
        Util.class })
public class AllXtestFiles {

}
