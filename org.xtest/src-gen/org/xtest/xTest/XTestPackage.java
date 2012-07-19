/**
 */
package org.xtest.xTest;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtend.core.xtend.XtendPackage;

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
	 * The meta object id for the '{@link org.xtest.xTest.impl.XAssertExpressionImpl <em>XAssert Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtest.xTest.impl.XAssertExpressionImpl
	 * @see org.xtest.xTest.impl.XTestPackageImpl#getXAssertExpression()
	 * @generated
	 */
	int XASSERT_EXPRESSION = 4;

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
	 * The meta object id for the '{@link org.xtest.xTest.impl.XMethodDefImpl <em>XMethod Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtest.xTest.impl.XMethodDefImpl
	 * @see org.xtest.xTest.impl.XTestPackageImpl#getXMethodDef()
	 * @generated
	 */
	int XMETHOD_DEF = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__ANNOTATIONS = XtendPackage.XTEND_FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__ANNOTATION_INFO = XtendPackage.XTEND_FUNCTION__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__NAME = XtendPackage.XTEND_FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__EXPRESSION = XtendPackage.XTEND_FUNCTION__EXPRESSION;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__RETURN_TYPE = XtendPackage.XTEND_FUNCTION__RETURN_TYPE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__PARAMETERS = XtendPackage.XTEND_FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__OVERRIDE = XtendPackage.XTEND_FUNCTION__OVERRIDE;

	/**
	 * The feature id for the '<em><b>Dispatch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__DISPATCH = XtendPackage.XTEND_FUNCTION__DISPATCH;

	/**
	 * The feature id for the '<em><b>Create Extension Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__CREATE_EXTENSION_INFO = XtendPackage.XTEND_FUNCTION__CREATE_EXTENSION_INFO;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__TYPE_PARAMETERS = XtendPackage.XTEND_FUNCTION__TYPE_PARAMETERS;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__VISIBILITY = XtendPackage.XTEND_FUNCTION__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__STATIC = XtendPackage.XTEND_FUNCTION__STATIC;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF__EXCEPTIONS = XtendPackage.XTEND_FUNCTION__EXCEPTIONS;

	/**
	 * The number of structural features of the '<em>XMethod Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF_FEATURE_COUNT = XtendPackage.XTEND_FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.xtest.xTest.impl.XMethodDefExpressionImpl <em>XMethod Def Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.xtest.xTest.impl.XMethodDefExpressionImpl
	 * @see org.xtest.xTest.impl.XTestPackageImpl#getXMethodDefExpression()
	 * @generated
	 */
	int XMETHOD_DEF_EXPRESSION = 6;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF_EXPRESSION__METHOD = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XMethod Def Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XMETHOD_DEF_EXPRESSION_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;


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
	 * Returns the meta object for class '{@link org.xtest.xTest.XMethodDef <em>XMethod Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMethod Def</em>'.
	 * @see org.xtest.xTest.XMethodDef
	 * @generated
	 */
	EClass getXMethodDef();

	/**
	 * Returns the meta object for class '{@link org.xtest.xTest.XMethodDefExpression <em>XMethod Def Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XMethod Def Expression</em>'.
	 * @see org.xtest.xTest.XMethodDefExpression
	 * @generated
	 */
	EClass getXMethodDefExpression();

	/**
	 * Returns the meta object for the containment reference '{@link org.xtest.xTest.XMethodDefExpression#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see org.xtest.xTest.XMethodDefExpression#getMethod()
	 * @see #getXMethodDefExpression()
	 * @generated
	 */
	EReference getXMethodDefExpression_Method();

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
		 * The meta object literal for the '{@link org.xtest.xTest.impl.XMethodDefImpl <em>XMethod Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtest.xTest.impl.XMethodDefImpl
		 * @see org.xtest.xTest.impl.XTestPackageImpl#getXMethodDef()
		 * @generated
		 */
		EClass XMETHOD_DEF = eINSTANCE.getXMethodDef();

		/**
		 * The meta object literal for the '{@link org.xtest.xTest.impl.XMethodDefExpressionImpl <em>XMethod Def Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.xtest.xTest.impl.XMethodDefExpressionImpl
		 * @see org.xtest.xTest.impl.XTestPackageImpl#getXMethodDefExpression()
		 * @generated
		 */
		EClass XMETHOD_DEF_EXPRESSION = eINSTANCE.getXMethodDefExpression();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XMETHOD_DEF_EXPRESSION__METHOD = eINSTANCE.getXMethodDefExpression_Method();

	}

} //XTestPackage
