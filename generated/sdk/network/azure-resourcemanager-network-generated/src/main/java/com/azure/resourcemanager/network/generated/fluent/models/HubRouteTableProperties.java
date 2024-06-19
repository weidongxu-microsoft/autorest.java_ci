// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.HubRoute;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;
import java.util.List;

/**
 * Parameters for RouteTable.
 */
@Fluent
public final class HubRouteTableProperties implements JsonSerializable<HubRouteTableProperties> {
    /*
     * List of all routes.
     */
    private List<HubRoute> routes;

    /*
     * List of labels associated with this route table.
     */
    private List<String> labels;

    /*
     * List of all connections associated with this route table.
     */
    private List<String> associatedConnections;

    /*
     * List of all connections that advertise to this route table.
     */
    private List<String> propagatingConnections;

    /*
     * The provisioning state of the RouteTable resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of HubRouteTableProperties class.
     */
    public HubRouteTableProperties() {
    }

    /**
     * Get the routes property: List of all routes.
     * 
     * @return the routes value.
     */
    public List<HubRoute> routes() {
        return this.routes;
    }

    /**
     * Set the routes property: List of all routes.
     * 
     * @param routes the routes value to set.
     * @return the HubRouteTableProperties object itself.
     */
    public HubRouteTableProperties withRoutes(List<HubRoute> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the labels property: List of labels associated with this route table.
     * 
     * @return the labels value.
     */
    public List<String> labels() {
        return this.labels;
    }

    /**
     * Set the labels property: List of labels associated with this route table.
     * 
     * @param labels the labels value to set.
     * @return the HubRouteTableProperties object itself.
     */
    public HubRouteTableProperties withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    /**
     * Get the associatedConnections property: List of all connections associated with this route table.
     * 
     * @return the associatedConnections value.
     */
    public List<String> associatedConnections() {
        return this.associatedConnections;
    }

    /**
     * Get the propagatingConnections property: List of all connections that advertise to this route table.
     * 
     * @return the propagatingConnections value.
     */
    public List<String> propagatingConnections() {
        return this.propagatingConnections;
    }

    /**
     * Get the provisioningState property: The provisioning state of the RouteTable resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (routes() != null) {
            routes().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("routes", this.routes, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("labels", this.labels, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of HubRouteTableProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of HubRouteTableProperties if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the HubRouteTableProperties.
     */
    public static HubRouteTableProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            HubRouteTableProperties deserializedHubRouteTableProperties = new HubRouteTableProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("routes".equals(fieldName)) {
                    List<HubRoute> routes = reader.readArray(reader1 -> HubRoute.fromJson(reader1));
                    deserializedHubRouteTableProperties.routes = routes;
                } else if ("labels".equals(fieldName)) {
                    List<String> labels = reader.readArray(reader1 -> reader1.getString());
                    deserializedHubRouteTableProperties.labels = labels;
                } else if ("associatedConnections".equals(fieldName)) {
                    List<String> associatedConnections = reader.readArray(reader1 -> reader1.getString());
                    deserializedHubRouteTableProperties.associatedConnections = associatedConnections;
                } else if ("propagatingConnections".equals(fieldName)) {
                    List<String> propagatingConnections = reader.readArray(reader1 -> reader1.getString());
                    deserializedHubRouteTableProperties.propagatingConnections = propagatingConnections;
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedHubRouteTableProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedHubRouteTableProperties;
        });
    }
}
