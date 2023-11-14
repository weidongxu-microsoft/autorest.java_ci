// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.EffectiveRouteMapRouteListInner;
import java.util.List;

/**
 * An immutable client-side representation of EffectiveRouteMapRouteList.
 */
public interface EffectiveRouteMapRouteList {
    /**
     * Gets the value property: The list of Effective RouteMap Routes configured on the connection resource.
     * 
     * @return the value value.
     */
    List<EffectiveRouteMapRoute> value();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.EffectiveRouteMapRouteListInner object.
     * 
     * @return the inner object.
     */
    EffectiveRouteMapRouteListInner innerModel();
}
