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
 * Describes the ICMP configuration.
 */
@Fluent
public final class ConnectionMonitorIcmpConfiguration implements JsonSerializable<ConnectionMonitorIcmpConfiguration> {
    /*
     * Value indicating whether path evaluation with trace route should be disabled.
     */
    private Boolean disableTraceRoute;

    /**
     * Creates an instance of ConnectionMonitorIcmpConfiguration class.
     */
    public ConnectionMonitorIcmpConfiguration() {
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
     * @return the ConnectionMonitorIcmpConfiguration object itself.
     */
    public ConnectionMonitorIcmpConfiguration withDisableTraceRoute(Boolean disableTraceRoute) {
        this.disableTraceRoute = disableTraceRoute;
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
        jsonWriter.writeBooleanField("disableTraceRoute", this.disableTraceRoute);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectionMonitorIcmpConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectionMonitorIcmpConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectionMonitorIcmpConfiguration.
     */
    public static ConnectionMonitorIcmpConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectionMonitorIcmpConfiguration deserializedConnectionMonitorIcmpConfiguration
                = new ConnectionMonitorIcmpConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("disableTraceRoute".equals(fieldName)) {
                    deserializedConnectionMonitorIcmpConfiguration.disableTraceRoute
                        = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectionMonitorIcmpConfiguration;
        });
    }
}
