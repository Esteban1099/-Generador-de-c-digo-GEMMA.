/**
 */
package Gemma.util;

import Gemma.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Gemma.GemmaPackage
 * @generated
 */
public class GemmaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GemmaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemmaSwitch() {
		if (modelPackage == null) {
			modelPackage = GemmaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GemmaPackage.GEMMA: {
				Gemma gemma = (Gemma)theEObject;
				T result = caseGemma(gemma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemmaPackage.MACRO_OM: {
				MacroOm macroOm = (MacroOm)theEObject;
				T result = caseMacroOm(macroOm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemmaPackage.OM: {
				Om om = (Om)theEObject;
				T result = caseOm(om);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemmaPackage.TRASICION_ENTRE_OM_OM: {
				TrasicionEntreOmOm trasicionEntreOmOm = (TrasicionEntreOmOm)theEObject;
				T result = caseTrasicionEntreOmOm(trasicionEntreOmOm);
				if (result == null) result = caseTransicion(trasicionEntreOmOm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM: {
				TransicionEntreMacroOmOm transicionEntreMacroOmOm = (TransicionEntreMacroOmOm)theEObject;
				T result = caseTransicionEntreMacroOmOm(transicionEntreMacroOmOm);
				if (result == null) result = caseTransicion(transicionEntreMacroOmOm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemmaPackage.EXPRESION_BINARIA: {
				ExpresionBinaria expresionBinaria = (ExpresionBinaria)theEObject;
				T result = caseExpresionBinaria(expresionBinaria);
				if (result == null) result = caseElementoExpresion(expresionBinaria);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemmaPackage.ELEMENTO_EXPRESION: {
				ElementoExpresion elementoExpresion = (ElementoExpresion)theEObject;
				T result = caseElementoExpresion(elementoExpresion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemmaPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = caseElementoExpresion(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GemmaPackage.TRANSICION: {
				Transicion transicion = (Transicion)theEObject;
				T result = caseTransicion(transicion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gemma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gemma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGemma(Gemma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macro Om</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macro Om</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacroOm(MacroOm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Om</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Om</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOm(Om object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trasicion Entre Om Om</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trasicion Entre Om Om</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrasicionEntreOmOm(TrasicionEntreOmOm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transicion Entre Macro Om Om</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transicion Entre Macro Om Om</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransicionEntreMacroOmOm(TransicionEntreMacroOmOm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expresion Binaria</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expresion Binaria</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpresionBinaria(ExpresionBinaria object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elemento Expresion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elemento Expresion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElementoExpresion(ElementoExpresion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transicion</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transicion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransicion(Transicion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GemmaSwitch
