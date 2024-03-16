// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.StorageAccountInner;
import com.azure.resourcemanager.databoxedge.generated.models.DataPolicy;
import com.azure.resourcemanager.databoxedge.generated.models.StorageAccount;
import com.azure.resourcemanager.databoxedge.generated.models.StorageAccountStatus;

public final class StorageAccountImpl implements StorageAccount, StorageAccount.Definition, StorageAccount.Update {
    private StorageAccountInner innerObject;

    private final com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String description() {
        return this.innerModel().description();
    }

    public StorageAccountStatus storageAccountStatus() {
        return this.innerModel().storageAccountStatus();
    }

    public DataPolicy dataPolicy() {
        return this.innerModel().dataPolicy();
    }

    public String storageAccountCredentialId() {
        return this.innerModel().storageAccountCredentialId();
    }

    public String blobEndpoint() {
        return this.innerModel().blobEndpoint();
    }

    public Integer containerCount() {
        return this.innerModel().containerCount();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public StorageAccountInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    private String deviceName;

    private String storageAccountName;

    private String resourceGroupName;

    public StorageAccountImpl withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        this.deviceName = deviceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public StorageAccount create() {
        this.innerObject = serviceManager.serviceClient()
            .getStorageAccounts()
            .createOrUpdate(deviceName, storageAccountName, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public StorageAccount create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getStorageAccounts()
            .createOrUpdate(deviceName, storageAccountName, resourceGroupName, this.innerModel(), context);
        return this;
    }

    StorageAccountImpl(String name, com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager) {
        this.innerObject = new StorageAccountInner();
        this.serviceManager = serviceManager;
        this.storageAccountName = name;
    }

    public StorageAccountImpl update() {
        return this;
    }

    public StorageAccount apply() {
        this.innerObject = serviceManager.serviceClient()
            .getStorageAccounts()
            .createOrUpdate(deviceName, storageAccountName, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public StorageAccount apply(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getStorageAccounts()
            .createOrUpdate(deviceName, storageAccountName, resourceGroupName, this.innerModel(), context);
        return this;
    }

    StorageAccountImpl(StorageAccountInner innerObject,
        com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.deviceName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "dataBoxEdgeDevices");
        this.storageAccountName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "storageAccounts");
        this.resourceGroupName = ResourceManagerUtils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public StorageAccount refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getStorageAccounts()
            .getWithResponse(deviceName, storageAccountName, resourceGroupName, Context.NONE)
            .getValue();
        return this;
    }

    public StorageAccount refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getStorageAccounts()
            .getWithResponse(deviceName, storageAccountName, resourceGroupName, context)
            .getValue();
        return this;
    }

    public StorageAccountImpl withDataPolicy(DataPolicy dataPolicy) {
        this.innerModel().withDataPolicy(dataPolicy);
        return this;
    }

    public StorageAccountImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }

    public StorageAccountImpl withStorageAccountStatus(StorageAccountStatus storageAccountStatus) {
        this.innerModel().withStorageAccountStatus(storageAccountStatus);
        return this;
    }

    public StorageAccountImpl withStorageAccountCredentialId(String storageAccountCredentialId) {
        this.innerModel().withStorageAccountCredentialId(storageAccountCredentialId);
        return this;
    }
}
