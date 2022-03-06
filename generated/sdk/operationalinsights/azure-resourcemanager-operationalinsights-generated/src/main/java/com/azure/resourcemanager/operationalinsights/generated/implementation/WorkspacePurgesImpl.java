// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationalinsights.generated.fluent.WorkspacePurgesClient;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.WorkspacePurgeResponseInner;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.WorkspacePurgeStatusResponseInner;
import com.azure.resourcemanager.operationalinsights.generated.models.WorkspacePurgeBody;
import com.azure.resourcemanager.operationalinsights.generated.models.WorkspacePurgeResponse;
import com.azure.resourcemanager.operationalinsights.generated.models.WorkspacePurgeStatusResponse;
import com.azure.resourcemanager.operationalinsights.generated.models.WorkspacePurges;
import com.azure.resourcemanager.operationalinsights.generated.models.WorkspacePurgesPurgeResponse;

public final class WorkspacePurgesImpl implements WorkspacePurges {
    private static final ClientLogger LOGGER = new ClientLogger(WorkspacePurgesImpl.class);

    private final WorkspacePurgesClient innerClient;

    private final com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager;

    public WorkspacePurgesImpl(
        WorkspacePurgesClient innerClient,
        com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public WorkspacePurgeResponse purge(String resourceGroupName, String workspaceName, WorkspacePurgeBody body) {
        WorkspacePurgeResponseInner inner = this.serviceClient().purge(resourceGroupName, workspaceName, body);
        if (inner != null) {
            return new WorkspacePurgeResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkspacePurgeResponse> purgeWithResponse(
        String resourceGroupName, String workspaceName, WorkspacePurgeBody body, Context context) {
        WorkspacePurgesPurgeResponse inner =
            this.serviceClient().purgeWithResponse(resourceGroupName, workspaceName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkspacePurgeResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public WorkspacePurgeStatusResponse getPurgeStatus(String resourceGroupName, String workspaceName, String purgeId) {
        WorkspacePurgeStatusResponseInner inner =
            this.serviceClient().getPurgeStatus(resourceGroupName, workspaceName, purgeId);
        if (inner != null) {
            return new WorkspacePurgeStatusResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<WorkspacePurgeStatusResponse> getPurgeStatusWithResponse(
        String resourceGroupName, String workspaceName, String purgeId, Context context) {
        Response<WorkspacePurgeStatusResponseInner> inner =
            this.serviceClient().getPurgeStatusWithResponse(resourceGroupName, workspaceName, purgeId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new WorkspacePurgeStatusResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private WorkspacePurgesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager manager() {
        return this.serviceManager;
    }
}
