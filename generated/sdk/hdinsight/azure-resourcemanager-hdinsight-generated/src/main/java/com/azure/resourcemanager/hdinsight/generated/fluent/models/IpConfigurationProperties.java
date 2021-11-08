// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hdinsight.generated.models.PrivateIpAllocationMethod;
import com.azure.resourcemanager.hdinsight.generated.models.PrivateLinkConfigurationProvisioningState;
import com.azure.resourcemanager.hdinsight.generated.models.ResourceId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The private link ip configuration properties. */
@Fluent
public final class IpConfigurationProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IpConfigurationProperties.class);

    /*
     * The private link configuration provisioning state, which only appears in
     * the response.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private PrivateLinkConfigurationProvisioningState provisioningState;

    /*
     * Indicates whether this IP configuration is primary for the corresponding
     * NIC.
     */
    @JsonProperty(value = "primary")
    private Boolean primary;

    /*
     * The IP address.
     */
    @JsonProperty(value = "privateIPAddress")
    private String privateIpAddress;

    /*
     * The method that private IP address is allocated.
     */
    @JsonProperty(value = "privateIPAllocationMethod")
    private PrivateIpAllocationMethod privateIpAllocationMethod;

    /*
     * The subnet resource id.
     */
    @JsonProperty(value = "subnet")
    private ResourceId subnet;

    /**
     * Get the provisioningState property: The private link configuration provisioning state, which only appears in the
     * response.
     *
     * @return the provisioningState value.
     */
    public PrivateLinkConfigurationProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the primary property: Indicates whether this IP configuration is primary for the corresponding NIC.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary property: Indicates whether this IP configuration is primary for the corresponding NIC.
     *
     * @param primary the primary value to set.
     * @return the IpConfigurationProperties object itself.
     */
    public IpConfigurationProperties withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the privateIpAddress property: The IP address.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The IP address.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the IpConfigurationProperties object itself.
     */
    public IpConfigurationProperties withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: The method that private IP address is allocated.
     *
     * @return the privateIpAllocationMethod value.
     */
    public PrivateIpAllocationMethod privateIpAllocationMethod() {
        return this.privateIpAllocationMethod;
    }

    /**
     * Set the privateIpAllocationMethod property: The method that private IP address is allocated.
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the IpConfigurationProperties object itself.
     */
    public IpConfigurationProperties withPrivateIpAllocationMethod(
        PrivateIpAllocationMethod privateIpAllocationMethod) {
        this.privateIpAllocationMethod = privateIpAllocationMethod;
        return this;
    }

    /**
     * Get the subnet property: The subnet resource id.
     *
     * @return the subnet value.
     */
    public ResourceId subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet property: The subnet resource id.
     *
     * @param subnet the subnet value to set.
     * @return the IpConfigurationProperties object itself.
     */
    public IpConfigurationProperties withSubnet(ResourceId subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (subnet() != null) {
            subnet().validate();
        }
    }
}
