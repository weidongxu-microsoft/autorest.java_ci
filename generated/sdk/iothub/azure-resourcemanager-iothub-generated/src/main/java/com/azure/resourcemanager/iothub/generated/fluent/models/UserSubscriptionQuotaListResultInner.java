// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iothub.generated.models.UserSubscriptionQuota;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Json-serialized array of User subscription quota response. */
@Fluent
public final class UserSubscriptionQuotaListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserSubscriptionQuotaListResultInner.class);

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<UserSubscriptionQuota> value;

    /*
     * The nextLink property.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<UserSubscriptionQuota> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the UserSubscriptionQuotaListResultInner object itself.
     */
    public UserSubscriptionQuotaListResultInner withValue(List<UserSubscriptionQuota> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The nextLink property.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
