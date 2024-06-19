// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.fluent.models.PacketCaptureResultInner;
import java.io.IOException;
import java.util.List;

/**
 * List of packet capture sessions.
 */
@Fluent
public final class PacketCaptureListResult implements JsonSerializable<PacketCaptureListResult> {
    /*
     * Information about packet capture sessions.
     */
    private List<PacketCaptureResultInner> value;

    /**
     * Creates an instance of PacketCaptureListResult class.
     */
    public PacketCaptureListResult() {
    }

    /**
     * Get the value property: Information about packet capture sessions.
     * 
     * @return the value value.
     */
    public List<PacketCaptureResultInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Information about packet capture sessions.
     * 
     * @param value the value value to set.
     * @return the PacketCaptureListResult object itself.
     */
    public PacketCaptureListResult withValue(List<PacketCaptureResultInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PacketCaptureListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PacketCaptureListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PacketCaptureListResult.
     */
    public static PacketCaptureListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PacketCaptureListResult deserializedPacketCaptureListResult = new PacketCaptureListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<PacketCaptureResultInner> value
                        = reader.readArray(reader1 -> PacketCaptureResultInner.fromJson(reader1));
                    deserializedPacketCaptureListResult.value = value;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPacketCaptureListResult;
        });
    }
}
