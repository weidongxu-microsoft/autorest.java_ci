// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.implementation;

import com.azure.resourcemanager.network.generated.fluent.models.ExpressRoutePortsLocationInner;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePortsLocation;
import com.azure.resourcemanager.network.generated.models.ExpressRoutePortsLocationBandwidths;
import com.azure.resourcemanager.network.generated.models.ProvisioningState;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class ExpressRoutePortsLocationImpl implements ExpressRoutePortsLocation {
    private ExpressRoutePortsLocationInner innerObject;

    private final com.azure.resourcemanager.network.generated.NetworkManager serviceManager;

    ExpressRoutePortsLocationImpl(ExpressRoutePortsLocationInner innerObject,
        com.azure.resourcemanager.network.generated.NetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String id() {
        return this.innerModel().id();
    }

    public String address() {
        return this.innerModel().address();
    }

    public String contact() {
        return this.innerModel().contact();
    }

    public List<ExpressRoutePortsLocationBandwidths> availableBandwidths() {
        List<ExpressRoutePortsLocationBandwidths> inner = this.innerModel().availableBandwidths();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public ExpressRoutePortsLocationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.network.generated.NetworkManager manager() {
        return this.serviceManager;
    }
}
