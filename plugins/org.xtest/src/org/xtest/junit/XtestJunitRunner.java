package org.xtest.junit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.validation.Issue;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.xtest.Xtest;
import org.xtest.results.XTestResult;
import org.xtest.results.XTestState;
import org.xtest.xTest.Body;

import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;
import com.google.inject.Injector;

/**
 * Custom Junit runner to report results of invoking an Xtest file
 * 
 * @author Michael Barry
 */
public class XtestJunitRunner extends Runner {
    private static double cumulative = 0.0;

    /**
     * Returns the cumulative time spent running xtest files throughout the lifetime of this class
     * 
     * @return The cumulative time spent running xtest files
     */
    public static double getCumulative() {
        return cumulative;
    }

    private final Class<?> clazz;
    private final String file;
    private final Injector injector;

    private final Set<String> names = Sets.newHashSet();
    private Throwable preEvalException = null;

    private XTestResult run;
    private Description top;

    /**
     * Constructor for Junit
     * 
     * @param clazz
     *            The Xtest-invoking test class
     */
    public XtestJunitRunner(Class<?> clazz) {
        file = getXtestFile(clazz);
        injector = getInjector(clazz);
        this.clazz = clazz;
    }

    @Override
    public Description getDescription() {
        // TODO link descriptions and exceptions to actual files
        if (top == null) {
            top = Description.createSuiteDescription(clazz);
            try {
                // TODO can run() dynamically add descriptions as it runs the tests? If so move
                // running out of this step
                run = runTest();
                if (run.getErrorMessages().isEmpty()) {
                    mark(run, top);
                } else {
                    preEvalException = exceptionForSyntaxErrors(run.getErrorMessages());
                }
            } catch (FileNotFoundException e) {
                preEvalException = e;
            } catch (IOException e) {
                preEvalException = e;
            }
        }
        return top;
    }

    @Override
    public void run(RunNotifier notifier) {
        if (preEvalException != null) {
            notifier.fireTestStarted(top);
            notifier.fireTestFailure(new Failure(top, preEvalException));
        } else {
            markTest(notifier, run, top);
        }
    }

    private Description createDescription(XTestResult result) {
        String name = uniqueName(result.getName());
        return result.getSubTests().isEmpty() ? Description.createTestDescription(clazz, name)
                : Description.createSuiteDescription(name);
    }

    private Throwable exceptionForSyntaxErrors(List<String> errorMessages) {
        StringBuilder builder = new StringBuilder("Validation errors occurred before running test:");
        for (String message : errorMessages) {
            builder.append('\n');
            builder.append(message);
        }
        Throwable result = new SyntaxError(builder.toString());
        return result;
    }

    private Injector getInjector(Class<?> clazz) {
        RunsXtest annotation = clazz.getAnnotation(RunsXtest.class);
        Injector injector = null;
        if (annotation != null) {
            Class<? extends InjectorProvider> injectorClass = annotation.injector();
            InjectorProvider newInstance;
            try {
                newInstance = injectorClass.newInstance();
                injector = newInstance.getInjector();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return injector;
    }

    private Set<Class<?>> getRunnerDependencies(Class<?> xtestRunner) {
        DependsOnXtest annotation = xtestRunner.getAnnotation(DependsOnXtest.class);
        Set<Class<?>> classes = Sets.newHashSet();
        if (annotation != null) {
            Class<?>[] value = annotation.value();
            classes = Sets.newHashSet(value);
        }
        return classes;
    }

    private String getXtestFile(Class<?> clazz) {
        RunsXtest annotation = clazz.getAnnotation(RunsXtest.class);
        return annotation == null ? null : annotation.value();
    }

    private void mark(XTestResult run2, Description top) {
        List<XTestResult> subTests = run2.getSubTests();
        for (XTestResult result : subTests) {
            Description next = createDescription(result);
            top.addChild(next);
            mark(result, next);
        }
    }

    private void markTest(RunNotifier notifier, XTestResult run2, Description top2) {
        notifier.fireTestStarted(top2);
        for (int i = 0; i < run2.getSubTests().size() && i < top2.getChildren().size(); i++) {
            markTest(notifier, run2.getSubTests().get(i), top2.getChildren().get(i));
        }
        if (!run2.getEvaluationException().isEmpty()) {
            Throwable first = Iterables.getFirst(run2.getEvaluationException(), null).getCause();
            notifier.fireTestFailure(new Failure(top2, first));
        } else {
            notifier.fireTestFinished(top2);
        }
    }

    private void parseDependencies(Class<?> xtestRunner, ResourceSet set, Set<Class<?>> visited)
            throws FileNotFoundException, IOException {
        if (!visited.contains(xtestRunner)) {
            Set<Class<?>> classes = getRunnerDependencies(xtestRunner);
            for (Class<?> dependency : classes) {
                String file = getXtestFile(dependency);
                if (file != null) {
                    String fileDependedOn = readFile(file);
                    try {
                        Xtest.parse(fileDependedOn, URI.createURI(file), set, injector);
                    } catch (Exception e) {
                    }
                }
                parseDependencies(dependency, set, visited);
            }
            visited.add(xtestRunner);
        }
    }

    private String readFile(String file) throws FileNotFoundException, IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));
        StringBuilder builder = new StringBuilder();
        try {
            String line;
            while ((line = in.readLine()) != null) {
                if (builder.length() > 0) {
                    builder.append('\n');
                }
                builder.append(line);
            }
        } finally {
            in.close();
        }
        return builder.toString();
    }

    private XTestResult runTest() throws FileNotFoundException, IOException {
        String fileBeingRun = readFile(file);

        ResourceSet set = injector.getInstance(XtextResourceSet.class);
        Class<?> claz = clazz;

        HashSet<Class<?>> visited = Sets.newHashSet();

        parseDependencies(claz, set, visited);

        // profiling stats
        long start = System.nanoTime();
        XTestResult run = null;
        try {
            Body parse = Xtest.parse(fileBeingRun, URI.createURI(file), set, injector);
            run = new XTestResult(parse);
            List<Issue> validate = Xtest.validate(parse, injector);
            for (Issue issue : validate) {
                if (issue.getSeverity() == Severity.ERROR) {
                    run.addSyntaxError(issue.getLineNumber() + ": " + issue.getMessage());
                }
            }
            if (run.getState() != XTestState.FAIL) {
                run = Xtest.run(parse, injector);
            }
        } catch (Exception e) {
        }

        long end = System.nanoTime();
        double d = (end - start) / (double) TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS);
        cumulative += d;
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.println(decimalFormat.format(d) + "s " + file.replaceAll("^.*/", ""));
        return run;
    }

    private String uniqueName(String name) {
        if (names.contains(name)) {
            String newName;
            int i = 2;
            do {
                newName = name + "-" + i++;
            } while (names.contains(newName));
            name = newName;
        }
        names.add(name);
        return name;
    }

    /**
     * Dummy exception for wrapping an Xtest file syntax error to point Junit to
     * 
     * @author Michael Barry
     */
    private static class SyntaxError extends Exception {

        /**
         * Serial version UID
         */
        private static final long serialVersionUID = 7636482455156418516L;

        public SyntaxError(String string) {
            super(string);
            setStackTrace(new StackTraceElement[0]);
        }

    }
}
