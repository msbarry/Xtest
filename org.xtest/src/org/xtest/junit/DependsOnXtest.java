package org.xtest.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation to tell {@link XtestJunitRunner} what Xtest files a test depends on to run.
 * 
 * Points to classes that are annotated with a {@link RunsXtest} annotation for the dependency.
 * 
 * @author Michael Barry
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface DependsOnXtest {
    /**
     * Returns the Junit runners for Xtest files that this Xtest file depends on.
     * 
     * @return name of Junit runner for Xtest files that this Xtest file depends on.
     */
    Class<?>[] value();
}
