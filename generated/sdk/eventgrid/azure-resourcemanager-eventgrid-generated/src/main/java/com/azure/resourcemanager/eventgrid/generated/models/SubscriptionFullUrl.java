// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.resourcemanager.eventgrid.generated.fluent.models.SubscriptionFullUrlInner;

/**
 * An immutable client-side representation of SubscriptionFullUrl.
 */
public interface SubscriptionFullUrl {
    /**
     * Gets the endpointUrl property: The URL that represents the endpoint of the destination of an event subscription.
     * 
     * @return the endpointUrl value.
     */
    String endpointUrl();

    /**
     * Gets the inner com.azure.resourcemanager.eventgrid.generated.fluent.models.SubscriptionFullUrlInner object.
     * 
     * @return the inner object.
     */
    SubscriptionFullUrlInner innerModel();
}
