// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.NamespaceTopicInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the List namespace topics operation. */
@Fluent
public final class NamespaceTopicsListResult {
    /*
     * A collection of namespace topics.
     */
    @JsonProperty(value = "value")
    private List<NamespaceTopicInner> value;

    /*
     * A link for the next page of namespace topics.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of NamespaceTopicsListResult class. */
    public NamespaceTopicsListResult() {
    }

    /**
     * Get the value property: A collection of namespace topics.
     *
     * @return the value value.
     */
    public List<NamespaceTopicInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of namespace topics.
     *
     * @param value the value value to set.
     * @return the NamespaceTopicsListResult object itself.
     */
    public NamespaceTopicsListResult withValue(List<NamespaceTopicInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of namespace topics.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of namespace topics.
     *
     * @param nextLink the nextLink value to set.
     * @return the NamespaceTopicsListResult object itself.
     */
    public NamespaceTopicsListResult withNextLink(String nextLink) {
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
