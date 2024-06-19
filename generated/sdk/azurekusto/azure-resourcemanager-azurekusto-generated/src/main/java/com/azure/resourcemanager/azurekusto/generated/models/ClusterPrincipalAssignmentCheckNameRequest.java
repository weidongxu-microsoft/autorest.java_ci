// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * A principal assignment check name availability request.
 */
@Fluent
public final class ClusterPrincipalAssignmentCheckNameRequest
    implements JsonSerializable<ClusterPrincipalAssignmentCheckNameRequest> {
    /*
     * Principal Assignment resource name.
     */
    private String name;

    /*
     * The type of resource, Microsoft.Kusto/clusters/principalAssignments.
     */
    private String type = "Microsoft.Kusto/clusters/principalAssignments";

    /**
     * Creates an instance of ClusterPrincipalAssignmentCheckNameRequest class.
     */
    public ClusterPrincipalAssignmentCheckNameRequest() {
    }

    /**
     * Get the name property: Principal Assignment resource name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Principal Assignment resource name.
     * 
     * @param name the name value to set.
     * @return the ClusterPrincipalAssignmentCheckNameRequest object itself.
     */
    public ClusterPrincipalAssignmentCheckNameRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of resource, Microsoft.Kusto/clusters/principalAssignments.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of resource, Microsoft.Kusto/clusters/principalAssignments.
     * 
     * @param type the type value to set.
     * @return the ClusterPrincipalAssignmentCheckNameRequest object itself.
     */
    public ClusterPrincipalAssignmentCheckNameRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model ClusterPrincipalAssignmentCheckNameRequest"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterPrincipalAssignmentCheckNameRequest.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterPrincipalAssignmentCheckNameRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPrincipalAssignmentCheckNameRequest if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterPrincipalAssignmentCheckNameRequest.
     */
    public static ClusterPrincipalAssignmentCheckNameRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPrincipalAssignmentCheckNameRequest deserializedClusterPrincipalAssignmentCheckNameRequest
                = new ClusterPrincipalAssignmentCheckNameRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedClusterPrincipalAssignmentCheckNameRequest.name = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPrincipalAssignmentCheckNameRequest;
        });
    }
}
