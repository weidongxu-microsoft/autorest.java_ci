// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Defines a managed rule set for Exclusions.
 */
@Fluent
public final class ExclusionManagedRuleSet implements JsonSerializable<ExclusionManagedRuleSet> {
    /*
     * Defines the rule set type to use.
     */
    private String ruleSetType;

    /*
     * Defines the version of the rule set to use.
     */
    private String ruleSetVersion;

    /*
     * Defines the rule groups to apply to the rule set.
     */
    private List<ExclusionManagedRuleGroup> ruleGroups;

    /**
     * Creates an instance of ExclusionManagedRuleSet class.
     */
    public ExclusionManagedRuleSet() {
    }

    /**
     * Get the ruleSetType property: Defines the rule set type to use.
     * 
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Set the ruleSetType property: Defines the rule set type to use.
     * 
     * @param ruleSetType the ruleSetType value to set.
     * @return the ExclusionManagedRuleSet object itself.
     */
    public ExclusionManagedRuleSet withRuleSetType(String ruleSetType) {
        this.ruleSetType = ruleSetType;
        return this;
    }

    /**
     * Get the ruleSetVersion property: Defines the version of the rule set to use.
     * 
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Set the ruleSetVersion property: Defines the version of the rule set to use.
     * 
     * @param ruleSetVersion the ruleSetVersion value to set.
     * @return the ExclusionManagedRuleSet object itself.
     */
    public ExclusionManagedRuleSet withRuleSetVersion(String ruleSetVersion) {
        this.ruleSetVersion = ruleSetVersion;
        return this;
    }

    /**
     * Get the ruleGroups property: Defines the rule groups to apply to the rule set.
     * 
     * @return the ruleGroups value.
     */
    public List<ExclusionManagedRuleGroup> ruleGroups() {
        return this.ruleGroups;
    }

    /**
     * Set the ruleGroups property: Defines the rule groups to apply to the rule set.
     * 
     * @param ruleGroups the ruleGroups value to set.
     * @return the ExclusionManagedRuleSet object itself.
     */
    public ExclusionManagedRuleSet withRuleGroups(List<ExclusionManagedRuleGroup> ruleGroups) {
        this.ruleGroups = ruleGroups;
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
                    "Missing required property ruleSetType in model ExclusionManagedRuleSet"));
        }
        if (ruleSetVersion() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ruleSetVersion in model ExclusionManagedRuleSet"));
        }
        if (ruleGroups() != null) {
            ruleGroups().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExclusionManagedRuleSet.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("ruleSetType", this.ruleSetType);
        jsonWriter.writeStringField("ruleSetVersion", this.ruleSetVersion);
        jsonWriter.writeArrayField("ruleGroups", this.ruleGroups, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExclusionManagedRuleSet from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExclusionManagedRuleSet if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExclusionManagedRuleSet.
     */
    public static ExclusionManagedRuleSet fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExclusionManagedRuleSet deserializedExclusionManagedRuleSet = new ExclusionManagedRuleSet();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ruleSetType".equals(fieldName)) {
                    deserializedExclusionManagedRuleSet.ruleSetType = reader.getString();
                } else if ("ruleSetVersion".equals(fieldName)) {
                    deserializedExclusionManagedRuleSet.ruleSetVersion = reader.getString();
                } else if ("ruleGroups".equals(fieldName)) {
                    List<ExclusionManagedRuleGroup> ruleGroups
                        = reader.readArray(reader1 -> ExclusionManagedRuleGroup.fromJson(reader1));
                    deserializedExclusionManagedRuleSet.ruleGroups = ruleGroups;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExclusionManagedRuleSet;
        });
    }
}
