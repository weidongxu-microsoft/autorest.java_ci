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
import com.azure.resourcemanager.network.generated.fluent.models.RoutingIntentInner;

/**
 * An instance of this class provides access to all the operations defined in RoutingIntentsClient.
 */
public interface RoutingIntentsClient {
    /**
     * Creates a RoutingIntent resource if it doesn't exist else updates the existing RoutingIntent.
     * 
     * @param resourceGroupName The resource group name of the RoutingIntent.
     * @param virtualHubName The name of the VirtualHub.
     * @param routingIntentName The name of the per VirtualHub singleton Routing Intent resource.
     * @param routingIntentParameters Parameters supplied to create or update RoutingIntent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the routing intent child resource of a Virtual hub.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RoutingIntentInner>, RoutingIntentInner> beginCreateOrUpdate(String resourceGroupName,
        String virtualHubName, String routingIntentName, RoutingIntentInner routingIntentParameters);

    /**
     * Creates a RoutingIntent resource if it doesn't exist else updates the existing RoutingIntent.
     * 
     * @param resourceGroupName The resource group name of the RoutingIntent.
     * @param virtualHubName The name of the VirtualHub.
     * @param routingIntentName The name of the per VirtualHub singleton Routing Intent resource.
     * @param routingIntentParameters Parameters supplied to create or update RoutingIntent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the routing intent child resource of a Virtual hub.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<RoutingIntentInner>, RoutingIntentInner> beginCreateOrUpdate(String resourceGroupName,
        String virtualHubName, String routingIntentName, RoutingIntentInner routingIntentParameters, Context context);

    /**
     * Creates a RoutingIntent resource if it doesn't exist else updates the existing RoutingIntent.
     * 
     * @param resourceGroupName The resource group name of the RoutingIntent.
     * @param virtualHubName The name of the VirtualHub.
     * @param routingIntentName The name of the per VirtualHub singleton Routing Intent resource.
     * @param routingIntentParameters Parameters supplied to create or update RoutingIntent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the routing intent child resource of a Virtual hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoutingIntentInner createOrUpdate(String resourceGroupName, String virtualHubName, String routingIntentName,
        RoutingIntentInner routingIntentParameters);

    /**
     * Creates a RoutingIntent resource if it doesn't exist else updates the existing RoutingIntent.
     * 
     * @param resourceGroupName The resource group name of the RoutingIntent.
     * @param virtualHubName The name of the VirtualHub.
     * @param routingIntentName The name of the per VirtualHub singleton Routing Intent resource.
     * @param routingIntentParameters Parameters supplied to create or update RoutingIntent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the routing intent child resource of a Virtual hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoutingIntentInner createOrUpdate(String resourceGroupName, String virtualHubName, String routingIntentName,
        RoutingIntentInner routingIntentParameters, Context context);

    /**
     * Retrieves the details of a RoutingIntent.
     * 
     * @param resourceGroupName The resource group name of the RoutingIntent.
     * @param virtualHubName The name of the VirtualHub.
     * @param routingIntentName The name of the RoutingIntent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the routing intent child resource of a Virtual hub along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoutingIntentInner> getWithResponse(String resourceGroupName, String virtualHubName,
        String routingIntentName, Context context);

    /**
     * Retrieves the details of a RoutingIntent.
     * 
     * @param resourceGroupName The resource group name of the RoutingIntent.
     * @param virtualHubName The name of the VirtualHub.
     * @param routingIntentName The name of the RoutingIntent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the routing intent child resource of a Virtual hub.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoutingIntentInner get(String resourceGroupName, String virtualHubName, String routingIntentName);

    /**
     * Deletes a RoutingIntent.
     * 
     * @param resourceGroupName The resource group name of the RoutingIntent.
     * @param virtualHubName The name of the VirtualHub.
     * @param routingIntentName The name of the RoutingIntent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualHubName,
        String routingIntentName);

    /**
     * Deletes a RoutingIntent.
     * 
     * @param resourceGroupName The resource group name of the RoutingIntent.
     * @param virtualHubName The name of the VirtualHub.
     * @param routingIntentName The name of the RoutingIntent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String virtualHubName,
        String routingIntentName, Context context);

    /**
     * Deletes a RoutingIntent.
     * 
     * @param resourceGroupName The resource group name of the RoutingIntent.
     * @param virtualHubName The name of the VirtualHub.
     * @param routingIntentName The name of the RoutingIntent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualHubName, String routingIntentName);

    /**
     * Deletes a RoutingIntent.
     * 
     * @param resourceGroupName The resource group name of the RoutingIntent.
     * @param virtualHubName The name of the VirtualHub.
     * @param routingIntentName The name of the RoutingIntent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String virtualHubName, String routingIntentName, Context context);

    /**
     * Retrieves the details of all RoutingIntent child resources of the VirtualHub.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the routing intent result and a URL nextLink to get the next set of results as paginated response
     * with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoutingIntentInner> list(String resourceGroupName, String virtualHubName);

    /**
     * Retrieves the details of all RoutingIntent child resources of the VirtualHub.
     * 
     * @param resourceGroupName The resource group name of the VirtualHub.
     * @param virtualHubName The name of the VirtualHub.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of the routing intent result and a URL nextLink to get the next set of results as paginated response
     * with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoutingIntentInner> list(String resourceGroupName, String virtualHubName, Context context);
}
