// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The LogAnalyticsConfiguration model. */
@Fluent
public final class LogAnalyticsConfiguration {
    /*
     * The customerId property.
     */
    @JsonProperty(value = "customerId")
    private String customerId;

    /*
     * The sharedKey property.
     */
    @JsonProperty(value = "sharedKey")
    private String sharedKey;

    /** Creates an instance of LogAnalyticsConfiguration class. */
    public LogAnalyticsConfiguration() {
    }

    /**
     * Get the customerId property: The customerId property.
     *
     * @return the customerId value.
     */
    public String customerId() {
        return this.customerId;
    }

    /**
     * Set the customerId property: The customerId property.
     *
     * @param customerId the customerId value to set.
     * @return the LogAnalyticsConfiguration object itself.
     */
    public LogAnalyticsConfiguration withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * Get the sharedKey property: The sharedKey property.
     *
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.sharedKey;
    }

    /**
     * Set the sharedKey property: The sharedKey property.
     *
     * @param sharedKey the sharedKey value to set.
     * @return the LogAnalyticsConfiguration object itself.
     */
    public LogAnalyticsConfiguration withSharedKey(String sharedKey) {
        this.sharedKey = sharedKey;
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
