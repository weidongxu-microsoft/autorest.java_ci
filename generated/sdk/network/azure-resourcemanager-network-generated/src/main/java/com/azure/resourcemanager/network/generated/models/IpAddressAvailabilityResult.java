// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.resourcemanager.network.generated.fluent.models.IpAddressAvailabilityResultInner;
import java.util.List;

/**
 * An immutable client-side representation of IpAddressAvailabilityResult.
 */
public interface IpAddressAvailabilityResult {
    /**
     * Gets the available property: Private IP address availability.
     * 
     * @return the available value.
     */
    Boolean available();

    /**
     * Gets the availableIpAddresses property: Contains other available private IP addresses if the asked for address is
     * taken.
     * 
     * @return the availableIpAddresses value.
     */
    List<String> availableIpAddresses();

    /**
     * Gets the isPlatformReserved property: Private IP address platform reserved.
     * 
     * @return the isPlatformReserved value.
     */
    Boolean isPlatformReserved();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.IpAddressAvailabilityResultInner object.
     * 
     * @return the inner object.
     */
    IpAddressAvailabilityResultInner innerModel();
}
