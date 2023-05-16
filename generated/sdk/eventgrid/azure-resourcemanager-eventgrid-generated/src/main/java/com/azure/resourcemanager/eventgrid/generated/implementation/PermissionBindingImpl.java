// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.PermissionBindingInner;
import com.azure.resourcemanager.eventgrid.generated.models.PermissionBinding;
import com.azure.resourcemanager.eventgrid.generated.models.PermissionBindingProvisioningState;
import com.azure.resourcemanager.eventgrid.generated.models.PermissionType;

public final class PermissionBindingImpl
    implements PermissionBinding, PermissionBinding.Definition, PermissionBinding.Update {
    private PermissionBindingInner innerObject;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String description() {
        return this.innerModel().description();
    }

    public String topicSpaceName() {
        return this.innerModel().topicSpaceName();
    }

    public PermissionType permission() {
        return this.innerModel().permission();
    }

    public String clientGroupName() {
        return this.innerModel().clientGroupName();
    }

    public PermissionBindingProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PermissionBindingInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String permissionBindingName;

    public PermissionBindingImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public PermissionBinding create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPermissionBindings()
                .createOrUpdate(
                    resourceGroupName, namespaceName, permissionBindingName, this.innerModel(), Context.NONE);
        return this;
    }

    public PermissionBinding create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPermissionBindings()
                .createOrUpdate(resourceGroupName, namespaceName, permissionBindingName, this.innerModel(), context);
        return this;
    }

    PermissionBindingImpl(String name, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = new PermissionBindingInner();
        this.serviceManager = serviceManager;
        this.permissionBindingName = name;
    }

    public PermissionBindingImpl update() {
        return this;
    }

    public PermissionBinding apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPermissionBindings()
                .createOrUpdate(
                    resourceGroupName, namespaceName, permissionBindingName, this.innerModel(), Context.NONE);
        return this;
    }

    public PermissionBinding apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPermissionBindings()
                .createOrUpdate(resourceGroupName, namespaceName, permissionBindingName, this.innerModel(), context);
        return this;
    }

    PermissionBindingImpl(
        PermissionBindingInner innerObject,
        com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = Utils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.permissionBindingName = Utils.getValueFromIdByName(innerObject.id(), "permissionBindings");
    }

    public PermissionBinding refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPermissionBindings()
                .getWithResponse(resourceGroupName, namespaceName, permissionBindingName, Context.NONE)
                .getValue();
        return this;
    }

    public PermissionBinding refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getPermissionBindings()
                .getWithResponse(resourceGroupName, namespaceName, permissionBindingName, context)
                .getValue();
        return this;
    }

    public PermissionBindingImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public PermissionBindingImpl withTopicSpaceName(String topicSpaceName) {
        this.innerModel().withTopicSpaceName(topicSpaceName);
        return this;
    }

    public PermissionBindingImpl withPermission(PermissionType permission) {
        this.innerModel().withPermission(permission);
        return this;
    }

    public PermissionBindingImpl withClientGroupName(String clientGroupName) {
        this.innerModel().withClientGroupName(clientGroupName);
        return this;
    }
}
