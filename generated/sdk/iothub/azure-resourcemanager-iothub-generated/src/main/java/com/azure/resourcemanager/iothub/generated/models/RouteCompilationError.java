// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Compilation error when evaluating route. */
@Fluent
public final class RouteCompilationError {
    /*
     * Route error message
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Severity of the route error
     */
    @JsonProperty(value = "severity")
    private RouteErrorSeverity severity;

    /*
     * Location where the route error happened
     */
    @JsonProperty(value = "location")
    private RouteErrorRange location;

    /**
     * Get the message property: Route error message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Route error message.
     *
     * @param message the message value to set.
     * @return the RouteCompilationError object itself.
     */
    public RouteCompilationError withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the severity property: Severity of the route error.
     *
     * @return the severity value.
     */
    public RouteErrorSeverity severity() {
        return this.severity;
    }

    /**
     * Set the severity property: Severity of the route error.
     *
     * @param severity the severity value to set.
     * @return the RouteCompilationError object itself.
     */
    public RouteCompilationError withSeverity(RouteErrorSeverity severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get the location property: Location where the route error happened.
     *
     * @return the location value.
     */
    public RouteErrorRange location() {
        return this.location;
    }

    /**
     * Set the location property: Location where the route error happened.
     *
     * @param location the location value to set.
     * @return the RouteCompilationError object itself.
     */
    public RouteCompilationError withLocation(RouteErrorRange location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() != null) {
            location().validate();
        }
    }
}
