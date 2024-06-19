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
 * name and value of HTTP/S header to insert.
 */
@Fluent
public final class FirewallPolicyHttpHeaderToInsert implements JsonSerializable<FirewallPolicyHttpHeaderToInsert> {
    /*
     * Contains the name of the header
     */
    private String headerName;

    /*
     * Contains the value of the header
     */
    private String headerValue;

    /**
     * Creates an instance of FirewallPolicyHttpHeaderToInsert class.
     */
    public FirewallPolicyHttpHeaderToInsert() {
    }

    /**
     * Get the headerName property: Contains the name of the header.
     * 
     * @return the headerName value.
     */
    public String headerName() {
        return this.headerName;
    }

    /**
     * Set the headerName property: Contains the name of the header.
     * 
     * @param headerName the headerName value to set.
     * @return the FirewallPolicyHttpHeaderToInsert object itself.
     */
    public FirewallPolicyHttpHeaderToInsert withHeaderName(String headerName) {
        this.headerName = headerName;
        return this;
    }

    /**
     * Get the headerValue property: Contains the value of the header.
     * 
     * @return the headerValue value.
     */
    public String headerValue() {
        return this.headerValue;
    }

    /**
     * Set the headerValue property: Contains the value of the header.
     * 
     * @param headerValue the headerValue value to set.
     * @return the FirewallPolicyHttpHeaderToInsert object itself.
     */
    public FirewallPolicyHttpHeaderToInsert withHeaderValue(String headerValue) {
        this.headerValue = headerValue;
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
        jsonWriter.writeStringField("headerName", this.headerName);
        jsonWriter.writeStringField("headerValue", this.headerValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FirewallPolicyHttpHeaderToInsert from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FirewallPolicyHttpHeaderToInsert if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the FirewallPolicyHttpHeaderToInsert.
     */
    public static FirewallPolicyHttpHeaderToInsert fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FirewallPolicyHttpHeaderToInsert deserializedFirewallPolicyHttpHeaderToInsert
                = new FirewallPolicyHttpHeaderToInsert();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("headerName".equals(fieldName)) {
                    deserializedFirewallPolicyHttpHeaderToInsert.headerName = reader.getString();
                } else if ("headerValue".equals(fieldName)) {
                    deserializedFirewallPolicyHttpHeaderToInsert.headerValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFirewallPolicyHttpHeaderToInsert;
        });
    }
}
