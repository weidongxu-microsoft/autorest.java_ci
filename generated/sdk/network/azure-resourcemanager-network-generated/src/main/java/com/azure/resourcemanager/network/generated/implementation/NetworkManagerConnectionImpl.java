// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkManagerConnectionInner;
import com.azure.resourcemanager.network.generated.models.NetworkManagerConnection;
import com.azure.resourcemanager.network.generated.models.ScopeConnectionState;

public final class NetworkManagerConnectionImpl
    implements NetworkManagerConnection, NetworkManagerConnection.Definition, NetworkManagerConnection.Update {
    private NetworkManagerConnectionInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String networkManagerId() {
        return this.innerModel().networkManagerId();
    }

    public ScopeConnectionState connectionState() {
        return this.innerModel().connectionState();
    }

    public String description() {
        return this.innerModel().description();
    }

    public NetworkManagerConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String networkManagerConnectionName;

    public NetworkManagerConnection create() {
        this.innerObject = serviceManager.serviceClient()
            .getSubscriptionNetworkManagerConnections()
            .createOrUpdateWithResponse(networkManagerConnectionName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public NetworkManagerConnection create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getSubscriptionNetworkManagerConnections()
            .createOrUpdateWithResponse(networkManagerConnectionName, this.innerModel(), context)
            .getValue();
        return this;
    }

    NetworkManagerConnectionImpl(String name,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new NetworkManagerConnectionInner();
        this.serviceManager = serviceManager;
        this.networkManagerConnectionName = name;
    }

    public NetworkManagerConnectionImpl update() {
        return this;
    }

    public NetworkManagerConnection apply() {
        this.innerObject = serviceManager.serviceClient()
            .getSubscriptionNetworkManagerConnections()
            .createOrUpdateWithResponse(networkManagerConnectionName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public NetworkManagerConnection apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getSubscriptionNetworkManagerConnections()
            .createOrUpdateWithResponse(networkManagerConnectionName, this.innerModel(), context)
            .getValue();
        return this;
    }

    NetworkManagerConnectionImpl(NetworkManagerConnectionInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.networkManagerConnectionName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "networkManagerConnections");
    }

    public NetworkManagerConnection refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getSubscriptionNetworkManagerConnections()
            .getWithResponse(networkManagerConnectionName, Context.NONE)
            .getValue();
        return this;
    }

    public NetworkManagerConnection refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getSubscriptionNetworkManagerConnections()
            .getWithResponse(networkManagerConnectionName, context)
            .getValue();
        return this;
    }

    public NetworkManagerConnectionImpl withNetworkManagerId(String networkManagerId) {
        this.innerModel().withNetworkManagerId(networkManagerId);
        return this;
    }

    public NetworkManagerConnectionImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }
}
