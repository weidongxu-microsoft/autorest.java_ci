// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Describes the TCP configuration.
 */
@Fluent
public final class ConnectionMonitorTcpConfiguration implements JsonSerializable<ConnectionMonitorTcpConfiguration> {
    /*
     * The port to connect to.
     */
    private Integer port;

    /*
     * Value indicating whether path evaluation with trace route should be disabled.
     */
    private Boolean disableTraceRoute;

    /*
     * Destination port behavior.
     */
    private DestinationPortBehavior destinationPortBehavior;

    /**
     * Creates an instance of ConnectionMonitorTcpConfiguration class.
     */
    public ConnectionMonitorTcpConfiguration() {
    }

    /**
     * Get the port property: The port to connect to.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port to connect to.
     * 
     * @param port the port value to set.
     * @return the ConnectionMonitorTcpConfiguration object itself.
     */
    public ConnectionMonitorTcpConfiguration withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the disableTraceRoute property: Value indicating whether path evaluation with trace route should be disabled.
     * 
     * @return the disableTraceRoute value.
     */
    public Boolean disableTraceRoute() {
        return this.disableTraceRoute;
    }

    /**
     * Set the disableTraceRoute property: Value indicating whether path evaluation with trace route should be disabled.
     * 
     * @param disableTraceRoute the disableTraceRoute value to set.
     * @return the ConnectionMonitorTcpConfiguration object itself.
     */
    public ConnectionMonitorTcpConfiguration withDisableTraceRoute(Boolean disableTraceRoute) {
        this.disableTraceRoute = disableTraceRoute;
        return this;
    }

    /**
     * Get the destinationPortBehavior property: Destination port behavior.
     * 
     * @return the destinationPortBehavior value.
     */
    public DestinationPortBehavior destinationPortBehavior() {
        return this.destinationPortBehavior;
    }

    /**
     * Set the destinationPortBehavior property: Destination port behavior.
     * 
     * @param destinationPortBehavior the destinationPortBehavior value to set.
     * @return the ConnectionMonitorTcpConfiguration object itself.
     */
    public ConnectionMonitorTcpConfiguration
        withDestinationPortBehavior(DestinationPortBehavior destinationPortBehavior) {
        this.destinationPortBehavior = destinationPortBehavior;
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
        jsonWriter.writeNumberField("port", this.port);
        jsonWriter.writeBooleanField("disableTraceRoute", this.disableTraceRoute);
        jsonWriter.writeStringField("destinationPortBehavior",
            this.destinationPortBehavior == null ? null : this.destinationPortBehavior.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectionMonitorTcpConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectionMonitorTcpConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectionMonitorTcpConfiguration.
     */
    public static ConnectionMonitorTcpConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectionMonitorTcpConfiguration deserializedConnectionMonitorTcpConfiguration
                = new ConnectionMonitorTcpConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("port".equals(fieldName)) {
                    deserializedConnectionMonitorTcpConfiguration.port = reader.getNullable(JsonReader::getInt);
                } else if ("disableTraceRoute".equals(fieldName)) {
                    deserializedConnectionMonitorTcpConfiguration.disableTraceRoute
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("destinationPortBehavior".equals(fieldName)) {
                    deserializedConnectionMonitorTcpConfiguration.destinationPortBehavior
                        = DestinationPortBehavior.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectionMonitorTcpConfiguration;
        });
    }
}
