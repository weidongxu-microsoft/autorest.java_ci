// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.ActiveConnectivityConfigurationsListResultInner;
import com.azure.resourcemanager.network.generated.models.ActiveConnectivityConfiguration;
import com.azure.resourcemanager.network.generated.models.ActiveConnectivityConfigurationsListResult;
import java.util.Collections;
import java.util.List;

public final class ActiveConnectivityConfigurationsListResultImpl
    implements ActiveConnectivityConfigurationsListResult {
    private ActiveConnectivityConfigurationsListResultInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    ActiveConnectivityConfigurationsListResultImpl(ActiveConnectivityConfigurationsListResultInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<ActiveConnectivityConfiguration> value() {
        List<ActiveConnectivityConfiguration> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String skipToken() {
        return this.innerModel().skipToken();
    }

    public ActiveConnectivityConfigurationsListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
