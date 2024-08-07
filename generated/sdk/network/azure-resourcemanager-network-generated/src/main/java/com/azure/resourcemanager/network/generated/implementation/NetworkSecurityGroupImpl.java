// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.FlowLogInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkSecurityGroupInner;
import com.azure.resourcemanager.network.generated.fluent.models.SecurityRuleInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.FlowLog;
import com.azure.resourcemanager.network.generated.models.NetworkInterface;
import com.azure.resourcemanager.network.generated.models.NetworkSecurityGroup;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.SecurityRule;
import com.azure.resourcemanager.network.generated.models.Subnet;
import com.azure.resourcemanager.network.generated.models.TagsObject;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class NetworkSecurityGroupImpl
    implements NetworkSecurityGroup, NetworkSecurityGroup.Definition, NetworkSecurityGroup.Update {
    private NetworkSecurityGroupInner innerObject;

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

    public Boolean flushConnection() {
        return this.innerModel().flushConnection();
    }

    public List<SecurityRule> securityRules() {
        List<SecurityRuleInner> inner = this.innerModel().securityRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new SecurityRuleImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<SecurityRule> defaultSecurityRules() {
        List<SecurityRuleInner> inner = this.innerModel().defaultSecurityRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new SecurityRuleImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<NetworkInterface> networkInterfaces() {
        List<NetworkInterfaceInner> inner = this.innerModel().networkInterfaces();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new NetworkInterfaceImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<Subnet> subnets() {
        List<SubnetInner> inner = this.innerModel().subnets();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new SubnetImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<FlowLog> flowLogs() {
        List<FlowLogInner> inner = this.innerModel().flowLogs();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new FlowLogImpl(inner1, this.manager())).collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
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

    public NetworkSecurityGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkSecurityGroupName;

    private TagsObject updateParameters;

    public NetworkSecurityGroupImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public NetworkSecurityGroup create() {
        this.innerObject = serviceManager.serviceClient()
            .getNetworkSecurityGroups()
            .createOrUpdate(resourceGroupName, networkSecurityGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public NetworkSecurityGroup create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNetworkSecurityGroups()
            .createOrUpdate(resourceGroupName, networkSecurityGroupName, this.innerModel(), context);
        return this;
    }

    NetworkSecurityGroupImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new NetworkSecurityGroupInner();
        this.serviceManager = serviceManager;
        this.networkSecurityGroupName = name;
    }

    public NetworkSecurityGroupImpl update() {
        this.updateParameters = new TagsObject();
        return this;
    }

    public NetworkSecurityGroup apply() {
        this.innerObject = serviceManager.serviceClient()
            .getNetworkSecurityGroups()
            .updateTagsWithResponse(resourceGroupName, networkSecurityGroupName, updateParameters, Context.NONE)
            .getValue();
        return this;
    }

    public NetworkSecurityGroup apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getNetworkSecurityGroups()
            .updateTagsWithResponse(resourceGroupName, networkSecurityGroupName, updateParameters, context)
            .getValue();
        return this;
    }

    NetworkSecurityGroupImpl(NetworkSecurityGroupInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.networkSecurityGroupName
            = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "networkSecurityGroups");
    }

    public NetworkSecurityGroup refresh() {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getNetworkSecurityGroups()
            .getByResourceGroupWithResponse(resourceGroupName, networkSecurityGroupName, localExpand, Context.NONE)
            .getValue();
        return this;
    }

    public NetworkSecurityGroup refresh(Context context) {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getNetworkSecurityGroups()
            .getByResourceGroupWithResponse(resourceGroupName, networkSecurityGroupName, localExpand, context)
            .getValue();
        return this;
    }

    public NetworkSecurityGroupImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public NetworkSecurityGroupImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public NetworkSecurityGroupImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateParameters.withTags(tags);
            return this;
        }
    }

    public NetworkSecurityGroupImpl withFlushConnection(Boolean flushConnection) {
        this.innerModel().withFlushConnection(flushConnection);
        return this;
    }

    public NetworkSecurityGroupImpl withSecurityRules(List<SecurityRuleInner> securityRules) {
        this.innerModel().withSecurityRules(securityRules);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
