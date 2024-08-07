// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes a particular availability for the metric specification.
 */
@Immutable
public final class OperationAvailability implements JsonSerializable<OperationAvailability> {
    /*
     * The time grain for the dimension.
     */
    private String timeGrain;

    /*
     * The blob duration for the dimension.
     */
    private String blobDuration;

    /**
     * Creates an instance of OperationAvailability class.
     */
    public OperationAvailability() {
    }

    /**
     * Get the timeGrain property: The time grain for the dimension.
     * 
     * @return the timeGrain value.
     */
    public String timeGrain() {
        return this.timeGrain;
    }

    /**
     * Get the blobDuration property: The blob duration for the dimension.
     * 
     * @return the blobDuration value.
     */
    public String blobDuration() {
        return this.blobDuration;
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
     * Reads an instance of OperationAvailability from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of OperationAvailability if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the OperationAvailability.
     */
    public static OperationAvailability fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            OperationAvailability deserializedOperationAvailability = new OperationAvailability();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("timeGrain".equals(fieldName)) {
                    deserializedOperationAvailability.timeGrain = reader.getString();
                } else if ("blobDuration".equals(fieldName)) {
                    deserializedOperationAvailability.blobDuration = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedOperationAvailability;
        });
    }
}
