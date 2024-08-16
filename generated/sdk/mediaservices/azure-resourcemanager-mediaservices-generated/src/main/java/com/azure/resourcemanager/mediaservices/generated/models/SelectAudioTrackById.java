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
 * Select audio tracks from the input by specifying a track identifier.
 */
@Fluent
public final class SelectAudioTrackById extends AudioTrackDescriptor {
    /*
     * Track identifier to select
     */
    private long trackId;

    /**
     * Creates an instance of SelectAudioTrackById class.
     */
    public SelectAudioTrackById() {
        this.odataType = "#Microsoft.Media.SelectAudioTrackById";
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
     * @return the SelectAudioTrackById object itself.
     */
    public SelectAudioTrackById withTrackId(long trackId) {
        this.trackId = trackId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SelectAudioTrackById withChannelMapping(ChannelMapping channelMapping) {
        super.withChannelMapping(channelMapping);
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
     * Reads an instance of SelectAudioTrackById from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SelectAudioTrackById if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SelectAudioTrackById.
     */
    public static SelectAudioTrackById fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SelectAudioTrackById deserializedSelectAudioTrackById = new SelectAudioTrackById();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("channelMapping".equals(fieldName)) {
                    deserializedSelectAudioTrackById.withChannelMapping(ChannelMapping.fromString(reader.getString()));
                } else if ("trackId".equals(fieldName)) {
                    deserializedSelectAudioTrackById.trackId = reader.getLong();
                } else if ("@odata.type".equals(fieldName)) {
                    deserializedSelectAudioTrackById.odataType = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSelectAudioTrackById;
        });
    }
}
