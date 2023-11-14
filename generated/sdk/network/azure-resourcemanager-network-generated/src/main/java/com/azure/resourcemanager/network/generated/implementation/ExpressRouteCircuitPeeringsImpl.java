// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ExpressRouteCircuitPeeringsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteCircuitPeeringInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitPeering;
import com.azure.resourcemanager.network.generated.models.ExpressRouteCircuitPeerings;

public final class ExpressRouteCircuitPeeringsImpl implements ExpressRouteCircuitPeerings {
    private static final ClientLogger LOGGER = new ClientLogger(ExpressRouteCircuitPeeringsImpl.class);

    private final ExpressRouteCircuitPeeringsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ExpressRouteCircuitPeeringsImpl(ExpressRouteCircuitPeeringsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String circuitName, String peeringName) {
        this.serviceClient().delete(resourceGroupName, circuitName, peeringName);
    }

    public void delete(String resourceGroupName, String circuitName, String peeringName, Context context) {
        this.serviceClient().delete(resourceGroupName, circuitName, peeringName, context);
    }

    public Response<ExpressRouteCircuitPeering> getWithResponse(String resourceGroupName, String circuitName,
        String peeringName, Context context) {
        Response<ExpressRouteCircuitPeeringInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, circuitName, peeringName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExpressRouteCircuitPeeringImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRouteCircuitPeering get(String resourceGroupName, String circuitName, String peeringName) {
        ExpressRouteCircuitPeeringInner inner = this.serviceClient().get(resourceGroupName, circuitName, peeringName);
        if (inner != null) {
            return new ExpressRouteCircuitPeeringImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<ExpressRouteCircuitPeering> list(String resourceGroupName, String circuitName) {
        PagedIterable<ExpressRouteCircuitPeeringInner> inner
            = this.serviceClient().list(resourceGroupName, circuitName);
        return Utils.mapPage(inner, inner1 -> new ExpressRouteCircuitPeeringImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteCircuitPeering> list(String resourceGroupName, String circuitName,
        Context context) {
        PagedIterable<ExpressRouteCircuitPeeringInner> inner
            = this.serviceClient().list(resourceGroupName, circuitName, context);
        return Utils.mapPage(inner, inner1 -> new ExpressRouteCircuitPeeringImpl(inner1, this.manager()));
    }

    public ExpressRouteCircuitPeering getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String circuitName = Utils.getValueFromIdByName(id, "expressRouteCircuits");
        if (circuitName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRouteCircuits'.", id)));
        }
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        return this.getWithResponse(resourceGroupName, circuitName, peeringName, Context.NONE).getValue();
    }

    public Response<ExpressRouteCircuitPeering> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String circuitName = Utils.getValueFromIdByName(id, "expressRouteCircuits");
        if (circuitName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRouteCircuits'.", id)));
        }
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        return this.getWithResponse(resourceGroupName, circuitName, peeringName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String circuitName = Utils.getValueFromIdByName(id, "expressRouteCircuits");
        if (circuitName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRouteCircuits'.", id)));
        }
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        this.delete(resourceGroupName, circuitName, peeringName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String circuitName = Utils.getValueFromIdByName(id, "expressRouteCircuits");
        if (circuitName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'expressRouteCircuits'.", id)));
        }
        String peeringName = Utils.getValueFromIdByName(id, "peerings");
        if (peeringName == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                String.format("The resource ID '%s' is not valid. Missing path segment 'peerings'.", id)));
        }
        this.delete(resourceGroupName, circuitName, peeringName, context);
    }

    private ExpressRouteCircuitPeeringsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    public ExpressRouteCircuitPeeringImpl define(String name) {
        return new ExpressRouteCircuitPeeringImpl(name, this.manager());
    }
}
