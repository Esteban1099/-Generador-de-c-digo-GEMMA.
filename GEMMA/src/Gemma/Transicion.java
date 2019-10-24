/**
 */
package Gemma;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transicion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gemma.Transicion#getExpresionBinaria <em>Expresion Binaria</em>}</li>
 *   <li>{@link Gemma.Transicion#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see Gemma.GemmaPackage#getTransicion()
 * @model
 * @generated
 */
public interface Transicion extends EObject {
	/**
	 * Returns the value of the '<em><b>Expresion Binaria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expresion Binaria</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expresion Binaria</em>' containment reference.
	 * @see #setExpresionBinaria(ExpresionBinaria)
	 * @see Gemma.GemmaPackage#getTransicion_ExpresionBinaria()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExpresionBinaria getExpresionBinaria();

	/**
	 * Sets the value of the '{@link Gemma.Transicion#getExpresionBinaria <em>Expresion Binaria</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expresion Binaria</em>' containment reference.
	 * @see #getExpresionBinaria()
	 * @generated
	 */
	void setExpresionBinaria(ExpresionBinaria value);

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
	 * @see Gemma.GemmaPackage#getTransicion_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gemma.Transicion#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Transicion
