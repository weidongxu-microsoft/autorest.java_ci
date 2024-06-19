// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * SQL VM Troubleshoot UnhealthyReplica scenario information.
 */
@Fluent
public final class UnhealthyReplicaInfo implements JsonSerializable<UnhealthyReplicaInfo> {
    /*
     * The name of the availability group
     */
    private String availabilityGroupName;

    /**
     * Creates an instance of UnhealthyReplicaInfo class.
     */
    public UnhealthyReplicaInfo() {
    }

    /**
     * Get the availabilityGroupName property: The name of the availability group.
     * 
     * @return the availabilityGroupName value.
     */
    public String availabilityGroupName() {
        return this.availabilityGroupName;
    }

    /**
     * Set the availabilityGroupName property: The name of the availability group.
     * 
     * @param availabilityGroupName the availabilityGroupName value to set.
     * @return the UnhealthyReplicaInfo object itself.
     */
    public UnhealthyReplicaInfo withAvailabilityGroupName(String availabilityGroupName) {
        this.availabilityGroupName = availabilityGroupName;
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
        jsonWriter.writeStringField("availabilityGroupName", this.availabilityGroupName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UnhealthyReplicaInfo from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UnhealthyReplicaInfo if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UnhealthyReplicaInfo.
     */
    public static UnhealthyReplicaInfo fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UnhealthyReplicaInfo deserializedUnhealthyReplicaInfo = new UnhealthyReplicaInfo();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("availabilityGroupName".equals(fieldName)) {
                    deserializedUnhealthyReplicaInfo.availabilityGroupName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUnhealthyReplicaInfo;
        });
    }
}
