// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualRouterInner;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualRouter;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VirtualRouterImpl implements VirtualRouter, VirtualRouter.Definition, VirtualRouter.Update {
    private VirtualRouterInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String id() {
        return this.innerModel().id();
    }

    public Long virtualRouterAsn() {
        return this.innerModel().virtualRouterAsn();
    }

    public List<String> virtualRouterIps() {
        List<String> inner = this.innerModel().virtualRouterIps();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SubResource hostedSubnet() {
        return this.innerModel().hostedSubnet();
    }

    public SubResource hostedGateway() {
        return this.innerModel().hostedGateway();
    }

    public List<SubResource> peerings() {
        List<SubResource> inner = this.innerModel().peerings();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public VirtualRouterInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualRouterName;

    public VirtualRouterImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualRouter create() {
        this.innerObject = serviceManager.serviceClient().getVirtualRouters().createOrUpdate(resourceGroupName,
            virtualRouterName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualRouter create(Context context) {
        this.innerObject = serviceManager.serviceClient().getVirtualRouters().createOrUpdate(resourceGroupName,
            virtualRouterName, this.innerModel(), context);
        return this;
    }

    VirtualRouterImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new VirtualRouterInner();
        this.serviceManager = serviceManager;
        this.virtualRouterName = name;
    }

    public VirtualRouterImpl update() {
        return this;
    }

    public VirtualRouter apply() {
        this.innerObject = serviceManager.serviceClient().getVirtualRouters().createOrUpdate(resourceGroupName,
            virtualRouterName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualRouter apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getVirtualRouters().createOrUpdate(resourceGroupName,
            virtualRouterName, this.innerModel(), context);
        return this;
    }

    VirtualRouterImpl(VirtualRouterInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualRouterName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "virtualRouters");
    }

    public VirtualRouter refresh() {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient().getVirtualRouters()
            .getByResourceGroupWithResponse(resourceGroupName, virtualRouterName, localExpand, Context.NONE).getValue();
        return this;
    }

    public VirtualRouter refresh(Context context) {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient().getVirtualRouters()
            .getByResourceGroupWithResponse(resourceGroupName, virtualRouterName, localExpand, context).getValue();
        return this;
    }

    public VirtualRouterImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualRouterImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualRouterImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public VirtualRouterImpl withVirtualRouterAsn(Long virtualRouterAsn) {
        this.innerModel().withVirtualRouterAsn(virtualRouterAsn);
        return this;
    }

    public VirtualRouterImpl withVirtualRouterIps(List<String> virtualRouterIps) {
        this.innerModel().withVirtualRouterIps(virtualRouterIps);
        return this;
    }

    public VirtualRouterImpl withHostedSubnet(SubResource hostedSubnet) {
        this.innerModel().withHostedSubnet(hostedSubnet);
        return this;
    }

    public VirtualRouterImpl withHostedGateway(SubResource hostedGateway) {
        this.innerModel().withHostedGateway(hostedGateway);
        return this;
    }
}
