// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.IpConfigurationInner;
import com.azure.resourcemanager.network.generated.fluent.models.NatGatewayInner;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressInner;
import com.azure.resourcemanager.network.generated.fluent.models.PublicIpAddressPropertiesFormatInner;
import com.azure.resourcemanager.network.generated.models.DdosSettings;
import com.azure.resourcemanager.network.generated.models.DeleteOptions;
import com.azure.resourcemanager.network.generated.models.IpAllocationMethod;
import com.azure.resourcemanager.network.generated.models.IpConfiguration;
import com.azure.resourcemanager.network.generated.models.IpTag;
import com.azure.resourcemanager.network.generated.models.IpVersion;
import com.azure.resourcemanager.network.generated.models.NatGateway;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import com.azure.resourcemanager.network.generated.models.PublicIpAddress;
import com.azure.resourcemanager.network.generated.models.PublicIpAddressDnsSettings;
import com.azure.resourcemanager.network.generated.models.PublicIpAddressMigrationPhase;
import com.azure.resourcemanager.network.generated.models.PublicIpAddressPropertiesFormat;
import java.util.Collections;
import java.util.List;

public final class PublicIpAddressPropertiesFormatImpl implements PublicIpAddressPropertiesFormat {
    private PublicIpAddressPropertiesFormatInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    PublicIpAddressPropertiesFormatImpl(PublicIpAddressPropertiesFormatInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public IpAllocationMethod publicIpAllocationMethod() {
        return this.innerModel().publicIpAllocationMethod();
    }

    public IpVersion publicIpAddressVersion() {
        return this.innerModel().publicIpAddressVersion();
    }

    public IpConfiguration ipConfiguration() {
        IpConfigurationInner inner = this.innerModel().ipConfiguration();
        if (inner != null) {
            return new IpConfigurationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PublicIpAddressDnsSettings dnsSettings() {
        return this.innerModel().dnsSettings();
    }

    public DdosSettings ddosSettings() {
        return this.innerModel().ddosSettings();
    }

    public List<IpTag> ipTags() {
        List<IpTag> inner = this.innerModel().ipTags();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String ipAddress() {
        return this.innerModel().ipAddress();
    }

    public SubResource publicIpPrefix() {
        return this.innerModel().publicIpPrefix();
    }

    public Integer idleTimeoutInMinutes() {
        return this.innerModel().idleTimeoutInMinutes();
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public PublicIpAddress servicePublicIpAddress() {
        PublicIpAddressInner inner = this.innerModel().servicePublicIpAddress();
        if (inner != null) {
            return new PublicIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public NatGateway natGateway() {
        NatGatewayInner inner = this.innerModel().natGateway();
        if (inner != null) {
            return new NatGatewayImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public PublicIpAddressMigrationPhase migrationPhase() {
        return this.innerModel().migrationPhase();
    }

    public PublicIpAddress linkedPublicIpAddress() {
        PublicIpAddressInner inner = this.innerModel().linkedPublicIpAddress();
        if (inner != null) {
            return new PublicIpAddressImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public DeleteOptions deleteOption() {
        return this.innerModel().deleteOption();
    }

    public PublicIpAddressPropertiesFormatInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
