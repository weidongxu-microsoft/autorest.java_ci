// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of AvailablePrivateEndpointTypes.
 */
public interface AvailablePrivateEndpointTypes {
    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     * 
     * @param location The location of the domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of available PrivateEndpoint types as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailablePrivateEndpointType> list(String location);

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     * 
     * @param location The location of the domain name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of available PrivateEndpoint types as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailablePrivateEndpointType> list(String location, Context context);

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     * 
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of available PrivateEndpoint types as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailablePrivateEndpointType> listByResourceGroup(String location, String resourceGroupName);

    /**
     * Returns all of the resource types that can be linked to a Private Endpoint in this subscription in this region.
     * 
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of available PrivateEndpoint types as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AvailablePrivateEndpointType> listByResourceGroup(String location, String resourceGroupName,
        Context context);
}
