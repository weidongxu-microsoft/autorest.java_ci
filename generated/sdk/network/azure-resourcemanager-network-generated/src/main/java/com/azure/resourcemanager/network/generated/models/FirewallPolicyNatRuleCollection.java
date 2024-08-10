// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Firewall Policy NAT Rule Collection.
 */
@Fluent
public final class FirewallPolicyNatRuleCollection extends FirewallPolicyRuleCollection {
    /*
     * The type of the rule collection.
     */
    private FirewallPolicyRuleCollectionType ruleCollectionType
        = FirewallPolicyRuleCollectionType.FIREWALL_POLICY_NAT_RULE_COLLECTION;

    /*
     * The action type of a Nat rule collection.
     */
    private FirewallPolicyNatRuleCollectionAction action;

    /*
     * List of rules included in a rule collection.
     */
    private List<FirewallPolicyRule> rules;

    /**
     * Creates an instance of FirewallPolicyNatRuleCollection class.
     */
    public FirewallPolicyNatRuleCollection() {
    }

    /**
     * Get the ruleCollectionType property: The type of the rule collection.
     * 
     * @return the ruleCollectionType value.
     */
    @Override
    public FirewallPolicyRuleCollectionType ruleCollectionType() {
        return this.ruleCollectionType;
    }

    /**
     * Get the action property: The action type of a Nat rule collection.
     * 
     * @return the action value.
     */
    public FirewallPolicyNatRuleCollectionAction action() {
        return this.action;
    }

    /**
     * Set the action property: The action type of a Nat rule collection.
     * 
     * @param action the action value to set.
     * @return the FirewallPolicyNatRuleCollection object itself.
     */
    public FirewallPolicyNatRuleCollection withAction(FirewallPolicyNatRuleCollectionAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get the rules property: List of rules included in a rule collection.
     * 
     * @return the rules value.
     */
    public List<FirewallPolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: List of rules included in a rule collection.
     * 
     * @param rules the rules value to set.
     * @return the FirewallPolicyNatRuleCollection object itself.
     */
    public FirewallPolicyNatRuleCollection withRules(List<FirewallPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirewallPolicyNatRuleCollection withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FirewallPolicyNatRuleCollection withPriority(Integer priority) {
        super.withPriority(priority);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
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
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeNumberField("priority", priority());
        jsonWriter.writeStringField("ruleCollectionType",
            this.ruleCollectionType == null ? null : this.ruleCollectionType.toString());
        jsonWriter.writeJsonField("action", this.action);
        jsonWriter.writeArrayField("rules", this.rules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FirewallPolicyNatRuleCollection from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FirewallPolicyNatRuleCollection if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FirewallPolicyNatRuleCollection.
     */
    public static FirewallPolicyNatRuleCollection fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FirewallPolicyNatRuleCollection deserializedFirewallPolicyNatRuleCollection
                = new FirewallPolicyNatRuleCollection();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedFirewallPolicyNatRuleCollection.withName(reader.getString());
                } else if ("priority".equals(fieldName)) {
                    deserializedFirewallPolicyNatRuleCollection.withPriority(reader.getNullable(JsonReader::getInt));
                } else if ("ruleCollectionType".equals(fieldName)) {
                    deserializedFirewallPolicyNatRuleCollection.ruleCollectionType
                        = FirewallPolicyRuleCollectionType.fromString(reader.getString());
                } else if ("action".equals(fieldName)) {
                    deserializedFirewallPolicyNatRuleCollection.action
                        = FirewallPolicyNatRuleCollectionAction.fromJson(reader);
                } else if ("rules".equals(fieldName)) {
                    List<FirewallPolicyRule> rules = reader.readArray(reader1 -> FirewallPolicyRule.fromJson(reader1));
                    deserializedFirewallPolicyNatRuleCollection.rules = rules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFirewallPolicyNatRuleCollection;
        });
    }
}
