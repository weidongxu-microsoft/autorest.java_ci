// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The update cluster identity certificate request parameters. */
@Fluent
public final class UpdateClusterIdentityCertificateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpdateClusterIdentityCertificateParameters.class);

    /*
     * The application id.
     */
    @JsonProperty(value = "applicationId")
    private String applicationId;

    /*
     * The certificate in base64 encoded format.
     */
    @JsonProperty(value = "certificate")
    private String certificate;

    /*
     * The password of the certificate.
     */
    @JsonProperty(value = "certificatePassword")
    private String certificatePassword;

    /**
     * Get the applicationId property: The application id.
     *
     * @return the applicationId value.
     */
    public String applicationId() {
        return this.applicationId;
    }

    /**
     * Set the applicationId property: The application id.
     *
     * @param applicationId the applicationId value to set.
     * @return the UpdateClusterIdentityCertificateParameters object itself.
     */
    public UpdateClusterIdentityCertificateParameters withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get the certificate property: The certificate in base64 encoded format.
     *
     * @return the certificate value.
     */
    public String certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate property: The certificate in base64 encoded format.
     *
     * @param certificate the certificate value to set.
     * @return the UpdateClusterIdentityCertificateParameters object itself.
     */
    public UpdateClusterIdentityCertificateParameters withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * Get the certificatePassword property: The password of the certificate.
     *
     * @return the certificatePassword value.
     */
    public String certificatePassword() {
        return this.certificatePassword;
    }

    /**
     * Set the certificatePassword property: The password of the certificate.
     *
     * @param certificatePassword the certificatePassword value to set.
     * @return the UpdateClusterIdentityCertificateParameters object itself.
     */
    public UpdateClusterIdentityCertificateParameters withCertificatePassword(String certificatePassword) {
        this.certificatePassword = certificatePassword;
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
