// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.AseRegionInner;
import com.azure.resourcemanager.appservice.generated.models.AseRegion;
import java.util.Collections;
import java.util.List;

public final class AseRegionImpl implements AseRegion {
    private AseRegionInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    AseRegionImpl(AseRegionInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public String displayName() {
        return this.innerModel().displayName();
    }

    public Boolean standard() {
        return this.innerModel().standard();
    }

    public Boolean dedicatedHost() {
        return this.innerModel().dedicatedHost();
    }

    public Boolean zoneRedundant() {
        return this.innerModel().zoneRedundant();
    }

    public List<String> availableSku() {
        List<String> inner = this.innerModel().availableSku();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> availableOS() {
        List<String> inner = this.innerModel().availableOS();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public AseRegionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
