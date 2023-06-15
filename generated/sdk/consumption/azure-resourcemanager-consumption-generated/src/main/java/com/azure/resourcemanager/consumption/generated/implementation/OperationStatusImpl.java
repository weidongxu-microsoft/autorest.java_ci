// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.consumption.generated.implementation;

import com.azure.resourcemanager.consumption.generated.fluent.models.OperationStatusInner;
import com.azure.resourcemanager.consumption.generated.models.OperationStatus;
import com.azure.resourcemanager.consumption.generated.models.OperationStatusType;
import java.time.OffsetDateTime;

public final class OperationStatusImpl implements OperationStatus {
    private OperationStatusInner innerObject;

    private final com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager;

    OperationStatusImpl(
        OperationStatusInner innerObject,
        com.azure.resourcemanager.consumption.generated.ConsumptionManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public OperationStatusType status() {
        return this.innerModel().status();
    }

    public String downloadUrl() {
        return this.innerModel().downloadUrl();
    }

    public OffsetDateTime validTill() {
        return this.innerModel().validTill();
    }

    public OperationStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.consumption.generated.ConsumptionManager manager() {
        return this.serviceManager;
    }
}
