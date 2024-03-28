// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the variables available to group the rate limit requests.
 */
@Fluent
public final class GroupByVariable {
    /*
     * Describes the supported variable for group by
     */
    @JsonProperty(value = "variableName", required = true)
    private VariableName variableName;

    /**
     * Creates an instance of GroupByVariable class.
     */
    public GroupByVariable() {
    }

    /**
     * Get the variableName property: Describes the supported variable for group by.
     * 
     * @return the variableName value.
     */
    public VariableName variableName() {
        return this.variableName;
    }

    /**
     * Set the variableName property: Describes the supported variable for group by.
     * 
     * @param variableName the variableName value to set.
     * @return the GroupByVariable object itself.
     */
    public GroupByVariable withVariableName(VariableName variableName) {
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
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property variableName in model GroupByVariable"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GroupByVariable.class);
}
