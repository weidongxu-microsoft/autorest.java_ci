// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.frontdoor.generated.fluent.PreconfiguredEndpointsClient;
import com.azure.resourcemanager.frontdoor.generated.fluent.models.PreconfiguredEndpointInner;
import com.azure.resourcemanager.frontdoor.generated.models.PreconfiguredEndpoint;
import com.azure.resourcemanager.frontdoor.generated.models.PreconfiguredEndpoints;

public final class PreconfiguredEndpointsImpl implements PreconfiguredEndpoints {
    private static final ClientLogger LOGGER = new ClientLogger(PreconfiguredEndpointsImpl.class);

    private final PreconfiguredEndpointsClient innerClient;

    private final com.azure.resourcemanager.frontdoor.generated.FrontDoorManager serviceManager;

    public PreconfiguredEndpointsImpl(PreconfiguredEndpointsClient innerClient,
        com.azure.resourcemanager.frontdoor.generated.FrontDoorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PreconfiguredEndpoint> list(String resourceGroupName, String profileName) {
        PagedIterable<PreconfiguredEndpointInner> inner = this.serviceClient().list(resourceGroupName, profileName);
        return Utils.mapPage(inner, inner1 -> new PreconfiguredEndpointImpl(inner1, this.manager()));
    }

    public PagedIterable<PreconfiguredEndpoint> list(String resourceGroupName, String profileName, Context context) {
        PagedIterable<PreconfiguredEndpointInner> inner
            = this.serviceClient().list(resourceGroupName, profileName, context);
        return Utils.mapPage(inner, inner1 -> new PreconfiguredEndpointImpl(inner1, this.manager()));
    }

    private PreconfiguredEndpointsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.frontdoor.generated.FrontDoorManager manager() {
        return this.serviceManager;
    }
}
