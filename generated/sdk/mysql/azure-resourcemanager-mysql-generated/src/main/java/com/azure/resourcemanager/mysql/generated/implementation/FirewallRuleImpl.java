// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mysql.generated.fluent.models.FirewallRuleInner;
import com.azure.resourcemanager.mysql.generated.models.FirewallRule;

public final class FirewallRuleImpl implements FirewallRule, FirewallRule.Definition, FirewallRule.Update {
    private FirewallRuleInner innerObject;

    private final com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager;

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

    public String startIpAddress() {
        return this.innerModel().startIpAddress();
    }

    public String endIpAddress() {
        return this.innerModel().endIpAddress();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public FirewallRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mysql.generated.MySqlManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String serverName;

    private String firewallRuleName;

    public FirewallRuleImpl withExistingFlexibleServer(String resourceGroupName, String serverName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        return this;
    }

    public FirewallRule create() {
        this.innerObject = serviceManager.serviceClient().getFirewallRules().createOrUpdate(resourceGroupName,
            serverName, firewallRuleName, this.innerModel(), Context.NONE);
        return this;
    }

    public FirewallRule create(Context context) {
        this.innerObject = serviceManager.serviceClient().getFirewallRules().createOrUpdate(resourceGroupName,
            serverName, firewallRuleName, this.innerModel(), context);
        return this;
    }

    FirewallRuleImpl(String name, com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerObject = new FirewallRuleInner();
        this.serviceManager = serviceManager;
        this.firewallRuleName = name;
    }

    public FirewallRuleImpl update() {
        return this;
    }

    public FirewallRule apply() {
        this.innerObject = serviceManager.serviceClient().getFirewallRules().createOrUpdate(resourceGroupName,
            serverName, firewallRuleName, this.innerModel(), Context.NONE);
        return this;
    }

    public FirewallRule apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getFirewallRules().createOrUpdate(resourceGroupName,
            serverName, firewallRuleName, this.innerModel(), context);
        return this;
    }

    FirewallRuleImpl(FirewallRuleInner innerObject,
        com.azure.resourcemanager.mysql.generated.MySqlManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.serverName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "flexibleServers");
        this.firewallRuleName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "firewallRules");
    }

    public FirewallRule refresh() {
        this.innerObject = serviceManager.serviceClient().getFirewallRules()
            .getWithResponse(resourceGroupName, serverName, firewallRuleName, Context.NONE).getValue();
        return this;
    }

    public FirewallRule refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getFirewallRules()
            .getWithResponse(resourceGroupName, serverName, firewallRuleName, context).getValue();
        return this;
    }

    public FirewallRuleImpl withStartIpAddress(String startIpAddress) {
        this.innerModel().withStartIpAddress(startIpAddress);
        return this;
    }

    public FirewallRuleImpl withEndIpAddress(String endIpAddress) {
        this.innerModel().withEndIpAddress(endIpAddress);
        return this;
    }
}
