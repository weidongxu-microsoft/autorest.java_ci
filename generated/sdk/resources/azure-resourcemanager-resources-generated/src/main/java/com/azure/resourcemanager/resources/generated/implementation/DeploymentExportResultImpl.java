// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.generated.implementation;

import com.azure.resourcemanager.resources.generated.fluent.models.DeploymentExportResultInner;
import com.azure.resourcemanager.resources.generated.models.DeploymentExportResult;

public final class DeploymentExportResultImpl implements DeploymentExportResult {
    private DeploymentExportResultInner innerObject;

    private final com.azure.resourcemanager.resources.generated.ResourceManager serviceManager;

    DeploymentExportResultImpl(DeploymentExportResultInner innerObject,
        com.azure.resourcemanager.resources.generated.ResourceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public Object template() {
        return this.innerModel().template();
    }

    public DeploymentExportResultInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.resources.generated.ResourceManager manager() {
        return this.serviceManager;
    }
}
