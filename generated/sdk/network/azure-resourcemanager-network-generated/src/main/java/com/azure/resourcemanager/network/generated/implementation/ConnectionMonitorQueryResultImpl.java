// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.ConnectionMonitorQueryResultInner;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorQueryResult;
import com.azure.resourcemanager.network.generated.models.ConnectionMonitorSourceStatus;
import com.azure.resourcemanager.network.generated.models.ConnectionStateSnapshot;
import java.util.Collections;
import java.util.List;

public final class ConnectionMonitorQueryResultImpl implements ConnectionMonitorQueryResult {
    private ConnectionMonitorQueryResultInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    ConnectionMonitorQueryResultImpl(ConnectionMonitorQueryResultInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public ConnectionMonitorSourceStatus sourceStatus() {
        return this.innerModel().sourceStatus();
    }

    public List<ConnectionStateSnapshot> states() {
        List<ConnectionStateSnapshot> inner = this.innerModel().states();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ConnectionMonitorQueryResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
