// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The SignedIdentifier model.
 */
@Fluent
public final class SignedIdentifier implements JsonSerializable<SignedIdentifier> {
    /*
     * An unique identifier of the stored access policy.
     */
    private String id;

    /*
     * Access policy
     */
    private AccessPolicy accessPolicy;

    /**
     * Creates an instance of SignedIdentifier class.
     */
    public SignedIdentifier() {
    }

    /**
     * Get the id property: An unique identifier of the stored access policy.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: An unique identifier of the stored access policy.
     * 
     * @param id the id value to set.
     * @return the SignedIdentifier object itself.
     */
    public SignedIdentifier withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the accessPolicy property: Access policy.
     * 
     * @return the accessPolicy value.
     */
    public AccessPolicy accessPolicy() {
        return this.accessPolicy;
    }

    /**
     * Set the accessPolicy property: Access policy.
     * 
     * @param accessPolicy the accessPolicy value to set.
     * @return the SignedIdentifier object itself.
     */
    public SignedIdentifier withAccessPolicy(AccessPolicy accessPolicy) {
        this.accessPolicy = accessPolicy;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accessPolicy() != null) {
            accessPolicy().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeJsonField("accessPolicy", this.accessPolicy);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SignedIdentifier from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SignedIdentifier if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SignedIdentifier.
     */
    public static SignedIdentifier fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SignedIdentifier deserializedSignedIdentifier = new SignedIdentifier();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedSignedIdentifier.id = reader.getString();
                } else if ("accessPolicy".equals(fieldName)) {
                    deserializedSignedIdentifier.accessPolicy = AccessPolicy.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSignedIdentifier;
        });
    }
}
