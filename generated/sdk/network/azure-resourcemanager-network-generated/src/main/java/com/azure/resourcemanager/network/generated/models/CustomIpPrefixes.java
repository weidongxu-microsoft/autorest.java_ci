// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of CustomIpPrefixes. */
public interface CustomIpPrefixes {
    /**
     * Deletes the specified custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the CustomIpPrefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String customIpPrefixName);

    /**
     * Deletes the specified custom IP prefix.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the CustomIpPrefix.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String customIpPrefixName, Context context);

    /**
     * Gets the specified custom IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified custom IP prefix in a specified resource group along with {@link Response}.
     */
    Response<CustomIpPrefix> getByResourceGroupWithResponse(
        String resourceGroupName, String customIpPrefixName, String expand, Context context);

    /**
     * Gets the specified custom IP prefix in a specified resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param customIpPrefixName The name of the custom IP prefix.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified custom IP prefix in a specified resource group.
     */
    CustomIpPrefix getByResourceGroup(String resourceGroupName, String customIpPrefixName);

    /**
     * Gets all the custom IP prefixes in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the custom IP prefixes in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CustomIpPrefix> list();

    /**
     * Gets all the custom IP prefixes in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the custom IP prefixes in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CustomIpPrefix> list(Context context);

    /**
     * Gets all custom IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all custom IP prefixes in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CustomIpPrefix> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all custom IP prefixes in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all custom IP prefixes in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<CustomIpPrefix> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the specified custom IP prefix in a specified resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified custom IP prefix in a specified resource group along with {@link Response}.
     */
    CustomIpPrefix getById(String id);

    /**
     * Gets the specified custom IP prefix in a specified resource group.
     *
     * @param id the resource ID.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified custom IP prefix in a specified resource group along with {@link Response}.
     */
    Response<CustomIpPrefix> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Deletes the specified custom IP prefix.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified custom IP prefix.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new CustomIpPrefix resource.
     *
     * @param name resource name.
     * @return the first stage of the new CustomIpPrefix definition.
     */
    CustomIpPrefix.DefinitionStages.Blank define(String name);
}
