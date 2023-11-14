// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.frontdoor.generated.implementation;

import com.azure.resourcemanager.frontdoor.generated.fluent.models.ValidateCustomDomainOutputInner;
import com.azure.resourcemanager.frontdoor.generated.models.ValidateCustomDomainOutput;

public final class ValidateCustomDomainOutputImpl implements ValidateCustomDomainOutput {
    private ValidateCustomDomainOutputInner innerObject;

    private final com.azure.resourcemanager.frontdoor.generated.FrontDoorManager serviceManager;

    ValidateCustomDomainOutputImpl(ValidateCustomDomainOutputInner innerObject,
        com.azure.resourcemanager.frontdoor.generated.FrontDoorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Boolean customDomainValidated() {
        return this.innerModel().customDomainValidated();
    }

    public String reason() {
        return this.innerModel().reason();
    }

    public String message() {
        return this.innerModel().message();
    }

    public ValidateCustomDomainOutputInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.frontdoor.generated.FrontDoorManager manager() {
        return this.serviceManager;
    }
}
