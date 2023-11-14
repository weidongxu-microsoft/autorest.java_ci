// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.consumption.generated.fluent.MarketplacesClient;
import com.azure.resourcemanager.consumption.generated.fluent.models.MarketplaceInner;
import com.azure.resourcemanager.consumption.generated.models.Marketplace;
import com.azure.resourcemanager.consumption.generated.models.Marketplaces;

public final class MarketplacesImpl implements Marketplaces {
    private static final ClientLogger LOGGER = new ClientLogger(MarketplacesImpl.class);

    private final MarketplacesClient innerClient;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    public MarketplacesImpl(MarketplacesClient innerClient,
        com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Marketplace> list(String scope) {
        PagedIterable<MarketplaceInner> inner = this.serviceClient().list(scope);
        return Utils.mapPage(inner, inner1 -> new MarketplaceImpl(inner1, this.manager()));
    }

    public PagedIterable<Marketplace> list(String scope, String filter, Integer top, String skiptoken,
        Context context) {
        PagedIterable<MarketplaceInner> inner = this.serviceClient().list(scope, filter, top, skiptoken, context);
        return Utils.mapPage(inner, inner1 -> new MarketplaceImpl(inner1, this.manager()));
    }

    private MarketplacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
