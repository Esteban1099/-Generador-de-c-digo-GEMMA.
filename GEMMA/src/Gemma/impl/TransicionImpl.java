/**
 */
package Gemma.impl;

import Gemma.ExpresionBinaria;
import Gemma.GemmaPackage;
import Gemma.Transicion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transicion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gemma.impl.TransicionImpl#getExpresionBinaria <em>Expresion Binaria</em>}</li>
 *   <li>{@link Gemma.impl.TransicionImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransicionImpl extends MinimalEObjectImpl.Container implements Transicion {
	/**
	 * The cached value of the '{@link #getExpresionBinaria() <em>Expresion Binaria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpresionBinaria()
	 * @generated
	 * @ordered
	 */
	protected ExpresionBinaria expresionBinaria;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransicionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemmaPackage.Literals.TRANSICION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpresionBinaria getExpresionBinaria() {
		return expresionBinaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpresionBinaria(ExpresionBinaria newExpresionBinaria, NotificationChain msgs) {
		ExpresionBinaria oldExpresionBinaria = expresionBinaria;
		expresionBinaria = newExpresionBinaria;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemmaPackage.TRANSICION__EXPRESION_BINARIA, oldExpresionBinaria, newExpresionBinaria);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpresionBinaria(ExpresionBinaria newExpresionBinaria) {
		if (newExpresionBinaria != expresionBinaria) {
			NotificationChain msgs = null;
			if (expresionBinaria != null)
				msgs = ((InternalEObject)expresionBinaria).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GemmaPackage.TRANSICION__EXPRESION_BINARIA, null, msgs);
			if (newExpresionBinaria != null)
				msgs = ((InternalEObject)newExpresionBinaria).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GemmaPackage.TRANSICION__EXPRESION_BINARIA, null, msgs);
			msgs = basicSetExpresionBinaria(newExpresionBinaria, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.TRANSICION__EXPRESION_BINARIA, newExpresionBinaria, newExpresionBinaria));
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
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.TRANSICION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemmaPackage.TRANSICION__EXPRESION_BINARIA:
				return basicSetExpresionBinaria(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GemmaPackage.TRANSICION__EXPRESION_BINARIA:
				return getExpresionBinaria();
			case GemmaPackage.TRANSICION__NAME:
				return getName();
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
			case GemmaPackage.TRANSICION__EXPRESION_BINARIA:
				setExpresionBinaria((ExpresionBinaria)newValue);
				return;
			case GemmaPackage.TRANSICION__NAME:
				setName((String)newValue);
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
			case GemmaPackage.TRANSICION__EXPRESION_BINARIA:
				setExpresionBinaria((ExpresionBinaria)null);
				return;
			case GemmaPackage.TRANSICION__NAME:
				setName(NAME_EDEFAULT);
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
			case GemmaPackage.TRANSICION__EXPRESION_BINARIA:
				return expresionBinaria != null;
			case GemmaPackage.TRANSICION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //TransicionImpl
