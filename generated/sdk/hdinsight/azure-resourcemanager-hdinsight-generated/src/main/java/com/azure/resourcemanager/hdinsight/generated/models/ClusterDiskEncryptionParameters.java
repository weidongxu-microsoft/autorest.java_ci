// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Disk Encryption Cluster request parameters. */
@Fluent
public final class ClusterDiskEncryptionParameters {
    /*
     * Base key vault URI where the customers key is located eg.
     * https://myvault.vault.azure.net
     */
    @JsonProperty(value = "vaultUri")
    private String vaultUri;

    /*
     * Key name that is used for enabling disk encryption.
     */
    @JsonProperty(value = "keyName")
    private String keyName;

    /*
     * Specific key version that is used for enabling disk encryption.
     */
    @JsonProperty(value = "keyVersion")
    private String keyVersion;

    /**
     * Get the vaultUri property: Base key vault URI where the customers key is located eg.
     * https://myvault.vault.azure.net.
     *
     * @return the vaultUri value.
     */
    public String vaultUri() {
        return this.vaultUri;
    }

    /**
     * Set the vaultUri property: Base key vault URI where the customers key is located eg.
     * https://myvault.vault.azure.net.
     *
     * @param vaultUri the vaultUri value to set.
     * @return the ClusterDiskEncryptionParameters object itself.
     */
    public ClusterDiskEncryptionParameters withVaultUri(String vaultUri) {
        this.vaultUri = vaultUri;
        return this;
    }

    /**
     * Get the keyName property: Key name that is used for enabling disk encryption.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: Key name that is used for enabling disk encryption.
     *
     * @param keyName the keyName value to set.
     * @return the ClusterDiskEncryptionParameters object itself.
     */
    public ClusterDiskEncryptionParameters withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVersion property: Specific key version that is used for enabling disk encryption.
     *
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: Specific key version that is used for enabling disk encryption.
     *
     * @param keyVersion the keyVersion value to set.
     * @return the ClusterDiskEncryptionParameters object itself.
     */
    public ClusterDiskEncryptionParameters withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
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
