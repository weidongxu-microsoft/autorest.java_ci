// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/**
 * The Asset File Storage encryption metadata.
 */
@Fluent
public final class AssetFileEncryptionMetadata implements JsonSerializable<AssetFileEncryptionMetadata> {
    /*
     * The Asset File initialization vector.
     */
    private String initializationVector;

    /*
     * The Asset File name.
     */
    private String assetFileName;

    /*
     * The Asset File Id.
     */
    private UUID assetFileId;

    /**
     * Creates an instance of AssetFileEncryptionMetadata class.
     */
    public AssetFileEncryptionMetadata() {
    }

    /**
     * Get the initializationVector property: The Asset File initialization vector.
     * 
     * @return the initializationVector value.
     */
    public String initializationVector() {
        return this.initializationVector;
    }

    /**
     * Set the initializationVector property: The Asset File initialization vector.
     * 
     * @param initializationVector the initializationVector value to set.
     * @return the AssetFileEncryptionMetadata object itself.
     */
    public AssetFileEncryptionMetadata withInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
        return this;
    }

    /**
     * Get the assetFileName property: The Asset File name.
     * 
     * @return the assetFileName value.
     */
    public String assetFileName() {
        return this.assetFileName;
    }

    /**
     * Set the assetFileName property: The Asset File name.
     * 
     * @param assetFileName the assetFileName value to set.
     * @return the AssetFileEncryptionMetadata object itself.
     */
    public AssetFileEncryptionMetadata withAssetFileName(String assetFileName) {
        this.assetFileName = assetFileName;
        return this;
    }

    /**
     * Get the assetFileId property: The Asset File Id.
     * 
     * @return the assetFileId value.
     */
    public UUID assetFileId() {
        return this.assetFileId;
    }

    /**
     * Set the assetFileId property: The Asset File Id.
     * 
     * @param assetFileId the assetFileId value to set.
     * @return the AssetFileEncryptionMetadata object itself.
     */
    public AssetFileEncryptionMetadata withAssetFileId(UUID assetFileId) {
        this.assetFileId = assetFileId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (assetFileId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property assetFileId in model AssetFileEncryptionMetadata"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AssetFileEncryptionMetadata.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("assetFileId", Objects.toString(this.assetFileId, null));
        jsonWriter.writeStringField("initializationVector", this.initializationVector);
        jsonWriter.writeStringField("assetFileName", this.assetFileName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AssetFileEncryptionMetadata from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssetFileEncryptionMetadata if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AssetFileEncryptionMetadata.
     */
    public static AssetFileEncryptionMetadata fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AssetFileEncryptionMetadata deserializedAssetFileEncryptionMetadata = new AssetFileEncryptionMetadata();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("assetFileId".equals(fieldName)) {
                    deserializedAssetFileEncryptionMetadata.assetFileId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("initializationVector".equals(fieldName)) {
                    deserializedAssetFileEncryptionMetadata.initializationVector = reader.getString();
                } else if ("assetFileName".equals(fieldName)) {
                    deserializedAssetFileEncryptionMetadata.assetFileName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAssetFileEncryptionMetadata;
        });
    }
}
