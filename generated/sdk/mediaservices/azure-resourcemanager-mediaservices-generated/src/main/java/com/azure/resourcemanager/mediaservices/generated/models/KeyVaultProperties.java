// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The KeyVaultProperties model. */
@Fluent
public final class KeyVaultProperties {
    /*
     * The URL of the Key Vault key used to encrypt the account. The key may
     * either be versioned (for example https://vault/keys/mykey/version1) or
     * reference a key without a version (for example
     * https://vault/keys/mykey).
     */
    @JsonProperty(value = "keyIdentifier")
    private String keyIdentifier;

    /*
     * The current key used to encrypt the Media Services account, including
     * the key version.
     */
    @JsonProperty(value = "currentKeyIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String currentKeyIdentifier;

    /**
     * Get the keyIdentifier property: The URL of the Key Vault key used to encrypt the account. The key may either be
     * versioned (for example https://vault/keys/mykey/version1) or reference a key without a version (for example
     * https://vault/keys/mykey).
     *
     * @return the keyIdentifier value.
     */
    public String keyIdentifier() {
        return this.keyIdentifier;
    }

    /**
     * Set the keyIdentifier property: The URL of the Key Vault key used to encrypt the account. The key may either be
     * versioned (for example https://vault/keys/mykey/version1) or reference a key without a version (for example
     * https://vault/keys/mykey).
     *
     * @param keyIdentifier the keyIdentifier value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyIdentifier(String keyIdentifier) {
        this.keyIdentifier = keyIdentifier;
        return this;
    }

    /**
     * Get the currentKeyIdentifier property: The current key used to encrypt the Media Services account, including the
     * key version.
     *
     * @return the currentKeyIdentifier value.
     */
    public String currentKeyIdentifier() {
        return this.currentKeyIdentifier;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
