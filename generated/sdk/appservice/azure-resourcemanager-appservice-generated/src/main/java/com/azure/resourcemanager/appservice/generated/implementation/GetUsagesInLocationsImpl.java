// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.fluent.GetUsagesInLocationsClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.CsmUsageQuotaInner;
import com.azure.resourcemanager.appservice.generated.models.CsmUsageQuota;
import com.azure.resourcemanager.appservice.generated.models.GetUsagesInLocations;

public final class GetUsagesInLocationsImpl implements GetUsagesInLocations {
    private static final ClientLogger LOGGER = new ClientLogger(GetUsagesInLocationsImpl.class);

    private final GetUsagesInLocationsClient innerClient;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public GetUsagesInLocationsImpl(GetUsagesInLocationsClient innerClient,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CsmUsageQuota> list(String location) {
        PagedIterable<CsmUsageQuotaInner> inner = this.serviceClient().list(location);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CsmUsageQuotaImpl(inner1, this.manager()));
    }

    public PagedIterable<CsmUsageQuota> list(String location, Context context) {
        PagedIterable<CsmUsageQuotaInner> inner = this.serviceClient().list(location, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new CsmUsageQuotaImpl(inner1, this.manager()));
    }

    private GetUsagesInLocationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
