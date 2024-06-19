// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.relay.generated.models.PublicNetworkAccess;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * Properties of the namespace.
 */
@Fluent
public final class RelayNamespaceProperties implements JsonSerializable<RelayNamespaceProperties> {
    /*
     * Provisioning state of the Namespace.
     */
    private String provisioningState;

    /*
     * Status of the Namespace.
     */
    private String status;

    /*
     * The time the namespace was created.
     */
    private OffsetDateTime createdAt;

    /*
     * The time the namespace was updated.
     */
    private OffsetDateTime updatedAt;

    /*
     * Endpoint you can use to perform Service Bus operations.
     */
    private String serviceBusEndpoint;

    /*
     * Identifier for Azure Insights metrics.
     */
    private String metricId;

    /*
     * List of private endpoint connections.
     */
    private List<PrivateEndpointConnectionInner> privateEndpointConnections;

    /*
     * This determines if traffic is allowed over public network. By default it is enabled.
     */
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * Creates an instance of RelayNamespaceProperties class.
     */
    public RelayNamespaceProperties() {
    }

    /**
     * Get the provisioningState property: Provisioning state of the Namespace.
     * 
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the status property: Status of the Namespace.
     * 
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the createdAt property: The time the namespace was created.
     * 
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Get the updatedAt property: The time the namespace was updated.
     * 
     * @return the updatedAt value.
     */
    public OffsetDateTime updatedAt() {
        return this.updatedAt;
    }

    /**
     * Get the serviceBusEndpoint property: Endpoint you can use to perform Service Bus operations.
     * 
     * @return the serviceBusEndpoint value.
     */
    public String serviceBusEndpoint() {
        return this.serviceBusEndpoint;
    }

    /**
     * Get the metricId property: Identifier for Azure Insights metrics.
     * 
     * @return the metricId value.
     */
    public String metricId() {
        return this.metricId;
    }

    /**
     * Get the privateEndpointConnections property: List of private endpoint connections.
     * 
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnectionInner> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the privateEndpointConnections property: List of private endpoint connections.
     * 
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the RelayNamespaceProperties object itself.
     */
    public RelayNamespaceProperties
        withPrivateEndpointConnections(List<PrivateEndpointConnectionInner> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     * 
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it is
     * enabled.
     * 
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the RelayNamespaceProperties object itself.
     */
    public RelayNamespaceProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("privateEndpointConnections", this.privateEndpointConnections,
            (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("publicNetworkAccess",
            this.publicNetworkAccess == null ? null : this.publicNetworkAccess.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RelayNamespaceProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RelayNamespaceProperties if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RelayNamespaceProperties.
     */
    public static RelayNamespaceProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RelayNamespaceProperties deserializedRelayNamespaceProperties = new RelayNamespaceProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedRelayNamespaceProperties.provisioningState = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedRelayNamespaceProperties.status = reader.getString();
                } else if ("createdAt".equals(fieldName)) {
                    deserializedRelayNamespaceProperties.createdAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("updatedAt".equals(fieldName)) {
                    deserializedRelayNamespaceProperties.updatedAt = reader
                        .getNullable(nonNullReader -> CoreUtils.parseBestOffsetDateTime(nonNullReader.getString()));
                } else if ("serviceBusEndpoint".equals(fieldName)) {
                    deserializedRelayNamespaceProperties.serviceBusEndpoint = reader.getString();
                } else if ("metricId".equals(fieldName)) {
                    deserializedRelayNamespaceProperties.metricId = reader.getString();
                } else if ("privateEndpointConnections".equals(fieldName)) {
                    List<PrivateEndpointConnectionInner> privateEndpointConnections
                        = reader.readArray(reader1 -> PrivateEndpointConnectionInner.fromJson(reader1));
                    deserializedRelayNamespaceProperties.privateEndpointConnections = privateEndpointConnections;
                } else if ("publicNetworkAccess".equals(fieldName)) {
                    deserializedRelayNamespaceProperties.publicNetworkAccess
                        = PublicNetworkAccess.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRelayNamespaceProperties;
        });
    }
}
