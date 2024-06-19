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

/**
 * Defines the Resource ID for a Security Policy.
 */
@Fluent
public final class SecurityPolicyLink implements JsonSerializable<SecurityPolicyLink> {
    /*
     * Resource ID.
     */
    private String id;

    /**
     * Creates an instance of SecurityPolicyLink class.
     */
    public SecurityPolicyLink() {
    }

    /**
     * Get the id property: Resource ID.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     * 
     * @param id the id value to set.
     * @return the SecurityPolicyLink object itself.
     */
    public SecurityPolicyLink withId(String id) {
        this.id = id;
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
        jsonWriter.writeStringField("id", this.id);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecurityPolicyLink from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecurityPolicyLink if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SecurityPolicyLink.
     */
    public static SecurityPolicyLink fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecurityPolicyLink deserializedSecurityPolicyLink = new SecurityPolicyLink();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSecurityPolicyLink.id = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecurityPolicyLink;
        });
    }
}
