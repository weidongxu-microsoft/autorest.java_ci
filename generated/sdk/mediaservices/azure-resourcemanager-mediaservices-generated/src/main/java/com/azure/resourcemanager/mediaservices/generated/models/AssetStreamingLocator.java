// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Properties of the Streaming Locator.
 */
@Immutable
public final class AssetStreamingLocator implements JsonSerializable<AssetStreamingLocator> {
    /*
     * Streaming Locator name.
     */
    private String name;

    /*
     * Asset Name.
     */
    private String assetName;

    /*
     * The creation time of the Streaming Locator.
     */
    private OffsetDateTime created;

    /*
     * The start time of the Streaming Locator.
     */
    private OffsetDateTime startTime;

    /*
     * The end time of the Streaming Locator.
     */
    private OffsetDateTime endTime;

    /*
     * StreamingLocatorId of the Streaming Locator.
     */
    private UUID streamingLocatorId;

    /*
     * Name of the Streaming Policy used by this Streaming Locator.
     */
    private String streamingPolicyName;

    /*
     * Name of the default ContentKeyPolicy used by this Streaming Locator.
     */
    private String defaultContentKeyPolicyName;

    /**
     * Creates an instance of AssetStreamingLocator class.
     */
    public AssetStreamingLocator() {
    }

    /**
     * Get the name property: Streaming Locator name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the assetName property: Asset Name.
     * 
     * @return the assetName value.
     */
    public String assetName() {
        return this.assetName;
    }

    /**
     * Get the created property: The creation time of the Streaming Locator.
     * 
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the startTime property: The start time of the Streaming Locator.
     * 
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the endTime property: The end time of the Streaming Locator.
     * 
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the streamingLocatorId property: StreamingLocatorId of the Streaming Locator.
     * 
     * @return the streamingLocatorId value.
     */
    public UUID streamingLocatorId() {
        return this.streamingLocatorId;
    }

    /**
     * Get the streamingPolicyName property: Name of the Streaming Policy used by this Streaming Locator.
     * 
     * @return the streamingPolicyName value.
     */
    public String streamingPolicyName() {
        return this.streamingPolicyName;
    }

    /**
     * Get the defaultContentKeyPolicyName property: Name of the default ContentKeyPolicy used by this Streaming
     * Locator.
     * 
     * @return the defaultContentKeyPolicyName value.
     */
    public String defaultContentKeyPolicyName() {
        return this.defaultContentKeyPolicyName;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AssetStreamingLocator from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AssetStreamingLocator if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AssetStreamingLocator.
     */
    public static AssetStreamingLocator fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AssetStreamingLocator deserializedAssetStreamingLocator = new AssetStreamingLocator();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedAssetStreamingLocator.name = reader.getString();
                } else if ("assetName".equals(fieldName)) {
                    deserializedAssetStreamingLocator.assetName = reader.getString();
                } else if ("created".equals(fieldName)) {
                    deserializedAssetStreamingLocator.created = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("startTime".equals(fieldName)) {
                    deserializedAssetStreamingLocator.startTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("endTime".equals(fieldName)) {
                    deserializedAssetStreamingLocator.endTime = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("streamingLocatorId".equals(fieldName)) {
                    deserializedAssetStreamingLocator.streamingLocatorId
                        = reader.getNullable(nonNullReader -> UUID.fromString(nonNullReader.getString()));
                } else if ("streamingPolicyName".equals(fieldName)) {
                    deserializedAssetStreamingLocator.streamingPolicyName = reader.getString();
                } else if ("defaultContentKeyPolicyName".equals(fieldName)) {
                    deserializedAssetStreamingLocator.defaultContentKeyPolicyName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAssetStreamingLocator;
        });
    }
}
