// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import java.util.UUID;

/** Resource collection API of QueryKeys. */
public interface QueryKeys {
    /**
     * Generates a new query key for the specified search service. You can create up to 50 query keys per service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param name The name of the new query API key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an API key for a given Azure Cognitive Search service that has permissions for query operations
     *     only.
     */
    QueryKey create(String resourceGroupName, String searchServiceName, String name);

    /**
     * Generates a new query key for the specified search service. You can create up to 50 query keys per service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param name The name of the new query API key.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes an API key for a given Azure Cognitive Search service that has permissions for query operations
     *     only along with {@link Response}.
     */
    Response<QueryKey> createWithResponse(
        String resourceGroupName, String searchServiceName, String name, UUID clientRequestId, Context context);

    /**
     * Returns the list of query API keys for the given Azure Cognitive Search service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response containing the query API keys for a given Azure Cognitive Search service as paginated response
     *     with {@link PagedIterable}.
     */
    PagedIterable<QueryKey> listBySearchService(String resourceGroupName, String searchServiceName);

    /**
     * Returns the list of query API keys for the given Azure Cognitive Search service.
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
     * @return response containing the query API keys for a given Azure Cognitive Search service as paginated response
     *     with {@link PagedIterable}.
     */
    PagedIterable<QueryKey> listBySearchService(
        String resourceGroupName, String searchServiceName, UUID clientRequestId, Context context);

    /**
     * Deletes the specified query key. Unlike admin keys, query keys are not regenerated. The process for regenerating
     * a query key is to delete and then recreate it.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param key The query key to be deleted. Query keys are identified by value, not by name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String searchServiceName, String key);

    /**
     * Deletes the specified query key. Unlike admin keys, query keys are not regenerated. The process for regenerating
     * a query key is to delete and then recreate it.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @param key The query key to be deleted. Query keys are identified by value, not by name.
     * @param clientRequestId A client-generated GUID value that identifies this request. If specified, this will be
     *     included in response information as a way to track the request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName, String searchServiceName, String key, UUID clientRequestId, Context context);
}
