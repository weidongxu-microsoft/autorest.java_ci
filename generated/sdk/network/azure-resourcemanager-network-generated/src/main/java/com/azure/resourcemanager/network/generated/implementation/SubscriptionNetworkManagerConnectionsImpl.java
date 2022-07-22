// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.SubscriptionNetworkManagerConnectionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerConnectionInner;
import com.azure.resourcemanager.network.generated.models.NetworkManagerConnection;
import com.azure.resourcemanager.network.generated.models.SubscriptionNetworkManagerConnections;

public final class SubscriptionNetworkManagerConnectionsImpl implements SubscriptionNetworkManagerConnections {
    private static final ClientLogger LOGGER = new ClientLogger(SubscriptionNetworkManagerConnectionsImpl.class);

    private final SubscriptionNetworkManagerConnectionsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public SubscriptionNetworkManagerConnectionsImpl(
        SubscriptionNetworkManagerConnectionsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public NetworkManagerConnection get(String networkManagerConnectionName) {
        NetworkManagerConnectionInner inner = this.serviceClient().get(networkManagerConnectionName);
        if (inner != null) {
            return new NetworkManagerConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<NetworkManagerConnection> getWithResponse(String networkManagerConnectionName, Context context) {
        Response<NetworkManagerConnectionInner> inner =
            this.serviceClient().getWithResponse(networkManagerConnectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new NetworkManagerConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String networkManagerConnectionName) {
        this.serviceClient().delete(networkManagerConnectionName);
    }

    public Response<Void> deleteWithResponse(String networkManagerConnectionName, Context context) {
        return this.serviceClient().deleteWithResponse(networkManagerConnectionName, context);
    }

    public PagedIterable<NetworkManagerConnection> list() {
        PagedIterable<NetworkManagerConnectionInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new NetworkManagerConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkManagerConnection> list(Integer top, String skipToken, Context context) {
        PagedIterable<NetworkManagerConnectionInner> inner = this.serviceClient().list(top, skipToken, context);
        return Utils.mapPage(inner, inner1 -> new NetworkManagerConnectionImpl(inner1, this.manager()));
    }

    public NetworkManagerConnection getById(String id) {
        String networkManagerConnectionName = Utils.getValueFromIdByName(id, "networkManagerConnections");
        if (networkManagerConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkManagerConnections'.",
                                id)));
        }
        return this.getWithResponse(networkManagerConnectionName, Context.NONE).getValue();
    }

    public Response<NetworkManagerConnection> getByIdWithResponse(String id, Context context) {
        String networkManagerConnectionName = Utils.getValueFromIdByName(id, "networkManagerConnections");
        if (networkManagerConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkManagerConnections'.",
                                id)));
        }
        return this.getWithResponse(networkManagerConnectionName, context);
    }

    public void deleteById(String id) {
        String networkManagerConnectionName = Utils.getValueFromIdByName(id, "networkManagerConnections");
        if (networkManagerConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkManagerConnections'.",
                                id)));
        }
        this.deleteWithResponse(networkManagerConnectionName, Context.NONE);
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String networkManagerConnectionName = Utils.getValueFromIdByName(id, "networkManagerConnections");
        if (networkManagerConnectionName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'networkManagerConnections'.",
                                id)));
        }
        return this.deleteWithResponse(networkManagerConnectionName, context);
    }

    private SubscriptionNetworkManagerConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public NetworkManagerConnectionImpl define(String name) {
        return new NetworkManagerConnectionImpl(name, this.manager());
    }
}