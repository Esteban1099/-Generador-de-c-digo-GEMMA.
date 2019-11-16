/**
 */
package Gemma.impl;

import Gemma.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GemmaFactoryImpl extends EFactoryImpl implements GemmaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GemmaFactory init() {
		try {
			GemmaFactory theGemmaFactory = (GemmaFactory)EPackage.Registry.INSTANCE.getEFactory(GemmaPackage.eNS_URI);
			if (theGemmaFactory != null) {
				return theGemmaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GemmaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemmaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GemmaPackage.GEMMA: return createGemma();
			case GemmaPackage.MACRO_OM: return createMacroOm();
			case GemmaPackage.OM: return createOm();
			case GemmaPackage.TRASICION_ENTRE_OM_OM: return createTrasicionEntreOmOm();
			case GemmaPackage.TRANSICION_ENTRE_MACRO_OM_OM: return createTransicionEntreMacroOmOm();
			case GemmaPackage.EXPRESION_BINARIA: return createExpresionBinaria();
			case GemmaPackage.ELEMENTO_EXPRESION: return createElementoExpresion();
			case GemmaPackage.VARIABLE_OM: return createVariableOm();
			case GemmaPackage.TRANSICION: return createTransicion();
			case GemmaPackage.VARIABLE_GEMMA: return createVariableGemma();
			case GemmaPackage.REF_VARIABLE_GEMMA: return createRefVariableGemma();
			case GemmaPackage.EXPRESION_NOT: return createExpresionNot();
			case GemmaPackage.REF_VARIABLE_OM: return createRefVariableOm();
			case GemmaPackage.EXPRESION_CONJUNTA: return createExpresionConjunta();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GemmaPackage.TIPO_OM:
				return createTipoOmFromString(eDataType, initialValue);
			case GemmaPackage.TIPO_MACRO_OM:
				return createTipoMacroOmFromString(eDataType, initialValue);
			case GemmaPackage.TIPO_OPERADOR:
				return createTipoOperadorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GemmaPackage.TIPO_OM:
				return convertTipoOmToString(eDataType, instanceValue);
			case GemmaPackage.TIPO_MACRO_OM:
				return convertTipoMacroOmToString(eDataType, instanceValue);
			case GemmaPackage.TIPO_OPERADOR:
				return convertTipoOperadorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Gemma createGemma() {
		GemmaImpl gemma = new GemmaImpl();
		return gemma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MacroOm createMacroOm() {
		MacroOmImpl macroOm = new MacroOmImpl();
		return macroOm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Om createOm() {
		OmImpl om = new OmImpl();
		return om;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrasicionEntreOmOm createTrasicionEntreOmOm() {
		TrasicionEntreOmOmImpl trasicionEntreOmOm = new TrasicionEntreOmOmImpl();
		return trasicionEntreOmOm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransicionEntreMacroOmOm createTransicionEntreMacroOmOm() {
		TransicionEntreMacroOmOmImpl transicionEntreMacroOmOm = new TransicionEntreMacroOmOmImpl();
		return transicionEntreMacroOmOm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpresionBinaria createExpresionBinaria() {
		ExpresionBinariaImpl expresionBinaria = new ExpresionBinariaImpl();
		return expresionBinaria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementoExpresion createElementoExpresion() {
		ElementoExpresionImpl elementoExpresion = new ElementoExpresionImpl();
		return elementoExpresion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableOm createVariableOm() {
		VariableOmImpl variableOm = new VariableOmImpl();
		return variableOm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transicion createTransicion() {
		TransicionImpl transicion = new TransicionImpl();
		return transicion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableGemma createVariableGemma() {
		VariableGemmaImpl variableGemma = new VariableGemmaImpl();
		return variableGemma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefVariableGemma createRefVariableGemma() {
		RefVariableGemmaImpl refVariableGemma = new RefVariableGemmaImpl();
		return refVariableGemma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpresionNot createExpresionNot() {
		ExpresionNotImpl expresionNot = new ExpresionNotImpl();
		return expresionNot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefVariableOm createRefVariableOm() {
		RefVariableOmImpl refVariableOm = new RefVariableOmImpl();
		return refVariableOm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpresionConjunta createExpresionConjunta() {
		ExpresionConjuntaImpl expresionConjunta = new ExpresionConjuntaImpl();
		return expresionConjunta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoOm createTipoOmFromString(EDataType eDataType, String initialValue) {
		TipoOm result = TipoOm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoOmToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoMacroOm createTipoMacroOmFromString(EDataType eDataType, String initialValue) {
		TipoMacroOm result = TipoMacroOm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoMacroOmToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipoOperador createTipoOperadorFromString(EDataType eDataType, String initialValue) {
		TipoOperador result = TipoOperador.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTipoOperadorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemmaPackage getGemmaPackage() {
		return (GemmaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GemmaPackage getPackage() {
		return GemmaPackage.eINSTANCE;
	}

} //GemmaFactoryImpl
