// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.keyvault.generated.fluent.MhsmRegionsClient;
import com.azure.resourcemanager.keyvault.generated.fluent.models.MhsmGeoReplicatedRegionInner;
import com.azure.resourcemanager.keyvault.generated.models.MhsmGeoReplicatedRegion;
import com.azure.resourcemanager.keyvault.generated.models.MhsmRegions;

public final class MhsmRegionsImpl implements MhsmRegions {
    private static final ClientLogger LOGGER = new ClientLogger(MhsmRegionsImpl.class);

    private final MhsmRegionsClient innerClient;

    private final com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager;

    public MhsmRegionsImpl(MhsmRegionsClient innerClient,
        com.azure.resourcemanager.keyvault.generated.KeyVaultManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<MhsmGeoReplicatedRegion> listByResource(String resourceGroupName, String name) {
        PagedIterable<MhsmGeoReplicatedRegionInner> inner
            = this.serviceClient().listByResource(resourceGroupName, name);
        return Utils.mapPage(inner, inner1 -> new MhsmGeoReplicatedRegionImpl(inner1, this.manager()));
    }

    public PagedIterable<MhsmGeoReplicatedRegion> listByResource(String resourceGroupName, String name,
        Context context) {
        PagedIterable<MhsmGeoReplicatedRegionInner> inner
            = this.serviceClient().listByResource(resourceGroupName, name, context);
        return Utils.mapPage(inner, inner1 -> new MhsmGeoReplicatedRegionImpl(inner1, this.manager()));
    }

    private MhsmRegionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.keyvault.generated.KeyVaultManager manager() {
        return this.serviceManager;
    }
}
