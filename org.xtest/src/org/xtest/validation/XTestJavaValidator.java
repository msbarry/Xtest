package org.xtest.validation;

import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CancelableDiagnostician;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.xtest.XTestAssertException;
import org.xtest.XTestEvaluationException;
import org.xtest.XTestRunner;
import org.xtest.XTestRunner.DontRunCheck;
import org.xtest.results.AbstractXTestResult;
import org.xtest.results.XTestCaseResult;
import org.xtest.results.XTestSuiteResult;
import org.xtest.xTest.Body;
import org.xtest.xTest.XAssertExpression;
import org.xtest.xTest.XTestCase;
import org.xtest.xTest.XTestPackage;
import org.xtest.xTest.XTestSuite;
import org.xtest.xTest.impl.BodyImplCustom;

import com.google.common.collect.HashMultimap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Validator for xtest expression models. Validates that:
 * <ul>
 * <li>asserts are inside cases
 * <li>cases are inside suites
 * <li>assert expressions have boolean return type
 * <li>assert/throws types are subclasses are throwable
 * <li><b>All unit tests pass</b> </ol>
 * 
 * @author Michael Barry
 */
@Singleton
@SuppressWarnings("restriction")
public class XTestJavaValidator extends AbstractXTestJavaValidator {
    private static final int TEST_RUN_FAILURE_INDEX = Integer.MIN_VALUE;
    private final Map<Thread, CancelIndicator> cancelIndicators = Collections
            .synchronizedMap(new WeakHashMap<Thread, CancelIndicator>());
    @Inject
    private XTestRunner runner;
    @Inject
    private TypeConformanceComputer typeConformanceComputer;
    @Inject
    private ITypeProvider typeProvider;
    @Inject
    private TypeReferences typeReferences;

    /**
     * Verifies that the "throws" type is a subclass of throwable or that the assert expression has
     * boolean return type.
     * 
     * @param assertExpression
     *            The assert expression to check
     */
    @Check
    public void checkAssertExpression(XAssertExpression assertExpression) {
        JvmTypeReference throws1 = assertExpression.getThrows();
        if (throws1 != null) {
            JvmTypeReference expected = typeReferences.getTypeForName(Throwable.class,
                    assertExpression);
            if (!typeConformanceComputer.isConformant(expected, throws1)) {
                error("Throws expression must be a subclass of Throwable",
                        XTestPackage.Literals.XASSERT_EXPRESSION__THROWS);
            }
        } else {
            XExpression actual = assertExpression.getActual();
            if (actual != null) {
                JvmTypeReference returnType = typeProvider.getCommonReturnType(actual, true);
                JvmTypeReference expected = typeReferences.getTypeForName(Boolean.class,
                        assertExpression);

                if (!typeConformanceComputer.isConformant(expected, returnType)) {
                    error("Assert expression must return a boolean",
                            XTestPackage.Literals.XASSERT_EXPRESSION__ACTUAL);
                }
            }
        }
    }

    /**
     * Verifies that an assert is inside a test case
     * 
     * @param assertExpression
     *            The assert expression to check
     */
    @Check
    public void checkAssertIsInXTestCase(XAssertExpression assertExpression) {
        if (!checkContainedWithin(assertExpression, XTestCase.class)) {
            error("Assert can only be placed inside a test case", null);
        }
    }

    @Override
    @Check
    public void checkAssignment(XAssignment assignment) {
        JvmIdentifiableElement assignmentFeature = assignment.getFeature();
        if (!(assignmentFeature instanceof JvmField && ((JvmField) assignmentFeature).isFinal())) {
            super.checkAssignment(assignment);
        }
    }

    /**
     * Checks that the test suite is not contained within a test case
     * 
     * @param testCase
     *            The test case to check
     */
    @Check
    public void checkXTestSuiteNotInXTestSuite(XTestCase testCase) {
        if (checkContainedWithin(testCase, XTestCase.class)) {
            error("Test case cannot be placed inside a test case", null);
        }
    }

    /**
     * Checks that the test suite is not contained within a test case
     * 
     * @param testSuite
     *            The test suite to check
     */
    @Check
    public void checkXTestSuiteNotInXTestSuite(XTestSuite testSuite) {
        if (checkContainedWithin(testSuite, XTestCase.class)) {
            error("Test suite cannot be placed inside a test case", null);
        }
    }

    /**
     * Runs the unit test as long as the {@link CheckType} is not {@link DontRunCheck} and marks any
     * failed expressions.
     * 
     * @param main
     *            The xtest expression model to run.
     */
    @Check(CheckType.FAST)
    public void doMagic(Body main) {
        if (!(getCheckMode() instanceof XTestRunner.DontRunCheck)) {
            CancelIndicator indicator = cancelIndicators.get(Thread.currentThread());
            if (indicator == null) {
                indicator = CancelIndicator.NullImpl;
            }
            XTestSuiteResult run = runner.run(main, indicator);
            markErrorsFromSuite(run);
            if (main instanceof BodyImplCustom) {
                BodyImplCustom custom = (BodyImplCustom) main;
                custom.setResult(run);
            }
        }
    }

    @Override
    protected Diagnostic createDiagnostic(Severity severity, String message, EObject object,
            EStructuralFeature feature, int index, String code, String... issueData) {
        // Hook into issue storing
        if (index != TEST_RUN_FAILURE_INDEX) {
            storeIssue(severity, object);
        }
        return super.createDiagnostic(severity, message, object, feature, index, code, issueData);
    }

    @Override
    protected Diagnostic createDiagnostic(Severity severity, String message, EObject object,
            int offset, int length, String code, String... issueData) {
        // Hook into issue storing
        storeIssue(severity, object);
        return super.createDiagnostic(severity, message, object, offset, length, code, issueData);
    }

    @Override
    protected boolean isResponsible(Map<Object, Object> context, EObject eObject) {
        Thread currentThread = Thread.currentThread();
        cancelIndicators.put(currentThread,
                (CancelIndicator) context.get(CancelableDiagnostician.CANCEL_INDICATOR));
        return super.isResponsible(context, eObject);
    }

    /**
     * Returns true if the next farthest out containing {@link EObject} of {@code eObject} is a
     * subclass of {@code clazz}
     * 
     * @param eObject
     *            The {@link EObject} to check
     * @param clazz
     *            The desired class
     * @return True if the next furthest out containing {@link EObject} of {@code eObject} is a
     *         subclass of {@code clazz}, false otherwise
     */
    private boolean checkContainedWithin(EObject eObject, Class<?> clazz) {
        boolean good = false;
        for (EObject eObj = eObject.eContainer(); eObj != null; eObj = eObj.eContainer()) {
            if (clazz.isInstance(eObj)) {
                good = true;
            }
            if (eObj.eClass().getEPackage() == XTestPackage.eINSTANCE) {
                // Only find the first container from this package
                break;
            }
        }
        return good;
    }

    /**
     * Marks the errors from the test case
     * 
     * @param testCase
     *            The test case result
     */
    private void markErrorsFromCase(XTestCaseResult testCase) {
        markEvaluationExceptions(testCase);
        XTestAssertException assertException = testCase.getAssertException();
        if (assertException != null) {
            XAssertExpression expression = assertException.getExpression();
            error(testCase.getQualifiedName() + ": Assertion Failed", expression, null,
                    TEST_RUN_FAILURE_INDEX);
        }
    }

    /**
     * Marks the errors from the test suite
     * 
     * @param run
     *            The test suite result
     */
    private void markErrorsFromSuite(XTestSuiteResult run) {
        if (run != null) {
            for (String error : run.getErrorMessages()) {
                error(run.getQualifiedName() + ": " + error, run.getEObject(), null,
                        TEST_RUN_FAILURE_INDEX);
            }
            markEvaluationExceptions(run);
            for (XTestSuiteResult suite : run.getSubSuites()) {
                markErrorsFromSuite(suite);
            }
            for (XTestCaseResult suite : run.getCases()) {
                markErrorsFromCase(suite);
            }
        }
    }

    /**
     * Marks the evaluation exception on the line that generated it
     * 
     * @param run
     *            The case or suite that failed
     */
    private void markEvaluationExceptions(AbstractXTestResult run) {
        XTestEvaluationException exception = run.getEvaluationException();
        if (exception != null) {
            Throwable cause = exception.getCause();
            XExpression expression = exception.getExpression();
            StringBuilder builder = new StringBuilder(run.getQualifiedName() + ": "
                    + cause.toString());
            for (StackTraceElement trace : cause.getStackTrace()) {
                builder.append("\n");
                builder.append(trace.toString());
            }
            error(builder.toString(), expression, null, TEST_RUN_FAILURE_INDEX);
        }
    }

    /**
     * Store validation issue into the top-level {@link Body} EObject
     * 
     * @param severity
     *            The severity of the issue
     * @param object
     *            The object with the issue
     */
    private void storeIssue(Severity severity, EObject object) {
        BodyImplCustom body = null;
        for (EObject cursor = object; cursor != null; cursor = cursor.eContainer()) {
            if (cursor instanceof BodyImplCustom) {
                body = (BodyImplCustom) cursor;
            }
        }
        if (body != null && (severity == Severity.ERROR || severity == Severity.WARNING)) {
            HashMultimap<Severity, EObject> issues = body.getIssues();
            issues.put(severity, object);
        }
    }
}
