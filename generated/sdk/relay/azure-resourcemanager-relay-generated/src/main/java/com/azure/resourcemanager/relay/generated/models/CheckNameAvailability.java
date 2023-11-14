// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of the check name availability request properties.
 */
@Fluent
public final class CheckNameAvailability {
    /*
     * The namespace name to check for availability. The namespace name can contain only letters, numbers, and hyphens.
     * The namespace must start with a letter, and it must end with a letter or number.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Creates an instance of CheckNameAvailability class.
     */
    public CheckNameAvailability() {
    }

    /**
     * Get the name property: The namespace name to check for availability. The namespace name can contain only
     * letters, numbers, and hyphens. The namespace must start with a letter, and it must end with a letter or number.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The namespace name to check for availability. The namespace name can contain only
     * letters, numbers, and hyphens. The namespace must start with a letter, and it must end with a letter or number.
     * 
     * @param name the name value to set.
     * @return the CheckNameAvailability object itself.
     */
    public CheckNameAvailability withName(String name) {
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
                new IllegalArgumentException("Missing required property name in model CheckNameAvailability"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CheckNameAvailability.class);
}
