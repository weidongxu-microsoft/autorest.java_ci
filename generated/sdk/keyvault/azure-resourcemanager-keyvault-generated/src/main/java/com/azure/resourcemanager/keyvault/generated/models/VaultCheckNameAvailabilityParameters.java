// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters used to check the availability of the vault name.
 */
@Fluent
public final class VaultCheckNameAvailabilityParameters {
    /*
     * The vault name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The type of resource, Microsoft.KeyVault/vaults
     */
    @JsonProperty(value = "type", required = true)
    private String type = "Microsoft.KeyVault/vaults";

    /**
     * Creates an instance of VaultCheckNameAvailabilityParameters class.
     */
    public VaultCheckNameAvailabilityParameters() {
    }

    /**
     * Get the name property: The vault name.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The vault name.
     * 
     * @param name the name value to set.
     * @return the VaultCheckNameAvailabilityParameters object itself.
     */
    public VaultCheckNameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The type of resource, Microsoft.KeyVault/vaults.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The type of resource, Microsoft.KeyVault/vaults.
     * 
     * @param type the type value to set.
     * @return the VaultCheckNameAvailabilityParameters object itself.
     */
    public VaultCheckNameAvailabilityParameters withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model VaultCheckNameAvailabilityParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VaultCheckNameAvailabilityParameters.class);
}
