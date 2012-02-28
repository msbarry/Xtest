/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtest.xTest.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

import org.xtest.xTest.XAssertExpression;
import org.xtest.xTest.XTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XAssert Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtest.xTest.impl.XAssertExpressionImpl#getActual <em>Actual</em>}</li>
 *   <li>{@link org.xtest.xTest.impl.XAssertExpressionImpl#getThrows <em>Throws</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XAssertExpressionImpl extends XExpressionImpl implements XAssertExpression
{
  /**
   * The cached value of the '{@link #getActual() <em>Actual</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActual()
   * @generated
   * @ordered
   */
  protected XExpression actual;

  /**
   * The cached value of the '{@link #getThrows() <em>Throws</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getThrows()
   * @generated
   * @ordered
   */
  protected JvmTypeReference throws_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XAssertExpressionImpl()
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
    return XTestPackage.Literals.XASSERT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XExpression getActual()
  {
    return actual;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActual(XExpression newActual, NotificationChain msgs)
  {
    XExpression oldActual = actual;
    actual = newActual;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XTestPackage.XASSERT_EXPRESSION__ACTUAL, oldActual, newActual);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActual(XExpression newActual)
  {
    if (newActual != actual)
    {
      NotificationChain msgs = null;
      if (actual != null)
        msgs = ((InternalEObject)actual).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XTestPackage.XASSERT_EXPRESSION__ACTUAL, null, msgs);
      if (newActual != null)
        msgs = ((InternalEObject)newActual).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XTestPackage.XASSERT_EXPRESSION__ACTUAL, null, msgs);
      msgs = basicSetActual(newActual, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XTestPackage.XASSERT_EXPRESSION__ACTUAL, newActual, newActual));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JvmTypeReference getThrows()
  {
    return throws_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetThrows(JvmTypeReference newThrows, NotificationChain msgs)
  {
    JvmTypeReference oldThrows = throws_;
    throws_ = newThrows;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XTestPackage.XASSERT_EXPRESSION__THROWS, oldThrows, newThrows);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setThrows(JvmTypeReference newThrows)
  {
    if (newThrows != throws_)
    {
      NotificationChain msgs = null;
      if (throws_ != null)
        msgs = ((InternalEObject)throws_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XTestPackage.XASSERT_EXPRESSION__THROWS, null, msgs);
      if (newThrows != null)
        msgs = ((InternalEObject)newThrows).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XTestPackage.XASSERT_EXPRESSION__THROWS, null, msgs);
      msgs = basicSetThrows(newThrows, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XTestPackage.XASSERT_EXPRESSION__THROWS, newThrows, newThrows));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XTestPackage.XASSERT_EXPRESSION__ACTUAL:
        return basicSetActual(null, msgs);
      case XTestPackage.XASSERT_EXPRESSION__THROWS:
        return basicSetThrows(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case XTestPackage.XASSERT_EXPRESSION__ACTUAL:
        return getActual();
      case XTestPackage.XASSERT_EXPRESSION__THROWS:
        return getThrows();
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
      case XTestPackage.XASSERT_EXPRESSION__ACTUAL:
        setActual((XExpression)newValue);
        return;
      case XTestPackage.XASSERT_EXPRESSION__THROWS:
        setThrows((JvmTypeReference)newValue);
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
      case XTestPackage.XASSERT_EXPRESSION__ACTUAL:
        setActual((XExpression)null);
        return;
      case XTestPackage.XASSERT_EXPRESSION__THROWS:
        setThrows((JvmTypeReference)null);
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
      case XTestPackage.XASSERT_EXPRESSION__ACTUAL:
        return actual != null;
      case XTestPackage.XASSERT_EXPRESSION__THROWS:
        return throws_ != null;
    }
    return super.eIsSet(featureID);
  }

} //XAssertExpressionImpl
