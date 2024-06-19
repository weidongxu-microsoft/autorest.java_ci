// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Describes the network profile for the role instance.
 */
@Immutable
public final class RoleInstanceNetworkProfile implements JsonSerializable<RoleInstanceNetworkProfile> {
    /*
     * Specifies the list of resource Ids for the network interfaces associated with the role instance.
     */
    private List<SubResource> networkInterfaces;

    /**
     * Creates an instance of RoleInstanceNetworkProfile class.
     */
    public RoleInstanceNetworkProfile() {
    }

    /**
     * Get the networkInterfaces property: Specifies the list of resource Ids for the network interfaces associated with
     * the role instance.
     * 
     * @return the networkInterfaces value.
     */
    public List<SubResource> networkInterfaces() {
        return this.networkInterfaces;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RoleInstanceNetworkProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RoleInstanceNetworkProfile if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the RoleInstanceNetworkProfile.
     */
    public static RoleInstanceNetworkProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RoleInstanceNetworkProfile deserializedRoleInstanceNetworkProfile = new RoleInstanceNetworkProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("networkInterfaces".equals(fieldName)) {
                    List<SubResource> networkInterfaces = reader.readArray(reader1 -> SubResource.fromJson(reader1));
                    deserializedRoleInstanceNetworkProfile.networkInterfaces = networkInterfaces;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRoleInstanceNetworkProfile;
        });
    }
}
