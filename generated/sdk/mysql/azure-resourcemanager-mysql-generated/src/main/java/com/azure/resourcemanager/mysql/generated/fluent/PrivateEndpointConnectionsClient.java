// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.mysql.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.mysql.generated.models.TagsObject;

/** An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient. */
public interface PrivateEndpointConnectionsClient {
    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner get(
        String resourceGroupName, String serverName, String privateEndpointConnectionName);

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getWithResponse(
        String resourceGroupName, String serverName, String privateEndpointConnectionName, Context context);

    /**
     * Approve or reject a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters A private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serverName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters);

    /**
     * Approve or reject a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters A private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String serverName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters,
        Context context);

    /**
     * Approve or reject a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters A private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters);

    /**
     * Approve or reject a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters A private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner createOrUpdate(
        String resourceGroupName,
        String serverName,
        String privateEndpointConnectionName,
        PrivateEndpointConnectionInner parameters,
        Context context);

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serverName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serverName, String privateEndpointConnectionName, Context context);

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String privateEndpointConnectionName, Context context);

    /**
     * Updates tags on private endpoint connection.
     *
     * <p>Updates private endpoint connection with the specified tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters Parameters supplied to the Update private endpoint connection Tags operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginUpdateTags(
        String resourceGroupName, String serverName, String privateEndpointConnectionName, TagsObject parameters);

    /**
     * Updates tags on private endpoint connection.
     *
     * <p>Updates private endpoint connection with the specified tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters Parameters supplied to the Update private endpoint connection Tags operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginUpdateTags(
        String resourceGroupName,
        String serverName,
        String privateEndpointConnectionName,
        TagsObject parameters,
        Context context);

    /**
     * Updates tags on private endpoint connection.
     *
     * <p>Updates private endpoint connection with the specified tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters Parameters supplied to the Update private endpoint connection Tags operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner updateTags(
        String resourceGroupName, String serverName, String privateEndpointConnectionName, TagsObject parameters);

    /**
     * Updates tags on private endpoint connection.
     *
     * <p>Updates private endpoint connection with the specified tags.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param privateEndpointConnectionName The privateEndpointConnectionName parameter.
     * @param parameters Parameters supplied to the Update private endpoint connection Tags operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner updateTags(
        String resourceGroupName,
        String serverName,
        String privateEndpointConnectionName,
        TagsObject parameters,
        Context context);

    /**
     * Gets all private endpoint connections on a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoint connections on a server as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listByServer(String resourceGroupName, String serverName);

    /**
     * Gets all private endpoint connections on a server.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoint connections on a server as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listByServer(
        String resourceGroupName, String serverName, Context context);
}
