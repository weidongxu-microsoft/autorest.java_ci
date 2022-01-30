// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import java.util.UUID;

/** Resource collection API of PrivateLinkResources. */
public interface PrivateLinkResources {
    /**
     * Gets a list of all supported private link resource types for the given service.
     *
     * @param resourceGroupName The name of the resource group within the current subscription. You can obtain this
     *     value from the Azure Resource Manager API or the portal.
     * @param searchServiceName The name of the Azure Cognitive Search service associated with the specified resource
     *     group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all supported private link resource types for the given service as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkResource> listSupported(String resourceGroupName, String searchServiceName);

    /**
     * Gets a list of all supported private link resource types for the given service.
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
     * @return a list of all supported private link resource types for the given service as paginated response with
     *     {@link PagedIterable}.
     */
    PagedIterable<PrivateLinkResource> listSupported(
        String resourceGroupName, String searchServiceName, UUID clientRequestId, Context context);
}
