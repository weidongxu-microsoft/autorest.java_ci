// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.RoutingConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Parameters for P2SConnectionConfiguration.
 */
@Fluent
public final class P2SConnectionConfigurationProperties {
    /*
     * The reference to the address space resource which represents Address space for P2S VpnClient.
     */
    @JsonProperty(value = "vpnClientAddressPool")
    private AddressSpace vpnClientAddressPool;

    /*
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     */
    @JsonProperty(value = "routingConfiguration")
    private RoutingConfiguration routingConfiguration;

    /*
     * Flag indicating whether the enable internet security flag is turned on for the P2S Connections or not.
     */
    @JsonProperty(value = "enableInternetSecurity")
    private Boolean enableInternetSecurity;

    /*
     * List of Configuration Policy Groups that this P2SConnectionConfiguration is attached to.
     */
    @JsonProperty(value = "configurationPolicyGroupAssociations", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> configurationPolicyGroupAssociations;

    /*
     * List of previous Configuration Policy Groups that this P2SConnectionConfiguration was attached to.
     */
    @JsonProperty(value = "previousConfigurationPolicyGroupAssociations", access = JsonProperty.Access.WRITE_ONLY)
    private List<VpnServerConfigurationPolicyGroupInner> previousConfigurationPolicyGroupAssociations;

    /*
     * The provisioning state of the P2SConnectionConfiguration resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of P2SConnectionConfigurationProperties class.
     */
    public P2SConnectionConfigurationProperties() {
    }

    /**
     * Get the vpnClientAddressPool property: The reference to the address space resource which represents Address space
     * for P2S VpnClient.
     * 
     * @return the vpnClientAddressPool value.
     */
    public AddressSpace vpnClientAddressPool() {
        return this.vpnClientAddressPool;
    }

    /**
     * Set the vpnClientAddressPool property: The reference to the address space resource which represents Address space
     * for P2S VpnClient.
     * 
     * @param vpnClientAddressPool the vpnClientAddressPool value to set.
     * @return the P2SConnectionConfigurationProperties object itself.
     */
    public P2SConnectionConfigurationProperties withVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        this.vpnClientAddressPool = vpnClientAddressPool;
        return this;
    }

    /**
     * Get the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     * 
     * @return the routingConfiguration value.
     */
    public RoutingConfiguration routingConfiguration() {
        return this.routingConfiguration;
    }

    /**
     * Set the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     * 
     * @param routingConfiguration the routingConfiguration value to set.
     * @return the P2SConnectionConfigurationProperties object itself.
     */
    public P2SConnectionConfigurationProperties withRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }

    /**
     * Get the enableInternetSecurity property: Flag indicating whether the enable internet security flag is turned on
     * for the P2S Connections or not.
     * 
     * @return the enableInternetSecurity value.
     */
    public Boolean enableInternetSecurity() {
        return this.enableInternetSecurity;
    }

    /**
     * Set the enableInternetSecurity property: Flag indicating whether the enable internet security flag is turned on
     * for the P2S Connections or not.
     * 
     * @param enableInternetSecurity the enableInternetSecurity value to set.
     * @return the P2SConnectionConfigurationProperties object itself.
     */
    public P2SConnectionConfigurationProperties withEnableInternetSecurity(Boolean enableInternetSecurity) {
        this.enableInternetSecurity = enableInternetSecurity;
        return this;
    }

    /**
     * Get the configurationPolicyGroupAssociations property: List of Configuration Policy Groups that this
     * P2SConnectionConfiguration is attached to.
     * 
     * @return the configurationPolicyGroupAssociations value.
     */
    public List<SubResource> configurationPolicyGroupAssociations() {
        return this.configurationPolicyGroupAssociations;
    }

    /**
     * Get the previousConfigurationPolicyGroupAssociations property: List of previous Configuration Policy Groups that
     * this P2SConnectionConfiguration was attached to.
     * 
     * @return the previousConfigurationPolicyGroupAssociations value.
     */
    public List<VpnServerConfigurationPolicyGroupInner> previousConfigurationPolicyGroupAssociations() {
        return this.previousConfigurationPolicyGroupAssociations;
    }

    /**
     * Get the provisioningState property: The provisioning state of the P2SConnectionConfiguration resource.
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
        if (vpnClientAddressPool() != null) {
            vpnClientAddressPool().validate();
        }
        if (routingConfiguration() != null) {
            routingConfiguration().validate();
        }
        if (previousConfigurationPolicyGroupAssociations() != null) {
            previousConfigurationPolicyGroupAssociations().forEach(e -> e.validate());
        }
    }
}
