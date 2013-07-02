/**
 */
package org.switchyard.tools.models.switchyard1_0.http.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.switchyard.tools.models.switchyard1_0.bean.provider.Switchyard_1EditPlugin;

import org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType;
import org.switchyard.tools.models.switchyard1_0.http.HttpFactory;
import org.switchyard.tools.models.switchyard1_0.http.HttpPackage;

import org.switchyard.tools.models.switchyard1_0.soap.SOAPFactory;

import org.switchyard.tools.models.switchyard1_0.switchyard.SwitchyardFactory;

import org.switchyard.tools.models.switchyard1_0.switchyard.provider.SwitchYardBindingTypeItemProvider;

/**
 * This is the item provider adapter for a {@link org.switchyard.tools.models.switchyard1_0.http.HTTPBindingType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class HTTPBindingTypeItemProvider
    extends SwitchYardBindingTypeItemProvider
    implements
        IEditingDomainItemProvider,
        IStructuredItemContentProvider,
        ITreeItemContentProvider,
        IItemLabelProvider,
        IItemPropertySource {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public HTTPBindingTypeItemProvider(AdapterFactory adapterFactory) {
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

            addContextPathPropertyDescriptor(object);
            addAddressPropertyDescriptor(object);
            addMethodPropertyDescriptor(object);
            addContentTypePropertyDescriptor(object);
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Context Path feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContextPathPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_HTTPBindingType_contextPath_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_HTTPBindingType_contextPath_feature", "_UI_HTTPBindingType_type"),
                 HttpPackage.Literals.HTTP_BINDING_TYPE__CONTEXT_PATH,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Address feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAddressPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_HTTPBindingType_address_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_HTTPBindingType_address_feature", "_UI_HTTPBindingType_type"),
                 HttpPackage.Literals.HTTP_BINDING_TYPE__ADDRESS,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Method feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMethodPropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_HTTPBindingType_method_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_HTTPBindingType_method_feature", "_UI_HTTPBindingType_type"),
                 HttpPackage.Literals.HTTP_BINDING_TYPE__METHOD,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
    }

    /**
     * This adds a property descriptor for the Content Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addContentTypePropertyDescriptor(Object object) {
        itemPropertyDescriptors.add
            (createItemPropertyDescriptor
                (((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
                 getResourceLocator(),
                 getString("_UI_HTTPBindingType_contentType_feature"),
                 getString("_UI_PropertyDescriptor_description", "_UI_HTTPBindingType_contentType_feature", "_UI_HTTPBindingType_type"),
                 HttpPackage.Literals.HTTP_BINDING_TYPE__CONTENT_TYPE,
                 true,
                 false,
                 false,
                 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                 null,
                 null));
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
            childrenFeatures.add(HttpPackage.Literals.HTTP_BINDING_TYPE__CONTEXT_MAPPER);
            childrenFeatures.add(HttpPackage.Literals.HTTP_BINDING_TYPE__MESSAGE_COMPOSER);
            childrenFeatures.add(HttpPackage.Literals.HTTP_BINDING_TYPE__BASIC);
            childrenFeatures.add(HttpPackage.Literals.HTTP_BINDING_TYPE__NTLM);
            childrenFeatures.add(HttpPackage.Literals.HTTP_BINDING_TYPE__PROXY);
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
     * This returns HTTPBindingType.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage(Object object) {
        return overlayImage(object, getResourceLocator().getImage("full/obj16/HTTPBindingType"));
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText(Object object) {
        String label = ((HTTPBindingType)object).getName();
        return label == null || label.length() == 0 ?
            getString("_UI_HTTPBindingType_type") :
            getString("_UI_HTTPBindingType_type") + " " + label;
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

        switch (notification.getFeatureID(HTTPBindingType.class)) {
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_PATH:
            case HttpPackage.HTTP_BINDING_TYPE__ADDRESS:
            case HttpPackage.HTTP_BINDING_TYPE__METHOD:
            case HttpPackage.HTTP_BINDING_TYPE__CONTENT_TYPE:
                fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
                return;
            case HttpPackage.HTTP_BINDING_TYPE__CONTEXT_MAPPER:
            case HttpPackage.HTTP_BINDING_TYPE__MESSAGE_COMPOSER:
            case HttpPackage.HTTP_BINDING_TYPE__BASIC:
            case HttpPackage.HTTP_BINDING_TYPE__NTLM:
            case HttpPackage.HTTP_BINDING_TYPE__PROXY:
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
                (HttpPackage.Literals.HTTP_BINDING_TYPE__CONTEXT_MAPPER,
                 SwitchyardFactory.eINSTANCE.createContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (HttpPackage.Literals.HTTP_BINDING_TYPE__CONTEXT_MAPPER,
                 SOAPFactory.eINSTANCE.createContextMapperType()));

        newChildDescriptors.add
            (createChildParameter
                (HttpPackage.Literals.HTTP_BINDING_TYPE__MESSAGE_COMPOSER,
                 SwitchyardFactory.eINSTANCE.createMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (HttpPackage.Literals.HTTP_BINDING_TYPE__MESSAGE_COMPOSER,
                 SOAPFactory.eINSTANCE.createMessageComposerType()));

        newChildDescriptors.add
            (createChildParameter
                (HttpPackage.Literals.HTTP_BINDING_TYPE__BASIC,
                 HttpFactory.eINSTANCE.createBasicAuthenticationType()));

        newChildDescriptors.add
            (createChildParameter
                (HttpPackage.Literals.HTTP_BINDING_TYPE__BASIC,
                 HttpFactory.eINSTANCE.createNTLMAuthenticationType()));

        newChildDescriptors.add
            (createChildParameter
                (HttpPackage.Literals.HTTP_BINDING_TYPE__NTLM,
                 HttpFactory.eINSTANCE.createNTLMAuthenticationType()));

        newChildDescriptors.add
            (createChildParameter
                (HttpPackage.Literals.HTTP_BINDING_TYPE__PROXY,
                 HttpFactory.eINSTANCE.createProxyType()));
    }

    /**
     * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
        Object childFeature = feature;
        Object childObject = child;

        if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
            FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
            childFeature = entry.getEStructuralFeature();
            childObject = entry.getValue();
        }

        boolean qualify =
            childFeature == HttpPackage.Literals.HTTP_BINDING_TYPE__BASIC ||
            childFeature == HttpPackage.Literals.HTTP_BINDING_TYPE__NTLM;

        if (qualify) {
            return getString
                ("_UI_CreateChild_text2",
                 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
        }
        return super.getCreateChildText(owner, feature, child, selection);
    }

    /**
     * Return the resource locator for this item provider's resources.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ResourceLocator getResourceLocator() {
        return Switchyard_1EditPlugin.INSTANCE;
    }

}