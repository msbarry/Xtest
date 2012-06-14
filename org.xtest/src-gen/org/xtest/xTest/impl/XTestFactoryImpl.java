/**
 * <copyright>
 * </copyright>
 *

 */
package org.xtest.xTest.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtest.xTest.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XTestFactoryImpl extends EFactoryImpl implements XTestFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static XTestFactory init()
	{
		try
		{
			XTestFactory theXTestFactory = (XTestFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.xtest.org/"); 
			if (theXTestFactory != null)
			{
				return theXTestFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new XTestFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTestFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case XTestPackage.FILE_PARAM: return createFileParam();
			case XTestPackage.UNIQUE_NAME: return createUniqueName();
			case XTestPackage.BODY: return createBody();
			case XTestPackage.XTEST_EXPRESSION: return createXTestExpression();
			case XTestPackage.PARAMETER: return createParameter();
			case XTestPackage.JVM_VAR_ARG_ARRAY: return createJvmVarArgArray();
			case XTestPackage.XMETHOD_DEF: return createXMethodDef();
			case XTestPackage.XASSERT_EXPRESSION: return createXAssertExpression();
			case XTestPackage.XSAFE_EXPRESSION: return createXSafeExpression();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileParam createFileParam()
	{
		FileParamImpl fileParam = new FileParamImpl();
		return fileParam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueName createUniqueName()
	{
		UniqueNameImpl uniqueName = new UniqueNameImpl();
		return uniqueName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Body createBody()
	{
		BodyImplCustom body = new BodyImplCustom();
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTestExpression createXTestExpression()
	{
		XTestExpressionImpl xTestExpression = new XTestExpressionImpl();
		return xTestExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter()
	{
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JvmVarArgArray createJvmVarArgArray()
	{
		JvmVarArgArrayImplCustom jvmVarArgArray = new JvmVarArgArrayImplCustom();
		return jvmVarArgArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMethodDef createXMethodDef()
	{
		XMethodDefImpl xMethodDef = new XMethodDefImpl();
		return xMethodDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XAssertExpression createXAssertExpression()
	{
		XAssertExpressionImpl xAssertExpression = new XAssertExpressionImpl();
		return xAssertExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSafeExpression createXSafeExpression()
	{
		XSafeExpressionImpl xSafeExpression = new XSafeExpressionImpl();
		return xSafeExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTestPackage getXTestPackage()
	{
		return (XTestPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static XTestPackage getPackage()
	{
		return XTestPackage.eINSTANCE;
	}

} //XTestFactoryImpl
