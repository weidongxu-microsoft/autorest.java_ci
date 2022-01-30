// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policy.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policy.generated.fluent.models.DataPolicyManifestInner;

/** An instance of this class provides access to all the operations defined in DataPolicyManifestsClient. */
public interface DataPolicyManifestsClient {
    /**
     * This operation retrieves the data policy manifest with the given policy mode.
     *
     * @param policyMode The policy mode of the data policy manifest to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the data policy manifest.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DataPolicyManifestInner getByPolicyMode(String policyMode);

    /**
     * This operation retrieves the data policy manifest with the given policy mode.
     *
     * @param policyMode The policy mode of the data policy manifest to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the data policy manifest along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DataPolicyManifestInner> getByPolicyModeWithResponse(String policyMode, Context context);

    /**
     * This operation retrieves a list of all the data policy manifests that match the optional given $filter. Valid
     * values for $filter are: "$filter=namespace eq '{0}'". If $filter is not provided, the unfiltered list includes
     * all data policy manifests for data resource types. If $filter=namespace is provided, the returned list only
     * includes all data policy manifests that have a namespace matching the provided value.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of data policy manifests as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataPolicyManifestInner> list();

    /**
     * This operation retrieves a list of all the data policy manifests that match the optional given $filter. Valid
     * values for $filter are: "$filter=namespace eq '{0}'". If $filter is not provided, the unfiltered list includes
     * all data policy manifests for data resource types. If $filter=namespace is provided, the returned list only
     * includes all data policy manifests that have a namespace matching the provided value.
     *
     * @param filter The filter to apply on the operation. Valid values for $filter are: "namespace eq '{value}'". If
     *     $filter is not provided, no filtering is performed. If $filter=namespace eq '{value}' is provided, the
     *     returned list only includes all data policy manifests that have a namespace matching the provided value.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of data policy manifests as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DataPolicyManifestInner> list(String filter, Context context);
}
