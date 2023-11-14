// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A rule governing the accessibility of a managed HSM pool from a specific IP address or IP range.
 */
@Fluent
public final class MhsmipRule {
    /*
     * An IPv4 address range in CIDR notation, such as '124.56.78.91' (simple IP address) or '124.56.78.0/24' (all
     * addresses that start with 124.56.78).
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * Creates an instance of MhsmipRule class.
     */
    public MhsmipRule() {
    }

    /**
     * Get the value property: An IPv4 address range in CIDR notation, such as '124.56.78.91' (simple IP address) or
     * '124.56.78.0/24' (all addresses that start with 124.56.78).
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: An IPv4 address range in CIDR notation, such as '124.56.78.91' (simple IP address) or
     * '124.56.78.0/24' (all addresses that start with 124.56.78).
     * 
     * @param value the value value to set.
     * @return the MhsmipRule object itself.
     */
    public MhsmipRule withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model MhsmipRule"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MhsmipRule.class);
}
