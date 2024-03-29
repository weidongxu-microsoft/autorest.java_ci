// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated.implementation;

import com.azure.resourcemanager.applicationinsights.generated.fluent.models.ComponentPurgeResponseInner;
import com.azure.resourcemanager.applicationinsights.generated.models.ComponentPurgeResponse;

public final class ComponentPurgeResponseImpl implements ComponentPurgeResponse {
    private ComponentPurgeResponseInner innerObject;

    private final com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager;

    ComponentPurgeResponseImpl(ComponentPurgeResponseInner innerObject,
        com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String operationId() {
        return this.innerModel().operationId();
    }

    public ComponentPurgeResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.applicationinsights.generated.ApplicationInsightsManager manager() {
        return this.serviceManager;
    }
}
