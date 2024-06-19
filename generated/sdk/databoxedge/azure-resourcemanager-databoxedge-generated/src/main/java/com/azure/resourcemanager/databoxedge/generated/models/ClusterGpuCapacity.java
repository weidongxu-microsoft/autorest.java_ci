// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Cluster GPU Data.
 */
@Fluent
public final class ClusterGpuCapacity implements JsonSerializable<ClusterGpuCapacity> {
    /*
     * The cluster GPU Type.
     */
    private String gpuType;

    /*
     * The used GPU units count in the cluster.
     */
    private Integer gpuUsedUnitsCount;

    /*
     * The free GPU units count in the cluster.
     */
    private Integer gpuFreeUnitsCount;

    /*
     * The GPU units count reserved for failover in the cluster.
     */
    private Integer gpuReservedForFailoverUnitsCount;

    /*
     * The total GPU units count in the cluster.
     */
    private Integer gpuTotalUnitsCount;

    /**
     * Creates an instance of ClusterGpuCapacity class.
     */
    public ClusterGpuCapacity() {
    }

    /**
     * Get the gpuType property: The cluster GPU Type.
     * 
     * @return the gpuType value.
     */
    public String gpuType() {
        return this.gpuType;
    }

    /**
     * Set the gpuType property: The cluster GPU Type.
     * 
     * @param gpuType the gpuType value to set.
     * @return the ClusterGpuCapacity object itself.
     */
    public ClusterGpuCapacity withGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }

    /**
     * Get the gpuUsedUnitsCount property: The used GPU units count in the cluster.
     * 
     * @return the gpuUsedUnitsCount value.
     */
    public Integer gpuUsedUnitsCount() {
        return this.gpuUsedUnitsCount;
    }

    /**
     * Set the gpuUsedUnitsCount property: The used GPU units count in the cluster.
     * 
     * @param gpuUsedUnitsCount the gpuUsedUnitsCount value to set.
     * @return the ClusterGpuCapacity object itself.
     */
    public ClusterGpuCapacity withGpuUsedUnitsCount(Integer gpuUsedUnitsCount) {
        this.gpuUsedUnitsCount = gpuUsedUnitsCount;
        return this;
    }

    /**
     * Get the gpuFreeUnitsCount property: The free GPU units count in the cluster.
     * 
     * @return the gpuFreeUnitsCount value.
     */
    public Integer gpuFreeUnitsCount() {
        return this.gpuFreeUnitsCount;
    }

    /**
     * Set the gpuFreeUnitsCount property: The free GPU units count in the cluster.
     * 
     * @param gpuFreeUnitsCount the gpuFreeUnitsCount value to set.
     * @return the ClusterGpuCapacity object itself.
     */
    public ClusterGpuCapacity withGpuFreeUnitsCount(Integer gpuFreeUnitsCount) {
        this.gpuFreeUnitsCount = gpuFreeUnitsCount;
        return this;
    }

    /**
     * Get the gpuReservedForFailoverUnitsCount property: The GPU units count reserved for failover in the cluster.
     * 
     * @return the gpuReservedForFailoverUnitsCount value.
     */
    public Integer gpuReservedForFailoverUnitsCount() {
        return this.gpuReservedForFailoverUnitsCount;
    }

    /**
     * Set the gpuReservedForFailoverUnitsCount property: The GPU units count reserved for failover in the cluster.
     * 
     * @param gpuReservedForFailoverUnitsCount the gpuReservedForFailoverUnitsCount value to set.
     * @return the ClusterGpuCapacity object itself.
     */
    public ClusterGpuCapacity withGpuReservedForFailoverUnitsCount(Integer gpuReservedForFailoverUnitsCount) {
        this.gpuReservedForFailoverUnitsCount = gpuReservedForFailoverUnitsCount;
        return this;
    }

    /**
     * Get the gpuTotalUnitsCount property: The total GPU units count in the cluster.
     * 
     * @return the gpuTotalUnitsCount value.
     */
    public Integer gpuTotalUnitsCount() {
        return this.gpuTotalUnitsCount;
    }

    /**
     * Set the gpuTotalUnitsCount property: The total GPU units count in the cluster.
     * 
     * @param gpuTotalUnitsCount the gpuTotalUnitsCount value to set.
     * @return the ClusterGpuCapacity object itself.
     */
    public ClusterGpuCapacity withGpuTotalUnitsCount(Integer gpuTotalUnitsCount) {
        this.gpuTotalUnitsCount = gpuTotalUnitsCount;
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
        jsonWriter.writeStringField("gpuType", this.gpuType);
        jsonWriter.writeNumberField("gpuUsedUnitsCount", this.gpuUsedUnitsCount);
        jsonWriter.writeNumberField("gpuFreeUnitsCount", this.gpuFreeUnitsCount);
        jsonWriter.writeNumberField("gpuReservedForFailoverUnitsCount", this.gpuReservedForFailoverUnitsCount);
        jsonWriter.writeNumberField("gpuTotalUnitsCount", this.gpuTotalUnitsCount);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterGpuCapacity from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterGpuCapacity if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterGpuCapacity.
     */
    public static ClusterGpuCapacity fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterGpuCapacity deserializedClusterGpuCapacity = new ClusterGpuCapacity();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("gpuType".equals(fieldName)) {
                    deserializedClusterGpuCapacity.gpuType = reader.getString();
                } else if ("gpuUsedUnitsCount".equals(fieldName)) {
                    deserializedClusterGpuCapacity.gpuUsedUnitsCount = reader.getNullable(JsonReader::getInt);
                } else if ("gpuFreeUnitsCount".equals(fieldName)) {
                    deserializedClusterGpuCapacity.gpuFreeUnitsCount = reader.getNullable(JsonReader::getInt);
                } else if ("gpuReservedForFailoverUnitsCount".equals(fieldName)) {
                    deserializedClusterGpuCapacity.gpuReservedForFailoverUnitsCount
                        = reader.getNullable(JsonReader::getInt);
                } else if ("gpuTotalUnitsCount".equals(fieldName)) {
                    deserializedClusterGpuCapacity.gpuTotalUnitsCount = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterGpuCapacity;
        });
    }
}
