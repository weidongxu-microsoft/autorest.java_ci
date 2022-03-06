// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a resource name availability. */
@Fluent
public final class NameAvailabilityInner {
    /*
     * Error Message.
     */
    @JsonProperty(value = "message")
    private String message;

    /*
     * Indicates whether the resource name is available.
     */
    @JsonProperty(value = "nameAvailable")
    private Boolean nameAvailable;

    /*
     * Reason for name being unavailable.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * Get the message property: Error Message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: Error Message.
     *
     * @param message the message value to set.
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the nameAvailable property: Indicates whether the resource name is available.
     *
     * @return the nameAvailable value.
     */
    public Boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: Indicates whether the resource name is available.
     *
     * @param nameAvailable the nameAvailable value to set.
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withNameAvailable(Boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason property: Reason for name being unavailable.
     *
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Reason for name being unavailable.
     *
     * @param reason the reason value to set.
     * @return the NameAvailabilityInner object itself.
     */
    public NameAvailabilityInner withReason(String reason) {
        this.reason = reason;
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
