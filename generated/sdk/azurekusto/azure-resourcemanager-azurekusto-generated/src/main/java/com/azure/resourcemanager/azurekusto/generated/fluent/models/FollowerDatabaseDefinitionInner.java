// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurekusto.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.azurekusto.generated.models.DatabaseShareOrigin;
import com.azure.resourcemanager.azurekusto.generated.models.TableLevelSharingProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A class representing follower database request.
 */
@Fluent
public final class FollowerDatabaseDefinitionInner {
    /*
     * Resource id of the cluster that follows a database owned by this cluster.
     */
    @JsonProperty(value = "clusterResourceId", required = true)
    private String clusterResourceId;

    /*
     * Resource name of the attached database configuration in the follower cluster.
     */
    @JsonProperty(value = "attachedDatabaseConfigurationName", required = true)
    private String attachedDatabaseConfigurationName;

    /*
     * The database name owned by this cluster that was followed. * in case following all databases.
     */
    @JsonProperty(value = "databaseName", access = JsonProperty.Access.WRITE_ONLY)
    private String databaseName;

    /*
     * Table level sharing specifications
     */
    @JsonProperty(value = "tableLevelSharingProperties", access = JsonProperty.Access.WRITE_ONLY)
    private TableLevelSharingProperties tableLevelSharingProperties;

    /*
     * The origin of the following setup.
     */
    @JsonProperty(value = "databaseShareOrigin", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseShareOrigin databaseShareOrigin;

    /**
     * Creates an instance of FollowerDatabaseDefinitionInner class.
     */
    public FollowerDatabaseDefinitionInner() {
    }

    /**
     * Get the clusterResourceId property: Resource id of the cluster that follows a database owned by this cluster.
     * 
     * @return the clusterResourceId value.
     */
    public String clusterResourceId() {
        return this.clusterResourceId;
    }

    /**
     * Set the clusterResourceId property: Resource id of the cluster that follows a database owned by this cluster.
     * 
     * @param clusterResourceId the clusterResourceId value to set.
     * @return the FollowerDatabaseDefinitionInner object itself.
     */
    public FollowerDatabaseDefinitionInner withClusterResourceId(String clusterResourceId) {
        this.clusterResourceId = clusterResourceId;
        return this;
    }

    /**
     * Get the attachedDatabaseConfigurationName property: Resource name of the attached database configuration in the
     * follower cluster.
     * 
     * @return the attachedDatabaseConfigurationName value.
     */
    public String attachedDatabaseConfigurationName() {
        return this.attachedDatabaseConfigurationName;
    }

    /**
     * Set the attachedDatabaseConfigurationName property: Resource name of the attached database configuration in the
     * follower cluster.
     * 
     * @param attachedDatabaseConfigurationName the attachedDatabaseConfigurationName value to set.
     * @return the FollowerDatabaseDefinitionInner object itself.
     */
    public FollowerDatabaseDefinitionInner
        withAttachedDatabaseConfigurationName(String attachedDatabaseConfigurationName) {
        this.attachedDatabaseConfigurationName = attachedDatabaseConfigurationName;
        return this;
    }

    /**
     * Get the databaseName property: The database name owned by this cluster that was followed. * in case following
     * all databases.
     * 
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
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
     * Get the databaseShareOrigin property: The origin of the following setup.
     * 
     * @return the databaseShareOrigin value.
     */
    public DatabaseShareOrigin databaseShareOrigin() {
        return this.databaseShareOrigin;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clusterResourceId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property clusterResourceId in model FollowerDatabaseDefinitionInner"));
        }
        if (attachedDatabaseConfigurationName() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property attachedDatabaseConfigurationName in model FollowerDatabaseDefinitionInner"));
        }
        if (tableLevelSharingProperties() != null) {
            tableLevelSharingProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FollowerDatabaseDefinitionInner.class);
}
