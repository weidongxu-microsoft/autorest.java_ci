// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.monitor.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.monitor.generated.models.PrivateEndpointProperty;
import com.azure.resourcemanager.monitor.generated.models.PrivateLinkServiceConnectionStateProperty;

public final class PrivateEndpointConnectionImpl
    implements PrivateEndpointConnection, PrivateEndpointConnection.Definition, PrivateEndpointConnection.Update {
    private PrivateEndpointConnectionInner innerObject;

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

    public PrivateEndpointProperty privateEndpoint() {
        return this.innerModel().privateEndpoint();
    }

    public PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState() {
        return this.innerModel().privateLinkServiceConnectionState();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public PrivateEndpointConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String scopeName;

    private String privateEndpointConnectionName;

    public PrivateEndpointConnectionImpl withExistingPrivateLinkScope(String resourceGroupName, String scopeName) {
        this.resourceGroupName = resourceGroupName;
        this.scopeName = scopeName;
        return this;
    }

    public PrivateEndpointConnection create() {
        this.innerObject = serviceManager.serviceClient().getPrivateEndpointConnections().createOrUpdate(
            resourceGroupName, scopeName, privateEndpointConnectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateEndpointConnection create(Context context) {
        this.innerObject = serviceManager.serviceClient().getPrivateEndpointConnections()
            .createOrUpdate(resourceGroupName, scopeName, privateEndpointConnectionName, this.innerModel(), context);
        return this;
    }

    PrivateEndpointConnectionImpl(String name,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = new PrivateEndpointConnectionInner();
        this.serviceManager = serviceManager;
        this.privateEndpointConnectionName = name;
    }

    public PrivateEndpointConnectionImpl update() {
        return this;
    }

    public PrivateEndpointConnection apply() {
        this.innerObject = serviceManager.serviceClient().getPrivateEndpointConnections().createOrUpdate(
            resourceGroupName, scopeName, privateEndpointConnectionName, this.innerModel(), Context.NONE);
        return this;
    }

    public PrivateEndpointConnection apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getPrivateEndpointConnections()
            .createOrUpdate(resourceGroupName, scopeName, privateEndpointConnectionName, this.innerModel(), context);
        return this;
    }

    PrivateEndpointConnectionImpl(PrivateEndpointConnectionInner innerObject,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.scopeName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "privateLinkScopes");
        this.privateEndpointConnectionName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "privateEndpointConnections");
    }

    public PrivateEndpointConnection refresh() {
        this.innerObject = serviceManager.serviceClient().getPrivateEndpointConnections()
            .getWithResponse(resourceGroupName, scopeName, privateEndpointConnectionName, Context.NONE).getValue();
        return this;
    }

    public PrivateEndpointConnection refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getPrivateEndpointConnections()
            .getWithResponse(resourceGroupName, scopeName, privateEndpointConnectionName, context).getValue();
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateEndpoint(PrivateEndpointProperty privateEndpoint) {
        this.innerModel().withPrivateEndpoint(privateEndpoint);
        return this;
    }

    public PrivateEndpointConnectionImpl withPrivateLinkServiceConnectionState(
        PrivateLinkServiceConnectionStateProperty privateLinkServiceConnectionState) {
        this.innerModel().withPrivateLinkServiceConnectionState(privateLinkServiceConnectionState);
        return this;
    }
}
