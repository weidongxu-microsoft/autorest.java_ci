// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.VpnServerConfigurationsResponseInner;
import java.util.List;

/**
 * An immutable client-side representation of VpnServerConfigurationsResponse.
 */
public interface VpnServerConfigurationsResponse {
    /**
     * Gets the vpnServerConfigurationResourceIds property: List of VpnServerConfigurations associated with VirtualWan.
     * 
     * @return the vpnServerConfigurationResourceIds value.
     */
    List<String> vpnServerConfigurationResourceIds();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VpnServerConfigurationsResponseInner
     * object.
     * 
     * @return the inner object.
     */
    VpnServerConfigurationsResponseInner innerModel();
}
