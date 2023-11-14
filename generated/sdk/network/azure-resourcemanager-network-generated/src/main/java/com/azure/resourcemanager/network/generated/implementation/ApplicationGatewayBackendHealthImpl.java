// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayBackendHealthInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayBackendHealth;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayBackendHealthPool;
import java.util.Collections;
import java.util.List;

public final class ApplicationGatewayBackendHealthImpl implements ApplicationGatewayBackendHealth {
    private ApplicationGatewayBackendHealthInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    ApplicationGatewayBackendHealthImpl(ApplicationGatewayBackendHealthInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ApplicationGatewayBackendHealthPool> backendAddressPools() {
        List<ApplicationGatewayBackendHealthPool> inner = this.innerModel().backendAddressPools();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ApplicationGatewayBackendHealthInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
