// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.eventgrid.generated.models.PrivateEndpointConnectionsParentType;

/**
 * An instance of this class provides access to all the operations defined in PrivateEndpointConnectionsClient.
 */
public interface PrivateEndpointConnectionsClient {
    /**
     * Get a specific private endpoint connection.
     * 
     * Get a specific private endpoint connection under a topic, domain, or partner namespace or namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner namespace name or namespace name).
     * @param privateEndpointConnectionName The name of the private endpoint connection connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific private endpoint connection under a topic, domain, or partner namespace or namespace along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getWithResponse(String resourceGroupName,
        PrivateEndpointConnectionsParentType parentType, String parentName, String privateEndpointConnectionName,
        Context context);

    /**
     * Get a specific private endpoint connection.
     * 
     * Get a specific private endpoint connection under a topic, domain, or partner namespace or namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner namespace name or namespace name).
     * @param privateEndpointConnectionName The name of the private endpoint connection connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a specific private endpoint connection under a topic, domain, or partner namespace or namespace.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner get(String resourceGroupName, PrivateEndpointConnectionsParentType parentType,
        String parentName, String privateEndpointConnectionName);

    /**
     * Update a specific private endpoint connection.
     * 
     * Update a specific private endpoint connection under a topic, domain or partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner namespace name or namespace name).
     * @param privateEndpointConnectionName The name of the private endpoint connection connection.
     * @param privateEndpointConnection The private endpoint connection object to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginUpdate(
        String resourceGroupName, PrivateEndpointConnectionsParentType parentType, String parentName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner privateEndpointConnection);

    /**
     * Update a specific private endpoint connection.
     * 
     * Update a specific private endpoint connection under a topic, domain or partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner namespace name or namespace name).
     * @param privateEndpointConnectionName The name of the private endpoint connection connection.
     * @param privateEndpointConnection The private endpoint connection object to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner> beginUpdate(
        String resourceGroupName, PrivateEndpointConnectionsParentType parentType, String parentName,
        String privateEndpointConnectionName, PrivateEndpointConnectionInner privateEndpointConnection,
        Context context);

    /**
     * Update a specific private endpoint connection.
     * 
     * Update a specific private endpoint connection under a topic, domain or partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner namespace name or namespace name).
     * @param privateEndpointConnectionName The name of the private endpoint connection connection.
     * @param privateEndpointConnection The private endpoint connection object to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner update(String resourceGroupName, PrivateEndpointConnectionsParentType parentType,
        String parentName, String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection);

    /**
     * Update a specific private endpoint connection.
     * 
     * Update a specific private endpoint connection under a topic, domain or partner namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner namespace name or namespace name).
     * @param privateEndpointConnectionName The name of the private endpoint connection connection.
     * @param privateEndpointConnection The private endpoint connection object to update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner update(String resourceGroupName, PrivateEndpointConnectionsParentType parentType,
        String parentName, String privateEndpointConnectionName,
        PrivateEndpointConnectionInner privateEndpointConnection, Context context);

    /**
     * Delete a specific private endpoint connection.
     * 
     * Delete a specific private endpoint connection under a topic, domain, or partner namespace or namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner namespace name or namespace name).
     * @param privateEndpointConnectionName The name of the private endpoint connection connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName,
        PrivateEndpointConnectionsParentType parentType, String parentName, String privateEndpointConnectionName);

    /**
     * Delete a specific private endpoint connection.
     * 
     * Delete a specific private endpoint connection under a topic, domain, or partner namespace or namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner namespace name or namespace name).
     * @param privateEndpointConnectionName The name of the private endpoint connection connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName,
        PrivateEndpointConnectionsParentType parentType, String parentName, String privateEndpointConnectionName,
        Context context);

    /**
     * Delete a specific private endpoint connection.
     * 
     * Delete a specific private endpoint connection under a topic, domain, or partner namespace or namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner namespace name or namespace name).
     * @param privateEndpointConnectionName The name of the private endpoint connection connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, PrivateEndpointConnectionsParentType parentType, String parentName,
        String privateEndpointConnectionName);

    /**
     * Delete a specific private endpoint connection.
     * 
     * Delete a specific private endpoint connection under a topic, domain, or partner namespace or namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner namespace name or namespace name).
     * @param privateEndpointConnectionName The name of the private endpoint connection connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, PrivateEndpointConnectionsParentType parentType, String parentName,
        String privateEndpointConnectionName, Context context);

    /**
     * Lists all private endpoint connections under a resource.
     * 
     * Get all private endpoint connections under a topic, domain, or partner namespace or namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner namespace name or namespace name).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoint connections under a topic, domain, or partner namespace or namespace as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listByResource(String resourceGroupName,
        PrivateEndpointConnectionsParentType parentType, String parentName);

    /**
     * Lists all private endpoint connections under a resource.
     * 
     * Get all private endpoint connections under a topic, domain, or partner namespace or namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param parentType The type of the parent resource. This can be either \'topics\', \'domains\', or \'partnerNamespaces\' or \'namespaces\'.
     * @param parentName The name of the parent resource (namely, either, the topic name, domain name, or partner namespace name or namespace name).
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the 'name' property only and with limited number of OData operations. These operations are: the 'contains' function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal). No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE, 'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq 'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to 100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private endpoint connections under a topic, domain, or partner namespace or namespace as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listByResource(String resourceGroupName,
        PrivateEndpointConnectionsParentType parentType, String parentName, String filter, Integer top,
        Context context);
}
