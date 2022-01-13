// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcegraph.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resourcegraph.generated.fluent.models.QueryResponseInner;
import com.azure.resourcemanager.resourcegraph.generated.models.QueryRequest;
import com.azure.resourcemanager.resourcegraph.generated.models.ResourcesHistoryRequest;

/** An instance of this class provides access to all the operations defined in ResourceProvidersClient. */
public interface ResourceProvidersClient {
    /**
     * Queries the resources managed by Azure Resource Manager for scopes specified in the request.
     *
     * @param query Request specifying query and its options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    QueryResponseInner resources(QueryRequest query);

    /**
     * Queries the resources managed by Azure Resource Manager for scopes specified in the request.
     *
     * @param query Request specifying query and its options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<QueryResponseInner> resourcesWithResponse(QueryRequest query, Context context);

    /**
     * List all snapshots of a resource for a given time interval.
     *
     * @param request Request specifying the query and its options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Object resourcesHistory(ResourcesHistoryRequest request);

    /**
     * List all snapshots of a resource for a given time interval.
     *
     * @param request Request specifying the query and its options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return any object along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Object> resourcesHistoryWithResponse(ResourcesHistoryRequest request, Context context);
}
