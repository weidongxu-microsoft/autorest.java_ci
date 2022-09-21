// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.ConsumerGroupInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The result to the List Consumer Group operation. */
@Fluent
public final class ConsumerGroupListResult {
    /*
     * Result of the List Consumer Group operation.
     */
    @JsonProperty(value = "value")
    private List<ConsumerGroupInner> value;

    /*
     * Link to the next set of results. Not empty if Value contains incomplete list of Consumer Group
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ConsumerGroupListResult class. */
    public ConsumerGroupListResult() {
    }

    /**
     * Get the value property: Result of the List Consumer Group operation.
     *
     * @return the value value.
     */
    public List<ConsumerGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Result of the List Consumer Group operation.
     *
     * @param value the value value to set.
     * @return the ConsumerGroupListResult object itself.
     */
    public ConsumerGroupListResult withValue(List<ConsumerGroupInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * Consumer Group.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Link to the next set of results. Not empty if Value contains incomplete list of
     * Consumer Group.
     *
     * @param nextLink the nextLink value to set.
     * @return the ConsumerGroupListResult object itself.
     */
    public ConsumerGroupListResult withNextLink(String nextLink) {
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
