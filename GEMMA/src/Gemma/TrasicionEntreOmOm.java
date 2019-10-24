/**
 */
package Gemma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trasicion Entre Om Om</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gemma.TrasicionEntreOmOm#getOrigen <em>Origen</em>}</li>
 *   <li>{@link Gemma.TrasicionEntreOmOm#getDestino <em>Destino</em>}</li>
 * </ul>
 *
 * @see Gemma.GemmaPackage#getTrasicionEntreOmOm()
 * @model
 * @generated
 */
public interface TrasicionEntreOmOm extends Transicion {
	/**
	 * Returns the value of the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origen</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origen</em>' reference.
	 * @see #setOrigen(Om)
	 * @see Gemma.GemmaPackage#getTrasicionEntreOmOm_Origen()
	 * @model required="true"
	 * @generated
	 */
	Om getOrigen();

	/**
	 * Sets the value of the '{@link Gemma.TrasicionEntreOmOm#getOrigen <em>Origen</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origen</em>' reference.
	 * @see #getOrigen()
	 * @generated
	 */
	void setOrigen(Om value);

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
	 * @see Gemma.GemmaPackage#getTrasicionEntreOmOm_Destino()
	 * @model required="true"
	 * @generated
	 */
	Om getDestino();

	/**
	 * Sets the value of the '{@link Gemma.TrasicionEntreOmOm#getDestino <em>Destino</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destino</em>' reference.
	 * @see #getDestino()
	 * @generated
	 */
	void setDestino(Om value);

} // TrasicionEntreOmOm
