// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.generated.fluent.PrivateLinkScopeOperationStatusClient;
import com.azure.resourcemanager.monitor.generated.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.monitor.generated.models.OperationStatus;
import com.azure.resourcemanager.monitor.generated.models.PrivateLinkScopeOperationStatus;

public final class PrivateLinkScopeOperationStatusImpl implements PrivateLinkScopeOperationStatus {
    private static final ClientLogger LOGGER = new ClientLogger(PrivateLinkScopeOperationStatusImpl.class);

    private final PrivateLinkScopeOperationStatusClient innerClient;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public PrivateLinkScopeOperationStatusImpl(PrivateLinkScopeOperationStatusClient innerClient,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<OperationStatus> getByResourceGroupWithResponse(String resourceGroupName, String asyncOperationId,
        Context context) {
        Response<OperationStatusInner> inner
            = this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, asyncOperationId, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new OperationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public OperationStatus getByResourceGroup(String resourceGroupName, String asyncOperationId) {
        OperationStatusInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, asyncOperationId);
        if (inner != null) {
            return new OperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private PrivateLinkScopeOperationStatusClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
