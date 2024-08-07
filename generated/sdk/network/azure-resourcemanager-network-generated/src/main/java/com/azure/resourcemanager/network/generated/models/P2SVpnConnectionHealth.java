// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.P2SVpnConnectionHealthInner;

/**
 * An immutable client-side representation of P2SVpnConnectionHealth.
 */
public interface P2SVpnConnectionHealth {
    /**
     * Gets the sasUrl property: Returned sas url of the blob to which the p2s vpn connection detailed health will be
     * written.
     * 
     * @return the sasUrl value.
     */
    String sasUrl();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.P2SVpnConnectionHealthInner object.
     * 
     * @return the inner object.
     */
    P2SVpnConnectionHealthInner innerModel();
}
