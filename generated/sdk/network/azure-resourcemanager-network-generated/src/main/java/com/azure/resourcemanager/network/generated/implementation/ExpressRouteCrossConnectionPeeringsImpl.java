// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ExpressRouteCrossConnectionPeeringsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCrossConnectionPeeringInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCrossConnectionPeering;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCrossConnectionPeerings;

public final class ExpressRouteCrossConnectionPeeringsImpl implements ExpressRouteCrossConnectionPeerings {
    private static final ClientLogger LOGGER = new ClientLogger(ExpressRouteCrossConnectionPeeringsImpl.class);

    private final ExpressRouteCrossConnectionPeeringsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ExpressRouteCrossConnectionPeeringsImpl(ExpressRouteCrossConnectionPeeringsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ExpressRouteCrossConnectionPeering> list(String resourceGroupName,
        String crossConnectionName) {
        PagedIterable<ExpressRouteCrossConnectionPeeringInner> inner
            = this.serviceClient().list(resourceGroupName, crossConnectionName);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ExpressRouteCrossConnectionPeeringImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteCrossConnectionPeering> list(String resourceGroupName, String crossConnectionName,
        Context context) {
        PagedIterable<ExpressRouteCrossConnectionPeeringInner> inner
            = this.serviceClient().list(resourceGroupName, crossConnectionName, context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ExpressRouteCrossConnectionPeeringImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String crossConnectionName, String peeringName) {
        this.serviceClient().delete(resourceGroupName, crossConnectionName, peeringName);
    }

    public void delete(String resourceGroupName, String crossConnectionName, String peeringName, Context context) {
        this.serviceClient().delete(resourceGroupName, crossConnectionName, peeringName, context);
    }

    public Response<ExpressRouteCrossConnectionPeering> getWithResponse(String resourceGroupName,
        String crossConnectionName, String peeringName, Context context) {
        Response<ExpressRouteCrossConnectionPeeringInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, crossConnectionName, peeringName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExpressRouteCrossConnectionPeeringImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRouteCrossConnectionPeering get(String resourceGroupName, String crossConnectionName,
        String peeringName) {
        ExpressRouteCrossConnectionPeeringInner inner
            = this.serviceClient().get(resourceGroupName, crossConnectionName, peeringName);
        if (inner != null) {
            return new ExpressRouteCrossConnectionPeeringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCrossConnectionPeering createOrUpdate(String resourceGroupName, String crossConnectionName,
        String peeringName, ExpressRouteCrossConnectionPeeringInner peeringParameters) {
        ExpressRouteCrossConnectionPeeringInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, crossConnectionName, peeringName, peeringParameters);
        if (inner != null) {
            return new ExpressRouteCrossConnectionPeeringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ExpressRouteCrossConnectionPeering createOrUpdate(String resourceGroupName, String crossConnectionName,
        String peeringName, ExpressRouteCrossConnectionPeeringInner peeringParameters, Context context) {
        ExpressRouteCrossConnectionPeeringInner inner = this.serviceClient()
            .createOrUpdate(resourceGroupName, crossConnectionName, peeringName, peeringParameters, context);
        if (inner != null) {
            return new ExpressRouteCrossConnectionPeeringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ExpressRouteCrossConnectionPeeringsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
