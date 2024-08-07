// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionImageInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionImage;
import java.util.Collections;
import java.util.Map;

public final class VirtualMachineExtensionImageImpl implements VirtualMachineExtensionImage {
    private VirtualMachineExtensionImageInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    VirtualMachineExtensionImageImpl(VirtualMachineExtensionImageInner innerObject,
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

    public String operatingSystem() {
        return this.innerModel().operatingSystem();
    }

    public String computeRole() {
        return this.innerModel().computeRole();
    }

    public String handlerSchema() {
        return this.innerModel().handlerSchema();
    }

    public Boolean vmScaleSetEnabled() {
        return this.innerModel().vmScaleSetEnabled();
    }

    public Boolean supportsMultipleExtensions() {
        return this.innerModel().supportsMultipleExtensions();
    }

    public VirtualMachineExtensionImageInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
