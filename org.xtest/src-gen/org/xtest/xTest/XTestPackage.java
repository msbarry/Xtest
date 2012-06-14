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

import org.eclipse.xtext.common.types.TypesPackage;

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
	 * The meta object id for the '{@link org.xtest.xTest.impl.FileParamImpl <em>File Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtest.xTest.impl.FileParamImpl
	 * @see org.xtest.xTest.impl.XTestPackageImpl#getFileParam()
	 * @generated
	 */
	int FILE_PARAM = 0;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARAM__FEATURE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARAM__VALUE = 1;

	/**
	 * The number of structural features of the '<em>File Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_PARAM_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Fileparam</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__FILEPARAM = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY__IMPORTS = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Body</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_FEATURE_COUNT = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.xtest.xTest.impl.XTestExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtest.xTest.impl.XTestExpressionImpl
	 * @see org.xtest.xTest.impl.XTestPackageImpl#getXTestExpression()
	 * @generated
	 */
	int XTEST_EXPRESSION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEST_EXPRESSION__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEST_EXPRESSION__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEST_EXPRESSION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.xtest.xTest.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtest.xTest.impl.ParameterImpl
	 * @see org.xtest.xTest.impl.XTestPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__ANNOTATIONS = TypesPackage.JVM_FORMAL_PARAMETER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = TypesPackage.JVM_FORMAL_PARAMETER__NAME;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__PARAMETER_TYPE = TypesPackage.JVM_FORMAL_PARAMETER__PARAMETER_TYPE;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = TypesPackage.JVM_FORMAL_PARAMETER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xtest.xTest.impl.JvmVarArgArrayImpl <em>Jvm Var Arg Array</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtest.xTest.impl.JvmVarArgArrayImpl
	 * @see org.xtest.xTest.impl.XTestPackageImpl#getJvmVarArgArray()
	 * @generated
	 */
	int JVM_VAR_ARG_ARRAY = 5;

	/**
	 * The feature id for the '<em><b>Component Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_VAR_ARG_ARRAY__COMPONENT_TYPE = TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE__COMPONENT_TYPE;

	/**
	 * The number of structural features of the '<em>Jvm Var Arg Array</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JVM_VAR_ARG_ARRAY_FEATURE_COUNT = TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xtest.xTest.impl.XMethodDefImpl <em>XMethod Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtest.xTest.impl.XMethodDefImpl
	 * @see org.xtest.xTest.impl.XTestPackageImpl#getXMethodDef()
	 * @generated
	 */
	int XMETHOD_DEF = 6;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__TYPE_PARAMETERS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__RETURN_TYPE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__NAME = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__PARAMETERS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__EXPRESSION = XbasePackage.XEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>XMethod Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.xtest.xTest.impl.XAssertExpressionImpl <em>XAssert Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtest.xTest.impl.XAssertExpressionImpl
	 * @see org.xtest.xTest.impl.XTestPackageImpl#getXAssertExpression()
	 * @generated
	 */
	int XASSERT_EXPRESSION = 7;

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
	 * The meta object id for the '{@link org.xtest.xTest.impl.XSafeExpressionImpl <em>XSafe Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtest.xTest.impl.XSafeExpressionImpl
	 * @see org.xtest.xTest.impl.XTestPackageImpl#getXSafeExpression()
	 * @generated
	 */
	int XSAFE_EXPRESSION = 8;

	/**
	 * The feature id for the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSAFE_EXPRESSION__ACTUAL = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XSafe Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSAFE_EXPRESSION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.xtest.xTest.FileParam <em>File Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Param</em>'.
	 * @see org.xtest.xTest.FileParam
	 * @generated
	 */
	EClass getFileParam();

	/**
	 * Returns the meta object for the reference '{@link org.xtest.xTest.FileParam#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.xtest.xTest.FileParam#getFeature()
	 * @see #getFileParam()
	 * @generated
	 */
	EReference getFileParam_Feature();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtest.xTest.FileParam#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see org.xtest.xTest.FileParam#getValue()
	 * @see #getFileParam()
	 * @generated
	 */
	EReference getFileParam_Value();

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
	 * Returns the meta object for the containment reference list '{@link org.xtest.xTest.Body#getFileparam <em>Fileparam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fileparam</em>'.
	 * @see org.xtest.xTest.Body#getFileparam()
	 * @see #getBody()
	 * @generated
	 */
	EReference getBody_Fileparam();

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
	 * Returns the meta object for class '{@link org.xtest.xTest.XTestExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see org.xtest.xTest.XTestExpression
	 * @generated
	 */
	EClass getXTestExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtest.xTest.XTestExpression#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Name</em>'.
	 * @see org.xtest.xTest.XTestExpression#getName()
	 * @see #getXTestExpression()
	 * @generated
	 */
	EReference getXTestExpression_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtest.xTest.XTestExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.xtest.xTest.XTestExpression#getExpression()
	 * @see #getXTestExpression()
	 * @generated
	 */
	EReference getXTestExpression_Expression();

	/**
	 * Returns the meta object for class '{@link org.xtest.xTest.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.xtest.xTest.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '{@link org.xtest.xTest.JvmVarArgArray <em>Jvm Var Arg Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jvm Var Arg Array</em>'.
	 * @see org.xtest.xTest.JvmVarArgArray
	 * @generated
	 */
	EClass getJvmVarArgArray();

	/**
	 * Returns the meta object for class '{@link org.xtest.xTest.XMethodDef <em>XMethod Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMethod Def</em>'.
	 * @see org.xtest.xTest.XMethodDef
	 * @generated
	 */
	EClass getXMethodDef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtest.xTest.XMethodDef#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.xtest.xTest.XMethodDef#getTypeParameters()
	 * @see #getXMethodDef()
	 * @generated
	 */
	EReference getXMethodDef_TypeParameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtest.xTest.XMethodDef#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.xtest.xTest.XMethodDef#getReturnType()
	 * @see #getXMethodDef()
	 * @generated
	 */
	EReference getXMethodDef_ReturnType();

	/**
	 * Returns the meta object for the attribute '{@link org.xtest.xTest.XMethodDef#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.xtest.xTest.XMethodDef#getName()
	 * @see #getXMethodDef()
	 * @generated
	 */
	EAttribute getXMethodDef_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.xtest.xTest.XMethodDef#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.xtest.xTest.XMethodDef#getParameters()
	 * @see #getXMethodDef()
	 * @generated
	 */
	EReference getXMethodDef_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtest.xTest.XMethodDef#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.xtest.xTest.XMethodDef#getExpression()
	 * @see #getXMethodDef()
	 * @generated
	 */
	EReference getXMethodDef_Expression();

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
	 * Returns the meta object for class '{@link org.xtest.xTest.XSafeExpression <em>XSafe Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSafe Expression</em>'.
	 * @see org.xtest.xTest.XSafeExpression
	 * @generated
	 */
	EClass getXSafeExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtest.xTest.XSafeExpression#getActual <em>Actual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Actual</em>'.
	 * @see org.xtest.xTest.XSafeExpression#getActual()
	 * @see #getXSafeExpression()
	 * @generated
	 */
	EReference getXSafeExpression_Actual();

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
		 * The meta object literal for the '{@link org.xtest.xTest.impl.FileParamImpl <em>File Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtest.xTest.impl.FileParamImpl
		 * @see org.xtest.xTest.impl.XTestPackageImpl#getFileParam()
		 * @generated
		 */
		EClass FILE_PARAM = eINSTANCE.getFileParam();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_PARAM__FEATURE = eINSTANCE.getFileParam_Feature();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_PARAM__VALUE = eINSTANCE.getFileParam_Value();

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
		 * The meta object literal for the '<em><b>Fileparam</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__FILEPARAM = eINSTANCE.getBody_Fileparam();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BODY__IMPORTS = eINSTANCE.getBody_Imports();

		/**
		 * The meta object literal for the '{@link org.xtest.xTest.impl.XTestExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtest.xTest.impl.XTestExpressionImpl
		 * @see org.xtest.xTest.impl.XTestPackageImpl#getXTestExpression()
		 * @generated
		 */
		EClass XTEST_EXPRESSION = eINSTANCE.getXTestExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEST_EXPRESSION__NAME = eINSTANCE.getXTestExpression_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEST_EXPRESSION__EXPRESSION = eINSTANCE.getXTestExpression_Expression();

		/**
		 * The meta object literal for the '{@link org.xtest.xTest.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtest.xTest.impl.ParameterImpl
		 * @see org.xtest.xTest.impl.XTestPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '{@link org.xtest.xTest.impl.JvmVarArgArrayImpl <em>Jvm Var Arg Array</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtest.xTest.impl.JvmVarArgArrayImpl
		 * @see org.xtest.xTest.impl.XTestPackageImpl#getJvmVarArgArray()
		 * @generated
		 */
		EClass JVM_VAR_ARG_ARRAY = eINSTANCE.getJvmVarArgArray();

		/**
		 * The meta object literal for the '{@link org.xtest.xTest.impl.XMethodDefImpl <em>XMethod Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtest.xTest.impl.XMethodDefImpl
		 * @see org.xtest.xTest.impl.XTestPackageImpl#getXMethodDef()
		 * @generated
		 */
		EClass XMETHOD_DEF = eINSTANCE.getXMethodDef();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMETHOD_DEF__TYPE_PARAMETERS = eINSTANCE.getXMethodDef_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMETHOD_DEF__RETURN_TYPE = eINSTANCE.getXMethodDef_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XMETHOD_DEF__NAME = eINSTANCE.getXMethodDef_Name();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMETHOD_DEF__PARAMETERS = eINSTANCE.getXMethodDef_Parameters();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMETHOD_DEF__EXPRESSION = eINSTANCE.getXMethodDef_Expression();

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

		/**
		 * The meta object literal for the '{@link org.xtest.xTest.impl.XSafeExpressionImpl <em>XSafe Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtest.xTest.impl.XSafeExpressionImpl
		 * @see org.xtest.xTest.impl.XTestPackageImpl#getXSafeExpression()
		 * @generated
		 */
		EClass XSAFE_EXPRESSION = eINSTANCE.getXSafeExpression();

		/**
		 * The meta object literal for the '<em><b>Actual</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XSAFE_EXPRESSION__ACTUAL = eINSTANCE.getXSafeExpression_Actual();

	}

} //XTestPackage
