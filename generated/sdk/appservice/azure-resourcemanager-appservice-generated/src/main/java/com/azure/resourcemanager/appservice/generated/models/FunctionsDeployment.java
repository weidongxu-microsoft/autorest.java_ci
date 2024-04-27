// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration section for the function app deployment.
 */
@Fluent
public final class FunctionsDeployment {
    /*
     * Storage for deployed package used by the function app.
     */
    @JsonProperty(value = "storage")
    private FunctionsDeploymentStorage storage;

    /**
     * Creates an instance of FunctionsDeployment class.
     */
    public FunctionsDeployment() {
    }

    /**
     * Get the storage property: Storage for deployed package used by the function app.
     * 
     * @return the storage value.
     */
    public FunctionsDeploymentStorage storage() {
        return this.storage;
    }

    /**
     * Set the storage property: Storage for deployed package used by the function app.
     * 
     * @param storage the storage value to set.
     * @return the FunctionsDeployment object itself.
     */
    public FunctionsDeployment withStorage(FunctionsDeploymentStorage storage) {
        this.storage = storage;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storage() != null) {
            storage().validate();
        }
    }
}