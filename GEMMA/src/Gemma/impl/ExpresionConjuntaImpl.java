/**
 */
package Gemma.impl;

import Gemma.ElementoExpresion;
import Gemma.ExpresionConjunta;
import Gemma.GemmaPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expresion Conjunta</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gemma.impl.ExpresionConjuntaImpl#getElementoExpresion <em>Elemento Expresion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpresionConjuntaImpl extends ElementoExpresionImpl implements ExpresionConjunta {
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
	protected ExpresionConjuntaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemmaPackage.Literals.EXPRESION_CONJUNTA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemmaPackage.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION, oldElementoExpresion, newElementoExpresion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setElementoExpresion(ElementoExpresion newElementoExpresion) {
		if (newElementoExpresion != elementoExpresion) {
			NotificationChain msgs = null;
			if (elementoExpresion != null)
				msgs = ((InternalEObject)elementoExpresion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GemmaPackage.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION, null, msgs);
			if (newElementoExpresion != null)
				msgs = ((InternalEObject)newElementoExpresion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GemmaPackage.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION, null, msgs);
			msgs = basicSetElementoExpresion(newElementoExpresion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION, newElementoExpresion, newElementoExpresion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemmaPackage.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION:
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
			case GemmaPackage.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION:
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
			case GemmaPackage.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION:
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
			case GemmaPackage.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION:
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
			case GemmaPackage.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION:
				return elementoExpresion != null;
		}
		return super.eIsSet(featureID);
	}

} //ExpresionConjuntaImpl
