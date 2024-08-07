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
 * Kubernetes role resources.
 */
@Fluent
public final class KubernetesRoleResources implements JsonSerializable<KubernetesRoleResources> {
    /*
     * Kubernetes role storage resource
     */
    private KubernetesRoleStorage storage;

    /*
     * Kubernetes role compute resource
     */
    private KubernetesRoleCompute compute;

    /*
     * Kubernetes role network resource
     */
    private KubernetesRoleNetwork network;

    /**
     * Creates an instance of KubernetesRoleResources class.
     */
    public KubernetesRoleResources() {
    }

    /**
     * Get the storage property: Kubernetes role storage resource.
     * 
     * @return the storage value.
     */
    public KubernetesRoleStorage storage() {
        return this.storage;
    }

    /**
     * Set the storage property: Kubernetes role storage resource.
     * 
     * @param storage the storage value to set.
     * @return the KubernetesRoleResources object itself.
     */
    public KubernetesRoleResources withStorage(KubernetesRoleStorage storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Get the compute property: Kubernetes role compute resource.
     * 
     * @return the compute value.
     */
    public KubernetesRoleCompute compute() {
        return this.compute;
    }

    /**
     * Set the compute property: Kubernetes role compute resource.
     * 
     * @param compute the compute value to set.
     * @return the KubernetesRoleResources object itself.
     */
    public KubernetesRoleResources withCompute(KubernetesRoleCompute compute) {
        this.compute = compute;
        return this;
    }

    /**
     * Get the network property: Kubernetes role network resource.
     * 
     * @return the network value.
     */
    public KubernetesRoleNetwork network() {
        return this.network;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storage() != null) {
            storage().validate();
        }
        if (compute() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property compute in model KubernetesRoleResources"));
        } else {
            compute().validate();
        }
        if (network() != null) {
            network().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(KubernetesRoleResources.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("compute", this.compute);
        jsonWriter.writeJsonField("storage", this.storage);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KubernetesRoleResources from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KubernetesRoleResources if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the KubernetesRoleResources.
     */
    public static KubernetesRoleResources fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KubernetesRoleResources deserializedKubernetesRoleResources = new KubernetesRoleResources();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("compute".equals(fieldName)) {
                    deserializedKubernetesRoleResources.compute = KubernetesRoleCompute.fromJson(reader);
                } else if ("storage".equals(fieldName)) {
                    deserializedKubernetesRoleResources.storage = KubernetesRoleStorage.fromJson(reader);
                } else if ("network".equals(fieldName)) {
                    deserializedKubernetesRoleResources.network = KubernetesRoleNetwork.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKubernetesRoleResources;
        });
    }
}
