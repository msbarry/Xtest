package org.xtest.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ResultTests.class, RunnerTests.class, RegressionTests.class,
        OrganizeImportsTest.class, NestedExceptions.class, StackTraces.class,
        MethodValidation.class, MethodInvocation.class, MethodTyping.class, Util.class,
        StatusBar.class, AssertionMessages.class })
public class AllXtestFiles {

}
