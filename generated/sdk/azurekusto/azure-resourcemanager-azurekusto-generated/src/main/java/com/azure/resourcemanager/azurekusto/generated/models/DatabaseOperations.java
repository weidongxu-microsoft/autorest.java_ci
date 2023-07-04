// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.models;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of DatabaseOperations. */
public interface DatabaseOperations {
    /**
     * Generates an invitation token that allows attaching a follower database to this database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters The follower invitation request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a follower invitation generation request along with {@link Response}.
     */
    Response<DatabaseInviteFollowerResult> inviteFollowerWithResponse(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DatabaseInviteFollowerRequest parameters,
        Context context);

    /**
     * Generates an invitation token that allows attaching a follower database to this database.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterName The name of the Kusto cluster.
     * @param databaseName The name of the database in the Kusto cluster.
     * @param parameters The follower invitation request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result returned from a follower invitation generation request.
     */
    DatabaseInviteFollowerResult inviteFollower(
        String resourceGroupName, String clusterName, String databaseName, DatabaseInviteFollowerRequest parameters);
}
