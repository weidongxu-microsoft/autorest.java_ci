// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetInfoResourceInner;
import com.azure.resourcemanager.appservice.generated.fluent.models.VnetRouteInner;
import com.azure.resourcemanager.appservice.generated.models.VnetInfoResource;
import com.azure.resourcemanager.appservice.generated.models.VnetRoute;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class VnetInfoResourceImpl
    implements VnetInfoResource, VnetInfoResource.Definition, VnetInfoResource.Update {
    private VnetInfoResourceInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String kind() {
        return this.innerModel().kind();
    }

    public String vnetResourceId() {
        return this.innerModel().vnetResourceId();
    }

    public String certThumbprint() {
        return this.innerModel().certThumbprint();
    }

    public String certBlob() {
        return this.innerModel().certBlob();
    }

    public List<VnetRoute> routes() {
        List<VnetRouteInner> inner = this.innerModel().routes();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new VnetRouteImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean resyncRequired() {
        return this.innerModel().resyncRequired();
    }

    public String dnsServers() {
        return this.innerModel().dnsServers();
    }

    public Boolean isSwift() {
        return this.innerModel().isSwift();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public VnetInfoResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String vnetName;

    private String slot;

    public VnetInfoResourceImpl withExistingSlot(String resourceGroupName, String name, String slot) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        this.slot = slot;
        return this;
    }

    public VnetInfoResource create() {
        this.innerObject = serviceManager.serviceClient().getWebApps().createOrUpdateVnetConnectionSlotWithResponse(
            resourceGroupName, name, vnetName, slot, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public VnetInfoResource create(Context context) {
        this.innerObject = serviceManager.serviceClient().getWebApps().createOrUpdateVnetConnectionSlotWithResponse(
            resourceGroupName, name, vnetName, slot, this.innerModel(), context).getValue();
        return this;
    }

    VnetInfoResourceImpl(String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new VnetInfoResourceInner();
        this.serviceManager = serviceManager;
        this.vnetName = name;
    }

    public VnetInfoResourceImpl update() {
        return this;
    }

    public VnetInfoResource apply() {
        this.innerObject
            = serviceManager.serviceClient().getWebApps().updateVnetConnectionSlotWithResponse(resourceGroupName, name,
                vnetName, slot, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public VnetInfoResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getWebApps()
            .updateVnetConnectionSlotWithResponse(resourceGroupName, name, vnetName, slot, this.innerModel(), context)
            .getValue();
        return this;
    }

    VnetInfoResourceImpl(VnetInfoResourceInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "sites");
        this.vnetName = Utils.getValueFromIdByName(innerObject.id(), "virtualNetworkConnections");
        this.slot = Utils.getValueFromIdByName(innerObject.id(), "slots");
    }

    public VnetInfoResource refresh() {
        this.innerObject = serviceManager.serviceClient().getWebApps()
            .getVnetConnectionSlotWithResponse(resourceGroupName, name, vnetName, slot, Context.NONE).getValue();
        return this;
    }

    public VnetInfoResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getWebApps()
            .getVnetConnectionSlotWithResponse(resourceGroupName, name, vnetName, slot, context).getValue();
        return this;
    }

    public VnetInfoResourceImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public VnetInfoResourceImpl withVnetResourceId(String vnetResourceId) {
        this.innerModel().withVnetResourceId(vnetResourceId);
        return this;
    }

    public VnetInfoResourceImpl withCertBlob(String certBlob) {
        this.innerModel().withCertBlob(certBlob);
        return this;
    }

    public VnetInfoResourceImpl withDnsServers(String dnsServers) {
        this.innerModel().withDnsServers(dnsServers);
        return this;
    }

    public VnetInfoResourceImpl withIsSwift(Boolean isSwift) {
        this.innerModel().withIsSwift(isSwift);
        return this;
    }
}
