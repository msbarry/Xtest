package org.xtest.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ XTestResultUnitTests.class, XTestRunnerUnitTests.class, XTestRegressionTests.class,
        XtestOrganizeImportsTest.class, NestedExceptions.class, StackTraces.class,
        MethodValidation.class, MethodInvocation.class, MethodTyping.class, Util.class })
public class AllXtestFiles {

}
