/**
 */
package Gemma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transicion Entre Macro Om Om</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gemma.TransicionEntreMacroOmOm#getOrigen <em>Origen</em>}</li>
 *   <li>{@link Gemma.TransicionEntreMacroOmOm#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @see Gemma.GemmaPackage#getTransicionEntreMacroOmOm()
 * @model
 * @generated
 */
public interface TransicionEntreMacroOmOm extends Transicion {
	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(MacroOm)
	 * @see Gemma.GemmaPackage#getTransicionEntreMacroOmOm_Origen()
	 * @model required="true"
	 * @generated
	 */
	MacroOm getOrigen();

	/**
	 * Sets the value of the '{@link Gemma.TransicionEntreMacroOmOm#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(MacroOm value);

	/**
	 * Returns the value of the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destino</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destino</em>' reference.
	 * @see #setDestino(Om)
	 * @see Gemma.GemmaPackage#getTransicionEntreMacroOmOm_Destino()
	 * @model required="true"
	 * @generated
	 */
	Om getDestino();

	/**
	 * Sets the value of the '{@link Gemma.TransicionEntreMacroOmOm#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Om value);

} // TransicionEntreMacroOmOm
