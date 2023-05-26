// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.DatabaseConnectionInner;
import com.azure.resourcemanager.appservice.generated.models.DatabaseConnection;
import com.azure.resourcemanager.appservice.generated.models.DatabaseConnectionPatchRequest;
import com.azure.resourcemanager.appservice.generated.models.StaticSiteDatabaseConnectionConfigurationFileOverview;
import java.util.Collections;
import java.util.List;

public final class DatabaseConnectionImpl
    implements DatabaseConnection, DatabaseConnection.Definition, DatabaseConnection.Update {
    private DatabaseConnectionInner innerObject;

    private final com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager;

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

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public String connectionIdentity() {
        return this.innerModel().connectionIdentity();
    }

    public String connectionString() {
        return this.innerModel().connectionString();
    }

    public String region() {
        return this.innerModel().region();
    }

    public List<StaticSiteDatabaseConnectionConfigurationFileOverview> configurationFiles() {
        List<StaticSiteDatabaseConnectionConfigurationFileOverview> inner = this.innerModel().configurationFiles();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public DatabaseConnectionInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.appservice.generated.AppServiceManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String name;

    private String environmentName;

    private String databaseConnectionName;

    private DatabaseConnectionPatchRequest updateDatabaseConnectionRequestEnvelope;

    public DatabaseConnectionImpl withExistingBuild(String resourceGroupName, String name, String environmentName) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        this.environmentName = environmentName;
        return this;
    }

    public DatabaseConnection create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .createOrUpdateBuildDatabaseConnectionWithResponse(
                    resourceGroupName, name, environmentName, databaseConnectionName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseConnection create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .createOrUpdateBuildDatabaseConnectionWithResponse(
                    resourceGroupName, name, environmentName, databaseConnectionName, this.innerModel(), context)
                .getValue();
        return this;
    }

    DatabaseConnectionImpl(
        String name, com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = new DatabaseConnectionInner();
        this.serviceManager = serviceManager;
        this.databaseConnectionName = name;
    }

    public DatabaseConnectionImpl update() {
        this.updateDatabaseConnectionRequestEnvelope = new DatabaseConnectionPatchRequest();
        return this;
    }

    public DatabaseConnection apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .updateBuildDatabaseConnectionWithResponse(
                    resourceGroupName,
                    name,
                    environmentName,
                    databaseConnectionName,
                    updateDatabaseConnectionRequestEnvelope,
                    Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseConnection apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .updateBuildDatabaseConnectionWithResponse(
                    resourceGroupName,
                    name,
                    environmentName,
                    databaseConnectionName,
                    updateDatabaseConnectionRequestEnvelope,
                    context)
                .getValue();
        return this;
    }

    DatabaseConnectionImpl(
        DatabaseConnectionInner innerObject,
        com.azure.resourcemanager.appservice.generated.AppServiceManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.name = Utils.getValueFromIdByName(innerObject.id(), "staticSites");
        this.environmentName = Utils.getValueFromIdByName(innerObject.id(), "builds");
        this.databaseConnectionName = Utils.getValueFromIdByName(innerObject.id(), "databaseConnections");
    }

    public DatabaseConnection refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .getBuildDatabaseConnectionWithResponse(
                    resourceGroupName, name, environmentName, databaseConnectionName, Context.NONE)
                .getValue();
        return this;
    }

    public DatabaseConnection refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getStaticSites()
                .getBuildDatabaseConnectionWithResponse(
                    resourceGroupName, name, environmentName, databaseConnectionName, context)
                .getValue();
        return this;
    }

    public Response<DatabaseConnection> getBuildDatabaseConnectionWithDetailsWithResponse(Context context) {
        return serviceManager
            .staticSites()
            .getBuildDatabaseConnectionWithDetailsWithResponse(
                resourceGroupName, name, environmentName, databaseConnectionName, context);
    }

    public DatabaseConnection getBuildDatabaseConnectionWithDetails() {
        return serviceManager
            .staticSites()
            .getBuildDatabaseConnectionWithDetails(resourceGroupName, name, environmentName, databaseConnectionName);
    }

    public DatabaseConnectionImpl withKind(String kind) {
        this.innerModel().withKind(kind);
        return this;
    }

    public DatabaseConnectionImpl withResourceId(String resourceId) {
        if (isInCreateMode()) {
            this.innerModel().withResourceId(resourceId);
            return this;
        } else {
            this.updateDatabaseConnectionRequestEnvelope.withResourceId(resourceId);
            return this;
        }
    }

    public DatabaseConnectionImpl withConnectionIdentity(String connectionIdentity) {
        if (isInCreateMode()) {
            this.innerModel().withConnectionIdentity(connectionIdentity);
            return this;
        } else {
            this.updateDatabaseConnectionRequestEnvelope.withConnectionIdentity(connectionIdentity);
            return this;
        }
    }

    public DatabaseConnectionImpl withConnectionString(String connectionString) {
        if (isInCreateMode()) {
            this.innerModel().withConnectionString(connectionString);
            return this;
        } else {
            this.updateDatabaseConnectionRequestEnvelope.withConnectionString(connectionString);
            return this;
        }
    }

    public DatabaseConnectionImpl withRegion(String region) {
        if (isInCreateMode()) {
            this.innerModel().withRegion(region);
            return this;
        } else {
            this.updateDatabaseConnectionRequestEnvelope.withRegion(region);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}