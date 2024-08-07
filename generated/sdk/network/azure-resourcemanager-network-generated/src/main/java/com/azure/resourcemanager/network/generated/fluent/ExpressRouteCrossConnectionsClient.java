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
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitsArpTableListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitsRoutesTableListResultInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner;
import com.azure.resourcemanager.network.generated.models.TagsObject;

/**
 * An instance of this class provides access to all the operations defined in ExpressRouteCrossConnectionsClient.
 */
public interface ExpressRouteCrossConnectionsClient {
    /**
     * Retrieves all the ExpressRouteCrossConnections in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRouteCrossConnection API service call as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCrossConnectionInner> list();

    /**
     * Retrieves all the ExpressRouteCrossConnections in a subscription.
     * 
     * @param filter The filter to apply on the operation. For example, you can use $filter=name eq
     * '{circuitServiceKey}'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRouteCrossConnection API service call as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCrossConnectionInner> list(String filter, Context context);

    /**
     * Retrieves all the ExpressRouteCrossConnections in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRouteCrossConnection API service call as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCrossConnectionInner> listByResourceGroup(String resourceGroupName);

    /**
     * Retrieves all the ExpressRouteCrossConnections in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListExpressRouteCrossConnection API service call as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ExpressRouteCrossConnectionInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets details about the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group (peering location of the circuit).
     * @param crossConnectionName The name of the ExpressRouteCrossConnection (service key of the circuit).
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified ExpressRouteCrossConnection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteCrossConnectionInner> getByResourceGroupWithResponse(String resourceGroupName,
        String crossConnectionName, Context context);

    /**
     * Gets details about the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group (peering location of the circuit).
     * @param crossConnectionName The name of the ExpressRouteCrossConnection (service key of the circuit).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details about the specified ExpressRouteCrossConnection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCrossConnectionInner getByResourceGroup(String resourceGroupName, String crossConnectionName);

    /**
     * Update the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param parameters Parameters supplied to the update express route crossConnection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of expressRouteCrossConnection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCrossConnectionInner>, ExpressRouteCrossConnectionInner> beginCreateOrUpdate(
        String resourceGroupName, String crossConnectionName, ExpressRouteCrossConnectionInner parameters);

    /**
     * Update the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param parameters Parameters supplied to the update express route crossConnection operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of expressRouteCrossConnection resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCrossConnectionInner>, ExpressRouteCrossConnectionInner> beginCreateOrUpdate(
        String resourceGroupName, String crossConnectionName, ExpressRouteCrossConnectionInner parameters,
        Context context);

    /**
     * Update the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param parameters Parameters supplied to the update express route crossConnection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteCrossConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCrossConnectionInner createOrUpdate(String resourceGroupName, String crossConnectionName,
        ExpressRouteCrossConnectionInner parameters);

    /**
     * Update the specified ExpressRouteCrossConnection.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param parameters Parameters supplied to the update express route crossConnection operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteCrossConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCrossConnectionInner createOrUpdate(String resourceGroupName, String crossConnectionName,
        ExpressRouteCrossConnectionInner parameters, Context context);

    /**
     * Updates an express route cross connection tags.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the cross connection.
     * @param crossConnectionParameters Parameters supplied to update express route cross connection tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteCrossConnection resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ExpressRouteCrossConnectionInner> updateTagsWithResponse(String resourceGroupName,
        String crossConnectionName, TagsObject crossConnectionParameters, Context context);

    /**
     * Updates an express route cross connection tags.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the cross connection.
     * @param crossConnectionParameters Parameters supplied to update express route cross connection tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return expressRouteCrossConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCrossConnectionInner updateTags(String resourceGroupName, String crossConnectionName,
        TagsObject crossConnectionParameters);

    /**
     * Gets the currently advertised ARP table associated with the express route cross connection in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the currently advertised ARP table associated with the express
     * route cross connection in a resource group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCircuitsArpTableListResultInner>, ExpressRouteCircuitsArpTableListResultInner>
        beginListArpTable(String resourceGroupName, String crossConnectionName, String peeringName, String devicePath);

    /**
     * Gets the currently advertised ARP table associated with the express route cross connection in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the currently advertised ARP table associated with the express
     * route cross connection in a resource group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCircuitsArpTableListResultInner>, ExpressRouteCircuitsArpTableListResultInner>
        beginListArpTable(String resourceGroupName, String crossConnectionName, String peeringName, String devicePath,
            Context context);

    /**
     * Gets the currently advertised ARP table associated with the express route cross connection in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised ARP table associated with the express route cross connection in a resource
     * group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitsArpTableListResultInner listArpTable(String resourceGroupName, String crossConnectionName,
        String peeringName, String devicePath);

    /**
     * Gets the currently advertised ARP table associated with the express route cross connection in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised ARP table associated with the express route cross connection in a resource
     * group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitsArpTableListResultInner listArpTable(String resourceGroupName, String crossConnectionName,
        String peeringName, String devicePath, Context context);

    /**
     * Gets the route table summary associated with the express route cross connection in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the route table summary associated with the express route cross
     * connection in a resource group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner>, ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner>
        beginListRoutesTableSummary(String resourceGroupName, String crossConnectionName, String peeringName,
            String devicePath);

    /**
     * Gets the route table summary associated with the express route cross connection in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the route table summary associated with the express route cross
     * connection in a resource group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner>, ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner>
        beginListRoutesTableSummary(String resourceGroupName, String crossConnectionName, String peeringName,
            String devicePath, Context context);

    /**
     * Gets the route table summary associated with the express route cross connection in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the route table summary associated with the express route cross connection in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner listRoutesTableSummary(String resourceGroupName,
        String crossConnectionName, String peeringName, String devicePath);

    /**
     * Gets the route table summary associated with the express route cross connection in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the route table summary associated with the express route cross connection in a resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCrossConnectionsRoutesTableSummaryListResultInner listRoutesTableSummary(String resourceGroupName,
        String crossConnectionName, String peeringName, String devicePath, Context context);

    /**
     * Gets the currently advertised routes table associated with the express route cross connection in a resource
     * group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the currently advertised routes table associated with the express
     * route cross connection in a resource group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCircuitsRoutesTableListResultInner>, ExpressRouteCircuitsRoutesTableListResultInner>
        beginListRoutesTable(String resourceGroupName, String crossConnectionName, String peeringName,
            String devicePath);

    /**
     * Gets the currently advertised routes table associated with the express route cross connection in a resource
     * group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the currently advertised routes table associated with the express
     * route cross connection in a resource group.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ExpressRouteCircuitsRoutesTableListResultInner>, ExpressRouteCircuitsRoutesTableListResultInner>
        beginListRoutesTable(String resourceGroupName, String crossConnectionName, String peeringName,
            String devicePath, Context context);

    /**
     * Gets the currently advertised routes table associated with the express route cross connection in a resource
     * group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised routes table associated with the express route cross connection in a resource
     * group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitsRoutesTableListResultInner listRoutesTable(String resourceGroupName, String crossConnectionName,
        String peeringName, String devicePath);

    /**
     * Gets the currently advertised routes table associated with the express route cross connection in a resource
     * group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param crossConnectionName The name of the ExpressRouteCrossConnection.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised routes table associated with the express route cross connection in a resource
     * group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ExpressRouteCircuitsRoutesTableListResultInner listRoutesTable(String resourceGroupName, String crossConnectionName,
        String peeringName, String devicePath, Context context);
}
