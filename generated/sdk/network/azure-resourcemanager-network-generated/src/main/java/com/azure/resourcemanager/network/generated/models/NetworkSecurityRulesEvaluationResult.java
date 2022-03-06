// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Network security rules evaluation result. */
@Fluent
public final class NetworkSecurityRulesEvaluationResult {
    /*
     * Name of the network security rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Value indicating whether protocol is matched.
     */
    @JsonProperty(value = "protocolMatched")
    private Boolean protocolMatched;

    /*
     * Value indicating whether source is matched.
     */
    @JsonProperty(value = "sourceMatched")
    private Boolean sourceMatched;

    /*
     * Value indicating whether source port is matched.
     */
    @JsonProperty(value = "sourcePortMatched")
    private Boolean sourcePortMatched;

    /*
     * Value indicating whether destination is matched.
     */
    @JsonProperty(value = "destinationMatched")
    private Boolean destinationMatched;

    /*
     * Value indicating whether destination port is matched.
     */
    @JsonProperty(value = "destinationPortMatched")
    private Boolean destinationPortMatched;

    /**
     * Get the name property: Name of the network security rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the network security rule.
     *
     * @param name the name value to set.
     * @return the NetworkSecurityRulesEvaluationResult object itself.
     */
    public NetworkSecurityRulesEvaluationResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the protocolMatched property: Value indicating whether protocol is matched.
     *
     * @return the protocolMatched value.
     */
    public Boolean protocolMatched() {
        return this.protocolMatched;
    }

    /**
     * Set the protocolMatched property: Value indicating whether protocol is matched.
     *
     * @param protocolMatched the protocolMatched value to set.
     * @return the NetworkSecurityRulesEvaluationResult object itself.
     */
    public NetworkSecurityRulesEvaluationResult withProtocolMatched(Boolean protocolMatched) {
        this.protocolMatched = protocolMatched;
        return this;
    }

    /**
     * Get the sourceMatched property: Value indicating whether source is matched.
     *
     * @return the sourceMatched value.
     */
    public Boolean sourceMatched() {
        return this.sourceMatched;
    }

    /**
     * Set the sourceMatched property: Value indicating whether source is matched.
     *
     * @param sourceMatched the sourceMatched value to set.
     * @return the NetworkSecurityRulesEvaluationResult object itself.
     */
    public NetworkSecurityRulesEvaluationResult withSourceMatched(Boolean sourceMatched) {
        this.sourceMatched = sourceMatched;
        return this;
    }

    /**
     * Get the sourcePortMatched property: Value indicating whether source port is matched.
     *
     * @return the sourcePortMatched value.
     */
    public Boolean sourcePortMatched() {
        return this.sourcePortMatched;
    }

    /**
     * Set the sourcePortMatched property: Value indicating whether source port is matched.
     *
     * @param sourcePortMatched the sourcePortMatched value to set.
     * @return the NetworkSecurityRulesEvaluationResult object itself.
     */
    public NetworkSecurityRulesEvaluationResult withSourcePortMatched(Boolean sourcePortMatched) {
        this.sourcePortMatched = sourcePortMatched;
        return this;
    }

    /**
     * Get the destinationMatched property: Value indicating whether destination is matched.
     *
     * @return the destinationMatched value.
     */
    public Boolean destinationMatched() {
        return this.destinationMatched;
    }

    /**
     * Set the destinationMatched property: Value indicating whether destination is matched.
     *
     * @param destinationMatched the destinationMatched value to set.
     * @return the NetworkSecurityRulesEvaluationResult object itself.
     */
    public NetworkSecurityRulesEvaluationResult withDestinationMatched(Boolean destinationMatched) {
        this.destinationMatched = destinationMatched;
        return this;
    }

    /**
     * Get the destinationPortMatched property: Value indicating whether destination port is matched.
     *
     * @return the destinationPortMatched value.
     */
    public Boolean destinationPortMatched() {
        return this.destinationPortMatched;
    }

    /**
     * Set the destinationPortMatched property: Value indicating whether destination port is matched.
     *
     * @param destinationPortMatched the destinationPortMatched value to set.
     * @return the NetworkSecurityRulesEvaluationResult object itself.
     */
    public NetworkSecurityRulesEvaluationResult withDestinationPortMatched(Boolean destinationPortMatched) {
        this.destinationPortMatched = destinationPortMatched;
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
