// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateEndpointConnectionInner;

/**
 * Resource collection API of PrivateLinkServices.
 */
public interface PrivateLinkServices {
    /**
     * Deletes the specified private link service.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String serviceName);

    /**
     * Deletes the specified private link service.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String serviceName, Context context);

    /**
     * Gets the specified private link service by resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link service by resource group along with {@link Response}.
     */
    Response<PrivateLinkService> getByResourceGroupWithResponse(String resourceGroupName, String serviceName,
        String expand, Context context);

    /**
     * Gets the specified private link service by resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link service by resource group.
     */
    PrivateLinkService getByResourceGroup(String resourceGroupName, String serviceName);

    /**
     * Gets all private link services in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link services in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkService> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all private link services in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link services in a resource group as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkService> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all private link service in a subscription.
     * 
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link service in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkService> list();

    /**
     * Gets all private link service in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link service in a subscription as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkService> list(Context context);

    /**
     * Get the specific private end point connection by specific private link service in the resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific private end point connection by specific private link service in the resource group along with {@link Response}.
     */
    Response<PrivateEndpointConnection> getPrivateEndpointConnectionWithResponse(String resourceGroupName,
        String serviceName, String peConnectionName, String expand, Context context);

    /**
     * Get the specific private end point connection by specific private link service in the resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific private end point connection by specific private link service in the resource group.
     */
    PrivateEndpointConnection getPrivateEndpointConnection(String resourceGroupName, String serviceName,
        String peConnectionName);

    /**
     * Approve or reject private end point connection for a private link service in a subscription.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param parameters Parameters supplied to approve or reject the private end point connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return privateEndpointConnection resource along with {@link Response}.
     */
    Response<PrivateEndpointConnection> updatePrivateEndpointConnectionWithResponse(String resourceGroupName,
        String serviceName, String peConnectionName, PrivateEndpointConnectionInner parameters, Context context);

    /**
     * Approve or reject private end point connection for a private link service in a subscription.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param parameters Parameters supplied to approve or reject the private end point connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return privateEndpointConnection resource.
     */
    PrivateEndpointConnection updatePrivateEndpointConnection(String resourceGroupName, String serviceName,
        String peConnectionName, PrivateEndpointConnectionInner parameters);

    /**
     * Delete private end point connection for a private link service in a subscription.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deletePrivateEndpointConnection(String resourceGroupName, String serviceName, String peConnectionName);

    /**
     * Delete private end point connection for a private link service in a subscription.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deletePrivateEndpointConnection(String resourceGroupName, String serviceName, String peConnectionName,
        Context context);

    /**
     * Gets all private end point connections for a specific private link service.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private end point connections for a specific private link service as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateEndpointConnection> listPrivateEndpointConnections(String resourceGroupName,
        String serviceName);

    /**
     * Gets all private end point connections for a specific private link service.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private end point connections for a specific private link service as paginated response with {@link PagedIterable}.
     */
    PagedIterable<PrivateEndpointConnection> listPrivateEndpointConnections(String resourceGroupName,
        String serviceName, Context context);

    /**
     * Checks whether the subscription is visible to private link service.
     * 
     * @param location The location of the domain name.
     * @param parameters The request body of CheckPrivateLinkService API call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the CheckPrivateLinkServiceVisibility API service call.
     */
    PrivateLinkServiceVisibility checkPrivateLinkServiceVisibility(String location,
        CheckPrivateLinkServiceVisibilityRequest parameters);

    /**
     * Checks whether the subscription is visible to private link service.
     * 
     * @param location The location of the domain name.
     * @param parameters The request body of CheckPrivateLinkService API call.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the CheckPrivateLinkServiceVisibility API service call.
     */
    PrivateLinkServiceVisibility checkPrivateLinkServiceVisibility(String location,
        CheckPrivateLinkServiceVisibilityRequest parameters, Context context);

    /**
     * Checks whether the subscription is visible to private link service in the specified resource group.
     * 
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param parameters The request body of CheckPrivateLinkService API call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the CheckPrivateLinkServiceVisibility API service call.
     */
    PrivateLinkServiceVisibility checkPrivateLinkServiceVisibilityByResourceGroup(String location,
        String resourceGroupName, CheckPrivateLinkServiceVisibilityRequest parameters);

    /**
     * Checks whether the subscription is visible to private link service in the specified resource group.
     * 
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param parameters The request body of CheckPrivateLinkService API call.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for the CheckPrivateLinkServiceVisibility API service call.
     */
    PrivateLinkServiceVisibility checkPrivateLinkServiceVisibilityByResourceGroup(String location,
        String resourceGroupName, CheckPrivateLinkServiceVisibilityRequest parameters, Context context);

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this subscription in this region.
     * 
     * @param location The location of the domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of private link service id that can be linked to a private end point with auto approved as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServices(String location);

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this subscription in this region.
     * 
     * @param location The location of the domain name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of private link service id that can be linked to a private end point with auto approved as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServices(String location, Context context);

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this subscription in this region.
     * 
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of private link service id that can be linked to a private end point with auto approved as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServicesByResourceGroup(String location,
        String resourceGroupName);

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this subscription in this region.
     * 
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of private link service id that can be linked to a private end point with auto approved as paginated response with {@link PagedIterable}.
     */
    PagedIterable<AutoApprovedPrivateLinkService> listAutoApprovedPrivateLinkServicesByResourceGroup(String location,
        String resourceGroupName, Context context);

    /**
     * Gets the specified private link service by resource group.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link service by resource group along with {@link Response}.
     */
    PrivateLinkService getById(String id);

    /**
     * Gets the specified private link service by resource group.
     * 
     * @param id the resource ID.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link service by resource group along with {@link Response}.
     */
    Response<PrivateLinkService> getByIdWithResponse(String id, String expand, Context context);

    /**
     * Deletes the specified private link service.
     * 
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the specified private link service.
     * 
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new PrivateLinkService resource.
     * 
     * @param name resource name.
     * @return the first stage of the new PrivateLinkService definition.
     */
    PrivateLinkService.DefinitionStages.Blank define(String name);
}
