// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * The IP Addresses and Ports that require inbound network access to and within the subnet of the App Service
 * Environment.
 */
@Fluent
public final class InboundEnvironmentEndpointInner implements JsonSerializable<InboundEnvironmentEndpointInner> {
    /*
     * Short text describing the purpose of the network traffic.
     */
    private String description;

    /*
     * The IP addresses that network traffic will originate from in cidr notation.
     */
    private List<String> endpoints;

    /*
     * The ports that network traffic will arrive to the App Service Environment at.
     */
    private List<String> ports;

    /**
     * Creates an instance of InboundEnvironmentEndpointInner class.
     */
    public InboundEnvironmentEndpointInner() {
    }

    /**
     * Get the description property: Short text describing the purpose of the network traffic.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Short text describing the purpose of the network traffic.
     * 
     * @param description the description value to set.
     * @return the InboundEnvironmentEndpointInner object itself.
     */
    public InboundEnvironmentEndpointInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the endpoints property: The IP addresses that network traffic will originate from in cidr notation.
     * 
     * @return the endpoints value.
     */
    public List<String> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The IP addresses that network traffic will originate from in cidr notation.
     * 
     * @param endpoints the endpoints value to set.
     * @return the InboundEnvironmentEndpointInner object itself.
     */
    public InboundEnvironmentEndpointInner withEndpoints(List<String> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the ports property: The ports that network traffic will arrive to the App Service Environment at.
     * 
     * @return the ports value.
     */
    public List<String> ports() {
        return this.ports;
    }

    /**
     * Set the ports property: The ports that network traffic will arrive to the App Service Environment at.
     * 
     * @param ports the ports value to set.
     * @return the InboundEnvironmentEndpointInner object itself.
     */
    public InboundEnvironmentEndpointInner withPorts(List<String> ports) {
        this.ports = ports;
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
        jsonWriter.writeStringField("description", this.description);
        jsonWriter.writeArrayField("endpoints", this.endpoints, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("ports", this.ports, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of InboundEnvironmentEndpointInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of InboundEnvironmentEndpointInner if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the InboundEnvironmentEndpointInner.
     */
    public static InboundEnvironmentEndpointInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            InboundEnvironmentEndpointInner deserializedInboundEnvironmentEndpointInner
                = new InboundEnvironmentEndpointInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("description".equals(fieldName)) {
                    deserializedInboundEnvironmentEndpointInner.description = reader.getString();
                } else if ("endpoints".equals(fieldName)) {
                    List<String> endpoints = reader.readArray(reader1 -> reader1.getString());
                    deserializedInboundEnvironmentEndpointInner.endpoints = endpoints;
                } else if ("ports".equals(fieldName)) {
                    List<String> ports = reader.readArray(reader1 -> reader1.getString());
                    deserializedInboundEnvironmentEndpointInner.ports = ports;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedInboundEnvironmentEndpointInner;
        });
    }
}
