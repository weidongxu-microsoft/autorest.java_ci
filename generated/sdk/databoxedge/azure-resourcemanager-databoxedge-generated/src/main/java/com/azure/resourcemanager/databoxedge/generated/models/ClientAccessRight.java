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
 * The mapping between a particular client IP and the type of access client has on the NFS share.
 */
@Fluent
public final class ClientAccessRight implements JsonSerializable<ClientAccessRight> {
    /*
     * IP of the client.
     */
    private String client;

    /*
     * Type of access to be allowed for the client.
     */
    private ClientPermissionType accessPermission;

    /**
     * Creates an instance of ClientAccessRight class.
     */
    public ClientAccessRight() {
    }

    /**
     * Get the client property: IP of the client.
     * 
     * @return the client value.
     */
    public String client() {
        return this.client;
    }

    /**
     * Set the client property: IP of the client.
     * 
     * @param client the client value to set.
     * @return the ClientAccessRight object itself.
     */
    public ClientAccessRight withClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * Get the accessPermission property: Type of access to be allowed for the client.
     * 
     * @return the accessPermission value.
     */
    public ClientPermissionType accessPermission() {
        return this.accessPermission;
    }

    /**
     * Set the accessPermission property: Type of access to be allowed for the client.
     * 
     * @param accessPermission the accessPermission value to set.
     * @return the ClientAccessRight object itself.
     */
    public ClientAccessRight withAccessPermission(ClientPermissionType accessPermission) {
        this.accessPermission = accessPermission;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (client() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property client in model ClientAccessRight"));
        }
        if (accessPermission() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property accessPermission in model ClientAccessRight"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClientAccessRight.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("client", this.client);
        jsonWriter.writeStringField("accessPermission",
            this.accessPermission == null ? null : this.accessPermission.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClientAccessRight from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClientAccessRight if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClientAccessRight.
     */
    public static ClientAccessRight fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClientAccessRight deserializedClientAccessRight = new ClientAccessRight();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("client".equals(fieldName)) {
                    deserializedClientAccessRight.client = reader.getString();
                } else if ("accessPermission".equals(fieldName)) {
                    deserializedClientAccessRight.accessPermission
                        = ClientPermissionType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClientAccessRight;
        });
    }
}
