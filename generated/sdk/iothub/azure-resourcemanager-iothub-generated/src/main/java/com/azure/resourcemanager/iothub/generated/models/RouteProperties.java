// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The properties of a routing rule that your IoT hub uses to route messages to endpoints.
 */
@Fluent
public final class RouteProperties {
    /*
     * The name of the route. The name can only include alphanumeric characters, periods, underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The source that the routing rule is to be applied to, such as DeviceMessages.
     */
    @JsonProperty(value = "source", required = true)
    private RoutingSource source;

    /*
     * The condition that is evaluated to apply the routing rule. If no condition is provided, it evaluates to true by default. For grammar, see: https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language
     */
    @JsonProperty(value = "condition")
    private String condition;

    /*
     * The list of endpoints to which messages that satisfy the condition are routed. Currently only one endpoint is allowed.
     */
    @JsonProperty(value = "endpointNames", required = true)
    private List<String> endpointNames;

    /*
     * Used to specify whether a route is enabled.
     */
    @JsonProperty(value = "isEnabled", required = true)
    private boolean isEnabled;

    /**
     * Creates an instance of RouteProperties class.
     */
    public RouteProperties() {
    }

    /**
     * Get the name property: The name of the route. The name can only include alphanumeric characters, periods,
     * underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the route. The name can only include alphanumeric characters, periods,
     * underscores, hyphens, has a maximum length of 64 characters, and must be unique.
     * 
     * @param name the name value to set.
     * @return the RouteProperties object itself.
     */
    public RouteProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the source property: The source that the routing rule is to be applied to, such as DeviceMessages.
     * 
     * @return the source value.
     */
    public RoutingSource source() {
        return this.source;
    }

    /**
     * Set the source property: The source that the routing rule is to be applied to, such as DeviceMessages.
     * 
     * @param source the source value to set.
     * @return the RouteProperties object itself.
     */
    public RouteProperties withSource(RoutingSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the condition property: The condition that is evaluated to apply the routing rule. If no condition is
     * provided, it evaluates to true by default. For grammar, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language.
     * 
     * @return the condition value.
     */
    public String condition() {
        return this.condition;
    }

    /**
     * Set the condition property: The condition that is evaluated to apply the routing rule. If no condition is
     * provided, it evaluates to true by default. For grammar, see:
     * https://docs.microsoft.com/azure/iot-hub/iot-hub-devguide-query-language.
     * 
     * @param condition the condition value to set.
     * @return the RouteProperties object itself.
     */
    public RouteProperties withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * Get the endpointNames property: The list of endpoints to which messages that satisfy the condition are routed.
     * Currently only one endpoint is allowed.
     * 
     * @return the endpointNames value.
     */
    public List<String> endpointNames() {
        return this.endpointNames;
    }

    /**
     * Set the endpointNames property: The list of endpoints to which messages that satisfy the condition are routed.
     * Currently only one endpoint is allowed.
     * 
     * @param endpointNames the endpointNames value to set.
     * @return the RouteProperties object itself.
     */
    public RouteProperties withEndpointNames(List<String> endpointNames) {
        this.endpointNames = endpointNames;
        return this;
    }

    /**
     * Get the isEnabled property: Used to specify whether a route is enabled.
     * 
     * @return the isEnabled value.
     */
    public boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Used to specify whether a route is enabled.
     * 
     * @param isEnabled the isEnabled value to set.
     * @return the RouteProperties object itself.
     */
    public RouteProperties withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property name in model RouteProperties"));
        }
        if (source() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property source in model RouteProperties"));
        }
        if (endpointNames() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property endpointNames in model RouteProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(RouteProperties.class);
}
