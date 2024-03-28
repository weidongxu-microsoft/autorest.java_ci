// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VpnGatewayIpConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/**
 * VpnGateway Resource.
 */
@Fluent
public final class VpnGatewayInner extends Resource {
    /*
     * Properties of the VPN gateway.
     */
    @JsonProperty(value = "properties")
    private VpnGatewayProperties innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of VpnGatewayInner class.
     */
    public VpnGatewayInner() {
    }

    /**
     * Get the innerProperties property: Properties of the VPN gateway.
     * 
     * @return the innerProperties value.
     */
    private VpnGatewayProperties innerProperties() {
        return this.innerProperties;
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
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VpnGatewayInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VpnGatewayInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the virtualHub property: The VirtualHub to which the gateway belongs.
     * 
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualHub();
    }

    /**
     * Set the virtualHub property: The VirtualHub to which the gateway belongs.
     * 
     * @param virtualHub the virtualHub value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withVirtualHub(SubResource virtualHub) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnGatewayProperties();
        }
        this.innerProperties().withVirtualHub(virtualHub);
        return this;
    }

    /**
     * Get the connections property: List of all vpn connections to the gateway.
     * 
     * @return the connections value.
     */
    public List<VpnConnectionInner> connections() {
        return this.innerProperties() == null ? null : this.innerProperties().connections();
    }

    /**
     * Set the connections property: List of all vpn connections to the gateway.
     * 
     * @param connections the connections value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withConnections(List<VpnConnectionInner> connections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnGatewayProperties();
        }
        this.innerProperties().withConnections(connections);
        return this;
    }

    /**
     * Get the bgpSettings property: Local network gateway's BGP speaker settings.
     * 
     * @return the bgpSettings value.
     */
    public BgpSettings bgpSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().bgpSettings();
    }

    /**
     * Set the bgpSettings property: Local network gateway's BGP speaker settings.
     * 
     * @param bgpSettings the bgpSettings value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withBgpSettings(BgpSettings bgpSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnGatewayProperties();
        }
        this.innerProperties().withBgpSettings(bgpSettings);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN gateway resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the vpnGatewayScaleUnit property: The scale unit for this vpn gateway.
     * 
     * @return the vpnGatewayScaleUnit value.
     */
    public Integer vpnGatewayScaleUnit() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnGatewayScaleUnit();
    }

    /**
     * Set the vpnGatewayScaleUnit property: The scale unit for this vpn gateway.
     * 
     * @param vpnGatewayScaleUnit the vpnGatewayScaleUnit value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnGatewayProperties();
        }
        this.innerProperties().withVpnGatewayScaleUnit(vpnGatewayScaleUnit);
        return this;
    }

    /**
     * Get the ipConfigurations property: List of all IPs configured on the gateway.
     * 
     * @return the ipConfigurations value.
     */
    public List<VpnGatewayIpConfiguration> ipConfigurations() {
        return this.innerProperties() == null ? null : this.innerProperties().ipConfigurations();
    }

    /**
     * Get the enableBgpRouteTranslationForNat property: Enable BGP routes translation for NAT on this VpnGateway.
     * 
     * @return the enableBgpRouteTranslationForNat value.
     */
    public Boolean enableBgpRouteTranslationForNat() {
        return this.innerProperties() == null ? null : this.innerProperties().enableBgpRouteTranslationForNat();
    }

    /**
     * Set the enableBgpRouteTranslationForNat property: Enable BGP routes translation for NAT on this VpnGateway.
     * 
     * @param enableBgpRouteTranslationForNat the enableBgpRouteTranslationForNat value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withEnableBgpRouteTranslationForNat(Boolean enableBgpRouteTranslationForNat) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnGatewayProperties();
        }
        this.innerProperties().withEnableBgpRouteTranslationForNat(enableBgpRouteTranslationForNat);
        return this;
    }

    /**
     * Get the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the VpnGateway.
     * 
     * @return the isRoutingPreferenceInternet value.
     */
    public Boolean isRoutingPreferenceInternet() {
        return this.innerProperties() == null ? null : this.innerProperties().isRoutingPreferenceInternet();
    }

    /**
     * Set the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the VpnGateway.
     * 
     * @param isRoutingPreferenceInternet the isRoutingPreferenceInternet value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withIsRoutingPreferenceInternet(Boolean isRoutingPreferenceInternet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnGatewayProperties();
        }
        this.innerProperties().withIsRoutingPreferenceInternet(isRoutingPreferenceInternet);
        return this;
    }

    /**
     * Get the natRules property: List of all the nat Rules associated with the gateway.
     * 
     * @return the natRules value.
     */
    public List<VpnGatewayNatRuleInner> natRules() {
        return this.innerProperties() == null ? null : this.innerProperties().natRules();
    }

    /**
     * Set the natRules property: List of all the nat Rules associated with the gateway.
     * 
     * @param natRules the natRules value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withNatRules(List<VpnGatewayNatRuleInner> natRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnGatewayProperties();
        }
        this.innerProperties().withNatRules(natRules);
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
