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
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitPeeringInner;

/** An instance of this class provides access to all the operations defined in ExpressRouteCircuitPeeringsClient. */
public interface ExpressRouteCircuitPeeringsClient {
    /**
     * Deletes the specified peering from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String circuitName, String peeringName);

    /**
     * Deletes the specified peering from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String circuitName, String peeringName, Context context);

    /**
     * Deletes the specified peering from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String circuitName, String peeringName);

    /**
     * Deletes the specified peering from the specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String circuitName, String peeringName, Context context);

    /**
     * Gets the specified peering for the express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified peering for the express route circuit along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteCircuitPeeringInner> getWithResponse(
        String resourceGroupName, String circuitName, String peeringName, Context context);

    /**
     * Gets the specified peering for the express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified peering for the express route circuit.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitPeeringInner get(String resourceGroupName, String circuitName, String peeringName);

    /**
     * Creates or updates a peering in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update express route circuit peering operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of peering in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCircuitPeeringInner>, ExpressRouteCircuitPeeringInner> beginCreateOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        ExpressRouteCircuitPeeringInner peeringParameters);

    /**
     * Creates or updates a peering in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update express route circuit peering operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of peering in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCircuitPeeringInner>, ExpressRouteCircuitPeeringInner> beginCreateOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        ExpressRouteCircuitPeeringInner peeringParameters,
        Context context);

    /**
     * Creates or updates a peering in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update express route circuit peering operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitPeeringInner createOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        ExpressRouteCircuitPeeringInner peeringParameters);

    /**
     * Creates or updates a peering in the specified express route circuits.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param peeringParameters Parameters supplied to the create or update express route circuit peering operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return peering in an ExpressRouteCircuit resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitPeeringInner createOrUpdate(
        String resourceGroupName,
        String circuitName,
        String peeringName,
        ExpressRouteCircuitPeeringInner peeringParameters,
        Context context);

    /**
     * Gets all peerings in a specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all peerings in a specified express route circuit as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCircuitPeeringInner> list(String resourceGroupName, String circuitName);

    /**
     * Gets all peerings in a specified express route circuit.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all peerings in a specified express route circuit as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCircuitPeeringInner> list(String resourceGroupName, String circuitName, Context context);
}
