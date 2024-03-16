// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of HubRouteTables.
 */
public interface HubRouteTables {
    /**
     * Retrieves the details of a RouteTable.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return routeTable resource in a virtual hub along with {@link Response}.
     */
    Response<HubRouteTable> getWithResponse(String resourceGroupName, String virtualHubName, String routeTableName,
        Context context);

    /**
     * Retrieves the details of a RouteTable.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return routeTable resource in a virtual hub.
     */
    HubRouteTable get(String resourceGroupName, String virtualHubName, String routeTableName);

    /**
     * Deletes a RouteTable.
     * 
     * @param resourceGroupName The resource group name of the RouteTable.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualHubName, String routeTableName);

    /**
     * Deletes a RouteTable.
     * 
     * @param resourceGroupName The resource group name of the RouteTable.
     * @param virtualHubName The name of the VirtualHub.
     * @param routeTableName The name of the RouteTable.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualHubName, String routeTableName, Context context);

    /**
     * Retrieves the details of all RouteTables.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RouteTables and a URL nextLink to get the next set of results as paginated response with {@link PagedIterable}.
     */
    PagedIterable<HubRouteTable> list(String resourceGroupName, String virtualHubName);

    /**
     * Retrieves the details of all RouteTables.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of RouteTables and a URL nextLink to get the next set of results as paginated response with {@link PagedIterable}.
     */
    PagedIterable<HubRouteTable> list(String resourceGroupName, String virtualHubName, Context context);

    /**
     * Retrieves the details of a RouteTable.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return routeTable resource in a virtual hub along with {@link Response}.
     */
    HubRouteTable getById(String id);

    /**
     * Retrieves the details of a RouteTable.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return routeTable resource in a virtual hub along with {@link Response}.
     */
    Response<HubRouteTable> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a RouteTable.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a RouteTable.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new HubRouteTable resource.
     * 
     * @param name resource name.
     * @return the first stage of the new HubRouteTable definition.
     */
    HubRouteTable.DefinitionStages.Blank define(String name);
}
