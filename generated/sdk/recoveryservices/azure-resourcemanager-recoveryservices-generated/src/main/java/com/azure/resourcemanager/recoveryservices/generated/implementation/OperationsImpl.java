// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservices.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservices.generated.fluent.OperationsClient;
import com.azure.resourcemanager.recoveryservices.generated.fluent.models.ClientDiscoveryValueForSingleApiInner;
import com.azure.resourcemanager.recoveryservices.generated.models.ClientDiscoveryValueForSingleApi;
import com.azure.resourcemanager.recoveryservices.generated.models.Operations;

public final class OperationsImpl implements Operations {
    private static final ClientLogger LOGGER = new ClientLogger(OperationsImpl.class);

    private final OperationsClient innerClient;

    private final com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager serviceManager;

    public OperationsImpl(OperationsClient innerClient,
        com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ClientDiscoveryValueForSingleApi> list() {
        PagedIterable<ClientDiscoveryValueForSingleApiInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ClientDiscoveryValueForSingleApiImpl(inner1, this.manager()));
    }

    public PagedIterable<ClientDiscoveryValueForSingleApi> list(Context context) {
        PagedIterable<ClientDiscoveryValueForSingleApiInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ClientDiscoveryValueForSingleApiImpl(inner1, this.manager()));
    }

    private OperationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.recoveryservices.generated.RecoveryServicesManager manager() {
        return this.serviceManager;
    }
}
