// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.VpnLinkConnectionsClient;
import com.azure.resourcemanager.network.generated.fluent.models.VpnSiteLinkConnectionInner;
import com.azure.resourcemanager.network.generated.models.VpnLinkConnections;
import com.azure.resourcemanager.network.generated.models.VpnSiteLinkConnection;

public final class VpnLinkConnectionsImpl implements VpnLinkConnections {
    private static final ClientLogger LOGGER = new ClientLogger(VpnLinkConnectionsImpl.class);

    private final VpnLinkConnectionsClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public VpnLinkConnectionsImpl(VpnLinkConnectionsClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void resetConnection(String resourceGroupName, String gatewayName, String connectionName,
        String linkConnectionName) {
        this.serviceClient().resetConnection(resourceGroupName, gatewayName, connectionName, linkConnectionName);
    }

    public void resetConnection(String resourceGroupName, String gatewayName, String connectionName,
        String linkConnectionName, Context context) {
        this.serviceClient()
            .resetConnection(resourceGroupName, gatewayName, connectionName, linkConnectionName, context);
    }

    public String getIkeSas(String resourceGroupName, String gatewayName, String connectionName,
        String linkConnectionName) {
        return this.serviceClient().getIkeSas(resourceGroupName, gatewayName, connectionName, linkConnectionName);
    }

    public String getIkeSas(String resourceGroupName, String gatewayName, String connectionName,
        String linkConnectionName, Context context) {
        return this.serviceClient()
            .getIkeSas(resourceGroupName, gatewayName, connectionName, linkConnectionName, context);
    }

    public PagedIterable<VpnSiteLinkConnection> listByVpnConnection(String resourceGroupName, String gatewayName,
        String connectionName) {
        PagedIterable<VpnSiteLinkConnectionInner> inner
            = this.serviceClient().listByVpnConnection(resourceGroupName, gatewayName, connectionName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnSiteLinkConnectionImpl(inner1, this.manager()));
    }

    public PagedIterable<VpnSiteLinkConnection> listByVpnConnection(String resourceGroupName, String gatewayName,
        String connectionName, Context context) {
        PagedIterable<VpnSiteLinkConnectionInner> inner
            = this.serviceClient().listByVpnConnection(resourceGroupName, gatewayName, connectionName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new VpnSiteLinkConnectionImpl(inner1, this.manager()));
    }

    private VpnLinkConnectionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
