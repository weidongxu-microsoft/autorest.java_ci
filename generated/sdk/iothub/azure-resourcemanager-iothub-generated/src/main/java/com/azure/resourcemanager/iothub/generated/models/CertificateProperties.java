// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * The description of an X509 CA Certificate.
 */
@Fluent
public final class CertificateProperties {
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
    @JsonProperty(value = "isVerified")
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
     * The certificate content
     */
    @JsonProperty(value = "certificate")
    private String certificate;

    /**
     * Creates an instance of CertificateProperties class.
     */
    public CertificateProperties() {
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
     * Set the isVerified property: Determines whether certificate has been verified.
     * 
     * @param isVerified the isVerified value to set.
     * @return the CertificateProperties object itself.
     */
    public CertificateProperties withIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
        return this;
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
     * Get the certificate property: The certificate content.
     * 
     * @return the certificate value.
     */
    public String certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate property: The certificate content.
     * 
     * @param certificate the certificate value to set.
     * @return the CertificateProperties object itself.
     */
    public CertificateProperties withCertificate(String certificate) {
        this.certificate = certificate;
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
