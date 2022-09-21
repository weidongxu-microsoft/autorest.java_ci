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
import com.azure.resourcemanager.search.generated.fluent.models.SharedPrivateLinkResourceInner;
import java.util.UUID;

/** An instance of this class provides access to all the operations defined in SharedPrivateLinkResourcesClient. */
public interface SharedPrivateLinkResourcesClient {
    /**
     * Initiates the creation or update of a shared private link resource managed by the search service in the given
     * resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive
     *     Search service within the specified resource group.
     * @param sharedPrivateLinkResource The definition of the shared private link resource to create or update.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Shared Private Link Resource managed by the Azure
     *     Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SharedPrivateLinkResourceInner>, SharedPrivateLinkResourceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String searchServiceName,
        String sharedPrivateLinkResourceName,
        SharedPrivateLinkResourceInner sharedPrivateLinkResource,
        UUID clientRequestId);

    /**
     * Initiates the creation or update of a shared private link resource managed by the search service in the given
     * resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive
     *     Search service within the specified resource group.
     * @param sharedPrivateLinkResource The definition of the shared private link resource to create or update.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of describes a Shared Private Link Resource managed by the Azure
     *     Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SharedPrivateLinkResourceInner>, SharedPrivateLinkResourceInner> beginCreateOrUpdate(
        String resourceGroupName,
        String searchServiceName,
        String sharedPrivateLinkResourceName,
        SharedPrivateLinkResourceInner sharedPrivateLinkResource,
        UUID clientRequestId,
        Context context);

    /**
     * Initiates the creation or update of a shared private link resource managed by the search service in the given
     * resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive
     *     Search service within the specified resource group.
     * @param sharedPrivateLinkResource The definition of the shared private link resource to create or update.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Shared Private Link Resource managed by the Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharedPrivateLinkResourceInner createOrUpdate(
        String resourceGroupName,
        String searchServiceName,
        String sharedPrivateLinkResourceName,
        SharedPrivateLinkResourceInner sharedPrivateLinkResource,
        UUID clientRequestId);

    /**
     * Initiates the creation or update of a shared private link resource managed by the search service in the given
     * resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive
     *     Search service within the specified resource group.
     * @param sharedPrivateLinkResource The definition of the shared private link resource to create or update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Shared Private Link Resource managed by the Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharedPrivateLinkResourceInner createOrUpdate(
        String resourceGroupName,
        String searchServiceName,
        String sharedPrivateLinkResourceName,
        SharedPrivateLinkResourceInner sharedPrivateLinkResource);

    /**
     * Initiates the creation or update of a shared private link resource managed by the search service in the given
     * resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive
     *     Search service within the specified resource group.
     * @param sharedPrivateLinkResource The definition of the shared private link resource to create or update.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes a Shared Private Link Resource managed by the Azure Cognitive Search service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharedPrivateLinkResourceInner createOrUpdate(
        String resourceGroupName,
        String searchServiceName,
        String sharedPrivateLinkResourceName,
        SharedPrivateLinkResourceInner sharedPrivateLinkResource,
        UUID clientRequestId,
        Context context);

    /**
     * Gets the details of the shared private link resource managed by the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive
     *     Search service within the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the shared private link resource managed by the search service in the given resource group
     *     along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SharedPrivateLinkResourceInner> getWithResponse(
        String resourceGroupName,
        String searchServiceName,
        String sharedPrivateLinkResourceName,
        UUID clientRequestId,
        Context context);

    /**
     * Gets the details of the shared private link resource managed by the search service in the given resource group.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive
     *     Search service within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the shared private link resource managed by the search service in the given resource
     *     group.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SharedPrivateLinkResourceInner get(
        String resourceGroupName, String searchServiceName, String sharedPrivateLinkResourceName);

    /**
     * Initiates the deletion of the shared private link resource from the search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive
     *     Search service within the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String searchServiceName, String sharedPrivateLinkResourceName, UUID clientRequestId);

    /**
     * Initiates the deletion of the shared private link resource from the search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive
     *     Search service within the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName,
        String searchServiceName,
        String sharedPrivateLinkResourceName,
        UUID clientRequestId,
        Context context);

    /**
     * Initiates the deletion of the shared private link resource from the search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive
     *     Search service within the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName, String searchServiceName, String sharedPrivateLinkResourceName, UUID clientRequestId);

    /**
     * Initiates the deletion of the shared private link resource from the search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive
     *     Search service within the specified resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String searchServiceName, String sharedPrivateLinkResourceName);

    /**
     * Initiates the deletion of the shared private link resource from the search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param sharedPrivateLinkResourceName The name of the shared private link resource managed by the Azure Cognitive
     *     Search service within the specified resource group.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String searchServiceName,
        String sharedPrivateLinkResourceName,
        UUID clientRequestId,
        Context context);

    /**
     * Gets a list of all shared private link resources managed by the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all shared private link resources managed by the given service as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SharedPrivateLinkResourceInner> listByService(String resourceGroupName, String searchServiceName);

    /**
     * Gets a list of all shared private link resources managed by the given service.
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
     * @return a list of all shared private link resources managed by the given service as paginated response with
     *     {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SharedPrivateLinkResourceInner> listByService(
        String resourceGroupName, String searchServiceName, UUID clientRequestId, Context context);
}
