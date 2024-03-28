// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ExpressRoutePortsLocations.
 */
public interface ExpressRoutePortsLocations {
    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location.
     * Available bandwidths can only be obtained when retrieving a specific peering location.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoutePorts Location List Result as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ExpressRoutePortsLocation> list();

    /**
     * Retrieves all ExpressRoutePort peering locations. Does not return available bandwidths for each location.
     * Available bandwidths can only be obtained when retrieving a specific peering location.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoutePorts Location List Result as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ExpressRoutePortsLocation> list(Context context);

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at
     * said peering location.
     * 
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoutePorts Peering Location along with {@link Response}.
     */
    Response<ExpressRoutePortsLocation> getWithResponse(String locationName, Context context);

    /**
     * Retrieves a single ExpressRoutePort peering location, including the list of available bandwidths available at
     * said peering location.
     * 
     * @param locationName Name of the requested ExpressRoutePort peering location.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRoutePorts Peering Location.
     */
    ExpressRoutePortsLocation get(String locationName);
}
