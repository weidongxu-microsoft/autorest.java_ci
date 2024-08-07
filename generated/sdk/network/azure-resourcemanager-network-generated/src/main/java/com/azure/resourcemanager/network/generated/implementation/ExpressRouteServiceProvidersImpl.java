// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.ExpressRouteServiceProvidersClient;
import com.azure.resourcemanager.network.generated.fluent.models.ExpressRouteServiceProviderInner;
import com.azure.resourcemanager.network.generated.models.ExpressRouteServiceProvider;
import com.azure.resourcemanager.network.generated.models.ExpressRouteServiceProviders;

public final class ExpressRouteServiceProvidersImpl implements ExpressRouteServiceProviders {
    private static final ClientLogger LOGGER = new ClientLogger(ExpressRouteServiceProvidersImpl.class);

    private final ExpressRouteServiceProvidersClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public ExpressRouteServiceProvidersImpl(ExpressRouteServiceProvidersClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ExpressRouteServiceProvider> list() {
        PagedIterable<ExpressRouteServiceProviderInner> inner = this.serviceClient().list();
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ExpressRouteServiceProviderImpl(inner1, this.manager()));
    }

    public PagedIterable<ExpressRouteServiceProvider> list(Context context) {
        PagedIterable<ExpressRouteServiceProviderInner> inner = this.serviceClient().list(context);
        return ResourceManagerUtils.mapPage(inner,
            inner1 -> new ExpressRouteServiceProviderImpl(inner1, this.manager()));
    }

    private ExpressRouteServiceProvidersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
