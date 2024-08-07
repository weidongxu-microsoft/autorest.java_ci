// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of AvailableDelegations.
 */
public interface AvailableDelegations {
    /**
     * Gets all of the available subnet delegations for this subscription in this region.
     * 
     * @param location The location of the subnet.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all of the available subnet delegations for this subscription in this region as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<AvailableDelegation> list(String location);

    /**
     * Gets all of the available subnet delegations for this subscription in this region.
     * 
     * @param location The location of the subnet.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all of the available subnet delegations for this subscription in this region as paginated response with
     * {@link PagedIterable}.
     */
    PagedIterable<AvailableDelegation> list(String location, Context context);
}
