// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.generated.fluent.LoadBalancerNetworkInterfacesClient;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceInner;
import com.azure.resourcemanager.network.generated.models.LoadBalancerNetworkInterfaces;
import com.azure.resourcemanager.network.generated.models.NetworkInterface;

public final class LoadBalancerNetworkInterfacesImpl implements LoadBalancerNetworkInterfaces {
    private static final ClientLogger LOGGER = new ClientLogger(LoadBalancerNetworkInterfacesImpl.class);

    private final LoadBalancerNetworkInterfacesClient innerClient;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public LoadBalancerNetworkInterfacesImpl(LoadBalancerNetworkInterfacesClient innerClient,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<NetworkInterface> list(String resourceGroupName, String loadBalancerName) {
        PagedIterable<NetworkInterfaceInner> inner = this.serviceClient().list(resourceGroupName, loadBalancerName);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    public PagedIterable<NetworkInterface> list(String resourceGroupName, String loadBalancerName, Context context) {
        PagedIterable<NetworkInterfaceInner> inner
            = this.serviceClient().list(resourceGroupName, loadBalancerName, context);
        return Utils.mapPage(inner, inner1 -> new NetworkInterfaceImpl(inner1, this.manager()));
    }

    private LoadBalancerNetworkInterfacesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
