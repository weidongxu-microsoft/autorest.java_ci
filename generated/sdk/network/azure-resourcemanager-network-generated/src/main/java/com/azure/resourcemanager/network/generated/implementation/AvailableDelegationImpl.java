// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.AvailableDelegationInner;
import com.azure.resourcemanager.network.generated.models.AvailableDelegation;
import java.util.Collections;
import java.util.List;

public final class AvailableDelegationImpl implements AvailableDelegation {
    private AvailableDelegationInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    AvailableDelegationImpl(AvailableDelegationInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String id() {
        return this.innerModel().id();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String serviceName() {
        return this.innerModel().serviceName();
    }

    public List<String> actions() {
        List<String> inner = this.innerModel().actions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AvailableDelegationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
