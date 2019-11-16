/**
 */
package Gemma;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Om</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Gemma.Om#getName <em>Name</em>}</li>
 *   <li>{@link Gemma.Om#getTipo <em>Tipo</em>}</li>
 *   <li>{@link Gemma.Om#isEsOmRaiz <em>Es Om Raiz</em>}</li>
 *   <li>{@link Gemma.Om#getVariablesOm <em>Variables Om</em>}</li>
 *   <li>{@link Gemma.Om#isEsVisible <em>Es Visible</em>}</li>
 * </ul>
 *
 * @see Gemma.GemmaPackage#getOm()
 * @model
 * @generated
 */
public interface Om extends EObject {
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
	 * @see Gemma.GemmaPackage#getOm_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Gemma.Om#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tipo</b></em>' attribute.
	 * The literals are from the enumeration {@link Gemma.TipoOm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tipo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tipo</em>' attribute.
	 * @see Gemma.TipoOm
	 * @see #setTipo(TipoOm)
	 * @see Gemma.GemmaPackage#getOm_Tipo()
	 * @model
	 * @generated
	 */
	TipoOm getTipo();

	/**
	 * Sets the value of the '{@link Gemma.Om#getTipo <em>Tipo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tipo</em>' attribute.
	 * @see Gemma.TipoOm
	 * @see #getTipo()
	 * @generated
	 */
	void setTipo(TipoOm value);

	/**
	 * Returns the value of the '<em><b>Es Om Raiz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Om Raiz</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Om Raiz</em>' attribute.
	 * @see #setEsOmRaiz(boolean)
	 * @see Gemma.GemmaPackage#getOm_EsOmRaiz()
	 * @model
	 * @generated
	 */
	boolean isEsOmRaiz();

	/**
	 * Sets the value of the '{@link Gemma.Om#isEsOmRaiz <em>Es Om Raiz</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Om Raiz</em>' attribute.
	 * @see #isEsOmRaiz()
	 * @generated
	 */
	void setEsOmRaiz(boolean value);

	/**
	 * Returns the value of the '<em><b>Variables Om</b></em>' containment reference list.
	 * The list contents are of type {@link Gemma.VariableOm}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables Om</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables Om</em>' containment reference list.
	 * @see Gemma.GemmaPackage#getOm_VariablesOm()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableOm> getVariablesOm();

	/**
	 * Returns the value of the '<em><b>Es Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Es Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Es Visible</em>' attribute.
	 * @see #setEsVisible(boolean)
	 * @see Gemma.GemmaPackage#getOm_EsVisible()
	 * @model
	 * @generated
	 */
	boolean isEsVisible();

	/**
	 * Sets the value of the '{@link Gemma.Om#isEsVisible <em>Es Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Es Visible</em>' attribute.
	 * @see #isEsVisible()
	 * @generated
	 */
	void setEsVisible(boolean value);

} // Om
