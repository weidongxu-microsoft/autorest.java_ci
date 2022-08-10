// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** This property store root certificate related information. */
@Fluent
public final class RootCertificateProperties {
    /*
     * This property when set to true, hub will use G2 cert; while it's set to false, hub uses Baltimore Cert.
     */
    @JsonProperty(value = "enableRootCertificateV2")
    private Boolean enableRootCertificateV2;

    /*
     * the last update time to root certificate flag.
     */
    @JsonProperty(value = "lastUpdatedTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedTimeUtc;

    /**
     * Get the enableRootCertificateV2 property: This property when set to true, hub will use G2 cert; while it's set to
     * false, hub uses Baltimore Cert.
     *
     * @return the enableRootCertificateV2 value.
     */
    public Boolean enableRootCertificateV2() {
        return this.enableRootCertificateV2;
    }

    /**
     * Set the enableRootCertificateV2 property: This property when set to true, hub will use G2 cert; while it's set to
     * false, hub uses Baltimore Cert.
     *
     * @param enableRootCertificateV2 the enableRootCertificateV2 value to set.
     * @return the RootCertificateProperties object itself.
     */
    public RootCertificateProperties withEnableRootCertificateV2(Boolean enableRootCertificateV2) {
        this.enableRootCertificateV2 = enableRootCertificateV2;
        return this;
    }

    /**
     * Get the lastUpdatedTimeUtc property: the last update time to root certificate flag.
     *
     * @return the lastUpdatedTimeUtc value.
     */
    public OffsetDateTime lastUpdatedTimeUtc() {
        return this.lastUpdatedTimeUtc;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}