// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Specifies a certificate for token validation.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.ContentKeyPolicyX509CertificateTokenKey")
@Fluent
public final class ContentKeyPolicyX509CertificateTokenKey extends ContentKeyPolicyRestrictionTokenKey {
    /*
     * The raw data field of a certificate in PKCS 12 format (X509Certificate2 in .NET)
     */
    @JsonProperty(value = "rawBody", required = true)
    private byte[] rawBody;

    /**
     * Creates an instance of ContentKeyPolicyX509CertificateTokenKey class.
     */
    public ContentKeyPolicyX509CertificateTokenKey() {
    }

    /**
     * Get the rawBody property: The raw data field of a certificate in PKCS 12 format (X509Certificate2 in .NET).
     * 
     * @return the rawBody value.
     */
    public byte[] rawBody() {
        return CoreUtils.clone(this.rawBody);
    }

    /**
     * Set the rawBody property: The raw data field of a certificate in PKCS 12 format (X509Certificate2 in .NET).
     * 
     * @param rawBody the rawBody value to set.
     * @return the ContentKeyPolicyX509CertificateTokenKey object itself.
     */
    public ContentKeyPolicyX509CertificateTokenKey withRawBody(byte[] rawBody) {
        this.rawBody = CoreUtils.clone(rawBody);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (rawBody() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property rawBody in model ContentKeyPolicyX509CertificateTokenKey"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContentKeyPolicyX509CertificateTokenKey.class);
}
