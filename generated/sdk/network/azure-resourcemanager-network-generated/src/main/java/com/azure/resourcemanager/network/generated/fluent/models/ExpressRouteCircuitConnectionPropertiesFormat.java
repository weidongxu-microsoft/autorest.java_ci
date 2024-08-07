// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.CircuitConnectionStatus;
import com.azure.resourcemanager.network.generated.models.Ipv6CircuitConnectionConfig;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.io.IOException;

/**
 * Properties of the express route circuit connection.
 */
@Fluent
public final class ExpressRouteCircuitConnectionPropertiesFormat
    implements JsonSerializable<ExpressRouteCircuitConnectionPropertiesFormat> {
    /*
     * Reference to Express Route Circuit Private Peering Resource of the circuit initiating connection.
     */
    private SubResource expressRouteCircuitPeering;

    /*
     * Reference to Express Route Circuit Private Peering Resource of the peered circuit.
     */
    private SubResource peerExpressRouteCircuitPeering;

    /*
     * /29 IP address space to carve out Customer addresses for tunnels.
     */
    private String addressPrefix;

    /*
     * The authorization key.
     */
    private String authorizationKey;

    /*
     * IPv6 Address PrefixProperties of the express route circuit connection.
     */
    private Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig;

    /*
     * Express Route Circuit connection state.
     */
    private CircuitConnectionStatus circuitConnectionStatus;

    /*
     * The provisioning state of the express route circuit connection resource.
     */
    private ProvisioningState provisioningState;

    /**
     * Creates an instance of ExpressRouteCircuitConnectionPropertiesFormat class.
     */
    public ExpressRouteCircuitConnectionPropertiesFormat() {
    }

    /**
     * Get the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit initiating connection.
     * 
     * @return the expressRouteCircuitPeering value.
     */
    public SubResource expressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }

    /**
     * Set the expressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of the
     * circuit initiating connection.
     * 
     * @param expressRouteCircuitPeering the expressRouteCircuitPeering value to set.
     * @return the ExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public ExpressRouteCircuitConnectionPropertiesFormat
        withExpressRouteCircuitPeering(SubResource expressRouteCircuitPeering) {
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        return this;
    }

    /**
     * Get the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     * 
     * @return the peerExpressRouteCircuitPeering value.
     */
    public SubResource peerExpressRouteCircuitPeering() {
        return this.peerExpressRouteCircuitPeering;
    }

    /**
     * Set the peerExpressRouteCircuitPeering property: Reference to Express Route Circuit Private Peering Resource of
     * the peered circuit.
     * 
     * @param peerExpressRouteCircuitPeering the peerExpressRouteCircuitPeering value to set.
     * @return the ExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public ExpressRouteCircuitConnectionPropertiesFormat
        withPeerExpressRouteCircuitPeering(SubResource peerExpressRouteCircuitPeering) {
        this.peerExpressRouteCircuitPeering = peerExpressRouteCircuitPeering;
        return this;
    }

    /**
     * Get the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     * 
     * @return the addressPrefix value.
     */
    public String addressPrefix() {
        return this.addressPrefix;
    }

    /**
     * Set the addressPrefix property: /29 IP address space to carve out Customer addresses for tunnels.
     * 
     * @param addressPrefix the addressPrefix value to set.
     * @return the ExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public ExpressRouteCircuitConnectionPropertiesFormat withAddressPrefix(String addressPrefix) {
        this.addressPrefix = addressPrefix;
        return this;
    }

    /**
     * Get the authorizationKey property: The authorization key.
     * 
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey property: The authorization key.
     * 
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public ExpressRouteCircuitConnectionPropertiesFormat withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the ipv6CircuitConnectionConfig property: IPv6 Address PrefixProperties of the express route circuit
     * connection.
     * 
     * @return the ipv6CircuitConnectionConfig value.
     */
    public Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig() {
        return this.ipv6CircuitConnectionConfig;
    }

    /**
     * Set the ipv6CircuitConnectionConfig property: IPv6 Address PrefixProperties of the express route circuit
     * connection.
     * 
     * @param ipv6CircuitConnectionConfig the ipv6CircuitConnectionConfig value to set.
     * @return the ExpressRouteCircuitConnectionPropertiesFormat object itself.
     */
    public ExpressRouteCircuitConnectionPropertiesFormat
        withIpv6CircuitConnectionConfig(Ipv6CircuitConnectionConfig ipv6CircuitConnectionConfig) {
        this.ipv6CircuitConnectionConfig = ipv6CircuitConnectionConfig;
        return this;
    }

    /**
     * Get the circuitConnectionStatus property: Express Route Circuit connection state.
     * 
     * @return the circuitConnectionStatus value.
     */
    public CircuitConnectionStatus circuitConnectionStatus() {
        return this.circuitConnectionStatus;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route circuit connection resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ipv6CircuitConnectionConfig() != null) {
            ipv6CircuitConnectionConfig().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("expressRouteCircuitPeering", this.expressRouteCircuitPeering);
        jsonWriter.writeJsonField("peerExpressRouteCircuitPeering", this.peerExpressRouteCircuitPeering);
        jsonWriter.writeStringField("addressPrefix", this.addressPrefix);
        jsonWriter.writeStringField("authorizationKey", this.authorizationKey);
        jsonWriter.writeJsonField("ipv6CircuitConnectionConfig", this.ipv6CircuitConnectionConfig);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExpressRouteCircuitConnectionPropertiesFormat from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRouteCircuitConnectionPropertiesFormat if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ExpressRouteCircuitConnectionPropertiesFormat.
     */
    public static ExpressRouteCircuitConnectionPropertiesFormat fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRouteCircuitConnectionPropertiesFormat deserializedExpressRouteCircuitConnectionPropertiesFormat
                = new ExpressRouteCircuitConnectionPropertiesFormat();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("expressRouteCircuitPeering".equals(fieldName)) {
                    deserializedExpressRouteCircuitConnectionPropertiesFormat.expressRouteCircuitPeering
                        = SubResource.fromJson(reader);
                } else if ("peerExpressRouteCircuitPeering".equals(fieldName)) {
                    deserializedExpressRouteCircuitConnectionPropertiesFormat.peerExpressRouteCircuitPeering
                        = SubResource.fromJson(reader);
                } else if ("addressPrefix".equals(fieldName)) {
                    deserializedExpressRouteCircuitConnectionPropertiesFormat.addressPrefix = reader.getString();
                } else if ("authorizationKey".equals(fieldName)) {
                    deserializedExpressRouteCircuitConnectionPropertiesFormat.authorizationKey = reader.getString();
                } else if ("ipv6CircuitConnectionConfig".equals(fieldName)) {
                    deserializedExpressRouteCircuitConnectionPropertiesFormat.ipv6CircuitConnectionConfig
                        = Ipv6CircuitConnectionConfig.fromJson(reader);
                } else if ("circuitConnectionStatus".equals(fieldName)) {
                    deserializedExpressRouteCircuitConnectionPropertiesFormat.circuitConnectionStatus
                        = CircuitConnectionStatus.fromString(reader.getString());
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedExpressRouteCircuitConnectionPropertiesFormat.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRouteCircuitConnectionPropertiesFormat;
        });
    }
}
