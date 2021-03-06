/**
 */
package org.xtest.xTest.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtend.core.xtend.XtendImport;

import org.eclipse.xtext.xbase.impl.XBlockExpressionImpl;

import org.xtest.xTest.Body;
import org.xtest.xTest.FileParam;
import org.xtest.xTest.XTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtest.xTest.impl.BodyImpl#getFileparam <em>Fileparam</em>}</li>
 *   <li>{@link org.xtest.xTest.impl.BodyImpl#getImports <em>Imports</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BodyImpl extends XBlockExpressionImpl implements Body
{
	/**
	 * The cached value of the '{@link #getFileparam() <em>Fileparam</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileparam()
	 * @generated
	 * @ordered
	 */
	protected EList<FileParam> fileparam;

	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected EList<XtendImport> imports;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BodyImpl()
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
		return XTestPackage.Literals.BODY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileParam> getFileparam()
	{
		if (fileparam == null)
		{
			fileparam = new EObjectContainmentEList<FileParam>(FileParam.class, this, XTestPackage.BODY__FILEPARAM);
		}
		return fileparam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XtendImport> getImports()
	{
		if (imports == null)
		{
			imports = new EObjectContainmentEList<XtendImport>(XtendImport.class, this, XTestPackage.BODY__IMPORTS);
		}
		return imports;
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
			case XTestPackage.BODY__FILEPARAM:
				return ((InternalEList<?>)getFileparam()).basicRemove(otherEnd, msgs);
			case XTestPackage.BODY__IMPORTS:
				return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
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
			case XTestPackage.BODY__FILEPARAM:
				return getFileparam();
			case XTestPackage.BODY__IMPORTS:
				return getImports();
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
			case XTestPackage.BODY__FILEPARAM:
				getFileparam().clear();
				getFileparam().addAll((Collection<? extends FileParam>)newValue);
				return;
			case XTestPackage.BODY__IMPORTS:
				getImports().clear();
				getImports().addAll((Collection<? extends XtendImport>)newValue);
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
			case XTestPackage.BODY__FILEPARAM:
				getFileparam().clear();
				return;
			case XTestPackage.BODY__IMPORTS:
				getImports().clear();
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
			case XTestPackage.BODY__FILEPARAM:
				return fileparam != null && !fileparam.isEmpty();
			case XTestPackage.BODY__IMPORTS:
				return imports != null && !imports.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BodyImpl
