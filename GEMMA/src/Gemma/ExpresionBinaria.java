/**
 */
package Gemma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion Binaria</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gemma.ExpresionBinaria#getExpresionIzquierda <em>Expresion Izquierda</em>}</li>
 *   <li>{@link Gemma.ExpresionBinaria#getExpresionDerecha <em>Expresion Derecha</em>}</li>
 * </ul>
 *
 * @see Gemma.GemmaPackage#getExpresionBinaria()
 * @model
 * @generated
 */
public interface ExpresionBinaria extends ElementoExpresion {
	/**
	 * Returns the value of the '<em><b>Expresion Izquierda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expresion Izquierda</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expresion Izquierda</em>' containment reference.
	 * @see #setExpresionIzquierda(ElementoExpresion)
	 * @see Gemma.GemmaPackage#getExpresionBinaria_ExpresionIzquierda()
	 * @model containment="true"
	 * @generated
	 */
	ElementoExpresion getExpresionIzquierda();

	/**
	 * Sets the value of the '{@link Gemma.ExpresionBinaria#getExpresionIzquierda <em>Expresion Izquierda</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expresion Izquierda</em>' containment reference.
	 * @see #getExpresionIzquierda()
	 * @generated
	 */
	void setExpresionIzquierda(ElementoExpresion value);

	/**
	 * Returns the value of the '<em><b>Expresion Derecha</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expresion Derecha</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expresion Derecha</em>' containment reference.
	 * @see #setExpresionDerecha(ElementoExpresion)
	 * @see Gemma.GemmaPackage#getExpresionBinaria_ExpresionDerecha()
	 * @model containment="true"
	 * @generated
	 */
	ElementoExpresion getExpresionDerecha();

	/**
	 * Sets the value of the '{@link Gemma.ExpresionBinaria#getExpresionDerecha <em>Expresion Derecha</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expresion Derecha</em>' containment reference.
	 * @see #getExpresionDerecha()
	 * @generated
	 */
	void setExpresionDerecha(ElementoExpresion value);

} // ExpresionBinaria
