// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationProfileInner;

/**
 * An immutable client-side representation of IpConfigurationProfile.
 */
public interface IpConfigurationProfile {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: Sub Resource type.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the subnet property: The reference to the subnet resource to create a container network interface ip
     * configuration.
     * 
     * @return the subnet value.
     */
    Subnet subnet();

    /**
     * Gets the provisioningState property: The provisioning state of the IP configuration profile resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationProfileInner object.
     * 
     * @return the inner object.
     */
    IpConfigurationProfileInner innerModel();
}
