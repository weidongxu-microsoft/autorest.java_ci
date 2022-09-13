// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.implementation;

import com.azure.resourcemanager.azurekusto.generated.fluent.models.FollowerDatabaseDefinitionInner;
import com.azure.resourcemanager.azurekusto.generated.models.DatabaseShareOrigin;
import com.azure.resourcemanager.azurekusto.generated.models.FollowerDatabaseDefinition;
import com.azure.resourcemanager.azurekusto.generated.models.TableLevelSharingProperties;

public final class FollowerDatabaseDefinitionImpl implements FollowerDatabaseDefinition {
    private FollowerDatabaseDefinitionInner innerObject;

    private final com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager;

    FollowerDatabaseDefinitionImpl(
        FollowerDatabaseDefinitionInner innerObject,
        com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String clusterResourceId() {
        return this.innerModel().clusterResourceId();
    }

    public String attachedDatabaseConfigurationName() {
        return this.innerModel().attachedDatabaseConfigurationName();
    }

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public TableLevelSharingProperties tableLevelSharingProperties() {
        return this.innerModel().tableLevelSharingProperties();
    }

    public DatabaseShareOrigin databaseShareOrigin() {
        return this.innerModel().databaseShareOrigin();
    }

    public FollowerDatabaseDefinitionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurekusto.generated.KustoManager manager() {
        return this.serviceManager;
    }
}
