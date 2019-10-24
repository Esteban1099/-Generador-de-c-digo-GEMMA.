/**
 */
package Gemma.impl;

import Gemma.GemmaPackage;
import Gemma.MacroOm;
import Gemma.Om;
import Gemma.TransicionEntreMacroOmOm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transicion Entre Macro Om Om</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gemma.impl.TransicionEntreMacroOmOmImpl#getOrigen <em>Origen</em>}</li>
 *   <li>{@link Gemma.impl.TransicionEntreMacroOmOmImpl#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransicionEntreMacroOmOmImpl extends TransicionImpl implements TransicionEntreMacroOmOm {
	/**
	 * The cached value of the '{@link #getOrigen() <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigen()
	 * @generated
	 * @ordered
	 */
	protected MacroOm origen;

	/**
	 * The cached value of the '{@link #getDestino() <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestino()
	 * @generated
	 * @ordered
	 */
	protected Om destino;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransicionEntreMacroOmOmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemmaPackage.Literals.TRANSICION_ENTRE_MACRO_OM_OM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroOm getOrigen() {
		if (origen != null && origen.eIsProxy()) {
			InternalEObject oldOrigen = (InternalEObject)origen;
			origen = (MacroOm)eResolveProxy(oldOrigen);
			if (origen != oldOrigen) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM__ORIGEN, oldOrigen, origen));
			}
		}
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroOm basicGetOrigen() {
		return origen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigen(MacroOm newOrigen) {
		MacroOm oldOrigen = origen;
		origen = newOrigen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM__ORIGEN, oldOrigen, origen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Om getDestino() {
		if (destino != null && destino.eIsProxy()) {
			InternalEObject oldDestino = (InternalEObject)destino;
			destino = (Om)eResolveProxy(oldDestino);
			if (destino != oldDestino) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM__DESTINO, oldDestino, destino));
			}
		}
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Om basicGetDestino() {
		return destino;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestino(Om newDestino) {
		Om oldDestino = destino;
		destino = newDestino;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM__DESTINO, oldDestino, destino));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM__ORIGEN:
				if (resolve) return getOrigen();
				return basicGetOrigen();
			case GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM__DESTINO:
				if (resolve) return getDestino();
				return basicGetDestino();
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
			case GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM__ORIGEN:
				setOrigen((MacroOm)newValue);
				return;
			case GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM__DESTINO:
				setDestino((Om)newValue);
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
			case GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM__ORIGEN:
				setOrigen((MacroOm)null);
				return;
			case GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM__DESTINO:
				setDestino((Om)null);
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
			case GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM__ORIGEN:
				return origen != null;
			case GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM__DESTINO:
				return destino != null;
		}
		return super.eIsSet(featureID);
	}

} //TransicionEntreMacroOmOmImpl
