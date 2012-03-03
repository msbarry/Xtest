/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtest.xTest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtest.xTest.XTestFactory
 * @model kind="package"
 * @generated
 */
public interface XTestPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "xTest";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtest.org/";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "xTest";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XTestPackage eINSTANCE = org.xtest.xTest.impl.XTestPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtest.xTest.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtest.xTest.impl.ImportImpl
   * @see org.xtest.xTest.impl.XTestPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 0;

  /**
   * The feature id for the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__STATIC = 0;

  /**
   * The feature id for the '<em><b>Static Import</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__STATIC_IMPORT = 1;

  /**
   * The feature id for the '<em><b>Type Import</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__TYPE_IMPORT = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORTED_NAMESPACE = 3;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtest.xTest.impl.UniqueNameImpl <em>Unique Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtest.xTest.impl.UniqueNameImpl
   * @see org.xtest.xTest.impl.XTestPackageImpl#getUniqueName()
   * @generated
   */
  int UNIQUE_NAME = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_NAME__NAME = 0;

  /**
   * The feature id for the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_NAME__IDENTIFIER = 1;

  /**
   * The number of structural features of the '<em>Unique Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNIQUE_NAME_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtest.xTest.impl.BodyImpl <em>Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtest.xTest.impl.BodyImpl
   * @see org.xtest.xTest.impl.XTestPackageImpl#getBody()
   * @generated
   */
  int BODY = 2;

  /**
   * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__EXPRESSIONS = XbasePackage.XBLOCK_EXPRESSION__EXPRESSIONS;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY__IMPORTS = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BODY_FEATURE_COUNT = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtest.xTest.impl.XTestSuiteImpl <em>Suite</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtest.xTest.impl.XTestSuiteImpl
   * @see org.xtest.xTest.impl.XTestPackageImpl#getXTestSuite()
   * @generated
   */
  int XTEST_SUITE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTEST_SUITE__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTEST_SUITE__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Suite</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTEST_SUITE_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtest.xTest.impl.XTestCaseImpl <em>Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtest.xTest.impl.XTestCaseImpl
   * @see org.xtest.xTest.impl.XTestPackageImpl#getXTestCase()
   * @generated
   */
  int XTEST_CASE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTEST_CASE__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTEST_CASE__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XTEST_CASE_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtest.xTest.impl.XAssertExpressionImpl <em>XAssert Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtest.xTest.impl.XAssertExpressionImpl
   * @see org.xtest.xTest.impl.XTestPackageImpl#getXAssertExpression()
   * @generated
   */
  int XASSERT_EXPRESSION = 5;

  /**
   * The feature id for the '<em><b>Actual</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XASSERT_EXPRESSION__ACTUAL = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Throws</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XASSERT_EXPRESSION__THROWS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>XAssert Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XASSERT_EXPRESSION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.xtest.xTest.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.xtest.xTest.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.xtest.xTest.Import#isStatic <em>Static</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Static</em>'.
   * @see org.xtest.xTest.Import#isStatic()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_Static();

  /**
   * Returns the meta object for the reference '{@link org.xtest.xTest.Import#getStaticImport <em>Static Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Static Import</em>'.
   * @see org.xtest.xTest.Import#getStaticImport()
   * @see #getImport()
   * @generated
   */
  EReference getImport_StaticImport();

  /**
   * Returns the meta object for the reference '{@link org.xtest.xTest.Import#getTypeImport <em>Type Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type Import</em>'.
   * @see org.xtest.xTest.Import#getTypeImport()
   * @see #getImport()
   * @generated
   */
  EReference getImport_TypeImport();

  /**
   * Returns the meta object for the attribute '{@link org.xtest.xTest.Import#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see org.xtest.xTest.Import#getImportedNamespace()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link org.xtest.xTest.UniqueName <em>Unique Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unique Name</em>'.
   * @see org.xtest.xTest.UniqueName
   * @generated
   */
  EClass getUniqueName();

  /**
   * Returns the meta object for the attribute '{@link org.xtest.xTest.UniqueName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtest.xTest.UniqueName#getName()
   * @see #getUniqueName()
   * @generated
   */
  EAttribute getUniqueName_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtest.xTest.UniqueName#getIdentifier <em>Identifier</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Identifier</em>'.
   * @see org.xtest.xTest.UniqueName#getIdentifier()
   * @see #getUniqueName()
   * @generated
   */
  EReference getUniqueName_Identifier();

  /**
   * Returns the meta object for class '{@link org.xtest.xTest.Body <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Body</em>'.
   * @see org.xtest.xTest.Body
   * @generated
   */
  EClass getBody();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtest.xTest.Body#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.xtest.xTest.Body#getImports()
   * @see #getBody()
   * @generated
   */
  EReference getBody_Imports();

  /**
   * Returns the meta object for class '{@link org.xtest.xTest.XTestSuite <em>Suite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Suite</em>'.
   * @see org.xtest.xTest.XTestSuite
   * @generated
   */
  EClass getXTestSuite();

  /**
   * Returns the meta object for the containment reference '{@link org.xtest.xTest.XTestSuite#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtest.xTest.XTestSuite#getName()
   * @see #getXTestSuite()
   * @generated
   */
  EReference getXTestSuite_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtest.xTest.XTestSuite#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtest.xTest.XTestSuite#getExpression()
   * @see #getXTestSuite()
   * @generated
   */
  EReference getXTestSuite_Expression();

  /**
   * Returns the meta object for class '{@link org.xtest.xTest.XTestCase <em>Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Case</em>'.
   * @see org.xtest.xTest.XTestCase
   * @generated
   */
  EClass getXTestCase();

  /**
   * Returns the meta object for the containment reference '{@link org.xtest.xTest.XTestCase#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see org.xtest.xTest.XTestCase#getName()
   * @see #getXTestCase()
   * @generated
   */
  EReference getXTestCase_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.xtest.xTest.XTestCase#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtest.xTest.XTestCase#getExpression()
   * @see #getXTestCase()
   * @generated
   */
  EReference getXTestCase_Expression();

  /**
   * Returns the meta object for class '{@link org.xtest.xTest.XAssertExpression <em>XAssert Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XAssert Expression</em>'.
   * @see org.xtest.xTest.XAssertExpression
   * @generated
   */
  EClass getXAssertExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtest.xTest.XAssertExpression#getActual <em>Actual</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actual</em>'.
   * @see org.xtest.xTest.XAssertExpression#getActual()
   * @see #getXAssertExpression()
   * @generated
   */
  EReference getXAssertExpression_Actual();

  /**
   * Returns the meta object for the containment reference '{@link org.xtest.xTest.XAssertExpression#getThrows <em>Throws</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Throws</em>'.
   * @see org.xtest.xTest.XAssertExpression#getThrows()
   * @see #getXAssertExpression()
   * @generated
   */
  EReference getXAssertExpression_Throws();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  XTestFactory getXTestFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtest.xTest.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtest.xTest.impl.ImportImpl
     * @see org.xtest.xTest.impl.XTestPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__STATIC = eINSTANCE.getImport_Static();

    /**
     * The meta object literal for the '<em><b>Static Import</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__STATIC_IMPORT = eINSTANCE.getImport_StaticImport();

    /**
     * The meta object literal for the '<em><b>Type Import</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IMPORT__TYPE_IMPORT = eINSTANCE.getImport_TypeImport();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getImport_ImportedNamespace();

    /**
     * The meta object literal for the '{@link org.xtest.xTest.impl.UniqueNameImpl <em>Unique Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtest.xTest.impl.UniqueNameImpl
     * @see org.xtest.xTest.impl.XTestPackageImpl#getUniqueName()
     * @generated
     */
    EClass UNIQUE_NAME = eINSTANCE.getUniqueName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNIQUE_NAME__NAME = eINSTANCE.getUniqueName_Name();

    /**
     * The meta object literal for the '<em><b>Identifier</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNIQUE_NAME__IDENTIFIER = eINSTANCE.getUniqueName_Identifier();

    /**
     * The meta object literal for the '{@link org.xtest.xTest.impl.BodyImpl <em>Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtest.xTest.impl.BodyImpl
     * @see org.xtest.xTest.impl.XTestPackageImpl#getBody()
     * @generated
     */
    EClass BODY = eINSTANCE.getBody();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BODY__IMPORTS = eINSTANCE.getBody_Imports();

    /**
     * The meta object literal for the '{@link org.xtest.xTest.impl.XTestSuiteImpl <em>Suite</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtest.xTest.impl.XTestSuiteImpl
     * @see org.xtest.xTest.impl.XTestPackageImpl#getXTestSuite()
     * @generated
     */
    EClass XTEST_SUITE = eINSTANCE.getXTestSuite();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XTEST_SUITE__NAME = eINSTANCE.getXTestSuite_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XTEST_SUITE__EXPRESSION = eINSTANCE.getXTestSuite_Expression();

    /**
     * The meta object literal for the '{@link org.xtest.xTest.impl.XTestCaseImpl <em>Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtest.xTest.impl.XTestCaseImpl
     * @see org.xtest.xTest.impl.XTestPackageImpl#getXTestCase()
     * @generated
     */
    EClass XTEST_CASE = eINSTANCE.getXTestCase();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XTEST_CASE__NAME = eINSTANCE.getXTestCase_Name();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XTEST_CASE__EXPRESSION = eINSTANCE.getXTestCase_Expression();

    /**
     * The meta object literal for the '{@link org.xtest.xTest.impl.XAssertExpressionImpl <em>XAssert Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtest.xTest.impl.XAssertExpressionImpl
     * @see org.xtest.xTest.impl.XTestPackageImpl#getXAssertExpression()
     * @generated
     */
    EClass XASSERT_EXPRESSION = eINSTANCE.getXAssertExpression();

    /**
     * The meta object literal for the '<em><b>Actual</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XASSERT_EXPRESSION__ACTUAL = eINSTANCE.getXAssertExpression_Actual();

    /**
     * The meta object literal for the '<em><b>Throws</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XASSERT_EXPRESSION__THROWS = eINSTANCE.getXAssertExpression_Throws();

  }

} //XTestPackage
