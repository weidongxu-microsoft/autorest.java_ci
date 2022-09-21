// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The description of an X509 CA Certificate including the challenge nonce issued for the Proof-Of-Possession flow. */
@Immutable
public final class CertificatePropertiesWithNonce {
    /*
     * The certificate's subject name.
     */
    @JsonProperty(value = "subject", access = JsonProperty.Access.WRITE_ONLY)
    private String subject;

    /*
     * The certificate's expiration date and time.
     */
    @JsonProperty(value = "expiry", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 expiry;

    /*
     * The certificate's thumbprint.
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /*
     * Determines whether certificate has been verified.
     */
    @JsonProperty(value = "isVerified", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isVerified;

    /*
     * The certificate's create date and time.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 created;

    /*
     * The certificate's last update date and time.
     */
    @JsonProperty(value = "updated", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 updated;

    /*
     * The certificate's verification code that will be used for proof of possession.
     */
    @JsonProperty(value = "verificationCode", access = JsonProperty.Access.WRITE_ONLY)
    private String verificationCode;

    /*
     * The certificate content
     */
    @JsonProperty(value = "certificate", access = JsonProperty.Access.WRITE_ONLY)
    private String certificate;

    /** Creates an instance of CertificatePropertiesWithNonce class. */
    public CertificatePropertiesWithNonce() {
    }

    /**
     * Get the subject property: The certificate's subject name.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Get the expiry property: The certificate's expiration date and time.
     *
     * @return the expiry value.
     */
    public OffsetDateTime expiry() {
        if (this.expiry == null) {
            return null;
        }
        return this.expiry.getDateTime();
    }

    /**
     * Get the thumbprint property: The certificate's thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the isVerified property: Determines whether certificate has been verified.
     *
     * @return the isVerified value.
     */
    public Boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Get the created property: The certificate's create date and time.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        if (this.created == null) {
            return null;
        }
        return this.created.getDateTime();
    }

    /**
     * Get the updated property: The certificate's last update date and time.
     *
     * @return the updated value.
     */
    public OffsetDateTime updated() {
        if (this.updated == null) {
            return null;
        }
        return this.updated.getDateTime();
    }

    /**
     * Get the verificationCode property: The certificate's verification code that will be used for proof of possession.
     *
     * @return the verificationCode value.
     */
    public String verificationCode() {
        return this.verificationCode;
    }

    /**
     * Get the certificate property: The certificate content.
     *
     * @return the certificate value.
     */
    public String certificate() {
        return this.certificate;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
