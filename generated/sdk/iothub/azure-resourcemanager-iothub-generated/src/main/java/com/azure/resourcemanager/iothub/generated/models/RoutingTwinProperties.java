// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The RoutingTwinProperties model. */
@Fluent
public final class RoutingTwinProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RoutingTwinProperties.class);

    /*
     * Twin desired properties
     */
    @JsonProperty(value = "desired")
    private Object desired;

    /*
     * Twin desired properties
     */
    @JsonProperty(value = "reported")
    private Object reported;

    /**
     * Get the desired property: Twin desired properties.
     *
     * @return the desired value.
     */
    public Object desired() {
        return this.desired;
    }

    /**
     * Set the desired property: Twin desired properties.
     *
     * @param desired the desired value to set.
     * @return the RoutingTwinProperties object itself.
     */
    public RoutingTwinProperties withDesired(Object desired) {
        this.desired = desired;
        return this;
    }

    /**
     * Get the reported property: Twin desired properties.
     *
     * @return the reported value.
     */
    public Object reported() {
        return this.reported;
    }

    /**
     * Set the reported property: Twin desired properties.
     *
     * @param reported the reported value to set.
     * @return the RoutingTwinProperties object itself.
     */
    public RoutingTwinProperties withReported(Object reported) {
        this.reported = reported;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
