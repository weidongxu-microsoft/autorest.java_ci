// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.resourcemanager.storage.generated.fluent.models.LeaseShareResponseInner;
import com.azure.resourcemanager.storage.generated.models.LeaseShareResponse;

public final class LeaseShareResponseImpl implements LeaseShareResponse {
    private LeaseShareResponseInner innerObject;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    LeaseShareResponseImpl(LeaseShareResponseInner innerObject,
        com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String leaseId() {
        return this.innerModel().leaseId();
    }

    public String leaseTimeSeconds() {
        return this.innerModel().leaseTimeSeconds();
    }

    public LeaseShareResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }
}
