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
import java.util.List;

/**
 * Group of src/dest ips and ports to be captured.
 */
@Fluent
public final class AzureFirewallPacketCaptureRule implements JsonSerializable<AzureFirewallPacketCaptureRule> {
    /*
     * List of source IP addresses/subnets to be captured.
     */
    private List<String> sources;

    /*
     * List of destination IP addresses/subnets to be captured.
     */
    private List<String> destinations;

    /*
     * List of ports to be captured.
     */
    private List<String> destinationPorts;

    /**
     * Creates an instance of AzureFirewallPacketCaptureRule class.
     */
    public AzureFirewallPacketCaptureRule() {
    }

    /**
     * Get the sources property: List of source IP addresses/subnets to be captured.
     * 
     * @return the sources value.
     */
    public List<String> sources() {
        return this.sources;
    }

    /**
     * Set the sources property: List of source IP addresses/subnets to be captured.
     * 
     * @param sources the sources value to set.
     * @return the AzureFirewallPacketCaptureRule object itself.
     */
    public AzureFirewallPacketCaptureRule withSources(List<String> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * Get the destinations property: List of destination IP addresses/subnets to be captured.
     * 
     * @return the destinations value.
     */
    public List<String> destinations() {
        return this.destinations;
    }

    /**
     * Set the destinations property: List of destination IP addresses/subnets to be captured.
     * 
     * @param destinations the destinations value to set.
     * @return the AzureFirewallPacketCaptureRule object itself.
     */
    public AzureFirewallPacketCaptureRule withDestinations(List<String> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * Get the destinationPorts property: List of ports to be captured.
     * 
     * @return the destinationPorts value.
     */
    public List<String> destinationPorts() {
        return this.destinationPorts;
    }

    /**
     * Set the destinationPorts property: List of ports to be captured.
     * 
     * @param destinationPorts the destinationPorts value to set.
     * @return the AzureFirewallPacketCaptureRule object itself.
     */
    public AzureFirewallPacketCaptureRule withDestinationPorts(List<String> destinationPorts) {
        this.destinationPorts = destinationPorts;
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
        jsonWriter.writeArrayField("sources", this.sources, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("destinations", this.destinations, (writer, element) -> writer.writeString(element));
        jsonWriter.writeArrayField("destinationPorts", this.destinationPorts,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AzureFirewallPacketCaptureRule from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureFirewallPacketCaptureRule if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AzureFirewallPacketCaptureRule.
     */
    public static AzureFirewallPacketCaptureRule fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureFirewallPacketCaptureRule deserializedAzureFirewallPacketCaptureRule
                = new AzureFirewallPacketCaptureRule();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("sources".equals(fieldName)) {
                    List<String> sources = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureFirewallPacketCaptureRule.sources = sources;
                } else if ("destinations".equals(fieldName)) {
                    List<String> destinations = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureFirewallPacketCaptureRule.destinations = destinations;
                } else if ("destinationPorts".equals(fieldName)) {
                    List<String> destinationPorts = reader.readArray(reader1 -> reader1.getString());
                    deserializedAzureFirewallPacketCaptureRule.destinationPorts = destinationPorts;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureFirewallPacketCaptureRule;
        });
    }
}
