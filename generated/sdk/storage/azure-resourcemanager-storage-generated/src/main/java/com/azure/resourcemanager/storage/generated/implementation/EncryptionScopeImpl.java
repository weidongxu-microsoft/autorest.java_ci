// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.EncryptionScopeInner;
import com.azure.resourcemanager.storage.generated.models.EncryptionScope;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopeKeyVaultProperties;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopeSource;
import com.azure.resourcemanager.storage.generated.models.EncryptionScopeState;
import java.time.OffsetDateTime;

public final class EncryptionScopeImpl implements EncryptionScope, EncryptionScope.Definition, EncryptionScope.Update {
    private EncryptionScopeInner innerObject;

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

    public EncryptionScopeSource source() {
        return this.innerModel().source();
    }

    public EncryptionScopeState state() {
        return this.innerModel().state();
    }

    public OffsetDateTime creationTime() {
        return this.innerModel().creationTime();
    }

    public OffsetDateTime lastModifiedTime() {
        return this.innerModel().lastModifiedTime();
    }

    public EncryptionScopeKeyVaultProperties keyVaultProperties() {
        return this.innerModel().keyVaultProperties();
    }

    public Boolean requireInfrastructureEncryption() {
        return this.innerModel().requireInfrastructureEncryption();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public EncryptionScopeInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String encryptionScopeName;

    public EncryptionScopeImpl withExistingStorageAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public EncryptionScope create() {
        this.innerObject = serviceManager.serviceClient().getEncryptionScopes()
            .putWithResponse(resourceGroupName, accountName, encryptionScopeName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public EncryptionScope create(Context context) {
        this.innerObject = serviceManager.serviceClient().getEncryptionScopes()
            .putWithResponse(resourceGroupName, accountName, encryptionScopeName, this.innerModel(), context)
            .getValue();
        return this;
    }

    EncryptionScopeImpl(String name, com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = new EncryptionScopeInner();
        this.serviceManager = serviceManager;
        this.encryptionScopeName = name;
    }

    public EncryptionScopeImpl update() {
        return this;
    }

    public EncryptionScope apply() {
        this.innerObject = serviceManager.serviceClient().getEncryptionScopes()
            .patchWithResponse(resourceGroupName, accountName, encryptionScopeName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public EncryptionScope apply(Context context) {
        this.innerObject = serviceManager.serviceClient().getEncryptionScopes()
            .patchWithResponse(resourceGroupName, accountName, encryptionScopeName, this.innerModel(), context)
            .getValue();
        return this;
    }

    EncryptionScopeImpl(EncryptionScopeInner innerObject,
        com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
        this.encryptionScopeName = Utils.getValueFromIdByName(innerObject.id(), "encryptionScopes");
    }

    public EncryptionScope refresh() {
        this.innerObject = serviceManager.serviceClient().getEncryptionScopes()
            .getWithResponse(resourceGroupName, accountName, encryptionScopeName, Context.NONE).getValue();
        return this;
    }

    public EncryptionScope refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getEncryptionScopes()
            .getWithResponse(resourceGroupName, accountName, encryptionScopeName, context).getValue();
        return this;
    }

    public EncryptionScopeImpl withSource(EncryptionScopeSource source) {
        this.innerModel().withSource(source);
        return this;
    }

    public EncryptionScopeImpl withState(EncryptionScopeState state) {
        this.innerModel().withState(state);
        return this;
    }

    public EncryptionScopeImpl withKeyVaultProperties(EncryptionScopeKeyVaultProperties keyVaultProperties) {
        this.innerModel().withKeyVaultProperties(keyVaultProperties);
        return this;
    }

    public EncryptionScopeImpl withRequireInfrastructureEncryption(Boolean requireInfrastructureEncryption) {
        this.innerModel().withRequireInfrastructureEncryption(requireInfrastructureEncryption);
        return this;
    }
}
