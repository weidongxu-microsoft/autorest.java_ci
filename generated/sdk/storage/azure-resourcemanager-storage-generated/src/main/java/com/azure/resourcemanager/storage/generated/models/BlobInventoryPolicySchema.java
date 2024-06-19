// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The storage account blob inventory policy rules.
 */
@Fluent
public final class BlobInventoryPolicySchema implements JsonSerializable<BlobInventoryPolicySchema> {
    /*
     * Policy is enabled if set to true.
     */
    private boolean enabled;

    /*
     * Deprecated Property from API version 2021-04-01 onwards, the required destination container name must be
     * specified at the rule level 'policy.rule.destination'
     */
    private String destination;

    /*
     * The valid value is Inventory
     */
    private InventoryRuleType type;

    /*
     * The storage account blob inventory policy rules. The rule is applied when it is enabled.
     */
    private List<BlobInventoryPolicyRule> rules;

    /**
     * Creates an instance of BlobInventoryPolicySchema class.
     */
    public BlobInventoryPolicySchema() {
    }

    /**
     * Get the enabled property: Policy is enabled if set to true.
     * 
     * @return the enabled value.
     */
    public boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Policy is enabled if set to true.
     * 
     * @param enabled the enabled value to set.
     * @return the BlobInventoryPolicySchema object itself.
     */
    public BlobInventoryPolicySchema withEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the destination property: Deprecated Property from API version 2021-04-01 onwards, the required destination
     * container name must be specified at the rule level 'policy.rule.destination'.
     * 
     * @return the destination value.
     */
    public String destination() {
        return this.destination;
    }

    /**
     * Get the type property: The valid value is Inventory.
     * 
     * @return the type value.
     */
    public InventoryRuleType type() {
        return this.type;
    }

    /**
     * Set the type property: The valid value is Inventory.
     * 
     * @param type the type value to set.
     * @return the BlobInventoryPolicySchema object itself.
     */
    public BlobInventoryPolicySchema withType(InventoryRuleType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the rules property: The storage account blob inventory policy rules. The rule is applied when it is enabled.
     * 
     * @return the rules value.
     */
    public List<BlobInventoryPolicyRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: The storage account blob inventory policy rules. The rule is applied when it is enabled.
     * 
     * @param rules the rules value to set.
     * @return the BlobInventoryPolicySchema object itself.
     */
    public BlobInventoryPolicySchema withRules(List<BlobInventoryPolicyRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property type in model BlobInventoryPolicySchema"));
        }
        if (rules() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property rules in model BlobInventoryPolicySchema"));
        } else {
            rules().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BlobInventoryPolicySchema.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", this.enabled);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeArrayField("rules", this.rules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BlobInventoryPolicySchema from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BlobInventoryPolicySchema if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BlobInventoryPolicySchema.
     */
    public static BlobInventoryPolicySchema fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BlobInventoryPolicySchema deserializedBlobInventoryPolicySchema = new BlobInventoryPolicySchema();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedBlobInventoryPolicySchema.enabled = reader.getBoolean();
                } else if ("type".equals(fieldName)) {
                    deserializedBlobInventoryPolicySchema.type = InventoryRuleType.fromString(reader.getString());
                } else if ("rules".equals(fieldName)) {
                    List<BlobInventoryPolicyRule> rules
                        = reader.readArray(reader1 -> BlobInventoryPolicyRule.fromJson(reader1));
                    deserializedBlobInventoryPolicySchema.rules = rules;
                } else if ("destination".equals(fieldName)) {
                    deserializedBlobInventoryPolicySchema.destination = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBlobInventoryPolicySchema;
        });
    }
}
