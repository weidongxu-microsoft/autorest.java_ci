// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualWanInner;
import com.azure.resourcemanager.network.generated.models.OfficeTrafficCategory;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import com.azure.resourcemanager.network.generated.models.VirtualWan;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class VirtualWanImpl implements VirtualWan, VirtualWan.Definition, VirtualWan.Update {
    private VirtualWanInner innerObject;

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

    public Boolean disableVpnEncryption() {
        return this.innerModel().disableVpnEncryption();
    }

    public List<SubResource> virtualHubs() {
        List<SubResource> inner = this.innerModel().virtualHubs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<SubResource> vpnSites() {
        List<SubResource> inner = this.innerModel().vpnSites();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Boolean allowBranchToBranchTraffic() {
        return this.innerModel().allowBranchToBranchTraffic();
    }

    public Boolean allowVnetToVnetTraffic() {
        return this.innerModel().allowVnetToVnetTraffic();
    }

    public OfficeTrafficCategory office365LocalBreakoutCategory() {
        return this.innerModel().office365LocalBreakoutCategory();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String typePropertiesType() {
        return this.innerModel().typePropertiesType();
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

    public VirtualWanInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualWanName;

    private TagsObject updateWanParameters;

    public VirtualWanImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public VirtualWan create() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualWans()
            .createOrUpdate(resourceGroupName, virtualWanName, this.innerModel(), Context.NONE);
        return this;
    }

    public VirtualWan create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualWans()
            .createOrUpdate(resourceGroupName, virtualWanName, this.innerModel(), context);
        return this;
    }

    VirtualWanImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new VirtualWanInner();
        this.serviceManager = serviceManager;
        this.virtualWanName = name;
    }

    public VirtualWanImpl update() {
        this.updateWanParameters = new TagsObject();
        return this;
    }

    public VirtualWan apply() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualWans()
            .updateTagsWithResponse(resourceGroupName, virtualWanName, updateWanParameters, Context.NONE)
            .getValue();
        return this;
    }

    public VirtualWan apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualWans()
            .updateTagsWithResponse(resourceGroupName, virtualWanName, updateWanParameters, context)
            .getValue();
        return this;
    }

    VirtualWanImpl(VirtualWanInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualWanName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "virtualWans");
    }

    public VirtualWan refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualWans()
            .getByResourceGroupWithResponse(resourceGroupName, virtualWanName, Context.NONE)
            .getValue();
        return this;
    }

    public VirtualWan refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getVirtualWans()
            .getByResourceGroupWithResponse(resourceGroupName, virtualWanName, context)
            .getValue();
        return this;
    }

    public VirtualWanImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public VirtualWanImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public VirtualWanImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateWanParameters.withTags(tags);
            return this;
        }
    }

    public VirtualWanImpl withDisableVpnEncryption(Boolean disableVpnEncryption) {
        this.innerModel().withDisableVpnEncryption(disableVpnEncryption);
        return this;
    }

    public VirtualWanImpl withAllowBranchToBranchTraffic(Boolean allowBranchToBranchTraffic) {
        this.innerModel().withAllowBranchToBranchTraffic(allowBranchToBranchTraffic);
        return this;
    }

    public VirtualWanImpl withAllowVnetToVnetTraffic(Boolean allowVnetToVnetTraffic) {
        this.innerModel().withAllowVnetToVnetTraffic(allowVnetToVnetTraffic);
        return this;
    }

    public VirtualWanImpl withTypePropertiesType(String typePropertiesType) {
        this.innerModel().withTypePropertiesType(typePropertiesType);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
