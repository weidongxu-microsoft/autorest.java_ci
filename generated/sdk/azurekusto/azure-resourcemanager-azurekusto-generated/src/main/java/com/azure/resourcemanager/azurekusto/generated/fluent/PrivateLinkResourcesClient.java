// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.PrivateLinkResourceInner;

/** An instance of this class provides access to all the operations defined in PrivateLinkResourcesClient. */
public interface PrivateLinkResourcesClient {
    /**
     * Returns the list of private link resources.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkResourceInner> list(String resourceGroupName, String clusterName);

    /**
     * Returns the list of private link resources.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of private link resources as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PrivateLinkResourceInner> list(String resourceGroupName, String clusterName, Context context);

    /**
     * Gets a private link resource.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param privateLinkResourceName The name of the private link resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private link resource along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PrivateLinkResourceInner> getWithResponse(
        String resourceGroupName, String clusterName, String privateLinkResourceName, Context context);

    /**
     * Gets a private link resource.
     *
     * @param resourceGroupName The name of the resource group containing the Kusto cluster.
     * @param clusterName The name of the Kusto cluster.
     * @param privateLinkResourceName The name of the private link resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a private link resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PrivateLinkResourceInner get(String resourceGroupName, String clusterName, String privateLinkResourceName);
}
