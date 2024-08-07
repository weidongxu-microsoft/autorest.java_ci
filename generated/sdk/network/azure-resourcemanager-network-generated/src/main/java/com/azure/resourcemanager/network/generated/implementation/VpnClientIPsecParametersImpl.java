// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.VpnClientIPsecParametersInner;
import com.azure.resourcemanager.network.generated.models.DhGroup;
import com.azure.resourcemanager.network.generated.models.IkeEncryption;
import com.azure.resourcemanager.network.generated.models.IkeIntegrity;
import com.azure.resourcemanager.network.generated.models.IpsecEncryption;
import com.azure.resourcemanager.network.generated.models.IpsecIntegrity;
import com.azure.resourcemanager.network.generated.models.PfsGroup;
import com.azure.resourcemanager.network.generated.models.VpnClientIPsecParameters;

public final class VpnClientIPsecParametersImpl implements VpnClientIPsecParameters {
    private VpnClientIPsecParametersInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    VpnClientIPsecParametersImpl(VpnClientIPsecParametersInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public int saLifeTimeSeconds() {
        return this.innerModel().saLifeTimeSeconds();
    }

    public int saDataSizeKilobytes() {
        return this.innerModel().saDataSizeKilobytes();
    }

    public IpsecEncryption ipsecEncryption() {
        return this.innerModel().ipsecEncryption();
    }

    public IpsecIntegrity ipsecIntegrity() {
        return this.innerModel().ipsecIntegrity();
    }

    public IkeEncryption ikeEncryption() {
        return this.innerModel().ikeEncryption();
    }

    public IkeIntegrity ikeIntegrity() {
        return this.innerModel().ikeIntegrity();
    }

    public DhGroup dhGroup() {
        return this.innerModel().dhGroup();
    }

    public PfsGroup pfsGroup() {
        return this.innerModel().pfsGroup();
    }

    public VpnClientIPsecParametersInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
