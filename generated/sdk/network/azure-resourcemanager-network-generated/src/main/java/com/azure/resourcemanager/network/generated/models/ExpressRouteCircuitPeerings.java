// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ExpressRouteCircuitPeerings.
 */
public interface ExpressRouteCircuitPeerings {
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
    Response<ExpressRouteCircuitPeering> getWithResponse(String resourceGroupName, String circuitName,
        String peeringName, Context context);

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
    ExpressRouteCircuitPeering get(String resourceGroupName, String circuitName, String peeringName);

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
    PagedIterable<ExpressRouteCircuitPeering> list(String resourceGroupName, String circuitName);

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
    PagedIterable<ExpressRouteCircuitPeering> list(String resourceGroupName, String circuitName, Context context);

    /**
     * Gets the specified peering for the express route circuit.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified peering for the express route circuit along with {@link Response}.
     */
    ExpressRouteCircuitPeering getById(String id);

    /**
     * Gets the specified peering for the express route circuit.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified peering for the express route circuit along with {@link Response}.
     */
    Response<ExpressRouteCircuitPeering> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the specified peering from the specified express route circuit.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified peering from the specified express route circuit.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ExpressRouteCircuitPeering resource.
     * 
     * @param name resource name.
     * @return the first stage of the new ExpressRouteCircuitPeering definition.
     */
    ExpressRouteCircuitPeering.DefinitionStages.Blank define(String name);
}
