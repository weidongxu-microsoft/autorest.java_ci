// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.AddressSpace;
import com.azure.resourcemanager.network.generated.models.AdminState;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayAutoScaleConfiguration;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayIpConfiguration;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayPolicyGroup;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewaySku;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkGatewayType;
import com.azure.resourcemanager.network.generated.models.VpnClientConfiguration;
import com.azure.resourcemanager.network.generated.models.VpnGatewayGeneration;
import com.azure.resourcemanager.network.generated.models.VpnType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * VirtualNetworkGateway properties.
 */
@Fluent
public final class VirtualNetworkGatewayPropertiesFormat {
    /*
     * Autoscale configuration for virutal network gateway
     */
    @JsonProperty(value = "autoScaleConfiguration")
    private VirtualNetworkGatewayAutoScaleConfiguration autoScaleConfiguration;

    /*
     * IP configurations for virtual network gateway.
     */
    @JsonProperty(value = "ipConfigurations")
    private List<VirtualNetworkGatewayIpConfiguration> ipConfigurations;

    /*
     * The type of this virtual network gateway.
     */
    @JsonProperty(value = "gatewayType")
    private VirtualNetworkGatewayType gatewayType;

    /*
     * The type of this virtual network gateway.
     */
    @JsonProperty(value = "vpnType")
    private VpnType vpnType;

    /*
     * The generation for this VirtualNetworkGateway. Must be None if gatewayType is not VPN.
     */
    @JsonProperty(value = "vpnGatewayGeneration")
    private VpnGatewayGeneration vpnGatewayGeneration;

    /*
     * Whether BGP is enabled for this virtual network gateway or not.
     */
    @JsonProperty(value = "enableBgp")
    private Boolean enableBgp;

    /*
     * Whether private IP needs to be enabled on this gateway for connections or not.
     */
    @JsonProperty(value = "enablePrivateIpAddress")
    private Boolean enablePrivateIpAddress;

    /*
     * ActiveActive flag.
     */
    @JsonProperty(value = "activeActive")
    private Boolean active;

    /*
     * disableIPSecReplayProtection flag.
     */
    @JsonProperty(value = "disableIPSecReplayProtection")
    private Boolean disableIpSecReplayProtection;

    /*
     * The reference to the LocalNetworkGateway resource which represents local network site having default routes.
     * Assign Null value in case of removing existing default site setting.
     */
    @JsonProperty(value = "gatewayDefaultSite")
    private SubResource gatewayDefaultSite;

    /*
     * The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected for Virtual network
     * gateway.
     */
    @JsonProperty(value = "sku")
    private VirtualNetworkGatewaySku sku;

    /*
     * The reference to the VpnClientConfiguration resource which represents the P2S VpnClient configurations.
     */
    @JsonProperty(value = "vpnClientConfiguration")
    private VpnClientConfiguration vpnClientConfiguration;

    /*
     * The reference to the VirtualNetworkGatewayPolicyGroup resource which represents the available
     * VirtualNetworkGatewayPolicyGroup for the gateway.
     */
    @JsonProperty(value = "virtualNetworkGatewayPolicyGroups")
    private List<VirtualNetworkGatewayPolicyGroup> virtualNetworkGatewayPolicyGroups;

    /*
     * Virtual network gateway's BGP speaker settings.
     */
    @JsonProperty(value = "bgpSettings")
    private BgpSettings bgpSettings;

    /*
     * The reference to the address space resource which represents the custom routes address space specified by the
     * customer for virtual network gateway and VpnClient.
     */
    @JsonProperty(value = "customRoutes")
    private AddressSpace customRoutes;

    /*
     * The resource GUID property of the virtual network gateway resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The provisioning state of the virtual network gateway resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Whether dns forwarding is enabled or not.
     */
    @JsonProperty(value = "enableDnsForwarding")
    private Boolean enableDnsForwarding;

    /*
     * The IP address allocated by the gateway to which dns requests can be sent.
     */
    @JsonProperty(value = "inboundDnsForwardingEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String inboundDnsForwardingEndpoint;

    /*
     * Customer vnet resource id. VirtualNetworkGateway of type local gateway is associated with the customer vnet.
     */
    @JsonProperty(value = "vNetExtendedLocationResourceId")
    private String vNetExtendedLocationResourceId;

    /*
     * NatRules for virtual network gateway.
     */
    @JsonProperty(value = "natRules")
    private List<VirtualNetworkGatewayNatRuleInner> natRules;

    /*
     * EnableBgpRouteTranslationForNat flag.
     */
    @JsonProperty(value = "enableBgpRouteTranslationForNat")
    private Boolean enableBgpRouteTranslationForNat;

    /*
     * Configures this gateway to accept traffic from remote Virtual WAN networks.
     */
    @JsonProperty(value = "allowVirtualWanTraffic")
    private Boolean allowVirtualWanTraffic;

    /*
     * Configure this gateway to accept traffic from other Azure Virtual Networks. This configuration does not support
     * connectivity to Azure Virtual WAN.
     */
    @JsonProperty(value = "allowRemoteVnetTraffic")
    private Boolean allowRemoteVnetTraffic;

    /*
     * Property to indicate if the Express Route Gateway serves traffic when there are multiple Express Route Gateways
     * in the vnet
     */
    @JsonProperty(value = "adminState")
    private AdminState adminState;

    /**
     * Creates an instance of VirtualNetworkGatewayPropertiesFormat class.
     */
    public VirtualNetworkGatewayPropertiesFormat() {
    }

    /**
     * Get the autoScaleConfiguration property: Autoscale configuration for virutal network gateway.
     * 
     * @return the autoScaleConfiguration value.
     */
    public VirtualNetworkGatewayAutoScaleConfiguration autoScaleConfiguration() {
        return this.autoScaleConfiguration;
    }

    /**
     * Set the autoScaleConfiguration property: Autoscale configuration for virutal network gateway.
     * 
     * @param autoScaleConfiguration the autoScaleConfiguration value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat
        withAutoScaleConfiguration(VirtualNetworkGatewayAutoScaleConfiguration autoScaleConfiguration) {
        this.autoScaleConfiguration = autoScaleConfiguration;
        return this;
    }

    /**
     * Get the ipConfigurations property: IP configurations for virtual network gateway.
     * 
     * @return the ipConfigurations value.
     */
    public List<VirtualNetworkGatewayIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations property: IP configurations for virtual network gateway.
     * 
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat
        withIpConfigurations(List<VirtualNetworkGatewayIpConfiguration> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the gatewayType property: The type of this virtual network gateway.
     * 
     * @return the gatewayType value.
     */
    public VirtualNetworkGatewayType gatewayType() {
        return this.gatewayType;
    }

    /**
     * Set the gatewayType property: The type of this virtual network gateway.
     * 
     * @param gatewayType the gatewayType value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withGatewayType(VirtualNetworkGatewayType gatewayType) {
        this.gatewayType = gatewayType;
        return this;
    }

    /**
     * Get the vpnType property: The type of this virtual network gateway.
     * 
     * @return the vpnType value.
     */
    public VpnType vpnType() {
        return this.vpnType;
    }

    /**
     * Set the vpnType property: The type of this virtual network gateway.
     * 
     * @param vpnType the vpnType value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withVpnType(VpnType vpnType) {
        this.vpnType = vpnType;
        return this;
    }

    /**
     * Get the vpnGatewayGeneration property: The generation for this VirtualNetworkGateway. Must be None if gatewayType
     * is not VPN.
     * 
     * @return the vpnGatewayGeneration value.
     */
    public VpnGatewayGeneration vpnGatewayGeneration() {
        return this.vpnGatewayGeneration;
    }

    /**
     * Set the vpnGatewayGeneration property: The generation for this VirtualNetworkGateway. Must be None if gatewayType
     * is not VPN.
     * 
     * @param vpnGatewayGeneration the vpnGatewayGeneration value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withVpnGatewayGeneration(VpnGatewayGeneration vpnGatewayGeneration) {
        this.vpnGatewayGeneration = vpnGatewayGeneration;
        return this;
    }

    /**
     * Get the enableBgp property: Whether BGP is enabled for this virtual network gateway or not.
     * 
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.enableBgp;
    }

    /**
     * Set the enableBgp property: Whether BGP is enabled for this virtual network gateway or not.
     * 
     * @param enableBgp the enableBgp value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withEnableBgp(Boolean enableBgp) {
        this.enableBgp = enableBgp;
        return this;
    }

    /**
     * Get the enablePrivateIpAddress property: Whether private IP needs to be enabled on this gateway for connections
     * or not.
     * 
     * @return the enablePrivateIpAddress value.
     */
    public Boolean enablePrivateIpAddress() {
        return this.enablePrivateIpAddress;
    }

    /**
     * Set the enablePrivateIpAddress property: Whether private IP needs to be enabled on this gateway for connections
     * or not.
     * 
     * @param enablePrivateIpAddress the enablePrivateIpAddress value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withEnablePrivateIpAddress(Boolean enablePrivateIpAddress) {
        this.enablePrivateIpAddress = enablePrivateIpAddress;
        return this;
    }

    /**
     * Get the active property: ActiveActive flag.
     * 
     * @return the active value.
     */
    public Boolean active() {
        return this.active;
    }

    /**
     * Set the active property: ActiveActive flag.
     * 
     * @param active the active value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * Get the disableIpSecReplayProtection property: disableIPSecReplayProtection flag.
     * 
     * @return the disableIpSecReplayProtection value.
     */
    public Boolean disableIpSecReplayProtection() {
        return this.disableIpSecReplayProtection;
    }

    /**
     * Set the disableIpSecReplayProtection property: disableIPSecReplayProtection flag.
     * 
     * @param disableIpSecReplayProtection the disableIpSecReplayProtection value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat
        withDisableIpSecReplayProtection(Boolean disableIpSecReplayProtection) {
        this.disableIpSecReplayProtection = disableIpSecReplayProtection;
        return this;
    }

    /**
     * Get the gatewayDefaultSite property: The reference to the LocalNetworkGateway resource which represents local
     * network site having default routes. Assign Null value in case of removing existing default site setting.
     * 
     * @return the gatewayDefaultSite value.
     */
    public SubResource gatewayDefaultSite() {
        return this.gatewayDefaultSite;
    }

    /**
     * Set the gatewayDefaultSite property: The reference to the LocalNetworkGateway resource which represents local
     * network site having default routes. Assign Null value in case of removing existing default site setting.
     * 
     * @param gatewayDefaultSite the gatewayDefaultSite value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withGatewayDefaultSite(SubResource gatewayDefaultSite) {
        this.gatewayDefaultSite = gatewayDefaultSite;
        return this;
    }

    /**
     * Get the sku property: The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected
     * for Virtual network gateway.
     * 
     * @return the sku value.
     */
    public VirtualNetworkGatewaySku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The reference to the VirtualNetworkGatewaySku resource which represents the SKU selected
     * for Virtual network gateway.
     * 
     * @param sku the sku value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withSku(VirtualNetworkGatewaySku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the vpnClientConfiguration property: The reference to the VpnClientConfiguration resource which represents
     * the P2S VpnClient configurations.
     * 
     * @return the vpnClientConfiguration value.
     */
    public VpnClientConfiguration vpnClientConfiguration() {
        return this.vpnClientConfiguration;
    }

    /**
     * Set the vpnClientConfiguration property: The reference to the VpnClientConfiguration resource which represents
     * the P2S VpnClient configurations.
     * 
     * @param vpnClientConfiguration the vpnClientConfiguration value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat
        withVpnClientConfiguration(VpnClientConfiguration vpnClientConfiguration) {
        this.vpnClientConfiguration = vpnClientConfiguration;
        return this;
    }

    /**
     * Get the virtualNetworkGatewayPolicyGroups property: The reference to the VirtualNetworkGatewayPolicyGroup
     * resource which represents the available VirtualNetworkGatewayPolicyGroup for the gateway.
     * 
     * @return the virtualNetworkGatewayPolicyGroups value.
     */
    public List<VirtualNetworkGatewayPolicyGroup> virtualNetworkGatewayPolicyGroups() {
        return this.virtualNetworkGatewayPolicyGroups;
    }

    /**
     * Set the virtualNetworkGatewayPolicyGroups property: The reference to the VirtualNetworkGatewayPolicyGroup
     * resource which represents the available VirtualNetworkGatewayPolicyGroup for the gateway.
     * 
     * @param virtualNetworkGatewayPolicyGroups the virtualNetworkGatewayPolicyGroups value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withVirtualNetworkGatewayPolicyGroups(
        List<VirtualNetworkGatewayPolicyGroup> virtualNetworkGatewayPolicyGroups) {
        this.virtualNetworkGatewayPolicyGroups = virtualNetworkGatewayPolicyGroups;
        return this;
    }

    /**
     * Get the bgpSettings property: Virtual network gateway's BGP speaker settings.
     * 
     * @return the bgpSettings value.
     */
    public BgpSettings bgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set the bgpSettings property: Virtual network gateway's BGP speaker settings.
     * 
     * @param bgpSettings the bgpSettings value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the customRoutes property: The reference to the address space resource which represents the custom routes
     * address space specified by the customer for virtual network gateway and VpnClient.
     * 
     * @return the customRoutes value.
     */
    public AddressSpace customRoutes() {
        return this.customRoutes;
    }

    /**
     * Set the customRoutes property: The reference to the address space resource which represents the custom routes
     * address space specified by the customer for virtual network gateway and VpnClient.
     * 
     * @param customRoutes the customRoutes value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withCustomRoutes(AddressSpace customRoutes) {
        this.customRoutes = customRoutes;
        return this;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the virtual network gateway resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The provisioning state of the virtual network gateway resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the enableDnsForwarding property: Whether dns forwarding is enabled or not.
     * 
     * @return the enableDnsForwarding value.
     */
    public Boolean enableDnsForwarding() {
        return this.enableDnsForwarding;
    }

    /**
     * Set the enableDnsForwarding property: Whether dns forwarding is enabled or not.
     * 
     * @param enableDnsForwarding the enableDnsForwarding value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withEnableDnsForwarding(Boolean enableDnsForwarding) {
        this.enableDnsForwarding = enableDnsForwarding;
        return this;
    }

    /**
     * Get the inboundDnsForwardingEndpoint property: The IP address allocated by the gateway to which dns requests can
     * be sent.
     * 
     * @return the inboundDnsForwardingEndpoint value.
     */
    public String inboundDnsForwardingEndpoint() {
        return this.inboundDnsForwardingEndpoint;
    }

    /**
     * Get the vNetExtendedLocationResourceId property: Customer vnet resource id. VirtualNetworkGateway of type local
     * gateway is associated with the customer vnet.
     * 
     * @return the vNetExtendedLocationResourceId value.
     */
    public String vNetExtendedLocationResourceId() {
        return this.vNetExtendedLocationResourceId;
    }

    /**
     * Set the vNetExtendedLocationResourceId property: Customer vnet resource id. VirtualNetworkGateway of type local
     * gateway is associated with the customer vnet.
     * 
     * @param vNetExtendedLocationResourceId the vNetExtendedLocationResourceId value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat
        withVNetExtendedLocationResourceId(String vNetExtendedLocationResourceId) {
        this.vNetExtendedLocationResourceId = vNetExtendedLocationResourceId;
        return this;
    }

    /**
     * Get the natRules property: NatRules for virtual network gateway.
     * 
     * @return the natRules value.
     */
    public List<VirtualNetworkGatewayNatRuleInner> natRules() {
        return this.natRules;
    }

    /**
     * Set the natRules property: NatRules for virtual network gateway.
     * 
     * @param natRules the natRules value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withNatRules(List<VirtualNetworkGatewayNatRuleInner> natRules) {
        this.natRules = natRules;
        return this;
    }

    /**
     * Get the enableBgpRouteTranslationForNat property: EnableBgpRouteTranslationForNat flag.
     * 
     * @return the enableBgpRouteTranslationForNat value.
     */
    public Boolean enableBgpRouteTranslationForNat() {
        return this.enableBgpRouteTranslationForNat;
    }

    /**
     * Set the enableBgpRouteTranslationForNat property: EnableBgpRouteTranslationForNat flag.
     * 
     * @param enableBgpRouteTranslationForNat the enableBgpRouteTranslationForNat value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat
        withEnableBgpRouteTranslationForNat(Boolean enableBgpRouteTranslationForNat) {
        this.enableBgpRouteTranslationForNat = enableBgpRouteTranslationForNat;
        return this;
    }

    /**
     * Get the allowVirtualWanTraffic property: Configures this gateway to accept traffic from remote Virtual WAN
     * networks.
     * 
     * @return the allowVirtualWanTraffic value.
     */
    public Boolean allowVirtualWanTraffic() {
        return this.allowVirtualWanTraffic;
    }

    /**
     * Set the allowVirtualWanTraffic property: Configures this gateway to accept traffic from remote Virtual WAN
     * networks.
     * 
     * @param allowVirtualWanTraffic the allowVirtualWanTraffic value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withAllowVirtualWanTraffic(Boolean allowVirtualWanTraffic) {
        this.allowVirtualWanTraffic = allowVirtualWanTraffic;
        return this;
    }

    /**
     * Get the allowRemoteVnetTraffic property: Configure this gateway to accept traffic from other Azure Virtual
     * Networks. This configuration does not support connectivity to Azure Virtual WAN.
     * 
     * @return the allowRemoteVnetTraffic value.
     */
    public Boolean allowRemoteVnetTraffic() {
        return this.allowRemoteVnetTraffic;
    }

    /**
     * Set the allowRemoteVnetTraffic property: Configure this gateway to accept traffic from other Azure Virtual
     * Networks. This configuration does not support connectivity to Azure Virtual WAN.
     * 
     * @param allowRemoteVnetTraffic the allowRemoteVnetTraffic value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withAllowRemoteVnetTraffic(Boolean allowRemoteVnetTraffic) {
        this.allowRemoteVnetTraffic = allowRemoteVnetTraffic;
        return this;
    }

    /**
     * Get the adminState property: Property to indicate if the Express Route Gateway serves traffic when there are
     * multiple Express Route Gateways in the vnet.
     * 
     * @return the adminState value.
     */
    public AdminState adminState() {
        return this.adminState;
    }

    /**
     * Set the adminState property: Property to indicate if the Express Route Gateway serves traffic when there are
     * multiple Express Route Gateways in the vnet.
     * 
     * @param adminState the adminState value to set.
     * @return the VirtualNetworkGatewayPropertiesFormat object itself.
     */
    public VirtualNetworkGatewayPropertiesFormat withAdminState(AdminState adminState) {
        this.adminState = adminState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (autoScaleConfiguration() != null) {
            autoScaleConfiguration().validate();
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
        if (sku() != null) {
            sku().validate();
        }
        if (vpnClientConfiguration() != null) {
            vpnClientConfiguration().validate();
        }
        if (virtualNetworkGatewayPolicyGroups() != null) {
            virtualNetworkGatewayPolicyGroups().forEach(e -> e.validate());
        }
        if (bgpSettings() != null) {
            bgpSettings().validate();
        }
        if (customRoutes() != null) {
            customRoutes().validate();
        }
        if (natRules() != null) {
            natRules().forEach(e -> e.validate());
        }
    }
}
