// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.relay.generated.models.DefaultAction;
import com.azure.resourcemanager.relay.generated.models.NWRuleSetIpRules;
import com.azure.resourcemanager.relay.generated.models.PublicNetworkAccess;
import java.io.IOException;
import java.util.List;

/**
 * Description of topic resource.
 */
@Fluent
public final class NetworkRuleSetInner extends ProxyResource {
    /*
     * NetworkRuleSet properties
     */
    private NetworkRuleSetProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    private SystemData systemData;

    /*
     * The type of the resource.
     */
    private String type;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /**
     * Creates an instance of NetworkRuleSetInner class.
     */
    public NetworkRuleSetInner() {
    }

    /**
     * Get the innerProperties property: NetworkRuleSet properties.
     * 
     * @return the innerProperties value.
     */
    private NetworkRuleSetProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the trustedServiceAccessEnabled property: Value that indicates whether Trusted Service Access is Enabled or
     * not.
     * 
     * @return the trustedServiceAccessEnabled value.
     */
    public Boolean trustedServiceAccessEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().trustedServiceAccessEnabled();
    }

    /**
     * Set the trustedServiceAccessEnabled property: Value that indicates whether Trusted Service Access is Enabled or
     * not.
     * 
     * @param trustedServiceAccessEnabled the trustedServiceAccessEnabled value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withTrustedServiceAccessEnabled(Boolean trustedServiceAccessEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRuleSetProperties();
        }
        this.innerProperties().withTrustedServiceAccessEnabled(trustedServiceAccessEnabled);
        return this;
    }

    /**
     * Get the defaultAction property: Default Action for Network Rule Set.
     * 
     * @return the defaultAction value.
     */
    public DefaultAction defaultAction() {
        return this.innerProperties() == null ? null : this.innerProperties().defaultAction();
    }

    /**
     * Set the defaultAction property: Default Action for Network Rule Set.
     * 
     * @param defaultAction the defaultAction value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withDefaultAction(DefaultAction defaultAction) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRuleSetProperties();
        }
        this.innerProperties().withDefaultAction(defaultAction);
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.innerProperties() == null ? null : this.innerProperties().publicNetworkAccess();
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRuleSetProperties();
        }
        this.innerProperties().withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /**
     * Get the ipRules property: List of IpRules.
     * 
     * @return the ipRules value.
     */
    public List<NWRuleSetIpRules> ipRules() {
        return this.innerProperties() == null ? null : this.innerProperties().ipRules();
    }

    /**
     * Set the ipRules property: List of IpRules.
     * 
     * @param ipRules the ipRules value to set.
     * @return the NetworkRuleSetInner object itself.
     */
    public NetworkRuleSetInner withIpRules(List<NWRuleSetIpRules> ipRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkRuleSetProperties();
        }
        this.innerProperties().withIpRules(ipRules);
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

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NetworkRuleSetInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NetworkRuleSetInner if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NetworkRuleSetInner.
     */
    public static NetworkRuleSetInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NetworkRuleSetInner deserializedNetworkRuleSetInner = new NetworkRuleSetInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedNetworkRuleSetInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedNetworkRuleSetInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedNetworkRuleSetInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedNetworkRuleSetInner.innerProperties = NetworkRuleSetProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedNetworkRuleSetInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNetworkRuleSetInner;
        });
    }
}
