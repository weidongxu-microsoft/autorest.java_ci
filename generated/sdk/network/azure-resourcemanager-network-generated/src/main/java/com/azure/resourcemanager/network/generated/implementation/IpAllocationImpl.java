// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.IpAllocationInner;
import com.azure.resourcemanager.network.generated.models.IpAllocation;
import com.azure.resourcemanager.network.generated.models.IpAllocationType;
import com.azure.resourcemanager.network.generated.models.IpVersion;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.Map;

public final class IpAllocationImpl implements IpAllocation, IpAllocation.Definition, IpAllocation.Update {
    private IpAllocationInner innerObject;

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

    public SubResource subnet() {
        return this.innerModel().subnet();
    }

    public SubResource virtualNetwork() {
        return this.innerModel().virtualNetwork();
    }

    public IpAllocationType typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public String prefix() {
        return this.innerModel().prefix();
    }

    public Integer prefixLength() {
        return this.innerModel().prefixLength();
    }

    public IpVersion prefixType() {
        return this.innerModel().prefixType();
    }

    public String ipamAllocationId() {
        return this.innerModel().ipamAllocationId();
    }

    public Map<String, String> allocationTags() {
        Map<String, String> inner = this.innerModel().allocationTags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
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

    public IpAllocationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String ipAllocationName;

    private TagsObject updateParameters;

    public IpAllocationImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public IpAllocation create() {
        this.innerObject = serviceManager.serviceClient()
            .getIpAllocations()
            .createOrUpdate(resourceGroupName, ipAllocationName, this.innerModel(), Context.NONE);
        return this;
    }

    public IpAllocation create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getIpAllocations()
            .createOrUpdate(resourceGroupName, ipAllocationName, this.innerModel(), context);
        return this;
    }

    IpAllocationImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new IpAllocationInner();
        this.serviceManager = serviceManager;
        this.ipAllocationName = name;
    }

    public IpAllocationImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public IpAllocation apply() {
        this.innerObject = serviceManager.serviceClient()
            .getIpAllocations()
            .updateTagsWithResponse(resourceGroupName, ipAllocationName, updateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public IpAllocation apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getIpAllocations()
            .updateTagsWithResponse(resourceGroupName, ipAllocationName, updateParameters, context)
            .getValue();
        return this;
    }

    IpAllocationImpl(IpAllocationInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.ipAllocationName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "IpAllocations");
    }

    public IpAllocation refresh() {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getIpAllocations()
            .getByResourceGroupWithResponse(resourceGroupName, ipAllocationName, localExpand, Context.NONE)
            .getValue();
        return this;
    }

    public IpAllocation refresh(Context context) {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getIpAllocations()
            .getByResourceGroupWithResponse(resourceGroupName, ipAllocationName, localExpand, context)
            .getValue();
        return this;
    }

    public IpAllocationImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public IpAllocationImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public IpAllocationImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public IpAllocationImpl withTypePropertiesType(IpAllocationType typePropertiesType) {
        this.innerModel().withTypePropertiesType(typePropertiesType);
        return this;
    }

    public IpAllocationImpl withPrefix(String prefix) {
        this.innerModel().withPrefix(prefix);
        return this;
    }

    public IpAllocationImpl withPrefixLength(Integer prefixLength) {
        this.innerModel().withPrefixLength(prefixLength);
        return this;
    }

    public IpAllocationImpl withPrefixType(IpVersion prefixType) {
        this.innerModel().withPrefixType(prefixType);
        return this;
    }

    public IpAllocationImpl withIpamAllocationId(String ipamAllocationId) {
        this.innerModel().withIpamAllocationId(ipamAllocationId);
        return this;
    }

    public IpAllocationImpl withAllocationTags(Map<String, String> allocationTags) {
        this.innerModel().withAllocationTags(allocationTags);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
