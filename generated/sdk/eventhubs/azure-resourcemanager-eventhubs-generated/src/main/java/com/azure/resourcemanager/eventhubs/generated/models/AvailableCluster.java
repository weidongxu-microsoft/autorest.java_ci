// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Pre-provisioned and readily available Event Hubs Cluster count per region.
 */
@Fluent
public final class AvailableCluster implements JsonSerializable<AvailableCluster> {
    /*
     * Location fo the Available Cluster
     */
    private String location;

    /**
     * Creates an instance of AvailableCluster class.
     */
    public AvailableCluster() {
    }

    /**
     * Get the location property: Location fo the Available Cluster.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Location fo the Available Cluster.
     * 
     * @param location the location value to set.
     * @return the AvailableCluster object itself.
     */
    public AvailableCluster withLocation(String location) {
        this.location = location;
        return this;
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
        jsonWriter.writeStringField("location", this.location);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AvailableCluster from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AvailableCluster if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the AvailableCluster.
     */
    public static AvailableCluster fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AvailableCluster deserializedAvailableCluster = new AvailableCluster();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedAvailableCluster.location = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAvailableCluster;
        });
    }
}
