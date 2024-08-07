// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.implementation;

import com.azure.resourcemanager.monitor.generated.fluent.models.DiagnosticSettingsCategoryResourceInner;
import com.azure.resourcemanager.monitor.generated.models.CategoryType;
import com.azure.resourcemanager.monitor.generated.models.DiagnosticSettingsCategoryResource;

public final class DiagnosticSettingsCategoryResourceImpl implements DiagnosticSettingsCategoryResource {
    private DiagnosticSettingsCategoryResourceInner innerObject;

    private final com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager;

    DiagnosticSettingsCategoryResourceImpl(DiagnosticSettingsCategoryResourceInner innerObject,
        com.azure.resourcemanager.monitor.generated.MonitorManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public CategoryType categoryType() {
        return this.innerModel().categoryType();
    }

    public DiagnosticSettingsCategoryResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.monitor.generated.MonitorManager manager() {
        return this.serviceManager;
    }
}
