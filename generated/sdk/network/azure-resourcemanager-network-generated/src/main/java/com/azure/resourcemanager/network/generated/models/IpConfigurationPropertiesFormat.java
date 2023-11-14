// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationPropertiesFormatInner;

/**
 * An immutable client-side representation of IpConfigurationPropertiesFormat.
 */
public interface IpConfigurationPropertiesFormat {
    /**
     * Gets the privateIpAddress property: The private IP address of the IP configuration.
     * 
     * @return the privateIpAddress value.
     */
    String privateIpAddress();

    /**
     * Gets the privateIpAllocationMethod property: The private IP address allocation method.
     * 
     * @return the privateIpAllocationMethod value.
     */
    IpAllocationMethod privateIpAllocationMethod();

    /**
     * Gets the subnet property: The reference to the subnet resource.
     * 
     * @return the subnet value.
     */
    Subnet subnet();

    /**
     * Gets the publicIpAddress property: The reference to the public IP resource.
     * 
     * @return the publicIpAddress value.
     */
    PublicIpAddress publicIpAddress();

    /**
     * Gets the provisioningState property: The provisioning state of the IP configuration resource.
     * 
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationPropertiesFormatInner
     * object.
     * 
     * @return the inner object.
     */
    IpConfigurationPropertiesFormatInner innerModel();
}
