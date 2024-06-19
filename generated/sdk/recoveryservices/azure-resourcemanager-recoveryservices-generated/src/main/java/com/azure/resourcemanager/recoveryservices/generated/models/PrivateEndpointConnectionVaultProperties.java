// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Information to be stored in Vault properties as an element of privateEndpointConnections List.
 */
@Immutable
public final class PrivateEndpointConnectionVaultProperties
    implements JsonSerializable<PrivateEndpointConnectionVaultProperties> {
    /*
     * Format of id
     * subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.[Service]/{resource}/{
     * resourceName}/privateEndpointConnections/{connectionName}.
     */
    private String id;

    /*
     * Private Endpoint Connection Response Properties.
     */
    private PrivateEndpointConnection properties;

    /*
     * The name of the private Endpoint Connection
     */
    private String name;

    /*
     * The type, which will be of the format, Microsoft.RecoveryServices/vaults/privateEndpointConnections
     */
    private String type;

    /*
     * The location of the private Endpoint connection
     */
    private String location;

    /**
     * Creates an instance of PrivateEndpointConnectionVaultProperties class.
     */
    public PrivateEndpointConnectionVaultProperties() {
    }

    /**
     * Get the id property: Format of id
     * subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.[Service]/{resource}/{resourceName}/privateEndpointConnections/{connectionName}.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the properties property: Private Endpoint Connection Response Properties.
     * 
     * @return the properties value.
     */
    public PrivateEndpointConnection properties() {
        return this.properties;
    }

    /**
     * Get the name property: The name of the private Endpoint Connection.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type, which will be of the format,
     * Microsoft.RecoveryServices/vaults/privateEndpointConnections.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the location property: The location of the private Endpoint connection.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
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
     * Reads an instance of PrivateEndpointConnectionVaultProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionVaultProperties if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointConnectionVaultProperties.
     */
    public static PrivateEndpointConnectionVaultProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointConnectionVaultProperties deserializedPrivateEndpointConnectionVaultProperties
                = new PrivateEndpointConnectionVaultProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionVaultProperties.id = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionVaultProperties.properties
                        = PrivateEndpointConnection.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionVaultProperties.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionVaultProperties.type = reader.getString();
                } else if ("location".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionVaultProperties.location = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionVaultProperties;
        });
    }
}
