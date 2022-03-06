// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings that apply to all backend pools. */
@Fluent
public final class BackendPoolsSettings {
    /*
     * Whether to enforce certificate name check on HTTPS requests to all
     * backend pools. No effect on non-HTTPS requests.
     */
    @JsonProperty(value = "enforceCertificateNameCheck")
    private EnforceCertificateNameCheckEnabledState enforceCertificateNameCheck;

    /*
     * Send and receive timeout on forwarding request to the backend. When
     * timeout is reached, the request fails and returns.
     */
    @JsonProperty(value = "sendRecvTimeoutSeconds")
    private Integer sendRecvTimeoutSeconds;

    /**
     * Get the enforceCertificateNameCheck property: Whether to enforce certificate name check on HTTPS requests to all
     * backend pools. No effect on non-HTTPS requests.
     *
     * @return the enforceCertificateNameCheck value.
     */
    public EnforceCertificateNameCheckEnabledState enforceCertificateNameCheck() {
        return this.enforceCertificateNameCheck;
    }

    /**
     * Set the enforceCertificateNameCheck property: Whether to enforce certificate name check on HTTPS requests to all
     * backend pools. No effect on non-HTTPS requests.
     *
     * @param enforceCertificateNameCheck the enforceCertificateNameCheck value to set.
     * @return the BackendPoolsSettings object itself.
     */
    public BackendPoolsSettings withEnforceCertificateNameCheck(
        EnforceCertificateNameCheckEnabledState enforceCertificateNameCheck) {
        this.enforceCertificateNameCheck = enforceCertificateNameCheck;
        return this;
    }

    /**
     * Get the sendRecvTimeoutSeconds property: Send and receive timeout on forwarding request to the backend. When
     * timeout is reached, the request fails and returns.
     *
     * @return the sendRecvTimeoutSeconds value.
     */
    public Integer sendRecvTimeoutSeconds() {
        return this.sendRecvTimeoutSeconds;
    }

    /**
     * Set the sendRecvTimeoutSeconds property: Send and receive timeout on forwarding request to the backend. When
     * timeout is reached, the request fails and returns.
     *
     * @param sendRecvTimeoutSeconds the sendRecvTimeoutSeconds value to set.
     * @return the BackendPoolsSettings object itself.
     */
    public BackendPoolsSettings withSendRecvTimeoutSeconds(Integer sendRecvTimeoutSeconds) {
        this.sendRecvTimeoutSeconds = sendRecvTimeoutSeconds;
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
