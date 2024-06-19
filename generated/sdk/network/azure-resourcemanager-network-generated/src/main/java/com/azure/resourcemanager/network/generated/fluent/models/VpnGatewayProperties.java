// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.BgpSettings;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VpnGatewayIpConfiguration;
import java.io.IOException;
import java.util.List;

/**
 * Parameters for VpnGateway.
 */
@Fluent
public final class VpnGatewayProperties implements JsonSerializable<VpnGatewayProperties> {
    /*
     * The VirtualHub to which the gateway belongs.
     */
    private SubResource virtualHub;

    /*
     * List of all vpn connections to the gateway.
     */
    private List<VpnConnectionInner> connections;

    /*
     * Local network gateway's BGP speaker settings.
     */
    private BgpSettings bgpSettings;

    /*
     * The provisioning state of the VPN gateway resource.
     */
    private ProvisioningState provisioningState;

    /*
     * The scale unit for this vpn gateway.
     */
    private Integer vpnGatewayScaleUnit;

    /*
     * List of all IPs configured on the gateway.
     */
    private List<VpnGatewayIpConfiguration> ipConfigurations;

    /*
     * Enable BGP routes translation for NAT on this VpnGateway.
     */
    private Boolean enableBgpRouteTranslationForNat;

    /*
     * Enable Routing Preference property for the Public IP Interface of the VpnGateway.
     */
    private Boolean isRoutingPreferenceInternet;

    /*
     * List of all the nat Rules associated with the gateway.
     */
    private List<VpnGatewayNatRuleInner> natRules;

    /**
     * Creates an instance of VpnGatewayProperties class.
     */
    public VpnGatewayProperties() {
    }

    /**
     * Get the virtualHub property: The VirtualHub to which the gateway belongs.
     * 
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub property: The VirtualHub to which the gateway belongs.
     * 
     * @param virtualHub the virtualHub value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the connections property: List of all vpn connections to the gateway.
     * 
     * @return the connections value.
     */
    public List<VpnConnectionInner> connections() {
        return this.connections;
    }

    /**
     * Set the connections property: List of all vpn connections to the gateway.
     * 
     * @param connections the connections value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withConnections(List<VpnConnectionInner> connections) {
        this.connections = connections;
        return this;
    }

    /**
     * Get the bgpSettings property: Local network gateway's BGP speaker settings.
     * 
     * @return the bgpSettings value.
     */
    public BgpSettings bgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set the bgpSettings property: Local network gateway's BGP speaker settings.
     * 
     * @param bgpSettings the bgpSettings value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN gateway resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the vpnGatewayScaleUnit property: The scale unit for this vpn gateway.
     * 
     * @return the vpnGatewayScaleUnit value.
     */
    public Integer vpnGatewayScaleUnit() {
        return this.vpnGatewayScaleUnit;
    }

    /**
     * Set the vpnGatewayScaleUnit property: The scale unit for this vpn gateway.
     * 
     * @param vpnGatewayScaleUnit the vpnGatewayScaleUnit value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withVpnGatewayScaleUnit(Integer vpnGatewayScaleUnit) {
        this.vpnGatewayScaleUnit = vpnGatewayScaleUnit;
        return this;
    }

    /**
     * Get the ipConfigurations property: List of all IPs configured on the gateway.
     * 
     * @return the ipConfigurations value.
     */
    public List<VpnGatewayIpConfiguration> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Get the enableBgpRouteTranslationForNat property: Enable BGP routes translation for NAT on this VpnGateway.
     * 
     * @return the enableBgpRouteTranslationForNat value.
     */
    public Boolean enableBgpRouteTranslationForNat() {
        return this.enableBgpRouteTranslationForNat;
    }

    /**
     * Set the enableBgpRouteTranslationForNat property: Enable BGP routes translation for NAT on this VpnGateway.
     * 
     * @param enableBgpRouteTranslationForNat the enableBgpRouteTranslationForNat value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withEnableBgpRouteTranslationForNat(Boolean enableBgpRouteTranslationForNat) {
        this.enableBgpRouteTranslationForNat = enableBgpRouteTranslationForNat;
        return this;
    }

    /**
     * Get the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the VpnGateway.
     * 
     * @return the isRoutingPreferenceInternet value.
     */
    public Boolean isRoutingPreferenceInternet() {
        return this.isRoutingPreferenceInternet;
    }

    /**
     * Set the isRoutingPreferenceInternet property: Enable Routing Preference property for the Public IP Interface of
     * the VpnGateway.
     * 
     * @param isRoutingPreferenceInternet the isRoutingPreferenceInternet value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withIsRoutingPreferenceInternet(Boolean isRoutingPreferenceInternet) {
        this.isRoutingPreferenceInternet = isRoutingPreferenceInternet;
        return this;
    }

    /**
     * Get the natRules property: List of all the nat Rules associated with the gateway.
     * 
     * @return the natRules value.
     */
    public List<VpnGatewayNatRuleInner> natRules() {
        return this.natRules;
    }

    /**
     * Set the natRules property: List of all the nat Rules associated with the gateway.
     * 
     * @param natRules the natRules value to set.
     * @return the VpnGatewayProperties object itself.
     */
    public VpnGatewayProperties withNatRules(List<VpnGatewayNatRuleInner> natRules) {
        this.natRules = natRules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (connections() != null) {
            connections().forEach(e -> e.validate());
        }
        if (bgpSettings() != null) {
            bgpSettings().validate();
        }
        if (ipConfigurations() != null) {
            ipConfigurations().forEach(e -> e.validate());
        }
        if (natRules() != null) {
            natRules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("virtualHub", this.virtualHub);
        jsonWriter.writeArrayField("connections", this.connections, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeJsonField("bgpSettings", this.bgpSettings);
        jsonWriter.writeNumberField("vpnGatewayScaleUnit", this.vpnGatewayScaleUnit);
        jsonWriter.writeBooleanField("enableBgpRouteTranslationForNat", this.enableBgpRouteTranslationForNat);
        jsonWriter.writeBooleanField("isRoutingPreferenceInternet", this.isRoutingPreferenceInternet);
        jsonWriter.writeArrayField("natRules", this.natRules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VpnGatewayProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VpnGatewayProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VpnGatewayProperties.
     */
    public static VpnGatewayProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VpnGatewayProperties deserializedVpnGatewayProperties = new VpnGatewayProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("virtualHub".equals(fieldName)) {
                    deserializedVpnGatewayProperties.virtualHub = SubResource.fromJson(reader);
                } else if ("connections".equals(fieldName)) {
                    List<VpnConnectionInner> connections
                        = reader.readArray(reader1 -> VpnConnectionInner.fromJson(reader1));
                    deserializedVpnGatewayProperties.connections = connections;
                } else if ("bgpSettings".equals(fieldName)) {
                    deserializedVpnGatewayProperties.bgpSettings = BgpSettings.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedVpnGatewayProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("vpnGatewayScaleUnit".equals(fieldName)) {
                    deserializedVpnGatewayProperties.vpnGatewayScaleUnit = reader.getNullable(JsonReader::getInt);
                } else if ("ipConfigurations".equals(fieldName)) {
                    List<VpnGatewayIpConfiguration> ipConfigurations
                        = reader.readArray(reader1 -> VpnGatewayIpConfiguration.fromJson(reader1));
                    deserializedVpnGatewayProperties.ipConfigurations = ipConfigurations;
                } else if ("enableBgpRouteTranslationForNat".equals(fieldName)) {
                    deserializedVpnGatewayProperties.enableBgpRouteTranslationForNat
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("isRoutingPreferenceInternet".equals(fieldName)) {
                    deserializedVpnGatewayProperties.isRoutingPreferenceInternet
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("natRules".equals(fieldName)) {
                    List<VpnGatewayNatRuleInner> natRules
                        = reader.readArray(reader1 -> VpnGatewayNatRuleInner.fromJson(reader1));
                    deserializedVpnGatewayProperties.natRules = natRules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVpnGatewayProperties;
        });
    }
}
