// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.generated.fluent.models.IpConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ip configurations for the private link service. */
@Fluent
public final class IpConfiguration {
    /*
     * The private link IP configuration id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The name of private link IP configuration.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of the private link IP configuration.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * The private link ip configuration properties.
     */
    @JsonProperty(value = "properties")
    private IpConfigurationProperties innerProperties;

    /**
     * Get the id property: The private link IP configuration id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of private link IP configuration.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of private link IP configuration.
     *
     * @param name the name value to set.
     * @return the IpConfiguration object itself.
     */
    public IpConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of the private link IP configuration.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the innerProperties property: The private link ip configuration properties.
     *
     * @return the innerProperties value.
     */
    private IpConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the provisioningState property: The private link configuration provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    public PrivateLinkConfigurationProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the primary property: Indicates whether this IP configuration is primary for the corresponding NIC.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.innerProperties() == null ? null : this.innerProperties().primary();
    }

    /**
     * Set the primary property: Indicates whether this IP configuration is primary for the corresponding NIC.
     *
     * @param primary the primary value to set.
     * @return the IpConfiguration object itself.
     */
    public IpConfiguration withPrimary(Boolean primary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpConfigurationProperties();
        }
        this.innerProperties().withPrimary(primary);
        return this;
    }

    /**
     * Get the privateIpAddress property: The IP address.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddress();
    }

    /**
     * Set the privateIpAddress property: The IP address.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the IpConfiguration object itself.
     */
    public IpConfiguration withPrivateIpAddress(String privateIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpConfigurationProperties();
        }
        this.innerProperties().withPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The method that private IP address is allocated.
     *
     * @return the privateIpAllocationMethod value.
     */
    public PrivateIpAllocationMethod privateIpAllocationMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAllocationMethod();
    }

    /**
     * Set the privateIpAllocationMethod property: The method that private IP address is allocated.
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the IpConfiguration object itself.
     */
    public IpConfiguration withPrivateIpAllocationMethod(PrivateIpAllocationMethod privateIpAllocationMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpConfigurationProperties();
        }
        this.innerProperties().withPrivateIpAllocationMethod(privateIpAllocationMethod);
        return this;
    }

    /**
     * Get the subnet property: The subnet resource id.
     *
     * @return the subnet value.
     */
    public ResourceId subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: The subnet resource id.
     *
     * @param subnet the subnet value to set.
     * @return the IpConfiguration object itself.
     */
    public IpConfiguration withSubnet(ResourceId subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpConfigurationProperties();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model IpConfiguration"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IpConfiguration.class);
}
