// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.HubIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.HubIpConfiguration;
import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.PublicIpAddress;
import com.azure.resourcemanager.network.generated.models.Subnet;

public final class HubIpConfigurationImpl
    implements HubIpConfiguration, HubIpConfiguration.Definition, HubIpConfiguration.Update {
    private HubIpConfigurationInner innerObject;

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

    public String privateIpAddress() {
        return this.innerModel().privateIpAddress();
    }

    public IpAllocationMethod privateIpAllocationMethod() {
        return this.innerModel().privateIpAllocationMethod();
    }

    public Subnet subnet() {
        SubnetInner inner = this.innerModel().subnet();
        if (inner != null) {
            return new SubnetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PublicIpAddress publicIpAddress() {
        PublicIpAddressInner inner = this.innerModel().publicIpAddress();
        if (inner != null) {
            return new PublicIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public HubIpConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualHubName;

    private String ipConfigName;

    public HubIpConfigurationImpl withExistingVirtualHub(String resourceGroupName, String virtualHubName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualHubName = virtualHubName;
        return this;
    }

    public HubIpConfiguration create() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualHubIpConfigurations()
            .createOrUpdate(resourceGroupName, virtualHubName, ipConfigName, this.innerModel(), Context.NONE);
        return this;
    }

    public HubIpConfiguration create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualHubIpConfigurations()
            .createOrUpdate(resourceGroupName, virtualHubName, ipConfigName, this.innerModel(), context);
        return this;
    }

    HubIpConfigurationImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new HubIpConfigurationInner();
        this.serviceManager = serviceManager;
        this.ipConfigName = name;
    }

    public HubIpConfigurationImpl update() {
        return this;
    }

    public HubIpConfiguration apply() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualHubIpConfigurations()
            .createOrUpdate(resourceGroupName, virtualHubName, ipConfigName, this.innerModel(), Context.NONE);
        return this;
    }

    public HubIpConfiguration apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualHubIpConfigurations()
            .createOrUpdate(resourceGroupName, virtualHubName, ipConfigName, this.innerModel(), context);
        return this;
    }

    HubIpConfigurationImpl(HubIpConfigurationInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualHubName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "virtualHubs");
        this.ipConfigName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "ipConfigurations");
    }

    public HubIpConfiguration refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualHubIpConfigurations()
            .getWithResponse(resourceGroupName, virtualHubName, ipConfigName, Context.NONE)
            .getValue();
        return this;
    }

    public HubIpConfiguration refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualHubIpConfigurations()
            .getWithResponse(resourceGroupName, virtualHubName, ipConfigName, context)
            .getValue();
        return this;
    }

    public HubIpConfigurationImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public HubIpConfigurationImpl withPrivateIpAddress(String privateIpAddress) {
        this.innerModel().withPrivateIpAddress(privateIpAddress);
        return this;
    }

    public HubIpConfigurationImpl withPrivateIpAllocationMethod(IpAllocationMethod privateIpAllocationMethod) {
        this.innerModel().withPrivateIpAllocationMethod(privateIpAllocationMethod);
        return this;
    }

    public HubIpConfigurationImpl withSubnet(SubnetInner subnet) {
        this.innerModel().withSubnet(subnet);
        return this;
    }

    public HubIpConfigurationImpl withPublicIpAddress(PublicIpAddressInner publicIpAddress) {
        this.innerModel().withPublicIpAddress(publicIpAddress);
        return this;
    }
}
