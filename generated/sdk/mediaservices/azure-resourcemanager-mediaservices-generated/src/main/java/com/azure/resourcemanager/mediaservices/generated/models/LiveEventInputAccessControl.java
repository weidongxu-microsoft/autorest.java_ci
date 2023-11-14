// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The IP access control for live event input.
 */
@Fluent
public final class LiveEventInputAccessControl {
    /*
     * The IP access control properties.
     */
    @JsonProperty(value = "ip")
    private IpAccessControl ip;

    /**
     * Creates an instance of LiveEventInputAccessControl class.
     */
    public LiveEventInputAccessControl() {
    }

    /**
     * Get the ip property: The IP access control properties.
     * 
     * @return the ip value.
     */
    public IpAccessControl ip() {
        return this.ip;
    }

    /**
     * Set the ip property: The IP access control properties.
     * 
     * @param ip the ip value to set.
     * @return the LiveEventInputAccessControl object itself.
     */
    public LiveEventInputAccessControl withIp(IpAccessControl ip) {
        this.ip = ip;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ip() != null) {
            ip().validate();
        }
    }
}
