// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.LinkedServiceInner;
import com.azure.resourcemanager.operationalinsights.generated.models.LinkedService;
import com.azure.resourcemanager.operationalinsights.generated.models.LinkedServiceEntityStatus;
import java.util.Collections;
import java.util.Map;

public final class LinkedServiceImpl implements LinkedService, LinkedService.Definition, LinkedService.Update {
    private LinkedServiceInner innerObject;

    private final com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public String writeAccessResourceId() {
        return this.innerModel().writeAccessResourceId();
    }

    public LinkedServiceEntityStatus provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public LinkedServiceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String linkedServiceName;

    public LinkedServiceImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public LinkedService create() {
        this.innerObject = serviceManager.serviceClient()
            .getLinkedServices()
            .createOrUpdate(resourceGroupName, workspaceName, linkedServiceName, this.innerModel(), Context.NONE);
        return this;
    }

    public LinkedService create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getLinkedServices()
            .createOrUpdate(resourceGroupName, workspaceName, linkedServiceName, this.innerModel(), context);
        return this;
    }

    LinkedServiceImpl(String name,
        com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerObject = new LinkedServiceInner();
        this.serviceManager = serviceManager;
        this.linkedServiceName = name;
    }

    public LinkedServiceImpl update() {
        return this;
    }

    public LinkedService apply() {
        this.innerObject = serviceManager.serviceClient()
            .getLinkedServices()
            .createOrUpdate(resourceGroupName, workspaceName, linkedServiceName, this.innerModel(), Context.NONE);
        return this;
    }

    public LinkedService apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getLinkedServices()
            .createOrUpdate(resourceGroupName, workspaceName, linkedServiceName, this.innerModel(), context);
        return this;
    }

    LinkedServiceImpl(LinkedServiceInner innerObject,
        com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.workspaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.linkedServiceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "linkedServices");
    }

    public LinkedService refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getLinkedServices()
            .getWithResponse(resourceGroupName, workspaceName, linkedServiceName, Context.NONE)
            .getValue();
        return this;
    }

    public LinkedService refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getLinkedServices()
            .getWithResponse(resourceGroupName, workspaceName, linkedServiceName, context)
            .getValue();
        return this;
    }

    public LinkedServiceImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public LinkedServiceImpl withResourceId(String resourceId) {
        this.innerModel().withResourceId(resourceId);
        return this;
    }

    public LinkedServiceImpl withWriteAccessResourceId(String writeAccessResourceId) {
        this.innerModel().withWriteAccessResourceId(writeAccessResourceId);
        return this;
    }

    public LinkedServiceImpl withProvisioningState(LinkedServiceEntityStatus provisioningState) {
        this.innerModel().withProvisioningState(provisioningState);
        return this;
    }
}
