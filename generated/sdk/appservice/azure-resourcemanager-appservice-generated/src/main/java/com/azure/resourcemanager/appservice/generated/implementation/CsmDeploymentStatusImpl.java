// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.resourcemanager.appservice.generated.fluent.models.CsmDeploymentStatusInner;
import com.azure.resourcemanager.appservice.generated.models.CsmDeploymentStatus;
import com.azure.resourcemanager.appservice.generated.models.DeploymentBuildStatus;
import com.azure.resourcemanager.appservice.generated.models.ErrorEntity;
import java.util.Collections;
import java.util.List;

public final class CsmDeploymentStatusImpl implements CsmDeploymentStatus {
    private CsmDeploymentStatusInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

    CsmDeploymentStatusImpl(
        CsmDeploymentStatusInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
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

    public String kind() {
        return this.innerModel().kind();
    }

    public String deploymentId() {
        return this.innerModel().deploymentId();
    }

    public DeploymentBuildStatus status() {
        return this.innerModel().status();
    }

    public Integer numberOfInstancesInProgress() {
        return this.innerModel().numberOfInstancesInProgress();
    }

    public Integer numberOfInstancesSuccessful() {
        return this.innerModel().numberOfInstancesSuccessful();
    }

    public Integer numberOfInstancesFailed() {
        return this.innerModel().numberOfInstancesFailed();
    }

    public List<String> failedInstancesLogs() {
        List<String> inner = this.innerModel().failedInstancesLogs();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ErrorEntity> errors() {
        List<ErrorEntity> inner = this.innerModel().errors();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public CsmDeploymentStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }
}