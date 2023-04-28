// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.generated.fluent.models.EffectiveRouteMapRouteListInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualHubEffectiveRouteListInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualHubInner;
import com.azure.resourcemanager.network.generated.models.EffectiveRoutesParameters;
import com.azure.resourcemanager.network.generated.models.GetInboundRoutesParameters;
import com.azure.resourcemanager.network.generated.models.GetOutboundRoutesParameters;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/** An instance of this class provides access to all the operations defined in VirtualHubsClient. */
public interface VirtualHubsClient {
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualHubInner> getByResourceGroupWithResponse(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualHubInner getByResourceGroup(String resourceGroupName, String virtualHubName);

    /**
     * Creates a VirtualHub resource if it doesn't exist else updates the existing VirtualHub.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param virtualHubParameters Parameters supplied to create or update VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of virtualHub Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualHubInner>, VirtualHubInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualHubName, VirtualHubInner virtualHubParameters);

    /**
     * Creates a VirtualHub resource if it doesn't exist else updates the existing VirtualHub.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param virtualHubParameters Parameters supplied to create or update VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of virtualHub Resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualHubInner>, VirtualHubInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualHubName, VirtualHubInner virtualHubParameters, Context context);

    /**
     * Creates a VirtualHub resource if it doesn't exist else updates the existing VirtualHub.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param virtualHubParameters Parameters supplied to create or update VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHub Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualHubInner createOrUpdate(
        String resourceGroupName, String virtualHubName, VirtualHubInner virtualHubParameters);

    /**
     * Creates a VirtualHub resource if it doesn't exist else updates the existing VirtualHub.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param virtualHubParameters Parameters supplied to create or update VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHub Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualHubInner createOrUpdate(
        String resourceGroupName, String virtualHubName, VirtualHubInner virtualHubParameters, Context context);

    /**
     * Updates VirtualHub tags.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param virtualHubParameters Parameters supplied to update VirtualHub tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHub Resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualHubInner> updateTagsWithResponse(
        String resourceGroupName, String virtualHubName, TagsObject virtualHubParameters, Context context);

    /**
     * Updates VirtualHub tags.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param virtualHubParameters Parameters supplied to update VirtualHub tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtualHub Resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualHubInner updateTags(String resourceGroupName, String virtualHubName, TagsObject virtualHubParameters);

    /**
     * Deletes a VirtualHub.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualHubName);

    /**
     * Deletes a VirtualHub.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualHubName, Context context);

    /**
     * Deletes a VirtualHub.
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualHubName);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualHubInner> listByResourceGroup(String resourceGroupName);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualHubInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Lists all the VirtualHubs in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualHubs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualHubInner> list();

    /**
     * Lists all the VirtualHubs in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list VirtualHubs as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualHubInner> list(Context context);

    /**
     * Gets the effective routes configured for the Virtual Hub resource or the specified resource .
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the effective routes configured for the Virtual Hub resource or the
     *     specified resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualHubEffectiveRouteListInner>, VirtualHubEffectiveRouteListInner>
        beginGetEffectiveVirtualHubRoutes(String resourceGroupName, String virtualHubName);

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
     * @return the {@link SyncPoller} for polling of the effective routes configured for the Virtual Hub resource or the
     *     specified resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualHubEffectiveRouteListInner>, VirtualHubEffectiveRouteListInner>
        beginGetEffectiveVirtualHubRoutes(
            String resourceGroupName,
            String virtualHubName,
            EffectiveRoutesParameters effectiveRoutesParameters,
            Context context);

    /**
     * Gets the effective routes configured for the Virtual Hub resource or the specified resource .
     *
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the effective routes configured for the Virtual Hub resource or the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualHubEffectiveRouteListInner getEffectiveVirtualHubRoutes(String resourceGroupName, String virtualHubName);

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
     * @return the effective routes configured for the Virtual Hub resource or the specified resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualHubEffectiveRouteListInner getEffectiveVirtualHubRoutes(
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
     * @return the {@link SyncPoller} for polling of the inbound routes configured for the Virtual Hub on a particular
     *     connection.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EffectiveRouteMapRouteListInner>, EffectiveRouteMapRouteListInner> beginGetInboundRoutes(
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
     * @return the {@link SyncPoller} for polling of the inbound routes configured for the Virtual Hub on a particular
     *     connection.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EffectiveRouteMapRouteListInner>, EffectiveRouteMapRouteListInner> beginGetInboundRoutes(
        String resourceGroupName,
        String virtualHubName,
        GetInboundRoutesParameters getInboundRoutesParameters,
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
     * @return the inbound routes configured for the Virtual Hub on a particular connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EffectiveRouteMapRouteListInner getInboundRoutes(
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
     * @return the inbound routes configured for the Virtual Hub on a particular connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EffectiveRouteMapRouteListInner getInboundRoutes(
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
     * @return the {@link SyncPoller} for polling of the outbound routes configured for the Virtual Hub on a particular
     *     connection.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EffectiveRouteMapRouteListInner>, EffectiveRouteMapRouteListInner> beginGetOutboundRoutes(
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
     * @return the {@link SyncPoller} for polling of the outbound routes configured for the Virtual Hub on a particular
     *     connection.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EffectiveRouteMapRouteListInner>, EffectiveRouteMapRouteListInner> beginGetOutboundRoutes(
        String resourceGroupName,
        String virtualHubName,
        GetOutboundRoutesParameters getOutboundRoutesParameters,
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
     * @return the outbound routes configured for the Virtual Hub on a particular connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EffectiveRouteMapRouteListInner getOutboundRoutes(
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
     * @return the outbound routes configured for the Virtual Hub on a particular connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EffectiveRouteMapRouteListInner getOutboundRoutes(
        String resourceGroupName,
        String virtualHubName,
        GetOutboundRoutesParameters getOutboundRoutesParameters,
        Context context);
}
