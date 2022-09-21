// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.GlobalsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.DeletedSiteInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.SnapshotInner;
import com.azure.resourcemanager.appservice.generated.models.DeletedSite;
import com.azure.resourcemanager.appservice.generated.models.Globals;
import com.azure.resourcemanager.appservice.generated.models.Snapshot;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class GlobalsImpl implements Globals {
    private static final ClientLogger LOGGER = new ClientLogger(GlobalsImpl.class);

    private final GlobalsClient innerClient;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public GlobalsImpl(
        GlobalsClient innerClient, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<DeletedSite> getDeletedWebAppWithResponse(String deletedSiteId, Context context) {
        Response<DeletedSiteInner> inner = this.serviceClient().getDeletedWebAppWithResponse(deletedSiteId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeletedSiteImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DeletedSite getDeletedWebApp(String deletedSiteId) {
        DeletedSiteInner inner = this.serviceClient().getDeletedWebApp(deletedSiteId);
        if (inner != null) {
            return new DeletedSiteImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<List<Snapshot>> getDeletedWebAppSnapshotsWithResponse(String deletedSiteId, Context context) {
        Response<List<SnapshotInner>> inner =
            this.serviceClient().getDeletedWebAppSnapshotsWithResponse(deletedSiteId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new SnapshotImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public List<Snapshot> getDeletedWebAppSnapshots(String deletedSiteId) {
        List<SnapshotInner> inner = this.serviceClient().getDeletedWebAppSnapshots(deletedSiteId);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new SnapshotImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<Void> getSubscriptionOperationWithAsyncResponseWithResponse(
        String location, String operationId, Context context) {
        return this
            .serviceClient()
            .getSubscriptionOperationWithAsyncResponseWithResponse(location, operationId, context);
    }

    public void getSubscriptionOperationWithAsyncResponse(String location, String operationId) {
        this.serviceClient().getSubscriptionOperationWithAsyncResponse(location, operationId);
    }

    private GlobalsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
