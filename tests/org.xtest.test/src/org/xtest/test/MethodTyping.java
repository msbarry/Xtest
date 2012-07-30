package org.xtest.test;

import org.junit.runner.RunWith;
import org.xtest.junit.RunsXtest;
import org.xtest.junit.XtestJunitRunner;

/**
 * @author Michael Barry
 */
@RunWith(XtestJunitRunner.class)
@RunsXtest(value="src/org/xtest/test/MethodTyping.xtest", injector=XtestInjector.class)
public class MethodTyping {
}
