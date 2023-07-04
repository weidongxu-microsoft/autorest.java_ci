// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurekusto.generated.fluent.DatabaseOperationsClient;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.DatabaseInviteFollowerResultInner;
import com.azure.resourcemanager.azurekusto.generated.models.DatabaseInviteFollowerRequest;
import com.azure.resourcemanager.azurekusto.generated.models.DatabaseInviteFollowerResult;
import com.azure.resourcemanager.azurekusto.generated.models.DatabaseOperations;

public final class DatabaseOperationsImpl implements DatabaseOperations {
    private static final ClientLogger LOGGER = new ClientLogger(DatabaseOperationsImpl.class);

    private final DatabaseOperationsClient innerClient;

    private final com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager;

    public DatabaseOperationsImpl(
        DatabaseOperationsClient innerClient,
        com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<DatabaseInviteFollowerResult> inviteFollowerWithResponse(
        String resourceGroupName,
        String clusterName,
        String databaseName,
        DatabaseInviteFollowerRequest parameters,
        Context context) {
        Response<DatabaseInviteFollowerResultInner> inner =
            this
                .serviceClient()
                .inviteFollowerWithResponse(resourceGroupName, clusterName, databaseName, parameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DatabaseInviteFollowerResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DatabaseInviteFollowerResult inviteFollower(
        String resourceGroupName, String clusterName, String databaseName, DatabaseInviteFollowerRequest parameters) {
        DatabaseInviteFollowerResultInner inner =
            this.serviceClient().inviteFollower(resourceGroupName, clusterName, databaseName, parameters);
        if (inner != null) {
            return new DatabaseInviteFollowerResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private DatabaseOperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.azurekusto.generated.KustoManager manager() {
        return this.serviceManager;
    }
}
