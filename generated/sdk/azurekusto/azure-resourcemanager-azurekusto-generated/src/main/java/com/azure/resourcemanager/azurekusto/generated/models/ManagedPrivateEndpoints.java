// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of ManagedPrivateEndpoints. */
public interface ManagedPrivateEndpoints {
    /**
     * Checks that the managed private endpoints resource name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param resourceName The name of the resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request along with {@link Response}.
     */
    Response<CheckNameResult> checkNameAvailabilityWithResponse(
        String resourceGroupName,
        String clusterName,
        ManagedPrivateEndpointsCheckNameRequest resourceName,
        Context context);

    /**
     * Checks that the managed private endpoints resource name is valid and is not already in use.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param resourceName The name of the resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a check name availability request.
     */
    CheckNameResult checkNameAvailability(
        String resourceGroupName, String clusterName, ManagedPrivateEndpointsCheckNameRequest resourceName);

    /**
     * Returns the list of managed private endpoints.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list managed private endpoints operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ManagedPrivateEndpoint> list(String resourceGroupName, String clusterName);

    /**
     * Returns the list of managed private endpoints.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list managed private endpoints operation response as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ManagedPrivateEndpoint> list(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets a managed private endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param managedPrivateEndpointName The name of the managed private endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed private endpoint along with {@link Response}.
     */
    Response<ManagedPrivateEndpoint> getWithResponse(
        String resourceGroupName, String clusterName, String managedPrivateEndpointName, Context context);

    /**
     * Gets a managed private endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param managedPrivateEndpointName The name of the managed private endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed private endpoint.
     */
    ManagedPrivateEndpoint get(String resourceGroupName, String clusterName, String managedPrivateEndpointName);

    /**
     * Deletes a managed private endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param managedPrivateEndpointName The name of the managed private endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, String managedPrivateEndpointName);

    /**
     * Deletes a managed private endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param managedPrivateEndpointName The name of the managed private endpoint.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String clusterName, String managedPrivateEndpointName, Context context);

    /**
     * Gets a managed private endpoint.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed private endpoint along with {@link Response}.
     */
    ManagedPrivateEndpoint getById(String id);

    /**
     * Gets a managed private endpoint.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a managed private endpoint along with {@link Response}.
     */
    Response<ManagedPrivateEndpoint> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a managed private endpoint.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a managed private endpoint.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ManagedPrivateEndpoint resource.
     *
     * @param name resource name.
     * @return the first stage of the new ManagedPrivateEndpoint definition.
     */
    ManagedPrivateEndpoint.DefinitionStages.Blank define(String name);
}
