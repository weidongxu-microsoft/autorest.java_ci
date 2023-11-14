// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurekusto.generated.models.DefaultPrincipalsModificationKind;
import com.azure.resourcemanager.azurekusto.generated.models.ProvisioningState;
import com.azure.resourcemanager.azurekusto.generated.models.TableLevelSharingProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Class representing the an attached database configuration properties of kind specific.
 */
@Fluent
public final class AttachedDatabaseConfigurationProperties {
    /*
     * The provisioned state of the resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The name of the database which you would like to attach, use * if you want to follow all current and future
     * databases.
     */
    @JsonProperty(value = "databaseName", required = true)
    private String databaseName;

    /*
     * The resource id of the cluster where the databases you would like to attach reside.
     */
    @JsonProperty(value = "clusterResourceId", required = true)
    private String clusterResourceId;

    /*
     * The list of databases from the clusterResourceId which are currently attached to the cluster.
     */
    @JsonProperty(value = "attachedDatabaseNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> attachedDatabaseNames;

    /*
     * The default principals modification kind
     */
    @JsonProperty(value = "defaultPrincipalsModificationKind", required = true)
    private DefaultPrincipalsModificationKind defaultPrincipalsModificationKind;

    /*
     * Table level sharing specifications
     */
    @JsonProperty(value = "tableLevelSharingProperties")
    private TableLevelSharingProperties tableLevelSharingProperties;

    /*
     * Overrides the original database name. Relevant only when attaching to a specific database.
     */
    @JsonProperty(value = "databaseNameOverride")
    private String databaseNameOverride;

    /*
     * Adds a prefix to the attached databases name. When following an entire cluster, that prefix would be added to
     * all of the databases original names from leader cluster.
     */
    @JsonProperty(value = "databaseNamePrefix")
    private String databaseNamePrefix;

    /**
     * Creates an instance of AttachedDatabaseConfigurationProperties class.
     */
    public AttachedDatabaseConfigurationProperties() {
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the databaseName property: The name of the database which you would like to attach, use * if you want to
     * follow all current and future databases.
     * 
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: The name of the database which you would like to attach, use * if you want to
     * follow all current and future databases.
     * 
     * @param databaseName the databaseName value to set.
     * @return the AttachedDatabaseConfigurationProperties object itself.
     */
    public AttachedDatabaseConfigurationProperties withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the clusterResourceId property: The resource id of the cluster where the databases you would like to attach
     * reside.
     * 
     * @return the clusterResourceId value.
     */
    public String clusterResourceId() {
        return this.clusterResourceId;
    }

    /**
     * Set the clusterResourceId property: The resource id of the cluster where the databases you would like to attach
     * reside.
     * 
     * @param clusterResourceId the clusterResourceId value to set.
     * @return the AttachedDatabaseConfigurationProperties object itself.
     */
    public AttachedDatabaseConfigurationProperties withClusterResourceId(String clusterResourceId) {
        this.clusterResourceId = clusterResourceId;
        return this;
    }

    /**
     * Get the attachedDatabaseNames property: The list of databases from the clusterResourceId which are currently
     * attached to the cluster.
     * 
     * @return the attachedDatabaseNames value.
     */
    public List<String> attachedDatabaseNames() {
        return this.attachedDatabaseNames;
    }

    /**
     * Get the defaultPrincipalsModificationKind property: The default principals modification kind.
     * 
     * @return the defaultPrincipalsModificationKind value.
     */
    public DefaultPrincipalsModificationKind defaultPrincipalsModificationKind() {
        return this.defaultPrincipalsModificationKind;
    }

    /**
     * Set the defaultPrincipalsModificationKind property: The default principals modification kind.
     * 
     * @param defaultPrincipalsModificationKind the defaultPrincipalsModificationKind value to set.
     * @return the AttachedDatabaseConfigurationProperties object itself.
     */
    public AttachedDatabaseConfigurationProperties
        withDefaultPrincipalsModificationKind(DefaultPrincipalsModificationKind defaultPrincipalsModificationKind) {
        this.defaultPrincipalsModificationKind = defaultPrincipalsModificationKind;
        return this;
    }

    /**
     * Get the tableLevelSharingProperties property: Table level sharing specifications.
     * 
     * @return the tableLevelSharingProperties value.
     */
    public TableLevelSharingProperties tableLevelSharingProperties() {
        return this.tableLevelSharingProperties;
    }

    /**
     * Set the tableLevelSharingProperties property: Table level sharing specifications.
     * 
     * @param tableLevelSharingProperties the tableLevelSharingProperties value to set.
     * @return the AttachedDatabaseConfigurationProperties object itself.
     */
    public AttachedDatabaseConfigurationProperties
        withTableLevelSharingProperties(TableLevelSharingProperties tableLevelSharingProperties) {
        this.tableLevelSharingProperties = tableLevelSharingProperties;
        return this;
    }

    /**
     * Get the databaseNameOverride property: Overrides the original database name. Relevant only when attaching to a
     * specific database.
     * 
     * @return the databaseNameOverride value.
     */
    public String databaseNameOverride() {
        return this.databaseNameOverride;
    }

    /**
     * Set the databaseNameOverride property: Overrides the original database name. Relevant only when attaching to a
     * specific database.
     * 
     * @param databaseNameOverride the databaseNameOverride value to set.
     * @return the AttachedDatabaseConfigurationProperties object itself.
     */
    public AttachedDatabaseConfigurationProperties withDatabaseNameOverride(String databaseNameOverride) {
        this.databaseNameOverride = databaseNameOverride;
        return this;
    }

    /**
     * Get the databaseNamePrefix property: Adds a prefix to the attached databases name. When following an entire
     * cluster, that prefix would be added to all of the databases original names from leader cluster.
     * 
     * @return the databaseNamePrefix value.
     */
    public String databaseNamePrefix() {
        return this.databaseNamePrefix;
    }

    /**
     * Set the databaseNamePrefix property: Adds a prefix to the attached databases name. When following an entire
     * cluster, that prefix would be added to all of the databases original names from leader cluster.
     * 
     * @param databaseNamePrefix the databaseNamePrefix value to set.
     * @return the AttachedDatabaseConfigurationProperties object itself.
     */
    public AttachedDatabaseConfigurationProperties withDatabaseNamePrefix(String databaseNamePrefix) {
        this.databaseNamePrefix = databaseNamePrefix;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (databaseName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property databaseName in model AttachedDatabaseConfigurationProperties"));
        }
        if (clusterResourceId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property clusterResourceId in model AttachedDatabaseConfigurationProperties"));
        }
        if (defaultPrincipalsModificationKind() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property defaultPrincipalsModificationKind in model AttachedDatabaseConfigurationProperties"));
        }
        if (tableLevelSharingProperties() != null) {
            tableLevelSharingProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AttachedDatabaseConfigurationProperties.class);
}
