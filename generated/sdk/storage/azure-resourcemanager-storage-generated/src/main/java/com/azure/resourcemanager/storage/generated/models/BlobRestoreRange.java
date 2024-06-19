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
 * Blob range.
 */
@Fluent
public final class BlobRestoreRange implements JsonSerializable<BlobRestoreRange> {
    /*
     * Blob start range. This is inclusive. Empty means account start.
     */
    private String startRange;

    /*
     * Blob end range. This is exclusive. Empty means account end.
     */
    private String endRange;

    /**
     * Creates an instance of BlobRestoreRange class.
     */
    public BlobRestoreRange() {
    }

    /**
     * Get the startRange property: Blob start range. This is inclusive. Empty means account start.
     * 
     * @return the startRange value.
     */
    public String startRange() {
        return this.startRange;
    }

    /**
     * Set the startRange property: Blob start range. This is inclusive. Empty means account start.
     * 
     * @param startRange the startRange value to set.
     * @return the BlobRestoreRange object itself.
     */
    public BlobRestoreRange withStartRange(String startRange) {
        this.startRange = startRange;
        return this;
    }

    /**
     * Get the endRange property: Blob end range. This is exclusive. Empty means account end.
     * 
     * @return the endRange value.
     */
    public String endRange() {
        return this.endRange;
    }

    /**
     * Set the endRange property: Blob end range. This is exclusive. Empty means account end.
     * 
     * @param endRange the endRange value to set.
     * @return the BlobRestoreRange object itself.
     */
    public BlobRestoreRange withEndRange(String endRange) {
        this.endRange = endRange;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (startRange() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property startRange in model BlobRestoreRange"));
        }
        if (endRange() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property endRange in model BlobRestoreRange"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(BlobRestoreRange.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("startRange", this.startRange);
        jsonWriter.writeStringField("endRange", this.endRange);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of BlobRestoreRange from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of BlobRestoreRange if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the BlobRestoreRange.
     */
    public static BlobRestoreRange fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            BlobRestoreRange deserializedBlobRestoreRange = new BlobRestoreRange();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("startRange".equals(fieldName)) {
                    deserializedBlobRestoreRange.startRange = reader.getString();
                } else if ("endRange".equals(fieldName)) {
                    deserializedBlobRestoreRange.endRange = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedBlobRestoreRange;
        });
    }
}
