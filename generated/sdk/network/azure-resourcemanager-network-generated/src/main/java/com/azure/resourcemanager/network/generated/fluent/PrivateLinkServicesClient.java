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
import com.azure.resourcemanager.network.generated.fluent.models.AutoApprovedPrivateLinkServiceInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateLinkServiceInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateLinkServiceVisibilityInner;
import com.azure.resourcemanager.network.generated.models.CheckPrivateLinkServiceVisibilityRequest;

/**
 * An instance of this class provides access to all the operations defined in PrivateLinkServicesClient.
 */
public interface PrivateLinkServicesClient {
    /**
     * Deletes the specified private link service.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serviceName);

    /**
     * Deletes the specified private link service.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serviceName, Context context);

    /**
     * Deletes the specified private link service.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName);

    /**
     * Deletes the specified private link service.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, Context context);

    /**
     * Gets the specified private link service by resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link service by resource group along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkServiceInner> getByResourceGroupWithResponse(String resourceGroupName, String serviceName,
        String expand, Context context);

    /**
     * Gets the specified private link service by resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified private link service by resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkServiceInner getByResourceGroup(String resourceGroupName, String serviceName);

    /**
     * Creates or updates an private link service in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param parameters Parameters supplied to the create or update private link service operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of private link service resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateLinkServiceInner>, PrivateLinkServiceInner>
        beginCreateOrUpdate(String resourceGroupName, String serviceName, PrivateLinkServiceInner parameters);

    /**
     * Creates or updates an private link service in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param parameters Parameters supplied to the create or update private link service operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of private link service resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateLinkServiceInner>, PrivateLinkServiceInner> beginCreateOrUpdate(
        String resourceGroupName, String serviceName, PrivateLinkServiceInner parameters, Context context);

    /**
     * Creates or updates an private link service in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param parameters Parameters supplied to the create or update private link service operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private link service resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkServiceInner createOrUpdate(String resourceGroupName, String serviceName,
        PrivateLinkServiceInner parameters);

    /**
     * Creates or updates an private link service in the specified resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param parameters Parameters supplied to the create or update private link service operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return private link service resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkServiceInner createOrUpdate(String resourceGroupName, String serviceName,
        PrivateLinkServiceInner parameters, Context context);

    /**
     * Gets all private link services in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link services in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkServiceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets all private link services in a resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link services in a resource group as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkServiceInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all private link service in a subscription.
     * 
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link service in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkServiceInner> list();

    /**
     * Gets all private link service in a subscription.
     * 
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private link service in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkServiceInner> list(Context context);

    /**
     * Get the specific private end point connection by specific private link service in the resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param expand Expands referenced resources.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific private end point connection by specific private link service in the resource group along
     * with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> getPrivateEndpointConnectionWithResponse(String resourceGroupName,
        String serviceName, String peConnectionName, String expand, Context context);

    /**
     * Get the specific private end point connection by specific private link service in the resource group.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specific private end point connection by specific private link service in the resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner getPrivateEndpointConnection(String resourceGroupName, String serviceName,
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
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return privateEndpointConnection resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateEndpointConnectionInner> updatePrivateEndpointConnectionWithResponse(String resourceGroupName,
        String serviceName, String peConnectionName, PrivateEndpointConnectionInner parameters, Context context);

    /**
     * Approve or reject private end point connection for a private link service in a subscription.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param parameters Parameters supplied to approve or reject the private end point connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return privateEndpointConnection resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateEndpointConnectionInner updatePrivateEndpointConnection(String resourceGroupName, String serviceName,
        String peConnectionName, PrivateEndpointConnectionInner parameters);

    /**
     * Delete private end point connection for a private link service in a subscription.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeletePrivateEndpointConnection(String resourceGroupName,
        String serviceName, String peConnectionName);

    /**
     * Delete private end point connection for a private link service in a subscription.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDeletePrivateEndpointConnection(String resourceGroupName,
        String serviceName, String peConnectionName, Context context);

    /**
     * Delete private end point connection for a private link service in a subscription.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deletePrivateEndpointConnection(String resourceGroupName, String serviceName, String peConnectionName);

    /**
     * Delete private end point connection for a private link service in a subscription.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param peConnectionName The name of the private end point connection.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deletePrivateEndpointConnection(String resourceGroupName, String serviceName, String peConnectionName,
        Context context);

    /**
     * Gets all private end point connections for a specific private link service.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private end point connections for a specific private link service as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listPrivateEndpointConnections(String resourceGroupName,
        String serviceName);

    /**
     * Gets all private end point connections for a specific private link service.
     * 
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the private link service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.network.generated.models.ErrorException thrown if the request is rejected by
     * server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all private end point connections for a specific private link service as paginated response with
     * {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateEndpointConnectionInner> listPrivateEndpointConnections(String resourceGroupName,
        String serviceName, Context context);

    /**
     * Checks whether the subscription is visible to private link service.
     * 
     * @param location The location of the domain name.
     * @param parameters The request body of CheckPrivateLinkService API call.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for the CheckPrivateLinkServiceVisibility API service
     * call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateLinkServiceVisibilityInner>, PrivateLinkServiceVisibilityInner>
        beginCheckPrivateLinkServiceVisibility(String location, CheckPrivateLinkServiceVisibilityRequest parameters);

    /**
     * Checks whether the subscription is visible to private link service.
     * 
     * @param location The location of the domain name.
     * @param parameters The request body of CheckPrivateLinkService API call.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of response for the CheckPrivateLinkServiceVisibility API service
     * call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateLinkServiceVisibilityInner>, PrivateLinkServiceVisibilityInner>
        beginCheckPrivateLinkServiceVisibility(String location, CheckPrivateLinkServiceVisibilityRequest parameters,
            Context context);

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
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkServiceVisibilityInner checkPrivateLinkServiceVisibility(String location,
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkServiceVisibilityInner checkPrivateLinkServiceVisibility(String location,
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
     * @return the {@link SyncPoller} for polling of response for the CheckPrivateLinkServiceVisibility API service
     * call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateLinkServiceVisibilityInner>, PrivateLinkServiceVisibilityInner>
        beginCheckPrivateLinkServiceVisibilityByResourceGroup(String location, String resourceGroupName,
            CheckPrivateLinkServiceVisibilityRequest parameters);

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
     * @return the {@link SyncPoller} for polling of response for the CheckPrivateLinkServiceVisibility API service
     * call.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<PrivateLinkServiceVisibilityInner>, PrivateLinkServiceVisibilityInner>
        beginCheckPrivateLinkServiceVisibilityByResourceGroup(String location, String resourceGroupName,
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkServiceVisibilityInner checkPrivateLinkServiceVisibilityByResourceGroup(String location,
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
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkServiceVisibilityInner checkPrivateLinkServiceVisibilityByResourceGroup(String location,
        String resourceGroupName, CheckPrivateLinkServiceVisibilityRequest parameters, Context context);

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this
     * subscription in this region.
     * 
     * @param location The location of the domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of private link service id that can be linked to a private end point with auto approved as
     * paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutoApprovedPrivateLinkServiceInner> listAutoApprovedPrivateLinkServices(String location);

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this
     * subscription in this region.
     * 
     * @param location The location of the domain name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of private link service id that can be linked to a private end point with auto approved as
     * paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutoApprovedPrivateLinkServiceInner> listAutoApprovedPrivateLinkServices(String location,
        Context context);

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this
     * subscription in this region.
     * 
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of private link service id that can be linked to a private end point with auto approved as
     * paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutoApprovedPrivateLinkServiceInner>
        listAutoApprovedPrivateLinkServicesByResourceGroup(String location, String resourceGroupName);

    /**
     * Returns all of the private link service ids that can be linked to a Private Endpoint with auto approved in this
     * subscription in this region.
     * 
     * @param location The location of the domain name.
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an array of private link service id that can be linked to a private end point with auto approved as
     * paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AutoApprovedPrivateLinkServiceInner>
        listAutoApprovedPrivateLinkServicesByResourceGroup(String location, String resourceGroupName, Context context);
}
