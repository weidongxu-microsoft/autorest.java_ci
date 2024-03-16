// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.BastionHostIpConfigurationPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IP configuration of an Bastion Host.
 */
@Fluent
public final class BastionHostIpConfiguration extends SubResource {
    /*
     * Represents the ip configuration associated with the resource.
     */
    @JsonProperty(value = "properties")
    private BastionHostIpConfigurationPropertiesFormat innerProperties;

    /*
     * Name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Ip configuration type.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Creates an instance of BastionHostIpConfiguration class.
     */
    public BastionHostIpConfiguration() {
    }

    /**
     * Get the innerProperties property: Represents the ip configuration associated with the resource.
     * 
     * @return the innerProperties value.
     */
    private BastionHostIpConfigurationPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     * @param name the name value to set.
     * @return the BastionHostIpConfiguration object itself.
     */
    public BastionHostIpConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Ip configuration type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BastionHostIpConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the subnet property: Reference of the subnet resource.
     * 
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: Reference of the subnet resource.
     * 
     * @param subnet the subnet value to set.
     * @return the BastionHostIpConfiguration object itself.
     */
    public BastionHostIpConfiguration withSubnet(SubResource subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the publicIpAddress property: Reference of the PublicIP resource.
     * 
     * @return the publicIpAddress value.
     */
    public SubResource publicIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddress();
    }

    /**
     * Set the publicIpAddress property: Reference of the PublicIP resource.
     * 
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the BastionHostIpConfiguration object itself.
     */
    public BastionHostIpConfiguration withPublicIpAddress(SubResource publicIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withPublicIpAddress(publicIpAddress);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the bastion host IP configuration resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the privateIpAllocationMethod property: Private IP allocation method.
     * 
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAllocationMethod();
    }

    /**
     * Set the privateIpAllocationMethod property: Private IP allocation method.
     * 
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the BastionHostIpConfiguration object itself.
     */
    public BastionHostIpConfiguration withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new BastionHostIpConfigurationPropertiesFormat();
        }
        this.innerProperties().withPrivateIpAllocationMethod(privateIpAllocationMethod);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
