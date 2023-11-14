// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.resourcemanager.storage.generated.fluent.models.LeaseContainerResponseInner;
import com.azure.resourcemanager.storage.generated.models.LeaseContainerResponse;

public final class LeaseContainerResponseImpl implements LeaseContainerResponse {
    private LeaseContainerResponseInner innerObject;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    LeaseContainerResponseImpl(LeaseContainerResponseInner innerObject,
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

    public LeaseContainerResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }
}
