// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of Providers.
 */
public interface Providers {
    /**
     * Unregisters a subscription from a resource provider.
     * 
     * @param resourceProviderNamespace The namespace of the resource provider to unregister.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information along with {@link Response}.
     */
    Response<Provider> unregisterWithResponse(String resourceProviderNamespace, Context context);

    /**
     * Unregisters a subscription from a resource provider.
     * 
     * @param resourceProviderNamespace The namespace of the resource provider to unregister.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information.
     */
    Provider unregister(String resourceProviderNamespace);

    /**
     * Registers a management group with a resource provider.
     * 
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @param groupId The management group ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> registerAtManagementGroupScopeWithResponse(String resourceProviderNamespace, String groupId,
        Context context);

    /**
     * Registers a management group with a resource provider.
     * 
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @param groupId The management group ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void registerAtManagementGroupScope(String resourceProviderNamespace, String groupId);

    /**
     * Registers a subscription with a resource provider.
     * 
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information along with {@link Response}.
     */
    Response<Provider> registerWithResponse(String resourceProviderNamespace, Context context);

    /**
     * Registers a subscription with a resource provider.
     * 
     * @param resourceProviderNamespace The namespace of the resource provider to register.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource provider information.
     */
    Provider register(String resourceProviderNamespace);

    /**
     * Gets all resource providers for a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Provider> list();

    /**
     * Gets all resource providers for a subscription.
     * 
     * @param top The number of results to return. If null is passed returns all deployments.
     * @param expand The properties to include in the results. For example, use &amp;$expand=metadata in the query
     * string to retrieve resource provider metadata. To include property aliases in response, use
     * $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Provider> list(Integer top, String expand, Context context);

    /**
     * Gets all resource providers for the tenant.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for the tenant as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Provider> listAtTenantScope();

    /**
     * Gets all resource providers for the tenant.
     * 
     * @param top The number of results to return. If null is passed returns all providers.
     * @param expand The properties to include in the results. For example, use &amp;$expand=metadata in the query
     * string to retrieve resource provider metadata. To include property aliases in response, use
     * $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all resource providers for the tenant as paginated response with {@link PagedIterable}.
     */
    PagedIterable<Provider> listAtTenantScope(Integer top, String expand, Context context);

    /**
     * Gets the specified resource provider.
     * 
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     * $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider along with {@link Response}.
     */
    Response<Provider> getWithResponse(String resourceProviderNamespace, String expand, Context context);

    /**
     * Gets the specified resource provider.
     * 
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider.
     */
    Provider get(String resourceProviderNamespace);

    /**
     * Gets the specified resource provider at the tenant level.
     * 
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param expand The $expand query parameter. For example, to include property aliases in response, use
     * $expand=resourceTypes/aliases.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider at the tenant level along with {@link Response}.
     */
    Response<Provider> getAtTenantScopeWithResponse(String resourceProviderNamespace, String expand, Context context);

    /**
     * Gets the specified resource provider at the tenant level.
     * 
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified resource provider at the tenant level.
     */
    Provider getAtTenantScope(String resourceProviderNamespace);
}
