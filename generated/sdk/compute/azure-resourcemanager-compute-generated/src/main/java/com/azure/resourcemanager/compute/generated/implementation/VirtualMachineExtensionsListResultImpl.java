// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionsListResultInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtension;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionsListResult;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class VirtualMachineExtensionsListResultImpl implements VirtualMachineExtensionsListResult {
    private VirtualMachineExtensionsListResultInner innerObject;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    VirtualMachineExtensionsListResultImpl(VirtualMachineExtensionsListResultInner innerObject,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<VirtualMachineExtension> value() {
        List<VirtualMachineExtensionInner> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner.stream()
                .map(inner1 -> new VirtualMachineExtensionImpl(inner1, this.manager()))
                .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public VirtualMachineExtensionsListResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }
}
