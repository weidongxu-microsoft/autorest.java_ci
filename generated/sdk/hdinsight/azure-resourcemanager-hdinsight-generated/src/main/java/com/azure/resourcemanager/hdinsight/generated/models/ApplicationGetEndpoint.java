// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Gets the application SSH endpoint.
 */
@Fluent
public final class ApplicationGetEndpoint implements JsonSerializable<ApplicationGetEndpoint> {
    /*
     * The location of the endpoint.
     */
    private String location;

    /*
     * The destination port to connect to.
     */
    private Integer destinationPort;

    /*
     * The public port to connect to.
     */
    private Integer publicPort;

    /*
     * The private ip address of the endpoint.
     */
    private String privateIpAddress;

    /**
     * Creates an instance of ApplicationGetEndpoint class.
     */
    public ApplicationGetEndpoint() {
    }

    /**
     * Get the location property: The location of the endpoint.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the endpoint.
     * 
     * @param location the location value to set.
     * @return the ApplicationGetEndpoint object itself.
     */
    public ApplicationGetEndpoint withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the destinationPort property: The destination port to connect to.
     * 
     * @return the destinationPort value.
     */
    public Integer destinationPort() {
        return this.destinationPort;
    }

    /**
     * Set the destinationPort property: The destination port to connect to.
     * 
     * @param destinationPort the destinationPort value to set.
     * @return the ApplicationGetEndpoint object itself.
     */
    public ApplicationGetEndpoint withDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    /**
     * Get the publicPort property: The public port to connect to.
     * 
     * @return the publicPort value.
     */
    public Integer publicPort() {
        return this.publicPort;
    }

    /**
     * Set the publicPort property: The public port to connect to.
     * 
     * @param publicPort the publicPort value to set.
     * @return the ApplicationGetEndpoint object itself.
     */
    public ApplicationGetEndpoint withPublicPort(Integer publicPort) {
        this.publicPort = publicPort;
        return this;
    }

    /**
     * Get the privateIpAddress property: The private ip address of the endpoint.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The private ip address of the endpoint.
     * 
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the ApplicationGetEndpoint object itself.
     */
    public ApplicationGetEndpoint withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
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
        jsonWriter.writeStringField("location", this.location);
        jsonWriter.writeNumberField("destinationPort", this.destinationPort);
        jsonWriter.writeNumberField("publicPort", this.publicPort);
        jsonWriter.writeStringField("privateIPAddress", this.privateIpAddress);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ApplicationGetEndpoint from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ApplicationGetEndpoint if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ApplicationGetEndpoint.
     */
    public static ApplicationGetEndpoint fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ApplicationGetEndpoint deserializedApplicationGetEndpoint = new ApplicationGetEndpoint();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("location".equals(fieldName)) {
                    deserializedApplicationGetEndpoint.location = reader.getString();
                } else if ("destinationPort".equals(fieldName)) {
                    deserializedApplicationGetEndpoint.destinationPort = reader.getNullable(JsonReader::getInt);
                } else if ("publicPort".equals(fieldName)) {
                    deserializedApplicationGetEndpoint.publicPort = reader.getNullable(JsonReader::getInt);
                } else if ("privateIPAddress".equals(fieldName)) {
                    deserializedApplicationGetEndpoint.privateIpAddress = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedApplicationGetEndpoint;
        });
    }
}
