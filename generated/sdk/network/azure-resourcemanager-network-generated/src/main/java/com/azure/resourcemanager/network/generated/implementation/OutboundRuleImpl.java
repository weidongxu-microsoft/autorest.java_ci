// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.OutboundRuleInner;
import com.azure.resourcemanager.network.generated.models.LoadBalancerOutboundRuleProtocol;
import com.azure.resourcemanager.network.generated.models.OutboundRule;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class OutboundRuleImpl implements OutboundRule {
    private OutboundRuleInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    OutboundRuleImpl(OutboundRuleInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

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

    public Integer allocatedOutboundPorts() {
        return this.innerModel().allocatedOutboundPorts();
    }

    public List<SubResource> frontendIpConfigurations() {
        List<SubResource> inner = this.innerModel().frontendIpConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public SubResource backendAddressPool() {
        return this.innerModel().backendAddressPool();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public LoadBalancerOutboundRuleProtocol protocol() {
        return this.innerModel().protocol();
    }

    public Boolean enableTcpReset() {
        return this.innerModel().enableTcpReset();
    }

    public Integer idleTimeoutInMinutes() {
        return this.innerModel().idleTimeoutInMinutes();
    }

    public OutboundRuleInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
