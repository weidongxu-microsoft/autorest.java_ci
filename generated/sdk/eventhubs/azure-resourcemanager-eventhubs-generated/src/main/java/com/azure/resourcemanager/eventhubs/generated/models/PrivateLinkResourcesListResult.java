// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.resourcemanager.eventhubs.generated.fluent.models.PrivateLinkResourcesListResultInner;
import java.util.List;

/**
 * An immutable client-side representation of PrivateLinkResourcesListResult.
 */
public interface PrivateLinkResourcesListResult {
    /**
     * Gets the value property: A collection of private link resources.
     * 
     * @return the value value.
     */
    List<PrivateLinkResource> value();

    /**
     * Gets the nextLink property: A link for the next page of private link resources.
     * 
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * Gets the inner com.azure.resourcemanager.eventhubs.generated.fluent.models.PrivateLinkResourcesListResultInner
     * object.
     * 
     * @return the inner object.
     */
    PrivateLinkResourcesListResultInner innerModel();
}
