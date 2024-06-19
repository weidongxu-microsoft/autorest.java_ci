// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Matched rule.
 */
@Fluent
public final class MatchedRule implements JsonSerializable<MatchedRule> {
    /*
     * Name of the matched network security rule.
     */
    private String ruleName;

    /*
     * The network traffic is allowed or denied. Possible values are 'Allow' and 'Deny'.
     */
    private String action;

    /**
     * Creates an instance of MatchedRule class.
     */
    public MatchedRule() {
    }

    /**
     * Get the ruleName property: Name of the matched network security rule.
     * 
     * @return the ruleName value.
     */
    public String ruleName() {
        return this.ruleName;
    }

    /**
     * Set the ruleName property: Name of the matched network security rule.
     * 
     * @param ruleName the ruleName value to set.
     * @return the MatchedRule object itself.
     */
    public MatchedRule withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * Get the action property: The network traffic is allowed or denied. Possible values are 'Allow' and 'Deny'.
     * 
     * @return the action value.
     */
    public String action() {
        return this.action;
    }

    /**
     * Set the action property: The network traffic is allowed or denied. Possible values are 'Allow' and 'Deny'.
     * 
     * @param action the action value to set.
     * @return the MatchedRule object itself.
     */
    public MatchedRule withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("ruleName", this.ruleName);
        jsonWriter.writeStringField("action", this.action);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MatchedRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MatchedRule if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the MatchedRule.
     */
    public static MatchedRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MatchedRule deserializedMatchedRule = new MatchedRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ruleName".equals(fieldName)) {
                    deserializedMatchedRule.ruleName = reader.getString();
                } else if ("action".equals(fieldName)) {
                    deserializedMatchedRule.action = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMatchedRule;
        });
    }
}
