// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of VirtualHubs. */
public interface VirtualHubs {
    /**
     * Retrieves the details of a VirtualHub.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHub Resource along with {@link Response}.
     */
    Response<VirtualHub> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualHubName, Context context);

    /**
     * Retrieves the details of a VirtualHub.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHub Resource.
     */
    VirtualHub getByResourceGroup(String resourceGroupName, String virtualHubName);

    /**
     * Deletes a VirtualHub.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String virtualHubName);

    /**
     * Deletes a VirtualHub.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String virtualHubName, Context context);

    /**
     * Lists all the VirtualHubs in a resource group.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualHubs as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualHub> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all the VirtualHubs in a resource group.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualHubs as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualHub> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the VirtualHubs in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualHubs as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualHub> list();

    /**
     * Lists all the VirtualHubs in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualHubs as paginated response with {@link PagedIterable}.
     */
    PagedIterable<VirtualHub> list(Context context);

    /**
     * Gets the effective routes configured for the Virtual Hub resource or the specified resource .
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param effectiveRoutesParameters Parameters supplied to get the effective routes for a specific resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getEffectiveVirtualHubRoutes(
        String resourceGroupName, String virtualHubName, EffectiveRoutesParameters effectiveRoutesParameters);

    /**
     * Gets the effective routes configured for the Virtual Hub resource or the specified resource .
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getEffectiveVirtualHubRoutes(String resourceGroupName, String virtualHubName);

    /**
     * Gets the effective routes configured for the Virtual Hub resource or the specified resource .
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param effectiveRoutesParameters Parameters supplied to get the effective routes for a specific resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getEffectiveVirtualHubRoutes(
        String resourceGroupName,
        String virtualHubName,
        EffectiveRoutesParameters effectiveRoutesParameters,
        Context context);

    /**
     * Gets the inbound routes configured for the Virtual Hub on a particular connection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param getInboundRoutesParameters Parameters supplied to get the inbound routes for a connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getInboundRoutes(
        String resourceGroupName, String virtualHubName, GetInboundRoutesParameters getInboundRoutesParameters);

    /**
     * Gets the inbound routes configured for the Virtual Hub on a particular connection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param getInboundRoutesParameters Parameters supplied to get the inbound routes for a connection resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getInboundRoutes(
        String resourceGroupName,
        String virtualHubName,
        GetInboundRoutesParameters getInboundRoutesParameters,
        Context context);

    /**
     * Gets the outbound routes configured for the Virtual Hub on a particular connection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param getOutboundRoutesParameters Parameters supplied to get the outbound routes for a connection resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getOutboundRoutes(
        String resourceGroupName, String virtualHubName, GetOutboundRoutesParameters getOutboundRoutesParameters);

    /**
     * Gets the outbound routes configured for the Virtual Hub on a particular connection.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param getOutboundRoutesParameters Parameters supplied to get the outbound routes for a connection resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void getOutboundRoutes(
        String resourceGroupName,
        String virtualHubName,
        GetOutboundRoutesParameters getOutboundRoutesParameters,
        Context context);

    /**
     * Retrieves the details of a VirtualHub.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHub Resource along with {@link Response}.
     */
    VirtualHub getById(String id);

    /**
     * Retrieves the details of a VirtualHub.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHub Resource along with {@link Response}.
     */
    Response<VirtualHub> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a VirtualHub.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a VirtualHub.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new VirtualHub resource.
     *
     * @param name resource name.
     * @return the first stage of the new VirtualHub definition.
     */
    VirtualHub.DefinitionStages.Blank define(String name);
}
