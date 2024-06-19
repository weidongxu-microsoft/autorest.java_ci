// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * An Itsm receiver.
 */
@Fluent
public final class ItsmReceiver implements JsonSerializable<ItsmReceiver> {
    /*
     * The name of the Itsm receiver. Names must be unique across all receivers within an action group.
     */
    private String name;

    /*
     * OMS LA instance identifier.
     */
    private String workspaceId;

    /*
     * Unique identification of ITSM connection among multiple defined in above workspace.
     */
    private String connectionId;

    /*
     * JSON blob for the configurations of the ITSM action. CreateMultipleWorkItems option will be part of this blob as
     * well.
     */
    private String ticketConfiguration;

    /*
     * Region in which workspace resides. Supported
     * values:'centralindia','japaneast','southeastasia','australiasoutheast','uksouth','westcentralus','canadacentral',
     * 'eastus','westeurope'
     */
    private String region;

    /**
     * Creates an instance of ItsmReceiver class.
     */
    public ItsmReceiver() {
    }

    /**
     * Get the name property: The name of the Itsm receiver. Names must be unique across all receivers within an action
     * group.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the Itsm receiver. Names must be unique across all receivers within an action
     * group.
     * 
     * @param name the name value to set.
     * @return the ItsmReceiver object itself.
     */
    public ItsmReceiver withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the workspaceId property: OMS LA instance identifier.
     * 
     * @return the workspaceId value.
     */
    public String workspaceId() {
        return this.workspaceId;
    }

    /**
     * Set the workspaceId property: OMS LA instance identifier.
     * 
     * @param workspaceId the workspaceId value to set.
     * @return the ItsmReceiver object itself.
     */
    public ItsmReceiver withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * Get the connectionId property: Unique identification of ITSM connection among multiple defined in above
     * workspace.
     * 
     * @return the connectionId value.
     */
    public String connectionId() {
        return this.connectionId;
    }

    /**
     * Set the connectionId property: Unique identification of ITSM connection among multiple defined in above
     * workspace.
     * 
     * @param connectionId the connectionId value to set.
     * @return the ItsmReceiver object itself.
     */
    public ItsmReceiver withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * Get the ticketConfiguration property: JSON blob for the configurations of the ITSM action.
     * CreateMultipleWorkItems option will be part of this blob as well.
     * 
     * @return the ticketConfiguration value.
     */
    public String ticketConfiguration() {
        return this.ticketConfiguration;
    }

    /**
     * Set the ticketConfiguration property: JSON blob for the configurations of the ITSM action.
     * CreateMultipleWorkItems option will be part of this blob as well.
     * 
     * @param ticketConfiguration the ticketConfiguration value to set.
     * @return the ItsmReceiver object itself.
     */
    public ItsmReceiver withTicketConfiguration(String ticketConfiguration) {
        this.ticketConfiguration = ticketConfiguration;
        return this;
    }

    /**
     * Get the region property: Region in which workspace resides. Supported
     * values:'centralindia','japaneast','southeastasia','australiasoutheast','uksouth','westcentralus','canadacentral','eastus','westeurope'.
     * 
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: Region in which workspace resides. Supported
     * values:'centralindia','japaneast','southeastasia','australiasoutheast','uksouth','westcentralus','canadacentral','eastus','westeurope'.
     * 
     * @param region the region value to set.
     * @return the ItsmReceiver object itself.
     */
    public ItsmReceiver withRegion(String region) {
        this.region = region;
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
                .log(new IllegalArgumentException("Missing required property name in model ItsmReceiver"));
        }
        if (workspaceId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property workspaceId in model ItsmReceiver"));
        }
        if (connectionId() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property connectionId in model ItsmReceiver"));
        }
        if (ticketConfiguration() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property ticketConfiguration in model ItsmReceiver"));
        }
        if (region() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property region in model ItsmReceiver"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ItsmReceiver.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("workspaceId", this.workspaceId);
        jsonWriter.writeStringField("connectionId", this.connectionId);
        jsonWriter.writeStringField("ticketConfiguration", this.ticketConfiguration);
        jsonWriter.writeStringField("region", this.region);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ItsmReceiver from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ItsmReceiver if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ItsmReceiver.
     */
    public static ItsmReceiver fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ItsmReceiver deserializedItsmReceiver = new ItsmReceiver();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedItsmReceiver.name = reader.getString();
                } else if ("workspaceId".equals(fieldName)) {
                    deserializedItsmReceiver.workspaceId = reader.getString();
                } else if ("connectionId".equals(fieldName)) {
                    deserializedItsmReceiver.connectionId = reader.getString();
                } else if ("ticketConfiguration".equals(fieldName)) {
                    deserializedItsmReceiver.ticketConfiguration = reader.getString();
                } else if ("region".equals(fieldName)) {
                    deserializedItsmReceiver.region = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedItsmReceiver;
        });
    }
}
