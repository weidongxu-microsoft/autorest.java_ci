// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.generated.fluent.OperationProgressClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.OperationProgressResultInner;
import com.azure.resourcemanager.mysql.generated.models.OperationProgress;
import com.azure.resourcemanager.mysql.generated.models.OperationProgressResult;

public final class OperationProgressImpl implements OperationProgress {
    private static final ClientLogger LOGGER = new ClientLogger(OperationProgressImpl.class);

    private final OperationProgressClient innerClient;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    public OperationProgressImpl(OperationProgressClient innerClient,
        com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<OperationProgressResult> getWithResponse(String locationName, String operationId, Context context) {
        Response<OperationProgressResultInner> inner
            = this.serviceClient().getWithResponse(locationName, operationId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new OperationProgressResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OperationProgressResult get(String locationName, String operationId) {
        OperationProgressResultInner inner = this.serviceClient().get(locationName, operationId);
        if (inner != null) {
            return new OperationProgressResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private OperationProgressClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }
}
