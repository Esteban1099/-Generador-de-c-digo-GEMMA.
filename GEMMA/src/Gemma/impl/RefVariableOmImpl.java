/**
 */
package Gemma.impl;

import Gemma.GemmaPackage;
import Gemma.RefVariableOm;
import Gemma.VariableOm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Variable Om</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gemma.impl.RefVariableOmImpl#getVariableOm <em>Variable Om</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefVariableOmImpl extends ElementoExpresionImpl implements RefVariableOm {
	/**
	 * The cached value of the '{@link #getVariableOm() <em>Variable Om</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableOm()
	 * @generated
	 * @ordered
	 */
	protected VariableOm variableOm;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefVariableOmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemmaPackage.Literals.REF_VARIABLE_OM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableOm getVariableOm() {
		if (variableOm != null && variableOm.eIsProxy()) {
			InternalEObject oldVariableOm = (InternalEObject)variableOm;
			variableOm = (VariableOm)eResolveProxy(oldVariableOm);
			if (variableOm != oldVariableOm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemmaPackage.REF_VARIABLE_OM__VARIABLE_OM, oldVariableOm, variableOm));
			}
		}
		return variableOm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableOm basicGetVariableOm() {
		return variableOm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVariableOm(VariableOm newVariableOm) {
		VariableOm oldVariableOm = variableOm;
		variableOm = newVariableOm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.REF_VARIABLE_OM__VARIABLE_OM, oldVariableOm, variableOm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GemmaPackage.REF_VARIABLE_OM__VARIABLE_OM:
				if (resolve) return getVariableOm();
				return basicGetVariableOm();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GemmaPackage.REF_VARIABLE_OM__VARIABLE_OM:
				setVariableOm((VariableOm)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case GemmaPackage.REF_VARIABLE_OM__VARIABLE_OM:
				setVariableOm((VariableOm)null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GemmaPackage.REF_VARIABLE_OM__VARIABLE_OM:
				return variableOm != null;
		}
		return super.eIsSet(featureID);
	}

} //RefVariableOmImpl
