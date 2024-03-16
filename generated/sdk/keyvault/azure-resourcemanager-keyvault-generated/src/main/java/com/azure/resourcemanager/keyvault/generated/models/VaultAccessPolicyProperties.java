// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties of the vault access policy.
 */
@Fluent
public final class VaultAccessPolicyProperties {
    /*
     * An array of 0 to 16 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault's tenant ID.
     */
    @JsonProperty(value = "accessPolicies", required = true)
    private List<AccessPolicyEntry> accessPolicies;

    /**
     * Creates an instance of VaultAccessPolicyProperties class.
     */
    public VaultAccessPolicyProperties() {
    }

    /**
     * Get the accessPolicies property: An array of 0 to 16 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault's tenant ID.
     * 
     * @return the accessPolicies value.
     */
    public List<AccessPolicyEntry> accessPolicies() {
        return this.accessPolicies;
    }

    /**
     * Set the accessPolicies property: An array of 0 to 16 identities that have access to the key vault. All identities in the array must use the same tenant ID as the key vault's tenant ID.
     * 
     * @param accessPolicies the accessPolicies value to set.
     * @return the VaultAccessPolicyProperties object itself.
     */
    public VaultAccessPolicyProperties withAccessPolicies(List<AccessPolicyEntry> accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accessPolicies() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property accessPolicies in model VaultAccessPolicyProperties"));
        } else {
            accessPolicies().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VaultAccessPolicyProperties.class);
}
