package org.xtest.test;

import org.junit.runner.RunWith;
import org.xtest.junit.RunsXtest;
import org.xtest.junit.XtestJunitRunner;

/**
 * @author Michael Barry
 */
@RunWith(XtestJunitRunner.class)
@RunsXtest(injector = XtestInjector.class, value = "src/org/xtest/test/Util.xtest")
public class Util {
}
