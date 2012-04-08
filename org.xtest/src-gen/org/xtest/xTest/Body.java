/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtest.xTest;

import org.eclipse.emf.common.util.EList;

import org.eclipse.xtext.xbase.XBlockExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtest.xTest.Body#getFileparam <em>Fileparam</em>}</li>
 *   <li>{@link org.xtest.xTest.Body#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtest.xTest.XTestPackage#getBody()
 * @model
 * @generated
 */
public interface Body extends XBlockExpression
{
	/**
	 * Returns the value of the '<em><b>Fileparam</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtest.xTest.FileParam}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fileparam</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fileparam</em>' containment reference list.
	 * @see org.xtest.xTest.XTestPackage#getBody_Fileparam()
	 * @model containment="true"
	 * @generated
	 */
	EList<FileParam> getFileparam();

	/**
	 * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
	 * The list contents are of type {@link org.xtest.xTest.Import}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imports</em>' containment reference list.
	 * @see org.xtest.xTest.XTestPackage#getBody_Imports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Import> getImports();

} // Body
