// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/** Resource collection API of Skus. */
public interface Skus {
    /**
     * Lists eligible region SKUs for Kusto resource provider by Azure region.
     *
     * @param location The name of Azure region.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the EngagementFabric SKU descriptions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SkuDescription> list(String location);

    /**
     * Lists eligible region SKUs for Kusto resource provider by Azure region.
     *
     * @param location The name of Azure region.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of the EngagementFabric SKU descriptions as paginated response with {@link PagedIterable}.
     */
    PagedIterable<SkuDescription> list(String location, Context context);
}
