// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.relay.generated.models.DefaultAction;
import com.azure.resourcemanager.relay.generated.models.NWRuleSetIpRules;
import com.azure.resourcemanager.relay.generated.models.PublicNetworkAccess;
import java.io.IOException;
import java.util.List;

/**
 * NetworkRuleSet properties.
 */
@Fluent
public final class NetworkRuleSetProperties implements JsonSerializable<NetworkRuleSetProperties> {
    /*
     * Value that indicates whether Trusted Service Access is Enabled or not.
     */
    private Boolean trustedServiceAccessEnabled;

    /*
     * Default Action for Network Rule Set
     */
    private DefaultAction defaultAction;

    /*
     * This determines if traffic is allowed over public network. By default it is enabled
     */
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * List of IpRules
     */
    private List<NWRuleSetIpRules> ipRules;

    /**
     * Creates an instance of NetworkRuleSetProperties class.
     */
    public NetworkRuleSetProperties() {
    }

    /**
     * Get the trustedServiceAccessEnabled property: Value that indicates whether Trusted Service Access is Enabled or
     * not.
     * 
     * @return the trustedServiceAccessEnabled value.
     */
    public Boolean trustedServiceAccessEnabled() {
        return this.trustedServiceAccessEnabled;
    }

    /**
     * Set the trustedServiceAccessEnabled property: Value that indicates whether Trusted Service Access is Enabled or
     * not.
     * 
     * @param trustedServiceAccessEnabled the trustedServiceAccessEnabled value to set.
     * @return the NetworkRuleSetProperties object itself.
     */
    public NetworkRuleSetProperties withTrustedServiceAccessEnabled(Boolean trustedServiceAccessEnabled) {
        this.trustedServiceAccessEnabled = trustedServiceAccessEnabled;
        return this;
    }

    /**
     * Get the defaultAction property: Default Action for Network Rule Set.
     * 
     * @return the defaultAction value.
     */
    public DefaultAction defaultAction() {
        return this.defaultAction;
    }

    /**
     * Set the defaultAction property: Default Action for Network Rule Set.
     * 
     * @param defaultAction the defaultAction value to set.
     * @return the NetworkRuleSetProperties object itself.
     */
    public NetworkRuleSetProperties withDefaultAction(DefaultAction defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the NetworkRuleSetProperties object itself.
     */
    public NetworkRuleSetProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the ipRules property: List of IpRules.
     * 
     * @return the ipRules value.
     */
    public List<NWRuleSetIpRules> ipRules() {
        return this.ipRules;
    }

    /**
     * Set the ipRules property: List of IpRules.
     * 
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSetProperties object itself.
     */
    public NetworkRuleSetProperties withIpRules(List<NWRuleSetIpRules> ipRules) {
        this.ipRules = ipRules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipRules() != null) {
            ipRules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("trustedServiceAccessEnabled", this.trustedServiceAccessEnabled);
        jsonWriter.writeStringField("defaultAction", this.defaultAction == null ? null : this.defaultAction.toString());
        jsonWriter.writeStringField("publicNetworkAccess",
            this.publicNetworkAccess == null ? null : this.publicNetworkAccess.toString());
        jsonWriter.writeArrayField("ipRules", this.ipRules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkRuleSetProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkRuleSetProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NetworkRuleSetProperties.
     */
    public static NetworkRuleSetProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkRuleSetProperties deserializedNetworkRuleSetProperties = new NetworkRuleSetProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("trustedServiceAccessEnabled".equals(fieldName)) {
                    deserializedNetworkRuleSetProperties.trustedServiceAccessEnabled
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("defaultAction".equals(fieldName)) {
                    deserializedNetworkRuleSetProperties.defaultAction = DefaultAction.fromString(reader.getString());
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedNetworkRuleSetProperties.publicNetworkAccess
                        = PublicNetworkAccess.fromString(reader.getString());
                } else if ("ipRules".equals(fieldName)) {
                    List<NWRuleSetIpRules> ipRules = reader.readArray(reader1 -> NWRuleSetIpRules.fromJson(reader1));
                    deserializedNetworkRuleSetProperties.ipRules = ipRules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkRuleSetProperties;
        });
    }
}
