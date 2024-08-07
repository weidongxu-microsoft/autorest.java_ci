// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNatRCAction;
import com.azure.resourcemanager.network.generated.models.AzureFirewallNatRule;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Properties of the NAT rule collection.
 */
@Fluent
public final class AzureFirewallNatRuleCollectionProperties
    implements JsonSerializable<AzureFirewallNatRuleCollectionProperties> {
    /*
     * Priority of the NAT rule collection resource.
     */
    private Integer priority;

    /*
     * The action type of a NAT rule collection.
     */
    private AzureFirewallNatRCAction action;

    /*
     * Collection of rules used by a NAT rule collection.
     */
    private List<AzureFirewallNatRule> rules;

    /*
     * The provisioning state of the NAT rule collection resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of AzureFirewallNatRuleCollectionProperties class.
     */
    public AzureFirewallNatRuleCollectionProperties() {
    }

    /**
     * Get the priority property: Priority of the NAT rule collection resource.
     * 
     * @return the priority value.
     */
    public Integer priority() {
        return this.priority;
    }

    /**
     * Set the priority property: Priority of the NAT rule collection resource.
     * 
     * @param priority the priority value to set.
     * @return the AzureFirewallNatRuleCollectionProperties object itself.
     */
    public AzureFirewallNatRuleCollectionProperties withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * Get the action property: The action type of a NAT rule collection.
     * 
     * @return the action value.
     */
    public AzureFirewallNatRCAction action() {
        return this.action;
    }

    /**
     * Set the action property: The action type of a NAT rule collection.
     * 
     * @param action the action value to set.
     * @return the AzureFirewallNatRuleCollectionProperties object itself.
     */
    public AzureFirewallNatRuleCollectionProperties withAction(AzureFirewallNatRCAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the rules property: Collection of rules used by a NAT rule collection.
     * 
     * @return the rules value.
     */
    public List<AzureFirewallNatRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: Collection of rules used by a NAT rule collection.
     * 
     * @param rules the rules value to set.
     * @return the AzureFirewallNatRuleCollectionProperties object itself.
     */
    public AzureFirewallNatRuleCollectionProperties withRules(List<AzureFirewallNatRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the NAT rule collection resource.
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
        if (action() != null) {
            action().validate();
        }
        if (rules() != null) {
            rules().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeNumberField("priority", this.priority);
        jsonWriter.writeJsonField("action", this.action);
        jsonWriter.writeArrayField("rules", this.rules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFirewallNatRuleCollectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFirewallNatRuleCollectionProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureFirewallNatRuleCollectionProperties.
     */
    public static AzureFirewallNatRuleCollectionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFirewallNatRuleCollectionProperties deserializedAzureFirewallNatRuleCollectionProperties
                = new AzureFirewallNatRuleCollectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("priority".equals(fieldName)) {
                    deserializedAzureFirewallNatRuleCollectionProperties.priority
                        = reader.getNullable(JsonReader::getInt);
                } else if ("action".equals(fieldName)) {
                    deserializedAzureFirewallNatRuleCollectionProperties.action
                        = AzureFirewallNatRCAction.fromJson(reader);
                } else if ("rules".equals(fieldName)) {
                    List<AzureFirewallNatRule> rules
                        = reader.readArray(reader1 -> AzureFirewallNatRule.fromJson(reader1));
                    deserializedAzureFirewallNatRuleCollectionProperties.rules = rules;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedAzureFirewallNatRuleCollectionProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureFirewallNatRuleCollectionProperties;
        });
    }
}
