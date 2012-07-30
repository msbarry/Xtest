package org.xtest;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.junit.util.ParseHelper;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.xtest.results.XTestResult;
import org.xtest.xTest.Body;

import com.google.inject.Injector;

/**
 * Static utilities for parsing, validating, and running an Xtest files
 * 
 * @author Michael Barry
 */
public class Xtest {

    /**
     * Links a string into an xtest object model
     * 
     * @param string
     *            String containing the xtest script to run
     * @param injector
     *            The Guice injector to use
     * @return The linked xtest object model
     * @throws Exception
     *             if an error occurs parsing the string
     */
    public static Body parse(String string, Injector injector) throws Exception {
        Body parse = (Body) injector.getInstance(ParseHelper.class).parse(string);
        return parse;
    }

    /**
     * Links a string into an xtest object model using the specified URI in the specified resource
     * set
     * 
     * @param string
     *            String containing the xtest script to run
     * @param uri
     *            The URI to create the resource at
     * @param set
     *            The resource set to create the resource in
     * @param injector
     *            The Guice injector to use
     * @return The linked xtest object model
     * @throws Exception
     *             if an error occurs parsing the string
     */
    public static Body parse(String string, URI uri, ResourceSet set, Injector injector)
            throws Exception {
        Body parse = (Body) injector.getInstance(ParseHelper.class).parse(string, uri, set);
        return parse;
    }

    /**
     * Runs a xtest script object model
     * 
     * @param parse
     *            The parse xtest script object model
     * @param injector
     *            The Guice injector to use
     * @return The test results
     */
    public static XTestResult run(Body parse, Injector injector) {
        XTestResult result;
        try {
            XTestRunner instance = injector.getInstance(XTestRunner.class);
            result = instance.run(parse, RunType.HEAVYWEIGHT, CancelIndicator.NullImpl);
        } catch (Exception e) {
            result = new XTestResult(null);
            result.fail();
        }

        return result;
    }

    /**
     * Runs a xtest script contained inside a string
     * 
     * @param string
     *            string containing the xtest script to run
     * @param injector
     *            The Guice injector to use
     * @return The test results
     */
    public static XTestResult run(String string, Injector injector) {
        XTestResult result;
        try {
            Body parse = parse(string, injector);
            result = run(parse, injector);
        } catch (Exception e) {
            result = new XTestResult(null);
            result.fail();
        }

        return result;
    }

    /**
     * Runs a xtest script contained inside a string at the specified URI in the specified resource
     * set
     * 
     * @param string
     *            string containing the xtest script to run
     * @param uri
     *            The URI to load {@code string} as a resource in
     * @param resourceSet
     *            The resource set to load the resource in
     * @param injector
     *            The Guice injector to use
     * @return The test results
     */
    public static XTestResult run(String string, URI uri, ResourceSet resourceSet, Injector injector) {
        XTestResult result;
        try {
            Body parse = parse(string, uri, resourceSet, injector);
            result = run(parse, injector);
        } catch (Exception e) {
            result = new XTestResult(null);
            result.fail();
        }

        return result;
    }

    /**
     * Return a list of validation issues from validating the Xtest model using the {@link Injector}
     * provided
     * 
     * @param parse
     *            The prased Xtest model
     * @param injector
     *            The {@link Injector} to use
     * @return The list of issues from validating that file
     */
    public static List<Issue> validate(Body parse, Injector injector) {
        IResourceValidator instance = injector.getInstance(IResourceValidator.class);
        Resource eResource = parse.eResource();
        return instance.validate(eResource, XTestRunner.CHECK_BUT_DONT_RUN,
                CancelIndicator.NullImpl);
    }

}
