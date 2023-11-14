// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.ImmutabilityPolicyInner;
import com.azure.resourcemanager.storage.generated.models.ImmutabilityPolicy;
import com.azure.resourcemanager.storage.generated.models.ImmutabilityPolicyState;

public final class ImmutabilityPolicyImpl
    implements ImmutabilityPolicy, ImmutabilityPolicy.Definition, ImmutabilityPolicy.Update {
    private ImmutabilityPolicyInner innerObject;

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

    public String etag() {
        return this.innerModel().etag();
    }

    public Integer immutabilityPeriodSinceCreationInDays() {
        return this.innerModel().immutabilityPeriodSinceCreationInDays();
    }

    public ImmutabilityPolicyState state() {
        return this.innerModel().state();
    }

    public Boolean allowProtectedAppendWrites() {
        return this.innerModel().allowProtectedAppendWrites();
    }

    public Boolean allowProtectedAppendWritesAll() {
        return this.innerModel().allowProtectedAppendWritesAll();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public ImmutabilityPolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String containerName;

    private String createIfMatch;

    private String updateIfMatch;

    public ImmutabilityPolicyImpl withExistingContainer(String resourceGroupName, String accountName,
        String containerName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        this.containerName = containerName;
        return this;
    }

    public ImmutabilityPolicy create() {
        this.innerObject = serviceManager.serviceClient().getBlobContainers()
            .createOrUpdateImmutabilityPolicyWithResponse(resourceGroupName, accountName, containerName, createIfMatch,
                this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public ImmutabilityPolicy create(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getBlobContainers().createOrUpdateImmutabilityPolicyWithResponse(
                resourceGroupName, accountName, containerName, createIfMatch, this.innerModel(), context).getValue();
        return this;
    }

    ImmutabilityPolicyImpl(com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = new ImmutabilityPolicyInner();
        this.serviceManager = serviceManager;
        this.createIfMatch = null;
    }

    public ImmutabilityPolicyImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public ImmutabilityPolicy apply() {
        this.innerObject = serviceManager.serviceClient().getBlobContainers()
            .createOrUpdateImmutabilityPolicyWithResponse(resourceGroupName, accountName, containerName, updateIfMatch,
                this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public ImmutabilityPolicy apply(Context context) {
        this.innerObject
            = serviceManager.serviceClient().getBlobContainers().createOrUpdateImmutabilityPolicyWithResponse(
                resourceGroupName, accountName, containerName, updateIfMatch, this.innerModel(), context).getValue();
        return this;
    }

    ImmutabilityPolicyImpl(ImmutabilityPolicyInner innerObject,
        com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
        this.containerName = Utils.getValueFromIdByName(innerObject.id(), "containers");
    }

    public ImmutabilityPolicy refresh() {
        String localIfMatch = null;
        this.innerObject
            = serviceManager.serviceClient().getBlobContainers().getImmutabilityPolicyWithResponse(resourceGroupName,
                accountName, containerName, localIfMatch, Context.NONE).getValue();
        return this;
    }

    public ImmutabilityPolicy refresh(Context context) {
        String localIfMatch = null;
        this.innerObject = serviceManager.serviceClient().getBlobContainers()
            .getImmutabilityPolicyWithResponse(resourceGroupName, accountName, containerName, localIfMatch, context)
            .getValue();
        return this;
    }

    public ImmutabilityPolicyImpl
        withImmutabilityPeriodSinceCreationInDays(Integer immutabilityPeriodSinceCreationInDays) {
        this.innerModel().withImmutabilityPeriodSinceCreationInDays(immutabilityPeriodSinceCreationInDays);
        return this;
    }

    public ImmutabilityPolicyImpl withAllowProtectedAppendWrites(Boolean allowProtectedAppendWrites) {
        this.innerModel().withAllowProtectedAppendWrites(allowProtectedAppendWrites);
        return this;
    }

    public ImmutabilityPolicyImpl withAllowProtectedAppendWritesAll(Boolean allowProtectedAppendWritesAll) {
        this.innerModel().withAllowProtectedAppendWritesAll(allowProtectedAppendWritesAll);
        return this;
    }

    public ImmutabilityPolicyImpl withIfMatch(String ifMatch) {
        if (isInCreateMode()) {
            this.createIfMatch = ifMatch;
            return this;
        } else {
            this.updateIfMatch = ifMatch;
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
