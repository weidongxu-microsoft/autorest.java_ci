// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represent the secrets intended for encryption with asymmetric key pair.
 */
@Fluent
public final class AsymmetricEncryptedSecret {
    /*
     * The value of the secret.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * Thumbprint certificate used to encrypt \"Value\". If the value is unencrypted, it will be null.
     */
    @JsonProperty(value = "encryptionCertThumbprint")
    private String encryptionCertThumbprint;

    /*
     * The algorithm used to encrypt "Value".
     */
    @JsonProperty(value = "encryptionAlgorithm", required = true)
    private EncryptionAlgorithm encryptionAlgorithm;

    /**
     * Creates an instance of AsymmetricEncryptedSecret class.
     */
    public AsymmetricEncryptedSecret() {
    }

    /**
     * Get the value property: The value of the secret.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: The value of the secret.
     * 
     * @param value the value value to set.
     * @return the AsymmetricEncryptedSecret object itself.
     */
    public AsymmetricEncryptedSecret withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the encryptionCertThumbprint property: Thumbprint certificate used to encrypt \"Value\". If the value is
     * unencrypted, it will be null.
     * 
     * @return the encryptionCertThumbprint value.
     */
    public String encryptionCertThumbprint() {
        return this.encryptionCertThumbprint;
    }

    /**
     * Set the encryptionCertThumbprint property: Thumbprint certificate used to encrypt \"Value\". If the value is
     * unencrypted, it will be null.
     * 
     * @param encryptionCertThumbprint the encryptionCertThumbprint value to set.
     * @return the AsymmetricEncryptedSecret object itself.
     */
    public AsymmetricEncryptedSecret withEncryptionCertThumbprint(String encryptionCertThumbprint) {
        this.encryptionCertThumbprint = encryptionCertThumbprint;
        return this;
    }

    /**
     * Get the encryptionAlgorithm property: The algorithm used to encrypt "Value".
     * 
     * @return the encryptionAlgorithm value.
     */
    public EncryptionAlgorithm encryptionAlgorithm() {
        return this.encryptionAlgorithm;
    }

    /**
     * Set the encryptionAlgorithm property: The algorithm used to encrypt "Value".
     * 
     * @param encryptionAlgorithm the encryptionAlgorithm value to set.
     * @return the AsymmetricEncryptedSecret object itself.
     */
    public AsymmetricEncryptedSecret withEncryptionAlgorithm(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model AsymmetricEncryptedSecret"));
        }
        if (encryptionAlgorithm() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property encryptionAlgorithm in model AsymmetricEncryptedSecret"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AsymmetricEncryptedSecret.class);
}
