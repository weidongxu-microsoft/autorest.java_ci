// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ExpressRouteProviderPortsLocationsClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteProviderPortListResultInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteProviderPortListResult;
import com.azure.resourcemanager.network.generated.models.ExpressRouteProviderPortsLocations;

public final class ExpressRouteProviderPortsLocationsImpl implements ExpressRouteProviderPortsLocations {
    private static final ClientLogger LOGGER = new ClientLogger(ExpressRouteProviderPortsLocationsImpl.class);

    private final ExpressRouteProviderPortsLocationsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ExpressRouteProviderPortsLocationsImpl(
        ExpressRouteProviderPortsLocationsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ExpressRouteProviderPortListResult list() {
        ExpressRouteProviderPortListResultInner inner = this.serviceClient().list();
        if (inner != null) {
            return new ExpressRouteProviderPortListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ExpressRouteProviderPortListResult> listWithResponse(String filter, Context context) {
        Response<ExpressRouteProviderPortListResultInner> inner =
            this.serviceClient().listWithResponse(filter, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ExpressRouteProviderPortListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ExpressRouteProviderPortsLocationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}