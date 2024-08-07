// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Instance view statuses.
 */
@Immutable
public final class InstanceViewStatusesSummary implements JsonSerializable<InstanceViewStatusesSummary> {
    /*
     * The summary.
     */
    private List<StatusCodeCount> statusesSummary;

    /**
     * Creates an instance of InstanceViewStatusesSummary class.
     */
    public InstanceViewStatusesSummary() {
    }

    /**
     * Get the statusesSummary property: The summary.
     * 
     * @return the statusesSummary value.
     */
    public List<StatusCodeCount> statusesSummary() {
        return this.statusesSummary;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (statusesSummary() != null) {
            statusesSummary().forEach(e -> e.validate());
        }
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
     * Reads an instance of InstanceViewStatusesSummary from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InstanceViewStatusesSummary if the JsonReader was pointing to an instance of it, or null
     * if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the InstanceViewStatusesSummary.
     */
    public static InstanceViewStatusesSummary fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InstanceViewStatusesSummary deserializedInstanceViewStatusesSummary = new InstanceViewStatusesSummary();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("statusesSummary".equals(fieldName)) {
                    List<StatusCodeCount> statusesSummary
                        = reader.readArray(reader1 -> StatusCodeCount.fromJson(reader1));
                    deserializedInstanceViewStatusesSummary.statusesSummary = statusesSummary;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInstanceViewStatusesSummary;
        });
    }
}
