// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response from the List namespace operation.
 */
@Fluent
public final class NWRuleSetIpRules {
    /*
     * IP Mask
     */
    @JsonProperty(value = "ipMask")
    private String ipMask;

    /*
     * The IP Filter Action
     */
    @JsonProperty(value = "action")
    private NetworkRuleIpAction action;

    /**
     * Creates an instance of NWRuleSetIpRules class.
     */
    public NWRuleSetIpRules() {
    }

    /**
     * Get the ipMask property: IP Mask.
     * 
     * @return the ipMask value.
     */
    public String ipMask() {
        return this.ipMask;
    }

    /**
     * Set the ipMask property: IP Mask.
     * 
     * @param ipMask the ipMask value to set.
     * @return the NWRuleSetIpRules object itself.
     */
    public NWRuleSetIpRules withIpMask(String ipMask) {
        this.ipMask = ipMask;
        return this;
    }

    /**
     * Get the action property: The IP Filter Action.
     * 
     * @return the action value.
     */
    public NetworkRuleIpAction action() {
        return this.action;
    }

    /**
     * Set the action property: The IP Filter Action.
     * 
     * @param action the action value to set.
     * @return the NWRuleSetIpRules object itself.
     */
    public NWRuleSetIpRules withAction(NetworkRuleIpAction action) {
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
