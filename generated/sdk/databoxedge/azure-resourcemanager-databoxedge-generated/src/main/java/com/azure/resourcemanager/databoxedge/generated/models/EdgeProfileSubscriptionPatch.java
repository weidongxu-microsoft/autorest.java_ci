// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Data Box Edge/Gateway Edge Profile Subscription patch.
 */
@Fluent
public final class EdgeProfileSubscriptionPatch {
    /*
     * The path ID that uniquely identifies the subscription of the edge profile.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of EdgeProfileSubscriptionPatch class.
     */
    public EdgeProfileSubscriptionPatch() {
    }

    /**
     * Get the id property: The path ID that uniquely identifies the subscription of the edge profile.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The path ID that uniquely identifies the subscription of the edge profile.
     * 
     * @param id the id value to set.
     * @return the EdgeProfileSubscriptionPatch object itself.
     */
    public EdgeProfileSubscriptionPatch withId(String id) {
        this.id = id;
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
