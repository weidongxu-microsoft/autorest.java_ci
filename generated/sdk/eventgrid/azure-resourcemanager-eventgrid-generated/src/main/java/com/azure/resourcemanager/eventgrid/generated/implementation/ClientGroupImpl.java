// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.generated.fluent.models.ClientGroupInner;
import com.azure.resourcemanager.eventgrid.generated.models.ClientGroup;
import com.azure.resourcemanager.eventgrid.generated.models.ClientGroupProvisioningState;

public final class ClientGroupImpl implements ClientGroup, ClientGroup.Definition, ClientGroup.Update {
    private ClientGroupInner innerObject;

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

    public String query() {
        return this.innerModel().query();
    }

    public ClientGroupProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ClientGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String namespaceName;

    private String clientGroupName;

    public ClientGroupImpl withExistingNamespace(String resourceGroupName, String namespaceName) {
        this.resourceGroupName = resourceGroupName;
        this.namespaceName = namespaceName;
        return this;
    }

    public ClientGroup create() {
        this.innerObject = serviceManager.serviceClient()
            .getClientGroups()
            .createOrUpdate(resourceGroupName, namespaceName, clientGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public ClientGroup create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getClientGroups()
            .createOrUpdate(resourceGroupName, namespaceName, clientGroupName, this.innerModel(), context);
        return this;
    }

    ClientGroupImpl(String name, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = new ClientGroupInner();
        this.serviceManager = serviceManager;
        this.clientGroupName = name;
    }

    public ClientGroupImpl update() {
        return this;
    }

    public ClientGroup apply() {
        this.innerObject = serviceManager.serviceClient()
            .getClientGroups()
            .createOrUpdate(resourceGroupName, namespaceName, clientGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public ClientGroup apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getClientGroups()
            .createOrUpdate(resourceGroupName, namespaceName, clientGroupName, this.innerModel(), context);
        return this;
    }

    ClientGroupImpl(ClientGroupInner innerObject,
        com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.namespaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "namespaces");
        this.clientGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "clientGroups");
    }

    public ClientGroup refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getClientGroups()
            .getWithResponse(resourceGroupName, namespaceName, clientGroupName, Context.NONE)
            .getValue();
        return this;
    }

    public ClientGroup refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getClientGroups()
            .getWithResponse(resourceGroupName, namespaceName, clientGroupName, context)
            .getValue();
        return this;
    }

    public ClientGroupImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public ClientGroupImpl withQuery(String query) {
        this.innerModel().withQuery(query);
        return this;
    }
}
