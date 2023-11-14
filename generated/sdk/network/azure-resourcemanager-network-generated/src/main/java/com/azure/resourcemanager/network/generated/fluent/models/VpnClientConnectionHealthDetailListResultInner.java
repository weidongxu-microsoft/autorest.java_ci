// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.generated.models.VpnClientConnectionHealthDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of virtual network gateway vpn client connection health.
 */
@Fluent
public final class VpnClientConnectionHealthDetailListResultInner {
    /*
     * List of vpn client connection health.
     */
    @JsonProperty(value = "value")
    private List<VpnClientConnectionHealthDetail> value;

    /**
     * Creates an instance of VpnClientConnectionHealthDetailListResultInner class.
     */
    public VpnClientConnectionHealthDetailListResultInner() {
    }

    /**
     * Get the value property: List of vpn client connection health.
     * 
     * @return the value value.
     */
    public List<VpnClientConnectionHealthDetail> value() {
        return this.value;
    }

    /**
     * Set the value property: List of vpn client connection health.
     * 
     * @param value the value value to set.
     * @return the VpnClientConnectionHealthDetailListResultInner object itself.
     */
    public VpnClientConnectionHealthDetailListResultInner withValue(List<VpnClientConnectionHealthDetail> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
