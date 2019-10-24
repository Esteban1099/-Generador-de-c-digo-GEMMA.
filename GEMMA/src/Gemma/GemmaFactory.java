/**
 */
package Gemma;

import org.eclipse.emf.ecore.EFactory;

import Gemma.impl.GemmaFactoryImpl;
import Gemma.impl.GemmaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Gemma.GemmaPackage
 * @generated
 */
public interface GemmaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GemmaFactory eINSTANCE = GemmaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Gemma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gemma</em>'.
	 * @generated
	 */
	Gemma createGemma();

	/**
	 * Returns a new object of class '<em>Macro Om</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macro Om</em>'.
	 * @generated
	 */
	MacroOm createMacroOm();

	/**
	 * Returns a new object of class '<em>Om</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Om</em>'.
	 * @generated
	 */
	Om createOm();

	/**
	 * Returns a new object of class '<em>Trasicion Entre Om Om</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trasicion Entre Om Om</em>'.
	 * @generated
	 */
	TrasicionEntreOmOm createTrasicionEntreOmOm();

	/**
	 * Returns a new object of class '<em>Transicion Entre Macro Om Om</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transicion Entre Macro Om Om</em>'.
	 * @generated
	 */
	TransicionEntreMacroOmOm createTransicionEntreMacroOmOm();

	/**
	 * Returns a new object of class '<em>Expresion Binaria</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expresion Binaria</em>'.
	 * @generated
	 */
	ExpresionBinaria createExpresionBinaria();

	/**
	 * Returns a new object of class '<em>Elemento Expresion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Elemento Expresion</em>'.
	 * @generated
	 */
	ElementoExpresion createElementoExpresion();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Transicion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transicion</em>'.
	 * @generated
	 */
	Transicion createTransicion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GemmaPackage getGemmaPackage();

} //GemmaFactory
