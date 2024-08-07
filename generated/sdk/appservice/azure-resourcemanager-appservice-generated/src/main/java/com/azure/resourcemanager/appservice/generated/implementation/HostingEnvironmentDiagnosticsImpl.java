// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.HostingEnvironmentDiagnosticsInner;
import com.azure.resourcemanager.appservice.generated.models.HostingEnvironmentDiagnostics;

public final class HostingEnvironmentDiagnosticsImpl implements HostingEnvironmentDiagnostics {
    private HostingEnvironmentDiagnosticsInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    HostingEnvironmentDiagnosticsImpl(HostingEnvironmentDiagnosticsInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String name() {
        return this.innerModel().name();
    }

    public String diagnosticsOutput() {
        return this.innerModel().diagnosticsOutput();
    }

    public HostingEnvironmentDiagnosticsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}
