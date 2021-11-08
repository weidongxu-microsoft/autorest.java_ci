// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of the key vault. */
@Fluent
public final class KeyVaultProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(KeyVaultProperties.class);

    /*
     * The name of the key vault key.
     */
    @JsonProperty(value = "keyName")
    private String keyName;

    /*
     * The version of the key vault key.
     */
    @JsonProperty(value = "keyVersion")
    private String keyVersion;

    /*
     * The Uri of the key vault.
     */
    @JsonProperty(value = "keyVaultUri")
    private String keyVaultUri;

    /*
     * The user assigned identity (ARM resource id) that has access to the key.
     */
    @JsonProperty(value = "userIdentity")
    private String userIdentity;

    /**
     * Get the keyName property: The name of the key vault key.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The name of the key vault key.
     *
     * @param keyName the keyName value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Get the keyVersion property: The version of the key vault key.
     *
     * @return the keyVersion value.
     */
    public String keyVersion() {
        return this.keyVersion;
    }

    /**
     * Set the keyVersion property: The version of the key vault key.
     *
     * @param keyVersion the keyVersion value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVersion(String keyVersion) {
        this.keyVersion = keyVersion;
        return this;
    }

    /**
     * Get the keyVaultUri property: The Uri of the key vault.
     *
     * @return the keyVaultUri value.
     */
    public String keyVaultUri() {
        return this.keyVaultUri;
    }

    /**
     * Set the keyVaultUri property: The Uri of the key vault.
     *
     * @param keyVaultUri the keyVaultUri value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withKeyVaultUri(String keyVaultUri) {
        this.keyVaultUri = keyVaultUri;
        return this;
    }

    /**
     * Get the userIdentity property: The user assigned identity (ARM resource id) that has access to the key.
     *
     * @return the userIdentity value.
     */
    public String userIdentity() {
        return this.userIdentity;
    }

    /**
     * Set the userIdentity property: The user assigned identity (ARM resource id) that has access to the key.
     *
     * @param userIdentity the userIdentity value to set.
     * @return the KeyVaultProperties object itself.
     */
    public KeyVaultProperties withUserIdentity(String userIdentity) {
        this.userIdentity = userIdentity;
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
