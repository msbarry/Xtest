package org.xtest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.xbase.XExpression;

import com.google.inject.Injector;

import org.xtest.results.XTestCaseResult;
import org.xtest.results.XTestSuiteResult;
import org.xtest.xTest.XAssertExpression;

/**
 * Entry point for external xtest runner program.
 */
@SuppressWarnings("restriction")
public class Main {

    /**
     * Find the line number and text of the expression provided
     * 
     * @param indent
     *            The indent to insert
     * @param expression
     *            The expression to find
     * @return The line number and text of the expression provided
     */
    private static String getLineNumAndText(String indent,
            XExpression expression) {
        String line = "?";
        if (expression != null) {
            INode parserNode = NodeModelUtils.getNode(expression);
            if (parserNode != null) {
                int startLine = parserNode.getStartLine();
                String text = parserNode.getText().replaceAll("[\n\r]+",
                        "\n" + indent);
                line = Integer.toString(startLine) + ": " + text;
            }
        }
        return line;
    }

    /**
     * Runs a list of xtest scripts
     * 
     * @param args
     *            list of xtest scripts to run
     */
    public static void main(String[] args) {
        Injector injector = new XTestStandaloneSetup()
                .createInjectorAndDoEMFRegistration();
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
                XTestSuiteResult run = XTestRunner.run(builder.toString(),
                        injector);
                printSuite("", run, true);
            } catch (Exception e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    /**
     * Prints a test case result
     * 
     * @param indent
     *            Indent to prepend to printed lines
     * @param tcase
     *            Test case result to print
     */
    private static void printCase(String indent, XTestCaseResult tcase) {
        switch (tcase.getState()) {
        case FAIL:
            System.out.println(indent + "=NG " + tcase.getQualifiedName());
            XTestAssertException assertException = tcase.getAssertException();
            XTestEvaluationException evaluationException = tcase
                    .getEvaluationException();
            if (assertException != null) {
                XAssertExpression expression = assertException.getExpression();
                String line = getLineNumAndText(indent, expression);
                System.out.println(indent + "    Assertion failed on line "
                        + line);
            } else if (evaluationException != null) {
                printEvaluationException(indent, evaluationException);
            }
            break;
        case PASS:
            System.out.println(indent + "=OK " + tcase.getQualifiedName());
            break;
        default:
            break;
        }
    }

    /**
     * Prints the cases and suites for the test suite result provided.
     * 
     * @param indent
     *            Indent to prepend to printed lines
     * @param suite
     *            The test suite results to print
     */
    private static void printChildrenOfSuite(String indent,
            XTestSuiteResult suite) {
        for (XTestCaseResult caseResult : suite.getCases()) {
            printCase(indent + "   ", caseResult);
        }
        for (XTestSuiteResult subSuite : suite.getSubSuites()) {
            printSuite(indent + "   ", subSuite, false);
        }
    }

    /**
     * Prints the line number, expression, and stack trace of an evaluation
     * exception that occurred
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
     * Prints the results from the test suite
     * 
     * @param indent
     *            The indent to prepend to printed lines
     * @param suite
     *            The test suite results to print
     * @param forcePrintChildren
     *            True to force printing all children, false to just print
     *            success for the top-level if it passes.
     */
    private static void printSuite(String indent, XTestSuiteResult suite,
            boolean forcePrintChildren) {
        switch (suite.getState()) {
        case FAIL:
            if (!forcePrintChildren) {
                System.out.println(indent + "+NG " + suite.getQualifiedName());
            }
            XTestEvaluationException evaluationException = suite
                    .getEvaluationException();
            List<String> errorMessages = suite.getErrorMessages();
            if (!errorMessages.isEmpty()) {
                System.out.println(indent
                        + "   Couldn't run because of syntax errors:");
                for (String message : errorMessages) {
                    System.out.println(indent + "   " + message);
                }
            }
            if (evaluationException != null) {
                printEvaluationException(indent + "   ", evaluationException);
            }
            printChildrenOfSuite(indent, suite);
            break;
        case PASS:
            if (forcePrintChildren) {
                printChildrenOfSuite(indent, suite);
            } else {
                System.out.println(indent + "+OK " + suite.getQualifiedName());
            }
            break;
        default:
            break;
        }
    }
}
