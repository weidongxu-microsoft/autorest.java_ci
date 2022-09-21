// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of Clusters. */
public interface Clusters {
    /**
     * Gets Log Analytics clusters in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log Analytics clusters in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> listByResourceGroup(String resourceGroupName);

    /**
     * Gets Log Analytics clusters in a resource group.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return log Analytics clusters in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the Log Analytics clusters in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Log Analytics clusters in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> list();

    /**
     * Gets the Log Analytics clusters in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Log Analytics clusters in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Cluster> list(Context context);

    /**
     * Deletes a cluster instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Name of the Log Analytics Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Deletes a cluster instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Name of the Log Analytics Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets a Log Analytics cluster instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Name of the Log Analytics Cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Log Analytics cluster instance along with {@link Response}.
     */
    Response<Cluster> getByResourceGroupWithResponse(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets a Log Analytics cluster instance.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName Name of the Log Analytics Cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Log Analytics cluster instance.
     */
    Cluster getByResourceGroup(String resourceGroupName, String clusterName);

    /**
     * Gets a Log Analytics cluster instance.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Log Analytics cluster instance along with {@link Response}.
     */
    Cluster getById(String id);

    /**
     * Gets a Log Analytics cluster instance.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Log Analytics cluster instance along with {@link Response}.
     */
    Response<Cluster> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a cluster instance.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a cluster instance.
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
