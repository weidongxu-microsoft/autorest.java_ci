// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.VirtualWanSecurityProvidersInner;
import java.util.List;

/**
 * An immutable client-side representation of VirtualWanSecurityProviders.
 */
public interface VirtualWanSecurityProviders {
    /**
     * Gets the supportedProviders property: List of VirtualWAN security providers.
     * 
     * @return the supportedProviders value.
     */
    List<VirtualWanSecurityProvider> supportedProviders();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VirtualWanSecurityProvidersInner object.
     * 
     * @return the inner object.
     */
    VirtualWanSecurityProvidersInner innerModel();
}
