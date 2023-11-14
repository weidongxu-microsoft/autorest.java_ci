// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.generated.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.mediaservices.generated.fluent.models.AsyncOperationResultInner;
import com.azure.resourcemanager.mediaservices.generated.models.AsyncOperationResult;
import com.azure.resourcemanager.mediaservices.generated.models.AsyncOperationStatus;

public final class AsyncOperationResultImpl implements AsyncOperationResult {
    private AsyncOperationResultInner innerObject;

    private final com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager;

    AsyncOperationResultImpl(AsyncOperationResultInner innerObject,
        com.azure.resourcemanager.mediaservices.generated.MediaServicesManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public String name() {
        return this.innerModel().name();
    }

    public AsyncOperationStatus status() {
        return this.innerModel().status();
    }

    public AsyncOperationResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mediaservices.generated.MediaServicesManager manager() {
        return this.serviceManager;
    }
}
