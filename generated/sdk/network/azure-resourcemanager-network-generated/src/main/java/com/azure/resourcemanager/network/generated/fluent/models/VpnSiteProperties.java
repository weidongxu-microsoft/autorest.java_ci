// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.DeviceProperties;
import com.azure.resourcemanager.network.generated.models.O365PolicyProperties;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Parameters for VpnSite.
 */
@Fluent
public final class VpnSiteProperties {
    /*
     * The VirtualWAN to which the vpnSite belongs.
     */
    @JsonProperty(value = "virtualWan")
    private SubResource virtualWan;

    /*
     * The device properties.
     */
    @JsonProperty(value = "deviceProperties")
    private DeviceProperties deviceProperties;

    /*
     * The ip-address for the vpn-site.
     */
    @JsonProperty(value = "ipAddress")
    private String ipAddress;

    /*
     * The key for vpn-site that can be used for connections.
     */
    @JsonProperty(value = "siteKey")
    private String siteKey;

    /*
     * The AddressSpace that contains an array of IP address ranges.
     */
    @JsonProperty(value = "addressSpace")
    private AddressSpace addressSpace;

    /*
     * The set of bgp properties.
     */
    @JsonProperty(value = "bgpProperties")
    private BgpSettings bgpProperties;

    /*
     * The provisioning state of the VPN site resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * IsSecuritySite flag.
     */
    @JsonProperty(value = "isSecuritySite")
    private Boolean isSecuritySite;

    /*
     * List of all vpn site links.
     */
    @JsonProperty(value = "vpnSiteLinks")
    private List<VpnSiteLinkInner> vpnSiteLinks;

    /*
     * Office365 Policy.
     */
    @JsonProperty(value = "o365Policy")
    private O365PolicyProperties o365Policy;

    /**
     * Creates an instance of VpnSiteProperties class.
     */
    public VpnSiteProperties() {
    }

    /**
     * Get the virtualWan property: The VirtualWAN to which the vpnSite belongs.
     * 
     * @return the virtualWan value.
     */
    public SubResource virtualWan() {
        return this.virtualWan;
    }

    /**
     * Set the virtualWan property: The VirtualWAN to which the vpnSite belongs.
     * 
     * @param virtualWan the virtualWan value to set.
     * @return the VpnSiteProperties object itself.
     */
    public VpnSiteProperties withVirtualWan(SubResource virtualWan) {
        this.virtualWan = virtualWan;
        return this;
    }

    /**
     * Get the deviceProperties property: The device properties.
     * 
     * @return the deviceProperties value.
     */
    public DeviceProperties deviceProperties() {
        return this.deviceProperties;
    }

    /**
     * Set the deviceProperties property: The device properties.
     * 
     * @param deviceProperties the deviceProperties value to set.
     * @return the VpnSiteProperties object itself.
     */
    public VpnSiteProperties withDeviceProperties(DeviceProperties deviceProperties) {
        this.deviceProperties = deviceProperties;
        return this;
    }

    /**
     * Get the ipAddress property: The ip-address for the vpn-site.
     * 
     * @return the ipAddress value.
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Set the ipAddress property: The ip-address for the vpn-site.
     * 
     * @param ipAddress the ipAddress value to set.
     * @return the VpnSiteProperties object itself.
     */
    public VpnSiteProperties withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get the siteKey property: The key for vpn-site that can be used for connections.
     * 
     * @return the siteKey value.
     */
    public String siteKey() {
        return this.siteKey;
    }

    /**
     * Set the siteKey property: The key for vpn-site that can be used for connections.
     * 
     * @param siteKey the siteKey value to set.
     * @return the VpnSiteProperties object itself.
     */
    public VpnSiteProperties withSiteKey(String siteKey) {
        this.siteKey = siteKey;
        return this;
    }

    /**
     * Get the addressSpace property: The AddressSpace that contains an array of IP address ranges.
     * 
     * @return the addressSpace value.
     */
    public AddressSpace addressSpace() {
        return this.addressSpace;
    }

    /**
     * Set the addressSpace property: The AddressSpace that contains an array of IP address ranges.
     * 
     * @param addressSpace the addressSpace value to set.
     * @return the VpnSiteProperties object itself.
     */
    public VpnSiteProperties withAddressSpace(AddressSpace addressSpace) {
        this.addressSpace = addressSpace;
        return this;
    }

    /**
     * Get the bgpProperties property: The set of bgp properties.
     * 
     * @return the bgpProperties value.
     */
    public BgpSettings bgpProperties() {
        return this.bgpProperties;
    }

    /**
     * Set the bgpProperties property: The set of bgp properties.
     * 
     * @param bgpProperties the bgpProperties value to set.
     * @return the VpnSiteProperties object itself.
     */
    public VpnSiteProperties withBgpProperties(BgpSettings bgpProperties) {
        this.bgpProperties = bgpProperties;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN site resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the isSecuritySite property: IsSecuritySite flag.
     * 
     * @return the isSecuritySite value.
     */
    public Boolean isSecuritySite() {
        return this.isSecuritySite;
    }

    /**
     * Set the isSecuritySite property: IsSecuritySite flag.
     * 
     * @param isSecuritySite the isSecuritySite value to set.
     * @return the VpnSiteProperties object itself.
     */
    public VpnSiteProperties withIsSecuritySite(Boolean isSecuritySite) {
        this.isSecuritySite = isSecuritySite;
        return this;
    }

    /**
     * Get the vpnSiteLinks property: List of all vpn site links.
     * 
     * @return the vpnSiteLinks value.
     */
    public List<VpnSiteLinkInner> vpnSiteLinks() {
        return this.vpnSiteLinks;
    }

    /**
     * Set the vpnSiteLinks property: List of all vpn site links.
     * 
     * @param vpnSiteLinks the vpnSiteLinks value to set.
     * @return the VpnSiteProperties object itself.
     */
    public VpnSiteProperties withVpnSiteLinks(List<VpnSiteLinkInner> vpnSiteLinks) {
        this.vpnSiteLinks = vpnSiteLinks;
        return this;
    }

    /**
     * Get the o365Policy property: Office365 Policy.
     * 
     * @return the o365Policy value.
     */
    public O365PolicyProperties o365Policy() {
        return this.o365Policy;
    }

    /**
     * Set the o365Policy property: Office365 Policy.
     * 
     * @param o365Policy the o365Policy value to set.
     * @return the VpnSiteProperties object itself.
     */
    public VpnSiteProperties withO365Policy(O365PolicyProperties o365Policy) {
        this.o365Policy = o365Policy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deviceProperties() != null) {
            deviceProperties().validate();
        }
        if (addressSpace() != null) {
            addressSpace().validate();
        }
        if (bgpProperties() != null) {
            bgpProperties().validate();
        }
        if (vpnSiteLinks() != null) {
            vpnSiteLinks().forEach(e -> e.validate());
        }
        if (o365Policy() != null) {
            o365Policy().validate();
        }
    }
}
