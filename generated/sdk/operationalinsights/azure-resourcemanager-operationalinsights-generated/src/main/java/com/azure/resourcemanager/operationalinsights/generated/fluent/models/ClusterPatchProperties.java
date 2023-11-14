// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.operationalinsights.generated.models.BillingType;
import com.azure.resourcemanager.operationalinsights.generated.models.KeyVaultProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Log Analytics cluster patch properties.
 */
@Fluent
public final class ClusterPatchProperties {
    /*
     * The associated key properties.
     */
    @JsonProperty(value = "keyVaultProperties")
    private KeyVaultProperties keyVaultProperties;

    /*
     * The cluster's billing type.
     */
    @JsonProperty(value = "billingType")
    private BillingType billingType;

    /**
     * Creates an instance of ClusterPatchProperties class.
     */
    public ClusterPatchProperties() {
    }

    /**
     * Get the keyVaultProperties property: The associated key properties.
     * 
     * @return the keyVaultProperties value.
     */
    public KeyVaultProperties keyVaultProperties() {
        return this.keyVaultProperties;
    }

    /**
     * Set the keyVaultProperties property: The associated key properties.
     * 
     * @param keyVaultProperties the keyVaultProperties value to set.
     * @return the ClusterPatchProperties object itself.
     */
    public ClusterPatchProperties withKeyVaultProperties(KeyVaultProperties keyVaultProperties) {
        this.keyVaultProperties = keyVaultProperties;
        return this;
    }

    /**
     * Get the billingType property: The cluster's billing type.
     * 
     * @return the billingType value.
     */
    public BillingType billingType() {
        return this.billingType;
    }

    /**
     * Set the billingType property: The cluster's billing type.
     * 
     * @param billingType the billingType value to set.
     * @return the ClusterPatchProperties object itself.
     */
    public ClusterPatchProperties withBillingType(BillingType billingType) {
        this.billingType = billingType;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyVaultProperties() != null) {
            keyVaultProperties().validate();
        }
    }
}
