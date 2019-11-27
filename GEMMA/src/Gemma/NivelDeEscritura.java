/**
 */
package Gemma;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Nivel De Escritura</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Gemma.GemmaPackage#getNivelDeEscritura()
 * @model
 * @generated
 */
public enum NivelDeEscritura implements Enumerator {
	/**
	 * The '<em><b>Gemma</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEMMA_VALUE
	 * @generated
	 * @ordered
	 */
	GEMMA(0, "gemma", "gemma"),

	/**
	 * The '<em><b>Om</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OM_VALUE
	 * @generated
	 * @ordered
	 */
	OM(1, "om", "om");

	/**
	 * The '<em><b>Gemma</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gemma</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GEMMA
	 * @model name="gemma"
	 * @generated
	 * @ordered
	 */
	public static final int GEMMA_VALUE = 0;

	/**
	 * The '<em><b>Om</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Om</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OM
	 * @model name="om"
	 * @generated
	 * @ordered
	 */
	public static final int OM_VALUE = 1;

	/**
	 * An array of all the '<em><b>Nivel De Escritura</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NivelDeEscritura[] VALUES_ARRAY =
		new NivelDeEscritura[] {
			GEMMA,
			OM,
		};

	/**
	 * A public read-only list of all the '<em><b>Nivel De Escritura</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NivelDeEscritura> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Nivel De Escritura</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NivelDeEscritura get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NivelDeEscritura result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nivel De Escritura</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NivelDeEscritura getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NivelDeEscritura result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Nivel De Escritura</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static NivelDeEscritura get(int value) {
		switch (value) {
			case GEMMA_VALUE: return GEMMA;
			case OM_VALUE: return OM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private NivelDeEscritura(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //NivelDeEscritura
