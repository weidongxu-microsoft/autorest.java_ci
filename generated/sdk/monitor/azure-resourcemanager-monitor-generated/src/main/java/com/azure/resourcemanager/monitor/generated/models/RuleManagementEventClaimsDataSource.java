// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The claims for a rule management event data source.
 */
@Fluent
public final class RuleManagementEventClaimsDataSource
    implements JsonSerializable<RuleManagementEventClaimsDataSource> {
    /*
     * the email address.
     */
    private String emailAddress;

    /**
     * Creates an instance of RuleManagementEventClaimsDataSource class.
     */
    public RuleManagementEventClaimsDataSource() {
    }

    /**
     * Get the emailAddress property: the email address.
     * 
     * @return the emailAddress value.
     */
    public String emailAddress() {
        return this.emailAddress;
    }

    /**
     * Set the emailAddress property: the email address.
     * 
     * @param emailAddress the emailAddress value to set.
     * @return the RuleManagementEventClaimsDataSource object itself.
     */
    public RuleManagementEventClaimsDataSource withEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
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
        jsonWriter.writeStringField("emailAddress", this.emailAddress);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RuleManagementEventClaimsDataSource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RuleManagementEventClaimsDataSource if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RuleManagementEventClaimsDataSource.
     */
    public static RuleManagementEventClaimsDataSource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RuleManagementEventClaimsDataSource deserializedRuleManagementEventClaimsDataSource
                = new RuleManagementEventClaimsDataSource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("emailAddress".equals(fieldName)) {
                    deserializedRuleManagementEventClaimsDataSource.emailAddress = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRuleManagementEventClaimsDataSource;
        });
    }
}
