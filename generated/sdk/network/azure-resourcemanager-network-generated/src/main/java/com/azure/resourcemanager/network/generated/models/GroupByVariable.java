// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Define user session group by clause variables.
 */
@Fluent
public final class GroupByVariable {
    /*
     * User Session clause variable.
     */
    @JsonProperty(value = "variableName", required = true)
    private ApplicationGatewayFirewallUserSessionVariable variableName;

    /**
     * Creates an instance of GroupByVariable class.
     */
    public GroupByVariable() {
    }

    /**
     * Get the variableName property: User Session clause variable.
     * 
     * @return the variableName value.
     */
    public ApplicationGatewayFirewallUserSessionVariable variableName() {
        return this.variableName;
    }

    /**
     * Set the variableName property: User Session clause variable.
     * 
     * @param variableName the variableName value to set.
     * @return the GroupByVariable object itself.
     */
    public GroupByVariable withVariableName(ApplicationGatewayFirewallUserSessionVariable variableName) {
        this.variableName = variableName;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (variableName() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property variableName in model GroupByVariable"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GroupByVariable.class);
}
