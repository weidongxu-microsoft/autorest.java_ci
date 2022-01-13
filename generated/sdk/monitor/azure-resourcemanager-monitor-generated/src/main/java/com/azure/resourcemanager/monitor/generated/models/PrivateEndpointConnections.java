// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of PrivateEndpointConnections. */
public interface PrivateEndpointConnections {
    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection.
     */
    PrivateEndpointConnection get(String resourceGroupName, String scopeName, String privateEndpointConnectionName);

    /**
     * Gets a private endpoint connection.
     *
     * @param resourceGroupName The name of the resource group.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response}.
     */
    Response<PrivateEndpointConnection> getWithResponse(
        String resourceGroupName, String scopeName, String privateEndpointConnectionName, Context context);

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String scopeName, String privateEndpointConnectionName);

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param privateEndpointConnectionName The name of the private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String scopeName, String privateEndpointConnectionName, Context context);

    /**
     * Gets all private endpoint connections on a private link scope.
     *
     * @param resourceGroupName The name of the resource group.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoint connections on a private link scope.
     */
    PagedIterable<PrivateEndpointConnection> listByPrivateLinkScope(String resourceGroupName, String scopeName);

    /**
     * Gets all private endpoint connections on a private link scope.
     *
     * @param resourceGroupName The name of the resource group.
     * @param scopeName The name of the Azure Monitor PrivateLinkScope resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoint connections on a private link scope.
     */
    PagedIterable<PrivateEndpointConnection> listByPrivateLinkScope(
        String resourceGroupName, String scopeName, Context context);

    /**
     * Gets a private endpoint connection.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response}.
     */
    PrivateEndpointConnection getById(String id);

    /**
     * Gets a private endpoint connection.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private endpoint connection along with {@link Response}.
     */
    Response<PrivateEndpointConnection> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a private endpoint connection with a given name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PrivateEndpointConnection resource.
     *
     * @param name resource name.
     * @return the first stage of the new PrivateEndpointConnection definition.
     */
    PrivateEndpointConnection.DefinitionStages.Blank define(String name);
}
