// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ExpressRoutePortsLocationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRoutePortsLocationInner;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePortsLocation;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePortsLocations;

public final class ExpressRoutePortsLocationsImpl implements ExpressRoutePortsLocations {
    private static final ClientLogger LOGGER = new ClientLogger(ExpressRoutePortsLocationsImpl.class);

    private final ExpressRoutePortsLocationsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ExpressRoutePortsLocationsImpl(ExpressRoutePortsLocationsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ExpressRoutePortsLocation> list() {
        PagedIterable<ExpressRoutePortsLocationInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ExpressRoutePortsLocationImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRoutePortsLocation> list(Context context) {
        PagedIterable<ExpressRoutePortsLocationInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new ExpressRoutePortsLocationImpl(inner1, this.manager()));
    }

    public Response<ExpressRoutePortsLocation> getWithResponse(String locationName, Context context) {
        Response<ExpressRoutePortsLocationInner> inner = this.serviceClient().getWithResponse(locationName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new ExpressRoutePortsLocationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ExpressRoutePortsLocation get(String locationName) {
        ExpressRoutePortsLocationInner inner = this.serviceClient().get(locationName);
        if (inner != null) {
            return new ExpressRoutePortsLocationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    private ExpressRoutePortsLocationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
