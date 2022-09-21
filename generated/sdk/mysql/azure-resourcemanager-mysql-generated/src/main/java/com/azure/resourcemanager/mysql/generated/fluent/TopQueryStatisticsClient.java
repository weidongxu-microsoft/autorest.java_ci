// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.fluent.models.QueryStatisticInner;
import com.azure.resourcemanager.mysql.generated.models.TopQueryStatisticsInput;

/** An instance of this class provides access to all the operations defined in TopQueryStatisticsClient. */
public interface TopQueryStatisticsClient {
    /**
     * Retrieve the query statistic for specified identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param queryStatisticId The Query Statistic identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Query Statistic along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<QueryStatisticInner> getWithResponse(
        String resourceGroupName, String serverName, String queryStatisticId, Context context);

    /**
     * Retrieve the query statistic for specified identifier.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param queryStatisticId The Query Statistic identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a Query Statistic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    QueryStatisticInner get(String resourceGroupName, String serverName, String queryStatisticId);

    /**
     * Retrieve the Query-Store top queries for specified metric and aggregation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for retrieving top query statistics.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of query statistics as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<QueryStatisticInner> listByServer(
        String resourceGroupName, String serverName, TopQueryStatisticsInput parameters);

    /**
     * Retrieve the Query-Store top queries for specified metric and aggregation.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serverName The name of the server.
     * @param parameters The required parameters for retrieving top query statistics.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of query statistics as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<QueryStatisticInner> listByServer(
        String resourceGroupName, String serverName, TopQueryStatisticsInput parameters, Context context);
}
