// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.CsmOperationDescriptionInner;
import com.azure.resourcemanager.appservice.generated.models.CsmOperationDescription;
import com.azure.resourcemanager.appservice.generated.models.CsmOperationDescriptionProperties;
import com.azure.resourcemanager.appservice.generated.models.CsmOperationDisplay;

public final class CsmOperationDescriptionImpl implements CsmOperationDescription {
    private CsmOperationDescriptionInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    CsmOperationDescriptionImpl(CsmOperationDescriptionInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public Boolean isDataAction() {
        return this.innerModel().isDataAction();
    }

    public CsmOperationDisplay display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public CsmOperationDescriptionProperties properties() {
        return this.innerModel().properties();
    }

    public CsmOperationDescriptionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
