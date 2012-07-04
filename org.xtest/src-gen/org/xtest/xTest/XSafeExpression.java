/**
 */
package org.xtest.xTest;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSafe Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtest.xTest.XSafeExpression#getActual <em>Actual</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtest.xTest.XTestPackage#getXSafeExpression()
 * @model
 * @generated
 */
public interface XSafeExpression extends XExpression
{
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
	 * @see org.xtest.xTest.XTestPackage#getXSafeExpression_Actual()
	 * @model containment="true"
	 * @generated
	 */
	XExpression getActual();

	/**
	 * Sets the value of the '{@link org.xtest.xTest.XSafeExpression#getActual <em>Actual</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Actual</em>' containment reference.
	 * @see #getActual()
	 * @generated
	 */
	void setActual(XExpression value);

} // XSafeExpression
