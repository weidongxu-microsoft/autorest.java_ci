// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.ScopedResourceInner;
import com.azure.resourcemanager.monitor.generated.models.ScopedResource;

public final class ScopedResourceImpl implements ScopedResource, ScopedResource.Definition, ScopedResource.Update {
    private ScopedResourceInner innerObject;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String linkedResourceId() {
        return this.innerModel().linkedResourceId();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ScopedResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String scopeName;

    private String name;

    public ScopedResourceImpl withExistingPrivateLinkScope(String resourceGroupName, String scopeName) {
        this.resourceGroupName = resourceGroupName;
        this.scopeName = scopeName;
        return this;
    }

    public ScopedResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateLinkScopedResources()
            .createOrUpdate(resourceGroupName, scopeName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public ScopedResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateLinkScopedResources()
            .createOrUpdate(resourceGroupName, scopeName, name, this.innerModel(), context);
        return this;
    }

    ScopedResourceImpl(String name, com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = new ScopedResourceInner();
        this.serviceManager = serviceManager;
        this.name = name;
    }

    public ScopedResourceImpl update() {
        return this;
    }

    public ScopedResource apply() {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateLinkScopedResources()
            .createOrUpdate(resourceGroupName, scopeName, name, this.innerModel(), Context.NONE);
        return this;
    }

    public ScopedResource apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateLinkScopedResources()
            .createOrUpdate(resourceGroupName, scopeName, name, this.innerModel(), context);
        return this;
    }

    ScopedResourceImpl(ScopedResourceInner innerObject,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.scopeName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "privateLinkScopes");
        this.name = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "scopedResources");
    }

    public ScopedResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateLinkScopedResources()
            .getWithResponse(resourceGroupName, scopeName, name, Context.NONE)
            .getValue();
        return this;
    }

    public ScopedResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateLinkScopedResources()
            .getWithResponse(resourceGroupName, scopeName, name, context)
            .getValue();
        return this;
    }

    public ScopedResourceImpl withLinkedResourceId(String linkedResourceId) {
        this.innerModel().withLinkedResourceId(linkedResourceId);
        return this;
    }
}
