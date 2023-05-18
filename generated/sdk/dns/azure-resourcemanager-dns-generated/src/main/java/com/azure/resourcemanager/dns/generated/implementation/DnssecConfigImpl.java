// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dns.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.dns.generated.fluent.models.DnssecConfigInner;
import com.azure.resourcemanager.dns.generated.models.DnssecConfig;
import com.azure.resourcemanager.dns.generated.models.SigningKey;
import java.util.Collections;
import java.util.List;

public final class DnssecConfigImpl implements DnssecConfig {
    private DnssecConfigInner innerObject;

    private final com.azure.resourcemanager.dns.generated.DnsManager serviceManager;

    DnssecConfigImpl(DnssecConfigInner innerObject, com.azure.resourcemanager.dns.generated.DnsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String provisioningState() {
        return this.innerModel().provisioningState();
    }

    public List<SigningKey> signingKeys() {
        List<SigningKey> inner = this.innerModel().signingKeys();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DnssecConfigInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.dns.generated.DnsManager manager() {
        return this.serviceManager;
    }
}
