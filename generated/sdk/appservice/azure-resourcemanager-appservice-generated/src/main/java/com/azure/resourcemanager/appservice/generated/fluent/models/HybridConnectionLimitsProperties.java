// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HybridConnectionLimits resource specific properties. */
@Immutable
public final class HybridConnectionLimitsProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HybridConnectionLimitsProperties.class);

    /*
     * The current number of Hybrid Connections.
     */
    @JsonProperty(value = "current", access = JsonProperty.Access.WRITE_ONLY)
    private Integer current;

    /*
     * The maximum number of Hybrid Connections allowed.
     */
    @JsonProperty(value = "maximum", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maximum;

    /**
     * Get the current property: The current number of Hybrid Connections.
     *
     * @return the current value.
     */
    public Integer current() {
        return this.current;
    }

    /**
     * Get the maximum property: The maximum number of Hybrid Connections allowed.
     *
     * @return the maximum value.
     */
    public Integer maximum() {
        return this.maximum;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
