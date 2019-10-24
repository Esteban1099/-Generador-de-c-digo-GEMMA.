/**
 */
package Gemma.util;

import Gemma.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Gemma.GemmaPackage
 * @generated
 */
public class GemmaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GemmaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GemmaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GemmaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GemmaSwitch<Adapter> modelSwitch =
		new GemmaSwitch<Adapter>() {
			@Override
			public Adapter caseGemma(Gemma object) {
				return createGemmaAdapter();
			}
			@Override
			public Adapter caseMacroOm(MacroOm object) {
				return createMacroOmAdapter();
			}
			@Override
			public Adapter caseOm(Om object) {
				return createOmAdapter();
			}
			@Override
			public Adapter caseTrasicionEntreOmOm(TrasicionEntreOmOm object) {
				return createTrasicionEntreOmOmAdapter();
			}
			@Override
			public Adapter caseTransicionEntreMacroOmOm(TransicionEntreMacroOmOm object) {
				return createTransicionEntreMacroOmOmAdapter();
			}
			@Override
			public Adapter caseExpresionBinaria(ExpresionBinaria object) {
				return createExpresionBinariaAdapter();
			}
			@Override
			public Adapter caseElementoExpresion(ElementoExpresion object) {
				return createElementoExpresionAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter caseTransicion(Transicion object) {
				return createTransicionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Gemma.Gemma <em>Gemma</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gemma.Gemma
	 * @generated
	 */
	public Adapter createGemmaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gemma.MacroOm <em>Macro Om</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gemma.MacroOm
	 * @generated
	 */
	public Adapter createMacroOmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gemma.Om <em>Om</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gemma.Om
	 * @generated
	 */
	public Adapter createOmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gemma.TrasicionEntreOmOm <em>Trasicion Entre Om Om</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gemma.TrasicionEntreOmOm
	 * @generated
	 */
	public Adapter createTrasicionEntreOmOmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gemma.TransicionEntreMacroOmOm <em>Transicion Entre Macro Om Om</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gemma.TransicionEntreMacroOmOm
	 * @generated
	 */
	public Adapter createTransicionEntreMacroOmOmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gemma.ExpresionBinaria <em>Expresion Binaria</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gemma.ExpresionBinaria
	 * @generated
	 */
	public Adapter createExpresionBinariaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gemma.ElementoExpresion <em>Elemento Expresion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gemma.ElementoExpresion
	 * @generated
	 */
	public Adapter createElementoExpresionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gemma.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gemma.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Gemma.Transicion <em>Transicion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Gemma.Transicion
	 * @generated
	 */
	public Adapter createTransicionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GemmaAdapterFactory
