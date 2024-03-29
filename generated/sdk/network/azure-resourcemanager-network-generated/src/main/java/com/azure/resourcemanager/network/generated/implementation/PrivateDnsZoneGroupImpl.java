// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.PrivateDnsZoneGroupInner;
import com.azure.resourcemanager.network.generated.models.PrivateDnsZoneConfig;
import com.azure.resourcemanager.network.generated.models.PrivateDnsZoneGroup;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.util.Collections;
import java.util.List;

public final class PrivateDnsZoneGroupImpl implements PrivateDnsZoneGroup {
    private PrivateDnsZoneGroupInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    PrivateDnsZoneGroupImpl(PrivateDnsZoneGroupInner innerObject,
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

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<PrivateDnsZoneConfig> privateDnsZoneConfigs() {
        List<PrivateDnsZoneConfig> inner = this.innerModel().privateDnsZoneConfigs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public PrivateDnsZoneGroupInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
