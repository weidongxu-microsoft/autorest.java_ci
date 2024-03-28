// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.models.MigrationStatus;
import com.azure.resourcemanager.storage.generated.models.SkuName;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a storage account’s ongoing or enqueued migration.
 */
@Fluent
public final class StorageAccountMigrationProperties {
    /*
     * Target sku name for the account
     */
    @JsonProperty(value = "targetSkuName", required = true)
    private SkuName targetSkuName;

    /*
     * Current status of migration
     */
    @JsonProperty(value = "migrationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationStatus migrationStatus;

    /*
     * Error code for migration failure
     */
    @JsonProperty(value = "migrationFailedReason", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationFailedReason;

    /*
     * Reason for migration failure
     */
    @JsonProperty(value = "migrationFailedDetailedReason", access = JsonProperty.Access.WRITE_ONLY)
    private String migrationFailedDetailedReason;

    /**
     * Creates an instance of StorageAccountMigrationProperties class.
     */
    public StorageAccountMigrationProperties() {
    }

    /**
     * Get the targetSkuName property: Target sku name for the account.
     * 
     * @return the targetSkuName value.
     */
    public SkuName targetSkuName() {
        return this.targetSkuName;
    }

    /**
     * Set the targetSkuName property: Target sku name for the account.
     * 
     * @param targetSkuName the targetSkuName value to set.
     * @return the StorageAccountMigrationProperties object itself.
     */
    public StorageAccountMigrationProperties withTargetSkuName(SkuName targetSkuName) {
        this.targetSkuName = targetSkuName;
        return this;
    }

    /**
     * Get the migrationStatus property: Current status of migration.
     * 
     * @return the migrationStatus value.
     */
    public MigrationStatus migrationStatus() {
        return this.migrationStatus;
    }

    /**
     * Get the migrationFailedReason property: Error code for migration failure.
     * 
     * @return the migrationFailedReason value.
     */
    public String migrationFailedReason() {
        return this.migrationFailedReason;
    }

    /**
     * Get the migrationFailedDetailedReason property: Reason for migration failure.
     * 
     * @return the migrationFailedDetailedReason value.
     */
    public String migrationFailedDetailedReason() {
        return this.migrationFailedDetailedReason;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (targetSkuName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property targetSkuName in model StorageAccountMigrationProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageAccountMigrationProperties.class);
}
