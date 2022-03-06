// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.P2SConnectionConfigurationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** P2SConnectionConfiguration Resource. */
@Fluent
public final class P2SConnectionConfiguration extends SubResource {
    /*
     * Properties of the P2S connection configuration.
     */
    @JsonProperty(value = "properties")
    private P2SConnectionConfigurationProperties innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the innerProperties property: Properties of the P2S connection configuration.
     *
     * @return the innerProperties value.
     */
    private P2SConnectionConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the P2SConnectionConfiguration object itself.
     */
    public P2SConnectionConfiguration withName(String name) {
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

    /** {@inheritDoc} */
    @Override
    public P2SConnectionConfiguration withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the vpnClientAddressPool property: The reference to the address space resource which represents Address space
     * for P2S VpnClient.
     *
     * @return the vpnClientAddressPool value.
     */
    public AddressSpace vpnClientAddressPool() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnClientAddressPool();
    }

    /**
     * Set the vpnClientAddressPool property: The reference to the address space resource which represents Address space
     * for P2S VpnClient.
     *
     * @param vpnClientAddressPool the vpnClientAddressPool value to set.
     * @return the P2SConnectionConfiguration object itself.
     */
    public P2SConnectionConfiguration withVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SConnectionConfigurationProperties();
        }
        this.innerProperties().withVpnClientAddressPool(vpnClientAddressPool);
        return this;
    }

    /**
     * Get the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @return the routingConfiguration value.
     */
    public RoutingConfiguration routingConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().routingConfiguration();
    }

    /**
     * Set the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @param routingConfiguration the routingConfiguration value to set.
     * @return the P2SConnectionConfiguration object itself.
     */
    public P2SConnectionConfiguration withRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SConnectionConfigurationProperties();
        }
        this.innerProperties().withRoutingConfiguration(routingConfiguration);
        return this;
    }

    /**
     * Get the enableInternetSecurity property: Flag indicating whether the enable internet security flag is turned on
     * for the P2S Connections or not.
     *
     * @return the enableInternetSecurity value.
     */
    public Boolean enableInternetSecurity() {
        return this.innerProperties() == null ? null : this.innerProperties().enableInternetSecurity();
    }

    /**
     * Set the enableInternetSecurity property: Flag indicating whether the enable internet security flag is turned on
     * for the P2S Connections or not.
     *
     * @param enableInternetSecurity the enableInternetSecurity value to set.
     * @return the P2SConnectionConfiguration object itself.
     */
    public P2SConnectionConfiguration withEnableInternetSecurity(Boolean enableInternetSecurity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new P2SConnectionConfigurationProperties();
        }
        this.innerProperties().withEnableInternetSecurity(enableInternetSecurity);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the P2SConnectionConfiguration resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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
