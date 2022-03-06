// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Used in activation key generation flow. */
@Fluent
public final class GenerateCertResponseInner {
    /*
     * Gets or sets base64 encoded certificate raw data,
     * this is the public part needed to be uploaded to cert vault
     */
    @JsonProperty(value = "publicKey")
    private String publicKey;

    /*
     * Gets or sets base64 encoded private part of the certificate,
     * needed to form the activation key
     */
    @JsonProperty(value = "privateKey")
    private String privateKey;

    /*
     * Gets or sets expiry time in UTC
     */
    @JsonProperty(value = "expiryTimeInUTC")
    private String expiryTimeInUtc;

    /**
     * Get the publicKey property: Gets or sets base64 encoded certificate raw data, this is the public part needed to
     * be uploaded to cert vault.
     *
     * @return the publicKey value.
     */
    public String publicKey() {
        return this.publicKey;
    }

    /**
     * Set the publicKey property: Gets or sets base64 encoded certificate raw data, this is the public part needed to
     * be uploaded to cert vault.
     *
     * @param publicKey the publicKey value to set.
     * @return the GenerateCertResponseInner object itself.
     */
    public GenerateCertResponseInner withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Get the privateKey property: Gets or sets base64 encoded private part of the certificate, needed to form the
     * activation key.
     *
     * @return the privateKey value.
     */
    public String privateKey() {
        return this.privateKey;
    }

    /**
     * Set the privateKey property: Gets or sets base64 encoded private part of the certificate, needed to form the
     * activation key.
     *
     * @param privateKey the privateKey value to set.
     * @return the GenerateCertResponseInner object itself.
     */
    public GenerateCertResponseInner withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Get the expiryTimeInUtc property: Gets or sets expiry time in UTC.
     *
     * @return the expiryTimeInUtc value.
     */
    public String expiryTimeInUtc() {
        return this.expiryTimeInUtc;
    }

    /**
     * Set the expiryTimeInUtc property: Gets or sets expiry time in UTC.
     *
     * @param expiryTimeInUtc the expiryTimeInUtc value to set.
     * @return the GenerateCertResponseInner object itself.
     */
    public GenerateCertResponseInner withExpiryTimeInUtc(String expiryTimeInUtc) {
        this.expiryTimeInUtc = expiryTimeInUtc;
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
