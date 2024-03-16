// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.RoutingIntentInner;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.RoutingIntent;
import com.azure.resourcemanager.network.generated.models.RoutingPolicy;
import java.util.Collections;
import java.util.List;

public final class RoutingIntentImpl implements RoutingIntent, RoutingIntent.Definition, RoutingIntent.Update {
    private RoutingIntentInner innerObject;

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

    public List<RoutingPolicy> routingPolicies() {
        List<RoutingPolicy> inner = this.innerModel().routingPolicies();
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

    public RoutingIntentInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String virtualHubName;

    private String routingIntentName;

    public RoutingIntentImpl withExistingVirtualHub(String resourceGroupName, String virtualHubName) {
        this.resourceGroupName = resourceGroupName;
        this.virtualHubName = virtualHubName;
        return this;
    }

    public RoutingIntent create() {
        this.innerObject = serviceManager.serviceClient()
            .getRoutingIntents()
            .createOrUpdate(resourceGroupName, virtualHubName, routingIntentName, this.innerModel(), Context.NONE);
        return this;
    }

    public RoutingIntent create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getRoutingIntents()
            .createOrUpdate(resourceGroupName, virtualHubName, routingIntentName, this.innerModel(), context);
        return this;
    }

    RoutingIntentImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new RoutingIntentInner();
        this.serviceManager = serviceManager;
        this.routingIntentName = name;
    }

    public RoutingIntentImpl update() {
        return this;
    }

    public RoutingIntent apply() {
        this.innerObject = serviceManager.serviceClient()
            .getRoutingIntents()
            .createOrUpdate(resourceGroupName, virtualHubName, routingIntentName, this.innerModel(), Context.NONE);
        return this;
    }

    public RoutingIntent apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getRoutingIntents()
            .createOrUpdate(resourceGroupName, virtualHubName, routingIntentName, this.innerModel(), context);
        return this;
    }

    RoutingIntentImpl(RoutingIntentInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.virtualHubName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "virtualHubs");
        this.routingIntentName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "routingIntent");
    }

    public RoutingIntent refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getRoutingIntents()
            .getWithResponse(resourceGroupName, virtualHubName, routingIntentName, Context.NONE)
            .getValue();
        return this;
    }

    public RoutingIntent refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getRoutingIntents()
            .getWithResponse(resourceGroupName, virtualHubName, routingIntentName, context)
            .getValue();
        return this;
    }

    public RoutingIntentImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public RoutingIntentImpl withRoutingPolicies(List<RoutingPolicy> routingPolicies) {
        this.innerModel().withRoutingPolicies(routingPolicies);
        return this;
    }
}
