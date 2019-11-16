/**
 */
package Gemma.impl;

import Gemma.ElementoExpresion;
import Gemma.ExpresionBinaria;
import Gemma.GemmaPackage;
import Gemma.TipoOperador;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expresion Binaria</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gemma.impl.ExpresionBinariaImpl#getExpresionIzquierda <em>Expresion Izquierda</em>}</li>
 *   <li>{@link Gemma.impl.ExpresionBinariaImpl#getExpresionDerecha <em>Expresion Derecha</em>}</li>
 *   <li>{@link Gemma.impl.ExpresionBinariaImpl#getOperador <em>Operador</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpresionBinariaImpl extends ElementoExpresionImpl implements ExpresionBinaria {
	/**
	 * The cached value of the '{@link #getExpresionIzquierda() <em>Expresion Izquierda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpresionIzquierda()
	 * @generated
	 * @ordered
	 */
	protected ElementoExpresion expresionIzquierda;

	/**
	 * The cached value of the '{@link #getExpresionDerecha() <em>Expresion Derecha</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpresionDerecha()
	 * @generated
	 * @ordered
	 */
	protected ElementoExpresion expresionDerecha;

	/**
	 * The default value of the '{@link #getOperador() <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected static final TipoOperador OPERADOR_EDEFAULT = TipoOperador.AND;

	/**
	 * The cached value of the '{@link #getOperador() <em>Operador</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperador()
	 * @generated
	 * @ordered
	 */
	protected TipoOperador operador = OPERADOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpresionBinariaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemmaPackage.Literals.EXPRESION_BINARIA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoExpresion getExpresionIzquierda() {
		return expresionIzquierda;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpresionIzquierda(ElementoExpresion newExpresionIzquierda, NotificationChain msgs) {
		ElementoExpresion oldExpresionIzquierda = expresionIzquierda;
		expresionIzquierda = newExpresionIzquierda;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemmaPackage.EXPRESION_BINARIA__EXPRESION_IZQUIERDA, oldExpresionIzquierda, newExpresionIzquierda);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpresionIzquierda(ElementoExpresion newExpresionIzquierda) {
		if (newExpresionIzquierda != expresionIzquierda) {
			NotificationChain msgs = null;
			if (expresionIzquierda != null)
				msgs = ((InternalEObject)expresionIzquierda).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GemmaPackage.EXPRESION_BINARIA__EXPRESION_IZQUIERDA, null, msgs);
			if (newExpresionIzquierda != null)
				msgs = ((InternalEObject)newExpresionIzquierda).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GemmaPackage.EXPRESION_BINARIA__EXPRESION_IZQUIERDA, null, msgs);
			msgs = basicSetExpresionIzquierda(newExpresionIzquierda, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.EXPRESION_BINARIA__EXPRESION_IZQUIERDA, newExpresionIzquierda, newExpresionIzquierda));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoExpresion getExpresionDerecha() {
		return expresionDerecha;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpresionDerecha(ElementoExpresion newExpresionDerecha, NotificationChain msgs) {
		ElementoExpresion oldExpresionDerecha = expresionDerecha;
		expresionDerecha = newExpresionDerecha;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GemmaPackage.EXPRESION_BINARIA__EXPRESION_DERECHA, oldExpresionDerecha, newExpresionDerecha);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpresionDerecha(ElementoExpresion newExpresionDerecha) {
		if (newExpresionDerecha != expresionDerecha) {
			NotificationChain msgs = null;
			if (expresionDerecha != null)
				msgs = ((InternalEObject)expresionDerecha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GemmaPackage.EXPRESION_BINARIA__EXPRESION_DERECHA, null, msgs);
			if (newExpresionDerecha != null)
				msgs = ((InternalEObject)newExpresionDerecha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GemmaPackage.EXPRESION_BINARIA__EXPRESION_DERECHA, null, msgs);
			msgs = basicSetExpresionDerecha(newExpresionDerecha, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.EXPRESION_BINARIA__EXPRESION_DERECHA, newExpresionDerecha, newExpresionDerecha));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoOperador getOperador() {
		return operador;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperador(TipoOperador newOperador) {
		TipoOperador oldOperador = operador;
		operador = newOperador == null ? OPERADOR_EDEFAULT : newOperador;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GemmaPackage.EXPRESION_BINARIA__OPERADOR, oldOperador, operador));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemmaPackage.EXPRESION_BINARIA__EXPRESION_IZQUIERDA:
				return basicSetExpresionIzquierda(null, msgs);
			case GemmaPackage.EXPRESION_BINARIA__EXPRESION_DERECHA:
				return basicSetExpresionDerecha(null, msgs);
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
			case GemmaPackage.EXPRESION_BINARIA__EXPRESION_IZQUIERDA:
				return getExpresionIzquierda();
			case GemmaPackage.EXPRESION_BINARIA__EXPRESION_DERECHA:
				return getExpresionDerecha();
			case GemmaPackage.EXPRESION_BINARIA__OPERADOR:
				return getOperador();
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
			case GemmaPackage.EXPRESION_BINARIA__EXPRESION_IZQUIERDA:
				setExpresionIzquierda((ElementoExpresion)newValue);
				return;
			case GemmaPackage.EXPRESION_BINARIA__EXPRESION_DERECHA:
				setExpresionDerecha((ElementoExpresion)newValue);
				return;
			case GemmaPackage.EXPRESION_BINARIA__OPERADOR:
				setOperador((TipoOperador)newValue);
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
			case GemmaPackage.EXPRESION_BINARIA__EXPRESION_IZQUIERDA:
				setExpresionIzquierda((ElementoExpresion)null);
				return;
			case GemmaPackage.EXPRESION_BINARIA__EXPRESION_DERECHA:
				setExpresionDerecha((ElementoExpresion)null);
				return;
			case GemmaPackage.EXPRESION_BINARIA__OPERADOR:
				setOperador(OPERADOR_EDEFAULT);
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
			case GemmaPackage.EXPRESION_BINARIA__EXPRESION_IZQUIERDA:
				return expresionIzquierda != null;
			case GemmaPackage.EXPRESION_BINARIA__EXPRESION_DERECHA:
				return expresionDerecha != null;
			case GemmaPackage.EXPRESION_BINARIA__OPERADOR:
				return operador != OPERADOR_EDEFAULT;
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
		result.append(" (operador: ");
		result.append(operador);
		result.append(')');
		return result.toString();
	}

} //ExpresionBinariaImpl
