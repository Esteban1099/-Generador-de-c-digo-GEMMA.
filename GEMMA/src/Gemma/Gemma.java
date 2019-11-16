/**
 */
package Gemma;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gemma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gemma.Gemma#getMacroOms <em>Macro Oms</em>}</li>
 *   <li>{@link Gemma.Gemma#getTransiciones <em>Transiciones</em>}</li>
 *   <li>{@link Gemma.Gemma#getVariablesGemma <em>Variables Gemma</em>}</li>
 * </ul>
 *
 * @see Gemma.GemmaPackage#getGemma()
 * @model
 * @generated
 */
public interface Gemma extends EObject {
	/**
	 * Returns the value of the '<em><b>Macro Oms</b></em>' containment reference list.
	 * The list contents are of type {@link Gemma.MacroOm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Macro Oms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Macro Oms</em>' containment reference list.
	 * @see Gemma.GemmaPackage#getGemma_MacroOms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<MacroOm> getMacroOms();

	/**
	 * Returns the value of the '<em><b>Transiciones</b></em>' containment reference list.
	 * The list contents are of type {@link Gemma.Transicion}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transiciones</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transiciones</em>' containment reference list.
	 * @see Gemma.GemmaPackage#getGemma_Transiciones()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transicion> getTransiciones();

	/**
	 * Returns the value of the '<em><b>Variables Gemma</b></em>' containment reference list.
	 * The list contents are of type {@link Gemma.VariableGemma}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables Gemma</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables Gemma</em>' containment reference list.
	 * @see Gemma.GemmaPackage#getGemma_VariablesGemma()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableGemma> getVariablesGemma();

} // Gemma
