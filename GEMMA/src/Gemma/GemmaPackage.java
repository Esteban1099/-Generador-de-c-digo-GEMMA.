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
	 * The feature id for the '<em><b>Variables Gemma</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GEMMA__VARIABLES_GEMMA = 2;

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
	 * The feature id for the '<em><b>Variables Om</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM__VARIABLES_OM = 3;

	/**
	 * The feature id for the '<em><b>Es Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM__ES_VISIBLE = 4;

	/**
	 * The number of structural features of the '<em>Om</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OM_FEATURE_COUNT = 5;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Elemento Expresion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION__ELEMENTO_EXPRESION = 1;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASICION_ENTRE_OM_OM__NAME = TRANSICION__NAME;

	/**
	 * The feature id for the '<em><b>Elemento Expresion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRASICION_ENTRE_OM_OM__ELEMENTO_EXPRESION = TRANSICION__ELEMENTO_EXPRESION;

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
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_ENTRE_MACRO_OM_OM__NAME = TRANSICION__NAME;

	/**
	 * The feature id for the '<em><b>Elemento Expresion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSICION_ENTRE_MACRO_OM_OM__ELEMENTO_EXPRESION = TRANSICION__ELEMENTO_EXPRESION;

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
	 * The feature id for the '<em><b>Operador</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BINARIA__OPERADOR = ELEMENTO_EXPRESION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Expresion Binaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BINARIA_FEATURE_COUNT = ELEMENTO_EXPRESION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Expresion Binaria</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_BINARIA_OPERATION_COUNT = ELEMENTO_EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.VariableOmImpl <em>Variable Om</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.VariableOmImpl
	 * @see Gemma.impl.GemmaPackageImpl#getVariableOm()
	 * @generated
	 */
	int VARIABLE_OM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable Om</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variable Om</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.VariableGemmaImpl <em>Variable Gemma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.VariableGemmaImpl
	 * @see Gemma.impl.GemmaPackageImpl#getVariableGemma()
	 * @generated
	 */
	int VARIABLE_GEMMA = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_GEMMA__NAME = 0;

	/**
	 * The number of structural features of the '<em>Variable Gemma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_GEMMA_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Variable Gemma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_GEMMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.RefVariableGemmaImpl <em>Ref Variable Gemma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.RefVariableGemmaImpl
	 * @see Gemma.impl.GemmaPackageImpl#getRefVariableGemma()
	 * @generated
	 */
	int REF_VARIABLE_GEMMA = 10;

	/**
	 * The feature id for the '<em><b>Variable Gemma</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_VARIABLE_GEMMA__VARIABLE_GEMMA = ELEMENTO_EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Variable Gemma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_VARIABLE_GEMMA_FEATURE_COUNT = ELEMENTO_EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ref Variable Gemma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_VARIABLE_GEMMA_OPERATION_COUNT = ELEMENTO_EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.ExpresionNotImpl <em>Expresion Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.ExpresionNotImpl
	 * @see Gemma.impl.GemmaPackageImpl#getExpresionNot()
	 * @generated
	 */
	int EXPRESION_NOT = 11;

	/**
	 * The feature id for the '<em><b>Elemento Expresion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_NOT__ELEMENTO_EXPRESION = ELEMENTO_EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_NOT_FEATURE_COUNT = ELEMENTO_EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_NOT_OPERATION_COUNT = ELEMENTO_EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.RefVariableOmImpl <em>Ref Variable Om</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.RefVariableOmImpl
	 * @see Gemma.impl.GemmaPackageImpl#getRefVariableOm()
	 * @generated
	 */
	int REF_VARIABLE_OM = 12;

	/**
	 * The feature id for the '<em><b>Variable Om</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_VARIABLE_OM__VARIABLE_OM = ELEMENTO_EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Ref Variable Om</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_VARIABLE_OM_FEATURE_COUNT = ELEMENTO_EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Ref Variable Om</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_VARIABLE_OM_OPERATION_COUNT = ELEMENTO_EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gemma.impl.ExpresionConjuntaImpl <em>Expresion Conjunta</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.impl.ExpresionConjuntaImpl
	 * @see Gemma.impl.GemmaPackageImpl#getExpresionConjunta()
	 * @generated
	 */
	int EXPRESION_CONJUNTA = 13;

	/**
	 * The feature id for the '<em><b>Elemento Expresion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_CONJUNTA__ELEMENTO_EXPRESION = ELEMENTO_EXPRESION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expresion Conjunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_CONJUNTA_FEATURE_COUNT = ELEMENTO_EXPRESION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Expresion Conjunta</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESION_CONJUNTA_OPERATION_COUNT = ELEMENTO_EXPRESION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Gemma.TipoOm <em>Tipo Om</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.TipoOm
	 * @see Gemma.impl.GemmaPackageImpl#getTipoOm()
	 * @generated
	 */
	int TIPO_OM = 14;

	/**
	 * The meta object id for the '{@link Gemma.TipoMacroOm <em>Tipo Macro Om</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.TipoMacroOm
	 * @see Gemma.impl.GemmaPackageImpl#getTipoMacroOm()
	 * @generated
	 */
	int TIPO_MACRO_OM = 15;

	/**
	 * The meta object id for the '{@link Gemma.TipoOperador <em>Tipo Operador</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Gemma.TipoOperador
	 * @see Gemma.impl.GemmaPackageImpl#getTipoOperador()
	 * @generated
	 */
	int TIPO_OPERADOR = 16;


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
	 * Returns the meta object for the containment reference list '{@link Gemma.Gemma#getVariablesGemma <em>Variables Gemma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables Gemma</em>'.
	 * @see Gemma.Gemma#getVariablesGemma()
	 * @see #getGemma()
	 * @generated
	 */
	EReference getGemma_VariablesGemma();

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
	 * Returns the meta object for the containment reference list '{@link Gemma.Om#getVariablesOm <em>Variables Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables Om</em>'.
	 * @see Gemma.Om#getVariablesOm()
	 * @see #getOm()
	 * @generated
	 */
	EReference getOm_VariablesOm();

	/**
	 * Returns the meta object for the attribute '{@link Gemma.Om#isEsVisible <em>Es Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Es Visible</em>'.
	 * @see Gemma.Om#isEsVisible()
	 * @see #getOm()
	 * @generated
	 */
	EAttribute getOm_EsVisible();

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
	 * Returns the meta object for the attribute '{@link Gemma.ExpresionBinaria#getOperador <em>Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operador</em>'.
	 * @see Gemma.ExpresionBinaria#getOperador()
	 * @see #getExpresionBinaria()
	 * @generated
	 */
	EAttribute getExpresionBinaria_Operador();

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
	 * Returns the meta object for class '{@link Gemma.VariableOm <em>Variable Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Om</em>'.
	 * @see Gemma.VariableOm
	 * @generated
	 */
	EClass getVariableOm();

	/**
	 * Returns the meta object for the attribute '{@link Gemma.VariableOm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gemma.VariableOm#getName()
	 * @see #getVariableOm()
	 * @generated
	 */
	EAttribute getVariableOm_Name();

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
	 * Returns the meta object for the containment reference '{@link Gemma.Transicion#getElementoExpresion <em>Elemento Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elemento Expresion</em>'.
	 * @see Gemma.Transicion#getElementoExpresion()
	 * @see #getTransicion()
	 * @generated
	 */
	EReference getTransicion_ElementoExpresion();

	/**
	 * Returns the meta object for class '{@link Gemma.VariableGemma <em>Variable Gemma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Gemma</em>'.
	 * @see Gemma.VariableGemma
	 * @generated
	 */
	EClass getVariableGemma();

	/**
	 * Returns the meta object for the attribute '{@link Gemma.VariableGemma#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Gemma.VariableGemma#getName()
	 * @see #getVariableGemma()
	 * @generated
	 */
	EAttribute getVariableGemma_Name();

	/**
	 * Returns the meta object for class '{@link Gemma.RefVariableGemma <em>Ref Variable Gemma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Variable Gemma</em>'.
	 * @see Gemma.RefVariableGemma
	 * @generated
	 */
	EClass getRefVariableGemma();

	/**
	 * Returns the meta object for the reference '{@link Gemma.RefVariableGemma#getVariableGemma <em>Variable Gemma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Gemma</em>'.
	 * @see Gemma.RefVariableGemma#getVariableGemma()
	 * @see #getRefVariableGemma()
	 * @generated
	 */
	EReference getRefVariableGemma_VariableGemma();

	/**
	 * Returns the meta object for class '{@link Gemma.ExpresionNot <em>Expresion Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion Not</em>'.
	 * @see Gemma.ExpresionNot
	 * @generated
	 */
	EClass getExpresionNot();

	/**
	 * Returns the meta object for the containment reference '{@link Gemma.ExpresionNot#getElementoExpresion <em>Elemento Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elemento Expresion</em>'.
	 * @see Gemma.ExpresionNot#getElementoExpresion()
	 * @see #getExpresionNot()
	 * @generated
	 */
	EReference getExpresionNot_ElementoExpresion();

	/**
	 * Returns the meta object for class '{@link Gemma.RefVariableOm <em>Ref Variable Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Variable Om</em>'.
	 * @see Gemma.RefVariableOm
	 * @generated
	 */
	EClass getRefVariableOm();

	/**
	 * Returns the meta object for the reference '{@link Gemma.RefVariableOm#getVariableOm <em>Variable Om</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable Om</em>'.
	 * @see Gemma.RefVariableOm#getVariableOm()
	 * @see #getRefVariableOm()
	 * @generated
	 */
	EReference getRefVariableOm_VariableOm();

	/**
	 * Returns the meta object for class '{@link Gemma.ExpresionConjunta <em>Expresion Conjunta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expresion Conjunta</em>'.
	 * @see Gemma.ExpresionConjunta
	 * @generated
	 */
	EClass getExpresionConjunta();

	/**
	 * Returns the meta object for the containment reference '{@link Gemma.ExpresionConjunta#getElementoExpresion <em>Elemento Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Elemento Expresion</em>'.
	 * @see Gemma.ExpresionConjunta#getElementoExpresion()
	 * @see #getExpresionConjunta()
	 * @generated
	 */
	EReference getExpresionConjunta_ElementoExpresion();

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
	 * Returns the meta object for enum '{@link Gemma.TipoOperador <em>Tipo Operador</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tipo Operador</em>'.
	 * @see Gemma.TipoOperador
	 * @generated
	 */
	EEnum getTipoOperador();

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
		 * The meta object literal for the '<em><b>Variables Gemma</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GEMMA__VARIABLES_GEMMA = eINSTANCE.getGemma_VariablesGemma();

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
		 * The meta object literal for the '<em><b>Variables Om</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OM__VARIABLES_OM = eINSTANCE.getOm_VariablesOm();

		/**
		 * The meta object literal for the '<em><b>Es Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OM__ES_VISIBLE = eINSTANCE.getOm_EsVisible();

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
		 * The meta object literal for the '<em><b>Operador</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESION_BINARIA__OPERADOR = eINSTANCE.getExpresionBinaria_Operador();

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
		 * The meta object literal for the '{@link Gemma.impl.VariableOmImpl <em>Variable Om</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.VariableOmImpl
		 * @see Gemma.impl.GemmaPackageImpl#getVariableOm()
		 * @generated
		 */
		EClass VARIABLE_OM = eINSTANCE.getVariableOm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_OM__NAME = eINSTANCE.getVariableOm_Name();

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
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSICION__NAME = eINSTANCE.getTransicion_Name();

		/**
		 * The meta object literal for the '<em><b>Elemento Expresion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSICION__ELEMENTO_EXPRESION = eINSTANCE.getTransicion_ElementoExpresion();

		/**
		 * The meta object literal for the '{@link Gemma.impl.VariableGemmaImpl <em>Variable Gemma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.VariableGemmaImpl
		 * @see Gemma.impl.GemmaPackageImpl#getVariableGemma()
		 * @generated
		 */
		EClass VARIABLE_GEMMA = eINSTANCE.getVariableGemma();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_GEMMA__NAME = eINSTANCE.getVariableGemma_Name();

		/**
		 * The meta object literal for the '{@link Gemma.impl.RefVariableGemmaImpl <em>Ref Variable Gemma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.RefVariableGemmaImpl
		 * @see Gemma.impl.GemmaPackageImpl#getRefVariableGemma()
		 * @generated
		 */
		EClass REF_VARIABLE_GEMMA = eINSTANCE.getRefVariableGemma();

		/**
		 * The meta object literal for the '<em><b>Variable Gemma</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_VARIABLE_GEMMA__VARIABLE_GEMMA = eINSTANCE.getRefVariableGemma_VariableGemma();

		/**
		 * The meta object literal for the '{@link Gemma.impl.ExpresionNotImpl <em>Expresion Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.ExpresionNotImpl
		 * @see Gemma.impl.GemmaPackageImpl#getExpresionNot()
		 * @generated
		 */
		EClass EXPRESION_NOT = eINSTANCE.getExpresionNot();

		/**
		 * The meta object literal for the '<em><b>Elemento Expresion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION_NOT__ELEMENTO_EXPRESION = eINSTANCE.getExpresionNot_ElementoExpresion();

		/**
		 * The meta object literal for the '{@link Gemma.impl.RefVariableOmImpl <em>Ref Variable Om</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.RefVariableOmImpl
		 * @see Gemma.impl.GemmaPackageImpl#getRefVariableOm()
		 * @generated
		 */
		EClass REF_VARIABLE_OM = eINSTANCE.getRefVariableOm();

		/**
		 * The meta object literal for the '<em><b>Variable Om</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_VARIABLE_OM__VARIABLE_OM = eINSTANCE.getRefVariableOm_VariableOm();

		/**
		 * The meta object literal for the '{@link Gemma.impl.ExpresionConjuntaImpl <em>Expresion Conjunta</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.impl.ExpresionConjuntaImpl
		 * @see Gemma.impl.GemmaPackageImpl#getExpresionConjunta()
		 * @generated
		 */
		EClass EXPRESION_CONJUNTA = eINSTANCE.getExpresionConjunta();

		/**
		 * The meta object literal for the '<em><b>Elemento Expresion</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESION_CONJUNTA__ELEMENTO_EXPRESION = eINSTANCE.getExpresionConjunta_ElementoExpresion();

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
		 * The meta object literal for the '{@link Gemma.TipoOperador <em>Tipo Operador</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Gemma.TipoOperador
		 * @see Gemma.impl.GemmaPackageImpl#getTipoOperador()
		 * @generated
		 */
		EEnum TIPO_OPERADOR = eINSTANCE.getTipoOperador();

	}

} //GemmaPackage
