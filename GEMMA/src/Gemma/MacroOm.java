/**
 */
package Gemma;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macro Om</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gemma.MacroOm#getName <em>Name</em>}</li>
 *   <li>{@link Gemma.MacroOm#getTipo <em>Tipo</em>}</li>
 *   <li>{@link Gemma.MacroOm#getOms <em>Oms</em>}</li>
 * </ul>
 *
 * @see Gemma.GemmaPackage#getMacroOm()
 * @model
 * @generated
 */
public interface MacroOm extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Gemma.GemmaPackage#getMacroOm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gemma.MacroOm#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link Gemma.TipoMacroOm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see Gemma.TipoMacroOm
	 * @see #setTipo(TipoMacroOm)
	 * @see Gemma.GemmaPackage#getMacroOm_Tipo()
	 * @model
	 * @generated
	 */
	TipoMacroOm getTipo();

	/**
	 * Sets the value of the '{@link Gemma.MacroOm#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see Gemma.TipoMacroOm
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoMacroOm value);

	/**
	 * Returns the value of the '<em><b>Oms</b></em>' containment reference list.
	 * The list contents are of type {@link Gemma.Om}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Oms</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oms</em>' containment reference list.
	 * @see Gemma.GemmaPackage#getMacroOm_Oms()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Om> getOms();

} // MacroOm
