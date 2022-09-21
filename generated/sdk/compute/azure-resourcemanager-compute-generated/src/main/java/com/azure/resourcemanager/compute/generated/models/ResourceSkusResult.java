// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.ResourceSkuInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List Resource Skus operation response. */
@Fluent
public final class ResourceSkusResult {
    /*
     * The list of skus available for the subscription.
     */
    @JsonProperty(value = "value", required = true)
    private List<ResourceSkuInner> value;

    /*
     * The URI to fetch the next page of Resource Skus. Call ListNext() with this URI to fetch the next page of
     * Resource Skus
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ResourceSkusResult class. */
    public ResourceSkusResult() {
    }

    /**
     * Get the value property: The list of skus available for the subscription.
     *
     * @return the value value.
     */
    public List<ResourceSkuInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of skus available for the subscription.
     *
     * @param value the value value to set.
     * @return the ResourceSkusResult object itself.
     */
    public ResourceSkusResult withValue(List<ResourceSkuInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of Resource Skus. Call ListNext() with this URI to
     * fetch the next page of Resource Skus.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of Resource Skus. Call ListNext() with this URI to
     * fetch the next page of Resource Skus.
     *
     * @param nextLink the nextLink value to set.
     * @return the ResourceSkusResult object itself.
     */
    public ResourceSkusResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model ResourceSkusResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceSkusResult.class);
}
