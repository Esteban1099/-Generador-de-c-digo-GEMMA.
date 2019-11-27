/**
 */
package Gemma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Variable Gemma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gemma.RefVariableGemma#getVariableGemma <em>Variable Gemma</em>}</li>
 *   <li>{@link Gemma.RefVariableGemma#getNivelDeEscritura <em>Nivel De Escritura</em>}</li>
 * </ul>
 *
 * @see Gemma.GemmaPackage#getRefVariableGemma()
 * @model
 * @generated
 */
public interface RefVariableGemma extends ElementoExpresion {
	/**
	 * Returns the value of the '<em><b>Variable Gemma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Gemma</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Gemma</em>' reference.
	 * @see #setVariableGemma(VariableGemma)
	 * @see Gemma.GemmaPackage#getRefVariableGemma_VariableGemma()
	 * @model required="true"
	 * @generated
	 */
	VariableGemma getVariableGemma();

	/**
	 * Sets the value of the '{@link Gemma.RefVariableGemma#getVariableGemma <em>Variable Gemma</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Gemma</em>' reference.
	 * @see #getVariableGemma()
	 * @generated
	 */
	void setVariableGemma(VariableGemma value);

	/**
	 * Returns the value of the '<em><b>Nivel De Escritura</b></em>' attribute.
	 * The literals are from the enumeration {@link Gemma.NivelDeEscritura}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nivel De Escritura</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nivel De Escritura</em>' attribute.
	 * @see Gemma.NivelDeEscritura
	 * @see #setNivelDeEscritura(NivelDeEscritura)
	 * @see Gemma.GemmaPackage#getRefVariableGemma_NivelDeEscritura()
	 * @model
	 * @generated
	 */
	NivelDeEscritura getNivelDeEscritura();

	/**
	 * Sets the value of the '{@link Gemma.RefVariableGemma#getNivelDeEscritura <em>Nivel De Escritura</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nivel De Escritura</em>' attribute.
	 * @see Gemma.NivelDeEscritura
	 * @see #getNivelDeEscritura()
	 * @generated
	 */
	void setNivelDeEscritura(NivelDeEscritura value);

} // RefVariableGemma
