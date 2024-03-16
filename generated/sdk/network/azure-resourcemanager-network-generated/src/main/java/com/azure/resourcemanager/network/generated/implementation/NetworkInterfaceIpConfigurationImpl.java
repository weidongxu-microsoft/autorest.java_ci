// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.ApplicationSecurityGroupInner;
import com.azure.resourcemanager.network.generated.fluent.models.BackendAddressPoolInner;
import com.azure.resourcemanager.network.generated.fluent.models.InboundNatRuleInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkTapInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayBackendAddressPool;
import com.azure.resourcemanager.network.generated.models.ApplicationSecurityGroup;
import com.azure.resourcemanager.network.generated.models.BackendAddressPool;
import com.azure.resourcemanager.network.generated.models.InboundNatRule;
import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.IpVersion;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.PublicIpAddress;
import com.azure.resourcemanager.network.generated.models.Subnet;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkTap;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class NetworkInterfaceIpConfigurationImpl implements NetworkInterfaceIpConfiguration {
    private NetworkInterfaceIpConfigurationInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    NetworkInterfaceIpConfigurationImpl(NetworkInterfaceIpConfigurationInner innerObject,
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

    public SubResource gatewayLoadBalancer() {
        return this.innerModel().gatewayLoadBalancer();
    }

    public List<VirtualNetworkTap> virtualNetworkTaps() {
        List<VirtualNetworkTapInner> inner = this.innerModel().virtualNetworkTaps();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new VirtualNetworkTapImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools() {
        List<ApplicationGatewayBackendAddressPool> inner = this.innerModel().applicationGatewayBackendAddressPools();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<BackendAddressPool> loadBalancerBackendAddressPools() {
        List<BackendAddressPoolInner> inner = this.innerModel().loadBalancerBackendAddressPools();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new BackendAddressPoolImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<InboundNatRule> loadBalancerInboundNatRules() {
        List<InboundNatRuleInner> inner = this.innerModel().loadBalancerInboundNatRules();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new InboundNatRuleImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String privateIpAddress() {
        return this.innerModel().privateIpAddress();
    }

    public IpAllocationMethod privateIpAllocationMethod() {
        return this.innerModel().privateIpAllocationMethod();
    }

    public IpVersion privateIpAddressVersion() {
        return this.innerModel().privateIpAddressVersion();
    }

    public Subnet subnet() {
        SubnetInner inner = this.innerModel().subnet();
        if (inner != null) {
            return new SubnetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Boolean primary() {
        return this.innerModel().primary();
    }

    public PublicIpAddress publicIpAddress() {
        PublicIpAddressInner inner = this.innerModel().publicIpAddress();
        if (inner != null) {
            return new PublicIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<ApplicationSecurityGroup> applicationSecurityGroups() {
        List<ApplicationSecurityGroupInner> inner = this.innerModel().applicationSecurityGroups();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new ApplicationSecurityGroupImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public NetworkInterfaceIpConfigurationPrivateLinkConnectionProperties privateLinkConnectionProperties() {
        return this.innerModel().privateLinkConnectionProperties();
    }

    public NetworkInterfaceIpConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
