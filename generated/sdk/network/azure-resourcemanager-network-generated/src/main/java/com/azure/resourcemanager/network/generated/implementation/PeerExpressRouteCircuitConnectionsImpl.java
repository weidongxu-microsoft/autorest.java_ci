// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.PeerExpressRouteCircuitConnectionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.PeerExpressRouteCircuitConnectionInner;
import com.azure.resourcemanager.network.generated.models.PeerExpressRouteCircuitConnection;
import com.azure.resourcemanager.network.generated.models.PeerExpressRouteCircuitConnections;

public final class PeerExpressRouteCircuitConnectionsImpl implements PeerExpressRouteCircuitConnections {
    private static final ClientLogger LOGGER = new ClientLogger(PeerExpressRouteCircuitConnectionsImpl.class);

    private final PeerExpressRouteCircuitConnectionsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public PeerExpressRouteCircuitConnectionsImpl(PeerExpressRouteCircuitConnectionsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<PeerExpressRouteCircuitConnection> getWithResponse(String resourceGroupName, String circuitName,
        String peeringName, String connectionName, Context context) {
        Response<PeerExpressRouteCircuitConnectionInner> inner = this.serviceClient().getWithResponse(resourceGroupName,
            circuitName, peeringName, connectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new PeerExpressRouteCircuitConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PeerExpressRouteCircuitConnection get(String resourceGroupName, String circuitName, String peeringName,
        String connectionName) {
        PeerExpressRouteCircuitConnectionInner inner
            = this.serviceClient().get(resourceGroupName, circuitName, peeringName, connectionName);
        if (inner != null) {
            return new PeerExpressRouteCircuitConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<PeerExpressRouteCircuitConnection> list(String resourceGroupName, String circuitName,
        String peeringName) {
        PagedIterable<PeerExpressRouteCircuitConnectionInner> inner
            = this.serviceClient().list(resourceGroupName, circuitName, peeringName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new PeerExpressRouteCircuitConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<PeerExpressRouteCircuitConnection> list(String resourceGroupName, String circuitName,
        String peeringName, Context context) {
        PagedIterable<PeerExpressRouteCircuitConnectionInner> inner
            = this.serviceClient().list(resourceGroupName, circuitName, peeringName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new PeerExpressRouteCircuitConnectionImpl(inner1, this.manager()));
    }

    private PeerExpressRouteCircuitConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
