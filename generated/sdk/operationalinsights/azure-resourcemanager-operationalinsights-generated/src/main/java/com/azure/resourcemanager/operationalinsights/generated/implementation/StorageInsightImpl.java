// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationalinsights.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.operationalinsights.generated.fluent.models.StorageInsightInner;
import com.azure.resourcemanager.operationalinsights.generated.models.StorageAccount;
import com.azure.resourcemanager.operationalinsights.generated.models.StorageInsight;
import com.azure.resourcemanager.operationalinsights.generated.models.StorageInsightStatus;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class StorageInsightImpl implements StorageInsight, StorageInsight.Definition, StorageInsight.Update {
    private StorageInsightInner innerObject;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public List<String> containers() {
        List<String> inner = this.innerModel().containers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> tables() {
        List<String> inner = this.innerModel().tables();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public StorageAccount storageAccount() {
        return this.innerModel().storageAccount();
    }

    public StorageInsightStatus status() {
        return this.innerModel().status();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public StorageInsightInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String storageInsightName;

    public StorageInsightImpl withExistingWorkspace(String resourceGroupName, String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public StorageInsight create() {
        this.innerObject
            = serviceManager.serviceClient().getStorageInsightConfigs().createOrUpdateWithResponse(resourceGroupName,
                workspaceName, storageInsightName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public StorageInsight create(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getStorageInsightConfigs().createOrUpdateWithResponse(resourceGroupName,
                workspaceName, storageInsightName, this.innerModel(), context).getValue();
        return this;
    }

    StorageInsightImpl(String name,
        com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerObject = new StorageInsightInner();
        this.serviceManager = serviceManager;
        this.storageInsightName = name;
    }

    public StorageInsightImpl update() {
        return this;
    }

    public StorageInsight apply() {
        this.innerObject
            = serviceManager.serviceClient().getStorageInsightConfigs().createOrUpdateWithResponse(resourceGroupName,
                workspaceName, storageInsightName, this.innerModel(), Context.NONE).getValue();
        return this;
    }

    public StorageInsight apply(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getStorageInsightConfigs().createOrUpdateWithResponse(resourceGroupName,
                workspaceName, storageInsightName, this.innerModel(), context).getValue();
        return this;
    }

    StorageInsightImpl(StorageInsightInner innerObject,
        com.azure.resourcemanager.operationalinsights.generated.LogAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.workspaceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "workspaces");
        this.storageInsightName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "storageInsightConfigs");
    }

    public StorageInsight refresh() {
        this.innerObject = serviceManager.serviceClient().getStorageInsightConfigs()
            .getWithResponse(resourceGroupName, workspaceName, storageInsightName, Context.NONE).getValue();
        return this;
    }

    public StorageInsight refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getStorageInsightConfigs()
            .getWithResponse(resourceGroupName, workspaceName, storageInsightName, context).getValue();
        return this;
    }

    public StorageInsightImpl withTags(Map<String, String> tags) {
        this.innerModel().withTags(tags);
        return this;
    }

    public StorageInsightImpl withEtag(String etag) {
        this.innerModel().withEtag(etag);
        return this;
    }

    public StorageInsightImpl withContainers(List<String> containers) {
        this.innerModel().withContainers(containers);
        return this;
    }

    public StorageInsightImpl withTables(List<String> tables) {
        this.innerModel().withTables(tables);
        return this;
    }

    public StorageInsightImpl withStorageAccount(StorageAccount storageAccount) {
        this.innerModel().withStorageAccount(storageAccount);
        return this;
    }
}
