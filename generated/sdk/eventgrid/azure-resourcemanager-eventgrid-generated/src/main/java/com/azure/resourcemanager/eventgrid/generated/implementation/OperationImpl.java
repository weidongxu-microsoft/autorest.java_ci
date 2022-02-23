// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated.implementation;

import com.azure.resourcemanager.eventgrid.generated.fluent.models.OperationInner;
import com.azure.resourcemanager.eventgrid.generated.models.Operation;
import com.azure.resourcemanager.eventgrid.generated.models.OperationInfo;

public final class OperationImpl implements Operation {
    private OperationInner innerObject;

    private final com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager;

    OperationImpl(
        OperationInner innerObject, com.azure.resourcemanager.eventgrid.generated.EventGridManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public OperationInfo display() {
        return this.innerModel().display();
    }

    public String origin() {
        return this.innerModel().origin();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public OperationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.eventgrid.generated.EventGridManager manager() {
        return this.serviceManager;
    }
}
