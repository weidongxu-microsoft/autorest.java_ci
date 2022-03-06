// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.generated.fluent.ServerAdministratorsClient;
import com.azure.resourcemanager.mysql.generated.fluent.models.ServerAdministratorResourceInner;
import com.azure.resourcemanager.mysql.generated.models.ServerAdministratorResource;
import com.azure.resourcemanager.mysql.generated.models.ServerAdministrators;

public final class ServerAdministratorsImpl implements ServerAdministrators {
    private static final ClientLogger LOGGER = new ClientLogger(ServerAdministratorsImpl.class);

    private final ServerAdministratorsClient innerClient;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

    public ServerAdministratorsImpl(
        ServerAdministratorsClient innerClient, com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ServerAdministratorResource get(String resourceGroupName, String serverName) {
        ServerAdministratorResourceInner inner = this.serviceClient().get(resourceGroupName, serverName);
        if (inner != null) {
            return new ServerAdministratorResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServerAdministratorResource> getWithResponse(
        String resourceGroupName, String serverName, Context context) {
        Response<ServerAdministratorResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serverName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServerAdministratorResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ServerAdministratorResource createOrUpdate(
        String resourceGroupName, String serverName, ServerAdministratorResourceInner properties) {
        ServerAdministratorResourceInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, serverName, properties);
        if (inner != null) {
            return new ServerAdministratorResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ServerAdministratorResource createOrUpdate(
        String resourceGroupName, String serverName, ServerAdministratorResourceInner properties, Context context) {
        ServerAdministratorResourceInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, serverName, properties, context);
        if (inner != null) {
            return new ServerAdministratorResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String serverName) {
        this.serviceClient().delete(resourceGroupName, serverName);
    }

    public void delete(String resourceGroupName, String serverName, Context context) {
        this.serviceClient().delete(resourceGroupName, serverName, context);
    }

    public PagedIterable<ServerAdministratorResource> list(String resourceGroupName, String serverName) {
        PagedIterable<ServerAdministratorResourceInner> inner =
            this.serviceClient().list(resourceGroupName, serverName);
        return Utils.mapPage(inner, inner1 -> new ServerAdministratorResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<ServerAdministratorResource> list(
        String resourceGroupName, String serverName, Context context) {
        PagedIterable<ServerAdministratorResourceInner> inner =
            this.serviceClient().list(resourceGroupName, serverName, context);
        return Utils.mapPage(inner, inner1 -> new ServerAdministratorResourceImpl(inner1, this.manager()));
    }

    private ServerAdministratorsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }
}
