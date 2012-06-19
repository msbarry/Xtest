/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtest.xTest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmTypeReference;

import org.eclipse.xtext.xbase.XExpression;

import org.eclipse.xtext.xbase.impl.XExpressionImpl;

import org.xtest.xTest.XMethodDef;
import org.xtest.xTest.XTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XMethod Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtest.xTest.impl.XMethodDefImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link org.xtest.xTest.impl.XMethodDefImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link org.xtest.xTest.impl.XMethodDefImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.xtest.xTest.impl.XMethodDefImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtest.xTest.impl.XMethodDefImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtest.xTest.impl.XMethodDefImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMethodDefImpl extends XExpressionImpl implements XMethodDef
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
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<JvmTypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected JvmTypeReference returnType;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<JvmFormalParameter> parameters;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected XExpression expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMethodDefImpl()
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
		return XTestPackage.Literals.XMETHOD_DEF;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XTestPackage.XMETHOD_DEF__STATIC, oldStatic, static_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmTypeParameter> getTypeParameters()
	{
		if (typeParameters == null)
		{
			typeParameters = new EObjectContainmentEList<JvmTypeParameter>(JvmTypeParameter.class, this, XTestPackage.XMETHOD_DEF__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmTypeReference getReturnType()
	{
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType(JvmTypeReference newReturnType, NotificationChain msgs)
	{
		JvmTypeReference oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XTestPackage.XMETHOD_DEF__RETURN_TYPE, oldReturnType, newReturnType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(JvmTypeReference newReturnType)
	{
		if (newReturnType != returnType)
		{
			NotificationChain msgs = null;
			if (returnType != null)
				msgs = ((InternalEObject)returnType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XTestPackage.XMETHOD_DEF__RETURN_TYPE, null, msgs);
			if (newReturnType != null)
				msgs = ((InternalEObject)newReturnType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XTestPackage.XMETHOD_DEF__RETURN_TYPE, null, msgs);
			msgs = basicSetReturnType(newReturnType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XTestPackage.XMETHOD_DEF__RETURN_TYPE, newReturnType, newReturnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName)
	{
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XTestPackage.XMETHOD_DEF__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<JvmFormalParameter> getParameters()
	{
		if (parameters == null)
		{
			parameters = new EObjectContainmentEList<JvmFormalParameter>(JvmFormalParameter.class, this, XTestPackage.XMETHOD_DEF__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XExpression getExpression()
	{
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(XExpression newExpression, NotificationChain msgs)
	{
		XExpression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, XTestPackage.XMETHOD_DEF__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(XExpression newExpression)
	{
		if (newExpression != expression)
		{
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - XTestPackage.XMETHOD_DEF__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - XTestPackage.XMETHOD_DEF__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XTestPackage.XMETHOD_DEF__EXPRESSION, newExpression, newExpression));
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
			case XTestPackage.XMETHOD_DEF__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case XTestPackage.XMETHOD_DEF__RETURN_TYPE:
				return basicSetReturnType(null, msgs);
			case XTestPackage.XMETHOD_DEF__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case XTestPackage.XMETHOD_DEF__EXPRESSION:
				return basicSetExpression(null, msgs);
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
			case XTestPackage.XMETHOD_DEF__STATIC:
				return isStatic();
			case XTestPackage.XMETHOD_DEF__TYPE_PARAMETERS:
				return getTypeParameters();
			case XTestPackage.XMETHOD_DEF__RETURN_TYPE:
				return getReturnType();
			case XTestPackage.XMETHOD_DEF__NAME:
				return getName();
			case XTestPackage.XMETHOD_DEF__PARAMETERS:
				return getParameters();
			case XTestPackage.XMETHOD_DEF__EXPRESSION:
				return getExpression();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case XTestPackage.XMETHOD_DEF__STATIC:
				setStatic((Boolean)newValue);
				return;
			case XTestPackage.XMETHOD_DEF__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends JvmTypeParameter>)newValue);
				return;
			case XTestPackage.XMETHOD_DEF__RETURN_TYPE:
				setReturnType((JvmTypeReference)newValue);
				return;
			case XTestPackage.XMETHOD_DEF__NAME:
				setName((String)newValue);
				return;
			case XTestPackage.XMETHOD_DEF__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends JvmFormalParameter>)newValue);
				return;
			case XTestPackage.XMETHOD_DEF__EXPRESSION:
				setExpression((XExpression)newValue);
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
			case XTestPackage.XMETHOD_DEF__STATIC:
				setStatic(STATIC_EDEFAULT);
				return;
			case XTestPackage.XMETHOD_DEF__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case XTestPackage.XMETHOD_DEF__RETURN_TYPE:
				setReturnType((JvmTypeReference)null);
				return;
			case XTestPackage.XMETHOD_DEF__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XTestPackage.XMETHOD_DEF__PARAMETERS:
				getParameters().clear();
				return;
			case XTestPackage.XMETHOD_DEF__EXPRESSION:
				setExpression((XExpression)null);
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
			case XTestPackage.XMETHOD_DEF__STATIC:
				return static_ != STATIC_EDEFAULT;
			case XTestPackage.XMETHOD_DEF__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case XTestPackage.XMETHOD_DEF__RETURN_TYPE:
				return returnType != null;
			case XTestPackage.XMETHOD_DEF__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XTestPackage.XMETHOD_DEF__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case XTestPackage.XMETHOD_DEF__EXPRESSION:
				return expression != null;
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //XMethodDefImpl
