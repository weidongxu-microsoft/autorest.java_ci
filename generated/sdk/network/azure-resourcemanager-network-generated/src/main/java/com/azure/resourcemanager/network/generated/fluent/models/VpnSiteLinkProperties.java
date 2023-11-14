// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VpnLinkBgpSettings;
import com.azure.resourcemanager.network.generated.models.VpnLinkProviderProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for VpnSite.
 */
@Fluent
public final class VpnSiteLinkProperties {
    /*
     * The link provider properties.
     */
    @JsonProperty(value = "linkProperties")
    private VpnLinkProviderProperties linkProperties;

    /*
     * The ip-address for the vpn-site-link.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * FQDN of vpn-site-link.
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /*
     * The set of bgp properties.
     */
    @JsonProperty(value = "bgpProperties")
    private VpnLinkBgpSettings bgpProperties;

    /*
     * The provisioning state of the VPN site link resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of VpnSiteLinkProperties class.
     */
    public VpnSiteLinkProperties() {
    }

    /**
     * Get the linkProperties property: The link provider properties.
     * 
     * @return the linkProperties value.
     */
    public VpnLinkProviderProperties linkProperties() {
        return this.linkProperties;
    }

    /**
     * Set the linkProperties property: The link provider properties.
     * 
     * @param linkProperties the linkProperties value to set.
     * @return the VpnSiteLinkProperties object itself.
     */
    public VpnSiteLinkProperties withLinkProperties(VpnLinkProviderProperties linkProperties) {
        this.linkProperties = linkProperties;
        return this;
    }

    /**
     * Get the ipAddress property: The ip-address for the vpn-site-link.
     * 
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: The ip-address for the vpn-site-link.
     * 
     * @param ipAddress the ipAddress value to set.
     * @return the VpnSiteLinkProperties object itself.
     */
    public VpnSiteLinkProperties withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the fqdn property: FQDN of vpn-site-link.
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: FQDN of vpn-site-link.
     * 
     * @param fqdn the fqdn value to set.
     * @return the VpnSiteLinkProperties object itself.
     */
    public VpnSiteLinkProperties withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the bgpProperties property: The set of bgp properties.
     * 
     * @return the bgpProperties value.
     */
    public VpnLinkBgpSettings bgpProperties() {
        return this.bgpProperties;
    }

    /**
     * Set the bgpProperties property: The set of bgp properties.
     * 
     * @param bgpProperties the bgpProperties value to set.
     * @return the VpnSiteLinkProperties object itself.
     */
    public VpnSiteLinkProperties withBgpProperties(VpnLinkBgpSettings bgpProperties) {
        this.bgpProperties = bgpProperties;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN site link resource.
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
        if (linkProperties() != null) {
            linkProperties().validate();
        }
        if (bgpProperties() != null) {
            bgpProperties().validate();
        }
    }
}
