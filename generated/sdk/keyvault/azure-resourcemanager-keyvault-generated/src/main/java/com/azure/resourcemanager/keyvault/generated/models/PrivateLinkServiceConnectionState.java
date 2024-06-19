// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An object that represents the approval state of the private link connection.
 */
@Fluent
public final class PrivateLinkServiceConnectionState implements JsonSerializable<PrivateLinkServiceConnectionState> {
    /*
     * Indicates whether the connection has been approved, rejected or removed by the key vault owner.
     */
    private PrivateEndpointServiceConnectionStatus status;

    /*
     * The reason for approval or rejection.
     */
    private String description;

    /*
     * A message indicating if changes on the service provider require any updates on the consumer.
     */
    private ActionsRequired actionsRequired;

    /**
     * Creates an instance of PrivateLinkServiceConnectionState class.
     */
    public PrivateLinkServiceConnectionState() {
    }

    /**
     * Get the status property: Indicates whether the connection has been approved, rejected or removed by the key vault
     * owner.
     * 
     * @return the status value.
     */
    public PrivateEndpointServiceConnectionStatus status() {
        return this.status;
    }

    /**
     * Set the status property: Indicates whether the connection has been approved, rejected or removed by the key vault
     * owner.
     * 
     * @param status the status value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withStatus(PrivateEndpointServiceConnectionStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the description property: The reason for approval or rejection.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The reason for approval or rejection.
     * 
     * @param description the description value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionsRequired property: A message indicating if changes on the service provider require any updates on
     * the consumer.
     * 
     * @return the actionsRequired value.
     */
    public ActionsRequired actionsRequired() {
        return this.actionsRequired;
    }

    /**
     * Set the actionsRequired property: A message indicating if changes on the service provider require any updates on
     * the consumer.
     * 
     * @param actionsRequired the actionsRequired value to set.
     * @return the PrivateLinkServiceConnectionState object itself.
     */
    public PrivateLinkServiceConnectionState withActionsRequired(ActionsRequired actionsRequired) {
        this.actionsRequired = actionsRequired;
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
        jsonWriter.writeStringField("status", this.status == null ? null : this.status.toString());
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeStringField("actionsRequired",
            this.actionsRequired == null ? null : this.actionsRequired.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateLinkServiceConnectionState from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateLinkServiceConnectionState if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateLinkServiceConnectionState.
     */
    public static PrivateLinkServiceConnectionState fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateLinkServiceConnectionState deserializedPrivateLinkServiceConnectionState
                = new PrivateLinkServiceConnectionState();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("status".equals(fieldName)) {
                    deserializedPrivateLinkServiceConnectionState.status
                        = PrivateEndpointServiceConnectionStatus.fromString(reader.getString());
                } else if ("description".equals(fieldName)) {
                    deserializedPrivateLinkServiceConnectionState.description = reader.getString();
                } else if ("actionsRequired".equals(fieldName)) {
                    deserializedPrivateLinkServiceConnectionState.actionsRequired
                        = ActionsRequired.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateLinkServiceConnectionState;
        });
    }
}
