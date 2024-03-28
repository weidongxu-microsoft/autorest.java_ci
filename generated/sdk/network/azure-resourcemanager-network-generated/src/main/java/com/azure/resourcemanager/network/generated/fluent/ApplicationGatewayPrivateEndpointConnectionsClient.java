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
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayPrivateEndpointConnectionInner;

/**
 * An instance of this class provides access to all the operations defined in
 * ApplicationGatewayPrivateEndpointConnectionsClient.
 */
public interface ApplicationGatewayPrivateEndpointConnectionsClient {
    /**
     * Deletes the specified private endpoint connection on application gateway.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String applicationGatewayName,
        String connectionName);

    /**
     * Deletes the specified private endpoint connection on application gateway.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String applicationGatewayName,
        String connectionName, Context context);

    /**
     * Deletes the specified private endpoint connection on application gateway.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String applicationGatewayName, String connectionName);

    /**
     * Deletes the specified private endpoint connection on application gateway.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String applicationGatewayName, String connectionName, Context context);

    /**
     * Updates the specified private endpoint connection on application gateway.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @param parameters Parameters supplied to update application gateway private endpoint connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of private Endpoint connection on an application gateway.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ApplicationGatewayPrivateEndpointConnectionInner>, ApplicationGatewayPrivateEndpointConnectionInner>
        beginUpdate(String resourceGroupName, String applicationGatewayName, String connectionName,
            ApplicationGatewayPrivateEndpointConnectionInner parameters);

    /**
     * Updates the specified private endpoint connection on application gateway.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @param parameters Parameters supplied to update application gateway private endpoint connection operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of private Endpoint connection on an application gateway.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<ApplicationGatewayPrivateEndpointConnectionInner>, ApplicationGatewayPrivateEndpointConnectionInner>
        beginUpdate(String resourceGroupName, String applicationGatewayName, String connectionName,
            ApplicationGatewayPrivateEndpointConnectionInner parameters, Context context);

    /**
     * Updates the specified private endpoint connection on application gateway.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @param parameters Parameters supplied to update application gateway private endpoint connection operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private Endpoint connection on an application gateway.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationGatewayPrivateEndpointConnectionInner update(String resourceGroupName, String applicationGatewayName,
        String connectionName, ApplicationGatewayPrivateEndpointConnectionInner parameters);

    /**
     * Updates the specified private endpoint connection on application gateway.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @param parameters Parameters supplied to update application gateway private endpoint connection operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private Endpoint connection on an application gateway.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationGatewayPrivateEndpointConnectionInner update(String resourceGroupName, String applicationGatewayName,
        String connectionName, ApplicationGatewayPrivateEndpointConnectionInner parameters, Context context);

    /**
     * Gets the specified private endpoint connection on application gateway.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection on application gateway along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<ApplicationGatewayPrivateEndpointConnectionInner> getWithResponse(String resourceGroupName,
        String applicationGatewayName, String connectionName, Context context);

    /**
     * Gets the specified private endpoint connection on application gateway.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param connectionName The name of the application gateway private endpoint connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private endpoint connection on application gateway.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApplicationGatewayPrivateEndpointConnectionInner get(String resourceGroupName, String applicationGatewayName,
        String connectionName);

    /**
     * Lists all private endpoint connections on an application gateway.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListApplicationGatewayPrivateEndpointConnection API service call as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationGatewayPrivateEndpointConnectionInner> list(String resourceGroupName,
        String applicationGatewayName);

    /**
     * Lists all private endpoint connections on an application gateway.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param applicationGatewayName The name of the application gateway.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListApplicationGatewayPrivateEndpointConnection API service call as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApplicationGatewayPrivateEndpointConnectionInner> list(String resourceGroupName,
        String applicationGatewayName, Context context);
}
