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
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PermissionBindingInner;

/**
 * An instance of this class provides access to all the operations defined in PermissionBindingsClient.
 */
public interface PermissionBindingsClient {
    /**
     * Get a permission binding.
     * 
     * Get properties of a permission binding.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param permissionBindingName Name of the permission binding.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a permission binding along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PermissionBindingInner> getWithResponse(String resourceGroupName, String namespaceName,
        String permissionBindingName, Context context);

    /**
     * Get a permission binding.
     * 
     * Get properties of a permission binding.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param permissionBindingName Name of the permission binding.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a permission binding.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PermissionBindingInner get(String resourceGroupName, String namespaceName, String permissionBindingName);

    /**
     * Create or update a permission binding.
     * 
     * Create or update a permission binding with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param permissionBindingName The permission binding name.
     * @param permissionBindingInfo Permission binding information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Permission binding resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PermissionBindingInner>, PermissionBindingInner> beginCreateOrUpdate(String resourceGroupName,
        String namespaceName, String permissionBindingName, PermissionBindingInner permissionBindingInfo);

    /**
     * Create or update a permission binding.
     * 
     * Create or update a permission binding with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param permissionBindingName The permission binding name.
     * @param permissionBindingInfo Permission binding information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of the Permission binding resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PermissionBindingInner>, PermissionBindingInner> beginCreateOrUpdate(String resourceGroupName,
        String namespaceName, String permissionBindingName, PermissionBindingInner permissionBindingInfo,
        Context context);

    /**
     * Create or update a permission binding.
     * 
     * Create or update a permission binding with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param permissionBindingName The permission binding name.
     * @param permissionBindingInfo Permission binding information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Permission binding resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PermissionBindingInner createOrUpdate(String resourceGroupName, String namespaceName, String permissionBindingName,
        PermissionBindingInner permissionBindingInfo);

    /**
     * Create or update a permission binding.
     * 
     * Create or update a permission binding with the specified parameters.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param permissionBindingName The permission binding name.
     * @param permissionBindingInfo Permission binding information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Permission binding resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PermissionBindingInner createOrUpdate(String resourceGroupName, String namespaceName, String permissionBindingName,
        PermissionBindingInner permissionBindingInfo, Context context);

    /**
     * Delete a permission binding.
     * 
     * Delete an existing permission binding.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param permissionBindingName Name of the permission binding.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String namespaceName,
        String permissionBindingName);

    /**
     * Delete a permission binding.
     * 
     * Delete an existing permission binding.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param permissionBindingName Name of the permission binding.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String namespaceName,
        String permissionBindingName, Context context);

    /**
     * Delete a permission binding.
     * 
     * Delete an existing permission binding.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param permissionBindingName Name of the permission binding.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String permissionBindingName);

    /**
     * Delete a permission binding.
     * 
     * Delete an existing permission binding.
     * 
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param namespaceName Name of the namespace.
     * @param permissionBindingName Name of the permission binding.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String namespaceName, String permissionBindingName, Context context);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PermissionBindingInner> listByNamespace(String resourceGroupName, String namespaceName);

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
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PermissionBindingInner> listByNamespace(String resourceGroupName, String namespaceName, String filter,
        Integer top, Context context);
}
