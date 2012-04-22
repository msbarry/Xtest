package org.xtest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collection;
import java.util.List;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XExpression;
import org.xtest.results.XTestResult;
import org.xtest.xTest.XAssertExpression;

import com.google.inject.Injector;

/**
 * 
 * Entry point for external xtest runner program
 * 
 * @author Michael Barry
 */
@SuppressWarnings("restriction")
public class Main {

    /**
     * Runs a list of xtest scripts
     * 
     * @param args
     *            list of xtest scripts to run
     */
    public static void main(String[] args) {
        Injector injector = new XTestStandaloneSetup().createInjectorAndDoEMFRegistration();
        for (String arg : args) {
            try {
                BufferedReader in = new BufferedReader(new FileReader(arg));
                String line;
                StringBuilder builder = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    if (builder.length() > 0) {
                        builder.append('\n');
                    }
                    builder.append(line);
                }
                in.close();

                System.out.println("Tests from " + arg + ":");
                XTestResult run = XTestRunner.run(builder.toString(), injector);
                printTest("", run, true);
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    /**
     * Find the line number and text of the expression provided
     * 
     * @param indent
     *            The indent to insert
     * @param expression
     *            The expression to find
     * @return The line number and text of the expression provided
     */
    private static String getLineNumAndText(String indent, XExpression expression) {
        String line = "?";
        if (expression != null) {
            INode parserNode = NodeModelUtils.getNode(expression);
            if (parserNode != null) {
                int startLine = parserNode.getStartLine();
                String text = parserNode.getText().replaceAll("[\n\r]+", "\n" + indent);
                line = Integer.toString(startLine) + ": " + text;
            }
        }
        return line;
    }

    /**
     * Prints the subtest results of the test result provided.
     * 
     * @param indent
     *            Indent to prepend to printed lines
     * @param test
     *            The test results to print
     */
    private static void printChildrenOfTest(String indent, XTestResult test) {
        for (XTestResult subTest : test.getSubTests()) {
            printTest(indent + "   ", subTest, false);
        }
    }

    /**
     * Prints the line number, expression, and stack trace of an evaluation exception that occurred
     * 
     * @param indent
     *            Indent to prepend to printed lines
     * @param evaluationException
     *            The exception to prin
     */
    private static void printEvaluationException(String indent,
            XTestEvaluationException evaluationException) {
        XExpression expression = evaluationException.getExpression();
        String line = getLineNumAndText(indent, expression);
        System.out.println(indent + "Exception thrown at line " + line);
        System.out.println(indent + evaluationException.toString());
        int lineNum = 0;
        Throwable toPrint = evaluationException;
        while (toPrint.getCause() != null) {
            toPrint = toPrint.getCause();
        }
        for (StackTraceElement element : toPrint.getStackTrace()) {
            if (lineNum++ > 4) {
                System.out.println(indent + "...");
                break;
            }
            System.out.println(indent + element);
        }
    }

    /**
     * Prints the results from the test
     * 
     * @param indent
     *            The indent to prepend to printed lines
     * @param test
     *            The test results to print
     * @param forcePrintChildren
     *            True to force printing all children, false to just print success for the top-level
     *            if it passes.
     */
    private static void printTest(String indent, XTestResult test, boolean forcePrintChildren) {
        switch (test.getState()) {
        case FAIL:
            if (!forcePrintChildren) {
                System.out.println(indent + "+NG " + test.getQualifiedName());
            }
            XTestEvaluationException evaluationException = test.getEvaluationException();
            List<String> errorMessages = test.getErrorMessages();
            Collection<XAssertExpression> assertExceptions = test.getAssertExceptions();
            if (!errorMessages.isEmpty()) {
                System.out.println(indent + "   Couldn't run because of syntax errors:");
                for (String message : errorMessages) {
                    System.out.println(indent + "   " + message);
                }
            } else if (!assertExceptions.isEmpty()) {
                for (XAssertExpression expression : assertExceptions) {
                    String line = getLineNumAndText(indent, expression);
                    System.out.println(indent + "    Assertion failed on line " + line);
                }
            } else if (evaluationException != null) {
                printEvaluationException(indent, evaluationException);
            }
            printChildrenOfTest(indent, test);
            break;
        case PASS:
            if (forcePrintChildren) {
                printChildrenOfTest(indent, test);
            } else {
                System.out.println(indent + "+OK " + test.getQualifiedName());
            }
            break;
        default:
            break;
        }
    }
}
