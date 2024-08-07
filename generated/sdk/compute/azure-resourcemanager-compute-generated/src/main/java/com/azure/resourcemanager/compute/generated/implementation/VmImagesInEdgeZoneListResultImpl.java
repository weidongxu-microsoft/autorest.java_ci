// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineImageResourceInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VmImagesInEdgeZoneListResultInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineImageResource;
import com.azure.resourcemanager.compute.generated.models.VmImagesInEdgeZoneListResult;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class VmImagesInEdgeZoneListResultImpl implements VmImagesInEdgeZoneListResult {
    private VmImagesInEdgeZoneListResultInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    VmImagesInEdgeZoneListResultImpl(VmImagesInEdgeZoneListResultInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<VirtualMachineImageResource> value() {
        List<VirtualMachineImageResourceInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new VirtualMachineImageResourceImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public VmImagesInEdgeZoneListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
