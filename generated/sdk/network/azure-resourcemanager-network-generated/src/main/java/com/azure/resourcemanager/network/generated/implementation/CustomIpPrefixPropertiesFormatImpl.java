// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.CustomIpPrefixInner;
import com.azure.resourcemanager.network.generated.fluent.models.CustomIpPrefixPropertiesFormatInner;
import com.azure.resourcemanager.network.generated.models.CommissionedState;
import com.azure.resourcemanager.network.generated.models.CustomIpPrefix;
import com.azure.resourcemanager.network.generated.models.CustomIpPrefixPropertiesFormat;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class CustomIpPrefixPropertiesFormatImpl implements CustomIpPrefixPropertiesFormat {
    private CustomIpPrefixPropertiesFormatInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    CustomIpPrefixPropertiesFormatImpl(
        CustomIpPrefixPropertiesFormatInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String cidr() {
        return this.innerModel().cidr();
    }

    public String signedMessage() {
        return this.innerModel().signedMessage();
    }

    public String authorizationMessage() {
        return this.innerModel().authorizationMessage();
    }

    public CustomIpPrefix customIpPrefixParent() {
        CustomIpPrefixInner inner = this.innerModel().customIpPrefixParent();
        if (inner != null) {
            return new CustomIpPrefixImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public List<CustomIpPrefix> childCustomIpPrefixes() {
        List<CustomIpPrefixInner> inner = this.innerModel().childCustomIpPrefixes();
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new CustomIpPrefixImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public CommissionedState commissionedState() {
        return this.innerModel().commissionedState();
    }

    public List<SubResource> publicIpPrefixes() {
        List<SubResource> inner = this.innerModel().publicIpPrefixes();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGuid() {
        return this.innerModel().resourceGuid();
    }

    public String failedReason() {
        return this.innerModel().failedReason();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public CustomIpPrefixPropertiesFormatInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
