// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The List resources which are encrypted with the disk encryption set.
 */
@Fluent
public final class ResourceUriList {
    /*
     * A list of IDs or Owner IDs of resources which are encrypted with the disk encryption set.
     */
    @JsonProperty(value = "value", required = true)
    private List<String> value;

    /*
     * The uri to fetch the next page of encrypted resources. Call ListNext() with this to fetch the next page of encrypted resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of ResourceUriList class.
     */
    public ResourceUriList() {
    }

    /**
     * Get the value property: A list of IDs or Owner IDs of resources which are encrypted with the disk encryption set.
     * 
     * @return the value value.
     */
    public List<String> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of IDs or Owner IDs of resources which are encrypted with the disk encryption set.
     * 
     * @param value the value value to set.
     * @return the ResourceUriList object itself.
     */
    public ResourceUriList withValue(List<String> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The uri to fetch the next page of encrypted resources. Call ListNext() with this to fetch the next page of encrypted resources.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The uri to fetch the next page of encrypted resources. Call ListNext() with this to fetch the next page of encrypted resources.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ResourceUriList object itself.
     */
    public ResourceUriList withNextLink(String nextLink) {
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
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property value in model ResourceUriList"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceUriList.class);
}
