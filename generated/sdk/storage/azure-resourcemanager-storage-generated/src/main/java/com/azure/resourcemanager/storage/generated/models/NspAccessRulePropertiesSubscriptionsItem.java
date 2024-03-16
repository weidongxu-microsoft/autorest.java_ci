// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Subscription for inbound rule.
 */
@Fluent
public final class NspAccessRulePropertiesSubscriptionsItem {
    /*
     * The ARM identifier of subscription
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Creates an instance of NspAccessRulePropertiesSubscriptionsItem class.
     */
    public NspAccessRulePropertiesSubscriptionsItem() {
    }

    /**
     * Get the id property: The ARM identifier of subscription.
     * 
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: The ARM identifier of subscription.
     * 
     * @param id the id value to set.
     * @return the NspAccessRulePropertiesSubscriptionsItem object itself.
     */
    public NspAccessRulePropertiesSubscriptionsItem withId(String id) {
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
