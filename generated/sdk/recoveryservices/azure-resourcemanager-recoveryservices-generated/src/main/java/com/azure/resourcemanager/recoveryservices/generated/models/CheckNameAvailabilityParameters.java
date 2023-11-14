// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Resource Name availability input parameters - Resource type and resource name.
 */
@Fluent
public final class CheckNameAvailabilityParameters {
    /*
     * Describes the Resource type: Microsoft.RecoveryServices/Vaults
     */
    @JsonProperty(value = "type")
    private String type;

    /*
     * Resource name for which availability needs to be checked
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Creates an instance of CheckNameAvailabilityParameters class.
     */
    public CheckNameAvailabilityParameters() {
    }

    /**
     * Get the type property: Describes the Resource type: Microsoft.RecoveryServices/Vaults.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: Describes the Resource type: Microsoft.RecoveryServices/Vaults.
     * 
     * @param type the type value to set.
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name property: Resource name for which availability needs to be checked.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Resource name for which availability needs to be checked.
     * 
     * @param name the name value to set.
     * @return the CheckNameAvailabilityParameters object itself.
     */
    public CheckNameAvailabilityParameters withName(String name) {
        this.name = name;
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
