// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a tenant ID that is trusted by the cluster.
 */
@Fluent
public final class TrustedExternalTenant {
    /*
     * GUID representing an external tenant.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Creates an instance of TrustedExternalTenant class.
     */
    public TrustedExternalTenant() {
    }

    /**
     * Get the value property: GUID representing an external tenant.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: GUID representing an external tenant.
     * 
     * @param value the value value to set.
     * @return the TrustedExternalTenant object itself.
     */
    public TrustedExternalTenant withValue(String value) {
        this.value = value;
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
