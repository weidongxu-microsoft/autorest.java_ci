// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ExpressRouteConnectionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteConnectionInner;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteConnectionListInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteConnection;
import com.azure.resourcemanager.network.generated.models.ExpressRouteConnectionList;
import com.azure.resourcemanager.network.generated.models.ExpressRouteConnections;

public final class ExpressRouteConnectionsImpl implements ExpressRouteConnections {
    private static final ClientLogger LOGGER = new ClientLogger(ExpressRouteConnectionsImpl.class);

    private final ExpressRouteConnectionsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ExpressRouteConnectionsImpl(ExpressRouteConnectionsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ExpressRouteConnection createOrUpdate(String resourceGroupName, String expressRouteGatewayName,
        String connectionName, ExpressRouteConnectionInner putExpressRouteConnectionParameters) {
        ExpressRouteConnectionInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, expressRouteGatewayName, connectionName,
                putExpressRouteConnectionParameters);
        if (inner != null) {
            return new ExpressRouteConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteConnection createOrUpdate(String resourceGroupName, String expressRouteGatewayName,
        String connectionName, ExpressRouteConnectionInner putExpressRouteConnectionParameters, Context context) {
        ExpressRouteConnectionInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, expressRouteGatewayName, connectionName,
                putExpressRouteConnectionParameters, context);
        if (inner != null) {
            return new ExpressRouteConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteConnection> getWithResponse(String resourceGroupName, String expressRouteGatewayName,
        String connectionName, Context context) {
        Response<ExpressRouteConnectionInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, expressRouteGatewayName, connectionName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExpressRouteConnectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRouteConnection get(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        ExpressRouteConnectionInner inner
            = this.serviceClient().get(resourceGroupName, expressRouteGatewayName, connectionName);
        if (inner != null) {
            return new ExpressRouteConnectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String expressRouteGatewayName, String connectionName) {
        this.serviceClient().delete(resourceGroupName, expressRouteGatewayName, connectionName);
    }

    public void delete(String resourceGroupName, String expressRouteGatewayName, String connectionName,
        Context context) {
        this.serviceClient().delete(resourceGroupName, expressRouteGatewayName, connectionName, context);
    }

    public Response<ExpressRouteConnectionList> listWithResponse(String resourceGroupName,
        String expressRouteGatewayName, Context context) {
        Response<ExpressRouteConnectionListInner> inner
            = this.serviceClient().listWithResponse(resourceGroupName, expressRouteGatewayName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExpressRouteConnectionListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRouteConnectionList list(String resourceGroupName, String expressRouteGatewayName) {
        ExpressRouteConnectionListInner inner = this.serviceClient().list(resourceGroupName, expressRouteGatewayName);
        if (inner != null) {
            return new ExpressRouteConnectionListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ExpressRouteConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
