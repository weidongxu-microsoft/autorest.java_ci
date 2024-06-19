// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventhubs.generated.models.ProvisioningState;
import java.io.IOException;

/**
 * Event Hubs Cluster properties supplied in responses in List or Get operations.
 */
@Fluent
public final class ClusterProperties implements JsonSerializable<ClusterProperties> {
    /*
     * The UTC time when the Event Hubs Cluster was created.
     */
    private String createdAt;

    /*
     * Provisioning state of the Cluster.
     */
    private ProvisioningState provisioningState;

    /*
     * The UTC time when the Event Hubs Cluster was last updated.
     */
    private String updatedAt;

    /*
     * The metric ID of the cluster resource. Provided by the service and not modifiable by the user.
     */
    private String metricId;

    /*
     * Status of the Cluster resource
     */
    private String status;

    /*
     * A value that indicates whether Scaling is Supported.
     */
    private Boolean supportsScaling;

    /**
     * Creates an instance of ClusterProperties class.
     */
    public ClusterProperties() {
    }

    /**
     * Get the createdAt property: The UTC time when the Event Hubs Cluster was created.
     * 
     * @return the createdAt value.
     */
    public String createdAt() {
        return this.createdAt;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Cluster.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the updatedAt property: The UTC time when the Event Hubs Cluster was last updated.
     * 
     * @return the updatedAt value.
     */
    public String updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the metricId property: The metric ID of the cluster resource. Provided by the service and not modifiable by
     * the user.
     * 
     * @return the metricId value.
     */
    public String metricId() {
        return this.metricId;
    }

    /**
     * Get the status property: Status of the Cluster resource.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the supportsScaling property: A value that indicates whether Scaling is Supported.
     * 
     * @return the supportsScaling value.
     */
    public Boolean supportsScaling() {
        return this.supportsScaling;
    }

    /**
     * Set the supportsScaling property: A value that indicates whether Scaling is Supported.
     * 
     * @param supportsScaling the supportsScaling value to set.
     * @return the ClusterProperties object itself.
     */
    public ClusterProperties withSupportsScaling(Boolean supportsScaling) {
        this.supportsScaling = supportsScaling;
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
        jsonWriter.writeBooleanField("supportsScaling", this.supportsScaling);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterProperties.
     */
    public static ClusterProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterProperties deserializedClusterProperties = new ClusterProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("createdAt".equals(fieldName)) {
                    deserializedClusterProperties.createdAt = reader.getString();
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedClusterProperties.provisioningState = ProvisioningState.fromString(reader.getString());
                } else if ("updatedAt".equals(fieldName)) {
                    deserializedClusterProperties.updatedAt = reader.getString();
                } else if ("metricId".equals(fieldName)) {
                    deserializedClusterProperties.metricId = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedClusterProperties.status = reader.getString();
                } else if ("supportsScaling".equals(fieldName)) {
                    deserializedClusterProperties.supportsScaling = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterProperties;
        });
    }
}
