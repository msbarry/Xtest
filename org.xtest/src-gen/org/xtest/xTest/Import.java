/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtest.xTest;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtest.xTest.Import#isStatic <em>Static</em>}</li>
 *   <li>{@link org.xtest.xTest.Import#getStaticImport <em>Static Import</em>}</li>
 *   <li>{@link org.xtest.xTest.Import#getTypeImport <em>Type Import</em>}</li>
 *   <li>{@link org.xtest.xTest.Import#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtest.xTest.XTestPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject
{
  /**
   * Returns the value of the '<em><b>Static</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static</em>' attribute.
   * @see #setStatic(boolean)
   * @see org.xtest.xTest.XTestPackage#getImport_Static()
   * @model
   * @generated
   */
  boolean isStatic();

  /**
   * Sets the value of the '{@link org.xtest.xTest.Import#isStatic <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static</em>' attribute.
   * @see #isStatic()
   * @generated
   */
  void setStatic(boolean value);

  /**
   * Returns the value of the '<em><b>Static Import</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static Import</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static Import</em>' reference.
   * @see #setStaticImport(JvmType)
   * @see org.xtest.xTest.XTestPackage#getImport_StaticImport()
   * @model
   * @generated
   */
  JvmType getStaticImport();

  /**
   * Sets the value of the '{@link org.xtest.xTest.Import#getStaticImport <em>Static Import</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static Import</em>' reference.
   * @see #getStaticImport()
   * @generated
   */
  void setStaticImport(JvmType value);

  /**
   * Returns the value of the '<em><b>Type Import</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Import</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Import</em>' reference.
   * @see #setTypeImport(JvmType)
   * @see org.xtest.xTest.XTestPackage#getImport_TypeImport()
   * @model
   * @generated
   */
  JvmType getTypeImport();

  /**
   * Sets the value of the '{@link org.xtest.xTest.Import#getTypeImport <em>Type Import</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Import</em>' reference.
   * @see #getTypeImport()
   * @generated
   */
  void setTypeImport(JvmType value);

  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute.
   * @see #setImportedNamespace(String)
   * @see org.xtest.xTest.XTestPackage#getImport_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link org.xtest.xTest.Import#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

} // Import
