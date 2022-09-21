// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.models.CloudServiceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list operation result. */
@Fluent
public final class CloudServiceListResult {
    /*
     * The list of resources.
     */
    @JsonProperty(value = "value", required = true)
    private List<CloudServiceInner> value;

    /*
     * The URI to fetch the next page of resources. Use this to get the next page of resources. Do this till nextLink
     * is null to fetch all the resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of CloudServiceListResult class. */
    public CloudServiceListResult() {
    }

    /**
     * Get the value property: The list of resources.
     *
     * @return the value value.
     */
    public List<CloudServiceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of resources.
     *
     * @param value the value value to set.
     * @return the CloudServiceListResult object itself.
     */
    public CloudServiceListResult withValue(List<CloudServiceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of resources. Use this to get the next page of
     * resources. Do this till nextLink is null to fetch all the resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of resources. Use this to get the next page of
     * resources. Do this till nextLink is null to fetch all the resources.
     *
     * @param nextLink the nextLink value to set.
     * @return the CloudServiceListResult object itself.
     */
    public CloudServiceListResult withNextLink(String nextLink) {
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
                    new IllegalArgumentException("Missing required property value in model CloudServiceListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CloudServiceListResult.class);
}
