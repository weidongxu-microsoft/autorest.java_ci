// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.implementation;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.azurekusto.generated.fluent.models.AttachedDatabaseConfigurationInner;
import com.azure.resourcemanager.azurekusto.generated.models.AttachedDatabaseConfiguration;
import com.azure.resourcemanager.azurekusto.generated.models.DefaultPrincipalsModificationKind;
import com.azure.resourcemanager.azurekusto.generated.models.ProvisioningState;
import com.azure.resourcemanager.azurekusto.generated.models.TableLevelSharingProperties;
import java.util.Collections;
import java.util.List;

public final class AttachedDatabaseConfigurationImpl
    implements AttachedDatabaseConfiguration,
        AttachedDatabaseConfiguration.Definition,
        AttachedDatabaseConfiguration.Update {
    private AttachedDatabaseConfigurationInner innerObject;

    private final com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String databaseName() {
        return this.innerModel().databaseName();
    }

    public String clusterResourceId() {
        return this.innerModel().clusterResourceId();
    }

    public List<String> attachedDatabaseNames() {
        List<String> inner = this.innerModel().attachedDatabaseNames();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public DefaultPrincipalsModificationKind defaultPrincipalsModificationKind() {
        return this.innerModel().defaultPrincipalsModificationKind();
    }

    public TableLevelSharingProperties tableLevelSharingProperties() {
        return this.innerModel().tableLevelSharingProperties();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public AttachedDatabaseConfigurationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.azurekusto.generated.KustoManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String clusterName;

    private String attachedDatabaseConfigurationName;

    public AttachedDatabaseConfigurationImpl withExistingCluster(String resourceGroupName, String clusterName) {
        this.resourceGroupName = resourceGroupName;
        this.clusterName = clusterName;
        return this;
    }

    public AttachedDatabaseConfiguration create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttachedDatabaseConfigurations()
                .createOrUpdate(
                    resourceGroupName, clusterName, attachedDatabaseConfigurationName, this.innerModel(), Context.NONE);
        return this;
    }

    public AttachedDatabaseConfiguration create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttachedDatabaseConfigurations()
                .createOrUpdate(
                    resourceGroupName, clusterName, attachedDatabaseConfigurationName, this.innerModel(), context);
        return this;
    }

    AttachedDatabaseConfigurationImpl(
        String name, com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager) {
        this.innerObject = new AttachedDatabaseConfigurationInner();
        this.serviceManager = serviceManager;
        this.attachedDatabaseConfigurationName = name;
    }

    public AttachedDatabaseConfigurationImpl update() {
        return this;
    }

    public AttachedDatabaseConfiguration apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttachedDatabaseConfigurations()
                .createOrUpdate(
                    resourceGroupName, clusterName, attachedDatabaseConfigurationName, this.innerModel(), Context.NONE);
        return this;
    }

    public AttachedDatabaseConfiguration apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttachedDatabaseConfigurations()
                .createOrUpdate(
                    resourceGroupName, clusterName, attachedDatabaseConfigurationName, this.innerModel(), context);
        return this;
    }

    AttachedDatabaseConfigurationImpl(
        AttachedDatabaseConfigurationInner innerObject,
        com.azure.resourcemanager.azurekusto.generated.KustoManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.clusterName = Utils.getValueFromIdByName(innerObject.id(), "clusters");
        this.attachedDatabaseConfigurationName =
            Utils.getValueFromIdByName(innerObject.id(), "attachedDatabaseConfigurations");
    }

    public AttachedDatabaseConfiguration refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttachedDatabaseConfigurations()
                .getWithResponse(resourceGroupName, clusterName, attachedDatabaseConfigurationName, Context.NONE)
                .getValue();
        return this;
    }

    public AttachedDatabaseConfiguration refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getAttachedDatabaseConfigurations()
                .getWithResponse(resourceGroupName, clusterName, attachedDatabaseConfigurationName, context)
                .getValue();
        return this;
    }

    public AttachedDatabaseConfigurationImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public AttachedDatabaseConfigurationImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public AttachedDatabaseConfigurationImpl withDatabaseName(String databaseName) {
        this.innerModel().withDatabaseName(databaseName);
        return this;
    }

    public AttachedDatabaseConfigurationImpl withClusterResourceId(String clusterResourceId) {
        this.innerModel().withClusterResourceId(clusterResourceId);
        return this;
    }

    public AttachedDatabaseConfigurationImpl withDefaultPrincipalsModificationKind(
        DefaultPrincipalsModificationKind defaultPrincipalsModificationKind) {
        this.innerModel().withDefaultPrincipalsModificationKind(defaultPrincipalsModificationKind);
        return this;
    }

    public AttachedDatabaseConfigurationImpl withTableLevelSharingProperties(
        TableLevelSharingProperties tableLevelSharingProperties) {
        this.innerModel().withTableLevelSharingProperties(tableLevelSharingProperties);
        return this;
    }
}
