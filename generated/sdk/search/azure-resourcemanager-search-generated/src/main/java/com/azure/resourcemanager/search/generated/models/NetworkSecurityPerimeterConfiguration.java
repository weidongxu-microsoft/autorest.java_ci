// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.resourcemanager.search.generated.fluent.models.NetworkSecurityPerimeterConfigurationInner;
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
     * Gets the provisioningState property: The provisioningState property.
     * 
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * Gets the networkSecurityPerimeter property: The perimeter for a network security perimeter configuration.
     * 
     * @return the networkSecurityPerimeter value.
     */
    NspConfigPerimeter networkSecurityPerimeter();

    /**
     * Gets the resourceAssociation property: The resource association for the network security perimeter.
     * 
     * @return the resourceAssociation value.
     */
    NspConfigAssociation resourceAssociation();

    /**
     * Gets the profile property: The profile for a network security perimeter configuration.
     * 
     * @return the profile value.
     */
    NspConfigProfile profile();

    /**
     * Gets the provisioningIssues property: The provisioningIssues property.
     * 
     * @return the provisioningIssues value.
     */
    List<NspProvisioningIssue> provisioningIssues();

    /**
     * Gets the inner
     * com.azure.resourcemanager.search.generated.fluent.models.NetworkSecurityPerimeterConfigurationInner object.
     * 
     * @return the inner object.
     */
    NetworkSecurityPerimeterConfigurationInner innerModel();
}
