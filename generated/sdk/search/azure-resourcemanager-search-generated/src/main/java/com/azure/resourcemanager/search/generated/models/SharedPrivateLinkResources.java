// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.UUID;

/** Resource collection API of SharedPrivateLinkResources. */
public interface SharedPrivateLinkResources {
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
    SharedPrivateLinkResource get(
        String resourceGroupName, String searchServiceName, String sharedPrivateLinkResourceName);

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
     * @return the details of the shared private link resource managed by the search service in the given resource
     *     group.
     */
    Response<SharedPrivateLinkResource> getWithResponse(
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
     * @return a list of all shared private link resources managed by the given service.
     */
    PagedIterable<SharedPrivateLinkResource> listByService(String resourceGroupName, String searchServiceName);

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
     * @return a list of all shared private link resources managed by the given service.
     */
    PagedIterable<SharedPrivateLinkResource> listByService(
        String resourceGroupName, String searchServiceName, UUID clientRequestId, Context context);

    /**
     * Gets the details of the shared private link resource managed by the search service in the given resource group.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the shared private link resource managed by the search service in the given resource
     *     group.
     */
    SharedPrivateLinkResource getById(String id);

    /**
     * Gets the details of the shared private link resource managed by the search service in the given resource group.
     *
     * @param id the resource ID.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details of the shared private link resource managed by the search service in the given resource
     *     group.
     */
    Response<SharedPrivateLinkResource> getByIdWithResponse(String id, UUID clientRequestId, Context context);

    /**
     * Initiates the deletion of the shared private link resource from the search service.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Initiates the deletion of the shared private link resource from the search service.
     *
     * @param id the resource ID.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, UUID clientRequestId, Context context);

    /**
     * Begins definition for a new SharedPrivateLinkResource resource.
     *
     * @param name resource name.
     * @return the first stage of the new SharedPrivateLinkResource definition.
     */
    SharedPrivateLinkResource.DefinitionStages.Blank define(String name);
}
