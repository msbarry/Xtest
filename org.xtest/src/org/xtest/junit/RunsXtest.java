package org.xtest.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to tell {@link XtestJunitRunner} what file to find the appropriate xtest file to run
 * in
 * 
 * @author Michael Barry
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface RunsXtest {
    /**
     * Returns the name of the file to run
     * 
     * @return name of the file to run
     */
    String value();
}
