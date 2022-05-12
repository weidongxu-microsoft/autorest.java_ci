// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.generated.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databoxedge.generated.fluent.models.ContainerInner;
import com.azure.resourcemanager.databoxedge.generated.models.AzureContainerDataFormat;
import com.azure.resourcemanager.databoxedge.generated.models.Container;
import com.azure.resourcemanager.databoxedge.generated.models.ContainerStatus;
import com.azure.resourcemanager.databoxedge.generated.models.RefreshDetails;
import java.time.OffsetDateTime;

public final class ContainerImpl implements Container, Container.Definition, Container.Update {
    private ContainerInner innerObject;

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

    public ContainerStatus containerStatus() {
        return this.innerModel().containerStatus();
    }

    public AzureContainerDataFormat dataFormat() {
        return this.innerModel().dataFormat();
    }

    public RefreshDetails refreshDetails() {
        return this.innerModel().refreshDetails();
    }

    public OffsetDateTime createdDateTime() {
        return this.innerModel().createdDateTime();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ContainerInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager manager() {
        return this.serviceManager;
    }

    private String deviceName;

    private String storageAccountName;

    private String containerName;

    private String resourceGroupName;

    public ContainerImpl withExistingStorageAccount(
        String deviceName, String storageAccountName, String resourceGroupName) {
        this.deviceName = deviceName;
        this.storageAccountName = storageAccountName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public Container create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainers()
                .createOrUpdate(
                    deviceName, storageAccountName, containerName, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public Container create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainers()
                .createOrUpdate(
                    deviceName, storageAccountName, containerName, resourceGroupName, this.innerModel(), context);
        return this;
    }

    ContainerImpl(String name, com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager) {
        this.innerObject = new ContainerInner();
        this.serviceManager = serviceManager;
        this.containerName = name;
    }

    public ContainerImpl update() {
        return this;
    }

    public Container apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainers()
                .createOrUpdate(
                    deviceName, storageAccountName, containerName, resourceGroupName, this.innerModel(), Context.NONE);
        return this;
    }

    public Container apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainers()
                .createOrUpdate(
                    deviceName, storageAccountName, containerName, resourceGroupName, this.innerModel(), context);
        return this;
    }

    ContainerImpl(
        ContainerInner innerObject, com.azure.resourcemanager.databoxedge.generated.DataBoxEdgeManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.deviceName = Utils.getValueFromIdByName(innerObject.id(), "dataBoxEdgeDevices");
        this.storageAccountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
        this.containerName = Utils.getValueFromIdByName(innerObject.id(), "containers");
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
    }

    public Container refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainers()
                .getWithResponse(deviceName, storageAccountName, containerName, resourceGroupName, Context.NONE)
                .getValue();
        return this;
    }

    public Container refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getContainers()
                .getWithResponse(deviceName, storageAccountName, containerName, resourceGroupName, context)
                .getValue();
        return this;
    }

    public ContainerImpl withDataFormat(AzureContainerDataFormat dataFormat) {
        this.innerModel().withDataFormat(dataFormat);
        return this;
    }
}
