// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkGroupInner;
import com.azure.resourcemanager.network.generated.models.NetworkGroup;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;

public final class NetworkGroupImpl implements NetworkGroup, NetworkGroup.Definition, NetworkGroup.Update {
    private NetworkGroupInner innerObject;

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

    public String description() {
        return this.innerModel().description();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public NetworkGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkManagerName;

    private String networkGroupName;

    private String createIfMatch;

    private String updateIfMatch;

    public NetworkGroupImpl withExistingNetworkManager(String resourceGroupName, String networkManagerName) {
        this.resourceGroupName = resourceGroupName;
        this.networkManagerName = networkManagerName;
        return this;
    }

    public NetworkGroup create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkGroups()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    networkManagerName,
                    networkGroupName,
                    this.innerModel(),
                    createIfMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public NetworkGroup create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkGroups()
                .createOrUpdateWithResponse(
                    resourceGroupName, networkManagerName, networkGroupName, this.innerModel(), createIfMatch, context)
                .getValue();
        return this;
    }

    NetworkGroupImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new NetworkGroupInner();
        this.serviceManager = serviceManager;
        this.networkGroupName = name;
        this.createIfMatch = null;
    }

    public NetworkGroupImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public NetworkGroup apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkGroups()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    networkManagerName,
                    networkGroupName,
                    this.innerModel(),
                    updateIfMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public NetworkGroup apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkGroups()
                .createOrUpdateWithResponse(
                    resourceGroupName, networkManagerName, networkGroupName, this.innerModel(), updateIfMatch, context)
                .getValue();
        return this;
    }

    NetworkGroupImpl(
        NetworkGroupInner innerObject, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkManagerName = Utils.getValueFromIdByName(innerObject.id(), "networkManagers");
        this.networkGroupName = Utils.getValueFromIdByName(innerObject.id(), "networkGroups");
    }

    public NetworkGroup refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkGroups()
                .getWithResponse(resourceGroupName, networkManagerName, networkGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkGroup refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkGroups()
                .getWithResponse(resourceGroupName, networkManagerName, networkGroupName, context)
                .getValue();
        return this;
    }

    public NetworkGroupImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public NetworkGroupImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
