// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.eventhubs.generated.models.ConnectionState;
import com.azure.resourcemanager.eventhubs.generated.models.EndPointProvisioningState;
import com.azure.resourcemanager.eventhubs.generated.models.PrivateEndpoint;
import java.io.IOException;

/**
 * Properties of the private endpoint connection resource.
 */
@Fluent
public final class PrivateEndpointConnectionProperties
    implements JsonSerializable<PrivateEndpointConnectionProperties> {
    /*
     * The Private Endpoint resource for this Connection.
     */
    private PrivateEndpoint privateEndpoint;

    /*
     * Details about the state of the connection.
     */
    private ConnectionState privateLinkServiceConnectionState;

    /*
     * Provisioning state of the Private Endpoint Connection.
     */
    private EndPointProvisioningState provisioningState;

    /**
     * Creates an instance of PrivateEndpointConnectionProperties class.
     */
    public PrivateEndpointConnectionProperties() {
    }

    /**
     * Get the privateEndpoint property: The Private Endpoint resource for this Connection.
     * 
     * @return the privateEndpoint value.
     */
    public PrivateEndpoint privateEndpoint() {
        return this.privateEndpoint;
    }

    /**
     * Set the privateEndpoint property: The Private Endpoint resource for this Connection.
     * 
     * @param privateEndpoint the privateEndpoint value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withPrivateEndpoint(PrivateEndpoint privateEndpoint) {
        this.privateEndpoint = privateEndpoint;
        return this;
    }

    /**
     * Get the privateLinkServiceConnectionState property: Details about the state of the connection.
     * 
     * @return the privateLinkServiceConnectionState value.
     */
    public ConnectionState privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }

    /**
     * Set the privateLinkServiceConnectionState property: Details about the state of the connection.
     * 
     * @param privateLinkServiceConnectionState the privateLinkServiceConnectionState value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties
        withPrivateLinkServiceConnectionState(ConnectionState privateLinkServiceConnectionState) {
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the Private Endpoint Connection.
     * 
     * @return the provisioningState value.
     */
    public EndPointProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: Provisioning state of the Private Endpoint Connection.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the PrivateEndpointConnectionProperties object itself.
     */
    public PrivateEndpointConnectionProperties withProvisioningState(EndPointProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (privateEndpoint() != null) {
            privateEndpoint().validate();
        }
        if (privateLinkServiceConnectionState() != null) {
            privateLinkServiceConnectionState().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("privateEndpoint", this.privateEndpoint);
        jsonWriter.writeJsonField("privateLinkServiceConnectionState", this.privateLinkServiceConnectionState);
        jsonWriter.writeStringField("provisioningState",
            this.provisioningState == null ? null : this.provisioningState.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateEndpointConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointConnectionProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointConnectionProperties.
     */
    public static PrivateEndpointConnectionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointConnectionProperties deserializedPrivateEndpointConnectionProperties
                = new PrivateEndpointConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("privateEndpoint".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionProperties.privateEndpoint = PrivateEndpoint.fromJson(reader);
                } else if ("privateLinkServiceConnectionState".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionProperties.privateLinkServiceConnectionState
                        = ConnectionState.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedPrivateEndpointConnectionProperties.provisioningState
                        = EndPointProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointConnectionProperties;
        });
    }
}
