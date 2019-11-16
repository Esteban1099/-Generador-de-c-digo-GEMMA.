/**
 */
package Gemma.provider;


import Gemma.ExpresionConjunta;
import Gemma.GemmaFactory;
import Gemma.GemmaPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link Gemma.ExpresionConjunta} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpresionConjuntaItemProvider extends ElementoExpresionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpresionConjuntaItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GemmaPackage.Literals.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ExpresionConjunta.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExpresionConjunta"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ExpresionConjunta_type");
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ExpresionConjunta.class)) {
			case GemmaPackage.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GemmaPackage.Literals.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION,
				 GemmaFactory.eINSTANCE.createElementoExpresion()));

		newChildDescriptors.add
			(createChildParameter
				(GemmaPackage.Literals.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION,
				 GemmaFactory.eINSTANCE.createExpresionBinaria()));

		newChildDescriptors.add
			(createChildParameter
				(GemmaPackage.Literals.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION,
				 GemmaFactory.eINSTANCE.createRefVariableGemma()));

		newChildDescriptors.add
			(createChildParameter
				(GemmaPackage.Literals.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION,
				 GemmaFactory.eINSTANCE.createExpresionNot()));

		newChildDescriptors.add
			(createChildParameter
				(GemmaPackage.Literals.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION,
				 GemmaFactory.eINSTANCE.createRefVariableOm()));

		newChildDescriptors.add
			(createChildParameter
				(GemmaPackage.Literals.EXPRESION_CONJUNTA__ELEMENTO_EXPRESION,
				 GemmaFactory.eINSTANCE.createExpresionConjunta()));
	}

}
