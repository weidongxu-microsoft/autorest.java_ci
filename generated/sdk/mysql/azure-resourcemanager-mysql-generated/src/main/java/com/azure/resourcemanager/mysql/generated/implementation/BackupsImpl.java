// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.generated.fluent.BackupsClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.ServerBackupInner;
import com.azure.resourcemanager.mysql.generated.models.Backups;
import com.azure.resourcemanager.mysql.generated.models.ServerBackup;

public final class BackupsImpl implements Backups {
    private static final ClientLogger LOGGER = new ClientLogger(BackupsImpl.class);

    private final BackupsClient innerClient;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    public BackupsImpl(
        BackupsClient innerClient, com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<ServerBackup> putWithResponse(
        String resourceGroupName, String serverName, String backupName, Context context) {
        Response<ServerBackupInner> inner =
            this.serviceClient().putWithResponse(resourceGroupName, serverName, backupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerBackupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServerBackup put(String resourceGroupName, String serverName, String backupName) {
        ServerBackupInner inner = this.serviceClient().put(resourceGroupName, serverName, backupName);
        if (inner != null) {
            return new ServerBackupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerBackup> getWithResponse(
        String resourceGroupName, String serverName, String backupName, Context context) {
        Response<ServerBackupInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, backupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerBackupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServerBackup get(String resourceGroupName, String serverName, String backupName) {
        ServerBackupInner inner = this.serviceClient().get(resourceGroupName, serverName, backupName);
        if (inner != null) {
            return new ServerBackupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ServerBackup> listByServer(String resourceGroupName, String serverName) {
        PagedIterable<ServerBackupInner> inner = this.serviceClient().listByServer(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new ServerBackupImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerBackup> listByServer(String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerBackupInner> inner =
            this.serviceClient().listByServer(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new ServerBackupImpl(inner1, this.manager()));
    }

    private BackupsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }
}