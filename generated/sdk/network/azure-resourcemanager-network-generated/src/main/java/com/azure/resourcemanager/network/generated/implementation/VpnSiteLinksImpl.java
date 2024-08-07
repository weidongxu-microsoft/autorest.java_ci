// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VpnSiteLinksClient;
import com.azure.resourcemanager.network.generated.fluent.models.VpnSiteLinkInner;
import com.azure.resourcemanager.network.generated.models.VpnSiteLink;
import com.azure.resourcemanager.network.generated.models.VpnSiteLinks;

public final class VpnSiteLinksImpl implements VpnSiteLinks {
    private static final ClientLogger LOGGER = new ClientLogger(VpnSiteLinksImpl.class);

    private final VpnSiteLinksClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VpnSiteLinksImpl(VpnSiteLinksClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public Response<VpnSiteLink> getWithResponse(String resourceGroupName, String vpnSiteName, String vpnSiteLinkName,
        Context context) {
        Response<VpnSiteLinkInner> inner
            = this.serviceClient().getWithResponse(resourceGroupName, vpnSiteName, vpnSiteLinkName, context);
        if (inner != null) {
            return new SimpleResponse<>(inner.getRequest(), inner.getStatusCode(), inner.getHeaders(),
                new VpnSiteLinkImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VpnSiteLink get(String resourceGroupName, String vpnSiteName, String vpnSiteLinkName) {
        VpnSiteLinkInner inner = this.serviceClient().get(resourceGroupName, vpnSiteName, vpnSiteLinkName);
        if (inner != null) {
            return new VpnSiteLinkImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PagedIterable<VpnSiteLink> listByVpnSite(String resourceGroupName, String vpnSiteName) {
        PagedIterable<VpnSiteLinkInner> inner = this.serviceClient().listByVpnSite(resourceGroupName, vpnSiteName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnSiteLinkImpl(inner1, this.manager()));
    }

    public PagedIterable<VpnSiteLink> listByVpnSite(String resourceGroupName, String vpnSiteName, Context context) {
        PagedIterable<VpnSiteLinkInner> inner
            = this.serviceClient().listByVpnSite(resourceGroupName, vpnSiteName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnSiteLinkImpl(inner1, this.manager()));
    }

    private VpnSiteLinksClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
