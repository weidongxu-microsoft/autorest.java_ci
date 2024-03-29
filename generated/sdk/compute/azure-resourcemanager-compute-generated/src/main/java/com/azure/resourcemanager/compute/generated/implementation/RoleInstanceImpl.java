// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.RoleInstanceInner;
import com.azure.resourcemanager.compute.generated.fluent.models.RoleInstancePropertiesInner;
import com.azure.resourcemanager.compute.generated.models.InstanceSku;
import com.azure.resourcemanager.compute.generated.models.RoleInstance;
import com.azure.resourcemanager.compute.generated.models.RoleInstanceProperties;
import java.util.Collections;
import java.util.Map;

public final class RoleInstanceImpl implements RoleInstance {
    private RoleInstanceInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    RoleInstanceImpl(RoleInstanceInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
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

    public InstanceSku sku() {
        return this.innerModel().sku();
    }

    public RoleInstanceProperties properties() {
        RoleInstancePropertiesInner inner = this.innerModel().properties();
        if (inner != null) {
            return new RoleInstancePropertiesImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public RoleInstanceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
