// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.HubRouteTableInner;
import com.azure.resourcemanager.network.generated.models.HubRoute;
import com.azure.resourcemanager.network.generated.models.HubRouteTable;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class HubRouteTableImpl implements HubRouteTable, HubRouteTable.Definition, HubRouteTable.Update {
    private HubRouteTableInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String type() {
        return this.innerModel().type();
    }

    public List<HubRoute> routes() {
        List<HubRoute> inner = this.innerModel().routes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> labels() {
        List<String> inner = this.innerModel().labels();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> associatedConnections() {
        List<String> inner = this.innerModel().associatedConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> propagatingConnections() {
        List<String> inner = this.innerModel().propagatingConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public HubRouteTableInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualHubName;

    private String routeTableName;

    public HubRouteTableImpl withExistingVirtualHub(String resourceGroupName, String virtualHubName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualHubName = virtualHubName;
        return this;
    }

    public HubRouteTable create() {
        this.innerObject = serviceManager.serviceClient()
            .getHubRouteTables()
            .createOrUpdate(resourceGroupName, virtualHubName, routeTableName, this.innerModel(), Context.NONE);
        return this;
    }

    public HubRouteTable create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getHubRouteTables()
            .createOrUpdate(resourceGroupName, virtualHubName, routeTableName, this.innerModel(), context);
        return this;
    }

    HubRouteTableImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new HubRouteTableInner();
        this.serviceManager = serviceManager;
        this.routeTableName = name;
    }

    public HubRouteTableImpl update() {
        return this;
    }

    public HubRouteTable apply() {
        this.innerObject = serviceManager.serviceClient()
            .getHubRouteTables()
            .createOrUpdate(resourceGroupName, virtualHubName, routeTableName, this.innerModel(), Context.NONE);
        return this;
    }

    public HubRouteTable apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getHubRouteTables()
            .createOrUpdate(resourceGroupName, virtualHubName, routeTableName, this.innerModel(), context);
        return this;
    }

    HubRouteTableImpl(HubRouteTableInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualHubName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "virtualHubs");
        this.routeTableName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "hubRouteTables");
    }

    public HubRouteTable refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getHubRouteTables()
            .getWithResponse(resourceGroupName, virtualHubName, routeTableName, Context.NONE)
            .getValue();
        return this;
    }

    public HubRouteTable refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getHubRouteTables()
            .getWithResponse(resourceGroupName, virtualHubName, routeTableName, context)
            .getValue();
        return this;
    }

    public HubRouteTableImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public HubRouteTableImpl withRoutes(List<HubRoute> routes) {
        this.innerModel().withRoutes(routes);
        return this;
    }

    public HubRouteTableImpl withLabels(List<String> labels) {
        this.innerModel().withLabels(labels);
        return this;
    }
}
