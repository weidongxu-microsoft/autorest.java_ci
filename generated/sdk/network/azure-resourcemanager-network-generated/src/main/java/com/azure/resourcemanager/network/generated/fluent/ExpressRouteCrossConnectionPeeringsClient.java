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
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionPeeringInner;

/**
 * An instance of this class provides access to all the operations defined in ExpressRouteCrossConnectionPeeringsClient.
 */
public interface ExpressRouteCrossConnectionPeeringsClient {
    /**
     * Gets all peerings in a specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all peerings in a specified ExpressRouteCrossConnection as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCrossConnectionPeeringInner> list(String resourceGroupName, String crossConnectionName);

    /**
     * Gets all peerings in a specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all peerings in a specified ExpressRouteCrossConnection as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCrossConnectionPeeringInner> list(String resourceGroupName, String crossConnectionName,
        Context context);

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String crossConnectionName,
        String peeringName);

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String crossConnectionName,
        String peeringName, Context context);

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String crossConnectionName, String peeringName);

    /**
     * Deletes the specified peering from the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String crossConnectionName, String peeringName, Context context);

    /**
     * Gets the specified peering for the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified peering for the ExpressRouteCrossConnection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteCrossConnectionPeeringInner> getWithResponse(String resourceGroupName,
        String crossConnectionName, String peeringName, Context context);

    /**
     * Gets the specified peering for the ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified peering for the ExpressRouteCrossConnection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCrossConnectionPeeringInner get(String resourceGroupName, String crossConnectionName,
        String peeringName);

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update ExpressRouteCrossConnection peering operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of peering in an ExpressRoute Cross Connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCrossConnectionPeeringInner>, ExpressRouteCrossConnectionPeeringInner>
        beginCreateOrUpdate(String resourceGroupName, String crossConnectionName, String peeringName,
            ExpressRouteCrossConnectionPeeringInner peeringParameters);

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update ExpressRouteCrossConnection peering operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of peering in an ExpressRoute Cross Connection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCrossConnectionPeeringInner>, ExpressRouteCrossConnectionPeeringInner>
        beginCreateOrUpdate(String resourceGroupName, String crossConnectionName, String peeringName,
            ExpressRouteCrossConnectionPeeringInner peeringParameters, Context context);

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update ExpressRouteCrossConnection peering operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRoute Cross Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCrossConnectionPeeringInner createOrUpdate(String resourceGroupName, String crossConnectionName,
        String peeringName, ExpressRouteCrossConnectionPeeringInner peeringParameters);

    /**
     * Creates or updates a peering in the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update ExpressRouteCrossConnection peering operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRoute Cross Connection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCrossConnectionPeeringInner createOrUpdate(String resourceGroupName, String crossConnectionName,
        String peeringName, ExpressRouteCrossConnectionPeeringInner peeringParameters, Context context);
}
