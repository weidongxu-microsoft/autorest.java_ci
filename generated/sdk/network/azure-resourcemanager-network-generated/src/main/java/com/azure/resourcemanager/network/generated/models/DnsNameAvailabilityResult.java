// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.DnsNameAvailabilityResultInner;

/**
 * An immutable client-side representation of DnsNameAvailabilityResult.
 */
public interface DnsNameAvailabilityResult {
    /**
     * Gets the available property: Domain availability (True/False).
     * 
     * @return the available value.
     */
    Boolean available();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.DnsNameAvailabilityResultInner object.
     * 
     * @return the inner object.
     */
    DnsNameAvailabilityResultInner innerModel();
}
