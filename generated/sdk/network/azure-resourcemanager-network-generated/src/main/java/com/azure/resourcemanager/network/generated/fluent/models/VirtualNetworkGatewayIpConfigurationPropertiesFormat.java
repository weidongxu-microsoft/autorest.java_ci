// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of VirtualNetworkGatewayIPConfiguration.
 */
@Fluent
public final class VirtualNetworkGatewayIpConfigurationPropertiesFormat {
    /*
     * The private IP address allocation method.
     */
    @JsonProperty(value = "privateIPAllocationMethod")
    private IpAllocationMethod privateIpAllocationMethod;

    /*
     * The reference to the subnet resource.
     */
    @JsonProperty(value = "subnet")
    private SubResource subnet;

    /*
     * The reference to the public IP resource.
     */
    @JsonProperty(value = "publicIPAddress")
    private SubResource publicIpAddress;

    /*
     * Private IP Address for this gateway.
     */
    @JsonProperty(value = "privateIPAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String privateIpAddress;

    /*
     * The provisioning state of the virtual network gateway IP configuration resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of VirtualNetworkGatewayIpConfigurationPropertiesFormat class.
     */
    public VirtualNetworkGatewayIpConfigurationPropertiesFormat() {
    }

    /**
     * Get the privateIpAllocationMethod property: The private IP address allocation method.
     * 
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: The private IP address allocation method.
     * 
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the VirtualNetworkGatewayIpConfigurationPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayIpConfigurationPropertiesFormat
        withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the subnet property: The reference to the subnet resource.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The reference to the subnet resource.
     * 
     * @param subnet the subnet value to set.
     * @return the VirtualNetworkGatewayIpConfigurationPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayIpConfigurationPropertiesFormat withSubnet(SubResource subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the publicIpAddress property: The reference to the public IP resource.
     * 
     * @return the publicIpAddress value.
     */
    public SubResource publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: The reference to the public IP resource.
     * 
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the VirtualNetworkGatewayIpConfigurationPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayIpConfigurationPropertiesFormat withPublicIpAddress(SubResource publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the privateIpAddress property: Private IP Address for this gateway.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network gateway IP configuration
     * resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
