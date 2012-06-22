package org.xtest.junit;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;
import org.xtest.XTestRunner;
import org.xtest.XTestStandaloneSetup;
import org.xtest.results.XTestResult;

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
    private static Injector injector = new XTestStandaloneSetup()
            .createInjectorAndDoEMFRegistration();

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
        RunsXtest annotation = clazz.getAnnotation(RunsXtest.class);
        this.file = annotation.value();
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
        StringBuilder builder = new StringBuilder();
        for (String message : errorMessages) {
            if (builder.length() > 0) {
                builder.append("\n");
            }
            builder.append(message);
        }
        Throwable result = new SyntaxError(builder.toString());
        return result;
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

    private XTestResult runTest() throws FileNotFoundException, IOException {
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;
        StringBuilder builder = new StringBuilder();
        while ((line = in.readLine()) != null) {
            if (builder.length() > 0) {
                builder.append('\n');
            }
            builder.append(line);
        }
        in.close();

        // profiling stats
        long start = System.nanoTime();
        XTestResult run = XTestRunner.run(builder.toString(), injector);
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
