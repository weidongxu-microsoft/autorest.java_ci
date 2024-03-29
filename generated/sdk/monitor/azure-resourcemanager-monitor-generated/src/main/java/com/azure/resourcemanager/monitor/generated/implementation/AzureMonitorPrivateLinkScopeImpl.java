// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.monitor.generated.fluent.models.AzureMonitorPrivateLinkScopeInner;
import com.azure.resourcemanager.monitor.generated.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.monitor.generated.models.AzureMonitorPrivateLinkScope;
import com.azure.resourcemanager.monitor.generated.models.PrivateEndpointConnection;
import com.azure.resourcemanager.monitor.generated.models.TagsResource;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class AzureMonitorPrivateLinkScopeImpl implements AzureMonitorPrivateLinkScope,
    AzureMonitorPrivateLinkScope.Definition, AzureMonitorPrivateLinkScope.Update {
    private AzureMonitorPrivateLinkScopeInner innerObject;

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

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<PrivateEndpointConnection> privateEndpointConnections() {
        List<PrivateEndpointConnectionInner> inner = this.innerModel().privateEndpointConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new PrivateEndpointConnectionImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
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

    public AzureMonitorPrivateLinkScopeInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String scopeName;

    private TagsResource updatePrivateLinkScopeTags;

    public AzureMonitorPrivateLinkScopeImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public AzureMonitorPrivateLinkScope create() {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateLinkScopes()
            .createOrUpdateWithResponse(resourceGroupName, scopeName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public AzureMonitorPrivateLinkScope create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateLinkScopes()
            .createOrUpdateWithResponse(resourceGroupName, scopeName, this.innerModel(), context)
            .getValue();
        return this;
    }

    AzureMonitorPrivateLinkScopeImpl(String name,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = new AzureMonitorPrivateLinkScopeInner();
        this.serviceManager = serviceManager;
        this.scopeName = name;
    }

    public AzureMonitorPrivateLinkScopeImpl update() {
        this.updatePrivateLinkScopeTags = new TagsResource();
        return this;
    }

    public AzureMonitorPrivateLinkScope apply() {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateLinkScopes()
            .updateTagsWithResponse(resourceGroupName, scopeName, updatePrivateLinkScopeTags, Context.NONE)
            .getValue();
        return this;
    }

    public AzureMonitorPrivateLinkScope apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateLinkScopes()
            .updateTagsWithResponse(resourceGroupName, scopeName, updatePrivateLinkScopeTags, context)
            .getValue();
        return this;
    }

    AzureMonitorPrivateLinkScopeImpl(AzureMonitorPrivateLinkScopeInner innerObject,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.scopeName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "privateLinkScopes");
    }

    public AzureMonitorPrivateLinkScope refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateLinkScopes()
            .getByResourceGroupWithResponse(resourceGroupName, scopeName, Context.NONE)
            .getValue();
        return this;
    }

    public AzureMonitorPrivateLinkScope refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getPrivateLinkScopes()
            .getByResourceGroupWithResponse(resourceGroupName, scopeName, context)
            .getValue();
        return this;
    }

    public AzureMonitorPrivateLinkScopeImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AzureMonitorPrivateLinkScopeImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AzureMonitorPrivateLinkScopeImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updatePrivateLinkScopeTags.withTags(tags);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
