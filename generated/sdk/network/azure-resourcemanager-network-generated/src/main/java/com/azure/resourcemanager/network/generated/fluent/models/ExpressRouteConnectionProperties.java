// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitPeeringId;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.RoutingConfiguration;
import java.io.IOException;

/**
 * Properties of the ExpressRouteConnection subresource.
 */
@Fluent
public final class ExpressRouteConnectionProperties implements JsonSerializable<ExpressRouteConnectionProperties> {
    /*
     * The provisioning state of the express route connection resource.
     */
    private ProvisioningState provisioningState;

    /*
     * The ExpressRoute circuit peering.
     */
    private ExpressRouteCircuitPeeringId expressRouteCircuitPeering;

    /*
     * Authorization key to establish the connection.
     */
    private String authorizationKey;

    /*
     * The routing weight associated to the connection.
     */
    private Integer routingWeight;

    /*
     * Enable internet security.
     */
    private Boolean enableInternetSecurity;

    /*
     * Enable FastPath to vWan Firewall hub.
     */
    private Boolean expressRouteGatewayBypass;

    /*
     * Bypass the ExpressRoute gateway when accessing private-links. ExpressRoute FastPath (expressRouteGatewayBypass)
     * must be enabled.
     */
    private Boolean enablePrivateLinkFastPath;

    /*
     * The Routing Configuration indicating the associated and propagated route tables on this connection.
     */
    private RoutingConfiguration routingConfiguration;

    /**
     * Creates an instance of ExpressRouteConnectionProperties class.
     */
    public ExpressRouteConnectionProperties() {
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route connection resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the expressRouteCircuitPeering property: The ExpressRoute circuit peering.
     * 
     * @return the expressRouteCircuitPeering value.
     */
    public ExpressRouteCircuitPeeringId expressRouteCircuitPeering() {
        return this.expressRouteCircuitPeering;
    }

    /**
     * Set the expressRouteCircuitPeering property: The ExpressRoute circuit peering.
     * 
     * @param expressRouteCircuitPeering the expressRouteCircuitPeering value to set.
     * @return the ExpressRouteConnectionProperties object itself.
     */
    public ExpressRouteConnectionProperties
        withExpressRouteCircuitPeering(ExpressRouteCircuitPeeringId expressRouteCircuitPeering) {
        this.expressRouteCircuitPeering = expressRouteCircuitPeering;
        return this;
    }

    /**
     * Get the authorizationKey property: Authorization key to establish the connection.
     * 
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.authorizationKey;
    }

    /**
     * Set the authorizationKey property: Authorization key to establish the connection.
     * 
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteConnectionProperties object itself.
     */
    public ExpressRouteConnectionProperties withAuthorizationKey(String authorizationKey) {
        this.authorizationKey = authorizationKey;
        return this;
    }

    /**
     * Get the routingWeight property: The routing weight associated to the connection.
     * 
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.routingWeight;
    }

    /**
     * Set the routingWeight property: The routing weight associated to the connection.
     * 
     * @param routingWeight the routingWeight value to set.
     * @return the ExpressRouteConnectionProperties object itself.
     */
    public ExpressRouteConnectionProperties withRoutingWeight(Integer routingWeight) {
        this.routingWeight = routingWeight;
        return this;
    }

    /**
     * Get the enableInternetSecurity property: Enable internet security.
     * 
     * @return the enableInternetSecurity value.
     */
    public Boolean enableInternetSecurity() {
        return this.enableInternetSecurity;
    }

    /**
     * Set the enableInternetSecurity property: Enable internet security.
     * 
     * @param enableInternetSecurity the enableInternetSecurity value to set.
     * @return the ExpressRouteConnectionProperties object itself.
     */
    public ExpressRouteConnectionProperties withEnableInternetSecurity(Boolean enableInternetSecurity) {
        this.enableInternetSecurity = enableInternetSecurity;
        return this;
    }

    /**
     * Get the expressRouteGatewayBypass property: Enable FastPath to vWan Firewall hub.
     * 
     * @return the expressRouteGatewayBypass value.
     */
    public Boolean expressRouteGatewayBypass() {
        return this.expressRouteGatewayBypass;
    }

    /**
     * Set the expressRouteGatewayBypass property: Enable FastPath to vWan Firewall hub.
     * 
     * @param expressRouteGatewayBypass the expressRouteGatewayBypass value to set.
     * @return the ExpressRouteConnectionProperties object itself.
     */
    public ExpressRouteConnectionProperties withExpressRouteGatewayBypass(Boolean expressRouteGatewayBypass) {
        this.expressRouteGatewayBypass = expressRouteGatewayBypass;
        return this;
    }

    /**
     * Get the enablePrivateLinkFastPath property: Bypass the ExpressRoute gateway when accessing private-links.
     * ExpressRoute FastPath (expressRouteGatewayBypass) must be enabled.
     * 
     * @return the enablePrivateLinkFastPath value.
     */
    public Boolean enablePrivateLinkFastPath() {
        return this.enablePrivateLinkFastPath;
    }

    /**
     * Set the enablePrivateLinkFastPath property: Bypass the ExpressRoute gateway when accessing private-links.
     * ExpressRoute FastPath (expressRouteGatewayBypass) must be enabled.
     * 
     * @param enablePrivateLinkFastPath the enablePrivateLinkFastPath value to set.
     * @return the ExpressRouteConnectionProperties object itself.
     */
    public ExpressRouteConnectionProperties withEnablePrivateLinkFastPath(Boolean enablePrivateLinkFastPath) {
        this.enablePrivateLinkFastPath = enablePrivateLinkFastPath;
        return this;
    }

    /**
     * Get the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     * 
     * @return the routingConfiguration value.
     */
    public RoutingConfiguration routingConfiguration() {
        return this.routingConfiguration;
    }

    /**
     * Set the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     * 
     * @param routingConfiguration the routingConfiguration value to set.
     * @return the ExpressRouteConnectionProperties object itself.
     */
    public ExpressRouteConnectionProperties withRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        this.routingConfiguration = routingConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (expressRouteCircuitPeering() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property expressRouteCircuitPeering in model ExpressRouteConnectionProperties"));
        } else {
            expressRouteCircuitPeering().validate();
        }
        if (routingConfiguration() != null) {
            routingConfiguration().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExpressRouteConnectionProperties.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("expressRouteCircuitPeering", this.expressRouteCircuitPeering);
        jsonWriter.writeStringField("authorizationKey", this.authorizationKey);
        jsonWriter.writeNumberField("routingWeight", this.routingWeight);
        jsonWriter.writeBooleanField("enableInternetSecurity", this.enableInternetSecurity);
        jsonWriter.writeBooleanField("expressRouteGatewayBypass", this.expressRouteGatewayBypass);
        jsonWriter.writeBooleanField("enablePrivateLinkFastPath", this.enablePrivateLinkFastPath);
        jsonWriter.writeJsonField("routingConfiguration", this.routingConfiguration);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ExpressRouteConnectionProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ExpressRouteConnectionProperties if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ExpressRouteConnectionProperties.
     */
    public static ExpressRouteConnectionProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ExpressRouteConnectionProperties deserializedExpressRouteConnectionProperties
                = new ExpressRouteConnectionProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("expressRouteCircuitPeering".equals(fieldName)) {
                    deserializedExpressRouteConnectionProperties.expressRouteCircuitPeering
                        = ExpressRouteCircuitPeeringId.fromJson(reader);
                } else if ("provisioningState".equals(fieldName)) {
                    deserializedExpressRouteConnectionProperties.provisioningState
                        = ProvisioningState.fromString(reader.getString());
                } else if ("authorizationKey".equals(fieldName)) {
                    deserializedExpressRouteConnectionProperties.authorizationKey = reader.getString();
                } else if ("routingWeight".equals(fieldName)) {
                    deserializedExpressRouteConnectionProperties.routingWeight = reader.getNullable(JsonReader::getInt);
                } else if ("enableInternetSecurity".equals(fieldName)) {
                    deserializedExpressRouteConnectionProperties.enableInternetSecurity
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("expressRouteGatewayBypass".equals(fieldName)) {
                    deserializedExpressRouteConnectionProperties.expressRouteGatewayBypass
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("enablePrivateLinkFastPath".equals(fieldName)) {
                    deserializedExpressRouteConnectionProperties.enablePrivateLinkFastPath
                        = reader.getNullable(JsonReader::getBoolean);
                } else if ("routingConfiguration".equals(fieldName)) {
                    deserializedExpressRouteConnectionProperties.routingConfiguration
                        = RoutingConfiguration.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedExpressRouteConnectionProperties;
        });
    }
}
