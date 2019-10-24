/**
 */
package Gemma;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import Gemma.impl.GemmaPackageImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Gemma.GemmaFactory
 * @model kind="package"
 * @generated
 */
public interface GemmaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Gemma";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.uniandes.edu.co/gemma";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Gemma";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GemmaPackage eINSTANCE = GemmaPackageImpl.init();

	/**
	 * The meta object id for the '{@link Gemma.impl.GemmaImpl <em>Gemma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.GemmaImpl
	 * @see Gemma.impl.GemmaPackageImpl#getGemma()
	 * @generated
	 */
	int GEMMA = 0;

	/**
	 * The feature id for the '<em><b>Macro Oms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMMA__MACRO_OMS = 0;

	/**
	 * The feature id for the '<em><b>Transiciones</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMMA__TRANSICIONES = 1;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMMA__VARIABLES = 2;

	/**
	 * The number of structural features of the '<em>Gemma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMMA_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Gemma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.MacroOmImpl <em>Macro Om</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.MacroOmImpl
	 * @see Gemma.impl.GemmaPackageImpl#getMacroOm()
	 * @generated
	 */
	int MACRO_OM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_OM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_OM__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Oms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_OM__OMS = 2;

	/**
	 * The number of structural features of the '<em>Macro Om</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_OM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Macro Om</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MACRO_OM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.OmImpl <em>Om</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.OmImpl
	 * @see Gemma.impl.GemmaPackageImpl#getOm()
	 * @generated
	 */
	int OM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM__TIPO = 1;

	/**
	 * The feature id for the '<em><b>Es Om Raiz</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM__ES_OM_RAIZ = 2;

	/**
	 * The number of structural features of the '<em>Om</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Om</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.TransicionImpl <em>Transicion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.TransicionImpl
	 * @see Gemma.impl.GemmaPackageImpl#getTransicion()
	 * @generated
	 */
	int TRANSICION = 8;

	/**
	 * The feature id for the '<em><b>Expresion Binaria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION__EXPRESION_BINARIA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION__NAME = 1;

	/**
	 * The number of structural features of the '<em>Transicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transicion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.TrasicionEntreOmOmImpl <em>Trasicion Entre Om Om</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.TrasicionEntreOmOmImpl
	 * @see Gemma.impl.GemmaPackageImpl#getTrasicionEntreOmOm()
	 * @generated
	 */
	int TRASICION_ENTRE_OM_OM = 3;

	/**
	 * The feature id for the '<em><b>Expresion Binaria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASICION_ENTRE_OM_OM__EXPRESION_BINARIA = TRANSICION__EXPRESION_BINARIA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASICION_ENTRE_OM_OM__NAME = TRANSICION__NAME;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASICION_ENTRE_OM_OM__ORIGEN = TRANSICION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASICION_ENTRE_OM_OM__DESTINO = TRANSICION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trasicion Entre Om Om</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASICION_ENTRE_OM_OM_FEATURE_COUNT = TRANSICION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trasicion Entre Om Om</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASICION_ENTRE_OM_OM_OPERATION_COUNT = TRANSICION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.TransicionEntreMacroOmOmImpl <em>Transicion Entre Macro Om Om</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.TransicionEntreMacroOmOmImpl
	 * @see Gemma.impl.GemmaPackageImpl#getTransicionEntreMacroOmOm()
	 * @generated
	 */
	int TRANSICION_ENTRE_MACRO_OM_OM = 4;

	/**
	 * The feature id for the '<em><b>Expresion Binaria</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_ENTRE_MACRO_OM_OM__EXPRESION_BINARIA = TRANSICION__EXPRESION_BINARIA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_ENTRE_MACRO_OM_OM__NAME = TRANSICION__NAME;

	/**
	 * The feature id for the '<em><b>Origen</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_ENTRE_MACRO_OM_OM__ORIGEN = TRANSICION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destino</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_ENTRE_MACRO_OM_OM__DESTINO = TRANSICION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Transicion Entre Macro Om Om</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_ENTRE_MACRO_OM_OM_FEATURE_COUNT = TRANSICION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Transicion Entre Macro Om Om</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_ENTRE_MACRO_OM_OM_OPERATION_COUNT = TRANSICION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.ElementoExpresionImpl <em>Elemento Expresion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.ElementoExpresionImpl
	 * @see Gemma.impl.GemmaPackageImpl#getElementoExpresion()
	 * @generated
	 */
	int ELEMENTO_EXPRESION = 6;

	/**
	 * The number of structural features of the '<em>Elemento Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_EXPRESION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Elemento Expresion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENTO_EXPRESION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.ExpresionBinariaImpl <em>Expresion Binaria</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.ExpresionBinariaImpl
	 * @see Gemma.impl.GemmaPackageImpl#getExpresionBinaria()
	 * @generated
	 */
	int EXPRESION_BINARIA = 5;

	/**
	 * The feature id for the '<em><b>Expresion Izquierda</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BINARIA__EXPRESION_IZQUIERDA = ELEMENTO_EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expresion Derecha</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BINARIA__EXPRESION_DERECHA = ELEMENTO_EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Expresion Binaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BINARIA_FEATURE_COUNT = ELEMENTO_EXPRESION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Expresion Binaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BINARIA_OPERATION_COUNT = ELEMENTO_EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.VariableImpl
	 * @see Gemma.impl.GemmaPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = ELEMENTO_EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Tipo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TIPO = ELEMENTO_EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = ELEMENTO_EXPRESION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = ELEMENTO_EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gemma.TipoOm <em>Tipo Om</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.TipoOm
	 * @see Gemma.impl.GemmaPackageImpl#getTipoOm()
	 * @generated
	 */
	int TIPO_OM = 9;

	/**
	 * The meta object id for the '{@link Gemma.TipoMacroOm <em>Tipo Macro Om</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.TipoMacroOm
	 * @see Gemma.impl.GemmaPackageImpl#getTipoMacroOm()
	 * @generated
	 */
	int TIPO_MACRO_OM = 10;

	/**
	 * The meta object id for the '{@link Gemma.TipoVariable <em>Tipo Variable</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.TipoVariable
	 * @see Gemma.impl.GemmaPackageImpl#getTipoVariable()
	 * @generated
	 */
	int TIPO_VARIABLE = 11;


	/**
	 * Returns the meta object for class '{@link Gemma.Gemma <em>Gemma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gemma</em>'.
	 * @see Gemma.Gemma
	 * @generated
	 */
	EClass getGemma();

	/**
	 * Returns the meta object for the containment reference list '{@link Gemma.Gemma#getMacroOms <em>Macro Oms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Macro Oms</em>'.
	 * @see Gemma.Gemma#getMacroOms()
	 * @see #getGemma()
	 * @generated
	 */
	EReference getGemma_MacroOms();

	/**
	 * Returns the meta object for the containment reference list '{@link Gemma.Gemma#getTransiciones <em>Transiciones</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transiciones</em>'.
	 * @see Gemma.Gemma#getTransiciones()
	 * @see #getGemma()
	 * @generated
	 */
	EReference getGemma_Transiciones();

	/**
	 * Returns the meta object for the reference list '{@link Gemma.Gemma#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Variables</em>'.
	 * @see Gemma.Gemma#getVariables()
	 * @see #getGemma()
	 * @generated
	 */
	EReference getGemma_Variables();

	/**
	 * Returns the meta object for class '{@link Gemma.MacroOm <em>Macro Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Macro Om</em>'.
	 * @see Gemma.MacroOm
	 * @generated
	 */
	EClass getMacroOm();

	/**
	 * Returns the meta object for the attribute '{@link Gemma.MacroOm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gemma.MacroOm#getName()
	 * @see #getMacroOm()
	 * @generated
	 */
	EAttribute getMacroOm_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gemma.MacroOm#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see Gemma.MacroOm#getTipo()
	 * @see #getMacroOm()
	 * @generated
	 */
	EAttribute getMacroOm_Tipo();

	/**
	 * Returns the meta object for the containment reference list '{@link Gemma.MacroOm#getOms <em>Oms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Oms</em>'.
	 * @see Gemma.MacroOm#getOms()
	 * @see #getMacroOm()
	 * @generated
	 */
	EReference getMacroOm_Oms();

	/**
	 * Returns the meta object for class '{@link Gemma.Om <em>Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Om</em>'.
	 * @see Gemma.Om
	 * @generated
	 */
	EClass getOm();

	/**
	 * Returns the meta object for the attribute '{@link Gemma.Om#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gemma.Om#getName()
	 * @see #getOm()
	 * @generated
	 */
	EAttribute getOm_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gemma.Om#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see Gemma.Om#getTipo()
	 * @see #getOm()
	 * @generated
	 */
	EAttribute getOm_Tipo();

	/**
	 * Returns the meta object for the attribute '{@link Gemma.Om#isEsOmRaiz <em>Es Om Raiz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Om Raiz</em>'.
	 * @see Gemma.Om#isEsOmRaiz()
	 * @see #getOm()
	 * @generated
	 */
	EAttribute getOm_EsOmRaiz();

	/**
	 * Returns the meta object for class '{@link Gemma.TrasicionEntreOmOm <em>Trasicion Entre Om Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trasicion Entre Om Om</em>'.
	 * @see Gemma.TrasicionEntreOmOm
	 * @generated
	 */
	EClass getTrasicionEntreOmOm();

	/**
	 * Returns the meta object for the reference '{@link Gemma.TrasicionEntreOmOm#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see Gemma.TrasicionEntreOmOm#getOrigen()
	 * @see #getTrasicionEntreOmOm()
	 * @generated
	 */
	EReference getTrasicionEntreOmOm_Origen();

	/**
	 * Returns the meta object for the reference '{@link Gemma.TrasicionEntreOmOm#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see Gemma.TrasicionEntreOmOm#getDestino()
	 * @see #getTrasicionEntreOmOm()
	 * @generated
	 */
	EReference getTrasicionEntreOmOm_Destino();

	/**
	 * Returns the meta object for class '{@link Gemma.TransicionEntreMacroOmOm <em>Transicion Entre Macro Om Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transicion Entre Macro Om Om</em>'.
	 * @see Gemma.TransicionEntreMacroOmOm
	 * @generated
	 */
	EClass getTransicionEntreMacroOmOm();

	/**
	 * Returns the meta object for the reference '{@link Gemma.TransicionEntreMacroOmOm#getOrigen <em>Origen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origen</em>'.
	 * @see Gemma.TransicionEntreMacroOmOm#getOrigen()
	 * @see #getTransicionEntreMacroOmOm()
	 * @generated
	 */
	EReference getTransicionEntreMacroOmOm_Origen();

	/**
	 * Returns the meta object for the reference '{@link Gemma.TransicionEntreMacroOmOm#getDestino <em>Destino</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destino</em>'.
	 * @see Gemma.TransicionEntreMacroOmOm#getDestino()
	 * @see #getTransicionEntreMacroOmOm()
	 * @generated
	 */
	EReference getTransicionEntreMacroOmOm_Destino();

	/**
	 * Returns the meta object for class '{@link Gemma.ExpresionBinaria <em>Expresion Binaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion Binaria</em>'.
	 * @see Gemma.ExpresionBinaria
	 * @generated
	 */
	EClass getExpresionBinaria();

	/**
	 * Returns the meta object for the containment reference '{@link Gemma.ExpresionBinaria#getExpresionIzquierda <em>Expresion Izquierda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expresion Izquierda</em>'.
	 * @see Gemma.ExpresionBinaria#getExpresionIzquierda()
	 * @see #getExpresionBinaria()
	 * @generated
	 */
	EReference getExpresionBinaria_ExpresionIzquierda();

	/**
	 * Returns the meta object for the containment reference '{@link Gemma.ExpresionBinaria#getExpresionDerecha <em>Expresion Derecha</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expresion Derecha</em>'.
	 * @see Gemma.ExpresionBinaria#getExpresionDerecha()
	 * @see #getExpresionBinaria()
	 * @generated
	 */
	EReference getExpresionBinaria_ExpresionDerecha();

	/**
	 * Returns the meta object for class '{@link Gemma.ElementoExpresion <em>Elemento Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Elemento Expresion</em>'.
	 * @see Gemma.ElementoExpresion
	 * @generated
	 */
	EClass getElementoExpresion();

	/**
	 * Returns the meta object for class '{@link Gemma.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see Gemma.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link Gemma.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gemma.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link Gemma.Variable#getTipo <em>Tipo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tipo</em>'.
	 * @see Gemma.Variable#getTipo()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Tipo();

	/**
	 * Returns the meta object for class '{@link Gemma.Transicion <em>Transicion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transicion</em>'.
	 * @see Gemma.Transicion
	 * @generated
	 */
	EClass getTransicion();

	/**
	 * Returns the meta object for the containment reference '{@link Gemma.Transicion#getExpresionBinaria <em>Expresion Binaria</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expresion Binaria</em>'.
	 * @see Gemma.Transicion#getExpresionBinaria()
	 * @see #getTransicion()
	 * @generated
	 */
	EReference getTransicion_ExpresionBinaria();

	/**
	 * Returns the meta object for the attribute '{@link Gemma.Transicion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gemma.Transicion#getName()
	 * @see #getTransicion()
	 * @generated
	 */
	EAttribute getTransicion_Name();

	/**
	 * Returns the meta object for enum '{@link Gemma.TipoOm <em>Tipo Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Om</em>'.
	 * @see Gemma.TipoOm
	 * @generated
	 */
	EEnum getTipoOm();

	/**
	 * Returns the meta object for enum '{@link Gemma.TipoMacroOm <em>Tipo Macro Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Macro Om</em>'.
	 * @see Gemma.TipoMacroOm
	 * @generated
	 */
	EEnum getTipoMacroOm();

	/**
	 * Returns the meta object for enum '{@link Gemma.TipoVariable <em>Tipo Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Variable</em>'.
	 * @see Gemma.TipoVariable
	 * @generated
	 */
	EEnum getTipoVariable();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GemmaFactory getGemmaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Gemma.impl.GemmaImpl <em>Gemma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.GemmaImpl
		 * @see Gemma.impl.GemmaPackageImpl#getGemma()
		 * @generated
		 */
		EClass GEMMA = eINSTANCE.getGemma();

		/**
		 * The meta object literal for the '<em><b>Macro Oms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEMMA__MACRO_OMS = eINSTANCE.getGemma_MacroOms();

		/**
		 * The meta object literal for the '<em><b>Transiciones</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEMMA__TRANSICIONES = eINSTANCE.getGemma_Transiciones();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEMMA__VARIABLES = eINSTANCE.getGemma_Variables();

		/**
		 * The meta object literal for the '{@link Gemma.impl.MacroOmImpl <em>Macro Om</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.MacroOmImpl
		 * @see Gemma.impl.GemmaPackageImpl#getMacroOm()
		 * @generated
		 */
		EClass MACRO_OM = eINSTANCE.getMacroOm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACRO_OM__NAME = eINSTANCE.getMacroOm_Name();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MACRO_OM__TIPO = eINSTANCE.getMacroOm_Tipo();

		/**
		 * The meta object literal for the '<em><b>Oms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MACRO_OM__OMS = eINSTANCE.getMacroOm_Oms();

		/**
		 * The meta object literal for the '{@link Gemma.impl.OmImpl <em>Om</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.OmImpl
		 * @see Gemma.impl.GemmaPackageImpl#getOm()
		 * @generated
		 */
		EClass OM = eINSTANCE.getOm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OM__NAME = eINSTANCE.getOm_Name();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OM__TIPO = eINSTANCE.getOm_Tipo();

		/**
		 * The meta object literal for the '<em><b>Es Om Raiz</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OM__ES_OM_RAIZ = eINSTANCE.getOm_EsOmRaiz();

		/**
		 * The meta object literal for the '{@link Gemma.impl.TrasicionEntreOmOmImpl <em>Trasicion Entre Om Om</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.TrasicionEntreOmOmImpl
		 * @see Gemma.impl.GemmaPackageImpl#getTrasicionEntreOmOm()
		 * @generated
		 */
		EClass TRASICION_ENTRE_OM_OM = eINSTANCE.getTrasicionEntreOmOm();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRASICION_ENTRE_OM_OM__ORIGEN = eINSTANCE.getTrasicionEntreOmOm_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRASICION_ENTRE_OM_OM__DESTINO = eINSTANCE.getTrasicionEntreOmOm_Destino();

		/**
		 * The meta object literal for the '{@link Gemma.impl.TransicionEntreMacroOmOmImpl <em>Transicion Entre Macro Om Om</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.TransicionEntreMacroOmOmImpl
		 * @see Gemma.impl.GemmaPackageImpl#getTransicionEntreMacroOmOm()
		 * @generated
		 */
		EClass TRANSICION_ENTRE_MACRO_OM_OM = eINSTANCE.getTransicionEntreMacroOmOm();

		/**
		 * The meta object literal for the '<em><b>Origen</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSICION_ENTRE_MACRO_OM_OM__ORIGEN = eINSTANCE.getTransicionEntreMacroOmOm_Origen();

		/**
		 * The meta object literal for the '<em><b>Destino</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSICION_ENTRE_MACRO_OM_OM__DESTINO = eINSTANCE.getTransicionEntreMacroOmOm_Destino();

		/**
		 * The meta object literal for the '{@link Gemma.impl.ExpresionBinariaImpl <em>Expresion Binaria</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.ExpresionBinariaImpl
		 * @see Gemma.impl.GemmaPackageImpl#getExpresionBinaria()
		 * @generated
		 */
		EClass EXPRESION_BINARIA = eINSTANCE.getExpresionBinaria();

		/**
		 * The meta object literal for the '<em><b>Expresion Izquierda</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION_BINARIA__EXPRESION_IZQUIERDA = eINSTANCE.getExpresionBinaria_ExpresionIzquierda();

		/**
		 * The meta object literal for the '<em><b>Expresion Derecha</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION_BINARIA__EXPRESION_DERECHA = eINSTANCE.getExpresionBinaria_ExpresionDerecha();

		/**
		 * The meta object literal for the '{@link Gemma.impl.ElementoExpresionImpl <em>Elemento Expresion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.ElementoExpresionImpl
		 * @see Gemma.impl.GemmaPackageImpl#getElementoExpresion()
		 * @generated
		 */
		EClass ELEMENTO_EXPRESION = eINSTANCE.getElementoExpresion();

		/**
		 * The meta object literal for the '{@link Gemma.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.VariableImpl
		 * @see Gemma.impl.GemmaPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Tipo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TIPO = eINSTANCE.getVariable_Tipo();

		/**
		 * The meta object literal for the '{@link Gemma.impl.TransicionImpl <em>Transicion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.TransicionImpl
		 * @see Gemma.impl.GemmaPackageImpl#getTransicion()
		 * @generated
		 */
		EClass TRANSICION = eINSTANCE.getTransicion();

		/**
		 * The meta object literal for the '<em><b>Expresion Binaria</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSICION__EXPRESION_BINARIA = eINSTANCE.getTransicion_ExpresionBinaria();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSICION__NAME = eINSTANCE.getTransicion_Name();

		/**
		 * The meta object literal for the '{@link Gemma.TipoOm <em>Tipo Om</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.TipoOm
		 * @see Gemma.impl.GemmaPackageImpl#getTipoOm()
		 * @generated
		 */
		EEnum TIPO_OM = eINSTANCE.getTipoOm();

		/**
		 * The meta object literal for the '{@link Gemma.TipoMacroOm <em>Tipo Macro Om</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.TipoMacroOm
		 * @see Gemma.impl.GemmaPackageImpl#getTipoMacroOm()
		 * @generated
		 */
		EEnum TIPO_MACRO_OM = eINSTANCE.getTipoMacroOm();

		/**
		 * The meta object literal for the '{@link Gemma.TipoVariable <em>Tipo Variable</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.TipoVariable
		 * @see Gemma.impl.GemmaPackageImpl#getTipoVariable()
		 * @generated
		 */
		EEnum TIPO_VARIABLE = eINSTANCE.getTipoVariable();

	}

} //GemmaPackage
