// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationSecurityGroupInner;
import com.azure.resourcemanager.network.generated.models.ApplicationSecurityGroup;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.Map;

public final class ApplicationSecurityGroupImpl
    implements ApplicationSecurityGroup, ApplicationSecurityGroup.Definition, ApplicationSecurityGroup.Update {
    private ApplicationSecurityGroupInner innerObject;

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

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
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

    public ApplicationSecurityGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String applicationSecurityGroupName;

    private TagsObject updateParameters;

    public ApplicationSecurityGroupImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public ApplicationSecurityGroup create() {
        this.innerObject = serviceManager.serviceClient()
            .getApplicationSecurityGroups()
            .createOrUpdate(resourceGroupName, applicationSecurityGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public ApplicationSecurityGroup create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApplicationSecurityGroups()
            .createOrUpdate(resourceGroupName, applicationSecurityGroupName, this.innerModel(), context);
        return this;
    }

    ApplicationSecurityGroupImpl(String name,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new ApplicationSecurityGroupInner();
        this.serviceManager = serviceManager;
        this.applicationSecurityGroupName = name;
    }

    public ApplicationSecurityGroupImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public ApplicationSecurityGroup apply() {
        this.innerObject = serviceManager.serviceClient()
            .getApplicationSecurityGroups()
            .updateTagsWithResponse(resourceGroupName, applicationSecurityGroupName, updateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public ApplicationSecurityGroup apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApplicationSecurityGroups()
            .updateTagsWithResponse(resourceGroupName, applicationSecurityGroupName, updateParameters, context)
            .getValue();
        return this;
    }

    ApplicationSecurityGroupImpl(ApplicationSecurityGroupInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.applicationSecurityGroupName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "applicationSecurityGroups");
    }

    public ApplicationSecurityGroup refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getApplicationSecurityGroups()
            .getByResourceGroupWithResponse(resourceGroupName, applicationSecurityGroupName, Context.NONE)
            .getValue();
        return this;
    }

    public ApplicationSecurityGroup refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getApplicationSecurityGroups()
            .getByResourceGroupWithResponse(resourceGroupName, applicationSecurityGroupName, context)
            .getValue();
        return this;
    }

    public ApplicationSecurityGroupImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public ApplicationSecurityGroupImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public ApplicationSecurityGroupImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
