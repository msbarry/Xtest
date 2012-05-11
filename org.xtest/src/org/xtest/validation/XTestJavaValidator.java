package org.xtest.validation;

import static com.google.common.collect.Maps.newHashMap;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.validation.IssueCodes;
import org.eclipse.xtend.core.xtend.XtendImport;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.util.TypeConformanceComputer;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CancelableDiagnostician;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.XAssignment;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.typing.ITypeProvider;
import org.xtest.RunType;
import org.xtest.XTestEvaluationException;
import org.xtest.XTestRunner;
import org.xtest.XTestRunner.DontRunCheck;
import org.xtest.preferences.PerFilePreferenceProvider;
import org.xtest.preferences.RuntimePref;
import org.xtest.results.XTestResult;
import org.xtest.xTest.Body;
import org.xtest.xTest.XAssertExpression;
import org.xtest.xTest.XTestPackage;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Validator for xtest expression models. Validates that:
 * <ul>
 * <li>assert expressions have boolean return type
 * <li>assert/throws types are subclasses are throwable
 * <li><b>All unit tests pass</b> </ol>
 * 
 * @author Michael Barry
 */
@Singleton
@SuppressWarnings("restriction")
public class XTestJavaValidator extends AbstractXTestJavaValidator {
    private static final int TEST_RUN_FAILURE_INDEX = Integer.MAX_VALUE;
    private final ThreadLocal<CancelIndicator> cancelIndicators = new ThreadLocal<CancelIndicator>();
    @Inject
    private PerFilePreferenceProvider preferenceProvider;
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

    @Override
    @Check
    public void checkAssignment(XAssignment assignment) {
        JvmIdentifiableElement assignmentFeature = assignment.getFeature();
        if (!(assignmentFeature instanceof JvmField && ((JvmField) assignmentFeature).isFinal())) {
            super.checkAssignment(assignment);
        }
    }

    /**
     * Validate imports for an Xtest file
     * 
     * From Xtend 2.3
     * 
     * @param file
     *            The Xtest file
     */
    @Check
    public void checkImports(Body file) {
        final Map<JvmType, XtendImport> imports = newHashMap();
        final Map<JvmType, XtendImport> staticImports = newHashMap();
        final Map<String, JvmType> importedNames = newHashMap();

        for (XtendImport imp : file.getImports()) {
            if (imp.getImportedNamespace() != null) {
                warning("The use of wildcard imports is deprecated.", imp, null,
                        IssueCodes.IMPORT_WILDCARD_DEPRECATED);
            } else {
                JvmType importedType = imp.getImportedType();
                if (importedType != null && !importedType.eIsProxy()) {
                    Map<JvmType, XtendImport> map = imp.isStatic() ? staticImports : imports;
                    if (map.containsKey(importedType)) {
                        warning("Duplicate import of '" + importedType.getSimpleName() + "'.", imp,
                                null, IssueCodes.IMPORT_DUPLICATE);
                    } else {
                        map.put(importedType, imp);
                        if (!imp.isStatic()) {
                            JvmType currentType = importedType;
                            String currentSuffix = currentType.getSimpleName();
                            JvmType collidingImport = importedNames
                                    .put(currentSuffix, importedType);
                            if (collidingImport != null) {
                                error("The import '" + importedType.getIdentifier()
                                        + "' collides with the import '"
                                        + collidingImport.getIdentifier() + "'.", imp, null,
                                        IssueCodes.IMPORT_COLLISION);
                            }
                            while (currentType.eContainer() instanceof JvmType) {
                                currentType = (JvmType) currentType.eContainer();
                                currentSuffix = currentType.getSimpleName() + "$" + currentSuffix;
                                JvmType collidingImport2 = importedNames.put(currentSuffix,
                                        importedType);
                                if (collidingImport2 != null) {
                                    error("The import '" + importedType.getIdentifier()
                                            + "' collides with the import '"
                                            + collidingImport2.getIdentifier() + "'.", imp, null,
                                            IssueCodes.IMPORT_COLLISION);
                                }
                            }
                        }
                    }
                }
            }
        }
        EList<XExpression> expressions = file.getExpressions();
        for (XExpression expression : expressions) {
            ICompositeNode node = NodeModelUtils.findActualNodeFor(expression);
            if (node != null) {
                for (INode n : node.getAsTreeIterable()) {
                    if (n.getGrammarElement() instanceof CrossReference) {
                        EClassifier classifier = ((CrossReference) n.getGrammarElement()).getType()
                                .getClassifier();
                        if (classifier instanceof EClass
                                && (TypesPackage.Literals.JVM_TYPE
                                        .isSuperTypeOf((EClass) classifier) || TypesPackage.Literals.JVM_CONSTRUCTOR
                                        .isSuperTypeOf((EClass) classifier))) {
                            String simpleName = n.getText().trim();
                            // handle StaticQualifier Workaround (see Xbase grammar)
                            if (simpleName.endsWith("::")) {
                                simpleName = simpleName.substring(0, simpleName.length() - 2);
                            }
                            if (importedNames.containsKey(simpleName)) {
                                JvmType type = importedNames.remove(simpleName);
                                imports.remove(type);
                            } else {
                                while (simpleName.contains("$")) {
                                    simpleName = simpleName.substring(0,
                                            simpleName.lastIndexOf('$'));
                                    if (importedNames.containsKey(simpleName)) {
                                        imports.remove(importedNames.remove(simpleName));
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (XtendImport imp : imports.values()) {
            warning("The import '" + imp.getImportedType().getQualifiedName() + "' is never used.",
                    imp, null, IssueCodes.IMPORT_UNUSED);
        }
    }

    /**
     * Runs the unit test as long as the {@link CheckType} is not {@link DontRunCheck} and marks any
     * failed expressions.
     * 
     * @param main
     *            The xtest expression model to run.
     */
    @Check(CheckType.EXPENSIVE)
    public void doMagic(Body main) {
        RunType weight = getCheckMode().shouldCheck(CheckType.FAST) ? RunType.LIGHTWEIGHT
                : RunType.HEAVYWEIGHT;
        if (!(getCheckMode() instanceof XTestRunner.DontRunCheck)) {
            CancelIndicator indicator = cancelIndicators.get();
            if (indicator == null) {
                indicator = CancelIndicator.NullImpl;
            }
            XTestResult result = runner.run(main, weight, indicator);
            markErrorsFromTest(result);

            if (preferenceProvider.get(main, RuntimePref.MARK_UNEXECUTED)) {
                Set<XExpression> unexecutedExpressions = runner.getUnexecutedExpressions(main);
                markUnexecuted(main, unexecutedExpressions);
            }
            getContext().put(XTestResult.KEY, result);
        }
    }

    @Override
    protected boolean isResponsible(Map<Object, Object> context, EObject eObject) {
        cancelIndicators.set((CancelIndicator) context
                .get(CancelableDiagnostician.CANCEL_INDICATOR));
        return super.isResponsible(context, eObject);
    }

    @Override
    protected boolean supportsCheckedExceptions() {
        // No need to check exceptions in xtest, they will be flagged as errors if thrown
        return false;
    }

    /**
     * Marks the errors from the test
     * 
     * @param run
     *            The test result
     */
    private void markErrorsFromTest(XTestResult run) {
        if (run != null) {
            for (String error : run.getErrorMessages()) {
                error(run.getQualifiedName() + ": " + error, run.getEObject(), null,
                        TEST_RUN_FAILURE_INDEX);
            }
            Collection<XAssertExpression> assertExceptions = run.getAssertExceptions();
            for (XAssertExpression expression : assertExceptions) {
                error(run.getQualifiedName() + ": Assertion Failed", expression, null,
                        TEST_RUN_FAILURE_INDEX);
            }
            markEvaluationExceptions(run);
            for (XTestResult test : run.getSubTests()) {
                markErrorsFromTest(test);
            }
        }
    }

    /**
     * Marks the evaluation exception on the line that generated it
     * 
     * @param run
     *            The test that failed
     */
    private void markEvaluationExceptions(XTestResult run) {
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
     * Finds all expressions in {@code main} that are not contained in {@code executedExpressions}
     * 
     * @param main
     *            The top-level expression object
     * @param executedExpressions
     *            The set of evaluated expressions
     */
    private void markUnexecuted(Body main, Set<XExpression> unexecuted) {
        for (XExpression expression : unexecuted) {
            warning("Expression never reached", expression, null, 10);
        }
    }
}
