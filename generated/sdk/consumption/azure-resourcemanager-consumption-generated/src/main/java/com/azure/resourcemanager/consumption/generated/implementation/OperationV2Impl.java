// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.resourcemanager.consumption.generated.fluent.models.OperationV2Inner;
import com.azure.resourcemanager.consumption.generated.models.OperationV2;
import com.azure.resourcemanager.consumption.generated.models.OperationV2Display;

public final class OperationV2Impl implements OperationV2 {
    private OperationV2Inner innerObject;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    OperationV2Impl(
        OperationV2Inner innerObject,
        com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public OperationV2Display display() {
        return this.innerModel().display();
    }

    public OperationV2Inner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
