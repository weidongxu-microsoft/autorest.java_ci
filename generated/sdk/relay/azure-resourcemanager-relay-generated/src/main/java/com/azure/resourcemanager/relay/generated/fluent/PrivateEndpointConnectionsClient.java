// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.relay.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.relay.generated.fluent.models.PrivateEndpointConnectionInner;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient. */
public interface PrivateEndpointConnectionsClient {
    /**
     * Gets the available PrivateEndpointConnections within a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available PrivateEndpointConnections within a namespace as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> list(String resourceGroupName, String namespaceName);

    /**
     * Gets the available PrivateEndpointConnections within a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the available PrivateEndpointConnections within a namespace as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> list(String resourceGroupName, String namespaceName, Context context);

    /**
     * Creates or updates PrivateEndpointConnections of service namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param privateEndpointConnectionName The PrivateEndpointConnection name.
     * @param parameters Parameters supplied to update Status of PrivateEndPoint Connection to namespace resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the PrivateEndpointConnection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> createOrUpdateWithResponse(
        String resourceGroupName,
        String namespaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters,
        Context context);

    /**
     * Creates or updates PrivateEndpointConnections of service namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param privateEndpointConnectionName The PrivateEndpointConnection name.
     * @param parameters Parameters supplied to update Status of PrivateEndPoint Connection to namespace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of the PrivateEndpointConnection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner createOrUpdate(
        String resourceGroupName,
        String namespaceName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param privateEndpointConnectionName The PrivateEndpointConnection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String namespaceName, String privateEndpointConnectionName);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param privateEndpointConnectionName The PrivateEndpointConnection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String namespaceName, String privateEndpointConnectionName, Context context);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param privateEndpointConnectionName The PrivateEndpointConnection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String privateEndpointConnectionName);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param privateEndpointConnectionName The PrivateEndpointConnection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String privateEndpointConnectionName, Context context);

    /**
     * Gets a description for the specified Private Endpoint Connection name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param privateEndpointConnectionName The PrivateEndpointConnection name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a description for the specified Private Endpoint Connection name along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getWithResponse(
        String resourceGroupName, String namespaceName, String privateEndpointConnectionName, Context context);

    /**
     * Gets a description for the specified Private Endpoint Connection name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name.
     * @param privateEndpointConnectionName The PrivateEndpointConnection name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a description for the specified Private Endpoint Connection name.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner get(
        String resourceGroupName, String namespaceName, String privateEndpointConnectionName);
}
