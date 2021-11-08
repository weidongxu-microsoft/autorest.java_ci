// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response of the List NetworkRuleSet operation. */
@Fluent
public final class NetworkRuleSetListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkRuleSetListResultInner.class);

    /*
     * Result of the List NetworkRuleSet operation
     */
    @JsonProperty(value = "value")
    private List<NetworkRuleSetInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete
     * list of NetworkRuleSet.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: Result of the List NetworkRuleSet operation.
     *
     * @return the value value.
     */
    public List<NetworkRuleSetInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List NetworkRuleSet operation.
     *
     * @param value the value value to set.
     * @return the NetworkRuleSetListResultInner object itself.
     */
    public NetworkRuleSetListResultInner withValue(List<NetworkRuleSetInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * NetworkRuleSet.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * NetworkRuleSet.
     *
     * @param nextLink the nextLink value to set.
     * @return the NetworkRuleSetListResultInner object itself.
     */
    public NetworkRuleSetListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
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
