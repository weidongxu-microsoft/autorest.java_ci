// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storage.generated.fluent.models.TableInner;
import com.azure.resourcemanager.storage.generated.models.Table;
import com.azure.resourcemanager.storage.generated.models.TableSignedIdentifier;
import java.util.Collections;
import java.util.List;

public final class TableImpl implements Table, Table.Definition, Table.Update {
    private TableInner innerObject;

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

    public String tableName() {
        return this.innerModel().tableName();
    }

    public List<TableSignedIdentifier> signedIdentifiers() {
        List<TableSignedIdentifier> inner = this.innerModel().signedIdentifiers();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public TableInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storage.generated.StorageManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String tableName;

    public TableImpl withExistingStorageAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public Table create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTables()
                .createWithResponse(resourceGroupName, accountName, tableName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Table create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTables()
                .createWithResponse(resourceGroupName, accountName, tableName, this.innerModel(), context)
                .getValue();
        return this;
    }

    TableImpl(String name, com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = new TableInner();
        this.serviceManager = serviceManager;
        this.tableName = name;
    }

    public TableImpl update() {
        return this;
    }

    public Table apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTables()
                .updateWithResponse(resourceGroupName, accountName, tableName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public Table apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTables()
                .updateWithResponse(resourceGroupName, accountName, tableName, this.innerModel(), context)
                .getValue();
        return this;
    }

    TableImpl(TableInner innerObject, com.azure.resourcemanager.storage.generated.StorageManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "storageAccounts");
        this.tableName = Utils.getValueFromIdByName(innerObject.id(), "tables");
    }

    public Table refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTables()
                .getWithResponse(resourceGroupName, accountName, tableName, Context.NONE)
                .getValue();
        return this;
    }

    public Table refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTables()
                .getWithResponse(resourceGroupName, accountName, tableName, context)
                .getValue();
        return this;
    }

    public TableImpl withSignedIdentifiers(List<TableSignedIdentifier> signedIdentifiers) {
        this.innerModel().withSignedIdentifiers(signedIdentifiers);
        return this;
    }
}
