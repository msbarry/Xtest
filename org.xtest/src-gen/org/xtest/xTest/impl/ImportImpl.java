/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtest.xTest.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.xtext.common.types.JvmType;

import org.xtest.xTest.Import;
import org.xtest.xTest.XTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtest.xTest.impl.ImportImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link org.xtest.xTest.impl.ImportImpl#getStaticImport <em>Static Import</em>}</li>
 *   <li>{@link org.xtest.xTest.impl.ImportImpl#getTypeImport <em>Type Import</em>}</li>
 *   <li>{@link org.xtest.xTest.impl.ImportImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImportImpl extends MinimalEObjectImpl.Container implements Import
{
  /**
   * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected static final boolean STATIC_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isStatic()
   * @generated
   * @ordered
   */
  protected boolean static_ = STATIC_EDEFAULT;

  /**
   * The cached value of the '{@link #getStaticImport() <em>Static Import</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStaticImport()
   * @generated
   * @ordered
   */
  protected JvmType staticImport;

  /**
   * The cached value of the '{@link #getTypeImport() <em>Type Import</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeImport()
   * @generated
   * @ordered
   */
  protected JvmType typeImport;

  /**
   * The default value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected static final String IMPORTED_NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected String importedNamespace = IMPORTED_NAMESPACE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ImportImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XTestPackage.Literals.IMPORT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isStatic()
  {
    return static_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatic(boolean newStatic)
  {
    boolean oldStatic = static_;
    static_ = newStatic;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XTestPackage.IMPORT__STATIC, oldStatic, static_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getStaticImport()
  {
    if (staticImport != null && staticImport.eIsProxy())
    {
      InternalEObject oldStaticImport = (InternalEObject)staticImport;
      staticImport = (JvmType)eResolveProxy(oldStaticImport);
      if (staticImport != oldStaticImport)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XTestPackage.IMPORT__STATIC_IMPORT, oldStaticImport, staticImport));
      }
    }
    return staticImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetStaticImport()
  {
    return staticImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStaticImport(JvmType newStaticImport)
  {
    JvmType oldStaticImport = staticImport;
    staticImport = newStaticImport;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XTestPackage.IMPORT__STATIC_IMPORT, oldStaticImport, staticImport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType getTypeImport()
  {
    if (typeImport != null && typeImport.eIsProxy())
    {
      InternalEObject oldTypeImport = (InternalEObject)typeImport;
      typeImport = (JvmType)eResolveProxy(oldTypeImport);
      if (typeImport != oldTypeImport)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, XTestPackage.IMPORT__TYPE_IMPORT, oldTypeImport, typeImport));
      }
    }
    return typeImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmType basicGetTypeImport()
  {
    return typeImport;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeImport(JvmType newTypeImport)
  {
    JvmType oldTypeImport = typeImport;
    typeImport = newTypeImport;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XTestPackage.IMPORT__TYPE_IMPORT, oldTypeImport, typeImport));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getImportedNamespace()
  {
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedNamespace(String newImportedNamespace)
  {
    String oldImportedNamespace = importedNamespace;
    importedNamespace = newImportedNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XTestPackage.IMPORT__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XTestPackage.IMPORT__STATIC:
        return isStatic();
      case XTestPackage.IMPORT__STATIC_IMPORT:
        if (resolve) return getStaticImport();
        return basicGetStaticImport();
      case XTestPackage.IMPORT__TYPE_IMPORT:
        if (resolve) return getTypeImport();
        return basicGetTypeImport();
      case XTestPackage.IMPORT__IMPORTED_NAMESPACE:
        return getImportedNamespace();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XTestPackage.IMPORT__STATIC:
        setStatic((Boolean)newValue);
        return;
      case XTestPackage.IMPORT__STATIC_IMPORT:
        setStaticImport((JvmType)newValue);
        return;
      case XTestPackage.IMPORT__TYPE_IMPORT:
        setTypeImport((JvmType)newValue);
        return;
      case XTestPackage.IMPORT__IMPORTED_NAMESPACE:
        setImportedNamespace((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XTestPackage.IMPORT__STATIC:
        setStatic(STATIC_EDEFAULT);
        return;
      case XTestPackage.IMPORT__STATIC_IMPORT:
        setStaticImport((JvmType)null);
        return;
      case XTestPackage.IMPORT__TYPE_IMPORT:
        setTypeImport((JvmType)null);
        return;
      case XTestPackage.IMPORT__IMPORTED_NAMESPACE:
        setImportedNamespace(IMPORTED_NAMESPACE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XTestPackage.IMPORT__STATIC:
        return static_ != STATIC_EDEFAULT;
      case XTestPackage.IMPORT__STATIC_IMPORT:
        return staticImport != null;
      case XTestPackage.IMPORT__TYPE_IMPORT:
        return typeImport != null;
      case XTestPackage.IMPORT__IMPORTED_NAMESPACE:
        return IMPORTED_NAMESPACE_EDEFAULT == null ? importedNamespace != null : !IMPORTED_NAMESPACE_EDEFAULT.equals(importedNamespace);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (static: ");
    result.append(static_);
    result.append(", importedNamespace: ");
    result.append(importedNamespace);
    result.append(')');
    return result.toString();
  }

} //ImportImpl
