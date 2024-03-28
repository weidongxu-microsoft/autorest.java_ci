// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.keyvault.generated.models.VaultAccessPolicyProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for updating the access policy in a vault.
 */
@Fluent
public final class VaultAccessPolicyParametersInner extends ProxyResource {
    /*
     * The resource type of the access policy.
     */
    @JsonProperty(value = "location", access = JsonProperty.Access.WRITE_ONLY)
    private String location;

    /*
     * Properties of the access policy
     */
    @JsonProperty(value = "properties", required = true)
    private VaultAccessPolicyProperties properties;

    /**
     * Creates an instance of VaultAccessPolicyParametersInner class.
     */
    public VaultAccessPolicyParametersInner() {
    }

    /**
     * Get the location property: The resource type of the access policy.
     * 
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Get the properties property: Properties of the access policy.
     * 
     * @return the properties value.
     */
    public VaultAccessPolicyProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the access policy.
     * 
     * @param properties the properties value to set.
     * @return the VaultAccessPolicyParametersInner object itself.
     */
    public VaultAccessPolicyParametersInner withProperties(VaultAccessPolicyProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property properties in model VaultAccessPolicyParametersInner"));
        } else {
            properties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VaultAccessPolicyParametersInner.class);
}
