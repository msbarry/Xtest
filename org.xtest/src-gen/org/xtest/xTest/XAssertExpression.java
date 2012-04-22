/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtest.xTest;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XAssert Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtest.xTest.XAssertExpression#isKeepGoing <em>Keep Going</em>}</li>
 *   <li>{@link org.xtest.xTest.XAssertExpression#getActual <em>Actual</em>}</li>
 *   <li>{@link org.xtest.xTest.XAssertExpression#getThrows <em>Throws</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtest.xTest.XTestPackage#getXAssertExpression()
 * @model
 * @generated
 */
public interface XAssertExpression extends XExpression
{
	/**
	 * Returns the value of the '<em><b>Keep Going</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keep Going</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keep Going</em>' attribute.
	 * @see #setKeepGoing(boolean)
	 * @see org.xtest.xTest.XTestPackage#getXAssertExpression_KeepGoing()
	 * @model
	 * @generated
	 */
	boolean isKeepGoing();

	/**
	 * Sets the value of the '{@link org.xtest.xTest.XAssertExpression#isKeepGoing <em>Keep Going</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keep Going</em>' attribute.
	 * @see #isKeepGoing()
	 * @generated
	 */
	void setKeepGoing(boolean value);

	/**
	 * Returns the value of the '<em><b>Actual</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual</em>' containment reference.
	 * @see #setActual(XExpression)
	 * @see org.xtest.xTest.XTestPackage#getXAssertExpression_Actual()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getActual();

	/**
	 * Sets the value of the '{@link org.xtest.xTest.XAssertExpression#getActual <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' containment reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(XExpression value);

	/**
	 * Returns the value of the '<em><b>Throws</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throws</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throws</em>' containment reference.
	 * @see #setThrows(JvmTypeReference)
	 * @see org.xtest.xTest.XTestPackage#getXAssertExpression_Throws()
	 * @model containment="true"
	 * @generated
	 */
	JvmTypeReference getThrows();

	/**
	 * Sets the value of the '{@link org.xtest.xTest.XAssertExpression#getThrows <em>Throws</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throws</em>' containment reference.
	 * @see #getThrows()
	 * @generated
	 */
	void setThrows(JvmTypeReference value);

} // XAssertExpression
