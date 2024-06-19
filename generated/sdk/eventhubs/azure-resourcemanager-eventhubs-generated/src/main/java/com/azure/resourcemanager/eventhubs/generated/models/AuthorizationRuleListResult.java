// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.AuthorizationRuleInner;
import java.io.IOException;
import java.util.List;

/**
 * The response from the List namespace operation.
 */
@Fluent
public final class AuthorizationRuleListResult implements JsonSerializable<AuthorizationRuleListResult> {
    /*
     * Result of the List Authorization Rules operation.
     */
    private List<AuthorizationRuleInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains an incomplete list of Authorization Rules
     */
    private String nextLink;

    /**
     * Creates an instance of AuthorizationRuleListResult class.
     */
    public AuthorizationRuleListResult() {
    }

    /**
     * Get the value property: Result of the List Authorization Rules operation.
     * 
     * @return the value value.
     */
    public List<AuthorizationRuleInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Authorization Rules operation.
     * 
     * @param value the value value to set.
     * @return the AuthorizationRuleListResult object itself.
     */
    public AuthorizationRuleListResult withValue(List<AuthorizationRuleInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains an incomplete list of
     * Authorization Rules.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains an incomplete list of
     * Authorization Rules.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AuthorizationRuleListResult object itself.
     */
    public AuthorizationRuleListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AuthorizationRuleListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AuthorizationRuleListResult if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AuthorizationRuleListResult.
     */
    public static AuthorizationRuleListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AuthorizationRuleListResult deserializedAuthorizationRuleListResult = new AuthorizationRuleListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AuthorizationRuleInner> value
                        = reader.readArray(reader1 -> AuthorizationRuleInner.fromJson(reader1));
                    deserializedAuthorizationRuleListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAuthorizationRuleListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAuthorizationRuleListResult;
        });
    }
}
