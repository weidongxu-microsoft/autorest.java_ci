// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input values.
 */
@Fluent
public final class OperationInputs {
    /*
     * The name of the IoT hub to check.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Creates an instance of OperationInputs class.
     */
    public OperationInputs() {
    }

    /**
     * Get the name property: The name of the IoT hub to check.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the IoT hub to check.
     * 
     * @param name the name value to set.
     * @return the OperationInputs object itself.
     */
    public OperationInputs withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property name in model OperationInputs"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(OperationInputs.class);
}
