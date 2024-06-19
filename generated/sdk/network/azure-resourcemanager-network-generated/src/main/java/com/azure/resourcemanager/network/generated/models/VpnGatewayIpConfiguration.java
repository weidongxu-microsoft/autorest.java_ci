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
 * IP Configuration of a VPN Gateway Resource.
 */
@Fluent
public final class VpnGatewayIpConfiguration implements JsonSerializable<VpnGatewayIpConfiguration> {
    /*
     * The identifier of the IP configuration for a VPN Gateway.
     */
    private String id;

    /*
     * The public IP address of this IP configuration.
     */
    private String publicIpAddress;

    /*
     * The private IP address of this IP configuration.
     */
    private String privateIpAddress;

    /**
     * Creates an instance of VpnGatewayIpConfiguration class.
     */
    public VpnGatewayIpConfiguration() {
    }

    /**
     * Get the id property: The identifier of the IP configuration for a VPN Gateway.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The identifier of the IP configuration for a VPN Gateway.
     * 
     * @param id the id value to set.
     * @return the VpnGatewayIpConfiguration object itself.
     */
    public VpnGatewayIpConfiguration withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the publicIpAddress property: The public IP address of this IP configuration.
     * 
     * @return the publicIpAddress value.
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Set the publicIpAddress property: The public IP address of this IP configuration.
     * 
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the VpnGatewayIpConfiguration object itself.
     */
    public VpnGatewayIpConfiguration withPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }

    /**
     * Get the privateIpAddress property: The private IP address of this IP configuration.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

    /**
     * Set the privateIpAddress property: The private IP address of this IP configuration.
     * 
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the VpnGatewayIpConfiguration object itself.
     */
    public VpnGatewayIpConfiguration withPrivateIpAddress(String privateIpAddress) {
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
        jsonWriter.writeStringField("id", this.id);
        jsonWriter.writeStringField("publicIpAddress", this.publicIpAddress);
        jsonWriter.writeStringField("privateIpAddress", this.privateIpAddress);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of VpnGatewayIpConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of VpnGatewayIpConfiguration if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the VpnGatewayIpConfiguration.
     */
    public static VpnGatewayIpConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            VpnGatewayIpConfiguration deserializedVpnGatewayIpConfiguration = new VpnGatewayIpConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedVpnGatewayIpConfiguration.id = reader.getString();
                } else if ("publicIpAddress".equals(fieldName)) {
                    deserializedVpnGatewayIpConfiguration.publicIpAddress = reader.getString();
                } else if ("privateIpAddress".equals(fieldName)) {
                    deserializedVpnGatewayIpConfiguration.privateIpAddress = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedVpnGatewayIpConfiguration;
        });
    }
}
