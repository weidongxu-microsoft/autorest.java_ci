// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.search.generated.fluent.models.CheckNameAvailabilityOutputInner;
import com.azure.resourcemanager.search.generated.fluent.models.SearchServiceInner;
import com.azure.resourcemanager.search.generated.models.CheckNameAvailabilityInput;
import com.azure.resourcemanager.search.generated.models.SearchServiceUpdate;
import java.util.UUID;

/** An instance of this class provides access to all the operations defined in ServicesClient. */
public interface ServicesClient {
    /**
     * Creates or updates a search service in the given resource group. If the search service already exists, all
     * properties will be updated with the given values.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service to create or update. Search service names
     *     must only contain lowercase letters, digits or dashes, cannot use dash as the first two or last one
     *     characters, cannot contain consecutive dashes, and must be between 2 and 60 characters in length. Search
     *     service names must be globally unique since they are part of the service URI
     *     (https://&lt;name&gt;.search.windows.net). You cannot change the service name after the service is created.
     * @param serviceParam The definition of the search service to create or update.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an Azure Cognitive Search service and its current state.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SearchServiceInner>, SearchServiceInner> beginCreateOrUpdate(
        String resourceGroupName, String searchServiceName, SearchServiceInner serviceParam, UUID clientRequestId);

    /**
     * Creates or updates a search service in the given resource group. If the search service already exists, all
     * properties will be updated with the given values.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service to create or update. Search service names
     *     must only contain lowercase letters, digits or dashes, cannot use dash as the first two or last one
     *     characters, cannot contain consecutive dashes, and must be between 2 and 60 characters in length. Search
     *     service names must be globally unique since they are part of the service URI
     *     (https://&lt;name&gt;.search.windows.net). You cannot change the service name after the service is created.
     * @param serviceParam The definition of the search service to create or update.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an Azure Cognitive Search service and its current state.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SearchServiceInner>, SearchServiceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String searchServiceName,
        SearchServiceInner serviceParam,
        UUID clientRequestId,
        Context context);

    /**
     * Creates or updates a search service in the given resource group. If the search service already exists, all
     * properties will be updated with the given values.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service to create or update. Search service names
     *     must only contain lowercase letters, digits or dashes, cannot use dash as the first two or last one
     *     characters, cannot contain consecutive dashes, and must be between 2 and 60 characters in length. Search
     *     service names must be globally unique since they are part of the service URI
     *     (https://&lt;name&gt;.search.windows.net). You cannot change the service name after the service is created.
     * @param serviceParam The definition of the search service to create or update.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an Azure Cognitive Search service and its current state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SearchServiceInner createOrUpdate(
        String resourceGroupName, String searchServiceName, SearchServiceInner serviceParam, UUID clientRequestId);

    /**
     * Creates or updates a search service in the given resource group. If the search service already exists, all
     * properties will be updated with the given values.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service to create or update. Search service names
     *     must only contain lowercase letters, digits or dashes, cannot use dash as the first two or last one
     *     characters, cannot contain consecutive dashes, and must be between 2 and 60 characters in length. Search
     *     service names must be globally unique since they are part of the service URI
     *     (https://&lt;name&gt;.search.windows.net). You cannot change the service name after the service is created.
     * @param serviceParam The definition of the search service to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an Azure Cognitive Search service and its current state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SearchServiceInner createOrUpdate(
        String resourceGroupName, String searchServiceName, SearchServiceInner serviceParam);

    /**
     * Creates or updates a search service in the given resource group. If the search service already exists, all
     * properties will be updated with the given values.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service to create or update. Search service names
     *     must only contain lowercase letters, digits or dashes, cannot use dash as the first two or last one
     *     characters, cannot contain consecutive dashes, and must be between 2 and 60 characters in length. Search
     *     service names must be globally unique since they are part of the service URI
     *     (https://&lt;name&gt;.search.windows.net). You cannot change the service name after the service is created.
     * @param serviceParam The definition of the search service to create or update.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an Azure Cognitive Search service and its current state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SearchServiceInner createOrUpdate(
        String resourceGroupName,
        String searchServiceName,
        SearchServiceInner serviceParam,
        UUID clientRequestId,
        Context context);

    /**
     * Updates an existing search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service to update.
     * @param serviceParam The definition of the search service to update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an Azure Cognitive Search service and its current state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SearchServiceInner update(String resourceGroupName, String searchServiceName, SearchServiceUpdate serviceParam);

    /**
     * Updates an existing search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service to update.
     * @param serviceParam The definition of the search service to update.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an Azure Cognitive Search service and its current state.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SearchServiceInner> updateWithResponse(
        String resourceGroupName,
        String searchServiceName,
        SearchServiceUpdate serviceParam,
        UUID clientRequestId,
        Context context);

    /**
     * Gets the search service with the given name in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the search service with the given name in the given resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SearchServiceInner getByResourceGroup(String resourceGroupName, String searchServiceName);

    /**
     * Gets the search service with the given name in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the search service with the given name in the given resource group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SearchServiceInner> getByResourceGroupWithResponse(
        String resourceGroupName, String searchServiceName, UUID clientRequestId, Context context);

    /**
     * Deletes a search service in the given resource group, along with its associated resources.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String searchServiceName);

    /**
     * Deletes a search service in the given resource group, along with its associated resources.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String searchServiceName, UUID clientRequestId, Context context);

    /**
     * Gets a list of all search services in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all search services in the given resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SearchServiceInner> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of all search services in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all search services in the given resource group.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SearchServiceInner> listByResourceGroup(
        String resourceGroupName, UUID clientRequestId, Context context);

    /**
     * Gets a list of all search services in the given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all search services in the given subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SearchServiceInner> list();

    /**
     * Gets a list of all search services in the given subscription.
     *
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all search services in the given subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SearchServiceInner> list(UUID clientRequestId, Context context);

    /**
     * Checks whether or not the given search service name is available for use. Search service names must be globally
     * unique since they are part of the service URI (https://&lt;name&gt;.search.windows.net).
     *
     * @param checkNameAvailabilityInput The resource name and type to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    CheckNameAvailabilityOutputInner checkNameAvailability(CheckNameAvailabilityInput checkNameAvailabilityInput);

    /**
     * Checks whether or not the given search service name is available for use. Search service names must be globally
     * unique since they are part of the service URI (https://&lt;name&gt;.search.windows.net).
     *
     * @param checkNameAvailabilityInput The resource name and type to check.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return output of check name availability API.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<CheckNameAvailabilityOutputInner> checkNameAvailabilityWithResponse(
        CheckNameAvailabilityInput checkNameAvailabilityInput, UUID clientRequestId, Context context);
}
