/**
 */
package Gemma.impl;

import Gemma.ElementoExpresion;
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
 *   <li>{@link Gemma.impl.TransicionImpl#getName <em>Name</em>}</li>
 *   <li>{@link Gemma.impl.TransicionImpl#getElementoExpresion <em>Elemento Expresion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransicionImpl extends MinimalEObjectImpl.Container implements Transicion {
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
	 * The cached value of the '{@link #getElementoExpresion() <em>Elemento Expresion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementoExpresion()
	 * @generated
	 * @ordered
	 */
	protected ElementoExpresion elementoExpresion;

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
	public ElementoExpresion getElementoExpresion() {
		return elementoExpresion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElementoExpresion(ElementoExpresion newElementoExpresion, NotificationChain msgs) {
		ElementoExpresion oldElementoExpresion = elementoExpresion;
		elementoExpresion = newElementoExpresion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemmaPackage.TRANSICION__ELEMENTO_EXPRESION, oldElementoExpresion, newElementoExpresion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementoExpresion(ElementoExpresion newElementoExpresion) {
		if (newElementoExpresion != elementoExpresion) {
			NotificationChain msgs = null;
			if (elementoExpresion != null)
				msgs = ((InternalEObject)elementoExpresion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GemmaPackage.TRANSICION__ELEMENTO_EXPRESION, null, msgs);
			if (newElementoExpresion != null)
				msgs = ((InternalEObject)newElementoExpresion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GemmaPackage.TRANSICION__ELEMENTO_EXPRESION, null, msgs);
			msgs = basicSetElementoExpresion(newElementoExpresion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.TRANSICION__ELEMENTO_EXPRESION, newElementoExpresion, newElementoExpresion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemmaPackage.TRANSICION__ELEMENTO_EXPRESION:
				return basicSetElementoExpresion(null, msgs);
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
			case GemmaPackage.TRANSICION__NAME:
				return getName();
			case GemmaPackage.TRANSICION__ELEMENTO_EXPRESION:
				return getElementoExpresion();
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
			case GemmaPackage.TRANSICION__NAME:
				setName((String)newValue);
				return;
			case GemmaPackage.TRANSICION__ELEMENTO_EXPRESION:
				setElementoExpresion((ElementoExpresion)newValue);
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
			case GemmaPackage.TRANSICION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GemmaPackage.TRANSICION__ELEMENTO_EXPRESION:
				setElementoExpresion((ElementoExpresion)null);
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
			case GemmaPackage.TRANSICION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case GemmaPackage.TRANSICION__ELEMENTO_EXPRESION:
				return elementoExpresion != null;
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
