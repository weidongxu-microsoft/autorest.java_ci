// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.FrontendIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceIpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceTapConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.VirtualNetworkTapPropertiesFormatInner;
import com.azure.resourcemanager.network.generated.models.FrontendIpConfiguration;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceIpConfiguration;
import com.azure.resourcemanager.network.generated.models.NetworkInterfaceTapConfiguration;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.VirtualNetworkTapPropertiesFormat;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class VirtualNetworkTapPropertiesFormatImpl implements VirtualNetworkTapPropertiesFormat {
    private VirtualNetworkTapPropertiesFormatInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    VirtualNetworkTapPropertiesFormatImpl(VirtualNetworkTapPropertiesFormatInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<NetworkInterfaceTapConfiguration> networkInterfaceTapConfigurations() {
        List<NetworkInterfaceTapConfigurationInner> inner = this.innerModel().networkInterfaceTapConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(
                inner.stream().map(inner1 -> new NetworkInterfaceTapConfigurationImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
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

    public NetworkInterfaceIpConfiguration destinationNetworkInterfaceIpConfiguration() {
        NetworkInterfaceIpConfigurationInner inner = this.innerModel().destinationNetworkInterfaceIpConfiguration();
        if (inner != null) {
            return new NetworkInterfaceIpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public FrontendIpConfiguration destinationLoadBalancerFrontEndIpConfiguration() {
        FrontendIpConfigurationInner inner = this.innerModel().destinationLoadBalancerFrontEndIpConfiguration();
        if (inner != null) {
            return new FrontendIpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Integer destinationPort() {
        return this.innerModel().destinationPort();
    }

    public VirtualNetworkTapPropertiesFormatInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
