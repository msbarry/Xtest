/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtest.xTest;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtest.xTest.XTestPackage
 * @generated
 */
public interface XTestFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XTestFactory eINSTANCE = org.xtest.xTest.impl.XTestFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>File Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>File Param</em>'.
	 * @generated
	 */
	FileParam createFileParam();

	/**
	 * Returns a new object of class '<em>Unique Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unique Name</em>'.
	 * @generated
	 */
	UniqueName createUniqueName();

	/**
	 * Returns a new object of class '<em>Body</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Body</em>'.
	 * @generated
	 */
	Body createBody();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	XTestExpression createXTestExpression();

	/**
	 * Returns a new object of class '<em>XAssert Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XAssert Expression</em>'.
	 * @generated
	 */
	XAssertExpression createXAssertExpression();

	/**
	 * Returns a new object of class '<em>XSafe Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XSafe Expression</em>'.
	 * @generated
	 */
	XSafeExpression createXSafeExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	XTestPackage getXTestPackage();

} //XTestFactory
