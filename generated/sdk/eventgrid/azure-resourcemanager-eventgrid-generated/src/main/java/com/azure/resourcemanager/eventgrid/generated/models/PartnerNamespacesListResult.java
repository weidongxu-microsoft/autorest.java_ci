// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PartnerNamespaceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Result of the List Partner Namespaces operation. */
@Fluent
public final class PartnerNamespacesListResult {
    /*
     * A collection of partner namespaces.
     */
    @JsonProperty(value = "value")
    private List<PartnerNamespaceInner> value;

    /*
     * A link for the next page of partner namespaces.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: A collection of partner namespaces.
     *
     * @return the value value.
     */
    public List<PartnerNamespaceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of partner namespaces.
     *
     * @param value the value value to set.
     * @return the PartnerNamespacesListResult object itself.
     */
    public PartnerNamespacesListResult withValue(List<PartnerNamespaceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: A link for the next page of partner namespaces.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: A link for the next page of partner namespaces.
     *
     * @param nextLink the nextLink value to set.
     * @return the PartnerNamespacesListResult object itself.
     */
    public PartnerNamespacesListResult withNextLink(String nextLink) {
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
