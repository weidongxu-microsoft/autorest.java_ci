// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitPeeringId;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.RoutingConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ExpressRouteConnection resource. */
@Fluent
public final class ExpressRouteConnectionInner extends SubResource {
    /*
     * Properties of the express route connection.
     */
    @JsonProperty(value = "properties")
    private ExpressRouteConnectionProperties innerProperties;

    /*
     * The name of the resource.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /** Creates an instance of ExpressRouteConnectionInner class. */
    public ExpressRouteConnectionInner() {
    }

    /**
     * Get the innerProperties property: Properties of the express route connection.
     *
     * @return the innerProperties value.
     */
    private ExpressRouteConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource.
     *
     * @param name the name value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRouteConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route connection resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the expressRouteCircuitPeering property: The ExpressRoute circuit peering.
     *
     * @return the expressRouteCircuitPeering value.
     */
    public ExpressRouteCircuitPeeringId expressRouteCircuitPeering() {
        return this.innerProperties() == null ? null : this.innerProperties().expressRouteCircuitPeering();
    }

    /**
     * Set the expressRouteCircuitPeering property: The ExpressRoute circuit peering.
     *
     * @param expressRouteCircuitPeering the expressRouteCircuitPeering value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withExpressRouteCircuitPeering(
        ExpressRouteCircuitPeeringId expressRouteCircuitPeering) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteConnectionProperties();
        }
        this.innerProperties().withExpressRouteCircuitPeering(expressRouteCircuitPeering);
        return this;
    }

    /**
     * Get the authorizationKey property: Authorization key to establish the connection.
     *
     * @return the authorizationKey value.
     */
    public String authorizationKey() {
        return this.innerProperties() == null ? null : this.innerProperties().authorizationKey();
    }

    /**
     * Set the authorizationKey property: Authorization key to establish the connection.
     *
     * @param authorizationKey the authorizationKey value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withAuthorizationKey(String authorizationKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteConnectionProperties();
        }
        this.innerProperties().withAuthorizationKey(authorizationKey);
        return this;
    }

    /**
     * Get the routingWeight property: The routing weight associated to the connection.
     *
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.innerProperties() == null ? null : this.innerProperties().routingWeight();
    }

    /**
     * Set the routingWeight property: The routing weight associated to the connection.
     *
     * @param routingWeight the routingWeight value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withRoutingWeight(Integer routingWeight) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteConnectionProperties();
        }
        this.innerProperties().withRoutingWeight(routingWeight);
        return this;
    }

    /**
     * Get the enableInternetSecurity property: Enable internet security.
     *
     * @return the enableInternetSecurity value.
     */
    public Boolean enableInternetSecurity() {
        return this.innerProperties() == null ? null : this.innerProperties().enableInternetSecurity();
    }

    /**
     * Set the enableInternetSecurity property: Enable internet security.
     *
     * @param enableInternetSecurity the enableInternetSecurity value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withEnableInternetSecurity(Boolean enableInternetSecurity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteConnectionProperties();
        }
        this.innerProperties().withEnableInternetSecurity(enableInternetSecurity);
        return this;
    }

    /**
     * Get the expressRouteGatewayBypass property: Enable FastPath to vWan Firewall hub.
     *
     * @return the expressRouteGatewayBypass value.
     */
    public Boolean expressRouteGatewayBypass() {
        return this.innerProperties() == null ? null : this.innerProperties().expressRouteGatewayBypass();
    }

    /**
     * Set the expressRouteGatewayBypass property: Enable FastPath to vWan Firewall hub.
     *
     * @param expressRouteGatewayBypass the expressRouteGatewayBypass value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withExpressRouteGatewayBypass(Boolean expressRouteGatewayBypass) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteConnectionProperties();
        }
        this.innerProperties().withExpressRouteGatewayBypass(expressRouteGatewayBypass);
        return this;
    }

    /**
     * Get the enablePrivateLinkFastPath property: Bypass the ExpressRoute gateway when accessing private-links.
     * ExpressRoute FastPath (expressRouteGatewayBypass) must be enabled.
     *
     * @return the enablePrivateLinkFastPath value.
     */
    public Boolean enablePrivateLinkFastPath() {
        return this.innerProperties() == null ? null : this.innerProperties().enablePrivateLinkFastPath();
    }

    /**
     * Set the enablePrivateLinkFastPath property: Bypass the ExpressRoute gateway when accessing private-links.
     * ExpressRoute FastPath (expressRouteGatewayBypass) must be enabled.
     *
     * @param enablePrivateLinkFastPath the enablePrivateLinkFastPath value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withEnablePrivateLinkFastPath(Boolean enablePrivateLinkFastPath) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteConnectionProperties();
        }
        this.innerProperties().withEnablePrivateLinkFastPath(enablePrivateLinkFastPath);
        return this;
    }

    /**
     * Get the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @return the routingConfiguration value.
     */
    public RoutingConfiguration routingConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().routingConfiguration();
    }

    /**
     * Set the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     *
     * @param routingConfiguration the routingConfiguration value to set.
     * @return the ExpressRouteConnectionInner object itself.
     */
    public ExpressRouteConnectionInner withRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteConnectionProperties();
        }
        this.innerProperties().withRoutingConfiguration(routingConfiguration);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model ExpressRouteConnectionInner"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ExpressRouteConnectionInner.class);
}
