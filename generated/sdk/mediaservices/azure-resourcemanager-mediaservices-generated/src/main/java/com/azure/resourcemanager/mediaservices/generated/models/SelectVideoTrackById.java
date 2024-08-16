// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Select video tracks from the input by specifying a track identifier.
 */
@Fluent
public final class SelectVideoTrackById extends VideoTrackDescriptor {
    /*
     * Track identifier to select
     */
    private long trackId;

    /**
     * Creates an instance of SelectVideoTrackById class.
     */
    public SelectVideoTrackById() {
        this.odataType = "#Microsoft.Media.SelectVideoTrackById";
    }

    /**
     * Get the trackId property: Track identifier to select.
     * 
     * @return the trackId value.
     */
    public long trackId() {
        return this.trackId;
    }

    /**
     * Set the trackId property: Track identifier to select.
     * 
     * @param trackId the trackId value to set.
     * @return the SelectVideoTrackById object itself.
     */
    public SelectVideoTrackById withTrackId(long trackId) {
        this.trackId = trackId;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        toJsonShared(jsonWriter);
        jsonWriter.writeLongField("trackId", this.trackId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SelectVideoTrackById from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SelectVideoTrackById if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SelectVideoTrackById.
     */
    public static SelectVideoTrackById fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SelectVideoTrackById deserializedSelectVideoTrackById = new SelectVideoTrackById();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("trackId".equals(fieldName)) {
                    deserializedSelectVideoTrackById.trackId = reader.getLong();
                } else if ("@odata.type".equals(fieldName)) {
                    deserializedSelectVideoTrackById.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSelectVideoTrackById;
        });
    }
}
