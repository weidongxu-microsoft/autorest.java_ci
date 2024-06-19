// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Kubernetes role compute resource.
 */
@Fluent
public final class KubernetesRoleCompute implements JsonSerializable<KubernetesRoleCompute> {
    /*
     * VM profile
     */
    private String vmProfile;

    /*
     * Memory in bytes
     */
    private Long memoryInBytes;

    /*
     * Processor count
     */
    private Integer processorCount;

    /**
     * Creates an instance of KubernetesRoleCompute class.
     */
    public KubernetesRoleCompute() {
    }

    /**
     * Get the vmProfile property: VM profile.
     * 
     * @return the vmProfile value.
     */
    public String vmProfile() {
        return this.vmProfile;
    }

    /**
     * Set the vmProfile property: VM profile.
     * 
     * @param vmProfile the vmProfile value to set.
     * @return the KubernetesRoleCompute object itself.
     */
    public KubernetesRoleCompute withVmProfile(String vmProfile) {
        this.vmProfile = vmProfile;
        return this;
    }

    /**
     * Get the memoryInBytes property: Memory in bytes.
     * 
     * @return the memoryInBytes value.
     */
    public Long memoryInBytes() {
        return this.memoryInBytes;
    }

    /**
     * Get the processorCount property: Processor count.
     * 
     * @return the processorCount value.
     */
    public Integer processorCount() {
        return this.processorCount;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vmProfile() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property vmProfile in model KubernetesRoleCompute"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KubernetesRoleCompute.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("vmProfile", this.vmProfile);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KubernetesRoleCompute from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KubernetesRoleCompute if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the KubernetesRoleCompute.
     */
    public static KubernetesRoleCompute fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KubernetesRoleCompute deserializedKubernetesRoleCompute = new KubernetesRoleCompute();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vmProfile".equals(fieldName)) {
                    deserializedKubernetesRoleCompute.vmProfile = reader.getString();
                } else if ("memoryInBytes".equals(fieldName)) {
                    deserializedKubernetesRoleCompute.memoryInBytes = reader.getNullable(JsonReader::getLong);
                } else if ("processorCount".equals(fieldName)) {
                    deserializedKubernetesRoleCompute.processorCount = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKubernetesRoleCompute;
        });
    }
}
