// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ScopeConnections.
 */
public interface ScopeConnections {
    /**
     * Get specified scope connection created by this Network Manager.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specified scope connection created by this Network Manager along with {@link Response}.
     */
    Response<ScopeConnection> getWithResponse(String resourceGroupName, String networkManagerName,
        String scopeConnectionName, Context context);

    /**
     * Get specified scope connection created by this Network Manager.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specified scope connection created by this Network Manager.
     */
    ScopeConnection get(String resourceGroupName, String networkManagerName, String scopeConnectionName);

    /**
     * Delete the pending scope connection created by this network manager.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String networkManagerName, String scopeConnectionName,
        Context context);

    /**
     * Delete the pending scope connection created by this network manager.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param scopeConnectionName Name for the cross-tenant connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkManagerName, String scopeConnectionName);

    /**
     * List all scope connections created by this network manager.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of scope connections as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ScopeConnection> list(String resourceGroupName, String networkManagerName);

    /**
     * List all scope connections created by this network manager.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the
     * server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response
     * contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies
     * a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of scope connections as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ScopeConnection> list(String resourceGroupName, String networkManagerName, Integer top,
        String skipToken, Context context);

    /**
     * Get specified scope connection created by this Network Manager.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specified scope connection created by this Network Manager along with {@link Response}.
     */
    ScopeConnection getById(String id);

    /**
     * Get specified scope connection created by this Network Manager.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specified scope connection created by this Network Manager along with {@link Response}.
     */
    Response<ScopeConnection> getByIdWithResponse(String id, Context context);

    /**
     * Delete the pending scope connection created by this network manager.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Delete the pending scope connection created by this network manager.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ScopeConnection resource.
     * 
     * @param name resource name.
     * @return the first stage of the new ScopeConnection definition.
     */
    ScopeConnection.DefinitionStages.Blank define(String name);
}
