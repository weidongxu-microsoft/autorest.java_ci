// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of RouteMaps.
 */
public interface RouteMaps {
    /**
     * Retrieves the details of a RouteMap.
     * 
     * @param resourceGroupName The resource group name of the RouteMap's resource group.
     * @param virtualHubName The name of the VirtualHub containing the RouteMap.
     * @param routeMapName The name of the RouteMap.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RouteMap child resource of a Virtual hub along with {@link Response}.
     */
    Response<RouteMap> getWithResponse(String resourceGroupName, String virtualHubName, String routeMapName,
        Context context);

    /**
     * Retrieves the details of a RouteMap.
     * 
     * @param resourceGroupName The resource group name of the RouteMap's resource group.
     * @param virtualHubName The name of the VirtualHub containing the RouteMap.
     * @param routeMapName The name of the RouteMap.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RouteMap child resource of a Virtual hub.
     */
    RouteMap get(String resourceGroupName, String virtualHubName, String routeMapName);

    /**
     * Deletes a RouteMap.
     * 
     * @param resourceGroupName The resource group name of the RouteMap's resource group.
     * @param virtualHubName The name of the VirtualHub containing the RouteMap.
     * @param routeMapName The name of the RouteMap.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualHubName, String routeMapName);

    /**
     * Deletes a RouteMap.
     * 
     * @param resourceGroupName The resource group name of the RouteMap's resource group.
     * @param virtualHubName The name of the VirtualHub containing the RouteMap.
     * @param routeMapName The name of the RouteMap.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualHubName, String routeMapName, Context context);

    /**
     * Retrieves the details of all RouteMaps.
     * 
     * @param resourceGroupName The resource group name of the RouteMap's resource group'.
     * @param virtualHubName The name of the VirtualHub containing the RouteMap.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RouteMaps and a URL nextLink to get the next set of results as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RouteMap> list(String resourceGroupName, String virtualHubName);

    /**
     * Retrieves the details of all RouteMaps.
     * 
     * @param resourceGroupName The resource group name of the RouteMap's resource group'.
     * @param virtualHubName The name of the VirtualHub containing the RouteMap.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RouteMaps and a URL nextLink to get the next set of results as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RouteMap> list(String resourceGroupName, String virtualHubName, Context context);

    /**
     * Retrieves the details of a RouteMap.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RouteMap child resource of a Virtual hub along with {@link Response}.
     */
    RouteMap getById(String id);

    /**
     * Retrieves the details of a RouteMap.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the RouteMap child resource of a Virtual hub along with {@link Response}.
     */
    Response<RouteMap> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a RouteMap.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a RouteMap.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new RouteMap resource.
     * 
     * @param name resource name.
     * @return the first stage of the new RouteMap definition.
     */
    RouteMap.DefinitionStages.Blank define(String name);
}
