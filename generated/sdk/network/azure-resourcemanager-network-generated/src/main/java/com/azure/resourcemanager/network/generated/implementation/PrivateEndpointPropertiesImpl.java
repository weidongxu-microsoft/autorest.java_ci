// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.ApplicationSecurityGroupInner;
import com.azure.resourcemanager.network.generated.fluent.models.NetworkInterfaceInner;
import com.azure.resourcemanager.network.generated.fluent.models.PrivateEndpointPropertiesInner;
import com.azure.resourcemanager.network.generated.fluent.models.SubnetInner;
import com.azure.resourcemanager.network.generated.models.ApplicationSecurityGroup;
import com.azure.resourcemanager.network.generated.models.CustomDnsConfigPropertiesFormat;
import com.azure.resourcemanager.network.generated.models.NetworkInterface;
import com.azure.resourcemanager.network.generated.models.PrivateEndpointIpConfiguration;
import com.azure.resourcemanager.network.generated.models.PrivateEndpointProperties;
import com.azure.resourcemanager.network.generated.models.PrivateLinkServiceConnection;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.Subnet;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class PrivateEndpointPropertiesImpl implements PrivateEndpointProperties {
    private PrivateEndpointPropertiesInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    PrivateEndpointPropertiesImpl(
        PrivateEndpointPropertiesInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Subnet subnet() {
        SubnetInner inner = this.innerModel().subnet();
        if (inner != null) {
            return new SubnetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<NetworkInterface> networkInterfaces() {
        List<NetworkInterfaceInner> inner = this.innerModel().networkInterfaces();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new NetworkInterfaceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<PrivateLinkServiceConnection> privateLinkServiceConnections() {
        List<PrivateLinkServiceConnection> inner = this.innerModel().privateLinkServiceConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<PrivateLinkServiceConnection> manualPrivateLinkServiceConnections() {
        List<PrivateLinkServiceConnection> inner = this.innerModel().manualPrivateLinkServiceConnections();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<CustomDnsConfigPropertiesFormat> customDnsConfigs() {
        List<CustomDnsConfigPropertiesFormat> inner = this.innerModel().customDnsConfigs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ApplicationSecurityGroup> applicationSecurityGroups() {
        List<ApplicationSecurityGroupInner> inner = this.innerModel().applicationSecurityGroups();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ApplicationSecurityGroupImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public List<PrivateEndpointIpConfiguration> ipConfigurations() {
        List<PrivateEndpointIpConfiguration> inner = this.innerModel().ipConfigurations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String customNetworkInterfaceName() {
        return this.innerModel().customNetworkInterfaceName();
    }

    public PrivateEndpointPropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
