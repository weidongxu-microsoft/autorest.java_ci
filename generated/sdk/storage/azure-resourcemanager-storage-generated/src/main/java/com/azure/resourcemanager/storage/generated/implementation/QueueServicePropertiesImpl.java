// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.QueueServicePropertiesInner;
import com.azure.resourcemanager.storage.generated.models.CorsRules;
import com.azure.resourcemanager.storage.generated.models.QueueServiceProperties;

public final class QueueServicePropertiesImpl
    implements QueueServiceProperties, QueueServiceProperties.Definition, QueueServiceProperties.Update {
    private QueueServicePropertiesInner innerObject;

    private final com.azure.resourcemanager.storage.generated.StorageManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public CorsRules cors() {
        return this.innerModel().cors();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public QueueServicePropertiesInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    public QueueServicePropertiesImpl withExistingStorageAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public QueueServiceProperties create() {
        this.innerObject = serviceManager.serviceClient().getQueueServices()
            .setServicePropertiesWithResponse(resourceGroupName, accountName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public QueueServiceProperties create(Context context) {
        this.innerObject = serviceManager.serviceClient().getQueueServices()
            .setServicePropertiesWithResponse(resourceGroupName, accountName, this.innerModel(), context).getValue();
        return this;
    }

    QueueServicePropertiesImpl(com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = new QueueServicePropertiesInner();
        this.serviceManager = serviceManager;
    }

    public QueueServicePropertiesImpl update() {
        return this;
    }

    public QueueServiceProperties apply() {
        this.innerObject = serviceManager.serviceClient().getQueueServices()
            .setServicePropertiesWithResponse(resourceGroupName, accountName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public QueueServiceProperties apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getQueueServices()
            .setServicePropertiesWithResponse(resourceGroupName, accountName, this.innerModel(), context).getValue();
        return this;
    }

    QueueServicePropertiesImpl(QueueServicePropertiesInner innerObject,
        com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
    }

    public QueueServiceProperties refresh() {
        this.innerObject = serviceManager.serviceClient().getQueueServices()
            .getServicePropertiesWithResponse(resourceGroupName, accountName, Context.NONE).getValue();
        return this;
    }

    public QueueServiceProperties refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getQueueServices()
            .getServicePropertiesWithResponse(resourceGroupName, accountName, context).getValue();
        return this;
    }

    public QueueServicePropertiesImpl withCors(CorsRules cors) {
        this.innerModel().withCors(cors);
        return this;
    }
}
