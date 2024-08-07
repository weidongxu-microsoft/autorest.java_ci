// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateOrderActionInner;
import com.azure.resourcemanager.appservice.generated.models.CertificateOrderAction;
import com.azure.resourcemanager.appservice.generated.models.CertificateOrderActionType;
import java.time.OffsetDateTime;

public final class CertificateOrderActionImpl implements CertificateOrderAction {
    private CertificateOrderActionInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    CertificateOrderActionImpl(CertificateOrderActionInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public CertificateOrderActionType actionType() {
        return this.innerModel().actionType();
    }

    public OffsetDateTime createdAt() {
        return this.innerModel().createdAt();
    }

    public CertificateOrderActionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
