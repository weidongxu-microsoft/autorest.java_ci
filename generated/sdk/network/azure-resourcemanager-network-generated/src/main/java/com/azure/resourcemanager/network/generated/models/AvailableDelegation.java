// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.AvailableDelegationInner;
import java.util.List;

/**
 * An immutable client-side representation of AvailableDelegation.
 */
public interface AvailableDelegation {
    /**
     * Gets the name property: The name of the AvailableDelegation resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the id property: A unique identifier of the AvailableDelegation resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the type property: Resource type.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the serviceName property: The name of the service and resource.
     * 
     * @return the serviceName value.
     */
    String serviceName();

    /**
     * Gets the actions property: The actions permitted to the service upon delegation.
     * 
     * @return the actions value.
     */
    List<String> actions();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.AvailableDelegationInner object.
     * 
     * @return the inner object.
     */
    AvailableDelegationInner innerModel();
}
