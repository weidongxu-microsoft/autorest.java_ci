// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Clients.
 */
public interface Clients {
    /**
     * Get a client.
     * 
     * Get properties of a client.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param clientName Name of the client.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a client along with {@link Response}.
     */
    Response<Client> getWithResponse(String resourceGroupName, String namespaceName, String clientName,
        Context context);

    /**
     * Get a client.
     * 
     * Get properties of a client.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param clientName Name of the client.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a client.
     */
    Client get(String resourceGroupName, String namespaceName, String clientName);

    /**
     * Delete a client.
     * 
     * Delete an existing client.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param clientName Name of the client.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String namespaceName, String clientName);

    /**
     * Delete a client.
     * 
     * Delete an existing client.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param clientName Name of the client.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String namespaceName, String clientName, Context context);

    /**
     * List all permission bindings under a namespace.
     * 
     * Get all the permission bindings under a namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the permission bindings under a namespace as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Client> listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * List all permission bindings under a namespace.
     * 
     * Get all the permission bindings under a namespace.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     * 'name' property only and with limited number of OData operations. These operations are: the 'contains' function
     * as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal). No arithmetic
     * operations are supported. The following is a valid filter example: $filter=contains(namE, 'PATTERN') and name ne
     * 'PATTERN-1'. The following is not a valid filter example: $filter=location eq 'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     * 100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the permission bindings under a namespace as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Client> listByNamespace(String resourceGroupName, String namespaceName, String filter, Integer top,
        Context context);

    /**
     * Get a client.
     * 
     * Get properties of a client.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a client along with {@link Response}.
     */
    Client getById(String id);

    /**
     * Get a client.
     * 
     * Get properties of a client.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a client along with {@link Response}.
     */
    Response<Client> getByIdWithResponse(String id, Context context);

    /**
     * Delete a client.
     * 
     * Delete an existing client.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete a client.
     * 
     * Delete an existing client.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new Client resource.
     * 
     * @param name resource name.
     * @return the first stage of the new Client definition.
     */
    Client.DefinitionStages.Blank define(String name);
}
