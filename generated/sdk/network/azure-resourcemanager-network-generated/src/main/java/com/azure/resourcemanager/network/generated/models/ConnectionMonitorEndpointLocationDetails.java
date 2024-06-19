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
 * Connection monitor endpoint location details only being used for 'AzureArcNetwork' type endpoints, which contains the
 * region details.
 */
@Fluent
public final class ConnectionMonitorEndpointLocationDetails
    implements JsonSerializable<ConnectionMonitorEndpointLocationDetails> {
    /*
     * Region for connection monitor endpoint.
     */
    private String region;

    /**
     * Creates an instance of ConnectionMonitorEndpointLocationDetails class.
     */
    public ConnectionMonitorEndpointLocationDetails() {
    }

    /**
     * Get the region property: Region for connection monitor endpoint.
     * 
     * @return the region value.
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region property: Region for connection monitor endpoint.
     * 
     * @param region the region value to set.
     * @return the ConnectionMonitorEndpointLocationDetails object itself.
     */
    public ConnectionMonitorEndpointLocationDetails withRegion(String region) {
        this.region = region;
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
        jsonWriter.writeStringField("region", this.region);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ConnectionMonitorEndpointLocationDetails from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ConnectionMonitorEndpointLocationDetails if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ConnectionMonitorEndpointLocationDetails.
     */
    public static ConnectionMonitorEndpointLocationDetails fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ConnectionMonitorEndpointLocationDetails deserializedConnectionMonitorEndpointLocationDetails
                = new ConnectionMonitorEndpointLocationDetails();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("region".equals(fieldName)) {
                    deserializedConnectionMonitorEndpointLocationDetails.region = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedConnectionMonitorEndpointLocationDetails;
        });
    }
}
