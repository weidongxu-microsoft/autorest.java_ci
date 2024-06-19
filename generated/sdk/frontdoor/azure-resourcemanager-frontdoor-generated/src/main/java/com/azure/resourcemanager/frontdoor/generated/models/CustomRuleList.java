// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Defines contents of custom rules.
 */
@Fluent
public final class CustomRuleList implements JsonSerializable<CustomRuleList> {
    /*
     * List of rules
     */
    private List<CustomRule> rules;

    /**
     * Creates an instance of CustomRuleList class.
     */
    public CustomRuleList() {
    }

    /**
     * Get the rules property: List of rules.
     * 
     * @return the rules value.
     */
    public List<CustomRule> rules() {
        return this.rules;
    }

    /**
     * Set the rules property: List of rules.
     * 
     * @param rules the rules value to set.
     * @return the CustomRuleList object itself.
     */
    public CustomRuleList withRules(List<CustomRule> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
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
        jsonWriter.writeArrayField("rules", this.rules, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of CustomRuleList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of CustomRuleList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the CustomRuleList.
     */
    public static CustomRuleList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            CustomRuleList deserializedCustomRuleList = new CustomRuleList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("rules".equals(fieldName)) {
                    List<CustomRule> rules = reader.readArray(reader1 -> CustomRule.fromJson(reader1));
                    deserializedCustomRuleList.rules = rules;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedCustomRuleList;
        });
    }
}
