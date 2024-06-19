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

/**
 * The deleted share to be restored.
 */
@Fluent
public final class DeletedShare implements JsonSerializable<DeletedShare> {
    /*
     * Required. Identify the name of the deleted share that will be restored.
     */
    private String deletedShareName;

    /*
     * Required. Identify the version of the deleted share that will be restored.
     */
    private String deletedShareVersion;

    /**
     * Creates an instance of DeletedShare class.
     */
    public DeletedShare() {
    }

    /**
     * Get the deletedShareName property: Required. Identify the name of the deleted share that will be restored.
     * 
     * @return the deletedShareName value.
     */
    public String deletedShareName() {
        return this.deletedShareName;
    }

    /**
     * Set the deletedShareName property: Required. Identify the name of the deleted share that will be restored.
     * 
     * @param deletedShareName the deletedShareName value to set.
     * @return the DeletedShare object itself.
     */
    public DeletedShare withDeletedShareName(String deletedShareName) {
        this.deletedShareName = deletedShareName;
        return this;
    }

    /**
     * Get the deletedShareVersion property: Required. Identify the version of the deleted share that will be restored.
     * 
     * @return the deletedShareVersion value.
     */
    public String deletedShareVersion() {
        return this.deletedShareVersion;
    }

    /**
     * Set the deletedShareVersion property: Required. Identify the version of the deleted share that will be restored.
     * 
     * @param deletedShareVersion the deletedShareVersion value to set.
     * @return the DeletedShare object itself.
     */
    public DeletedShare withDeletedShareVersion(String deletedShareVersion) {
        this.deletedShareVersion = deletedShareVersion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deletedShareName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property deletedShareName in model DeletedShare"));
        }
        if (deletedShareVersion() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property deletedShareVersion in model DeletedShare"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeletedShare.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("deletedShareName", this.deletedShareName);
        jsonWriter.writeStringField("deletedShareVersion", this.deletedShareVersion);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of DeletedShare from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of DeletedShare if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the DeletedShare.
     */
    public static DeletedShare fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            DeletedShare deserializedDeletedShare = new DeletedShare();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("deletedShareName".equals(fieldName)) {
                    deserializedDeletedShare.deletedShareName = reader.getString();
                } else if ("deletedShareVersion".equals(fieldName)) {
                    deserializedDeletedShare.deletedShareVersion = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedDeletedShare;
        });
    }
}
