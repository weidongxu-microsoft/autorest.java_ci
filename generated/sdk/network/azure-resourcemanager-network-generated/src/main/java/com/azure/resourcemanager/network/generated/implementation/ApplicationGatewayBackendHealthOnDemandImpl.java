// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.ApplicationGatewayBackendHealthOnDemandInner;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayBackendAddressPool;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayBackendHealthHttpSettings;
import com.azure.resourcemanager.network.generated.models.ApplicationGatewayBackendHealthOnDemand;

public final class ApplicationGatewayBackendHealthOnDemandImpl implements ApplicationGatewayBackendHealthOnDemand {
    private ApplicationGatewayBackendHealthOnDemandInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    ApplicationGatewayBackendHealthOnDemandImpl(ApplicationGatewayBackendHealthOnDemandInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public ApplicationGatewayBackendAddressPool backendAddressPool() {
        return this.innerModel().backendAddressPool();
    }

    public ApplicationGatewayBackendHealthHttpSettings backendHealthHttpSettings() {
        return this.innerModel().backendHealthHttpSettings();
    }

    public ApplicationGatewayBackendHealthOnDemandInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
