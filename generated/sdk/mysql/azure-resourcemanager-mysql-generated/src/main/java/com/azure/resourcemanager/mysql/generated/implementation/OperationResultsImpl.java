// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.generated.fluent.OperationResultsClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.OperationStatusExtendedResultInner;
import com.azure.resourcemanager.mysql.generated.models.OperationResults;
import com.azure.resourcemanager.mysql.generated.models.OperationStatusExtendedResult;

public final class OperationResultsImpl implements OperationResults {
    private static final ClientLogger LOGGER = new ClientLogger(OperationResultsImpl.class);

    private final OperationResultsClient innerClient;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    public OperationResultsImpl(
        OperationResultsClient innerClient, com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<OperationStatusExtendedResult> getWithResponse(
        String locationName, String operationId, Context context) {
        Response<OperationStatusExtendedResultInner> inner =
            this.serviceClient().getWithResponse(locationName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationStatusExtendedResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OperationStatusExtendedResult get(String locationName, String operationId) {
        OperationStatusExtendedResultInner inner = this.serviceClient().get(locationName, operationId);
        if (inner != null) {
            return new OperationStatusExtendedResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private OperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }
}
