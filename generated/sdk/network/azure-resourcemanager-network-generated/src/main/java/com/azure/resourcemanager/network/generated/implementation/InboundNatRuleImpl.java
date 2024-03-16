// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.core.util.Context;
import com.azure.resourcemanager.network.generated.fluent.models.InboundNatRuleInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.network.generated.models.InboundNatRule;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.TransportProtocol;

public final class InboundNatRuleImpl implements InboundNatRule, InboundNatRule.Definition, InboundNatRule.Update {
    private InboundNatRuleInner innerObject;

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

    public SubResource frontendIpConfiguration() {
        return this.innerModel().frontendIpConfiguration();
    }

    public NetworkInterfaceIpConfiguration backendIpConfiguration() {
        NetworkInterfaceIpConfigurationInner inner = this.innerModel().backendIpConfiguration();
        if (inner != null) {
            return new NetworkInterfaceIpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TransportProtocol protocol() {
        return this.innerModel().protocol();
    }

    public Integer frontendPort() {
        return this.innerModel().frontendPort();
    }

    public Integer backendPort() {
        return this.innerModel().backendPort();
    }

    public Integer idleTimeoutInMinutes() {
        return this.innerModel().idleTimeoutInMinutes();
    }

    public Boolean enableFloatingIp() {
        return this.innerModel().enableFloatingIp();
    }

    public Boolean enableTcpReset() {
        return this.innerModel().enableTcpReset();
    }

    public Integer frontendPortRangeStart() {
        return this.innerModel().frontendPortRangeStart();
    }

    public Integer frontendPortRangeEnd() {
        return this.innerModel().frontendPortRangeEnd();
    }

    public SubResource backendAddressPool() {
        return this.innerModel().backendAddressPool();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public InboundNatRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String loadBalancerName;

    private String inboundNatRuleName;

    public InboundNatRuleImpl withExistingLoadBalancer(String resourceGroupName, String loadBalancerName) {
        this.resourceGroupName = resourceGroupName;
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    public InboundNatRule create() {
        this.innerObject = serviceManager.serviceClient()
            .getInboundNatRules()
            .createOrUpdate(resourceGroupName, loadBalancerName, inboundNatRuleName, this.innerModel(), Context.NONE);
        return this;
    }

    public InboundNatRule create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getInboundNatRules()
            .createOrUpdate(resourceGroupName, loadBalancerName, inboundNatRuleName, this.innerModel(), context);
        return this;
    }

    InboundNatRuleImpl(String name, com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = new InboundNatRuleInner();
        this.serviceManager = serviceManager;
        this.inboundNatRuleName = name;
    }

    public InboundNatRuleImpl update() {
        return this;
    }

    public InboundNatRule apply() {
        this.innerObject = serviceManager.serviceClient()
            .getInboundNatRules()
            .createOrUpdate(resourceGroupName, loadBalancerName, inboundNatRuleName, this.innerModel(), Context.NONE);
        return this;
    }

    public InboundNatRule apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getInboundNatRules()
            .createOrUpdate(resourceGroupName, loadBalancerName, inboundNatRuleName, this.innerModel(), context);
        return this;
    }

    InboundNatRuleImpl(InboundNatRuleInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.loadBalancerName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "loadBalancers");
        this.inboundNatRuleName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "inboundNatRules");
    }

    public InboundNatRule refresh() {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getInboundNatRules()
            .getWithResponse(resourceGroupName, loadBalancerName, inboundNatRuleName, localExpand, Context.NONE)
            .getValue();
        return this;
    }

    public InboundNatRule refresh(Context context) {
        String localExpand = null;
        this.innerObject = serviceManager.serviceClient()
            .getInboundNatRules()
            .getWithResponse(resourceGroupName, loadBalancerName, inboundNatRuleName, localExpand, context)
            .getValue();
        return this;
    }

    public InboundNatRuleImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public InboundNatRuleImpl withFrontendIpConfiguration(SubResource frontendIpConfiguration) {
        this.innerModel().withFrontendIpConfiguration(frontendIpConfiguration);
        return this;
    }

    public InboundNatRuleImpl withProtocol(TransportProtocol protocol) {
        this.innerModel().withProtocol(protocol);
        return this;
    }

    public InboundNatRuleImpl withFrontendPort(Integer frontendPort) {
        this.innerModel().withFrontendPort(frontendPort);
        return this;
    }

    public InboundNatRuleImpl withBackendPort(Integer backendPort) {
        this.innerModel().withBackendPort(backendPort);
        return this;
    }

    public InboundNatRuleImpl withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes) {
        this.innerModel().withIdleTimeoutInMinutes(idleTimeoutInMinutes);
        return this;
    }

    public InboundNatRuleImpl withEnableFloatingIp(Boolean enableFloatingIp) {
        this.innerModel().withEnableFloatingIp(enableFloatingIp);
        return this;
    }

    public InboundNatRuleImpl withEnableTcpReset(Boolean enableTcpReset) {
        this.innerModel().withEnableTcpReset(enableTcpReset);
        return this;
    }

    public InboundNatRuleImpl withFrontendPortRangeStart(Integer frontendPortRangeStart) {
        this.innerModel().withFrontendPortRangeStart(frontendPortRangeStart);
        return this;
    }

    public InboundNatRuleImpl withFrontendPortRangeEnd(Integer frontendPortRangeEnd) {
        this.innerModel().withFrontendPortRangeEnd(frontendPortRangeEnd);
        return this;
    }

    public InboundNatRuleImpl withBackendAddressPool(SubResource backendAddressPool) {
        this.innerModel().withBackendAddressPool(backendAddressPool);
        return this;
    }
}
