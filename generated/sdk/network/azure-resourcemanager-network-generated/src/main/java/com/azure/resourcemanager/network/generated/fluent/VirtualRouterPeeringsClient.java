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
import com.azure.resourcemanager.network.generated.fluent.models.VirtualRouterPeeringInner;

/**
 * An instance of this class provides access to all the operations defined in VirtualRouterPeeringsClient.
 */
public interface VirtualRouterPeeringsClient {
    /**
     * Deletes the specified peering from a Virtual Router.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualRouterName,
        String peeringName);

    /**
     * Deletes the specified peering from a Virtual Router.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualRouterName,
        String peeringName, Context context);

    /**
     * Deletes the specified peering from a Virtual Router.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualRouterName, String peeringName);

    /**
     * Deletes the specified peering from a Virtual Router.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualRouterName, String peeringName, Context context);

    /**
     * Gets the specified Virtual Router Peering.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param peeringName The name of the Virtual Router Peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Virtual Router Peering along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<VirtualRouterPeeringInner> getWithResponse(String resourceGroupName, String virtualRouterName,
        String peeringName, Context context);

    /**
     * Gets the specified Virtual Router Peering.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param peeringName The name of the Virtual Router Peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Virtual Router Peering.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualRouterPeeringInner get(String resourceGroupName, String virtualRouterName, String peeringName);

    /**
     * Creates or updates the specified Virtual Router Peering.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param peeringName The name of the Virtual Router Peering.
     * @param parameters Parameters supplied to the create or update Virtual Router Peering operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of virtual Router Peering resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualRouterPeeringInner>, VirtualRouterPeeringInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualRouterName, String peeringName, VirtualRouterPeeringInner parameters);

    /**
     * Creates or updates the specified Virtual Router Peering.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param peeringName The name of the Virtual Router Peering.
     * @param parameters Parameters supplied to the create or update Virtual Router Peering operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of virtual Router Peering resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<VirtualRouterPeeringInner>, VirtualRouterPeeringInner> beginCreateOrUpdate(
        String resourceGroupName, String virtualRouterName, String peeringName, VirtualRouterPeeringInner parameters,
        Context context);

    /**
     * Creates or updates the specified Virtual Router Peering.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param peeringName The name of the Virtual Router Peering.
     * @param parameters Parameters supplied to the create or update Virtual Router Peering operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Router Peering resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualRouterPeeringInner createOrUpdate(String resourceGroupName, String virtualRouterName, String peeringName,
        VirtualRouterPeeringInner parameters);

    /**
     * Creates or updates the specified Virtual Router Peering.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param peeringName The name of the Virtual Router Peering.
     * @param parameters Parameters supplied to the create or update Virtual Router Peering operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return virtual Router Peering resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    VirtualRouterPeeringInner createOrUpdate(String resourceGroupName, String virtualRouterName, String peeringName,
        VirtualRouterPeeringInner parameters, Context context);

    /**
     * Lists all Virtual Router Peerings in a Virtual Router resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListVirtualRouterPeerings API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualRouterPeeringInner> list(String resourceGroupName, String virtualRouterName);

    /**
     * Lists all Virtual Router Peerings in a Virtual Router resource.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param virtualRouterName The name of the Virtual Router.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListVirtualRouterPeerings API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<VirtualRouterPeeringInner> list(String resourceGroupName, String virtualRouterName, Context context);
}
