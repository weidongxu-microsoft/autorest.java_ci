// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input for testing route. */
@Fluent
public final class TestRouteInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TestRouteInput.class);

    /*
     * Routing message
     */
    @JsonProperty(value = "message")
    private RoutingMessage message;

    /*
     * Route properties
     */
    @JsonProperty(value = "route", required = true)
    private RouteProperties route;

    /*
     * Routing Twin Reference
     */
    @JsonProperty(value = "twin")
    private RoutingTwin twin;

    /**
     * Get the message property: Routing message.
     *
     * @return the message value.
     */
    public RoutingMessage message() {
        return this.message;
    }

    /**
     * Set the message property: Routing message.
     *
     * @param message the message value to set.
     * @return the TestRouteInput object itself.
     */
    public TestRouteInput withMessage(RoutingMessage message) {
        this.message = message;
        return this;
    }

    /**
     * Get the route property: Route properties.
     *
     * @return the route value.
     */
    public RouteProperties route() {
        return this.route;
    }

    /**
     * Set the route property: Route properties.
     *
     * @param route the route value to set.
     * @return the TestRouteInput object itself.
     */
    public TestRouteInput withRoute(RouteProperties route) {
        this.route = route;
        return this;
    }

    /**
     * Get the twin property: Routing Twin Reference.
     *
     * @return the twin value.
     */
    public RoutingTwin twin() {
        return this.twin;
    }

    /**
     * Set the twin property: Routing Twin Reference.
     *
     * @param twin the twin value to set.
     * @return the TestRouteInput object itself.
     */
    public TestRouteInput withTwin(RoutingTwin twin) {
        this.twin = twin;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (message() != null) {
            message().validate();
        }
        if (route() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property route in model TestRouteInput"));
        } else {
            route().validate();
        }
        if (twin() != null) {
            twin().validate();
        }
    }
}
