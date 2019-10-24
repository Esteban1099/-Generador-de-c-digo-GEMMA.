/**
 */
package Gemma.impl;

import Gemma.Gemma;
import Gemma.GemmaPackage;
import Gemma.MacroOm;
import Gemma.Transicion;
import Gemma.Variable;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gemma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Gemma.impl.GemmaImpl#getMacroOms <em>Macro Oms</em>}</li>
 *   <li>{@link Gemma.impl.GemmaImpl#getTransiciones <em>Transiciones</em>}</li>
 *   <li>{@link Gemma.impl.GemmaImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GemmaImpl extends MinimalEObjectImpl.Container implements Gemma {
	/**
	 * The cached value of the '{@link #getMacroOms() <em>Macro Oms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMacroOms()
	 * @generated
	 * @ordered
	 */
	protected EList<MacroOm> macroOms;

	/**
	 * The cached value of the '{@link #getTransiciones() <em>Transiciones</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransiciones()
	 * @generated
	 * @ordered
	 */
	protected EList<Transicion> transiciones;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GemmaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GemmaPackage.Literals.GEMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MacroOm> getMacroOms() {
		if (macroOms == null) {
			macroOms = new EObjectContainmentEList<MacroOm>(MacroOm.class, this, GemmaPackage.GEMMA__MACRO_OMS);
		}
		return macroOms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transicion> getTransiciones() {
		if (transiciones == null) {
			transiciones = new EObjectContainmentEList<Transicion>(Transicion.class, this, GemmaPackage.GEMMA__TRANSICIONES);
		}
		return transiciones;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectResolvingEList<Variable>(Variable.class, this, GemmaPackage.GEMMA__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GemmaPackage.GEMMA__MACRO_OMS:
				return ((InternalEList<?>)getMacroOms()).basicRemove(otherEnd, msgs);
			case GemmaPackage.GEMMA__TRANSICIONES:
				return ((InternalEList<?>)getTransiciones()).basicRemove(otherEnd, msgs);
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
			case GemmaPackage.GEMMA__MACRO_OMS:
				return getMacroOms();
			case GemmaPackage.GEMMA__TRANSICIONES:
				return getTransiciones();
			case GemmaPackage.GEMMA__VARIABLES:
				return getVariables();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GemmaPackage.GEMMA__MACRO_OMS:
				getMacroOms().clear();
				getMacroOms().addAll((Collection<? extends MacroOm>)newValue);
				return;
			case GemmaPackage.GEMMA__TRANSICIONES:
				getTransiciones().clear();
				getTransiciones().addAll((Collection<? extends Transicion>)newValue);
				return;
			case GemmaPackage.GEMMA__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
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
			case GemmaPackage.GEMMA__MACRO_OMS:
				getMacroOms().clear();
				return;
			case GemmaPackage.GEMMA__TRANSICIONES:
				getTransiciones().clear();
				return;
			case GemmaPackage.GEMMA__VARIABLES:
				getVariables().clear();
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
			case GemmaPackage.GEMMA__MACRO_OMS:
				return macroOms != null && !macroOms.isEmpty();
			case GemmaPackage.GEMMA__TRANSICIONES:
				return transiciones != null && !transiciones.isEmpty();
			case GemmaPackage.GEMMA__VARIABLES:
				return variables != null && !variables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GemmaImpl
