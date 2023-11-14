// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of the Key Vault which hosts CMK.
 */
@Fluent
public final class CmkKeyVaultProperties {
    /*
     * The key uri of the Customer Managed Key
     */
    @JsonProperty(value = "keyUri")
    private String keyUri;

    /**
     * Creates an instance of CmkKeyVaultProperties class.
     */
    public CmkKeyVaultProperties() {
    }

    /**
     * Get the keyUri property: The key uri of the Customer Managed Key.
     * 
     * @return the keyUri value.
     */
    public String keyUri() {
        return this.keyUri;
    }

    /**
     * Set the keyUri property: The key uri of the Customer Managed Key.
     * 
     * @param keyUri the keyUri value to set.
     * @return the CmkKeyVaultProperties object itself.
     */
    public CmkKeyVaultProperties withKeyUri(String keyUri) {
        this.keyUri = keyUri;
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
