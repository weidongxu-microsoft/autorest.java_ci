// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Clusters.
 */
public interface Clusters {
    /**
     * List the quantity of available pre-provisioned Event Hubs Clusters, indexed by Azure region.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Available Clusters operation along with {@link Response}.
     */
    Response<AvailableClustersList> listAvailableClusterRegionWithResponse(Context context);

    /**
     * List the quantity of available pre-provisioned Event Hubs Clusters, indexed by Azure region.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Available Clusters operation.
     */
    AvailableClustersList listAvailableClusterRegion();

    /**
     * Lists the available Event Hubs Clusters within an ARM resource group.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Event Hubs Clusters operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> list();

    /**
     * Lists the available Event Hubs Clusters within an ARM resource group.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Event Hubs Clusters operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> list(Context context);

    /**
     * Lists the available Event Hubs Clusters within an ARM resource group.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Event Hubs Clusters operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> listByResourceGroup(String resourceGroupName);

    /**
     * Lists the available Event Hubs Clusters within an ARM resource group.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Event Hubs Clusters operation as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the resource description of the specified Event Hubs Cluster.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource description of the specified Event Hubs Cluster along with {@link Response}.
     */
    Response<Cluster> getByResourceGroupWithResponse(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets the resource description of the specified Event Hubs Cluster.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource description of the specified Event Hubs Cluster.
     */
    Cluster getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Deletes an existing Event Hubs Cluster. This operation is idempotent.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Deletes an existing Event Hubs Cluster. This operation is idempotent.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, Context context);

    /**
     * List all Event Hubs Namespace IDs in an Event Hubs Dedicated Cluster.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace IDs operation along with {@link Response}.
     */
    Response<EHNamespaceIdListResult> listNamespacesWithResponse(String resourceGroupName, String clusterName,
        Context context);

    /**
     * List all Event Hubs Namespace IDs in an Event Hubs Dedicated Cluster.
     * 
     * @param resourceGroupName Name of the resource group within the azure subscription.
     * @param clusterName The name of the Event Hubs Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response of the List Namespace IDs operation.
     */
    EHNamespaceIdListResult listNamespaces(String resourceGroupName, String clusterName);

    /**
     * Gets the resource description of the specified Event Hubs Cluster.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource description of the specified Event Hubs Cluster along with {@link Response}.
     */
    Cluster getById(String id);

    /**
     * Gets the resource description of the specified Event Hubs Cluster.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the resource description of the specified Event Hubs Cluster along with {@link Response}.
     */
    Response<Cluster> getByIdWithResponse(String id, Context context);

    /**
     * Deletes an existing Event Hubs Cluster. This operation is idempotent.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes an existing Event Hubs Cluster. This operation is idempotent.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Cluster resource.
     * 
     * @param name resource name.
     * @return the first stage of the new Cluster definition.
     */
    Cluster.DefinitionStages.Blank define(String name);
}
