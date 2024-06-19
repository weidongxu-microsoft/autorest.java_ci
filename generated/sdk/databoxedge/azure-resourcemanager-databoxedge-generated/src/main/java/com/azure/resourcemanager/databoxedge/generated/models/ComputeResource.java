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
 * Compute infrastructure Resource.
 */
@Fluent
public final class ComputeResource implements JsonSerializable<ComputeResource> {
    /*
     * Processor count
     */
    private int processorCount;

    /*
     * Memory in GB
     */
    private long memoryInGB;

    /**
     * Creates an instance of ComputeResource class.
     */
    public ComputeResource() {
    }

    /**
     * Get the processorCount property: Processor count.
     * 
     * @return the processorCount value.
     */
    public int processorCount() {
        return this.processorCount;
    }

    /**
     * Set the processorCount property: Processor count.
     * 
     * @param processorCount the processorCount value to set.
     * @return the ComputeResource object itself.
     */
    public ComputeResource withProcessorCount(int processorCount) {
        this.processorCount = processorCount;
        return this;
    }

    /**
     * Get the memoryInGB property: Memory in GB.
     * 
     * @return the memoryInGB value.
     */
    public long memoryInGB() {
        return this.memoryInGB;
    }

    /**
     * Set the memoryInGB property: Memory in GB.
     * 
     * @param memoryInGB the memoryInGB value to set.
     * @return the ComputeResource object itself.
     */
    public ComputeResource withMemoryInGB(long memoryInGB) {
        this.memoryInGB = memoryInGB;
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
        jsonWriter.writeIntField("processorCount", this.processorCount);
        jsonWriter.writeLongField("memoryInGB", this.memoryInGB);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ComputeResource from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ComputeResource if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ComputeResource.
     */
    public static ComputeResource fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ComputeResource deserializedComputeResource = new ComputeResource();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("processorCount".equals(fieldName)) {
                    deserializedComputeResource.processorCount = reader.getInt();
                } else if ("memoryInGB".equals(fieldName)) {
                    deserializedComputeResource.memoryInGB = reader.getLong();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedComputeResource;
        });
    }
}
