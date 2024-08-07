// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.VpnProfileResponseInner;

/**
 * An immutable client-side representation of VpnProfileResponse.
 */
public interface VpnProfileResponse {
    /**
     * Gets the profileUrl property: URL to the VPN profile.
     * 
     * @return the profileUrl value.
     */
    String profileUrl();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.VpnProfileResponseInner object.
     * 
     * @return the inner object.
     */
    VpnProfileResponseInner innerModel();
}
