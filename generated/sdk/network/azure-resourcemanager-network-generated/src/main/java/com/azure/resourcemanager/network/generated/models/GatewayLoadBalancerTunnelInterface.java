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
 * Gateway load balancer tunnel interface of a load balancer backend address pool.
 */
@Fluent
public final class GatewayLoadBalancerTunnelInterface implements JsonSerializable<GatewayLoadBalancerTunnelInterface> {
    /*
     * Port of gateway load balancer tunnel interface.
     */
    private Integer port;

    /*
     * Identifier of gateway load balancer tunnel interface.
     */
    private Integer identifier;

    /*
     * Protocol of gateway load balancer tunnel interface.
     */
    private GatewayLoadBalancerTunnelProtocol protocol;

    /*
     * Traffic type of gateway load balancer tunnel interface.
     */
    private GatewayLoadBalancerTunnelInterfaceType type;

    /**
     * Creates an instance of GatewayLoadBalancerTunnelInterface class.
     */
    public GatewayLoadBalancerTunnelInterface() {
    }

    /**
     * Get the port property: Port of gateway load balancer tunnel interface.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: Port of gateway load balancer tunnel interface.
     * 
     * @param port the port value to set.
     * @return the GatewayLoadBalancerTunnelInterface object itself.
     */
    public GatewayLoadBalancerTunnelInterface withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the identifier property: Identifier of gateway load balancer tunnel interface.
     * 
     * @return the identifier value.
     */
    public Integer identifier() {
        return this.identifier;
    }

    /**
     * Set the identifier property: Identifier of gateway load balancer tunnel interface.
     * 
     * @param identifier the identifier value to set.
     * @return the GatewayLoadBalancerTunnelInterface object itself.
     */
    public GatewayLoadBalancerTunnelInterface withIdentifier(Integer identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get the protocol property: Protocol of gateway load balancer tunnel interface.
     * 
     * @return the protocol value.
     */
    public GatewayLoadBalancerTunnelProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol of gateway load balancer tunnel interface.
     * 
     * @param protocol the protocol value to set.
     * @return the GatewayLoadBalancerTunnelInterface object itself.
     */
    public GatewayLoadBalancerTunnelInterface withProtocol(GatewayLoadBalancerTunnelProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the type property: Traffic type of gateway load balancer tunnel interface.
     * 
     * @return the type value.
     */
    public GatewayLoadBalancerTunnelInterfaceType type() {
        return this.type;
    }

    /**
     * Set the type property: Traffic type of gateway load balancer tunnel interface.
     * 
     * @param type the type value to set.
     * @return the GatewayLoadBalancerTunnelInterface object itself.
     */
    public GatewayLoadBalancerTunnelInterface withType(GatewayLoadBalancerTunnelInterfaceType type) {
        this.type = type;
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
        jsonWriter.writeNumberField("identifier", this.identifier);
        jsonWriter.writeStringField("protocol", this.protocol == null ? null : this.protocol.toString());
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of GatewayLoadBalancerTunnelInterface from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of GatewayLoadBalancerTunnelInterface if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the GatewayLoadBalancerTunnelInterface.
     */
    public static GatewayLoadBalancerTunnelInterface fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            GatewayLoadBalancerTunnelInterface deserializedGatewayLoadBalancerTunnelInterface
                = new GatewayLoadBalancerTunnelInterface();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("port".equals(fieldName)) {
                    deserializedGatewayLoadBalancerTunnelInterface.port = reader.getNullable(JsonReader::getInt);
                } else if ("identifier".equals(fieldName)) {
                    deserializedGatewayLoadBalancerTunnelInterface.identifier = reader.getNullable(JsonReader::getInt);
                } else if ("protocol".equals(fieldName)) {
                    deserializedGatewayLoadBalancerTunnelInterface.protocol
                        = GatewayLoadBalancerTunnelProtocol.fromString(reader.getString());
                } else if ("type".equals(fieldName)) {
                    deserializedGatewayLoadBalancerTunnelInterface.type
                        = GatewayLoadBalancerTunnelInterfaceType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedGatewayLoadBalancerTunnelInterface;
        });
    }
}
