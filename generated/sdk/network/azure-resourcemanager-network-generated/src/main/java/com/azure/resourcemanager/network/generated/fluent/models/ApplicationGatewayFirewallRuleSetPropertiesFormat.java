// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayFirewallRuleGroup;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayTierTypes;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the web application firewall rule set.
 */
@Fluent
public final class ApplicationGatewayFirewallRuleSetPropertiesFormat
    implements JsonSerializable<ApplicationGatewayFirewallRuleSetPropertiesFormat> {
    /*
     * The provisioning state of the web application firewall rule set.
     */
    private ProvisioningState provisioningState;

    /*
     * The type of the web application firewall rule set.
     */
    private String ruleSetType;

    /*
     * The version of the web application firewall rule set type.
     */
    private String ruleSetVersion;

    /*
     * The rule groups of the web application firewall rule set.
     */
    private List<ApplicationGatewayFirewallRuleGroup> ruleGroups;

    /*
     * Tier of an application gateway that support the rule set.
     */
    private List<ApplicationGatewayTierTypes> tiers;

    /**
     * Creates an instance of ApplicationGatewayFirewallRuleSetPropertiesFormat class.
     */
    public ApplicationGatewayFirewallRuleSetPropertiesFormat() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the web application firewall rule set.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the ruleSetType property: The type of the web application firewall rule set.
     * 
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Set the ruleSetType property: The type of the web application firewall rule set.
     * 
     * @param ruleSetType the ruleSetType value to set.
     * @return the ApplicationGatewayFirewallRuleSetPropertiesFormat object itself.
     */
    public ApplicationGatewayFirewallRuleSetPropertiesFormat withRuleSetType(String ruleSetType) {
        this.ruleSetType = ruleSetType;
        return this;
    }

    /**
     * Get the ruleSetVersion property: The version of the web application firewall rule set type.
     * 
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Set the ruleSetVersion property: The version of the web application firewall rule set type.
     * 
     * @param ruleSetVersion the ruleSetVersion value to set.
     * @return the ApplicationGatewayFirewallRuleSetPropertiesFormat object itself.
     */
    public ApplicationGatewayFirewallRuleSetPropertiesFormat withRuleSetVersion(String ruleSetVersion) {
        this.ruleSetVersion = ruleSetVersion;
        return this;
    }

    /**
     * Get the ruleGroups property: The rule groups of the web application firewall rule set.
     * 
     * @return the ruleGroups value.
     */
    public List<ApplicationGatewayFirewallRuleGroup> ruleGroups() {
        return this.ruleGroups;
    }

    /**
     * Set the ruleGroups property: The rule groups of the web application firewall rule set.
     * 
     * @param ruleGroups the ruleGroups value to set.
     * @return the ApplicationGatewayFirewallRuleSetPropertiesFormat object itself.
     */
    public ApplicationGatewayFirewallRuleSetPropertiesFormat
        withRuleGroups(List<ApplicationGatewayFirewallRuleGroup> ruleGroups) {
        this.ruleGroups = ruleGroups;
        return this;
    }

    /**
     * Get the tiers property: Tier of an application gateway that support the rule set.
     * 
     * @return the tiers value.
     */
    public List<ApplicationGatewayTierTypes> tiers() {
        return this.tiers;
    }

    /**
     * Set the tiers property: Tier of an application gateway that support the rule set.
     * 
     * @param tiers the tiers value to set.
     * @return the ApplicationGatewayFirewallRuleSetPropertiesFormat object itself.
     */
    public ApplicationGatewayFirewallRuleSetPropertiesFormat withTiers(List<ApplicationGatewayTierTypes> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ruleSetType() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ruleSetType in model ApplicationGatewayFirewallRuleSetPropertiesFormat"));
        }
        if (ruleSetVersion() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ruleSetVersion in model ApplicationGatewayFirewallRuleSetPropertiesFormat"));
        }
        if (ruleGroups() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ruleGroups in model ApplicationGatewayFirewallRuleSetPropertiesFormat"));
        } else {
            ruleGroups().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER
        = new ClientLogger(ApplicationGatewayFirewallRuleSetPropertiesFormat.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("ruleSetType", this.ruleSetType);
        jsonWriter.writeStringField("ruleSetVersion", this.ruleSetVersion);
        jsonWriter.writeArrayField("ruleGroups", this.ruleGroups, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("tiers", this.tiers,
            (writer, element) -> writer.writeString(element == null ? null : element.toString()));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGatewayFirewallRuleSetPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGatewayFirewallRuleSetPropertiesFormat if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ApplicationGatewayFirewallRuleSetPropertiesFormat.
     */
    public static ApplicationGatewayFirewallRuleSetPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGatewayFirewallRuleSetPropertiesFormat deserializedApplicationGatewayFirewallRuleSetPropertiesFormat
                = new ApplicationGatewayFirewallRuleSetPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ruleSetType".equals(fieldName)) {
                    deserializedApplicationGatewayFirewallRuleSetPropertiesFormat.ruleSetType = reader.getString();
                } else if ("ruleSetVersion".equals(fieldName)) {
                    deserializedApplicationGatewayFirewallRuleSetPropertiesFormat.ruleSetVersion = reader.getString();
                } else if ("ruleGroups".equals(fieldName)) {
                    List<ApplicationGatewayFirewallRuleGroup> ruleGroups
                        = reader.readArray(reader1 -> ApplicationGatewayFirewallRuleGroup.fromJson(reader1));
                    deserializedApplicationGatewayFirewallRuleSetPropertiesFormat.ruleGroups = ruleGroups;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedApplicationGatewayFirewallRuleSetPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("tiers".equals(fieldName)) {
                    List<ApplicationGatewayTierTypes> tiers
                        = reader.readArray(reader1 -> ApplicationGatewayTierTypes.fromString(reader1.getString()));
                    deserializedApplicationGatewayFirewallRuleSetPropertiesFormat.tiers = tiers;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGatewayFirewallRuleSetPropertiesFormat;
        });
    }
}
