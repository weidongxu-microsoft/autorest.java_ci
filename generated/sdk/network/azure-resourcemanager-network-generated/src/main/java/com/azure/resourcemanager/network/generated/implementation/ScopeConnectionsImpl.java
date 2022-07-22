// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ScopeConnectionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ScopeConnectionInner;
import com.azure.resourcemanager.network.generated.models.ScopeConnection;
import com.azure.resourcemanager.network.generated.models.ScopeConnections;

public final class ScopeConnectionsImpl implements ScopeConnections {
    private static final ClientLogger LOGGER = new ClientLogger(ScopeConnectionsImpl.class);

    private final ScopeConnectionsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ScopeConnectionsImpl(
        ScopeConnectionsClient innerClient, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ScopeConnection get(String resourceGroupName, String networkManagerName, String scopeConnectionName) {
        ScopeConnectionInner inner =
            this.serviceClient().get(resourceGroupName, networkManagerName, scopeConnectionName);
        if (inner != null) {
            return new ScopeConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ScopeConnection> getWithResponse(
        String resourceGroupName, String networkManagerName, String scopeConnectionName, Context context) {
        Response<ScopeConnectionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, networkManagerName, scopeConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ScopeConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String networkManagerName, String scopeConnectionName) {
        this.serviceClient().delete(resourceGroupName, networkManagerName, scopeConnectionName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String networkManagerName, String scopeConnectionName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, networkManagerName, scopeConnectionName, context);
    }

    public PagedIterable<ScopeConnection> list(String resourceGroupName, String networkManagerName) {
        PagedIterable<ScopeConnectionInner> inner = this.serviceClient().list(resourceGroupName, networkManagerName);
        return Utils.mapPage(inner, inner1 -> new ScopeConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<ScopeConnection> list(
        String resourceGroupName, String networkManagerName, Integer top, String skipToken, Context context) {
        PagedIterable<ScopeConnectionInner> inner =
            this.serviceClient().list(resourceGroupName, networkManagerName, top, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new ScopeConnectionImpl(inner1, this.manager()));
    }

    public ScopeConnection getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String scopeConnectionName = Utils.getValueFromIdByName(id, "scopeConnections");
        if (scopeConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'scopeConnections'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, networkManagerName, scopeConnectionName, Context.NONE)
            .getValue();
    }

    public Response<ScopeConnection> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String scopeConnectionName = Utils.getValueFromIdByName(id, "scopeConnections");
        if (scopeConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'scopeConnections'.", id)));
        }
        return this.getWithResponse(resourceGroupName, networkManagerName, scopeConnectionName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String scopeConnectionName = Utils.getValueFromIdByName(id, "scopeConnections");
        if (scopeConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'scopeConnections'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, networkManagerName, scopeConnectionName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String networkManagerName = Utils.getValueFromIdByName(id, "networkManagers");
        if (networkManagerName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'networkManagers'.", id)));
        }
        String scopeConnectionName = Utils.getValueFromIdByName(id, "scopeConnections");
        if (scopeConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'scopeConnections'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, networkManagerName, scopeConnectionName, context);
    }

    private ScopeConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public ScopeConnectionImpl define(String name) {
        return new ScopeConnectionImpl(name, this.manager());
    }
}