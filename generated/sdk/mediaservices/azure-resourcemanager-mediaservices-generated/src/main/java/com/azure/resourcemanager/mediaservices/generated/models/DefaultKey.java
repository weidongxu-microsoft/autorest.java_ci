// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class to specify properties of default content key for each encryption scheme. */
@Fluent
public final class DefaultKey {
    /*
     * Label can be used to specify Content Key when creating a Streaming
     * Locator
     */
    @JsonProperty(value = "label")
    private String label;

    /*
     * Policy used by Default Key
     */
    @JsonProperty(value = "policyName")
    private String policyName;

    /**
     * Get the label property: Label can be used to specify Content Key when creating a Streaming Locator.
     *
     * @return the label value.
     */
    public String label() {
        return this.label;
    }

    /**
     * Set the label property: Label can be used to specify Content Key when creating a Streaming Locator.
     *
     * @param label the label value to set.
     * @return the DefaultKey object itself.
     */
    public DefaultKey withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * Get the policyName property: Policy used by Default Key.
     *
     * @return the policyName value.
     */
    public String policyName() {
        return this.policyName;
    }

    /**
     * Set the policyName property: Policy used by Default Key.
     *
     * @param policyName the policyName value to set.
     * @return the DefaultKey object itself.
     */
    public DefaultKey withPolicyName(String policyName) {
        this.policyName = policyName;
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
