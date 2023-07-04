// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.CheckNameResultInner;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.ManagedPrivateEndpointInner;
import com.azure.resourcemanager.azurekusto.generated.models.ManagedPrivateEndpointsCheckNameRequest;

/** An instance of this class provides access to all the operations defined in ManagedPrivateEndpointsClient. */
public interface ManagedPrivateEndpointsClient {
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameResultInner> checkNameAvailabilityWithResponse(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameResultInner checkNameAvailability(
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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedPrivateEndpointInner> list(String resourceGroupName, String clusterName);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ManagedPrivateEndpointInner> list(String resourceGroupName, String clusterName, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ManagedPrivateEndpointInner> getWithResponse(
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedPrivateEndpointInner get(String resourceGroupName, String clusterName, String managedPrivateEndpointName);

    /**
     * Creates a managed private endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param managedPrivateEndpointName The name of the managed private endpoint.
     * @param parameters The managed private endpoint parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a managed private endpoint.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedPrivateEndpointInner>, ManagedPrivateEndpointInner> beginCreateOrUpdate(
        String resourceGroupName,
        String clusterName,
        String managedPrivateEndpointName,
        ManagedPrivateEndpointInner parameters);

    /**
     * Creates a managed private endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param managedPrivateEndpointName The name of the managed private endpoint.
     * @param parameters The managed private endpoint parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a managed private endpoint.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedPrivateEndpointInner>, ManagedPrivateEndpointInner> beginCreateOrUpdate(
        String resourceGroupName,
        String clusterName,
        String managedPrivateEndpointName,
        ManagedPrivateEndpointInner parameters,
        Context context);

    /**
     * Creates a managed private endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param managedPrivateEndpointName The name of the managed private endpoint.
     * @param parameters The managed private endpoint parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a managed private endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedPrivateEndpointInner createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String managedPrivateEndpointName,
        ManagedPrivateEndpointInner parameters);

    /**
     * Creates a managed private endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param managedPrivateEndpointName The name of the managed private endpoint.
     * @param parameters The managed private endpoint parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a managed private endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedPrivateEndpointInner createOrUpdate(
        String resourceGroupName,
        String clusterName,
        String managedPrivateEndpointName,
        ManagedPrivateEndpointInner parameters,
        Context context);

    /**
     * Updates a managed private endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param managedPrivateEndpointName The name of the managed private endpoint.
     * @param parameters The managed private endpoint parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a managed private endpoint.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedPrivateEndpointInner>, ManagedPrivateEndpointInner> beginUpdate(
        String resourceGroupName,
        String clusterName,
        String managedPrivateEndpointName,
        ManagedPrivateEndpointInner parameters);

    /**
     * Updates a managed private endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param managedPrivateEndpointName The name of the managed private endpoint.
     * @param parameters The managed private endpoint parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of class representing a managed private endpoint.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ManagedPrivateEndpointInner>, ManagedPrivateEndpointInner> beginUpdate(
        String resourceGroupName,
        String clusterName,
        String managedPrivateEndpointName,
        ManagedPrivateEndpointInner parameters,
        Context context);

    /**
     * Updates a managed private endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param managedPrivateEndpointName The name of the managed private endpoint.
     * @param parameters The managed private endpoint parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a managed private endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedPrivateEndpointInner update(
        String resourceGroupName,
        String clusterName,
        String managedPrivateEndpointName,
        ManagedPrivateEndpointInner parameters);

    /**
     * Updates a managed private endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param managedPrivateEndpointName The name of the managed private endpoint.
     * @param parameters The managed private endpoint parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return class representing a managed private endpoint.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ManagedPrivateEndpointInner update(
        String resourceGroupName,
        String clusterName,
        String managedPrivateEndpointName,
        ManagedPrivateEndpointInner parameters,
        Context context);

    /**
     * Deletes a managed private endpoint.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param managedPrivateEndpointName The name of the managed private endpoint.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String managedPrivateEndpointName);

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
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String clusterName, String managedPrivateEndpointName, Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String clusterName, String managedPrivateEndpointName, Context context);
}
