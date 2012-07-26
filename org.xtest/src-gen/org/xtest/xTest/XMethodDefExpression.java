/**
 */
package org.xtest.xTest;

import org.eclipse.xtend.core.xtend.XtendFunction;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMethod Def Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtest.xTest.XMethodDefExpression#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtest.xTest.XTestPackage#getXMethodDefExpression()
 * @model
 * @generated
 */
public interface XMethodDefExpression extends XExpression
{
	/**
	 * Returns the value of the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' containment reference.
	 * @see #setMethod(XtendFunction)
	 * @see org.xtest.xTest.XTestPackage#getXMethodDefExpression_Method()
	 * @model containment="true"
	 * @generated
	 */
	XtendFunction getMethod();

	/**
	 * Sets the value of the '{@link org.xtest.xTest.XMethodDefExpression#getMethod <em>Method</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' containment reference.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(XtendFunction value);

} // XMethodDefExpression
