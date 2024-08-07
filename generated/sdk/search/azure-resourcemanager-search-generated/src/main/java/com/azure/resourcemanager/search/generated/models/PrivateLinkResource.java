// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.resourcemanager.search.generated.fluent.models.PrivateLinkResourceInner;

/**
 * An immutable client-side representation of PrivateLinkResource.
 */
public interface PrivateLinkResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the properties property: Describes the properties of a supported private link resource for the Azure AI
     * Search service.
     * 
     * @return the properties value.
     */
    PrivateLinkResourceProperties properties();

    /**
     * Gets the inner com.azure.resourcemanager.search.generated.fluent.models.PrivateLinkResourceInner object.
     * 
     * @return the inner object.
     */
    PrivateLinkResourceInner innerModel();
}
