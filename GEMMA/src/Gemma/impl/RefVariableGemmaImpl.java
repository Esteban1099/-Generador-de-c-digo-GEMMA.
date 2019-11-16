/**
 */
package Gemma.impl;

import Gemma.GemmaPackage;
import Gemma.RefVariableGemma;
import Gemma.VariableGemma;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Variable Gemma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gemma.impl.RefVariableGemmaImpl#getVariableGemma <em>Variable Gemma</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefVariableGemmaImpl extends ElementoExpresionImpl implements RefVariableGemma {
	/**
	 * The cached value of the '{@link #getVariableGemma() <em>Variable Gemma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableGemma()
	 * @generated
	 * @ordered
	 */
	protected VariableGemma variableGemma;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefVariableGemmaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemmaPackage.Literals.REF_VARIABLE_GEMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableGemma getVariableGemma() {
		if (variableGemma != null && variableGemma.eIsProxy()) {
			InternalEObject oldVariableGemma = (InternalEObject)variableGemma;
			variableGemma = (VariableGemma)eResolveProxy(oldVariableGemma);
			if (variableGemma != oldVariableGemma) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemmaPackage.REF_VARIABLE_GEMMA__VARIABLE_GEMMA, oldVariableGemma, variableGemma));
			}
		}
		return variableGemma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableGemma basicGetVariableGemma() {
		return variableGemma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableGemma(VariableGemma newVariableGemma) {
		VariableGemma oldVariableGemma = variableGemma;
		variableGemma = newVariableGemma;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.REF_VARIABLE_GEMMA__VARIABLE_GEMMA, oldVariableGemma, variableGemma));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GemmaPackage.REF_VARIABLE_GEMMA__VARIABLE_GEMMA:
				if (resolve) return getVariableGemma();
				return basicGetVariableGemma();
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
			case GemmaPackage.REF_VARIABLE_GEMMA__VARIABLE_GEMMA:
				setVariableGemma((VariableGemma)newValue);
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
			case GemmaPackage.REF_VARIABLE_GEMMA__VARIABLE_GEMMA:
				setVariableGemma((VariableGemma)null);
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
			case GemmaPackage.REF_VARIABLE_GEMMA__VARIABLE_GEMMA:
				return variableGemma != null;
		}
		return super.eIsSet(featureID);
	}

} //RefVariableGemmaImpl
