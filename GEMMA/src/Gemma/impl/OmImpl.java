/**
 */
package Gemma.impl;

import Gemma.GemmaPackage;
import Gemma.Om;
import Gemma.TipoOm;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Om</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gemma.impl.OmImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gemma.impl.OmImpl#getTipo <em>Tipo</em>}</li>
 *   <li>{@link Gemma.impl.OmImpl#isEsOmRaiz <em>Es Om Raiz</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OmImpl extends MinimalEObjectImpl.Container implements Om {
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
	 * The default value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected static final TipoOm TIPO_EDEFAULT = TipoOm.A1;

	/**
	 * The cached value of the '{@link #getTipo() <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTipo()
	 * @generated
	 * @ordered
	 */
	protected TipoOm tipo = TIPO_EDEFAULT;

	/**
	 * The default value of the '{@link #isEsOmRaiz() <em>Es Om Raiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsOmRaiz()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ES_OM_RAIZ_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEsOmRaiz() <em>Es Om Raiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEsOmRaiz()
	 * @generated
	 * @ordered
	 */
	protected boolean esOmRaiz = ES_OM_RAIZ_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemmaPackage.Literals.OM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.OM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoOm getTipo() {
		return tipo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTipo(TipoOm newTipo) {
		TipoOm oldTipo = tipo;
		tipo = newTipo == null ? TIPO_EDEFAULT : newTipo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.OM__TIPO, oldTipo, tipo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEsOmRaiz() {
		return esOmRaiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEsOmRaiz(boolean newEsOmRaiz) {
		boolean oldEsOmRaiz = esOmRaiz;
		esOmRaiz = newEsOmRaiz;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.OM__ES_OM_RAIZ, oldEsOmRaiz, esOmRaiz));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GemmaPackage.OM__NAME:
				return getName();
			case GemmaPackage.OM__TIPO:
				return getTipo();
			case GemmaPackage.OM__ES_OM_RAIZ:
				return isEsOmRaiz();
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
			case GemmaPackage.OM__NAME:
				setName((String)newValue);
				return;
			case GemmaPackage.OM__TIPO:
				setTipo((TipoOm)newValue);
				return;
			case GemmaPackage.OM__ES_OM_RAIZ:
				setEsOmRaiz((Boolean)newValue);
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
			case GemmaPackage.OM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GemmaPackage.OM__TIPO:
				setTipo(TIPO_EDEFAULT);
				return;
			case GemmaPackage.OM__ES_OM_RAIZ:
				setEsOmRaiz(ES_OM_RAIZ_EDEFAULT);
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
			case GemmaPackage.OM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GemmaPackage.OM__TIPO:
				return tipo != TIPO_EDEFAULT;
			case GemmaPackage.OM__ES_OM_RAIZ:
				return esOmRaiz != ES_OM_RAIZ_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", tipo: ");
		result.append(tipo);
		result.append(", esOmRaiz: ");
		result.append(esOmRaiz);
		result.append(')');
		return result.toString();
	}

} //OmImpl
