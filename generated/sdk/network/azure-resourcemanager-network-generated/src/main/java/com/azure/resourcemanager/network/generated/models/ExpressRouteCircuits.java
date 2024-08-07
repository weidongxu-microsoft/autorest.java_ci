// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ExpressRouteCircuits.
 */
public interface ExpressRouteCircuits {
    /**
     * Deletes the specified express route circuit.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String circuitName);

    /**
     * Deletes the specified express route circuit.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String circuitName, Context context);

    /**
     * Gets information about the specified express route circuit.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of express route circuit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified express route circuit along with {@link Response}.
     */
    Response<ExpressRouteCircuit> getByResourceGroupWithResponse(String resourceGroupName, String circuitName,
        Context context);

    /**
     * Gets information about the specified express route circuit.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of express route circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified express route circuit.
     */
    ExpressRouteCircuit getByResourceGroup(String resourceGroupName, String circuitName);

    /**
     * Gets the currently advertised ARP table associated with the express route circuit in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised ARP table associated with the express route circuit in a resource group.
     */
    ExpressRouteCircuitsArpTableListResult listArpTable(String resourceGroupName, String circuitName,
        String peeringName, String devicePath);

    /**
     * Gets the currently advertised ARP table associated with the express route circuit in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised ARP table associated with the express route circuit in a resource group.
     */
    ExpressRouteCircuitsArpTableListResult listArpTable(String resourceGroupName, String circuitName,
        String peeringName, String devicePath, Context context);

    /**
     * Gets the currently advertised routes table associated with the express route circuit in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised routes table associated with the express route circuit in a resource group.
     */
    ExpressRouteCircuitsRoutesTableListResult listRoutesTable(String resourceGroupName, String circuitName,
        String peeringName, String devicePath);

    /**
     * Gets the currently advertised routes table associated with the express route circuit in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised routes table associated with the express route circuit in a resource group.
     */
    ExpressRouteCircuitsRoutesTableListResult listRoutesTable(String resourceGroupName, String circuitName,
        String peeringName, String devicePath, Context context);

    /**
     * Gets the currently advertised routes table summary associated with the express route circuit in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised routes table summary associated with the express route circuit in a resource
     * group.
     */
    ExpressRouteCircuitsRoutesTableSummaryListResult listRoutesTableSummary(String resourceGroupName,
        String circuitName, String peeringName, String devicePath);

    /**
     * Gets the currently advertised routes table summary associated with the express route circuit in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the currently advertised routes table summary associated with the express route circuit in a resource
     * group.
     */
    ExpressRouteCircuitsRoutesTableSummaryListResult listRoutesTableSummary(String resourceGroupName,
        String circuitName, String peeringName, String devicePath, Context context);

    /**
     * Gets all the stats from an express route circuit in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the stats from an express route circuit in a resource group along with {@link Response}.
     */
    Response<ExpressRouteCircuitStats> getStatsWithResponse(String resourceGroupName, String circuitName,
        Context context);

    /**
     * Gets all the stats from an express route circuit in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the stats from an express route circuit in a resource group.
     */
    ExpressRouteCircuitStats getStats(String resourceGroupName, String circuitName);

    /**
     * Gets all stats from an express route circuit in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all stats from an express route circuit in a resource group along with {@link Response}.
     */
    Response<ExpressRouteCircuitStats> getPeeringStatsWithResponse(String resourceGroupName, String circuitName,
        String peeringName, Context context);

    /**
     * Gets all stats from an express route circuit in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all stats from an express route circuit in a resource group.
     */
    ExpressRouteCircuitStats getPeeringStats(String resourceGroupName, String circuitName, String peeringName);

    /**
     * Gets all the express route circuits in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the express route circuits in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ExpressRouteCircuit> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all the express route circuits in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the express route circuits in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ExpressRouteCircuit> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the express route circuits in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the express route circuits in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ExpressRouteCircuit> list();

    /**
     * Gets all the express route circuits in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the express route circuits in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ExpressRouteCircuit> list(Context context);

    /**
     * Gets information about the specified express route circuit.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified express route circuit along with {@link Response}.
     */
    ExpressRouteCircuit getById(String id);

    /**
     * Gets information about the specified express route circuit.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return information about the specified express route circuit along with {@link Response}.
     */
    Response<ExpressRouteCircuit> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified express route circuit.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified express route circuit.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ExpressRouteCircuit resource.
     * 
     * @param name resource name.
     * @return the first stage of the new ExpressRouteCircuit definition.
     */
    ExpressRouteCircuit.DefinitionStages.Blank define(String name);
}
