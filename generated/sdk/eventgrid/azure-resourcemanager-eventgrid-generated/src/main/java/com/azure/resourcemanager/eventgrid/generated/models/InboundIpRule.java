// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InboundIpRule model. */
@Fluent
public final class InboundIpRule {
    /*
     * IP Address in CIDR notation e.g., 10.0.0.0/8.
     */
    @JsonProperty(value = "ipMask")
    private String ipMask;

    /*
     * Action to perform based on the match or no match of the IpMask.
     */
    @JsonProperty(value = "action")
    private IpActionType action;

    /** Creates an instance of InboundIpRule class. */
    public InboundIpRule() {
    }

    /**
     * Get the ipMask property: IP Address in CIDR notation e.g., 10.0.0.0/8.
     *
     * @return the ipMask value.
     */
    public String ipMask() {
        return this.ipMask;
    }

    /**
     * Set the ipMask property: IP Address in CIDR notation e.g., 10.0.0.0/8.
     *
     * @param ipMask the ipMask value to set.
     * @return the InboundIpRule object itself.
     */
    public InboundIpRule withIpMask(String ipMask) {
        this.ipMask = ipMask;
        return this;
    }

    /**
     * Get the action property: Action to perform based on the match or no match of the IpMask.
     *
     * @return the action value.
     */
    public IpActionType action() {
        return this.action;
    }

    /**
     * Set the action property: Action to perform based on the match or no match of the IpMask.
     *
     * @param action the action value to set.
     * @return the InboundIpRule object itself.
     */
    public InboundIpRule withAction(IpActionType action) {
        this.action = action;
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
