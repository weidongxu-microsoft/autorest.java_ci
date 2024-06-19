// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Namespace regenerate share access key request.
 */
@Fluent
public final class NamespaceRegenerateKeyRequest implements JsonSerializable<NamespaceRegenerateKeyRequest> {
    /*
     * Key name to regenerate key1 or key2.
     */
    private String keyName;

    /**
     * Creates an instance of NamespaceRegenerateKeyRequest class.
     */
    public NamespaceRegenerateKeyRequest() {
    }

    /**
     * Get the keyName property: Key name to regenerate key1 or key2.
     * 
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: Key name to regenerate key1 or key2.
     * 
     * @param keyName the keyName value to set.
     * @return the NamespaceRegenerateKeyRequest object itself.
     */
    public NamespaceRegenerateKeyRequest withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property keyName in model NamespaceRegenerateKeyRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NamespaceRegenerateKeyRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("keyName", this.keyName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NamespaceRegenerateKeyRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NamespaceRegenerateKeyRequest if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the NamespaceRegenerateKeyRequest.
     */
    public static NamespaceRegenerateKeyRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NamespaceRegenerateKeyRequest deserializedNamespaceRegenerateKeyRequest
                = new NamespaceRegenerateKeyRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("keyName".equals(fieldName)) {
                    deserializedNamespaceRegenerateKeyRequest.keyName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNamespaceRegenerateKeyRequest;
        });
    }
}
