// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.storage.generated.fluent.models.NetworkSecurityPerimeterConfigurationInner;
import java.util.List;

/**
 * An immutable client-side representation of NetworkSecurityPerimeterConfiguration.
 */
public interface NetworkSecurityPerimeterConfiguration {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the provisioningState property: Provisioning state of Network Security Perimeter configuration propagation.
     * 
     * @return the provisioningState value.
     */
    NetworkSecurityPerimeterConfigurationProvisioningState provisioningState();

    /**
     * Gets the provisioningIssues property: List of Provisioning Issues if any.
     * 
     * @return the provisioningIssues value.
     */
    List<ProvisioningIssue> provisioningIssues();

    /**
     * Gets the networkSecurityPerimeter property: NetworkSecurityPerimeter related information.
     * 
     * @return the networkSecurityPerimeter value.
     */
    NetworkSecurityPerimeter networkSecurityPerimeter();

    /**
     * Gets the resourceAssociation property: Information about resource association.
     * 
     * @return the resourceAssociation value.
     */
    NetworkSecurityPerimeterConfigurationPropertiesResourceAssociation resourceAssociation();

    /**
     * Gets the profile property: Network Security Perimeter profile.
     * 
     * @return the profile value.
     */
    NetworkSecurityPerimeterConfigurationPropertiesProfile profile();

    /**
     * Gets the inner
     * com.azure.resourcemanager.storage.generated.fluent.models.NetworkSecurityPerimeterConfigurationInner object.
     * 
     * @return the inner object.
     */
    NetworkSecurityPerimeterConfigurationInner innerModel();
}
