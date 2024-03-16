// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of StaticMembers.
 */
public interface StaticMembers {
    /**
     * Gets the specified static member.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified static member along with {@link Response}.
     */
    Response<StaticMember> getWithResponse(String resourceGroupName, String networkManagerName, String networkGroupName,
        String staticMemberName, Context context);

    /**
     * Gets the specified static member.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified static member.
     */
    StaticMember get(String resourceGroupName, String networkManagerName, String networkGroupName,
        String staticMemberName);

    /**
     * Deletes a static member.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(String resourceGroupName, String networkManagerName, String networkGroupName,
        String staticMemberName, Context context);

    /**
     * Deletes a static member.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param staticMemberName The name of the static member.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String networkManagerName, String networkGroupName, String staticMemberName);

    /**
     * Lists the specified static member.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list StaticMember as paginated response with {@link PagedIterable}.
     */
    PagedIterable<StaticMember> list(String resourceGroupName, String networkManagerName, String networkGroupName);

    /**
     * Lists the specified static member.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param networkManagerName The name of the network manager.
     * @param networkGroupName The name of the network group.
     * @param top An optional query parameter which specifies the maximum number of records to be returned by the server.
     * @param skipToken SkipToken is only used if a previous operation returned a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies a starting point to use for subsequent calls.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the request to list StaticMember as paginated response with {@link PagedIterable}.
     */
    PagedIterable<StaticMember> list(String resourceGroupName, String networkManagerName, String networkGroupName,
        Integer top, String skipToken, Context context);

    /**
     * Gets the specified static member.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified static member along with {@link Response}.
     */
    StaticMember getById(String id);

    /**
     * Gets the specified static member.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified static member along with {@link Response}.
     */
    Response<StaticMember> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a static member.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a static member.
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
     * Begins definition for a new StaticMember resource.
     * 
     * @param name resource name.
     * @return the first stage of the new StaticMember definition.
     */
    StaticMember.DefinitionStages.Blank define(String name);
}
