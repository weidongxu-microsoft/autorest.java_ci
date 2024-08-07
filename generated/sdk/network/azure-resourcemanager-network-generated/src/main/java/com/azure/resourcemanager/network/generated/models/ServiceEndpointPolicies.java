// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of ServiceEndpointPolicies.
 */
public interface ServiceEndpointPolicies {
    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String serviceEndpointPolicyName);

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceEndpointPolicyName, Context context);

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service Endpoint Policies in a specified resource group along with {@link Response}.
     */
    Response<ServiceEndpointPolicy> getByResourceGroupWithResponse(String resourceGroupName,
        String serviceEndpointPolicyName, String expand, Context context);

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceEndpointPolicyName The name of the service endpoint policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service Endpoint Policies in a specified resource group.
     */
    ServiceEndpointPolicy getByResourceGroup(String resourceGroupName, String serviceEndpointPolicyName);

    /**
     * Gets all the service endpoint policies in a subscription.
     * 
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service endpoint policies in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServiceEndpointPolicy> list();

    /**
     * Gets all the service endpoint policies in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the service endpoint policies in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServiceEndpointPolicy> list(Context context);

    /**
     * Gets all service endpoint Policies in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all service endpoint Policies in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServiceEndpointPolicy> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all service endpoint Policies in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all service endpoint Policies in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ServiceEndpointPolicy> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service Endpoint Policies in a specified resource group along with {@link Response}.
     */
    ServiceEndpointPolicy getById(String id);

    /**
     * Gets the specified service Endpoint Policies in a specified resource group.
     * 
     * @param id the resource ID.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified service Endpoint Policies in a specified resource group along with {@link Response}.
     */
    Response<ServiceEndpointPolicy> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified service endpoint policy.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new ServiceEndpointPolicy resource.
     * 
     * @param name resource name.
     * @return the first stage of the new ServiceEndpointPolicy definition.
     */
    ServiceEndpointPolicy.DefinitionStages.Blank define(String name);
}
