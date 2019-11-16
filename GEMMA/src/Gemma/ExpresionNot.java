/**
 */
package Gemma;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expresion Not</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gemma.ExpresionNot#getElementoExpresion <em>Elemento Expresion</em>}</li>
 * </ul>
 *
 * @see Gemma.GemmaPackage#getExpresionNot()
 * @model
 * @generated
 */
public interface ExpresionNot extends ElementoExpresion {
	/**
	 * Returns the value of the '<em><b>Elemento Expresion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elemento Expresion</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elemento Expresion</em>' containment reference.
	 * @see #setElementoExpresion(ElementoExpresion)
	 * @see Gemma.GemmaPackage#getExpresionNot_ElementoExpresion()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ElementoExpresion getElementoExpresion();

	/**
	 * Sets the value of the '{@link Gemma.ExpresionNot#getElementoExpresion <em>Elemento Expresion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elemento Expresion</em>' containment reference.
	 * @see #getElementoExpresion()
	 * @generated
	 */
	void setElementoExpresion(ElementoExpresion value);

} // ExpresionNot
