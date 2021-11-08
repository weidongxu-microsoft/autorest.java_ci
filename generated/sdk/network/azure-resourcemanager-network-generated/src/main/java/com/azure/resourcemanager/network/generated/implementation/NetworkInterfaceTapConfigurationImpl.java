// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceTapConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkTapInner;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceTapConfiguration;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkTap;

public final class NetworkInterfaceTapConfigurationImpl
    implements NetworkInterfaceTapConfiguration,
        NetworkInterfaceTapConfiguration.Definition,
        NetworkInterfaceTapConfiguration.Update {
    private NetworkInterfaceTapConfigurationInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public VirtualNetworkTap virtualNetworkTap() {
        VirtualNetworkTapInner inner = this.innerModel().virtualNetworkTap();
        if (inner != null) {
            return new VirtualNetworkTapImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public NetworkInterfaceTapConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkInterfaceName;

    private String tapConfigurationName;

    public NetworkInterfaceTapConfigurationImpl withExistingNetworkInterface(
        String resourceGroupName, String networkInterfaceName) {
        this.resourceGroupName = resourceGroupName;
        this.networkInterfaceName = networkInterfaceName;
        return this;
    }

    public NetworkInterfaceTapConfiguration create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkInterfaceTapConfigurations()
                .createOrUpdate(
                    resourceGroupName, networkInterfaceName, tapConfigurationName, this.innerModel(), Context.NONE);
        return this;
    }

    public NetworkInterfaceTapConfiguration create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkInterfaceTapConfigurations()
                .createOrUpdate(
                    resourceGroupName, networkInterfaceName, tapConfigurationName, this.innerModel(), context);
        return this;
    }

    NetworkInterfaceTapConfigurationImpl(
        String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new NetworkInterfaceTapConfigurationInner();
        this.serviceManager = serviceManager;
        this.tapConfigurationName = name;
    }

    public NetworkInterfaceTapConfigurationImpl update() {
        return this;
    }

    public NetworkInterfaceTapConfiguration apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkInterfaceTapConfigurations()
                .createOrUpdate(
                    resourceGroupName, networkInterfaceName, tapConfigurationName, this.innerModel(), Context.NONE);
        return this;
    }

    public NetworkInterfaceTapConfiguration apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkInterfaceTapConfigurations()
                .createOrUpdate(
                    resourceGroupName, networkInterfaceName, tapConfigurationName, this.innerModel(), context);
        return this;
    }

    NetworkInterfaceTapConfigurationImpl(
        NetworkInterfaceTapConfigurationInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkInterfaceName = Utils.getValueFromIdByName(innerObject.id(), "networkInterfaces");
        this.tapConfigurationName = Utils.getValueFromIdByName(innerObject.id(), "tapConfigurations");
    }

    public NetworkInterfaceTapConfiguration refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkInterfaceTapConfigurations()
                .getWithResponse(resourceGroupName, networkInterfaceName, tapConfigurationName, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkInterfaceTapConfiguration refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkInterfaceTapConfigurations()
                .getWithResponse(resourceGroupName, networkInterfaceName, tapConfigurationName, context)
                .getValue();
        return this;
    }

    public NetworkInterfaceTapConfigurationImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public NetworkInterfaceTapConfigurationImpl withVirtualNetworkTap(VirtualNetworkTapInner virtualNetworkTap) {
        this.innerModel().withVirtualNetworkTap(virtualNetworkTap);
        return this;
    }
}
