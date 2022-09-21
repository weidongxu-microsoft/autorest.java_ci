// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.frontdoor.generated.models.KeyVaultCertificateSourceParametersVault;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters required for bring-your-own-certification via Key Vault. */
@Fluent
public final class KeyVaultCertificateSourceParameters {
    /*
     * The Key Vault containing the SSL certificate
     */
    @JsonProperty(value = "vault")
    private KeyVaultCertificateSourceParametersVault vault;

    /*
     * The name of the Key Vault secret representing the full certificate PFX
     */
    @JsonProperty(value = "secretName")
    private String secretName;

    /*
     * The version of the Key Vault secret representing the full certificate PFX
     */
    @JsonProperty(value = "secretVersion")
    private String secretVersion;

    /** Creates an instance of KeyVaultCertificateSourceParameters class. */
    public KeyVaultCertificateSourceParameters() {
    }

    /**
     * Get the vault property: The Key Vault containing the SSL certificate.
     *
     * @return the vault value.
     */
    public KeyVaultCertificateSourceParametersVault vault() {
        return this.vault;
    }

    /**
     * Set the vault property: The Key Vault containing the SSL certificate.
     *
     * @param vault the vault value to set.
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withVault(KeyVaultCertificateSourceParametersVault vault) {
        this.vault = vault;
        return this;
    }

    /**
     * Get the secretName property: The name of the Key Vault secret representing the full certificate PFX.
     *
     * @return the secretName value.
     */
    public String secretName() {
        return this.secretName;
    }

    /**
     * Set the secretName property: The name of the Key Vault secret representing the full certificate PFX.
     *
     * @param secretName the secretName value to set.
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withSecretName(String secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the secretVersion property: The version of the Key Vault secret representing the full certificate PFX.
     *
     * @return the secretVersion value.
     */
    public String secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the secretVersion property: The version of the Key Vault secret representing the full certificate PFX.
     *
     * @param secretVersion the secretVersion value to set.
     * @return the KeyVaultCertificateSourceParameters object itself.
     */
    public KeyVaultCertificateSourceParameters withSecretVersion(String secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vault() != null) {
            vault().validate();
        }
    }
}
