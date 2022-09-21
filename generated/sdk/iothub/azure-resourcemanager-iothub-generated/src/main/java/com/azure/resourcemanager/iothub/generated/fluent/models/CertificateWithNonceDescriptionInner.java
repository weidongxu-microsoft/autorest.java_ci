// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.iothub.generated.models.CertificatePropertiesWithNonce;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The X509 Certificate. */
@Fluent
public final class CertificateWithNonceDescriptionInner extends ProxyResource {
    /*
     * The description of an X509 CA Certificate including the challenge nonce issued for the Proof-Of-Possession flow.
     */
    @JsonProperty(value = "properties")
    private CertificatePropertiesWithNonce properties;

    /*
     * The entity tag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /** Creates an instance of CertificateWithNonceDescriptionInner class. */
    public CertificateWithNonceDescriptionInner() {
    }

    /**
     * Get the properties property: The description of an X509 CA Certificate including the challenge nonce issued for
     * the Proof-Of-Possession flow.
     *
     * @return the properties value.
     */
    public CertificatePropertiesWithNonce properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The description of an X509 CA Certificate including the challenge nonce issued for
     * the Proof-Of-Possession flow.
     *
     * @param properties the properties value to set.
     * @return the CertificateWithNonceDescriptionInner object itself.
     */
    public CertificateWithNonceDescriptionInner withProperties(CertificatePropertiesWithNonce properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the etag property: The entity tag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
