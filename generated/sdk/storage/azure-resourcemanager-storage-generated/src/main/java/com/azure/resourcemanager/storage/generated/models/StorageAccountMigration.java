// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.resourcemanager.storage.generated.fluent.models.StorageAccountMigrationInner;

/**
 * An immutable client-side representation of StorageAccountMigration.
 */
public interface StorageAccountMigration {
    /**
     * Gets the id property: Migration Resource Id.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: current value is 'default' for customer initiated migration.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: SrpAccountMigrationType in ARM contract which is 'accountMigrations'.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the targetSkuName property: Target sku name for the account.
     * 
     * @return the targetSkuName value.
     */
    SkuName targetSkuName();

    /**
     * Gets the migrationStatus property: Current status of migration.
     * 
     * @return the migrationStatus value.
     */
    MigrationStatus migrationStatus();

    /**
     * Gets the migrationFailedReason property: Error code for migration failure.
     * 
     * @return the migrationFailedReason value.
     */
    String migrationFailedReason();

    /**
     * Gets the migrationFailedDetailedReason property: Reason for migration failure.
     * 
     * @return the migrationFailedDetailedReason value.
     */
    String migrationFailedDetailedReason();

    /**
     * Gets the inner com.azure.resourcemanager.storage.generated.fluent.models.StorageAccountMigrationInner object.
     * 
     * @return the inner object.
     */
    StorageAccountMigrationInner innerModel();
}